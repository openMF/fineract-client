# SelfSavingsAccountApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modifySavingsAccountApplication**](SelfSavingsAccountApi.md#modifySavingsAccountApplication) | **PUT** self/savingsaccounts/{accountId} | 
[**retrieveAllSavingsAccountCharges1**](SelfSavingsAccountApi.md#retrieveAllSavingsAccountCharges1) | **GET** self/savingsaccounts/{accountId}/charges | List Savings Charges
[**retrieveSavings**](SelfSavingsAccountApi.md#retrieveSavings) | **GET** self/savingsaccounts/{accountId} | Retrieve a savings account
[**retrieveSavingsAccountCharge1**](SelfSavingsAccountApi.md#retrieveSavingsAccountCharge1) | **GET** self/savingsaccounts/{accountId}/charges/{savingsAccountChargeId} | Retrieve a Savings account Charge
[**retrieveSavingsTransaction**](SelfSavingsAccountApi.md#retrieveSavingsTransaction) | **GET** self/savingsaccounts/{accountId}/transactions/{transactionId} | Retrieve Savings Account Transaction
[**submitSavingsAccountApplication**](SelfSavingsAccountApi.md#submitSavingsAccountApplication) | **POST** self/savingsaccounts | 
[**template18**](SelfSavingsAccountApi.md#template18) | **GET** self/savingsaccounts/template | 



## modifySavingsAccountApplication

> String modifySavingsAccountApplication(accountId, command, body)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfSavingsAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfSavingsAccountApi apiInstance = new SelfSavingsAccountApi(defaultClient);
        Long accountId = 56L; // Long | 
        String command = "command_example"; // String | 
        String body = "body_example"; // String | 
        try {
            String result = apiInstance.modifySavingsAccountApplication(accountId, command, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfSavingsAccountApi#modifySavingsAccountApplication");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**|  |
 **command** | **String**|  | [optional]
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## retrieveAllSavingsAccountCharges1

> List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt; retrieveAllSavingsAccountCharges1(accountId, chargeStatus)

List Savings Charges

Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfSavingsAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfSavingsAccountApi apiInstance = new SelfSavingsAccountApi(defaultClient);
        Long accountId = 56L; // Long | accountId
        String chargeStatus = "\"all\""; // String | chargeStatus
        try {
            List<GetSelfSavingsAccountsAccountIdChargesResponse> result = apiInstance.retrieveAllSavingsAccountCharges1(accountId, chargeStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfSavingsAccountApi#retrieveAllSavingsAccountCharges1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to &quot;all&quot;]

### Return type

[**List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;**](GetSelfSavingsAccountsAccountIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveSavings

> GetSelfSavingsAccountsResponse retrieveSavings(accountId, chargeStatus)

Retrieve a savings account

Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfSavingsAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfSavingsAccountApi apiInstance = new SelfSavingsAccountApi(defaultClient);
        Long accountId = 56L; // Long | accountId
        String chargeStatus = "\"all\""; // String | chargeStatus
        try {
            GetSelfSavingsAccountsResponse result = apiInstance.retrieveSavings(accountId, chargeStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfSavingsAccountApi#retrieveSavings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to &quot;all&quot;]

### Return type

[**GetSelfSavingsAccountsResponse**](GetSelfSavingsAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveSavingsAccountCharge1

> GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse retrieveSavingsAccountCharge1(accountId, savingsAccountChargeId)

Retrieve a Savings account Charge

Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfSavingsAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfSavingsAccountApi apiInstance = new SelfSavingsAccountApi(defaultClient);
        Long accountId = 56L; // Long | accountId
        Long savingsAccountChargeId = 56L; // Long | savingsAccountChargeId
        try {
            GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse result = apiInstance.retrieveSavingsAccountCharge1(accountId, savingsAccountChargeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfSavingsAccountApi#retrieveSavingsAccountCharge1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |

### Return type

[**GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse**](GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveSavingsTransaction

> GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse retrieveSavingsTransaction(accountId, transactionId)

Retrieve Savings Account Transaction

Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfSavingsAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfSavingsAccountApi apiInstance = new SelfSavingsAccountApi(defaultClient);
        Long accountId = 56L; // Long | accountId
        Long transactionId = 56L; // Long | transactionId
        try {
            GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse result = apiInstance.retrieveSavingsTransaction(accountId, transactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfSavingsAccountApi#retrieveSavingsTransaction");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse**](GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## submitSavingsAccountApplication

> String submitSavingsAccountApplication(command, body)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfSavingsAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfSavingsAccountApi apiInstance = new SelfSavingsAccountApi(defaultClient);
        String command = "command_example"; // String | 
        String body = "body_example"; // String | 
        try {
            String result = apiInstance.submitSavingsAccountApplication(command, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfSavingsAccountApi#submitSavingsAccountApplication");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **command** | **String**|  | [optional]
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## template18

> String template18(clientId, productId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfSavingsAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        SelfSavingsAccountApi apiInstance = new SelfSavingsAccountApi(defaultClient);
        Long clientId = 56L; // Long | 
        Long productId = 56L; // Long | 
        try {
            String result = apiInstance.template18(clientId, productId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfSavingsAccountApi#template18");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  | [optional]
 **productId** | **Long**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


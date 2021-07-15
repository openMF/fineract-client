# SavingsChargesApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSavingsAccountCharge**](SavingsChargesApi.md#addSavingsAccountCharge) | **POST** savingsaccounts/{savingsAccountId}/charges | Create a Savings account Charge
[**deleteSavingsAccountCharge**](SavingsChargesApi.md#deleteSavingsAccountCharge) | **DELETE** savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Delete a Savings account Charge
[**payOrWaiveSavingsAccountCharge**](SavingsChargesApi.md#payOrWaiveSavingsAccountCharge) | **POST** savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Pay a Savings account Charge | Waive off a Savings account Charge | Inactivate a Savings account Charge
[**retrieveAllSavingsAccountCharges**](SavingsChargesApi.md#retrieveAllSavingsAccountCharges) | **GET** savingsaccounts/{savingsAccountId}/charges | List Savings Charges
[**retrieveSavingsAccountCharge**](SavingsChargesApi.md#retrieveSavingsAccountCharge) | **GET** savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Retrieve a Savings account Charge
[**retrieveTemplate17**](SavingsChargesApi.md#retrieveTemplate17) | **GET** savingsaccounts/{savingsAccountId}/charges/template | Retrieve Savings Charges Template
[**updateSavingsAccountCharge**](SavingsChargesApi.md#updateSavingsAccountCharge) | **PUT** savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Update a Savings account Charge



## addSavingsAccountCharge

> PostSavingsAccountsSavingsAccountIdChargesResponse addSavingsAccountCharge(savingsAccountId, postSavingsAccountsSavingsAccountIdChargesRequest)

Create a Savings account Charge

Creates a Savings account Charge  Mandatory Fields for Savings account Charges: chargeId, amount  chargeId, amount, dueDate, dateFormat, locale  chargeId, amount, feeOnMonthDay, monthDayFormat, locale

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SavingsChargesApi;

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

        SavingsChargesApi apiInstance = new SavingsChargesApi(defaultClient);
        Long savingsAccountId = 56L; // Long | savingsAccountId
        PostSavingsAccountsSavingsAccountIdChargesRequest postSavingsAccountsSavingsAccountIdChargesRequest = new PostSavingsAccountsSavingsAccountIdChargesRequest(); // PostSavingsAccountsSavingsAccountIdChargesRequest | 
        try {
            PostSavingsAccountsSavingsAccountIdChargesResponse result = apiInstance.addSavingsAccountCharge(savingsAccountId, postSavingsAccountsSavingsAccountIdChargesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SavingsChargesApi#addSavingsAccountCharge");
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
 **savingsAccountId** | **Long**| savingsAccountId |
 **postSavingsAccountsSavingsAccountIdChargesRequest** | [**PostSavingsAccountsSavingsAccountIdChargesRequest**](PostSavingsAccountsSavingsAccountIdChargesRequest.md)|  |

### Return type

[**PostSavingsAccountsSavingsAccountIdChargesResponse**](PostSavingsAccountsSavingsAccountIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteSavingsAccountCharge

> DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse deleteSavingsAccountCharge(savingsAccountId, savingsAccountChargeId)

Delete a Savings account Charge

Note: Currently, A Savings account Charge may only be removed from Savings that are not yet approved.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SavingsChargesApi;

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

        SavingsChargesApi apiInstance = new SavingsChargesApi(defaultClient);
        Long savingsAccountId = 56L; // Long | savingsAccountId
        Long savingsAccountChargeId = 56L; // Long | savingsAccountChargeId
        try {
            DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse result = apiInstance.deleteSavingsAccountCharge(savingsAccountId, savingsAccountChargeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SavingsChargesApi#deleteSavingsAccountCharge");
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
 **savingsAccountId** | **Long**| savingsAccountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |

### Return type

[**DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## payOrWaiveSavingsAccountCharge

> PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse payOrWaiveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId, postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest, command)

Pay a Savings account Charge | Waive off a Savings account Charge | Inactivate a Savings account Charge

Pay a Savings account Charge:  An active charge will be paid when savings account is active and having sufficient balance.  Waive off a Savings account Charge:  Outstanding charge amount will be waived off.  Inactivate a Savings account Charge:  A charge will be allowed to inactivate when savings account is active and not having any dues as of today. If charge is overpaid, corresponding charge payment transactions will be reversed.  Showing request/response for &#39;Pay a Savings account Charge&#39;

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SavingsChargesApi;

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

        SavingsChargesApi apiInstance = new SavingsChargesApi(defaultClient);
        Long savingsAccountId = 56L; // Long | savingsAccountId
        Long savingsAccountChargeId = 56L; // Long | savingsAccountChargeId
        PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest = new PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest(); // PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest | 
        String command = "command_example"; // String | command
        try {
            PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse result = apiInstance.payOrWaiveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId, postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SavingsChargesApi#payOrWaiveSavingsAccountCharge");
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
 **savingsAccountId** | **Long**| savingsAccountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |
 **postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest** | [**PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest**](PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest.md)|  |
 **command** | **String**| command | [optional]

### Return type

[**PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllSavingsAccountCharges

> List&lt;GetSavingsAccountsSavingsAccountIdChargesResponse&gt; retrieveAllSavingsAccountCharges(savingsAccountId, chargeStatus)

List Savings Charges

Lists Savings Charges  Example Requests:  savingsaccounts/1/charges  savingsaccounts/1/charges?chargeStatus&#x3D;all  savingsaccounts/1/charges?chargeStatus&#x3D;inactive  savingsaccounts/1/charges?chargeStatus&#x3D;active  savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SavingsChargesApi;

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

        SavingsChargesApi apiInstance = new SavingsChargesApi(defaultClient);
        Long savingsAccountId = 56L; // Long | savingsAccountId
        String chargeStatus = "\"all\""; // String | chargeStatus
        try {
            List<GetSavingsAccountsSavingsAccountIdChargesResponse> result = apiInstance.retrieveAllSavingsAccountCharges(savingsAccountId, chargeStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SavingsChargesApi#retrieveAllSavingsAccountCharges");
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
 **savingsAccountId** | **Long**| savingsAccountId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to &quot;all&quot;]

### Return type

[**List&lt;GetSavingsAccountsSavingsAccountIdChargesResponse&gt;**](GetSavingsAccountsSavingsAccountIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveSavingsAccountCharge

> GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse retrieveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId)

Retrieve a Savings account Charge

Retrieves a Savings account Charge  Example Requests:  /savingsaccounts/1/charges/5   /savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SavingsChargesApi;

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

        SavingsChargesApi apiInstance = new SavingsChargesApi(defaultClient);
        Long savingsAccountId = 56L; // Long | savingsAccountId
        Long savingsAccountChargeId = 56L; // Long | savingsAccountChargeId
        try {
            GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse result = apiInstance.retrieveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SavingsChargesApi#retrieveSavingsAccountCharge");
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
 **savingsAccountId** | **Long**| savingsAccountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |

### Return type

[**GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTemplate17

> GetSavingsAccountsSavingsAccountIdChargesTemplateResponse retrieveTemplate17(savingsAccountId)

Retrieve Savings Charges Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  savingsaccounts/1/charges/template

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SavingsChargesApi;

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

        SavingsChargesApi apiInstance = new SavingsChargesApi(defaultClient);
        Long savingsAccountId = 56L; // Long | savingsAccountId
        try {
            GetSavingsAccountsSavingsAccountIdChargesTemplateResponse result = apiInstance.retrieveTemplate17(savingsAccountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SavingsChargesApi#retrieveTemplate17");
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
 **savingsAccountId** | **Long**| savingsAccountId |

### Return type

[**GetSavingsAccountsSavingsAccountIdChargesTemplateResponse**](GetSavingsAccountsSavingsAccountIdChargesTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateSavingsAccountCharge

> PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse updateSavingsAccountCharge(savingsAccountId, savingsAccountChargeId, putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest)

Update a Savings account Charge

Currently Savings account Charges may be updated only if the Savings account is not yet approved.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SavingsChargesApi;

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

        SavingsChargesApi apiInstance = new SavingsChargesApi(defaultClient);
        Long savingsAccountId = 56L; // Long | savingsAccountId
        Long savingsAccountChargeId = 56L; // Long | savingsAccountChargeId
        PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest = new PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest(); // PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest | 
        try {
            PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse result = apiInstance.updateSavingsAccountCharge(savingsAccountId, savingsAccountChargeId, putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SavingsChargesApi#updateSavingsAccountCharge");
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
 **savingsAccountId** | **Long**| savingsAccountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |
 **putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest** | [**PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest**](PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest.md)|  |

### Return type

[**PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


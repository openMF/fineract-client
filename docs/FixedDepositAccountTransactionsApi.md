# FixedDepositAccountTransactionsApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjustTransaction**](FixedDepositAccountTransactionsApi.md#adjustTransaction) | **POST** fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId} | 
[**retrieveOne17**](FixedDepositAccountTransactionsApi.md#retrieveOne17) | **GET** fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId} | 
[**retrieveTemplate13**](FixedDepositAccountTransactionsApi.md#retrieveTemplate13) | **GET** fixeddepositaccounts/{fixedDepositAccountId}/transactions/template | 
[**transaction**](FixedDepositAccountTransactionsApi.md#transaction) | **POST** fixeddepositaccounts/{fixedDepositAccountId}/transactions | 



## adjustTransaction

> String adjustTransaction(fixedDepositAccountId, transactionId, command, body)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.FixedDepositAccountTransactionsApi;

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

        FixedDepositAccountTransactionsApi apiInstance = new FixedDepositAccountTransactionsApi(defaultClient);
        Long fixedDepositAccountId = 56L; // Long | 
        Long transactionId = 56L; // Long | 
        String command = "command_example"; // String | 
        String body = "body_example"; // String | 
        try {
            String result = apiInstance.adjustTransaction(fixedDepositAccountId, transactionId, command, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FixedDepositAccountTransactionsApi#adjustTransaction");
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
 **fixedDepositAccountId** | **Long**|  |
 **transactionId** | **Long**|  |
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


## retrieveOne17

> String retrieveOne17(fixedDepositAccountId, transactionId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.FixedDepositAccountTransactionsApi;

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

        FixedDepositAccountTransactionsApi apiInstance = new FixedDepositAccountTransactionsApi(defaultClient);
        Long fixedDepositAccountId = 56L; // Long | 
        Long transactionId = 56L; // Long | 
        try {
            String result = apiInstance.retrieveOne17(fixedDepositAccountId, transactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FixedDepositAccountTransactionsApi#retrieveOne17");
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
 **fixedDepositAccountId** | **Long**|  |
 **transactionId** | **Long**|  |

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


## retrieveTemplate13

> String retrieveTemplate13(fixedDepositAccountId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.FixedDepositAccountTransactionsApi;

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

        FixedDepositAccountTransactionsApi apiInstance = new FixedDepositAccountTransactionsApi(defaultClient);
        Long fixedDepositAccountId = 56L; // Long | 
        try {
            String result = apiInstance.retrieveTemplate13(fixedDepositAccountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FixedDepositAccountTransactionsApi#retrieveTemplate13");
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
 **fixedDepositAccountId** | **Long**|  |

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


## transaction

> String transaction(fixedDepositAccountId, command, body)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.FixedDepositAccountTransactionsApi;

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

        FixedDepositAccountTransactionsApi apiInstance = new FixedDepositAccountTransactionsApi(defaultClient);
        Long fixedDepositAccountId = 56L; // Long | 
        String command = "command_example"; // String | 
        String body = "body_example"; // String | 
        try {
            String result = apiInstance.transaction(fixedDepositAccountId, command, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FixedDepositAccountTransactionsApi#transaction");
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
 **fixedDepositAccountId** | **Long**|  |
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


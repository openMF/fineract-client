# RecurringDepositAccountTransactionsApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handleTransactionCommands**](RecurringDepositAccountTransactionsApi.md#handleTransactionCommands) | **POST** recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId} | Adjust Transaction | Undo transaction
[**retrieveOne20**](RecurringDepositAccountTransactionsApi.md#retrieveOne20) | **GET** recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId} | Retrieve Recurring Deposit Account Transaction
[**retrieveTemplate15**](RecurringDepositAccountTransactionsApi.md#retrieveTemplate15) | **GET** recurringdepositaccounts/{recurringDepositAccountId}/transactions/template | Retrieve Recurring Deposit Account Transaction Template
[**transaction1**](RecurringDepositAccountTransactionsApi.md#transaction1) | **POST** recurringdepositaccounts/{recurringDepositAccountId}/transactions | Deposit Transaction | Withdrawal Transaction



## handleTransactionCommands

> PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse handleTransactionCommands(recurringDepositAccountId, transactionId, postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest, command)

Adjust Transaction | Undo transaction

Adjust Transaction:  This command modifies the given transaction.  Undo transaction:  This command reverses the given transaction.  Showing request/response for &#39;Adjust Transaction&#39;

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.RecurringDepositAccountTransactionsApi;

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

        RecurringDepositAccountTransactionsApi apiInstance = new RecurringDepositAccountTransactionsApi(defaultClient);
        Long recurringDepositAccountId = 56L; // Long | recurringDepositAccountId
        Long transactionId = 56L; // Long | transactionId
        PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest = new PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest(); // PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest | 
        String command = "command_example"; // String | command
        try {
            PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse result = apiInstance.handleTransactionCommands(recurringDepositAccountId, transactionId, postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringDepositAccountTransactionsApi#handleTransactionCommands");
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
 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **transactionId** | **Long**| transactionId |
 **postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest** | [**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest.md)|  |
 **command** | **String**| command | [optional]

### Return type

[**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveOne20

> GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse retrieveOne20(recurringDepositAccountId, transactionId)

Retrieve Recurring Deposit Account Transaction

Retrieves Recurring Deposit Account Transaction  Example Requests:  recurringdepositaccounts/1/transactions/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.RecurringDepositAccountTransactionsApi;

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

        RecurringDepositAccountTransactionsApi apiInstance = new RecurringDepositAccountTransactionsApi(defaultClient);
        Long recurringDepositAccountId = 56L; // Long | recurringDepositAccountId
        Long transactionId = 56L; // Long | transactionId
        try {
            GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse result = apiInstance.retrieveOne20(recurringDepositAccountId, transactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringDepositAccountTransactionsApi#retrieveOne20");
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
 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse**](GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTemplate15

> GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse retrieveTemplate15(recurringDepositAccountId, command)

Retrieve Recurring Deposit Account Transaction Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  recurringdepositaccounts/1/transactions/template?command&#x3D;deposit  recurringdepositaccounts/1/transactions/template?command&#x3D;withdrawal

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.RecurringDepositAccountTransactionsApi;

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

        RecurringDepositAccountTransactionsApi apiInstance = new RecurringDepositAccountTransactionsApi(defaultClient);
        Long recurringDepositAccountId = 56L; // Long | recurringDepositAccountId
        String command = "command_example"; // String | command
        try {
            GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse result = apiInstance.retrieveTemplate15(recurringDepositAccountId, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringDepositAccountTransactionsApi#retrieveTemplate15");
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
 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **command** | **String**| command | [optional]

### Return type

[**GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse**](GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## transaction1

> PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse transaction1(recurringDepositAccountId, postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest, command)

Deposit Transaction | Withdrawal Transaction

Deposit Transaction:  Used for a deposit transaction  Withdrawal Transaction:  Used for a Withdrawal Transaction  Showing request/response for Deposit Transaction

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.RecurringDepositAccountTransactionsApi;

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

        RecurringDepositAccountTransactionsApi apiInstance = new RecurringDepositAccountTransactionsApi(defaultClient);
        Long recurringDepositAccountId = 56L; // Long | recurringDepositAccountId
        PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest = new PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest(); // PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest | 
        String command = "command_example"; // String | command
        try {
            PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse result = apiInstance.transaction1(recurringDepositAccountId, postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringDepositAccountTransactionsApi#transaction1");
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
 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest** | [**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest.md)|  |
 **command** | **String**| command | [optional]

### Return type

[**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


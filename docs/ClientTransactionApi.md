# ClientTransactionApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAllClientTransactions**](ClientTransactionApi.md#retrieveAllClientTransactions) | **GET** clients/{clientId}/transactions | List Client Transactions
[**retrieveClientTransaction**](ClientTransactionApi.md#retrieveClientTransaction) | **GET** clients/{clientId}/transactions/{transactionId} | Retrieve a Client Transaction
[**undoClientTransaction**](ClientTransactionApi.md#undoClientTransaction) | **POST** clients/{clientId}/transactions/{transactionId} | Undo a Client Transaction



## retrieveAllClientTransactions

> GetClientsClientIdTransactionsResponse retrieveAllClientTransactions(clientId, offset, limit)

List Client Transactions

The list capability of client transaction can support pagination.  Example Requests:  clients/189/transactions  clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientTransactionApi;

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

        ClientTransactionApi apiInstance = new ClientTransactionApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        Integer offset = 56; // Integer | offset
        Integer limit = 56; // Integer | limit
        try {
            GetClientsClientIdTransactionsResponse result = apiInstance.retrieveAllClientTransactions(clientId, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientTransactionApi#retrieveAllClientTransactions");
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
 **clientId** | **Long**| clientId |
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**GetClientsClientIdTransactionsResponse**](GetClientsClientIdTransactionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveClientTransaction

> GetClientsClientIdTransactionsTransactionIdResponse retrieveClientTransaction(clientId, transactionId)

Retrieve a Client Transaction

Example Requests: clients/1/transactions/1   clients/1/transactions/1?fields&#x3D;id,officeName

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientTransactionApi;

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

        ClientTransactionApi apiInstance = new ClientTransactionApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        Long transactionId = 56L; // Long | transactionId
        try {
            GetClientsClientIdTransactionsTransactionIdResponse result = apiInstance.retrieveClientTransaction(clientId, transactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientTransactionApi#retrieveClientTransaction");
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
 **clientId** | **Long**| clientId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetClientsClientIdTransactionsTransactionIdResponse**](GetClientsClientIdTransactionsTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## undoClientTransaction

> PostClientsClientIdTransactionsTransactionIdResponse undoClientTransaction(clientId, transactionId, command)

Undo a Client Transaction

Undoes a Client Transaction

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ClientTransactionApi;

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

        ClientTransactionApi apiInstance = new ClientTransactionApi(defaultClient);
        Long clientId = 56L; // Long | clientId
        Long transactionId = 56L; // Long | transactionId
        String command = "command_example"; // String | command
        try {
            PostClientsClientIdTransactionsTransactionIdResponse result = apiInstance.undoClientTransaction(clientId, transactionId, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientTransactionApi#undoClientTransaction");
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
 **clientId** | **Long**| clientId |
 **transactionId** | **Long**| transactionId |
 **command** | **String**| command | [optional]

### Return type

[**PostClientsClientIdTransactionsTransactionIdResponse**](PostClientsClientIdTransactionsTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


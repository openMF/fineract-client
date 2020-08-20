# ClientTransactionApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAllClientTransactions**](ClientTransactionApi.md#retrieveAllClientTransactions) | **GET** clients/{clientId}/transactions | List Client Transactions
[**retrieveClientTransaction**](ClientTransactionApi.md#retrieveClientTransaction) | **GET** clients/{clientId}/transactions/{transactionId} | Retrieve a Client Transaction
[**undoClientTransaction**](ClientTransactionApi.md#undoClientTransaction) | **POST** clients/{clientId}/transactions/{transactionId} | Undo a Client Transaction


<a name="retrieveAllClientTransactions"></a>
# **retrieveAllClientTransactions**
> GetClientsClientIdTransactionsResponse retrieveAllClientTransactions(clientId, offset, limit)

List Client Transactions

The list capability of client transaction can support pagination.  Example Requests:  clients/189/transactions  clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientTransactionApi;


ClientTransactionApi apiInstance = new ClientTransactionApi();
Long clientId = 789L; // Long | clientId
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
try {
    GetClientsClientIdTransactionsResponse result = apiInstance.retrieveAllClientTransactions(clientId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientTransactionApi#retrieveAllClientTransactions");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveClientTransaction"></a>
# **retrieveClientTransaction**
> GetClientsClientIdTransactionsTransactionIdResponse retrieveClientTransaction(clientId, transactionId)

Retrieve a Client Transaction

Example Requests: clients/1/transactions/1   clients/1/transactions/1?fields&#x3D;id,officeName

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientTransactionApi;


ClientTransactionApi apiInstance = new ClientTransactionApi();
Long clientId = 789L; // Long | clientId
Long transactionId = 789L; // Long | transactionId
try {
    GetClientsClientIdTransactionsTransactionIdResponse result = apiInstance.retrieveClientTransaction(clientId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientTransactionApi#retrieveClientTransaction");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="undoClientTransaction"></a>
# **undoClientTransaction**
> PostClientsClientIdTransactionsTransactionIdResponse undoClientTransaction(clientId, transactionId, command)

Undo a Client Transaction

Undoes a Client Transaction

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientTransactionApi;


ClientTransactionApi apiInstance = new ClientTransactionApi();
Long clientId = 789L; // Long | clientId
Long transactionId = 789L; // Long | transactionId
String command = "command_example"; // String | command
try {
    PostClientsClientIdTransactionsTransactionIdResponse result = apiInstance.undoClientTransaction(clientId, transactionId, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientTransactionApi#undoClientTransaction");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


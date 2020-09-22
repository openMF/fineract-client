# ClientTransactionApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

ClientTransactionApi apiService = defaultClient.createService(ClientTransactionApi.class);

// Initialize these parameters earlier.
Call<GetClientsClientIdTransactionsResponse> call = apiService.retrieveAllClientTransactions(clientId, offset, limit);
call.enqueue(new Callback<GetClientsClientIdTransactionsResponse>() {
    @Override
    public void onResponse(Call<GetClientsClientIdTransactionsResponse> call, Response<GetClientsClientIdTransactionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetClientsClientIdTransactionsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

ClientTransactionApi apiService = defaultClient.createService(ClientTransactionApi.class);

// Initialize these parameters earlier.
Call<GetClientsClientIdTransactionsTransactionIdResponse> call = apiService.retrieveClientTransaction(clientId, transactionId);
call.enqueue(new Callback<GetClientsClientIdTransactionsTransactionIdResponse>() {
    @Override
    public void onResponse(Call<GetClientsClientIdTransactionsTransactionIdResponse> call, Response<GetClientsClientIdTransactionsTransactionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetClientsClientIdTransactionsTransactionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

ClientTransactionApi apiService = defaultClient.createService(ClientTransactionApi.class);

// Initialize these parameters earlier.
Call<PostClientsClientIdTransactionsTransactionIdResponse> call = apiService.undoClientTransaction(clientId, transactionId, command);
call.enqueue(new Callback<PostClientsClientIdTransactionsTransactionIdResponse>() {
    @Override
    public void onResponse(Call<PostClientsClientIdTransactionsTransactionIdResponse> call, Response<PostClientsClientIdTransactionsTransactionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostClientsClientIdTransactionsTransactionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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


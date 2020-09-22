# SelfClientApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewClientImage**](SelfClientApi.md#addNewClientImage) | **POST** self/clients/{clientId}/images | 
[**deleteClientImage**](SelfClientApi.md#deleteClientImage) | **DELETE** self/clients/{clientId}/images | 
[**retrieveAll**](SelfClientApi.md#retrieveAll) | **GET** self/clients | List Clients associated to the user
[**retrieveAllClientCharges**](SelfClientApi.md#retrieveAllClientCharges) | **GET** self/clients/{clientId}/charges | List Client Charges
[**retrieveAllClientTransactions**](SelfClientApi.md#retrieveAllClientTransactions) | **GET** self/clients/{clientId}/transactions | List Client Transactions
[**retrieveAssociatedAccounts**](SelfClientApi.md#retrieveAssociatedAccounts) | **GET** self/clients/{clientId}/accounts | Retrieve client accounts overview
[**retrieveClientCharge**](SelfClientApi.md#retrieveClientCharge) | **GET** self/clients/{clientId}/charges/{chargeId} | Retrieve a Client Charge
[**retrieveClientTransaction**](SelfClientApi.md#retrieveClientTransaction) | **GET** self/clients/{clientId}/transactions/{transactionId} | Retrieve a Client Transaction
[**retrieveImage**](SelfClientApi.md#retrieveImage) | **GET** self/clients/{clientId}/images | Retrieve Client Image
[**retrieveObligeeDetails**](SelfClientApi.md#retrieveObligeeDetails) | **GET** self/clients/{clientId}/obligeedetails | 
[**retrieveOne**](SelfClientApi.md#retrieveOne) | **GET** self/clients/{clientId} | Retrieve a Client


<a name="addNewClientImage"></a>
# **addNewClientImage**
> String addNewClientImage(clientId, contentLength, file)



### Example
```java

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.addNewClientImage(clientId, contentLength, file);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **clientId** | **Long**|  |
 **contentLength** | **Long**|  | [optional]
 **file** | **File**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="deleteClientImage"></a>
# **deleteClientImage**
> String deleteClientImage(clientId)



### Example
```java

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.deleteClientImage(clientId);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **clientId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> GetSelfClientsResponse retrieveAll(displayName, firstName, lastName, offset, limit, orderBy, sortOrder)

List Clients associated to the user

The list capability of clients can support pagination and sorting.  Example Requests:  self/clients  self/clients?fields&#x3D;displayName,officeName  self/clients?offset&#x3D;10&amp;limit&#x3D;50  self/clients?orderBy&#x3D;displayName&amp;sortOrder&#x3D;DESC

### Example
```java

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<GetSelfClientsResponse> call = apiService.retrieveAll(displayName, firstName, lastName, offset, limit, orderBy, sortOrder);
call.enqueue(new Callback<GetSelfClientsResponse>() {
    @Override
    public void onResponse(Call<GetSelfClientsResponse> call, Response<GetSelfClientsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfClientsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **displayName** | **String**| displayName | [optional]
 **firstName** | **String**| firstName | [optional]
 **lastName** | **String**| lastName | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**GetSelfClientsResponse**](GetSelfClientsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllClientCharges"></a>
# **retrieveAllClientCharges**
> GetSelfClientsClientIdChargesResponse retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset)

List Client Charges

The list capability of client charges supports pagination.  Example Requests:  self/clients/1/charges  self/clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5

### Example
```java

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<GetSelfClientsClientIdChargesResponse> call = apiService.retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset);
call.enqueue(new Callback<GetSelfClientsClientIdChargesResponse>() {
    @Override
    public void onResponse(Call<GetSelfClientsClientIdChargesResponse> call, Response<GetSelfClientsClientIdChargesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfClientsClientIdChargesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **clientId** | **Long**| clientId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]
 **pendingPayment** | **Boolean**| pendingPayment | [optional]
 **limit** | **Integer**| limit | [optional]
 **offset** | **Integer**| offset | [optional]

### Return type

[**GetSelfClientsClientIdChargesResponse**](GetSelfClientsClientIdChargesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllClientTransactions"></a>
# **retrieveAllClientTransactions**
> GetSelfClientsClientIdTransactionsResponse retrieveAllClientTransactions(clientId, offset, limit)

List Client Transactions

The list capability of client transaction can support pagination.  Example Requests:  self/clients/189/transactions  self/clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50

### Example
```java

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<GetSelfClientsClientIdTransactionsResponse> call = apiService.retrieveAllClientTransactions(clientId, offset, limit);
call.enqueue(new Callback<GetSelfClientsClientIdTransactionsResponse>() {
    @Override
    public void onResponse(Call<GetSelfClientsClientIdTransactionsResponse> call, Response<GetSelfClientsClientIdTransactionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfClientsClientIdTransactionsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **clientId** | **Long**| clientId |
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**GetSelfClientsClientIdTransactionsResponse**](GetSelfClientsClientIdTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAssociatedAccounts"></a>
# **retrieveAssociatedAccounts**
> GetSelfClientsClientIdAccountsResponse retrieveAssociatedAccounts(clientId)

Retrieve client accounts overview

An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:  self/clients/1/accounts   self/clients/1/accounts?fields&#x3D;loanAccounts,savingsAccounts

### Example
```java

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<GetSelfClientsClientIdAccountsResponse> call = apiService.retrieveAssociatedAccounts(clientId);
call.enqueue(new Callback<GetSelfClientsClientIdAccountsResponse>() {
    @Override
    public void onResponse(Call<GetSelfClientsClientIdAccountsResponse> call, Response<GetSelfClientsClientIdAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfClientsClientIdAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **clientId** | **Long**| clientId |

### Return type

[**GetSelfClientsClientIdAccountsResponse**](GetSelfClientsClientIdAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveClientCharge"></a>
# **retrieveClientCharge**
> GetSelfClientsClientIdChargesChargeIdResponse retrieveClientCharge(clientId, chargeId)

Retrieve a Client Charge

Retrieves a Client Charge  Example Requests:  self/clients/1/charges/1   self/clients/1/charges/1?fields&#x3D;name,id

### Example
```java

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<GetSelfClientsClientIdChargesChargeIdResponse> call = apiService.retrieveClientCharge(clientId, chargeId);
call.enqueue(new Callback<GetSelfClientsClientIdChargesChargeIdResponse>() {
    @Override
    public void onResponse(Call<GetSelfClientsClientIdChargesChargeIdResponse> call, Response<GetSelfClientsClientIdChargesChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfClientsClientIdChargesChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **clientId** | **Long**| clientId |
 **chargeId** | **Long**| chargeId |

### Return type

[**GetSelfClientsClientIdChargesChargeIdResponse**](GetSelfClientsClientIdChargesChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveClientTransaction"></a>
# **retrieveClientTransaction**
> GetSelfClientsClientIdTransactionsTransactionIdResponse retrieveClientTransaction(clientId, transactionId)

Retrieve a Client Transaction

Retrieves a Client TransactionExample Requests:  self/clients/1/transactions/1   self/clients/1/transactions/1?fields&#x3D;id,officeName

### Example
```java

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<GetSelfClientsClientIdTransactionsTransactionIdResponse> call = apiService.retrieveClientTransaction(clientId, transactionId);
call.enqueue(new Callback<GetSelfClientsClientIdTransactionsTransactionIdResponse>() {
    @Override
    public void onResponse(Call<GetSelfClientsClientIdTransactionsTransactionIdResponse> call, Response<GetSelfClientsClientIdTransactionsTransactionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfClientsClientIdTransactionsTransactionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **clientId** | **Long**| clientId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetSelfClientsClientIdTransactionsTransactionIdResponse**](GetSelfClientsClientIdTransactionsTransactionIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveImage"></a>
# **retrieveImage**
> retrieveImage(clientId, maxWidth, maxHeight, output)

Retrieve Client Image

Optional arguments are identical to those of Get Image associated with an Entity (Binary file)  Example Requests:  self/clients/1/images

### Example
```java

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.retrieveImage(clientId, maxWidth, maxHeight, output);
call.enqueue(new Callback<>() {
    @Override
    public void onResponse(Call<> call, Response<> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **clientId** | **Long**| clientId |
 **maxWidth** | **Integer**|  | [optional]
 **maxHeight** | **Integer**|  | [optional]
 **output** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain, text/htmlapplication/json, 
 - **Accept**: text/plain

<a name="retrieveObligeeDetails"></a>
# **retrieveObligeeDetails**
> String retrieveObligeeDetails(clientId)



### Example
```java

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveObligeeDetails(clientId);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **clientId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetSelfClientsClientIdResponse retrieveOne(clientId)

Retrieve a Client

Retrieves a Client  Example Requests:  self/clients/1  self/clients/1?fields&#x3D;id,displayName,officeName

### Example
```java

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<GetSelfClientsClientIdResponse> call = apiService.retrieveOne(clientId);
call.enqueue(new Callback<GetSelfClientsClientIdResponse>() {
    @Override
    public void onResponse(Call<GetSelfClientsClientIdResponse> call, Response<GetSelfClientsClientIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfClientsClientIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **clientId** | **Long**| clientId |

### Return type

[**GetSelfClientsClientIdResponse**](GetSelfClientsClientIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# InteroperationApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQuote**](InteroperationApi.md#createQuote) | **POST** interoperation/quotes | Calculate Interoperation Quote
[**createTransactionRequest**](InteroperationApi.md#createTransactionRequest) | **POST** interoperation/requests | Allow Interoperation Transaction Request
[**deleteAccountIdentifier**](InteroperationApi.md#deleteAccountIdentifier) | **DELETE** interoperation/parties/{idType}/{idValue} | Allow Interoperation Identifier registration
[**deleteAccountIdentifier_0**](InteroperationApi.md#deleteAccountIdentifier_0) | **DELETE** interoperation/parties/{idType}/{idValue}/{subIdOrType} | Allow Interoperation Identifier registration
[**getAccountByIdentifier**](InteroperationApi.md#getAccountByIdentifier) | **GET** interoperation/parties/{idType}/{idValue} | Query Interoperation Account by secondary identifier
[**getAccountByIdentifier_0**](InteroperationApi.md#getAccountByIdentifier_0) | **GET** interoperation/parties/{idType}/{idValue}/{subIdOrType} | Query Interoperation Account by secondary identifier
[**getAccountDetails**](InteroperationApi.md#getAccountDetails) | **GET** interoperation/accounts/{accountId} | Query Interoperation Account details
[**getAccountIdentifiers**](InteroperationApi.md#getAccountIdentifiers) | **GET** interoperation/accounts/{accountId}/identifiers | Query Interoperation secondary identifiers by Account Id
[**getAccountTransactions**](InteroperationApi.md#getAccountTransactions) | **GET** interoperation/accounts/{accountId}/transactions | Query transactions by Account Id
[**getQuote**](InteroperationApi.md#getQuote) | **GET** interoperation/transactions/{transactionCode}/quotes/{quoteCode} | Query Interoperation Quote
[**getTransactionRequest**](InteroperationApi.md#getTransactionRequest) | **GET** interoperation/transactions/{transactionCode}/requests/{requestCode} | Query Interoperation Transaction Request
[**getTransfer**](InteroperationApi.md#getTransfer) | **GET** interoperation/transactions/{transactionCode}/transfers/{transferCode} | Query Interoperation Transfer
[**health**](InteroperationApi.md#health) | **GET** interoperation/health | Query Interoperation Health Request
[**performTransfer**](InteroperationApi.md#performTransfer) | **POST** interoperation/transfers | Prepare Interoperation Transfer
[**registerAccountIdentifier**](InteroperationApi.md#registerAccountIdentifier) | **POST** interoperation/parties/{idType}/{idValue} | Interoperation Identifier registration
[**registerAccountIdentifier_0**](InteroperationApi.md#registerAccountIdentifier_0) | **POST** interoperation/parties/{idType}/{idValue}/{subIdOrType} | Interoperation Identifier registration


<a name="createQuote"></a>
# **createQuote**
> InteropQuoteResponseData createQuote(body)

Calculate Interoperation Quote



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropQuoteResponseData> call = apiService.createQuote(body);
call.enqueue(new Callback<InteropQuoteResponseData>() {
    @Override
    public void onResponse(Call<InteropQuoteResponseData> call, Response<InteropQuoteResponseData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropQuoteResponseData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**InteropQuoteRequestData**](InteropQuoteRequestData.md)| body |

### Return type

[**InteropQuoteResponseData**](InteropQuoteResponseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTransactionRequest"></a>
# **createTransactionRequest**
> InteropTransactionRequestResponseData createTransactionRequest(body)

Allow Interoperation Transaction Request



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropTransactionRequestResponseData> call = apiService.createTransactionRequest(body);
call.enqueue(new Callback<InteropTransactionRequestResponseData>() {
    @Override
    public void onResponse(Call<InteropTransactionRequestResponseData> call, Response<InteropTransactionRequestResponseData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropTransactionRequestResponseData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**InteropTransactionRequestData**](InteropTransactionRequestData.md)| body |

### Return type

[**InteropTransactionRequestResponseData**](InteropTransactionRequestResponseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountIdentifier"></a>
# **deleteAccountIdentifier**
> InteropIdentifierAccountResponseData deleteAccountIdentifier(idType, idValue, body)

Allow Interoperation Identifier registration



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropIdentifierAccountResponseData> call = apiService.deleteAccountIdentifier(idType, idValue, body);
call.enqueue(new Callback<InteropIdentifierAccountResponseData>() {
    @Override
    public void onResponse(Call<InteropIdentifierAccountResponseData> call, Response<InteropIdentifierAccountResponseData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropIdentifierAccountResponseData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS, ]
 **idValue** | **String**| idValue |
 **body** | [**InteropIdentifierRequestData**](InteropIdentifierRequestData.md)| body |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountIdentifier_0"></a>
# **deleteAccountIdentifier_0**
> InteropIdentifierAccountResponseData deleteAccountIdentifier_0(idType, idValue, subIdOrType, body)

Allow Interoperation Identifier registration



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropIdentifierAccountResponseData> call = apiService.deleteAccountIdentifier_0(idType, idValue, subIdOrType, body);
call.enqueue(new Callback<InteropIdentifierAccountResponseData>() {
    @Override
    public void onResponse(Call<InteropIdentifierAccountResponseData> call, Response<InteropIdentifierAccountResponseData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropIdentifierAccountResponseData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS, ]
 **idValue** | **String**| idValue |
 **subIdOrType** | **String**| subIdOrType |
 **body** | [**InteropIdentifierRequestData**](InteropIdentifierRequestData.md)| body |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountByIdentifier"></a>
# **getAccountByIdentifier**
> InteropIdentifierAccountResponseData getAccountByIdentifier(idType, idValue)

Query Interoperation Account by secondary identifier



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropIdentifierAccountResponseData> call = apiService.getAccountByIdentifier(idType, idValue);
call.enqueue(new Callback<InteropIdentifierAccountResponseData>() {
    @Override
    public void onResponse(Call<InteropIdentifierAccountResponseData> call, Response<InteropIdentifierAccountResponseData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropIdentifierAccountResponseData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS, ]
 **idValue** | **String**| idValue |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountByIdentifier_0"></a>
# **getAccountByIdentifier_0**
> InteropIdentifierAccountResponseData getAccountByIdentifier_0(idType, idValue, subIdOrType)

Query Interoperation Account by secondary identifier



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropIdentifierAccountResponseData> call = apiService.getAccountByIdentifier_0(idType, idValue, subIdOrType);
call.enqueue(new Callback<InteropIdentifierAccountResponseData>() {
    @Override
    public void onResponse(Call<InteropIdentifierAccountResponseData> call, Response<InteropIdentifierAccountResponseData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropIdentifierAccountResponseData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS, ]
 **idValue** | **String**| idValue |
 **subIdOrType** | **String**| subIdOrType |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountDetails"></a>
# **getAccountDetails**
> InteropAccountData getAccountDetails(accountId)

Query Interoperation Account details



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropAccountData> call = apiService.getAccountDetails(accountId);
call.enqueue(new Callback<InteropAccountData>() {
    @Override
    public void onResponse(Call<InteropAccountData> call, Response<InteropAccountData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropAccountData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accountId** | **String**| accountId |

### Return type

[**InteropAccountData**](InteropAccountData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountIdentifiers"></a>
# **getAccountIdentifiers**
> InteropIdentifiersResponseData getAccountIdentifiers(accountId)

Query Interoperation secondary identifiers by Account Id



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropIdentifiersResponseData> call = apiService.getAccountIdentifiers(accountId);
call.enqueue(new Callback<InteropIdentifiersResponseData>() {
    @Override
    public void onResponse(Call<InteropIdentifiersResponseData> call, Response<InteropIdentifiersResponseData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropIdentifiersResponseData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accountId** | **String**| accountId |

### Return type

[**InteropIdentifiersResponseData**](InteropIdentifiersResponseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountTransactions"></a>
# **getAccountTransactions**
> InteropTransactionsData getAccountTransactions(accountId, debit, credit, fromBookingDateTime, toBookingDateTime)

Query transactions by Account Id



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropTransactionsData> call = apiService.getAccountTransactions(accountId, debit, credit, fromBookingDateTime, toBookingDateTime);
call.enqueue(new Callback<InteropTransactionsData>() {
    @Override
    public void onResponse(Call<InteropTransactionsData> call, Response<InteropTransactionsData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropTransactionsData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accountId** | **String**| accountId |
 **debit** | **Boolean**| debit | [optional] [default to true]
 **credit** | **Boolean**| credit | [optional] [default to false]
 **fromBookingDateTime** | **String**| fromBookingDateTime | [optional]
 **toBookingDateTime** | **String**| toBookingDateTime | [optional]

### Return type

[**InteropTransactionsData**](InteropTransactionsData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuote"></a>
# **getQuote**
> InteropQuoteResponseData getQuote(transactionCode, quoteCode)

Query Interoperation Quote



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropQuoteResponseData> call = apiService.getQuote(transactionCode, quoteCode);
call.enqueue(new Callback<InteropQuoteResponseData>() {
    @Override
    public void onResponse(Call<InteropQuoteResponseData> call, Response<InteropQuoteResponseData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropQuoteResponseData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **transactionCode** | **String**| transactionCode |
 **quoteCode** | **String**| quoteCode |

### Return type

[**InteropQuoteResponseData**](InteropQuoteResponseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionRequest"></a>
# **getTransactionRequest**
> InteropTransactionRequestResponseData getTransactionRequest(transactionCode, requestCode)

Query Interoperation Transaction Request



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropTransactionRequestResponseData> call = apiService.getTransactionRequest(transactionCode, requestCode);
call.enqueue(new Callback<InteropTransactionRequestResponseData>() {
    @Override
    public void onResponse(Call<InteropTransactionRequestResponseData> call, Response<InteropTransactionRequestResponseData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropTransactionRequestResponseData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **transactionCode** | **String**| transactionCode |
 **requestCode** | **String**| requestCode |

### Return type

[**InteropTransactionRequestResponseData**](InteropTransactionRequestResponseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransfer"></a>
# **getTransfer**
> InteropTransferResponseData getTransfer(transactionCode, transferCode)

Query Interoperation Transfer



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropTransferResponseData> call = apiService.getTransfer(transactionCode, transferCode);
call.enqueue(new Callback<InteropTransferResponseData>() {
    @Override
    public void onResponse(Call<InteropTransferResponseData> call, Response<InteropTransferResponseData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropTransferResponseData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **transactionCode** | **String**| transactionCode |
 **transferCode** | **String**| transferCode |

### Return type

[**InteropTransferResponseData**](InteropTransferResponseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="health"></a>
# **health**
> health()

Query Interoperation Health Request



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.health();
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
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="performTransfer"></a>
# **performTransfer**
> InteropTransferResponseData performTransfer(body, action)

Prepare Interoperation Transfer



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropTransferResponseData> call = apiService.performTransfer(body, action);
call.enqueue(new Callback<InteropTransferResponseData>() {
    @Override
    public void onResponse(Call<InteropTransferResponseData> call, Response<InteropTransferResponseData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropTransferResponseData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**InteropTransferRequestData**](InteropTransferRequestData.md)| body |
 **action** | **String**| action | [optional]

### Return type

[**InteropTransferResponseData**](InteropTransferResponseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerAccountIdentifier"></a>
# **registerAccountIdentifier**
> InteropIdentifierAccountResponseData registerAccountIdentifier(idType, idValue, body)

Interoperation Identifier registration



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropIdentifierAccountResponseData> call = apiService.registerAccountIdentifier(idType, idValue, body);
call.enqueue(new Callback<InteropIdentifierAccountResponseData>() {
    @Override
    public void onResponse(Call<InteropIdentifierAccountResponseData> call, Response<InteropIdentifierAccountResponseData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropIdentifierAccountResponseData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS, ]
 **idValue** | **String**| idValue |
 **body** | [**InteropIdentifierRequestData**](InteropIdentifierRequestData.md)| body |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerAccountIdentifier_0"></a>
# **registerAccountIdentifier_0**
> InteropIdentifierAccountResponseData registerAccountIdentifier_0(idType, idValue, subIdOrType, body)

Interoperation Identifier registration



### Example
```java

InteroperationApi apiService = defaultClient.createService(InteroperationApi.class);

// Initialize these parameters earlier.
Call<InteropIdentifierAccountResponseData> call = apiService.registerAccountIdentifier_0(idType, idValue, subIdOrType, body);
call.enqueue(new Callback<InteropIdentifierAccountResponseData>() {
    @Override
    public void onResponse(Call<InteropIdentifierAccountResponseData> call, Response<InteropIdentifierAccountResponseData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<InteropIdentifierAccountResponseData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS, ]
 **idValue** | **String**| idValue |
 **subIdOrType** | **String**| subIdOrType |
 **body** | [**InteropIdentifierRequestData**](InteropIdentifierRequestData.md)| body |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


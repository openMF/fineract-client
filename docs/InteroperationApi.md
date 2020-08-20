# InteroperationApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
InteropQuoteRequestData body = new InteropQuoteRequestData(); // InteropQuoteRequestData | body
try {
    InteropQuoteResponseData result = apiInstance.createQuote(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#createQuote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
InteropTransactionRequestData body = new InteropTransactionRequestData(); // InteropTransactionRequestData | body
try {
    InteropTransactionRequestResponseData result = apiInstance.createTransactionRequest(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#createTransactionRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
String idType = "idType_example"; // String | idType
String idValue = "idValue_example"; // String | idValue
InteropIdentifierRequestData body = new InteropIdentifierRequestData(); // InteropIdentifierRequestData | body
try {
    InteropIdentifierAccountResponseData result = apiInstance.deleteAccountIdentifier(idType, idValue, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#deleteAccountIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS]
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
String idType = "idType_example"; // String | idType
String idValue = "idValue_example"; // String | idValue
String subIdOrType = "subIdOrType_example"; // String | subIdOrType
InteropIdentifierRequestData body = new InteropIdentifierRequestData(); // InteropIdentifierRequestData | body
try {
    InteropIdentifierAccountResponseData result = apiInstance.deleteAccountIdentifier_0(idType, idValue, subIdOrType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#deleteAccountIdentifier_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS]
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
String idType = "idType_example"; // String | idType
String idValue = "idValue_example"; // String | idValue
try {
    InteropIdentifierAccountResponseData result = apiInstance.getAccountByIdentifier(idType, idValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#getAccountByIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS]
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
String idType = "idType_example"; // String | idType
String idValue = "idValue_example"; // String | idValue
String subIdOrType = "subIdOrType_example"; // String | subIdOrType
try {
    InteropIdentifierAccountResponseData result = apiInstance.getAccountByIdentifier_0(idType, idValue, subIdOrType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#getAccountByIdentifier_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS]
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
String accountId = "accountId_example"; // String | accountId
try {
    InteropAccountData result = apiInstance.getAccountDetails(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#getAccountDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
String accountId = "accountId_example"; // String | accountId
try {
    InteropIdentifiersResponseData result = apiInstance.getAccountIdentifiers(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#getAccountIdentifiers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
String accountId = "accountId_example"; // String | accountId
Boolean debit = true; // Boolean | debit
Boolean credit = false; // Boolean | credit
String fromBookingDateTime = "fromBookingDateTime_example"; // String | fromBookingDateTime
String toBookingDateTime = "toBookingDateTime_example"; // String | toBookingDateTime
try {
    InteropTransactionsData result = apiInstance.getAccountTransactions(accountId, debit, credit, fromBookingDateTime, toBookingDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#getAccountTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
String transactionCode = "transactionCode_example"; // String | transactionCode
String quoteCode = "quoteCode_example"; // String | quoteCode
try {
    InteropQuoteResponseData result = apiInstance.getQuote(transactionCode, quoteCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#getQuote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
String transactionCode = "transactionCode_example"; // String | transactionCode
String requestCode = "requestCode_example"; // String | requestCode
try {
    InteropTransactionRequestResponseData result = apiInstance.getTransactionRequest(transactionCode, requestCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#getTransactionRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
String transactionCode = "transactionCode_example"; // String | transactionCode
String transferCode = "transferCode_example"; // String | transferCode
try {
    InteropTransferResponseData result = apiInstance.getTransfer(transactionCode, transferCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#getTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
try {
    apiInstance.health();
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#health");
    e.printStackTrace();
}
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
InteropTransferRequestData body = new InteropTransferRequestData(); // InteropTransferRequestData | body
String action = "action_example"; // String | action
try {
    InteropTransferResponseData result = apiInstance.performTransfer(body, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#performTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
String idType = "idType_example"; // String | idType
String idValue = "idValue_example"; // String | idValue
InteropIdentifierRequestData body = new InteropIdentifierRequestData(); // InteropIdentifierRequestData | body
try {
    InteropIdentifierAccountResponseData result = apiInstance.registerAccountIdentifier(idType, idValue, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#registerAccountIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS]
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.InteroperationApi;


InteroperationApi apiInstance = new InteroperationApi();
String idType = "idType_example"; // String | idType
String idValue = "idValue_example"; // String | idValue
String subIdOrType = "subIdOrType_example"; // String | subIdOrType
InteropIdentifierRequestData body = new InteropIdentifierRequestData(); // InteropIdentifierRequestData | body
try {
    InteropIdentifierAccountResponseData result = apiInstance.registerAccountIdentifier_0(idType, idValue, subIdOrType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteroperationApi#registerAccountIdentifier_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idType** | **String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS]
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


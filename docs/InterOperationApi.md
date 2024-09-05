# InterOperationApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createQuote**](InterOperationApi.md#createQuote) | **POST** v1/interoperation/quotes | Calculate Interoperation Quote |
| [**createTransactionRequest**](InterOperationApi.md#createTransactionRequest) | **POST** v1/interoperation/requests | Allow Interoperation Transaction Request |
| [**deleteAccountIdentifier**](InterOperationApi.md#deleteAccountIdentifier) | **DELETE** v1/interoperation/parties/{idType}/{idValue} | Allow Interoperation Identifier registration |
| [**deleteAccountIdentifier1**](InterOperationApi.md#deleteAccountIdentifier1) | **DELETE** v1/interoperation/parties/{idType}/{idValue}/{subIdOrType} | Allow Interoperation Identifier registration |
| [**disburseLoan**](InterOperationApi.md#disburseLoan) | **POST** v1/interoperation/transactions/{accountId}/disburse | Disburse Loan by Account Id |
| [**getAccountByIdentifier**](InterOperationApi.md#getAccountByIdentifier) | **GET** v1/interoperation/parties/{idType}/{idValue} | Query Interoperation Account by secondary identifier |
| [**getAccountByIdentifier1**](InterOperationApi.md#getAccountByIdentifier1) | **GET** v1/interoperation/parties/{idType}/{idValue}/{subIdOrType} | Query Interoperation Account by secondary identifier |
| [**getAccountDetails**](InterOperationApi.md#getAccountDetails) | **GET** v1/interoperation/accounts/{accountId} | Query Interoperation Account details |
| [**getAccountIdentifiers**](InterOperationApi.md#getAccountIdentifiers) | **GET** v1/interoperation/accounts/{accountId}/identifiers | Query Interoperation secondary identifiers by Account Id |
| [**getAccountTransactions**](InterOperationApi.md#getAccountTransactions) | **GET** v1/interoperation/accounts/{accountId}/transactions | Query transactions by Account Id |
| [**getClientKyc**](InterOperationApi.md#getClientKyc) | **GET** v1/interoperation/accounts/{accountId}/kyc | Query KYC by Account Id |
| [**getQuote**](InterOperationApi.md#getQuote) | **GET** v1/interoperation/transactions/{transactionCode}/quotes/{quoteCode} | Query Interoperation Quote |
| [**getTransactionRequest**](InterOperationApi.md#getTransactionRequest) | **GET** v1/interoperation/transactions/{transactionCode}/requests/{requestCode} | Query Interoperation Transaction Request |
| [**getTransfer**](InterOperationApi.md#getTransfer) | **GET** v1/interoperation/transactions/{transactionCode}/transfers/{transferCode} | Query Interoperation Transfer |
| [**health**](InterOperationApi.md#health) | **GET** v1/interoperation/health | Query Interoperation Health Request |
| [**loanRepayment**](InterOperationApi.md#loanRepayment) | **POST** v1/interoperation/transactions/{accountId}/loanrepayment | Disburse Loan by Account Id |
| [**performTransfer**](InterOperationApi.md#performTransfer) | **POST** v1/interoperation/transfers | Prepare Interoperation Transfer |
| [**registerAccountIdentifier**](InterOperationApi.md#registerAccountIdentifier) | **POST** v1/interoperation/parties/{idType}/{idValue} | Interoperation Identifier registration |
| [**registerAccountIdentifier1**](InterOperationApi.md#registerAccountIdentifier1) | **POST** v1/interoperation/parties/{idType}/{idValue}/{subIdOrType} | Interoperation Identifier registration |



Calculate Interoperation Quote

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val interopQuoteRequestData : InteropQuoteRequestData =  // InteropQuoteRequestData | 

launch(Dispatchers.IO) {
    val result : InteropQuoteResponseData = webService.createQuote(interopQuoteRequestData)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **interopQuoteRequestData** | [**InteropQuoteRequestData**](InteropQuoteRequestData.md)|  | |

### Return type

[**InteropQuoteResponseData**](InteropQuoteResponseData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Allow Interoperation Transaction Request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val interopTransactionRequestData : InteropTransactionRequestData =  // InteropTransactionRequestData | 

launch(Dispatchers.IO) {
    val result : InteropTransactionRequestResponseData = webService.createTransactionRequest(interopTransactionRequestData)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **interopTransactionRequestData** | [**InteropTransactionRequestData**](InteropTransactionRequestData.md)|  | |

### Return type

[**InteropTransactionRequestResponseData**](InteropTransactionRequestResponseData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Allow Interoperation Identifier registration

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val idType : kotlin.String = idType_example // kotlin.String | idType
val idValue : kotlin.String = idValue_example // kotlin.String | idValue
val interopIdentifierRequestData : InteropIdentifierRequestData =  // InteropIdentifierRequestData | 

launch(Dispatchers.IO) {
    val result : InteropIdentifierAccountResponseData = webService.deleteAccountIdentifier(idType, idValue, interopIdentifierRequestData)
}
```

### Parameters
| **idType** | **kotlin.String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS] |
| **idValue** | **kotlin.String**| idValue | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **interopIdentifierRequestData** | [**InteropIdentifierRequestData**](InteropIdentifierRequestData.md)|  | |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Allow Interoperation Identifier registration

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val idType : kotlin.String = idType_example // kotlin.String | idType
val idValue : kotlin.String = idValue_example // kotlin.String | idValue
val subIdOrType : kotlin.String = subIdOrType_example // kotlin.String | subIdOrType
val interopIdentifierRequestData : InteropIdentifierRequestData =  // InteropIdentifierRequestData | 

launch(Dispatchers.IO) {
    val result : InteropIdentifierAccountResponseData = webService.deleteAccountIdentifier1(idType, idValue, subIdOrType, interopIdentifierRequestData)
}
```

### Parameters
| **idType** | **kotlin.String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS] |
| **idValue** | **kotlin.String**| idValue | |
| **subIdOrType** | **kotlin.String**| subIdOrType | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **interopIdentifierRequestData** | [**InteropIdentifierRequestData**](InteropIdentifierRequestData.md)|  | |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Disburse Loan by Account Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val accountId : kotlin.String = accountId_example // kotlin.String | accountId

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.disburseLoan(accountId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.String**| accountId | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Query Interoperation Account by secondary identifier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val idType : kotlin.String = idType_example // kotlin.String | idType
val idValue : kotlin.String = idValue_example // kotlin.String | idValue

launch(Dispatchers.IO) {
    val result : InteropIdentifierAccountResponseData = webService.getAccountByIdentifier(idType, idValue)
}
```

### Parameters
| **idType** | **kotlin.String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **idValue** | **kotlin.String**| idValue | |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Query Interoperation Account by secondary identifier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val idType : kotlin.String = idType_example // kotlin.String | idType
val idValue : kotlin.String = idValue_example // kotlin.String | idValue
val subIdOrType : kotlin.String = subIdOrType_example // kotlin.String | subIdOrType

launch(Dispatchers.IO) {
    val result : InteropIdentifierAccountResponseData = webService.getAccountByIdentifier1(idType, idValue, subIdOrType)
}
```

### Parameters
| **idType** | **kotlin.String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS] |
| **idValue** | **kotlin.String**| idValue | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subIdOrType** | **kotlin.String**| subIdOrType | |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Query Interoperation Account details

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val accountId : kotlin.String = accountId_example // kotlin.String | accountId

launch(Dispatchers.IO) {
    val result : InteropAccountData = webService.getAccountDetails(accountId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.String**| accountId | |

### Return type

[**InteropAccountData**](InteropAccountData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Query Interoperation secondary identifiers by Account Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val accountId : kotlin.String = accountId_example // kotlin.String | accountId

launch(Dispatchers.IO) {
    val result : InteropIdentifiersResponseData = webService.getAccountIdentifiers(accountId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.String**| accountId | |

### Return type

[**InteropIdentifiersResponseData**](InteropIdentifiersResponseData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Query transactions by Account Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val accountId : kotlin.String = accountId_example // kotlin.String | accountId
val debit : kotlin.Boolean = true // kotlin.Boolean | debit
val credit : kotlin.Boolean = true // kotlin.Boolean | credit
val fromBookingDateTime : kotlin.String = fromBookingDateTime_example // kotlin.String | fromBookingDateTime
val toBookingDateTime : kotlin.String = toBookingDateTime_example // kotlin.String | toBookingDateTime

launch(Dispatchers.IO) {
    val result : InteropTransactionsData = webService.getAccountTransactions(accountId, debit, credit, fromBookingDateTime, toBookingDateTime)
}
```

### Parameters
| **accountId** | **kotlin.String**| accountId | |
| **debit** | **kotlin.Boolean**| debit | [optional] [default to true] |
| **credit** | **kotlin.Boolean**| credit | [optional] [default to false] |
| **fromBookingDateTime** | **kotlin.String**| fromBookingDateTime | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **toBookingDateTime** | **kotlin.String**| toBookingDateTime | [optional] |

### Return type

[**InteropTransactionsData**](InteropTransactionsData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Query KYC by Account Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val accountId : kotlin.String = accountId_example // kotlin.String | accountId

launch(Dispatchers.IO) {
    val result : InteropKycResponseData = webService.getClientKyc(accountId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.String**| accountId | |

### Return type

[**InteropKycResponseData**](InteropKycResponseData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Query Interoperation Quote

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val transactionCode : kotlin.String = transactionCode_example // kotlin.String | transactionCode
val quoteCode : kotlin.String = quoteCode_example // kotlin.String | quoteCode

launch(Dispatchers.IO) {
    val result : InteropQuoteResponseData = webService.getQuote(transactionCode, quoteCode)
}
```

### Parameters
| **transactionCode** | **kotlin.String**| transactionCode | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quoteCode** | **kotlin.String**| quoteCode | |

### Return type

[**InteropQuoteResponseData**](InteropQuoteResponseData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Query Interoperation Transaction Request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val transactionCode : kotlin.String = transactionCode_example // kotlin.String | transactionCode
val requestCode : kotlin.String = requestCode_example // kotlin.String | requestCode

launch(Dispatchers.IO) {
    val result : InteropTransactionRequestResponseData = webService.getTransactionRequest(transactionCode, requestCode)
}
```

### Parameters
| **transactionCode** | **kotlin.String**| transactionCode | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestCode** | **kotlin.String**| requestCode | |

### Return type

[**InteropTransactionRequestResponseData**](InteropTransactionRequestResponseData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Query Interoperation Transfer

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val transactionCode : kotlin.String = transactionCode_example // kotlin.String | transactionCode
val transferCode : kotlin.String = transferCode_example // kotlin.String | transferCode

launch(Dispatchers.IO) {
    val result : InteropTransferResponseData = webService.getTransfer(transactionCode, transferCode)
}
```

### Parameters
| **transactionCode** | **kotlin.String**| transactionCode | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transferCode** | **kotlin.String**| transferCode | |

### Return type

[**InteropTransferResponseData**](InteropTransferResponseData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Query Interoperation Health Request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)

launch(Dispatchers.IO) {
    webService.health()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


Disburse Loan by Account Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val accountId : kotlin.String = accountId_example // kotlin.String | accountId

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.loanRepayment(accountId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.String**| accountId | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Prepare Interoperation Transfer

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val interopTransferRequestData : InteropTransferRequestData =  // InteropTransferRequestData | 
val action : kotlin.String = action_example // kotlin.String | action

launch(Dispatchers.IO) {
    val result : InteropTransferResponseData = webService.performTransfer(interopTransferRequestData, action)
}
```

### Parameters
| **interopTransferRequestData** | [**InteropTransferRequestData**](InteropTransferRequestData.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **action** | **kotlin.String**| action | [optional] |

### Return type

[**InteropTransferResponseData**](InteropTransferResponseData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Interoperation Identifier registration

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val idType : kotlin.String = idType_example // kotlin.String | idType
val idValue : kotlin.String = idValue_example // kotlin.String | idValue
val interopIdentifierRequestData : InteropIdentifierRequestData =  // InteropIdentifierRequestData | 

launch(Dispatchers.IO) {
    val result : InteropIdentifierAccountResponseData = webService.registerAccountIdentifier(idType, idValue, interopIdentifierRequestData)
}
```

### Parameters
| **idType** | **kotlin.String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS] |
| **idValue** | **kotlin.String**| idValue | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **interopIdentifierRequestData** | [**InteropIdentifierRequestData**](InteropIdentifierRequestData.md)|  | |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Interoperation Identifier registration

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InterOperationApi::class.java)
val idType : kotlin.String = idType_example // kotlin.String | idType
val idValue : kotlin.String = idValue_example // kotlin.String | idValue
val subIdOrType : kotlin.String = subIdOrType_example // kotlin.String | subIdOrType
val interopIdentifierRequestData : InteropIdentifierRequestData =  // InteropIdentifierRequestData | 

launch(Dispatchers.IO) {
    val result : InteropIdentifierAccountResponseData = webService.registerAccountIdentifier1(idType, idValue, subIdOrType, interopIdentifierRequestData)
}
```

### Parameters
| **idType** | **kotlin.String**| idType | [enum: MSISDN, EMAIL, PERSONAL_ID, BUSINESS, DEVICE, ACCOUNT_ID, IBAN, ALIAS] |
| **idValue** | **kotlin.String**| idValue | |
| **subIdOrType** | **kotlin.String**| subIdOrType | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **interopIdentifierRequestData** | [**InteropIdentifierRequestData**](InteropIdentifierRequestData.md)|  | |

### Return type

[**InteropIdentifierAccountResponseData**](InteropIdentifierAccountResponseData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


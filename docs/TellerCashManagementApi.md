# TellerCashManagementApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**allocateCashToCashier**](TellerCashManagementApi.md#allocateCashToCashier) | **POST** v1/tellers/{tellerId}/cashiers/{cashierId}/allocate | Allocate Cash To Cashier |
| [**createCashier**](TellerCashManagementApi.md#createCashier) | **POST** v1/tellers/{tellerId}/cashiers | Create Cashiers |
| [**createTeller**](TellerCashManagementApi.md#createTeller) | **POST** v1/tellers | Create teller |
| [**deleteCashier**](TellerCashManagementApi.md#deleteCashier) | **DELETE** v1/tellers/{tellerId}/cashiers/{cashierId} | Delete Cashier |
| [**deleteTeller**](TellerCashManagementApi.md#deleteTeller) | **DELETE** v1/tellers/{tellerId} |  |
| [**findCashierData**](TellerCashManagementApi.md#findCashierData) | **GET** v1/tellers/{tellerId}/cashiers/{cashierId} | Retrieve a cashier |
| [**findTeller**](TellerCashManagementApi.md#findTeller) | **GET** v1/tellers/{tellerId} | Retrieve tellers |
| [**findTransactionData**](TellerCashManagementApi.md#findTransactionData) | **GET** v1/tellers/{tellerId}/transactions/{transactionId} |  |
| [**getCashierData1**](TellerCashManagementApi.md#getCashierData1) | **GET** v1/tellers/{tellerId}/cashiers | List Cashiers |
| [**getCashierTemplate**](TellerCashManagementApi.md#getCashierTemplate) | **GET** v1/tellers/{tellerId}/cashiers/template | Find Cashiers |
| [**getCashierTxnTemplate**](TellerCashManagementApi.md#getCashierTxnTemplate) | **GET** v1/tellers/{tellerId}/cashiers/{cashierId}/transactions/template | Retrieve Cashier Transaction Template |
| [**getJournalData**](TellerCashManagementApi.md#getJournalData) | **GET** v1/tellers/{tellerId}/journals |  |
| [**getTellerData**](TellerCashManagementApi.md#getTellerData) | **GET** v1/tellers | List all tellers |
| [**getTransactionData**](TellerCashManagementApi.md#getTransactionData) | **GET** v1/tellers/{tellerId}/transactions |  |
| [**getTransactionsForCashier**](TellerCashManagementApi.md#getTransactionsForCashier) | **GET** v1/tellers/{tellerId}/cashiers/{cashierId}/transactions | Retrieve Cashier Transaction |
| [**getTransactionsWtihSummaryForCashier**](TellerCashManagementApi.md#getTransactionsWtihSummaryForCashier) | **GET** v1/tellers/{tellerId}/cashiers/{cashierId}/summaryandtransactions | Transactions Wtih Summary For Cashier |
| [**settleCashFromCashier**](TellerCashManagementApi.md#settleCashFromCashier) | **POST** v1/tellers/{tellerId}/cashiers/{cashierId}/settle | Settle Cash From Cashier |
| [**updateCashier**](TellerCashManagementApi.md#updateCashier) | **PUT** v1/tellers/{tellerId}/cashiers/{cashierId} | Update Cashier |
| [**updateTeller**](TellerCashManagementApi.md#updateTeller) | **PUT** v1/tellers/{tellerId} | Update teller |



Allocate Cash To Cashier

Mandatory Fields:  Date, Amount, Currency, Notes/Comments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId
val cashierId : kotlin.Long = 789 // kotlin.Long | cashierId
val postTellersTellerIdCashiersCashierIdAllocateRequest : PostTellersTellerIdCashiersCashierIdAllocateRequest =  // PostTellersTellerIdCashiersCashierIdAllocateRequest | 

launch(Dispatchers.IO) {
    val result : PostTellersTellerIdCashiersCashierIdAllocateResponse = webService.allocateCashToCashier(tellerId, cashierId, postTellersTellerIdCashiersCashierIdAllocateRequest)
}
```

### Parameters
| **tellerId** | **kotlin.Long**| tellerId | |
| **cashierId** | **kotlin.Long**| cashierId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postTellersTellerIdCashiersCashierIdAllocateRequest** | [**PostTellersTellerIdCashiersCashierIdAllocateRequest**](PostTellersTellerIdCashiersCashierIdAllocateRequest.md)|  | |

### Return type

[**PostTellersTellerIdCashiersCashierIdAllocateResponse**](PostTellersTellerIdCashiersCashierIdAllocateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json, text/html
 - **Accept**: application/json


Create Cashiers

Mandatory Fields:  Cashier/staff, Fromm Date, To Date, Full Day or From time and To time    Optional Fields:  Description/Notes

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId
val postTellersTellerIdCashiersRequest : PostTellersTellerIdCashiersRequest =  // PostTellersTellerIdCashiersRequest | 

launch(Dispatchers.IO) {
    val result : PostTellersTellerIdCashiersResponse = webService.createCashier(tellerId, postTellersTellerIdCashiersRequest)
}
```

### Parameters
| **tellerId** | **kotlin.Long**| tellerId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postTellersTellerIdCashiersRequest** | [**PostTellersTellerIdCashiersRequest**](PostTellersTellerIdCashiersRequest.md)|  | |

### Return type

[**PostTellersTellerIdCashiersResponse**](PostTellersTellerIdCashiersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Create teller

Mandatory Fields Teller name, OfficeId, Description, Start Date, Status Optional Fields End Date

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val postTellersRequest : PostTellersRequest =  // PostTellersRequest | 

launch(Dispatchers.IO) {
    val result : PostTellersResponse = webService.createTeller(postTellersRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postTellersRequest** | [**PostTellersRequest**](PostTellersRequest.md)|  | |

### Return type

[**PostTellersResponse**](PostTellersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete Cashier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId
val cashierId : kotlin.Long = 789 // kotlin.Long | cashierId

launch(Dispatchers.IO) {
    val result : DeleteTellersTellerIdCashiersCashierIdResponse = webService.deleteCashier(tellerId, cashierId)
}
```

### Parameters
| **tellerId** | **kotlin.Long**| tellerId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cashierId** | **kotlin.Long**| cashierId | |

### Return type

[**DeleteTellersTellerIdCashiersCashierIdResponse**](DeleteTellersTellerIdCashiersCashierIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.deleteTeller(tellerId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tellerId** | **kotlin.Long**| tellerId | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a cashier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId
val cashierId : kotlin.Long = 789 // kotlin.Long | cashierId

launch(Dispatchers.IO) {
    val result : GetTellersTellerIdCashiersCashierIdResponse = webService.findCashierData(tellerId, cashierId)
}
```

### Parameters
| **tellerId** | **kotlin.Long**| tellerId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cashierId** | **kotlin.Long**| cashierId | |

### Return type

[**GetTellersTellerIdCashiersCashierIdResponse**](GetTellersTellerIdCashiersCashierIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve tellers

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId

launch(Dispatchers.IO) {
    val result : GetTellersResponse = webService.findTeller(tellerId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tellerId** | **kotlin.Long**| tellerId | |

### Return type

[**GetTellersResponse**](GetTellersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.findTransactionData(tellerId, transactionId)
}
```

### Parameters
| **tellerId** | **kotlin.Long**| tellerId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionId** | **kotlin.Long**| transactionId | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Cashiers

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId
val fromdate : kotlin.String = fromdate_example // kotlin.String | fromdate
val todate : kotlin.String = todate_example // kotlin.String | todate

launch(Dispatchers.IO) {
    val result : GetTellersTellerIdCashiersResponse = webService.getCashierData1(tellerId, fromdate, todate)
}
```

### Parameters
| **tellerId** | **kotlin.Long**| tellerId | |
| **fromdate** | **kotlin.String**| fromdate | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **todate** | **kotlin.String**| todate | [optional] |

### Return type

[**GetTellersTellerIdCashiersResponse**](GetTellersTellerIdCashiersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Find Cashiers

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId

launch(Dispatchers.IO) {
    val result : GetTellersTellerIdCashiersTemplateResponse = webService.getCashierTemplate(tellerId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tellerId** | **kotlin.Long**| tellerId | |

### Return type

[**GetTellersTellerIdCashiersTemplateResponse**](GetTellersTellerIdCashiersTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Cashier Transaction Template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId
val cashierId : kotlin.Long = 789 // kotlin.Long | cashierId

launch(Dispatchers.IO) {
    val result : GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse = webService.getCashierTxnTemplate(tellerId, cashierId)
}
```

### Parameters
| **tellerId** | **kotlin.Long**| tellerId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cashierId** | **kotlin.Long**| cashierId | |

### Return type

[**GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse**](GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId
val cashierId : kotlin.Long = 789 // kotlin.Long | cashierId
val dateRange : kotlin.String = dateRange_example // kotlin.String | dateRange

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getJournalData(tellerId, cashierId, dateRange)
}
```

### Parameters
| **tellerId** | **kotlin.Long**| tellerId | |
| **cashierId** | **kotlin.Long**| cashierId | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dateRange** | **kotlin.String**| dateRange | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List all tellers

Retrieves list tellers

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | officeId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetTellersResponse> = webService.getTellerData(officeId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **officeId** | **kotlin.Long**| officeId | [optional] |

### Return type

[**kotlin.collections.List&lt;GetTellersResponse&gt;**](GetTellersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId
val dateRange : kotlin.String = dateRange_example // kotlin.String | dateRange

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getTransactionData(tellerId, dateRange)
}
```

### Parameters
| **tellerId** | **kotlin.Long**| tellerId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dateRange** | **kotlin.String**| dateRange | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Cashier Transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId
val cashierId : kotlin.Long = 789 // kotlin.Long | cashierId
val currencyCode : kotlin.String = currencyCode_example // kotlin.String | currencyCode
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetTellersTellerIdCashiersCashiersIdTransactionsResponse> = webService.getTransactionsForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder)
}
```

### Parameters
| **tellerId** | **kotlin.Long**| tellerId | |
| **cashierId** | **kotlin.Long**| cashierId | |
| **currencyCode** | **kotlin.String**| currencyCode | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |

### Return type

[**kotlin.collections.List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt;**](GetTellersTellerIdCashiersCashiersIdTransactionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Transactions Wtih Summary For Cashier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId
val cashierId : kotlin.Long = 789 // kotlin.Long | cashierId
val currencyCode : kotlin.String = currencyCode_example // kotlin.String | currencyCode
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder

launch(Dispatchers.IO) {
    val result : GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse = webService.getTransactionsWtihSummaryForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder)
}
```

### Parameters
| **tellerId** | **kotlin.Long**| tellerId | |
| **cashierId** | **kotlin.Long**| cashierId | |
| **currencyCode** | **kotlin.String**| currencyCode | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |

### Return type

[**GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse**](GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Settle Cash From Cashier

Mandatory Fields Date, Amount, Currency, Notes/Comments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId
val cashierId : kotlin.Long = 789 // kotlin.Long | cashierId
val postTellersTellerIdCashiersCashierIdSettleRequest : PostTellersTellerIdCashiersCashierIdSettleRequest =  // PostTellersTellerIdCashiersCashierIdSettleRequest | 

launch(Dispatchers.IO) {
    val result : PostTellersTellerIdCashiersCashierIdSettleResponse = webService.settleCashFromCashier(tellerId, cashierId, postTellersTellerIdCashiersCashierIdSettleRequest)
}
```

### Parameters
| **tellerId** | **kotlin.Long**| tellerId | |
| **cashierId** | **kotlin.Long**| cashierId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postTellersTellerIdCashiersCashierIdSettleRequest** | [**PostTellersTellerIdCashiersCashierIdSettleRequest**](PostTellersTellerIdCashiersCashierIdSettleRequest.md)|  | |

### Return type

[**PostTellersTellerIdCashiersCashierIdSettleResponse**](PostTellersTellerIdCashiersCashierIdSettleResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json, text/html
 - **Accept**: application/json


Update Cashier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId
val cashierId : kotlin.Long = 789 // kotlin.Long | cashierId
val putTellersTellerIdCashiersCashierIdRequest : PutTellersTellerIdCashiersCashierIdRequest =  // PutTellersTellerIdCashiersCashierIdRequest | 

launch(Dispatchers.IO) {
    val result : PutTellersTellerIdCashiersCashierIdResponse = webService.updateCashier(tellerId, cashierId, putTellersTellerIdCashiersCashierIdRequest)
}
```

### Parameters
| **tellerId** | **kotlin.Long**| tellerId | |
| **cashierId** | **kotlin.Long**| cashierId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putTellersTellerIdCashiersCashierIdRequest** | [**PutTellersTellerIdCashiersCashierIdRequest**](PutTellersTellerIdCashiersCashierIdRequest.md)|  | |

### Return type

[**PutTellersTellerIdCashiersCashierIdResponse**](PutTellersTellerIdCashiersCashierIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update teller

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(TellerCashManagementApi::class.java)
val tellerId : kotlin.Long = 789 // kotlin.Long | tellerId
val putTellersRequest : PutTellersRequest =  // PutTellersRequest | 

launch(Dispatchers.IO) {
    val result : PutTellersResponse = webService.updateTeller(tellerId, putTellersRequest)
}
```

### Parameters
| **tellerId** | **kotlin.Long**| tellerId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putTellersRequest** | [**PutTellersRequest**](PutTellersRequest.md)|  | |

### Return type

[**PutTellersResponse**](PutTellersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


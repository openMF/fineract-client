# SavingsAccountTransactionsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adjustTransaction1**](SavingsAccountTransactionsApi.md#adjustTransaction1) | **POST** v1/savingsaccounts/{savingsId}/transactions/{transactionId} | Undo/Reverse/Modify/Release Amount transaction API |
| [**advancedQuery1**](SavingsAccountTransactionsApi.md#advancedQuery1) | **POST** v1/savingsaccounts/{savingsId}/transactions/query | Advanced search Savings Account Transactions |
| [**retrieveOne24**](SavingsAccountTransactionsApi.md#retrieveOne24) | **GET** v1/savingsaccounts/{savingsId}/transactions/{transactionId} |  |
| [**retrieveTemplate19**](SavingsAccountTransactionsApi.md#retrieveTemplate19) | **GET** v1/savingsaccounts/{savingsId}/transactions/template |  |
| [**searchTransactions**](SavingsAccountTransactionsApi.md#searchTransactions) | **GET** v1/savingsaccounts/{savingsId}/transactions/search | Search Savings Account Transactions |
| [**transaction2**](SavingsAccountTransactionsApi.md#transaction2) | **POST** v1/savingsaccounts/{savingsId}/transactions |  |



Undo/Reverse/Modify/Release Amount transaction API

Undo/Reverse/Modify/Release Amount transaction API  Example Requests:   savingsaccounts/{savingsId}/transactions/{transactionId}?command&#x3D;reverse  Accepted command &#x3D; undo, reverse, modify, releaseAmount

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountTransactionsApi::class.java)
val savingsId : kotlin.Long = 789 // kotlin.Long | 
val transactionId : kotlin.Long = 789 // kotlin.Long | 
val postSavingsAccountBulkReversalTransactionsRequest : PostSavingsAccountBulkReversalTransactionsRequest =  // PostSavingsAccountBulkReversalTransactionsRequest | 
val command : kotlin.String = command_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<PostSavingsAccountBulkReversalTransactionsRequest> = webService.adjustTransaction1(savingsId, transactionId, postSavingsAccountBulkReversalTransactionsRequest, command)
}
```

### Parameters
| **savingsId** | **kotlin.Long**|  | |
| **transactionId** | **kotlin.Long**|  | |
| **postSavingsAccountBulkReversalTransactionsRequest** | [**PostSavingsAccountBulkReversalTransactionsRequest**](PostSavingsAccountBulkReversalTransactionsRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;PostSavingsAccountBulkReversalTransactionsRequest&gt;**](PostSavingsAccountBulkReversalTransactionsRequest.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Advanced search Savings Account Transactions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountTransactionsApi::class.java)
val savingsId : kotlin.Long = 789 // kotlin.Long | savingsId
val pagedLocalRequestAdvancedQueryRequest : PagedLocalRequestAdvancedQueryRequest =  // PagedLocalRequestAdvancedQueryRequest | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.advancedQuery1(savingsId, pagedLocalRequestAdvancedQueryRequest)
}
```

### Parameters
| **savingsId** | **kotlin.Long**| savingsId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pagedLocalRequestAdvancedQueryRequest** | [**PagedLocalRequestAdvancedQueryRequest**](PagedLocalRequestAdvancedQueryRequest.md)|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountTransactionsApi::class.java)
val savingsId : kotlin.Long = 789 // kotlin.Long | 
val transactionId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveOne24(savingsId, transactionId)
}
```

### Parameters
| **savingsId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionId** | **kotlin.Long**|  | |

### Return type

**kotlin.String**

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
val webService = apiClient.createWebservice(SavingsAccountTransactionsApi::class.java)
val savingsId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveTemplate19(savingsId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **savingsId** | **kotlin.Long**|  | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Search Savings Account Transactions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountTransactionsApi::class.java)
val savingsId : kotlin.Long = 789 // kotlin.Long | savings account id
val fromDate : kotlin.String = 2023-08-08 // kotlin.String | minimum value date (inclusive)
val toDate : kotlin.String = 2023-08-15 // kotlin.String | maximum value date (inclusive)
val fromSubmittedDate : kotlin.String = 2023-08-08 // kotlin.String | minimum booking date (inclusive)
val toSubmittedDate : kotlin.String = 2023-08-15 // kotlin.String | maximum booking date (inclusive)
val fromAmount : java.math.BigDecimal = 1000 // java.math.BigDecimal | minimum transaction amount (inclusive)
val toAmount : java.math.BigDecimal = 50000000 // java.math.BigDecimal | maximum transaction amount (inclusive)
val types : kotlin.String = 1,2,4,20,21 // kotlin.String | transaction types
val credit : kotlin.Boolean = true // kotlin.Boolean | credit
val debit : kotlin.Boolean = true // kotlin.Boolean | debit
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = createdDate,transactionDate,id // kotlin.String | sort properties
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sort direction
val locale : kotlin.String = locale_example // kotlin.String | locale
val dateFormat : kotlin.String = yyyy-MM-dd // kotlin.String | date format

launch(Dispatchers.IO) {
    val result : SavingsAccountTransactionsSearchResponse = webService.searchTransactions(savingsId, fromDate, toDate, fromSubmittedDate, toSubmittedDate, fromAmount, toAmount, types, credit, debit, offset, limit, orderBy, sortOrder, locale, dateFormat)
}
```

### Parameters
| **savingsId** | **kotlin.Long**| savings account id | |
| **fromDate** | **kotlin.String**| minimum value date (inclusive) | [optional] |
| **toDate** | **kotlin.String**| maximum value date (inclusive) | [optional] |
| **fromSubmittedDate** | **kotlin.String**| minimum booking date (inclusive) | [optional] |
| **toSubmittedDate** | **kotlin.String**| maximum booking date (inclusive) | [optional] |
| **fromAmount** | **java.math.BigDecimal**| minimum transaction amount (inclusive) | [optional] |
| **toAmount** | **java.math.BigDecimal**| maximum transaction amount (inclusive) | [optional] |
| **types** | **kotlin.String**| transaction types | [optional] |
| **credit** | **kotlin.Boolean**| credit | [optional] |
| **debit** | **kotlin.Boolean**| debit | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| sort properties | [optional] |
| **sortOrder** | **kotlin.String**| sort direction | [optional] [enum: ASC, DESC] |
| **locale** | **kotlin.String**| locale | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dateFormat** | **kotlin.String**| date format | [optional] |

### Return type

[**SavingsAccountTransactionsSearchResponse**](SavingsAccountTransactionsSearchResponse.md)

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
val webService = apiClient.createWebservice(SavingsAccountTransactionsApi::class.java)
val savingsId : kotlin.Long = 789 // kotlin.Long | 
val postSavingsAccountTransactionsRequest : PostSavingsAccountTransactionsRequest =  // PostSavingsAccountTransactionsRequest | 
val command : kotlin.String = command_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : PostSavingsAccountTransactionsResponse = webService.transaction2(savingsId, postSavingsAccountTransactionsRequest, command)
}
```

### Parameters
| **savingsId** | **kotlin.Long**|  | |
| **postSavingsAccountTransactionsRequest** | [**PostSavingsAccountTransactionsRequest**](PostSavingsAccountTransactionsRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**|  | [optional] |

### Return type

[**PostSavingsAccountTransactionsResponse**](PostSavingsAccountTransactionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


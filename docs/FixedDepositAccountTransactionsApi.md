# FixedDepositAccountTransactionsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adjustTransaction**](FixedDepositAccountTransactionsApi.md#adjustTransaction) | **POST** v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId} |  |
| [**retrieveOne18**](FixedDepositAccountTransactionsApi.md#retrieveOne18) | **GET** v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId} |  |
| [**retrieveTemplate14**](FixedDepositAccountTransactionsApi.md#retrieveTemplate14) | **GET** v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions/template |  |
| [**transaction**](FixedDepositAccountTransactionsApi.md#transaction) | **POST** v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FixedDepositAccountTransactionsApi::class.java)
val fixedDepositAccountId : kotlin.Long = 789 // kotlin.Long | 
val transactionId : kotlin.Long = 789 // kotlin.Long | 
val command : kotlin.String = command_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.adjustTransaction(fixedDepositAccountId, transactionId, command, body)
}
```

### Parameters
| **fixedDepositAccountId** | **kotlin.Long**|  | |
| **transactionId** | **kotlin.Long**|  | |
| **command** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

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
val webService = apiClient.createWebservice(FixedDepositAccountTransactionsApi::class.java)
val fixedDepositAccountId : kotlin.Long = 789 // kotlin.Long | 
val transactionId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveOne18(fixedDepositAccountId, transactionId)
}
```

### Parameters
| **fixedDepositAccountId** | **kotlin.Long**|  | |
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
val webService = apiClient.createWebservice(FixedDepositAccountTransactionsApi::class.java)
val fixedDepositAccountId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveTemplate14(fixedDepositAccountId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fixedDepositAccountId** | **kotlin.Long**|  | |

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
val webService = apiClient.createWebservice(FixedDepositAccountTransactionsApi::class.java)
val fixedDepositAccountId : kotlin.Long = 789 // kotlin.Long | 
val command : kotlin.String = command_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.transaction(fixedDepositAccountId, command, body)
}
```

### Parameters
| **fixedDepositAccountId** | **kotlin.Long**|  | |
| **command** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


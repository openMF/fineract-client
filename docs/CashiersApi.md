# CashiersApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getCashierData**](CashiersApi.md#getCashierData) | **GET** v1/cashiers |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CashiersApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 
val tellerId : kotlin.Long = 789 // kotlin.Long | 
val staffId : kotlin.Long = 789 // kotlin.Long | 
val date : kotlin.String = date_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getCashierData(officeId, tellerId, staffId, date)
}
```

### Parameters
| **officeId** | **kotlin.Long**|  | [optional] |
| **tellerId** | **kotlin.Long**|  | [optional] |
| **staffId** | **kotlin.Long**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **date** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


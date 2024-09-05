# CashierJournalsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getJournalData1**](CashierJournalsApi.md#getJournalData1) | **GET** v1/cashiersjournal |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CashierJournalsApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 
val tellerId : kotlin.Long = 789 // kotlin.Long | 
val cashierId : kotlin.Long = 789 // kotlin.Long | 
val dateRange : kotlin.String = dateRange_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getJournalData1(officeId, tellerId, cashierId, dateRange)
}
```

### Parameters
| **officeId** | **kotlin.Long**|  | [optional] |
| **tellerId** | **kotlin.Long**|  | [optional] |
| **cashierId** | **kotlin.Long**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dateRange** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


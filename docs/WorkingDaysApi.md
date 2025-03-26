# WorkingDaysApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieveAll17**](WorkingDaysApi.md#retrieveAll17) | **GET** v1/workingdays | List Working days |
| [**template4**](WorkingDaysApi.md#template4) | **GET** v1/workingdays/template | Working Days Template |
| [**update8**](WorkingDaysApi.md#update8) | **PUT** v1/workingdays | Update a Working Day |



List Working days

Example Requests:  workingdays

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(WorkingDaysApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetWorkingDaysResponse> = webService.retrieveAll17()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetWorkingDaysResponse&gt;**](GetWorkingDaysResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Working Days Template

This is a convenience resource. It can be useful when building maintenance user interface screens for working days.  Example Request:  workingdays/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(WorkingDaysApi::class.java)

launch(Dispatchers.IO) {
    val result : GetWorkingDaysTemplateResponse = webService.template4()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetWorkingDaysTemplateResponse**](GetWorkingDaysTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Working Day

Mandatory Fields recurrence,repaymentRescheduleType,extendTermForDailyRepayments,locale

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(WorkingDaysApi::class.java)
val putWorkingDaysRequest : PutWorkingDaysRequest =  // PutWorkingDaysRequest | 

launch(Dispatchers.IO) {
    val result : PutWorkingDaysResponse = webService.update8(putWorkingDaysRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putWorkingDaysRequest** | [**PutWorkingDaysRequest**](PutWorkingDaysRequest.md)|  | |

### Return type

[**PutWorkingDaysResponse**](PutWorkingDaysResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


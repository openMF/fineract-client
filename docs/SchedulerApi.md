# SchedulerApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**changeSchedulerStatus**](SchedulerApi.md#changeSchedulerStatus) | **POST** v1/scheduler | Activate Scheduler Jobs | Suspend Scheduler Jobs |
| [**retrieveStatus**](SchedulerApi.md#retrieveStatus) | **GET** v1/scheduler | Retrieve Scheduler Status |



Activate Scheduler Jobs | Suspend Scheduler Jobs

Activates the scheduler job service. | Suspends the scheduler job service.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SchedulerApi::class.java)
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    webService.changeSchedulerStatus(command)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


Retrieve Scheduler Status

Returns the scheduler status.  Example Requests:  scheduler

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SchedulerApi::class.java)

launch(Dispatchers.IO) {
    val result : GetSchedulerResponse = webService.retrieveStatus()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSchedulerResponse**](GetSchedulerResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


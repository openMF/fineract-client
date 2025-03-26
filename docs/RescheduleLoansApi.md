# RescheduleLoansApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createLoanRescheduleRequest**](RescheduleLoansApi.md#createLoanRescheduleRequest) | **POST** v1/rescheduleloans | Create loan reschedule request |
| [**readLoanRescheduleRequest**](RescheduleLoansApi.md#readLoanRescheduleRequest) | **GET** v1/rescheduleloans/{scheduleId} | Retrieve loan reschedule request by schedule id |
| [**retrieveAllRescheduleRequest**](RescheduleLoansApi.md#retrieveAllRescheduleRequest) | **GET** v1/rescheduleloans | Retrieve all reschedule requests |
| [**retrieveTemplate10**](RescheduleLoansApi.md#retrieveTemplate10) | **GET** v1/rescheduleloans/template | Retrieve all reschedule loan reasons |
| [**updateLoanRescheduleRequest**](RescheduleLoansApi.md#updateLoanRescheduleRequest) | **POST** v1/rescheduleloans/{scheduleId} | Update loan reschedule request |



Create loan reschedule request

Create a loan reschedule request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RescheduleLoansApi::class.java)
val postCreateRescheduleLoansRequest : PostCreateRescheduleLoansRequest =  // PostCreateRescheduleLoansRequest | 

launch(Dispatchers.IO) {
    val result : PostCreateRescheduleLoansResponse = webService.createLoanRescheduleRequest(postCreateRescheduleLoansRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postCreateRescheduleLoansRequest** | [**PostCreateRescheduleLoansRequest**](PostCreateRescheduleLoansRequest.md)|  | |

### Return type

[**PostCreateRescheduleLoansResponse**](PostCreateRescheduleLoansResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve loan reschedule request by schedule id

Retrieve loan reschedule request by schedule id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RescheduleLoansApi::class.java)
val scheduleId : kotlin.Long = 789 // kotlin.Long | 
val command : kotlin.String = command_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : GetLoanRescheduleRequestResponse = webService.readLoanRescheduleRequest(scheduleId, command)
}
```

### Parameters
| **scheduleId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**|  | [optional] |

### Return type

[**GetLoanRescheduleRequestResponse**](GetLoanRescheduleRequestResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve all reschedule requests

Retrieve all reschedule requests.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RescheduleLoansApi::class.java)
val command : kotlin.String = command_example // kotlin.String | 
val loanId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetLoanRescheduleRequestResponse> = webService.retrieveAllRescheduleRequest(command, loanId)
}
```

### Parameters
| **command** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanId** | **kotlin.Long**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;GetLoanRescheduleRequestResponse&gt;**](GetLoanRescheduleRequestResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve all reschedule loan reasons

Retrieve all reschedule loan reasons as a template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RescheduleLoansApi::class.java)

launch(Dispatchers.IO) {
    val result : GetRescheduleReasonsTemplateResponse = webService.retrieveTemplate10()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetRescheduleReasonsTemplateResponse**](GetRescheduleReasonsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update loan reschedule request

Update a loan reschedule request by either approving/rejecting it.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RescheduleLoansApi::class.java)
val scheduleId : kotlin.Long = 789 // kotlin.Long | 
val postUpdateRescheduleLoansRequest : PostUpdateRescheduleLoansRequest =  // PostUpdateRescheduleLoansRequest | 
val command : kotlin.String = command_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : PostUpdateRescheduleLoansResponse = webService.updateLoanRescheduleRequest(scheduleId, postUpdateRescheduleLoansRequest, command)
}
```

### Parameters
| **scheduleId** | **kotlin.Long**|  | |
| **postUpdateRescheduleLoansRequest** | [**PostUpdateRescheduleLoansRequest**](PostUpdateRescheduleLoansRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**|  | [optional] |

### Return type

[**PostUpdateRescheduleLoansResponse**](PostUpdateRescheduleLoansResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


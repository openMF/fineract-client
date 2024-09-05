# ReportMailingJobsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createReportMailingJob**](ReportMailingJobsApi.md#createReportMailingJob) | **POST** v1/reportmailingjobs | Create a Report Mailing Job |
| [**deleteReportMailingJob**](ReportMailingJobsApi.md#deleteReportMailingJob) | **DELETE** v1/reportmailingjobs/{entityId} | Delete a Report Mailing Job |
| [**retrieveAllReportMailingJobs**](ReportMailingJobsApi.md#retrieveAllReportMailingJobs) | **GET** v1/reportmailingjobs | List Report Mailing Jobs |
| [**retrieveReportMailingJob**](ReportMailingJobsApi.md#retrieveReportMailingJob) | **GET** v1/reportmailingjobs/{entityId} | Retrieve a Report Mailing Job |
| [**retrieveReportMailingJobTemplate**](ReportMailingJobsApi.md#retrieveReportMailingJobTemplate) | **GET** v1/reportmailingjobs/template | Retrieve Report Mailing Job Details Template |
| [**updateReportMailingJob**](ReportMailingJobsApi.md#updateReportMailingJob) | **PUT** v1/reportmailingjobs/{entityId} | Update a Report Mailing Job  |



Create a Report Mailing Job

Mandatory Fields: name, startDateTime, stretchyReportId, emailRecipients, emailSubject, emailMessage, emailAttachmentFileFormatId, recurrence, isActive  Optional Fields: description, stretchyReportParamMap

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ReportMailingJobsApi::class.java)
val postReportMailingJobsRequest : PostReportMailingJobsRequest =  // PostReportMailingJobsRequest | 

launch(Dispatchers.IO) {
    val result : PostReportMailingJobsResponse = webService.createReportMailingJob(postReportMailingJobsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postReportMailingJobsRequest** | [**PostReportMailingJobsRequest**](PostReportMailingJobsRequest.md)|  | |

### Return type

[**PostReportMailingJobsResponse**](PostReportMailingJobsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Report Mailing Job

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ReportMailingJobsApi::class.java)
val entityId : kotlin.Long = 789 // kotlin.Long | entityId
val body : kotlin.Any = Object // kotlin.Any | 

launch(Dispatchers.IO) {
    val result : DeleteReportMailingJobsResponse = webService.deleteReportMailingJob(entityId, body)
}
```

### Parameters
| **entityId** | **kotlin.Long**| entityId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | |

### Return type

[**DeleteReportMailingJobsResponse**](DeleteReportMailingJobsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List Report Mailing Jobs

Example Requests:  reportmailingjobs

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ReportMailingJobsApi::class.java)
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetReportMailingJobsResponse> = webService.retrieveAllReportMailingJobs(offset, limit, orderBy, sortOrder)
}
```

### Parameters
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |

### Return type

[**kotlin.collections.List&lt;GetReportMailingJobsResponse&gt;**](GetReportMailingJobsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Report Mailing Job

Example Requests:  reportmailingjobs/1   reportmailingjobs/1?template&#x3D;true

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ReportMailingJobsApi::class.java)
val entityId : kotlin.Long = 789 // kotlin.Long | entityId

launch(Dispatchers.IO) {
    val result : GetReportMailingJobsResponse = webService.retrieveReportMailingJob(entityId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.Long**| entityId | |

### Return type

[**GetReportMailingJobsResponse**](GetReportMailingJobsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Report Mailing Job Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for report mailing job applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  reportmailingjobs/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ReportMailingJobsApi::class.java)

launch(Dispatchers.IO) {
    val result : GetReportMailingJobsTemplate = webService.retrieveReportMailingJobTemplate()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetReportMailingJobsTemplate**](GetReportMailingJobsTemplate.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Report Mailing Job 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ReportMailingJobsApi::class.java)
val entityId : kotlin.Long = 789 // kotlin.Long | entityId
val putReportMailingJobsRequest : PutReportMailingJobsRequest =  // PutReportMailingJobsRequest | 

launch(Dispatchers.IO) {
    val result : PutReportMailingJobsResponse = webService.updateReportMailingJob(entityId, putReportMailingJobsRequest)
}
```

### Parameters
| **entityId** | **kotlin.Long**| entityId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putReportMailingJobsRequest** | [**PutReportMailingJobsRequest**](PutReportMailingJobsRequest.md)|  | |

### Return type

[**PutReportMailingJobsResponse**](PutReportMailingJobsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


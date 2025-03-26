# SCHEDULERJOBApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**executeJob**](SCHEDULERJOBApi.md#executeJob) | **POST** v1/jobs/{jobId} | Run a Job |
| [**retrieveAll8**](SCHEDULERJOBApi.md#retrieveAll8) | **GET** v1/jobs | Retrieve Scheduler Jobs |
| [**retrieveHistory**](SCHEDULERJOBApi.md#retrieveHistory) | **GET** v1/jobs/{jobId}/runhistory | Retrieve Job Run History |
| [**retrieveOne5**](SCHEDULERJOBApi.md#retrieveOne5) | **GET** v1/jobs/{jobId} | Retrieve a Job |
| [**updateJobDetail**](SCHEDULERJOBApi.md#updateJobDetail) | **PUT** v1/jobs/{jobId} | Update a Job |



Run a Job

Manually Execute Specific Job.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SCHEDULERJOBApi::class.java)
val jobId : kotlin.Long = 789 // kotlin.Long | jobId
val command : kotlin.String = command_example // kotlin.String | command
val executeJobRequest : ExecuteJobRequest =  // ExecuteJobRequest | 

launch(Dispatchers.IO) {
    webService.executeJob(jobId, command, executeJobRequest)
}
```

### Parameters
| **jobId** | **kotlin.Long**| jobId | |
| **command** | **kotlin.String**| command | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **executeJobRequest** | [**ExecuteJobRequest**](ExecuteJobRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


Retrieve Scheduler Jobs

Returns the list of jobs.  Example Requests:  jobs

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SCHEDULERJOBApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetJobsResponse> = webService.retrieveAll8()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetJobsResponse&gt;**](GetJobsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Job Run History

Example Requests:  jobs/5/runhistory?offset&#x3D;0&amp;limit&#x3D;200

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SCHEDULERJOBApi::class.java)
val jobId : kotlin.Long = 789 // kotlin.Long | jobId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder

launch(Dispatchers.IO) {
    val result : GetJobsJobIDJobRunHistoryResponse = webService.retrieveHistory(jobId, offset, limit, orderBy, sortOrder)
}
```

### Parameters
| **jobId** | **kotlin.Long**| jobId | |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |

### Return type

[**GetJobsJobIDJobRunHistoryResponse**](GetJobsJobIDJobRunHistoryResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Job

Returns the details of a Job.  Example Requests:  jobs/5

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SCHEDULERJOBApi::class.java)
val jobId : kotlin.Long = 789 // kotlin.Long | jobId

launch(Dispatchers.IO) {
    val result : GetJobsResponse = webService.retrieveOne5(jobId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **kotlin.Long**| jobId | |

### Return type

[**GetJobsResponse**](GetJobsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Job

Updates the details of a job.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SCHEDULERJOBApi::class.java)
val jobId : kotlin.Long = 789 // kotlin.Long | jobId
val putJobsJobIDRequest : PutJobsJobIDRequest =  // PutJobsJobIDRequest | 

launch(Dispatchers.IO) {
    webService.updateJobDetail(jobId, putJobsJobIDRequest)
}
```

### Parameters
| **jobId** | **kotlin.Long**| jobId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putJobsJobIDRequest** | [**PutJobsJobIDRequest**](PutJobsJobIDRequest.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


# BusinessStepConfigurationApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieveAllAvailableBusinessStep**](BusinessStepConfigurationApi.md#retrieveAllAvailableBusinessStep) | **GET** v1/jobs/{jobName}/available-steps | List Business Step Configurations for a Job |
| [**retrieveAllConfiguredBusinessJobs**](BusinessStepConfigurationApi.md#retrieveAllConfiguredBusinessJobs) | **GET** v1/jobs/names | List Business Jobs |
| [**retrieveAllConfiguredBusinessStep**](BusinessStepConfigurationApi.md#retrieveAllConfiguredBusinessStep) | **GET** v1/jobs/{jobName}/steps | List Business Step Configurations for a Job |
| [**updateJobBusinessStepConfig**](BusinessStepConfigurationApi.md#updateJobBusinessStepConfig) | **PUT** v1/jobs/{jobName}/steps | List Business Step Configurations for a Job |



List Business Step Configurations for a Job

Returns the available Business Steps for a job

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(BusinessStepConfigurationApi::class.java)
val jobName : kotlin.String = jobName_example // kotlin.String | jobName

launch(Dispatchers.IO) {
    val result : GetBusinessStepConfigResponse = webService.retrieveAllAvailableBusinessStep(jobName)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobName** | **kotlin.String**| jobName | |

### Return type

[**GetBusinessStepConfigResponse**](GetBusinessStepConfigResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Business Jobs

Returns the configured Business Jobs

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(BusinessStepConfigurationApi::class.java)

launch(Dispatchers.IO) {
    val result : GetBusinessJobConfigResponse = webService.retrieveAllConfiguredBusinessJobs()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetBusinessJobConfigResponse**](GetBusinessJobConfigResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Business Step Configurations for a Job

Returns the configured Business Steps for a job

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(BusinessStepConfigurationApi::class.java)
val jobName : kotlin.String = jobName_example // kotlin.String | jobName

launch(Dispatchers.IO) {
    val result : GetBusinessStepConfigResponse = webService.retrieveAllConfiguredBusinessStep(jobName)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobName** | **kotlin.String**| jobName | |

### Return type

[**GetBusinessStepConfigResponse**](GetBusinessStepConfigResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Business Step Configurations for a Job

Updates the Business steps execution order for a job

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(BusinessStepConfigurationApi::class.java)
val jobName : kotlin.String = jobName_example // kotlin.String | jobName
val updateBusinessStepConfigRequest : UpdateBusinessStepConfigRequest =  // UpdateBusinessStepConfigRequest | 

launch(Dispatchers.IO) {
    webService.updateJobBusinessStepConfig(jobName, updateBusinessStepConfigRequest)
}
```

### Parameters
| **jobName** | **kotlin.String**| jobName | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateBusinessStepConfigRequest** | [**UpdateBusinessStepConfigRequest**](UpdateBusinessStepConfigRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


# InlineJobApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**executeInlineJob**](InlineJobApi.md#executeInlineJob) | **POST** v1/jobs/{jobName}/inline | Starts an inline Job |



Starts an inline Job

Starts an inline Job

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InlineJobApi::class.java)
val jobName : kotlin.String = jobName_example // kotlin.String | jobName
val inlineJobRequest : InlineJobRequest =  // InlineJobRequest | 

launch(Dispatchers.IO) {
    val result : InlineJobResponse = webService.executeInlineJob(jobName, inlineJobRequest)
}
```

### Parameters
| **jobName** | **kotlin.String**| jobName | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inlineJobRequest** | [**InlineJobRequest**](InlineJobRequest.md)|  | [optional] |

### Return type

[**InlineJobResponse**](InlineJobResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# BatchAPIApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**handleBatchRequests**](BatchAPIApi.md#handleBatchRequests) | **POST** v1/batches | Batch requests in a single transaction |



Batch requests in a single transaction

The Apache Fineract Batch API is also capable of executing all the requests in a single transaction, by setting a Query Parameter, \&quot;enclosingTransaction&#x3D;true\&quot;. So, if one or more of the requests in a batch returns an erroneous response all of the Data base transactions made by other successful requests will be rolled back.  If there has been a rollback in a transaction then a single response will be provided, with a &#39;400&#39; status code and a body consisting of the error details of the first failed request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(BatchAPIApi::class.java)
val batchRequest : kotlin.collections.List<BatchRequest> =  // kotlin.collections.List<BatchRequest> | 
val enclosingTransaction : kotlin.Boolean = true // kotlin.Boolean | enclosingTransaction

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<BatchResponse> = webService.handleBatchRequests(batchRequest, enclosingTransaction)
}
```

### Parameters
| **batchRequest** | [**kotlin.collections.List&lt;BatchRequest&gt;**](BatchRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **enclosingTransaction** | **kotlin.Boolean**| enclosingTransaction | [optional] [default to false] |

### Return type

[**kotlin.collections.List&lt;BatchResponse&gt;**](BatchResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


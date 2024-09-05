# DelinquencyRangeAndBucketsManagementApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createDelinquencyBucket**](DelinquencyRangeAndBucketsManagementApi.md#createDelinquencyBucket) | **POST** v1/delinquency/buckets | Create Delinquency Bucket |
| [**createDelinquencyRange**](DelinquencyRangeAndBucketsManagementApi.md#createDelinquencyRange) | **POST** v1/delinquency/ranges | Create Delinquency Range |
| [**deleteDelinquencyBucket**](DelinquencyRangeAndBucketsManagementApi.md#deleteDelinquencyBucket) | **DELETE** v1/delinquency/buckets/{delinquencyBucketId} | Delete Delinquency Bucket based on the Id |
| [**deleteDelinquencyRange**](DelinquencyRangeAndBucketsManagementApi.md#deleteDelinquencyRange) | **DELETE** v1/delinquency/ranges/{delinquencyRangeId} | Update Delinquency Range based on the Id |
| [**getDelinquencyBucket**](DelinquencyRangeAndBucketsManagementApi.md#getDelinquencyBucket) | **GET** v1/delinquency/buckets/{delinquencyBucketId} | Retrieve a specific Delinquency Bucket based on the Id |
| [**getDelinquencyBuckets**](DelinquencyRangeAndBucketsManagementApi.md#getDelinquencyBuckets) | **GET** v1/delinquency/buckets | List all Delinquency Buckets |
| [**getDelinquencyRange**](DelinquencyRangeAndBucketsManagementApi.md#getDelinquencyRange) | **GET** v1/delinquency/ranges/{delinquencyRangeId} | Retrieve a specific Delinquency Range based on the Id |
| [**getDelinquencyRanges**](DelinquencyRangeAndBucketsManagementApi.md#getDelinquencyRanges) | **GET** v1/delinquency/ranges | List all Delinquency Ranges |
| [**updateDelinquencyBucket**](DelinquencyRangeAndBucketsManagementApi.md#updateDelinquencyBucket) | **PUT** v1/delinquency/buckets/{delinquencyBucketId} | Update Delinquency Bucket based on the Id |
| [**updateDelinquencyRange**](DelinquencyRangeAndBucketsManagementApi.md#updateDelinquencyRange) | **PUT** v1/delinquency/ranges/{delinquencyRangeId} | Update Delinquency Range based on the Id |



Create Delinquency Bucket

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DelinquencyRangeAndBucketsManagementApi::class.java)
val postDelinquencyBucketRequest : PostDelinquencyBucketRequest =  // PostDelinquencyBucketRequest | 

launch(Dispatchers.IO) {
    val result : PostDelinquencyBucketResponse = webService.createDelinquencyBucket(postDelinquencyBucketRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postDelinquencyBucketRequest** | [**PostDelinquencyBucketRequest**](PostDelinquencyBucketRequest.md)|  | |

### Return type

[**PostDelinquencyBucketResponse**](PostDelinquencyBucketResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Create Delinquency Range

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DelinquencyRangeAndBucketsManagementApi::class.java)
val postDelinquencyRangeRequest : PostDelinquencyRangeRequest =  // PostDelinquencyRangeRequest | 

launch(Dispatchers.IO) {
    val result : PostDelinquencyRangeResponse = webService.createDelinquencyRange(postDelinquencyRangeRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postDelinquencyRangeRequest** | [**PostDelinquencyRangeRequest**](PostDelinquencyRangeRequest.md)|  | |

### Return type

[**PostDelinquencyRangeResponse**](PostDelinquencyRangeResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete Delinquency Bucket based on the Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DelinquencyRangeAndBucketsManagementApi::class.java)
val delinquencyBucketId : kotlin.Long = 789 // kotlin.Long | delinquencyBucketId
val postDelinquencyBucketRequest : PostDelinquencyBucketRequest =  // PostDelinquencyBucketRequest | 

launch(Dispatchers.IO) {
    val result : DeleteDelinquencyBucketResponse = webService.deleteDelinquencyBucket(delinquencyBucketId, postDelinquencyBucketRequest)
}
```

### Parameters
| **delinquencyBucketId** | **kotlin.Long**| delinquencyBucketId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postDelinquencyBucketRequest** | [**PostDelinquencyBucketRequest**](PostDelinquencyBucketRequest.md)|  | |

### Return type

[**DeleteDelinquencyBucketResponse**](DeleteDelinquencyBucketResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update Delinquency Range based on the Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DelinquencyRangeAndBucketsManagementApi::class.java)
val delinquencyRangeId : kotlin.Long = 789 // kotlin.Long | delinquencyRangeId
val postDelinquencyRangeRequest : PostDelinquencyRangeRequest =  // PostDelinquencyRangeRequest | 

launch(Dispatchers.IO) {
    val result : DeleteDelinquencyRangeResponse = webService.deleteDelinquencyRange(delinquencyRangeId, postDelinquencyRangeRequest)
}
```

### Parameters
| **delinquencyRangeId** | **kotlin.Long**| delinquencyRangeId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postDelinquencyRangeRequest** | [**PostDelinquencyRangeRequest**](PostDelinquencyRangeRequest.md)|  | |

### Return type

[**DeleteDelinquencyRangeResponse**](DeleteDelinquencyRangeResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve a specific Delinquency Bucket based on the Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DelinquencyRangeAndBucketsManagementApi::class.java)
val delinquencyBucketId : kotlin.Long = 789 // kotlin.Long | delinquencyBucketId

launch(Dispatchers.IO) {
    val result : GetDelinquencyBucketsResponse = webService.getDelinquencyBucket(delinquencyBucketId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **delinquencyBucketId** | **kotlin.Long**| delinquencyBucketId | |

### Return type

[**GetDelinquencyBucketsResponse**](GetDelinquencyBucketsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List all Delinquency Buckets

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DelinquencyRangeAndBucketsManagementApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetDelinquencyBucketsResponse> = webService.getDelinquencyBuckets()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetDelinquencyBucketsResponse&gt;**](GetDelinquencyBucketsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a specific Delinquency Range based on the Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DelinquencyRangeAndBucketsManagementApi::class.java)
val delinquencyRangeId : kotlin.Long = 789 // kotlin.Long | delinquencyRangeId

launch(Dispatchers.IO) {
    val result : GetDelinquencyRangesResponse = webService.getDelinquencyRange(delinquencyRangeId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **delinquencyRangeId** | **kotlin.Long**| delinquencyRangeId | |

### Return type

[**GetDelinquencyRangesResponse**](GetDelinquencyRangesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List all Delinquency Ranges

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DelinquencyRangeAndBucketsManagementApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetDelinquencyRangesResponse> = webService.getDelinquencyRanges()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetDelinquencyRangesResponse&gt;**](GetDelinquencyRangesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update Delinquency Bucket based on the Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DelinquencyRangeAndBucketsManagementApi::class.java)
val delinquencyBucketId : kotlin.Long = 789 // kotlin.Long | delinquencyBucketId
val postDelinquencyBucketRequest : PostDelinquencyBucketRequest =  // PostDelinquencyBucketRequest | 

launch(Dispatchers.IO) {
    val result : PutDelinquencyBucketResponse = webService.updateDelinquencyBucket(delinquencyBucketId, postDelinquencyBucketRequest)
}
```

### Parameters
| **delinquencyBucketId** | **kotlin.Long**| delinquencyBucketId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postDelinquencyBucketRequest** | [**PostDelinquencyBucketRequest**](PostDelinquencyBucketRequest.md)|  | |

### Return type

[**PutDelinquencyBucketResponse**](PutDelinquencyBucketResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update Delinquency Range based on the Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DelinquencyRangeAndBucketsManagementApi::class.java)
val delinquencyRangeId : kotlin.Long = 789 // kotlin.Long | delinquencyRangeId
val postDelinquencyRangeRequest : PostDelinquencyRangeRequest =  // PostDelinquencyRangeRequest | 

launch(Dispatchers.IO) {
    val result : PutDelinquencyRangeResponse = webService.updateDelinquencyRange(delinquencyRangeId, postDelinquencyRangeRequest)
}
```

### Parameters
| **delinquencyRangeId** | **kotlin.Long**| delinquencyRangeId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postDelinquencyRangeRequest** | [**PostDelinquencyRangeRequest**](PostDelinquencyRangeRequest.md)|  | |

### Return type

[**PutDelinquencyRangeResponse**](PutDelinquencyRangeResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


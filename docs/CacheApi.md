# CacheApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieveAll4**](CacheApi.md#retrieveAll4) | **GET** v1/caches | Retrieve Cache Types |
| [**switchCache**](CacheApi.md#switchCache) | **PUT** v1/caches | Switch Cache |



Retrieve Cache Types

Returns the list of caches.  Example Requests:  caches

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CacheApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetCachesResponse> = webService.retrieveAll4()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetCachesResponse&gt;**](GetCachesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Switch Cache

Switches the cache to chosen one.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CacheApi::class.java)
val putCachesRequest : PutCachesRequest =  // PutCachesRequest | 

launch(Dispatchers.IO) {
    val result : PutCachesResponse = webService.switchCache(putCachesRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putCachesRequest** | [**PutCachesRequest**](PutCachesRequest.md)|  | |

### Return type

[**PutCachesResponse**](PutCachesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


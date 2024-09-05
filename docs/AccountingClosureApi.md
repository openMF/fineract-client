# AccountingClosureApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createGLClosure**](AccountingClosureApi.md#createGLClosure) | **POST** v1/glclosures | Create an Accounting Closure |
| [**deleteGLClosure**](AccountingClosureApi.md#deleteGLClosure) | **DELETE** v1/glclosures/{glClosureId} | Delete an accounting closure |
| [**retreiveClosure**](AccountingClosureApi.md#retreiveClosure) | **GET** v1/glclosures/{glClosureId} | Retrieve an Accounting Closure |
| [**retrieveAllClosures**](AccountingClosureApi.md#retrieveAllClosures) | **GET** v1/glclosures | List Accounting closures |
| [**updateGLClosure**](AccountingClosureApi.md#updateGLClosure) | **PUT** v1/glclosures/{glClosureId} | Update an Accounting closure |



Create an Accounting Closure

Mandatory Fields officeId,closingDate

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountingClosureApi::class.java)
val postGlClosuresRequest : PostGlClosuresRequest =  // PostGlClosuresRequest | 

launch(Dispatchers.IO) {
    val result : PostGlClosuresResponse = webService.createGLClosure(postGlClosuresRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postGlClosuresRequest** | [**PostGlClosuresRequest**](PostGlClosuresRequest.md)|  | |

### Return type

[**PostGlClosuresResponse**](PostGlClosuresResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete an accounting closure

Note: Only the latest accounting closure associated with a branch may be deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountingClosureApi::class.java)
val glClosureId : kotlin.Long = 789 // kotlin.Long | glclosureId

launch(Dispatchers.IO) {
    val result : DeleteGlClosuresResponse = webService.deleteGLClosure(glClosureId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **glClosureId** | **kotlin.Long**| glclosureId | |

### Return type

[**DeleteGlClosuresResponse**](DeleteGlClosuresResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve an Accounting Closure

Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountingClosureApi::class.java)
val glClosureId : kotlin.Long = 789 // kotlin.Long | glClosureId

launch(Dispatchers.IO) {
    val result : GetGlClosureResponse = webService.retreiveClosure(glClosureId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **glClosureId** | **kotlin.Long**| glClosureId | |

### Return type

[**GetGlClosureResponse**](GetGlClosureResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Accounting closures

Example Requests:  glclosures

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountingClosureApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetGlClosureResponse> = webService.retrieveAllClosures(officeId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **officeId** | **kotlin.Long**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;GetGlClosureResponse&gt;**](GetGlClosureResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update an Accounting closure

Once an accounting closure is created, only the comments associated with it may be edited

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountingClosureApi::class.java)
val glClosureId : kotlin.Long = 789 // kotlin.Long | glClosureId
val putGlClosuresRequest : PutGlClosuresRequest =  // PutGlClosuresRequest | 

launch(Dispatchers.IO) {
    val result : PutGlClosuresResponse = webService.updateGLClosure(glClosureId, putGlClosuresRequest)
}
```

### Parameters
| **glClosureId** | **kotlin.Long**| glClosureId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putGlClosuresRequest** | [**PutGlClosuresRequest**](PutGlClosuresRequest.md)|  | [optional] |

### Return type

[**PutGlClosuresResponse**](PutGlClosuresResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


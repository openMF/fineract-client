# LikelihoodApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieve**](LikelihoodApi.md#retrieve) | **GET** v1/likelihood/{ppiName}/{likelihoodId} |  |
| [**retrieveAll11**](LikelihoodApi.md#retrieveAll11) | **GET** v1/likelihood/{ppiName} |  |
| [**update4**](LikelihoodApi.md#update4) | **PUT** v1/likelihood/{ppiName}/{likelihoodId} |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LikelihoodApi::class.java)
val likelihoodId : kotlin.Long = 789 // kotlin.Long | 
val ppiName : kotlin.String = ppiName_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieve(likelihoodId, ppiName)
}
```

### Parameters
| **likelihoodId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ppiName** | **kotlin.String**|  | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LikelihoodApi::class.java)
val ppiName : kotlin.String = ppiName_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveAll11(ppiName)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ppiName** | **kotlin.String**|  | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LikelihoodApi::class.java)
val likelihoodId : kotlin.Long = 789 // kotlin.Long | 
val ppiName : kotlin.String = ppiName_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.update4(likelihoodId, ppiName, body)
}
```

### Parameters
| **likelihoodId** | **kotlin.Long**|  | |
| **ppiName** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# SelfDividendApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createDividendDetail**](SelfDividendApi.md#createDividendDetail) | **POST** v1/shareproduct/{productId}/dividend |  |
| [**deleteDividendDetail**](SelfDividendApi.md#deleteDividendDetail) | **DELETE** v1/shareproduct/{productId}/dividend/{dividendId} |  |
| [**retrieveAll39**](SelfDividendApi.md#retrieveAll39) | **GET** v1/shareproduct/{productId}/dividend |  |
| [**retrieveDividendDetails**](SelfDividendApi.md#retrieveDividendDetails) | **GET** v1/shareproduct/{productId}/dividend/{dividendId} |  |
| [**updateDividendDetail**](SelfDividendApi.md#updateDividendDetail) | **PUT** v1/shareproduct/{productId}/dividend/{dividendId} |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfDividendApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.createDividendDetail(productId, body)
}
```

### Parameters
| **productId** | **kotlin.Long**|  | |
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




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfDividendApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | 
val dividendId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.deleteDividendDetail(productId, dividendId)
}
```

### Parameters
| **productId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dividendId** | **kotlin.Long**|  | |

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
val webService = apiClient.createWebservice(SelfDividendApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | 
val offset : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val orderBy : kotlin.String = orderBy_example // kotlin.String | 
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | 
val status : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveAll39(productId, offset, limit, orderBy, sortOrder, status)
}
```

### Parameters
| **productId** | **kotlin.Long**|  | |
| **offset** | **kotlin.Int**|  | [optional] |
| **limit** | **kotlin.Int**|  | [optional] |
| **orderBy** | **kotlin.String**|  | [optional] |
| **sortOrder** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | **kotlin.Int**|  | [optional] |

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
val webService = apiClient.createWebservice(SelfDividendApi::class.java)
val dividendId : kotlin.Long = 789 // kotlin.Long | 
val productId : kotlin.Long = 789 // kotlin.Long | 
val offset : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val orderBy : kotlin.String = orderBy_example // kotlin.String | 
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | 
val accountNo : kotlin.String = accountNo_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveDividendDetails(dividendId, productId, offset, limit, orderBy, sortOrder, accountNo)
}
```

### Parameters
| **dividendId** | **kotlin.Long**|  | |
| **productId** | **kotlin.Long**|  | |
| **offset** | **kotlin.Int**|  | [optional] |
| **limit** | **kotlin.Int**|  | [optional] |
| **orderBy** | **kotlin.String**|  | [optional] |
| **sortOrder** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountNo** | **kotlin.String**|  | [optional] |

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
val webService = apiClient.createWebservice(SelfDividendApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | 
val dividendId : kotlin.Long = 789 // kotlin.Long | 
val command : kotlin.String = command_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.updateDividendDetail(productId, dividendId, command, body)
}
```

### Parameters
| **productId** | **kotlin.Long**|  | |
| **dividendId** | **kotlin.Long**|  | |
| **command** | **kotlin.String**|  | [optional] |
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


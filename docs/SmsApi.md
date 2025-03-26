# SMSApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**create2**](SMSApi.md#create2) | **POST** v1/sms |  |
| [**delete6**](SMSApi.md#delete6) | **DELETE** v1/sms/{resourceId} |  |
| [**retrieveAll10**](SMSApi.md#retrieveAll10) | **GET** v1/sms |  |
| [**retrieveAllSmsByStatus**](SMSApi.md#retrieveAllSmsByStatus) | **GET** v1/sms/{campaignId}/messageByStatus |  |
| [**retrieveOne6**](SMSApi.md#retrieveOne6) | **GET** v1/sms/{resourceId} |  |
| [**update3**](SMSApi.md#update3) | **PUT** v1/sms/{resourceId} |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SMSApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.create2(body)
}
```

### Parameters
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
val webService = apiClient.createWebservice(SMSApi::class.java)
val resourceId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.delete6(resourceId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resourceId** | **kotlin.Long**|  | |

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
val webService = apiClient.createWebservice(SMSApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveAll10()
}
```

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(SMSApi::class.java)
val campaignId : kotlin.Long = 789 // kotlin.Long | 
val status : kotlin.Long = 789 // kotlin.Long | 
val fromDate : kotlin.Any = Object // kotlin.Any | 
val toDate : kotlin.Any = Object // kotlin.Any | 
val locale : kotlin.String = locale_example // kotlin.String | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val offset : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val orderBy : kotlin.String = orderBy_example // kotlin.String | 
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveAllSmsByStatus(campaignId, status, fromDate, toDate, locale, dateFormat, offset, limit, orderBy, sortOrder)
}
```

### Parameters
| **campaignId** | **kotlin.Long**|  | |
| **status** | **kotlin.Long**|  | [optional] |
| **fromDate** | [**kotlin.Any**](.md)|  | [optional] |
| **toDate** | [**kotlin.Any**](.md)|  | [optional] |
| **locale** | **kotlin.String**|  | [optional] |
| **dateFormat** | **kotlin.String**|  | [optional] |
| **offset** | **kotlin.Int**|  | [optional] |
| **limit** | **kotlin.Int**|  | [optional] |
| **orderBy** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**|  | [optional] |

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
val webService = apiClient.createWebservice(SMSApi::class.java)
val resourceId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveOne6(resourceId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resourceId** | **kotlin.Long**|  | |

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
val webService = apiClient.createWebservice(SMSApi::class.java)
val resourceId : kotlin.Long = 789 // kotlin.Long | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.update3(resourceId, body)
}
```

### Parameters
| **resourceId** | **kotlin.Long**|  | |
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


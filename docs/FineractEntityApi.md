# FineractEntityApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createMap**](FineractEntityApi.md#createMap) | **POST** v1/entitytoentitymapping/{relId} |  |
| [**delete4**](FineractEntityApi.md#delete4) | **DELETE** v1/entitytoentitymapping/{mapId} |  |
| [**getEntityToEntityMappings**](FineractEntityApi.md#getEntityToEntityMappings) | **GET** v1/entitytoentitymapping/{mapId}/{fromId}/{toId} |  |
| [**retrieveAll7**](FineractEntityApi.md#retrieveAll7) | **GET** v1/entitytoentitymapping |  |
| [**retrieveOne4**](FineractEntityApi.md#retrieveOne4) | **GET** v1/entitytoentitymapping/{mapId} |  |
| [**updateMap**](FineractEntityApi.md#updateMap) | **PUT** v1/entitytoentitymapping/{mapId} |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FineractEntityApi::class.java)
val relId : kotlin.Long = 789 // kotlin.Long | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.createMap(relId, body)
}
```

### Parameters
| **relId** | **kotlin.Long**|  | |
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
val webService = apiClient.createWebservice(FineractEntityApi::class.java)
val mapId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.delete4(mapId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mapId** | **kotlin.Long**|  | |

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
val webService = apiClient.createWebservice(FineractEntityApi::class.java)
val mapId : kotlin.Long = 789 // kotlin.Long | 
val fromId : kotlin.Long = 789 // kotlin.Long | 
val toId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getEntityToEntityMappings(mapId, fromId, toId)
}
```

### Parameters
| **mapId** | **kotlin.Long**|  | |
| **fromId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **toId** | **kotlin.Long**|  | |

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
val webService = apiClient.createWebservice(FineractEntityApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveAll7()
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
val webService = apiClient.createWebservice(FineractEntityApi::class.java)
val mapId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveOne4(mapId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **mapId** | **kotlin.Long**|  | |

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
val webService = apiClient.createWebservice(FineractEntityApi::class.java)
val mapId : kotlin.Long = 789 // kotlin.Long | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.updateMap(mapId, body)
}
```

### Parameters
| **mapId** | **kotlin.Long**|  | |
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


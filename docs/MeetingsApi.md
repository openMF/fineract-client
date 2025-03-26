# MeetingsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createMeeting**](MeetingsApi.md#createMeeting) | **POST** v1/{entityType}/{entityId}/meetings |  |
| [**deleteMeeting**](MeetingsApi.md#deleteMeeting) | **DELETE** v1/{entityType}/{entityId}/meetings/{meetingId} |  |
| [**performMeetingCommands**](MeetingsApi.md#performMeetingCommands) | **POST** v1/{entityType}/{entityId}/meetings/{meetingId} |  |
| [**retrieveMeeting**](MeetingsApi.md#retrieveMeeting) | **GET** v1/{entityType}/{entityId}/meetings/{meetingId} |  |
| [**retrieveMeetings**](MeetingsApi.md#retrieveMeetings) | **GET** v1/{entityType}/{entityId}/meetings |  |
| [**template11**](MeetingsApi.md#template11) | **GET** v1/{entityType}/{entityId}/meetings/template |  |
| [**updateMeeting**](MeetingsApi.md#updateMeeting) | **PUT** v1/{entityType}/{entityId}/meetings/{meetingId} |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(MeetingsApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | 
val entityId : kotlin.Long = 789 // kotlin.Long | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.createMeeting(entityType, entityId, body)
}
```

### Parameters
| **entityType** | **kotlin.String**|  | |
| **entityId** | **kotlin.Long**|  | |
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
val webService = apiClient.createWebservice(MeetingsApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | 
val entityId : kotlin.Long = 789 // kotlin.Long | 
val meetingId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.deleteMeeting(entityType, entityId, meetingId)
}
```

### Parameters
| **entityType** | **kotlin.String**|  | |
| **entityId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **meetingId** | **kotlin.Long**|  | |

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
val webService = apiClient.createWebservice(MeetingsApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | 
val entityId : kotlin.Long = 789 // kotlin.Long | 
val meetingId : kotlin.Long = 789 // kotlin.Long | 
val command : kotlin.String = command_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.performMeetingCommands(entityType, entityId, meetingId, command, body)
}
```

### Parameters
| **entityType** | **kotlin.String**|  | |
| **entityId** | **kotlin.Long**|  | |
| **meetingId** | **kotlin.Long**|  | |
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




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(MeetingsApi::class.java)
val meetingId : kotlin.Long = 789 // kotlin.Long | 
val entityType : kotlin.String = entityType_example // kotlin.String | 
val entityId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveMeeting(meetingId, entityType, entityId)
}
```

### Parameters
| **meetingId** | **kotlin.Long**|  | |
| **entityType** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.Long**|  | |

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
val webService = apiClient.createWebservice(MeetingsApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | 
val entityId : kotlin.Long = 789 // kotlin.Long | 
val limit : kotlin.Int = 56 // kotlin.Int | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveMeetings(entityType, entityId, limit)
}
```

### Parameters
| **entityType** | **kotlin.String**|  | |
| **entityId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**|  | [optional] |

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
val webService = apiClient.createWebservice(MeetingsApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | 
val entityId : kotlin.Long = 789 // kotlin.Long | 
val calendarId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.template11(entityType, entityId, calendarId)
}
```

### Parameters
| **entityType** | **kotlin.String**|  | |
| **entityId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **calendarId** | **kotlin.Long**|  | [optional] |

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
val webService = apiClient.createWebservice(MeetingsApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | 
val entityId : kotlin.Long = 789 // kotlin.Long | 
val meetingId : kotlin.Long = 789 // kotlin.Long | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.updateMeeting(entityType, entityId, meetingId, body)
}
```

### Parameters
| **entityType** | **kotlin.String**|  | |
| **entityId** | **kotlin.Long**|  | |
| **meetingId** | **kotlin.Long**|  | |
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


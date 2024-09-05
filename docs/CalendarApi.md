# CalendarApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCalendar**](CalendarApi.md#createCalendar) | **POST** v1/{entityType}/{entityId}/calendars |  |
| [**deleteCalendar**](CalendarApi.md#deleteCalendar) | **DELETE** v1/{entityType}/{entityId}/calendars/{calendarId} |  |
| [**retrieveCalendar**](CalendarApi.md#retrieveCalendar) | **GET** v1/{entityType}/{entityId}/calendars/{calendarId} |  |
| [**retrieveCalendarsByEntity**](CalendarApi.md#retrieveCalendarsByEntity) | **GET** v1/{entityType}/{entityId}/calendars |  |
| [**retrieveNewCalendarDetails**](CalendarApi.md#retrieveNewCalendarDetails) | **GET** v1/{entityType}/{entityId}/calendars/template |  |
| [**updateCalendar**](CalendarApi.md#updateCalendar) | **PUT** v1/{entityType}/{entityId}/calendars/{calendarId} |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CalendarApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | 
val entityId : kotlin.Long = 789 // kotlin.Long | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.createCalendar(entityType, entityId, body)
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
val webService = apiClient.createWebservice(CalendarApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | 
val entityId : kotlin.Long = 789 // kotlin.Long | 
val calendarId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.deleteCalendar(entityType, entityId, calendarId)
}
```

### Parameters
| **entityType** | **kotlin.String**|  | |
| **entityId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **calendarId** | **kotlin.Long**|  | |

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
val webService = apiClient.createWebservice(CalendarApi::class.java)
val calendarId : kotlin.Long = 789 // kotlin.Long | 
val entityType : kotlin.String = entityType_example // kotlin.String | 
val entityId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveCalendar(calendarId, entityType, entityId)
}
```

### Parameters
| **calendarId** | **kotlin.Long**|  | |
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
val webService = apiClient.createWebservice(CalendarApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | 
val entityId : kotlin.Long = 789 // kotlin.Long | 
val calendarType : kotlin.String = calendarType_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveCalendarsByEntity(entityType, entityId, calendarType)
}
```

### Parameters
| **entityType** | **kotlin.String**|  | |
| **entityId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **calendarType** | **kotlin.String**|  | [optional] [default to &quot;all&quot;] |

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
val webService = apiClient.createWebservice(CalendarApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | 
val entityId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveNewCalendarDetails(entityType, entityId)
}
```

### Parameters
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
val webService = apiClient.createWebservice(CalendarApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | 
val entityId : kotlin.Long = 789 // kotlin.Long | 
val calendarId : kotlin.Long = 789 // kotlin.Long | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.updateCalendar(entityType, entityId, calendarId, body)
}
```

### Parameters
| **entityType** | **kotlin.String**|  | |
| **entityId** | **kotlin.Long**|  | |
| **calendarId** | **kotlin.Long**|  | |
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


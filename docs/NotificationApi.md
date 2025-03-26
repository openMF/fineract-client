# NotificationApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAllNotifications**](NotificationApi.md#getAllNotifications) | **GET** v1/notifications |  |
| [**update5**](NotificationApi.md#update5) | **PUT** v1/notifications |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(NotificationApi::class.java)
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val limit : kotlin.Int = 56 // kotlin.Int | limit
val offset : kotlin.Int = 56 // kotlin.Int | offset
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder
val isRead : kotlin.Boolean = true // kotlin.Boolean | isRead

launch(Dispatchers.IO) {
    val result : GetNotificationsResponse = webService.getAllNotifications(orderBy, limit, offset, sortOrder, isRead)
}
```

### Parameters
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isRead** | **kotlin.Boolean**| isRead | [optional] |

### Return type

[**GetNotificationsResponse**](GetNotificationsResponse.md)

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
val webService = apiClient.createWebservice(NotificationApi::class.java)

launch(Dispatchers.IO) {
    webService.update5()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


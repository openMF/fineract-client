# BusinessDateManagementApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getBusinessDate**](BusinessDateManagementApi.md#getBusinessDate) | **GET** v1/businessdate/{type} | Retrieve a specific Business date |
| [**getBusinessDates**](BusinessDateManagementApi.md#getBusinessDates) | **GET** v1/businessdate | List all business dates |
| [**updateBusinessDate**](BusinessDateManagementApi.md#updateBusinessDate) | **POST** v1/businessdate | Update Business Date |



Retrieve a specific Business date

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(BusinessDateManagementApi::class.java)
val type : kotlin.String = type_example // kotlin.String | type

launch(Dispatchers.IO) {
    val result : BusinessDateResponse = webService.getBusinessDate(type)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **kotlin.String**| type | |

### Return type

[**BusinessDateResponse**](BusinessDateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List all business dates

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(BusinessDateManagementApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<BusinessDateResponse> = webService.getBusinessDates()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;BusinessDateResponse&gt;**](BusinessDateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update Business Date

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(BusinessDateManagementApi::class.java)
val businessDateRequest : BusinessDateRequest =  // BusinessDateRequest | 

launch(Dispatchers.IO) {
    val result : BusinessDateResponse = webService.updateBusinessDate(businessDateRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **businessDateRequest** | [**BusinessDateRequest**](BusinessDateRequest.md)|  | |

### Return type

[**BusinessDateResponse**](BusinessDateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


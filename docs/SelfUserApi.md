# SelfUserApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**update24**](SelfUserApi.md#update24) | **PUT** v1/self/user | Update User |



Update User

This API can be used by Self Service user to update their own user information. Currently, \&quot;password\&quot; and \&quot;repeatPassword\&quot; are the only parameters accepted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfUserApi::class.java)
val putSelfUserRequest : PutSelfUserRequest =  // PutSelfUserRequest | 

launch(Dispatchers.IO) {
    val result : PutSelfUserResponse = webService.update24(putSelfUserRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putSelfUserRequest** | [**PutSelfUserRequest**](PutSelfUserRequest.md)|  | |

### Return type

[**PutSelfUserResponse**](PutSelfUserResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


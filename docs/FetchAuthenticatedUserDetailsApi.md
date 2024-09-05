# FetchAuthenticatedUserDetailsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**fetchAuthenticatedUserData**](FetchAuthenticatedUserDetailsApi.md#fetchAuthenticatedUserData) | **GET** v1/userdetails | Fetch authenticated user details  |



Fetch authenticated user details 

checks the Authentication and returns the set roles and permissions allowed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FetchAuthenticatedUserDetailsApi::class.java)

launch(Dispatchers.IO) {
    val result : GetUserDetailsResponse = webService.fetchAuthenticatedUserData()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetUserDetailsResponse**](GetUserDetailsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


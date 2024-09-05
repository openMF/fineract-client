# SelfUserDetailsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**fetchAuthenticatedUserData1**](SelfUserDetailsApi.md#fetchAuthenticatedUserData1) | **GET** v1/self/userdetails | Fetch authenticated user details |



Fetch authenticated user details

Checks the Authentication and returns the set roles and permissions allowed  For more info visit this link - https://fineract.apache.org/legacy-docs/apiLive.htm#selfoauth

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfUserDetailsApi::class.java)

launch(Dispatchers.IO) {
    val result : GetSelfUserDetailsResponse = webService.fetchAuthenticatedUserData1()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSelfUserDetailsResponse**](GetSelfUserDetailsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# SelfAuthenticationApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**authenticate1**](SelfAuthenticationApi.md#authenticate1) | **POST** v1/self/authentication | Verify authentication |



Verify authentication

Authenticates the credentials provided and returns the set roles and permissions allowed.  Please visit this link for more info - https://fineract.apache.org/legacy-docs/apiLive.htm#selfbasicauth

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfAuthenticationApi::class.java)
val postAuthenticationRequest : PostAuthenticationRequest =  // PostAuthenticationRequest | 

launch(Dispatchers.IO) {
    val result : PostSelfAuthenticationResponse = webService.authenticate1(postAuthenticationRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postAuthenticationRequest** | [**PostAuthenticationRequest**](PostAuthenticationRequest.md)|  | |

### Return type

[**PostSelfAuthenticationResponse**](PostSelfAuthenticationResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


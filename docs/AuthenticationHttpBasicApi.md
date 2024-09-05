# AuthenticationHTTPBasicApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**authenticate**](AuthenticationHTTPBasicApi.md#authenticate) | **POST** v1/authentication | Verify authentication |



Verify authentication

Authenticates the credentials provided and returns the set roles and permissions allowed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AuthenticationHTTPBasicApi::class.java)
val postAuthenticationRequest : PostAuthenticationRequest =  // PostAuthenticationRequest | 
val returnClientList : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : PostAuthenticationResponse = webService.authenticate(postAuthenticationRequest, returnClientList)
}
```

### Parameters
| **postAuthenticationRequest** | [**PostAuthenticationRequest**](PostAuthenticationRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **returnClientList** | **kotlin.Boolean**|  | [optional] [default to false] |

### Return type

[**PostAuthenticationResponse**](PostAuthenticationResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


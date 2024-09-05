# PasswordPreferencesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieve1**](PasswordPreferencesApi.md#retrieve1) | **GET** v1/passwordpreferences |  |
| [**template21**](PasswordPreferencesApi.md#template21) | **GET** v1/passwordpreferences/template | List Application Password validation policies |
| [**update25**](PasswordPreferencesApi.md#update25) | **PUT** v1/passwordpreferences | Update password preferences |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(PasswordPreferencesApi::class.java)

launch(Dispatchers.IO) {
    val result : GetPasswordPreferencesTemplateResponse = webService.retrieve1()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetPasswordPreferencesTemplateResponse**](GetPasswordPreferencesTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Application Password validation policies

ARGUMENTS Example Requests:  passwordpreferences

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(PasswordPreferencesApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetPasswordPreferencesTemplateResponse> = webService.template21()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetPasswordPreferencesTemplateResponse&gt;**](GetPasswordPreferencesTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update password preferences

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(PasswordPreferencesApi::class.java)
val putPasswordPreferencesTemplateRequest : PutPasswordPreferencesTemplateRequest =  // PutPasswordPreferencesTemplateRequest | 

launch(Dispatchers.IO) {
    webService.update25(putPasswordPreferencesTemplateRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putPasswordPreferencesTemplateRequest** | [**PutPasswordPreferencesTemplateRequest**](PutPasswordPreferencesTemplateRequest.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


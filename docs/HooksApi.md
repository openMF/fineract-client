# HooksApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createHook**](HooksApi.md#createHook) | **POST** v1/hooks | Create a Hook |
| [**deleteHook**](HooksApi.md#deleteHook) | **DELETE** v1/hooks/{hookId} | Delete a Hook |
| [**retrieveHook**](HooksApi.md#retrieveHook) | **GET** v1/hooks/{hookId} | Retrieve a Hook |
| [**retrieveHooks**](HooksApi.md#retrieveHooks) | **GET** v1/hooks | Retrieve Hooks |
| [**template3**](HooksApi.md#template3) | **GET** v1/hooks/template | Retrieve Hooks Template |
| [**updateHook**](HooksApi.md#updateHook) | **PUT** v1/hooks/{hookId} | Update a Hook |



Create a Hook

The following parameters can be passed for the creation of a hook :-  name - string - Required. The name of the template that is being called. (See /hooks/template for the list of valid hook names.)  isActive - boolean - Determines whether the hook is actually triggered.  events - array - Determines what events the hook is triggered for.  config - hash - Required. Key/value pairs to provide settings for this hook. These settings vary between the templates.  templateId - Optional. The UGD template ID associated with the same entity (client or loan).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(HooksApi::class.java)
val postHookRequest : PostHookRequest =  // PostHookRequest | 

launch(Dispatchers.IO) {
    val result : PostHookResponse = webService.createHook(postHookRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postHookRequest** | [**PostHookRequest**](PostHookRequest.md)|  | |

### Return type

[**PostHookResponse**](PostHookResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Hook

Deletes a hook.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(HooksApi::class.java)
val hookId : kotlin.Long = 789 // kotlin.Long | hookId

launch(Dispatchers.IO) {
    val result : DeleteHookResponse = webService.deleteHook(hookId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hookId** | **kotlin.Long**| hookId | |

### Return type

[**DeleteHookResponse**](DeleteHookResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Hook

Returns the details of a Hook.  Example Requests:  hooks/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(HooksApi::class.java)
val hookId : kotlin.Long = 789 // kotlin.Long | hookId

launch(Dispatchers.IO) {
    val result : GetHookResponse = webService.retrieveHook(hookId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hookId** | **kotlin.Long**| hookId | |

### Return type

[**GetHookResponse**](GetHookResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Hooks

Returns the list of hooks.  Example Requests:  hooks

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(HooksApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetHookResponse> = webService.retrieveHooks()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetHookResponse&gt;**](GetHookResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Hooks Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  hooks/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(HooksApi::class.java)

launch(Dispatchers.IO) {
    val result : GetHookTemplateResponse = webService.template3()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetHookTemplateResponse**](GetHookTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Hook

Updates the details of a hook.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(HooksApi::class.java)
val hookId : kotlin.Long = 789 // kotlin.Long | hookId
val putHookRequest : PutHookRequest =  // PutHookRequest | 

launch(Dispatchers.IO) {
    val result : PutHookResponse = webService.updateHook(hookId, putHookRequest)
}
```

### Parameters
| **hookId** | **kotlin.Long**| hookId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putHookRequest** | [**PutHookRequest**](PutHookRequest.md)|  | |

### Return type

[**PutHookResponse**](PutHookResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


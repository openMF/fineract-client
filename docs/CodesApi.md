# CodesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCode**](CodesApi.md#createCode) | **POST** v1/codes | Create a Code |
| [**deleteCode**](CodesApi.md#deleteCode) | **DELETE** v1/codes/{codeId} | Delete a Code |
| [**retrieveCode**](CodesApi.md#retrieveCode) | **GET** v1/codes/{codeId} | Retrieve a Code |
| [**retrieveCodes**](CodesApi.md#retrieveCodes) | **GET** v1/codes | Retrieve Codes |
| [**updateCode**](CodesApi.md#updateCode) | **PUT** v1/codes/{codeId} | Update a Code |



Create a Code

Creates a code. Codes created through api are always &#39;user defined&#39; and so system defined is marked as false.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CodesApi::class.java)
val postCodesRequest : PostCodesRequest =  // PostCodesRequest | 

launch(Dispatchers.IO) {
    val result : PostCodesResponse = webService.createCode(postCodesRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postCodesRequest** | [**PostCodesRequest**](PostCodesRequest.md)|  | |

### Return type

[**PostCodesResponse**](PostCodesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Code

Deletes a code if it is not system defined.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CodesApi::class.java)
val codeId : kotlin.Long = 789 // kotlin.Long | codeId

launch(Dispatchers.IO) {
    val result : DeleteCodesResponse = webService.deleteCode(codeId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codeId** | **kotlin.Long**| codeId | |

### Return type

[**DeleteCodesResponse**](DeleteCodesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Code

Returns the details of a Code.  Example Requests:  codes/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CodesApi::class.java)
val codeId : kotlin.Long = 789 // kotlin.Long | codeId

launch(Dispatchers.IO) {
    val result : GetCodesResponse = webService.retrieveCode(codeId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codeId** | **kotlin.Long**| codeId | |

### Return type

[**GetCodesResponse**](GetCodesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Codes

Returns the list of codes.  Example Requests:  codes

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CodesApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetCodesResponse> = webService.retrieveCodes()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetCodesResponse&gt;**](GetCodesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Code

Updates the details of a code if it is not system defined.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CodesApi::class.java)
val codeId : kotlin.Long = 789 // kotlin.Long | codeId
val putCodesRequest : PutCodesRequest =  // PutCodesRequest | 

launch(Dispatchers.IO) {
    val result : PutCodesResponse = webService.updateCode(codeId, putCodesRequest)
}
```

### Parameters
| **codeId** | **kotlin.Long**| codeId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putCodesRequest** | [**PutCodesRequest**](PutCodesRequest.md)|  | |

### Return type

[**PutCodesResponse**](PutCodesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


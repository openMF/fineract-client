# CodeValuesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCodeValue**](CodeValuesApi.md#createCodeValue) | **POST** v1/codes/{codeId}/codevalues | Create a Code description |
| [**deleteCodeValue**](CodeValuesApi.md#deleteCodeValue) | **DELETE** v1/codes/{codeId}/codevalues/{codeValueId} | Delete a Code description |
| [**retrieveAllCodeValues**](CodeValuesApi.md#retrieveAllCodeValues) | **GET** v1/codes/{codeId}/codevalues | List Code Values |
| [**retrieveCodeValue**](CodeValuesApi.md#retrieveCodeValue) | **GET** v1/codes/{codeId}/codevalues/{codeValueId} | Retrieve a Code description |
| [**updateCodeValue**](CodeValuesApi.md#updateCodeValue) | **PUT** v1/codes/{codeId}/codevalues/{codeValueId} | Update a Code description |



Create a Code description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CodeValuesApi::class.java)
val codeId : kotlin.Long = 789 // kotlin.Long | codeId
val postCodeValuesDataRequest : PostCodeValuesDataRequest =  // PostCodeValuesDataRequest | 

launch(Dispatchers.IO) {
    val result : PostCodeValueDataResponse = webService.createCodeValue(codeId, postCodeValuesDataRequest)
}
```

### Parameters
| **codeId** | **kotlin.Long**| codeId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postCodeValuesDataRequest** | [**PostCodeValuesDataRequest**](PostCodeValuesDataRequest.md)|  | |

### Return type

[**PostCodeValueDataResponse**](PostCodeValueDataResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Code description

Deletes a code description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CodeValuesApi::class.java)
val codeId : kotlin.Long = 789 // kotlin.Long | codeId
val codeValueId : kotlin.Long = 789 // kotlin.Long | codeValueId

launch(Dispatchers.IO) {
    val result : DeleteCodeValueDataResponse = webService.deleteCodeValue(codeId, codeValueId)
}
```

### Parameters
| **codeId** | **kotlin.Long**| codeId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codeValueId** | **kotlin.Long**| codeValueId | |

### Return type

[**DeleteCodeValueDataResponse**](DeleteCodeValueDataResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Code Values

Returns the list of Code Values for a given Code  Example Requests:  codes/1/codevalues

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CodeValuesApi::class.java)
val codeId : kotlin.Long = 789 // kotlin.Long | codeId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetCodeValuesDataResponse> = webService.retrieveAllCodeValues(codeId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codeId** | **kotlin.Long**| codeId | |

### Return type

[**kotlin.collections.List&lt;GetCodeValuesDataResponse&gt;**](GetCodeValuesDataResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Code description

Returns the details of a Code Value  Example Requests:  codes/1/codevalues/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CodeValuesApi::class.java)
val codeValueId : kotlin.Long = 789 // kotlin.Long | codeValueId
val codeId : kotlin.Long = 789 // kotlin.Long | codeId

launch(Dispatchers.IO) {
    val result : GetCodeValuesDataResponse = webService.retrieveCodeValue(codeValueId, codeId)
}
```

### Parameters
| **codeValueId** | **kotlin.Long**| codeValueId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codeId** | **kotlin.Long**| codeId | |

### Return type

[**GetCodeValuesDataResponse**](GetCodeValuesDataResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Code description

Updates the details of a code description.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CodeValuesApi::class.java)
val codeId : kotlin.Long = 789 // kotlin.Long | codeId
val codeValueId : kotlin.Long = 789 // kotlin.Long | codeValueId
val putCodeValuesDataRequest : PutCodeValuesDataRequest =  // PutCodeValuesDataRequest | 

launch(Dispatchers.IO) {
    val result : PutCodeValueDataResponse = webService.updateCodeValue(codeId, codeValueId, putCodeValuesDataRequest)
}
```

### Parameters
| **codeId** | **kotlin.Long**| codeId | |
| **codeValueId** | **kotlin.Long**| codeValueId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putCodeValuesDataRequest** | [**PutCodeValuesDataRequest**](PutCodeValuesDataRequest.md)|  | |

### Return type

[**PutCodeValueDataResponse**](PutCodeValueDataResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


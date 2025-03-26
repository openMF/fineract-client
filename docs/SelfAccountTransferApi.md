# SelfAccountTransferApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**create14**](SelfAccountTransferApi.md#create14) | **POST** v1/self/accounttransfers | Create new Transfer |
| [**template15**](SelfAccountTransferApi.md#template15) | **GET** v1/self/accounttransfers/template | Retrieve Account Transfer Template |



Create new Transfer

Ability to create new transfer of monetary funds from one account to another.   Example Requests:   self/accounttransfers/ 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfAccountTransferApi::class.java)
val type : kotlin.String = type_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<PostNewTransferResponse> = webService.create14(type, body)
}
```

### Parameters
| **type** | **kotlin.String**|  | [optional] [default to &quot;&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;PostNewTransferResponse&gt;**](PostNewTransferResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve Account Transfer Template

Returns list of loan/savings accounts that can be used for account transfer   Example Requests:  self/accounttransfers/template 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfAccountTransferApi::class.java)
val type : kotlin.String = type_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetAccountTransferTemplateResponse> = webService.template15(type)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **kotlin.String**|  | [optional] [default to &quot;&quot;] |

### Return type

[**kotlin.collections.List&lt;GetAccountTransferTemplateResponse&gt;**](GetAccountTransferTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# PermissionsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieveAllPermissions**](PermissionsApi.md#retrieveAllPermissions) | **GET** v1/permissions | List Application Permissions |
| [**updatePermissionsDetails**](PermissionsApi.md#updatePermissionsDetails) | **PUT** v1/permissions | Enable/Disable Permissions for Maker Checker |



List Application Permissions

ARGUMENTS makerCheckerableoptional, Values are true, false. Default is false. If makerCheckerable&#x3D;false or not supplied then a list of application permissions is returned. The \&quot;selected\&quot; attribute is always true in this case.  If makerCheckerable&#x3D;true then the \&quot;selected\&quot; attribute shows whether the permission is enabled for Maker Check functionality.  Note: Each Apache Fineract transaction is associated with a permission.  Example Requests:  permissions   permissions?makerCheckerable&#x3D;true   permissions?fields&#x3D;grouping,code

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(PermissionsApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetPermissionsResponse> = webService.retrieveAllPermissions()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetPermissionsResponse&gt;**](GetPermissionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Enable/Disable Permissions for Maker Checker

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(PermissionsApi::class.java)
val putPermissionsRequest : PutPermissionsRequest =  // PutPermissionsRequest | 

launch(Dispatchers.IO) {
    val result : CommandProcessingResult = webService.updatePermissionsDetails(putPermissionsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putPermissionsRequest** | [**PutPermissionsRequest**](PutPermissionsRequest.md)|  | |

### Return type

[**CommandProcessingResult**](CommandProcessingResult.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


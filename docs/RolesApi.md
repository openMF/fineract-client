# RolesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**actionsOnRoles**](RolesApi.md#actionsOnRoles) | **POST** v1/roles/{roleId} | Enable Role | Disable Role |
| [**createRole**](RolesApi.md#createRole) | **POST** v1/roles | Create a New Role |
| [**deleteRole**](RolesApi.md#deleteRole) | **DELETE** v1/roles/{roleId} | Delete a Role |
| [**retrieveAllRoles**](RolesApi.md#retrieveAllRoles) | **GET** v1/roles | List Roles |
| [**retrieveRole**](RolesApi.md#retrieveRole) | **GET** v1/roles/{roleId} | Retrieve a Role |
| [**retrieveRolePermissions**](RolesApi.md#retrieveRolePermissions) | **GET** v1/roles/{roleId}/permissions | Retrieve a Role&#39;s Permissions |
| [**updateRole**](RolesApi.md#updateRole) | **PUT** v1/roles/{roleId} | Update a Role |
| [**updateRolePermissions**](RolesApi.md#updateRolePermissions) | **PUT** v1/roles/{roleId}/permissions | Update a Role&#39;s Permissions |



Enable Role | Disable Role

Description : Enable role in case role is disabled. | Disable the role in case role is not associated with any users.      Example Request:   https://DomainName/api/v1/roles/{roleId}?command&#x3D;enable      https://DomainName/api/v1/roles/{roleId}?command&#x3D;disable

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RolesApi::class.java)
val roleId : kotlin.Long = 789 // kotlin.Long | roleId
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostRolesRoleIdResponse = webService.actionsOnRoles(roleId, command)
}
```

### Parameters
| **roleId** | **kotlin.Long**| roleId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostRolesRoleIdResponse**](PostRolesRoleIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Create a New Role

Mandatory Fields name, description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RolesApi::class.java)
val postRolesRequest : PostRolesRequest =  // PostRolesRequest | 

launch(Dispatchers.IO) {
    val result : PostRolesResponse = webService.createRole(postRolesRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postRolesRequest** | [**PostRolesRequest**](PostRolesRequest.md)|  | |

### Return type

[**PostRolesResponse**](PostRolesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Role

Description : Delete the role in case role is not associated with any users.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RolesApi::class.java)
val roleId : kotlin.Long = 789 // kotlin.Long | roleId

launch(Dispatchers.IO) {
    val result : DeleteRolesRoleIdResponse = webService.deleteRole(roleId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **kotlin.Long**| roleId | |

### Return type

[**DeleteRolesRoleIdResponse**](DeleteRolesRoleIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Roles

Example Requests:  roles   roles?fields&#x3D;name

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RolesApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetRolesResponse> = webService.retrieveAllRoles()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetRolesResponse&gt;**](GetRolesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Role

Example Requests:  roles/1   roles/1?fields&#x3D;name

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RolesApi::class.java)
val roleId : kotlin.Long = 789 // kotlin.Long | roleId

launch(Dispatchers.IO) {
    val result : GetRolesRoleIdResponse = webService.retrieveRole(roleId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **kotlin.Long**| roleId | |

### Return type

[**GetRolesRoleIdResponse**](GetRolesRoleIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Role&#39;s Permissions

Example Requests:  roles/1/permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RolesApi::class.java)
val roleId : kotlin.Long = 789 // kotlin.Long | roleId

launch(Dispatchers.IO) {
    val result : GetRolesRoleIdPermissionsResponse = webService.retrieveRolePermissions(roleId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **kotlin.Long**| roleId | |

### Return type

[**GetRolesRoleIdPermissionsResponse**](GetRolesRoleIdPermissionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Role

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RolesApi::class.java)
val roleId : kotlin.Long = 789 // kotlin.Long | roleId
val putRolesRoleIdRequest : PutRolesRoleIdRequest =  // PutRolesRoleIdRequest | 

launch(Dispatchers.IO) {
    val result : PutRolesRoleIdResponse = webService.updateRole(roleId, putRolesRoleIdRequest)
}
```

### Parameters
| **roleId** | **kotlin.Long**| roleId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putRolesRoleIdRequest** | [**PutRolesRoleIdRequest**](PutRolesRoleIdRequest.md)|  | |

### Return type

[**PutRolesRoleIdResponse**](PutRolesRoleIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update a Role&#39;s Permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RolesApi::class.java)
val roleId : kotlin.Long = 789 // kotlin.Long | roleId
val putRolesRoleIdPermissionsRequest : PutRolesRoleIdPermissionsRequest =  // PutRolesRoleIdPermissionsRequest | 

launch(Dispatchers.IO) {
    val result : PutRolesRoleIdPermissionsResponse = webService.updateRolePermissions(roleId, putRolesRoleIdPermissionsRequest)
}
```

### Parameters
| **roleId** | **kotlin.Long**| roleId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putRolesRoleIdPermissionsRequest** | [**PutRolesRoleIdPermissionsRequest**](PutRolesRoleIdPermissionsRequest.md)|  | |

### Return type

[**PutRolesRoleIdPermissionsResponse**](PutRolesRoleIdPermissionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


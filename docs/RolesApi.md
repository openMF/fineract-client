# RolesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionsOnRoles**](RolesApi.md#actionsOnRoles) | **POST** roles/{roleId} | Enable Role | Disable Role
[**createRole**](RolesApi.md#createRole) | **POST** roles | Create a New Role
[**deleteRole**](RolesApi.md#deleteRole) | **DELETE** roles/{roleId} | Delete a Role
[**retrieveAllRoles**](RolesApi.md#retrieveAllRoles) | **GET** roles | List Roles
[**retrieveRole**](RolesApi.md#retrieveRole) | **GET** roles/{roleId} | Retrieve a Role
[**retrieveRolePermissions**](RolesApi.md#retrieveRolePermissions) | **GET** roles/{roleId}/permissions | Retrieve a Role&#39;s Permissions
[**updateRole**](RolesApi.md#updateRole) | **PUT** roles/{roleId} | Update a Role
[**updateRolePermissions**](RolesApi.md#updateRolePermissions) | **PUT** roles/{roleId}/permissions | Update a Role&#39;s Permissions


<a name="actionsOnRoles"></a>
# **actionsOnRoles**
> PostRolesRoleIdResponse actionsOnRoles(roleId, command)

Enable Role | Disable Role

Description : Enable role in case role is disabled. | Disable the role in case role is not associated with any users.      Example Request:   https://DomainName/api/v1/roles/{roleId}?command&#x3D;enable      https://DomainName/api/v1/roles/{roleId}?command&#x3D;disable

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RolesApi;


RolesApi apiInstance = new RolesApi();
Long roleId = 789L; // Long | roleId
String command = "command_example"; // String | command
try {
    PostRolesRoleIdResponse result = apiInstance.actionsOnRoles(roleId, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#actionsOnRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Long**| roleId |
 **command** | **String**| command | [optional]

### Return type

[**PostRolesRoleIdResponse**](PostRolesRoleIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRole"></a>
# **createRole**
> PostRolesResponse createRole(body)

Create a New Role

Mandatory Fields name, description

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RolesApi;


RolesApi apiInstance = new RolesApi();
PostRolesRequest body = new PostRolesRequest(); // PostRolesRequest | body
try {
    PostRolesResponse result = apiInstance.createRole(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#createRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostRolesRequest**](PostRolesRequest.md)| body |

### Return type

[**PostRolesResponse**](PostRolesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRole"></a>
# **deleteRole**
> DeleteRolesRoleIdResponse deleteRole(roleId)

Delete a Role

Description : Delete the role in case role is not associated with any users.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RolesApi;


RolesApi apiInstance = new RolesApi();
Long roleId = 789L; // Long | roleId
try {
    DeleteRolesRoleIdResponse result = apiInstance.deleteRole(roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#deleteRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Long**| roleId |

### Return type

[**DeleteRolesRoleIdResponse**](DeleteRolesRoleIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllRoles"></a>
# **retrieveAllRoles**
> List&lt;GetRolesResponse&gt; retrieveAllRoles()

List Roles

Example Requests:  roles   roles?fields&#x3D;name

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RolesApi;


RolesApi apiInstance = new RolesApi();
try {
    List<GetRolesResponse> result = apiInstance.retrieveAllRoles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#retrieveAllRoles");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetRolesResponse&gt;**](GetRolesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveRole"></a>
# **retrieveRole**
> GetRolesRoleIdResponse retrieveRole(roleId)

Retrieve a Role

Example Requests:  roles/1   roles/1?fields&#x3D;name

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RolesApi;


RolesApi apiInstance = new RolesApi();
Long roleId = 789L; // Long | roleId
try {
    GetRolesRoleIdResponse result = apiInstance.retrieveRole(roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#retrieveRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Long**| roleId |

### Return type

[**GetRolesRoleIdResponse**](GetRolesRoleIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveRolePermissions"></a>
# **retrieveRolePermissions**
> GetRolesRoleIdPermissionsResponse retrieveRolePermissions(roleId)

Retrieve a Role&#39;s Permissions

Example Requests:  roles/1/permissions

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RolesApi;


RolesApi apiInstance = new RolesApi();
Long roleId = 789L; // Long | roleId
try {
    GetRolesRoleIdPermissionsResponse result = apiInstance.retrieveRolePermissions(roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#retrieveRolePermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Long**| roleId |

### Return type

[**GetRolesRoleIdPermissionsResponse**](GetRolesRoleIdPermissionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRole"></a>
# **updateRole**
> PutRolesRoleIdResponse updateRole(roleId, body)

Update a Role



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RolesApi;


RolesApi apiInstance = new RolesApi();
Long roleId = 789L; // Long | roleId
PutRolesRoleIdRequest body = new PutRolesRoleIdRequest(); // PutRolesRoleIdRequest | body
try {
    PutRolesRoleIdResponse result = apiInstance.updateRole(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#updateRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Long**| roleId |
 **body** | [**PutRolesRoleIdRequest**](PutRolesRoleIdRequest.md)| body |

### Return type

[**PutRolesRoleIdResponse**](PutRolesRoleIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRolePermissions"></a>
# **updateRolePermissions**
> PutRolesRoleIdPermissionsResponse updateRolePermissions(roleId, body)

Update a Role&#39;s Permissions



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RolesApi;


RolesApi apiInstance = new RolesApi();
Long roleId = 789L; // Long | roleId
PutRolesRoleIdPermissionsRequest body = new PutRolesRoleIdPermissionsRequest(); // PutRolesRoleIdPermissionsRequest | body
try {
    PutRolesRoleIdPermissionsResponse result = apiInstance.updateRolePermissions(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#updateRolePermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Long**| roleId |
 **body** | [**PutRolesRoleIdPermissionsRequest**](PutRolesRoleIdPermissionsRequest.md)| body |

### Return type

[**PutRolesRoleIdPermissionsResponse**](PutRolesRoleIdPermissionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


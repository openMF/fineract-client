# RolesApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<PostRolesRoleIdResponse> call = apiService.actionsOnRoles(roleId, command);
call.enqueue(new Callback<PostRolesRoleIdResponse>() {
    @Override
    public void onResponse(Call<PostRolesRoleIdResponse> call, Response<PostRolesRoleIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostRolesRoleIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<PostRolesResponse> call = apiService.createRole(body);
call.enqueue(new Callback<PostRolesResponse>() {
    @Override
    public void onResponse(Call<PostRolesResponse> call, Response<PostRolesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostRolesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<DeleteRolesRoleIdResponse> call = apiService.deleteRole(roleId);
call.enqueue(new Callback<DeleteRolesRoleIdResponse>() {
    @Override
    public void onResponse(Call<DeleteRolesRoleIdResponse> call, Response<DeleteRolesRoleIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteRolesRoleIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetRolesResponse&gt;> call = apiService.retrieveAllRoles();
call.enqueue(new Callback<List&lt;GetRolesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetRolesResponse&gt;> call, Response<List&lt;GetRolesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetRolesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<GetRolesRoleIdResponse> call = apiService.retrieveRole(roleId);
call.enqueue(new Callback<GetRolesRoleIdResponse>() {
    @Override
    public void onResponse(Call<GetRolesRoleIdResponse> call, Response<GetRolesRoleIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRolesRoleIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<GetRolesRoleIdPermissionsResponse> call = apiService.retrieveRolePermissions(roleId);
call.enqueue(new Callback<GetRolesRoleIdPermissionsResponse>() {
    @Override
    public void onResponse(Call<GetRolesRoleIdPermissionsResponse> call, Response<GetRolesRoleIdPermissionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRolesRoleIdPermissionsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<PutRolesRoleIdResponse> call = apiService.updateRole(roleId, body);
call.enqueue(new Callback<PutRolesRoleIdResponse>() {
    @Override
    public void onResponse(Call<PutRolesRoleIdResponse> call, Response<PutRolesRoleIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutRolesRoleIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<PutRolesRoleIdPermissionsResponse> call = apiService.updateRolePermissions(roleId, body);
call.enqueue(new Callback<PutRolesRoleIdPermissionsResponse>() {
    @Override
    public void onResponse(Call<PutRolesRoleIdPermissionsResponse> call, Response<PutRolesRoleIdPermissionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutRolesRoleIdPermissionsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **roleId** | **Long**| roleId |
 **body** | [**PutRolesRoleIdPermissionsRequest**](PutRolesRoleIdPermissionsRequest.md)| body |

### Return type

[**PutRolesRoleIdPermissionsResponse**](PutRolesRoleIdPermissionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


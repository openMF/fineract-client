# PermissionsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAllPermissions**](PermissionsApi.md#retrieveAllPermissions) | **GET** permissions | List Application Permissions
[**updatePermissionsDetails**](PermissionsApi.md#updatePermissionsDetails) | **PUT** permissions | Enable/Disable Permissions for Maker Checker


<a name="retrieveAllPermissions"></a>
# **retrieveAllPermissions**
> List&lt;GetPermissionsResponse&gt; retrieveAllPermissions()

List Application Permissions

ARGUMENTS makerCheckerableoptional, Values are true, false. Default is false. If makerCheckerable&#x3D;false or not supplied then a list of application permissions is returned. The \&quot;selected\&quot; attribute is always true in this case.  If makerCheckerable&#x3D;true then the \&quot;selected\&quot; attribute shows whether the permission is enabled for Maker Check functionality.  Note: Each Apache Fineract transaction is associated with a permission.  Example Requests:  permissions   permissions?makerCheckerable&#x3D;true   permissions?fields&#x3D;grouping,code

### Example
```java

PermissionsApi apiService = defaultClient.createService(PermissionsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetPermissionsResponse&gt;> call = apiService.retrieveAllPermissions();
call.enqueue(new Callback<List&lt;GetPermissionsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetPermissionsResponse&gt;> call, Response<List&lt;GetPermissionsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetPermissionsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetPermissionsResponse&gt;**](GetPermissionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePermissionsDetails"></a>
# **updatePermissionsDetails**
> CommandProcessingResult updatePermissionsDetails(body)

Enable/Disable Permissions for Maker Checker



### Example
```java

PermissionsApi apiService = defaultClient.createService(PermissionsApi.class);

// Initialize these parameters earlier.
Call<CommandProcessingResult> call = apiService.updatePermissionsDetails(body);
call.enqueue(new Callback<CommandProcessingResult>() {
    @Override
    public void onResponse(Call<CommandProcessingResult> call, Response<CommandProcessingResult> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<CommandProcessingResult> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PutPermissionsRequest**](PutPermissionsRequest.md)| body |

### Return type

[**CommandProcessingResult**](CommandProcessingResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


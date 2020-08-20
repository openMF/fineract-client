# PermissionsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PermissionsApi;


PermissionsApi apiInstance = new PermissionsApi();
try {
    List<GetPermissionsResponse> result = apiInstance.retrieveAllPermissions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionsApi#retrieveAllPermissions");
    e.printStackTrace();
}
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PermissionsApi;


PermissionsApi apiInstance = new PermissionsApi();
PutPermissionsRequest body = new PutPermissionsRequest(); // PutPermissionsRequest | body
try {
    CommandProcessingResult result = apiInstance.updatePermissionsDetails(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionsApi#updatePermissionsDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutPermissionsRequest**](PutPermissionsRequest.md)| body |

### Return type

[**CommandProcessingResult**](CommandProcessingResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


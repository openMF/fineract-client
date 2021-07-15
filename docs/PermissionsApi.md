# PermissionsApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAllPermissions**](PermissionsApi.md#retrieveAllPermissions) | **GET** permissions | List Application Permissions
[**updatePermissionsDetails**](PermissionsApi.md#updatePermissionsDetails) | **PUT** permissions | Enable/Disable Permissions for Maker Checker



## retrieveAllPermissions

> List&lt;GetPermissionsResponse&gt; retrieveAllPermissions()

List Application Permissions

ARGUMENTS makerCheckerableoptional, Values are true, false. Default is false. If makerCheckerable&#x3D;false or not supplied then a list of application permissions is returned. The \&quot;selected\&quot; attribute is always true in this case.  If makerCheckerable&#x3D;true then the \&quot;selected\&quot; attribute shows whether the permission is enabled for Maker Check functionality.  Note: Each Apache Fineract transaction is associated with a permission.  Example Requests:  permissions   permissions?makerCheckerable&#x3D;true   permissions?fields&#x3D;grouping,code

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.PermissionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        PermissionsApi apiInstance = new PermissionsApi(defaultClient);
        try {
            List<GetPermissionsResponse> result = apiInstance.retrieveAllPermissions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PermissionsApi#retrieveAllPermissions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;GetPermissionsResponse&gt;**](GetPermissionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updatePermissionsDetails

> CommandProcessingResult updatePermissionsDetails(putPermissionsRequest)

Enable/Disable Permissions for Maker Checker

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.PermissionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        PermissionsApi apiInstance = new PermissionsApi(defaultClient);
        PutPermissionsRequest putPermissionsRequest = new PutPermissionsRequest(); // PutPermissionsRequest | 
        try {
            CommandProcessingResult result = apiInstance.updatePermissionsDetails(putPermissionsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PermissionsApi#updatePermissionsDetails");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **putPermissionsRequest** | [**PutPermissionsRequest**](PutPermissionsRequest.md)|  |

### Return type

[**CommandProcessingResult**](CommandProcessingResult.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


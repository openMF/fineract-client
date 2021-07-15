# CentersApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activate2**](CentersApi.md#activate2) | **POST** centers/{centerId} | Activate a Center | Generate Collection Sheet | Save Collection Sheet | Close a Center | Associate Groups | Disassociate Groups
[**create7**](CentersApi.md#create7) | **POST** centers | Create a Center
[**delete10**](CentersApi.md#delete10) | **DELETE** centers/{centerId} | Delete a Center
[**getCentersTemplate**](CentersApi.md#getCentersTemplate) | **GET** centers/downloadtemplate | 
[**postCentersTemplate**](CentersApi.md#postCentersTemplate) | **POST** centers/uploadtemplate | 
[**retrieveAll23**](CentersApi.md#retrieveAll23) | **GET** centers | List Centers
[**retrieveGroupAccount**](CentersApi.md#retrieveGroupAccount) | **GET** centers/{centerId}/accounts | Retrieve Center accounts overview
[**retrieveOne13**](CentersApi.md#retrieveOne13) | **GET** centers/{centerId} | Retrieve a Center
[**retrieveTemplate6**](CentersApi.md#retrieveTemplate6) | **GET** centers/template | Retrieve a Center Template
[**update11**](CentersApi.md#update11) | **PUT** centers/{centerId} | Update a Center



## activate2

> PostCentersCenterIdResponse activate2(centerId, postCentersCenterIdRequest, command)

Activate a Center | Generate Collection Sheet | Save Collection Sheet | Close a Center | Associate Groups | Disassociate Groups

Activate a Center:  Centers can be created in a Pending state. This API exists to enable center activation. If the center happens to be already active, this API will result in an error.  Close a Center:  Centers can be closed if they don&#39;t have any non-closed groups or saving accounts. If the Center has any active groups or savings accounts, this API will result in an error.  Associate Groups:  This API allows associating existing groups to a center. The groups are listed from the office to which the center is associated. If group(s) is already associated with a center, this API will result in an error.  Disassociate Groups:  This API allows to disassociate groups from a center.  Generate Collection Sheet:  This Api retrieves repayment details of all jlg loans under a center as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of JLG loans for a center on a given meeting date.  Showing Request/Response for Close a Center

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CentersApi;

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

        CentersApi apiInstance = new CentersApi(defaultClient);
        Long centerId = 56L; // Long | centerId
        PostCentersCenterIdRequest postCentersCenterIdRequest = new PostCentersCenterIdRequest(); // PostCentersCenterIdRequest | 
        String command = "command_example"; // String | command
        try {
            PostCentersCenterIdResponse result = apiInstance.activate2(centerId, postCentersCenterIdRequest, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CentersApi#activate2");
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
 **centerId** | **Long**| centerId |
 **postCentersCenterIdRequest** | [**PostCentersCenterIdRequest**](PostCentersCenterIdRequest.md)|  |
 **command** | **String**| command | [optional]

### Return type

[**PostCentersCenterIdResponse**](PostCentersCenterIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## create7

> PostCentersResponse create7(postCentersRequest)

Create a Center

Creates a Center  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, groupMembers

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CentersApi;

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

        CentersApi apiInstance = new CentersApi(defaultClient);
        PostCentersRequest postCentersRequest = new PostCentersRequest(); // PostCentersRequest | 
        try {
            PostCentersResponse result = apiInstance.create7(postCentersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CentersApi#create7");
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
 **postCentersRequest** | [**PostCentersRequest**](PostCentersRequest.md)|  |

### Return type

[**PostCentersResponse**](PostCentersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## delete10

> DeleteCentersCenterIdResponse delete10(centerId)

Delete a Center

A Center can be deleted if it is in pending state and has no association - groups, loans or savings

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CentersApi;

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

        CentersApi apiInstance = new CentersApi(defaultClient);
        Long centerId = 56L; // Long | centerId
        try {
            DeleteCentersCenterIdResponse result = apiInstance.delete10(centerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CentersApi#delete10");
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
 **centerId** | **Long**| centerId |

### Return type

[**DeleteCentersCenterIdResponse**](DeleteCentersCenterIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCentersTemplate

> getCentersTemplate(officeId, staffId, dateFormat)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CentersApi;

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

        CentersApi apiInstance = new CentersApi(defaultClient);
        Long officeId = 56L; // Long | 
        Long staffId = 56L; // Long | 
        String dateFormat = "dateFormat_example"; // String | 
        try {
            apiInstance.getCentersTemplate(officeId, staffId, dateFormat);
        } catch (ApiException e) {
            System.err.println("Exception when calling CentersApi#getCentersTemplate");
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
 **officeId** | **Long**|  | [optional]
 **staffId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.ms-excel

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## postCentersTemplate

> String postCentersTemplate(file, locale, dateFormat)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CentersApi;

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

        CentersApi apiInstance = new CentersApi(defaultClient);
        FormDataContentDisposition file = new FormDataContentDisposition(); // FormDataContentDisposition | 
        String locale = "locale_example"; // String | 
        String dateFormat = "dateFormat_example"; // String | 
        try {
            String result = apiInstance.postCentersTemplate(file, locale, dateFormat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CentersApi#postCentersTemplate");
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
 **file** | [**FormDataContentDisposition**](FormDataContentDisposition.md)|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## retrieveAll23

> GetCentersResponse retrieveAll23(officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, meetingDate, dateFormat, locale)

List Centers

The default implementation supports pagination and sorting with the default pagination size set to 200 records. The parameter limit with description -1 will return all entries.  Example Requests:    centers    centers?fields&#x3D;name,officeName,joinedDate    centers?offset&#x3D;10&amp;limit&#x3D;50    centers?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CentersApi;

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

        CentersApi apiInstance = new CentersApi(defaultClient);
        Long officeId = 56L; // Long | officeId
        Long staffId = 56L; // Long | staffId
        String externalId = "externalId_example"; // String | externalId
        String name = "name_example"; // String | name
        String underHierarchy = "underHierarchy_example"; // String | underHierarchy
        Boolean paged = true; // Boolean | paged
        Integer offset = 56; // Integer | offset
        Integer limit = 56; // Integer | limit
        String orderBy = "orderBy_example"; // String | orderBy
        String sortOrder = "sortOrder_example"; // String | sortOrder
        Object meetingDate = null; // Object | meetingDate
        String dateFormat = "dateFormat_example"; // String | dateFormat
        String locale = "locale_example"; // String | locale
        try {
            GetCentersResponse result = apiInstance.retrieveAll23(officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, meetingDate, dateFormat, locale);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CentersApi#retrieveAll23");
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
 **officeId** | **Long**| officeId | [optional]
 **staffId** | **Long**| staffId | [optional]
 **externalId** | **String**| externalId | [optional]
 **name** | **String**| name | [optional]
 **underHierarchy** | **String**| underHierarchy | [optional]
 **paged** | **Boolean**| paged | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **meetingDate** | [**Object**](.md)| meetingDate | [optional]
 **dateFormat** | **String**| dateFormat | [optional]
 **locale** | **String**| locale | [optional]

### Return type

[**GetCentersResponse**](GetCentersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveGroupAccount

> GetCentersCenterIdAccountsResponse retrieveGroupAccount(centerId)

Retrieve Center accounts overview

An example of how a savings summary for a Center can be provided. This is requested in a specific use case of the reference application.  It is quite reasonable to add resources like this to simplify User Interface development.    Example Requests:    centers/9/accounts

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CentersApi;

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

        CentersApi apiInstance = new CentersApi(defaultClient);
        Long centerId = 56L; // Long | centerId
        try {
            GetCentersCenterIdAccountsResponse result = apiInstance.retrieveGroupAccount(centerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CentersApi#retrieveGroupAccount");
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
 **centerId** | **Long**| centerId |

### Return type

[**GetCentersCenterIdAccountsResponse**](GetCentersCenterIdAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveOne13

> GetCentersCenterIdResponse retrieveOne13(centerId, staffInSelectedOfficeOnly)

Retrieve a Center

Retrieves a Center  Example Requests:    centers/1    centers/1?associations&#x3D;groupMembers

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CentersApi;

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

        CentersApi apiInstance = new CentersApi(defaultClient);
        Long centerId = 56L; // Long | centerId
        Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
        try {
            GetCentersCenterIdResponse result = apiInstance.retrieveOne13(centerId, staffInSelectedOfficeOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CentersApi#retrieveOne13");
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
 **centerId** | **Long**| centerId |
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]

### Return type

[**GetCentersCenterIdResponse**](GetCentersCenterIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTemplate6

> GetCentersTemplateResponse retrieveTemplate6(command, officeId, staffInSelectedOfficeOnly)

Retrieve a Center Template

Retrieves a Center Template  Example Requests:    centers/template    centers/template?officeId&#x3D;2

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CentersApi;

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

        CentersApi apiInstance = new CentersApi(defaultClient);
        String command = "command_example"; // String | command
        Long officeId = 56L; // Long | officeId
        Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
        try {
            GetCentersTemplateResponse result = apiInstance.retrieveTemplate6(command, officeId, staffInSelectedOfficeOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CentersApi#retrieveTemplate6");
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
 **command** | **String**| command | [optional]
 **officeId** | **Long**| officeId | [optional]
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]

### Return type

[**GetCentersTemplateResponse**](GetCentersTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## update11

> PutCentersCenterIdResponse update11(centerId, putCentersCenterIdRequest)

Update a Center

Updates a Center

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CentersApi;

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

        CentersApi apiInstance = new CentersApi(defaultClient);
        Long centerId = 56L; // Long | centerId
        PutCentersCenterIdRequest putCentersCenterIdRequest = new PutCentersCenterIdRequest(); // PutCentersCenterIdRequest | 
        try {
            PutCentersCenterIdResponse result = apiInstance.update11(centerId, putCentersCenterIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CentersApi#update11");
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
 **centerId** | **Long**| centerId |
 **putCentersCenterIdRequest** | [**PutCentersCenterIdRequest**](PutCentersCenterIdRequest.md)|  |

### Return type

[**PutCentersCenterIdResponse**](PutCentersCenterIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


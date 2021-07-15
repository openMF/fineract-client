# StaffApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create3**](StaffApi.md#create3) | **POST** staff | Create a staff member
[**getTemplate1**](StaffApi.md#getTemplate1) | **GET** staff/downloadtemplate | 
[**postTemplate**](StaffApi.md#postTemplate) | **POST** staff/uploadtemplate | 
[**retrieveAll16**](StaffApi.md#retrieveAll16) | **GET** staff | Retrieve Staff
[**retrieveOne8**](StaffApi.md#retrieveOne8) | **GET** staff/{staffId} | Retrieve a Staff Member
[**update7**](StaffApi.md#update7) | **PUT** staff/{staffId} | Update a Staff Member



## create3

> CreateStaffResponse create3(postStaffRequest)

Create a staff member

Creates a staff member.  Mandatory Fields:  officeId, firstname, lastname  Optional Fields:  isLoanOfficer, isActive

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.StaffApi;

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

        StaffApi apiInstance = new StaffApi(defaultClient);
        PostStaffRequest postStaffRequest = new PostStaffRequest(); // PostStaffRequest | 
        try {
            CreateStaffResponse result = apiInstance.create3(postStaffRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaffApi#create3");
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
 **postStaffRequest** | [**PostStaffRequest**](PostStaffRequest.md)|  |

### Return type

[**CreateStaffResponse**](CreateStaffResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getTemplate1

> getTemplate1(officeId, dateFormat)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.StaffApi;

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

        StaffApi apiInstance = new StaffApi(defaultClient);
        Long officeId = 56L; // Long | 
        String dateFormat = "dateFormat_example"; // String | 
        try {
            apiInstance.getTemplate1(officeId, dateFormat);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaffApi#getTemplate1");
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


## postTemplate

> String postTemplate(file, locale, dateFormat)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.StaffApi;

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

        StaffApi apiInstance = new StaffApi(defaultClient);
        FormDataContentDisposition file = new FormDataContentDisposition(); // FormDataContentDisposition | 
        String locale = "locale_example"; // String | 
        String dateFormat = "dateFormat_example"; // String | 
        try {
            String result = apiInstance.postTemplate(file, locale, dateFormat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaffApi#postTemplate");
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


## retrieveAll16

> List&lt;RetrieveOneResponse&gt; retrieveAll16(officeId, staffInOfficeHierarchy, loanOfficersOnly, status)

Retrieve Staff

Returns the list of staff members.  Example Requests:  staff     Retrieve a Staff by status  Returns the details of a Staff based on status.  By default it Returns all the ACTIVE Staff.  If status&#x3D;INACTIVE, then it returns all INACTIVE Staff.  and for status&#x3D;ALL, it Returns both ACTIVE and INACTIVE Staff.  Example Requests:  staff?status&#x3D;active

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.StaffApi;

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

        StaffApi apiInstance = new StaffApi(defaultClient);
        Long officeId = 56L; // Long | officeId
        Boolean staffInOfficeHierarchy = false; // Boolean | staffInOfficeHierarchy
        Boolean loanOfficersOnly = false; // Boolean | loanOfficersOnly
        String status = "\"active\""; // String | status
        try {
            List<RetrieveOneResponse> result = apiInstance.retrieveAll16(officeId, staffInOfficeHierarchy, loanOfficersOnly, status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaffApi#retrieveAll16");
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
 **staffInOfficeHierarchy** | **Boolean**| staffInOfficeHierarchy | [optional] [default to false]
 **loanOfficersOnly** | **Boolean**| loanOfficersOnly | [optional] [default to false]
 **status** | **String**| status | [optional] [default to &quot;active&quot;]

### Return type

[**List&lt;RetrieveOneResponse&gt;**](RetrieveOneResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveOne8

> RetrieveOneResponse retrieveOne8(staffId)

Retrieve a Staff Member

Returns the details of a Staff Member.  Example Requests:  staff/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.StaffApi;

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

        StaffApi apiInstance = new StaffApi(defaultClient);
        Long staffId = 56L; // Long | staffId
        try {
            RetrieveOneResponse result = apiInstance.retrieveOne8(staffId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaffApi#retrieveOne8");
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
 **staffId** | **Long**| staffId |

### Return type

[**RetrieveOneResponse**](RetrieveOneResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## update7

> UpdateStaffResponse update7(staffId, putStaffRequest)

Update a Staff Member

Updates the details of a staff member.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.StaffApi;

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

        StaffApi apiInstance = new StaffApi(defaultClient);
        Long staffId = 56L; // Long | staffId
        PutStaffRequest putStaffRequest = new PutStaffRequest(); // PutStaffRequest | 
        try {
            UpdateStaffResponse result = apiInstance.update7(staffId, putStaffRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaffApi#update7");
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
 **staffId** | **Long**| staffId |
 **putStaffRequest** | [**PutStaffRequest**](PutStaffRequest.md)|  |

### Return type

[**UpdateStaffResponse**](UpdateStaffResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


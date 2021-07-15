# GeneralLedgerAccountApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGLAccount1**](GeneralLedgerAccountApi.md#createGLAccount1) | **POST** glaccounts | Create a General Ledger Account
[**deleteGLAccount1**](GeneralLedgerAccountApi.md#deleteGLAccount1) | **DELETE** glaccounts/{glAccountId} | Delete an accounting closure
[**getGlAccountsTemplate**](GeneralLedgerAccountApi.md#getGlAccountsTemplate) | **GET** glaccounts/downloadtemplate | 
[**postGlAccountsTemplate**](GeneralLedgerAccountApi.md#postGlAccountsTemplate) | **POST** glaccounts/uploadtemplate | 
[**retreiveAccount**](GeneralLedgerAccountApi.md#retreiveAccount) | **GET** glaccounts/{glAccountId} | Retrieve a General Ledger Account
[**retrieveAllAccounts**](GeneralLedgerAccountApi.md#retrieveAllAccounts) | **GET** glaccounts | List General Ledger Accounts
[**retrieveNewAccountDetails**](GeneralLedgerAccountApi.md#retrieveNewAccountDetails) | **GET** glaccounts/template | Retrieve GL Accounts Template
[**updateGLAccount1**](GeneralLedgerAccountApi.md#updateGLAccount1) | **PUT** glaccounts/{glAccountId} | Update an Accounting closure



## createGLAccount1

> PostGLAccountsResponse createGLAccount1(postGLAccountsRequest)

Create a General Ledger Account

Note: You may optionally create Hierarchical Chart of Accounts by using the \&quot;parentId\&quot; property of an Account Mandatory Fields:  name, glCode, type, usage and manualEntriesAllowed

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GeneralLedgerAccountApi;

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

        GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi(defaultClient);
        PostGLAccountsRequest postGLAccountsRequest = new PostGLAccountsRequest(); // PostGLAccountsRequest | 
        try {
            PostGLAccountsResponse result = apiInstance.createGLAccount1(postGLAccountsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralLedgerAccountApi#createGLAccount1");
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
 **postGLAccountsRequest** | [**PostGLAccountsRequest**](PostGLAccountsRequest.md)|  | [optional]

### Return type

[**PostGLAccountsResponse**](PostGLAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteGLAccount1

> DeleteGLAccountsRequest deleteGLAccount1(glAccountId)

Delete an accounting closure

Note: Only the latest accounting closure associated with a branch may be deleted.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GeneralLedgerAccountApi;

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

        GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi(defaultClient);
        Long glAccountId = 56L; // Long | glAccountId
        try {
            DeleteGLAccountsRequest result = apiInstance.deleteGLAccount1(glAccountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralLedgerAccountApi#deleteGLAccount1");
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
 **glAccountId** | **Long**| glAccountId |

### Return type

[**DeleteGLAccountsRequest**](DeleteGLAccountsRequest.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getGlAccountsTemplate

> getGlAccountsTemplate(dateFormat)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GeneralLedgerAccountApi;

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

        GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi(defaultClient);
        String dateFormat = "dateFormat_example"; // String | 
        try {
            apiInstance.getGlAccountsTemplate(dateFormat);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralLedgerAccountApi#getGlAccountsTemplate");
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


## postGlAccountsTemplate

> String postGlAccountsTemplate(file, locale, dateFormat)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GeneralLedgerAccountApi;

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

        GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi(defaultClient);
        FormDataContentDisposition file = new FormDataContentDisposition(); // FormDataContentDisposition | 
        String locale = "locale_example"; // String | 
        String dateFormat = "dateFormat_example"; // String | 
        try {
            String result = apiInstance.postGlAccountsTemplate(file, locale, dateFormat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralLedgerAccountApi#postGlAccountsTemplate");
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


## retreiveAccount

> GetGLAccountsResponse retreiveAccount(glAccountId, fetchRunningBalance)

Retrieve a General Ledger Account

Example Requests:  glaccounts/1   glaccounts/1?template&#x3D;true   glaccounts/1?fields&#x3D;name,glCode   glaccounts/1?fetchRunningBalance&#x3D;true

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GeneralLedgerAccountApi;

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

        GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi(defaultClient);
        Long glAccountId = 56L; // Long | glAccountId
        Boolean fetchRunningBalance = true; // Boolean | fetchRunningBalance
        try {
            GetGLAccountsResponse result = apiInstance.retreiveAccount(glAccountId, fetchRunningBalance);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralLedgerAccountApi#retreiveAccount");
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
 **glAccountId** | **Long**| glAccountId |
 **fetchRunningBalance** | **Boolean**| fetchRunningBalance | [optional]

### Return type

[**GetGLAccountsResponse**](GetGLAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllAccounts

> List&lt;GetGLAccountsResponse&gt; retrieveAllAccounts(type, searchParam, usage, manualEntriesAllowed, disabled, fetchRunningBalance)

List General Ledger Accounts

ARGUMENTS type Integer optional manualEntriesAllowed boolean optional usage Integer optional disabled boolean optional parentId Long optional tagId Long optional Example Requests:  glaccounts   glaccounts?type&#x3D;1&amp;manualEntriesAllowed&#x3D;true&amp;usage&#x3D;1&amp;disabled&#x3D;false  glaccounts?fetchRunningBalance&#x3D;true

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GeneralLedgerAccountApi;

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

        GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi(defaultClient);
        Integer type = 56; // Integer | type
        String searchParam = "searchParam_example"; // String | searchParam
        Integer usage = 56; // Integer | usage
        Boolean manualEntriesAllowed = true; // Boolean | manualEntriesAllowed
        Boolean disabled = true; // Boolean | disabled
        Boolean fetchRunningBalance = true; // Boolean | fetchRunningBalance
        try {
            List<GetGLAccountsResponse> result = apiInstance.retrieveAllAccounts(type, searchParam, usage, manualEntriesAllowed, disabled, fetchRunningBalance);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralLedgerAccountApi#retrieveAllAccounts");
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
 **type** | **Integer**| type | [optional]
 **searchParam** | **String**| searchParam | [optional]
 **usage** | **Integer**| usage | [optional]
 **manualEntriesAllowed** | **Boolean**| manualEntriesAllowed | [optional]
 **disabled** | **Boolean**| disabled | [optional]
 **fetchRunningBalance** | **Boolean**| fetchRunningBalance | [optional]

### Return type

[**List&lt;GetGLAccountsResponse&gt;**](GetGLAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveNewAccountDetails

> GetGLAccountsTemplateResponse retrieveNewAccountDetails(type)

Retrieve GL Accounts Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  glaccounts/template glaccounts/template?type&#x3D;1  type is optional and integer value from 1 to 5.  1.Assets  2.Liabilities  3.Equity  4.Income  5.Expenses

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GeneralLedgerAccountApi;

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

        GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi(defaultClient);
        Integer type = 56; // Integer | type
        try {
            GetGLAccountsTemplateResponse result = apiInstance.retrieveNewAccountDetails(type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralLedgerAccountApi#retrieveNewAccountDetails");
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
 **type** | **Integer**| type | [optional]

### Return type

[**GetGLAccountsTemplateResponse**](GetGLAccountsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateGLAccount1

> PutGLAccountsResponse updateGLAccount1(glAccountId, putGLAccountsRequest)

Update an Accounting closure

Once an accounting closure is created, only the comments associated with it may be edited  

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GeneralLedgerAccountApi;

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

        GeneralLedgerAccountApi apiInstance = new GeneralLedgerAccountApi(defaultClient);
        Long glAccountId = 56L; // Long | glAccountId
        PutGLAccountsRequest putGLAccountsRequest = new PutGLAccountsRequest(); // PutGLAccountsRequest | 
        try {
            PutGLAccountsResponse result = apiInstance.updateGLAccount1(glAccountId, putGLAccountsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralLedgerAccountApi#updateGLAccount1");
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
 **glAccountId** | **Long**| glAccountId |
 **putGLAccountsRequest** | [**PutGLAccountsRequest**](PutGLAccountsRequest.md)|  | [optional]

### Return type

[**PutGLAccountsResponse**](PutGLAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


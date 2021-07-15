# ShareAccountApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](ShareAccountApi.md#createAccount) | **POST** accounts/{type} | Submit new share application
[**getSharedAccountsTemplate**](ShareAccountApi.md#getSharedAccountsTemplate) | **GET** accounts/{type}/downloadtemplate | 
[**handleCommands2**](ShareAccountApi.md#handleCommands2) | **POST** accounts/{type}/{accountId} | Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account
[**postSharedAccountsTemplate**](ShareAccountApi.md#postSharedAccountsTemplate) | **POST** accounts/{type}/uploadtemplate | 
[**retrieveAccount**](ShareAccountApi.md#retrieveAccount) | **GET** accounts/{type}/{accountId} | Retrieve a share application/account
[**retrieveAllAccounts1**](ShareAccountApi.md#retrieveAllAccounts1) | **GET** accounts/{type} | List share applications/accounts
[**template7**](ShareAccountApi.md#template7) | **GET** accounts/{type}/template | Retrieve Share Account Template
[**updateAccount**](ShareAccountApi.md#updateAccount) | **PUT** accounts/{type}/{accountId} | Modify a share application



## createAccount

> PostAccountsTypeResponse createAccount(type, postAccountsTypeRequest)

Submit new share application

Submits new share application  Mandatory Fields: clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate  Optional Fields: accountNo, externalId  Inherited from Product (if not provided): minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ShareAccountApi;

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

        ShareAccountApi apiInstance = new ShareAccountApi(defaultClient);
        String type = "type_example"; // String | type
        PostAccountsTypeRequest postAccountsTypeRequest = new PostAccountsTypeRequest(); // PostAccountsTypeRequest | 
        try {
            PostAccountsTypeResponse result = apiInstance.createAccount(type, postAccountsTypeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShareAccountApi#createAccount");
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
 **type** | **String**| type |
 **postAccountsTypeRequest** | [**PostAccountsTypeRequest**](PostAccountsTypeRequest.md)|  |

### Return type

[**PostAccountsTypeResponse**](PostAccountsTypeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getSharedAccountsTemplate

> getSharedAccountsTemplate(type, officeId, dateFormat)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ShareAccountApi;

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

        ShareAccountApi apiInstance = new ShareAccountApi(defaultClient);
        String type = "type_example"; // String | type
        Long officeId = 56L; // Long | 
        String dateFormat = "dateFormat_example"; // String | 
        try {
            apiInstance.getSharedAccountsTemplate(type, officeId, dateFormat);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShareAccountApi#getSharedAccountsTemplate");
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
 **type** | **String**| type |
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


## handleCommands2

> PostAccountsTypeAccountIdResponse handleCommands2(type, accountId, postAccountsTypeAccountIdRequest, command)

Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account

Approve share application:  Approves share application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval share application:  Will move &#39;approved&#39; share application back to &#39;Submitted and pending approval&#39; state.  Reject share application:  Rejects share application so long as its in &#39;Submitted and pending approval&#39; state.  Activate a share account:  Results in an approved share application being converted into an &#39;active&#39; share account.  Close a share account:  Results in an Activated share application being converted into an &#39;closed&#39; share account.  closedDate is closure date of share account  Mandatory Fields: dateFormat,locale,closedDate  Apply additional shares on a share account:  requestedDate is requsted date of share purchase  requestedShares is number of shares to be purchase  Mandatory Fields: dateFormat,locale,requestedDate, requestedShares  Approve additional shares request on a share account  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Reject additional shares request on a share account:  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Redeem shares on a share account:  Results redeem some/all shares from share account.  requestedDate is requsted date of shares redeem  requestedShares is number of shares to be redeemed  Mandatory Fields: dateFormat,locale,requestedDate,requestedShares  Showing request/response for &#39;Reject additional shares request on a share account&#39;  For more info visit this link - https://demo.fineract.dev/fineract-provider/api-docs/apiLive.htm#shareaccounts

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ShareAccountApi;

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

        ShareAccountApi apiInstance = new ShareAccountApi(defaultClient);
        String type = "type_example"; // String | type
        Long accountId = 56L; // Long | accountId
        PostAccountsTypeAccountIdRequest postAccountsTypeAccountIdRequest = new PostAccountsTypeAccountIdRequest(); // PostAccountsTypeAccountIdRequest | 
        String command = "command_example"; // String | command
        try {
            PostAccountsTypeAccountIdResponse result = apiInstance.handleCommands2(type, accountId, postAccountsTypeAccountIdRequest, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShareAccountApi#handleCommands2");
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
 **type** | **String**| type |
 **accountId** | **Long**| accountId |
 **postAccountsTypeAccountIdRequest** | [**PostAccountsTypeAccountIdRequest**](PostAccountsTypeAccountIdRequest.md)|  |
 **command** | **String**| command | [optional]

### Return type

[**PostAccountsTypeAccountIdResponse**](PostAccountsTypeAccountIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postSharedAccountsTemplate

> String postSharedAccountsTemplate(type, file, locale, dateFormat)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ShareAccountApi;

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

        ShareAccountApi apiInstance = new ShareAccountApi(defaultClient);
        String type = "type_example"; // String | type
        FormDataContentDisposition file = new FormDataContentDisposition(); // FormDataContentDisposition | 
        String locale = "locale_example"; // String | 
        String dateFormat = "dateFormat_example"; // String | 
        try {
            String result = apiInstance.postSharedAccountsTemplate(type, file, locale, dateFormat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShareAccountApi#postSharedAccountsTemplate");
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
 **type** | **String**| type |
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


## retrieveAccount

> GetAccountsTypeAccountIdResponse retrieveAccount(accountId, type)

Retrieve a share application/account

Retrieves a share application/account  Example Requests :  shareaccount/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ShareAccountApi;

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

        ShareAccountApi apiInstance = new ShareAccountApi(defaultClient);
        Long accountId = 56L; // Long | accountId
        String type = "type_example"; // String | type
        try {
            GetAccountsTypeAccountIdResponse result = apiInstance.retrieveAccount(accountId, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShareAccountApi#retrieveAccount");
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
 **accountId** | **Long**| accountId |
 **type** | **String**| type |

### Return type

[**GetAccountsTypeAccountIdResponse**](GetAccountsTypeAccountIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllAccounts1

> GetAccountsTypeResponse retrieveAllAccounts1(type, offset, limit)

List share applications/accounts

Lists share applications/accounts  Example Requests:  shareaccount

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ShareAccountApi;

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

        ShareAccountApi apiInstance = new ShareAccountApi(defaultClient);
        String type = "type_example"; // String | type
        Integer offset = 56; // Integer | offset
        Integer limit = 56; // Integer | limit
        try {
            GetAccountsTypeResponse result = apiInstance.retrieveAllAccounts1(type, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShareAccountApi#retrieveAllAccounts1");
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
 **type** | **String**| type |
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**GetAccountsTypeResponse**](GetAccountsTypeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## template7

> GetAccountsTypeTemplateResponse template7(type, clientId, productId)

Retrieve Share Account Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  accounts/share/template?clientId&#x3D;1   accounts/share/template?clientId&#x3D;1&amp;productId&#x3D;1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ShareAccountApi;

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

        ShareAccountApi apiInstance = new ShareAccountApi(defaultClient);
        String type = "type_example"; // String | type
        Long clientId = 56L; // Long | clientId
        Long productId = 56L; // Long | productId
        try {
            GetAccountsTypeTemplateResponse result = apiInstance.template7(type, clientId, productId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShareAccountApi#template7");
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
 **type** | **String**| type |
 **clientId** | **Long**| clientId | [optional]
 **productId** | **Long**| productId | [optional]

### Return type

[**GetAccountsTypeTemplateResponse**](GetAccountsTypeTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateAccount

> PutAccountsTypeAccountIdResponse updateAccount(type, accountId, putAccountsTypeAccountIdRequest)

Modify a share application

Share application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ShareAccountApi;

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

        ShareAccountApi apiInstance = new ShareAccountApi(defaultClient);
        String type = "type_example"; // String | type
        Long accountId = 56L; // Long | accountId
        PutAccountsTypeAccountIdRequest putAccountsTypeAccountIdRequest = new PutAccountsTypeAccountIdRequest(); // PutAccountsTypeAccountIdRequest | 
        try {
            PutAccountsTypeAccountIdResponse result = apiInstance.updateAccount(type, accountId, putAccountsTypeAccountIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShareAccountApi#updateAccount");
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
 **type** | **String**| type |
 **accountId** | **Long**| accountId |
 **putAccountsTypeAccountIdRequest** | [**PutAccountsTypeAccountIdRequest**](PutAccountsTypeAccountIdRequest.md)|  |

### Return type

[**PutAccountsTypeAccountIdResponse**](PutAccountsTypeAccountIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


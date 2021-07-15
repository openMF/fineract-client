# MakerCheckerOr4EyeFunctionalityApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**approveMakerCheckerEntry**](MakerCheckerOr4EyeFunctionalityApi.md#approveMakerCheckerEntry) | **POST** makercheckers/{auditId} | Approve Maker Checker Entry | Reject Maker Checker Entry
[**deleteMakerCheckerEntry**](MakerCheckerOr4EyeFunctionalityApi.md#deleteMakerCheckerEntry) | **DELETE** makercheckers/{auditId} | Delete Maker Checker Entry
[**retrieveAuditSearchTemplate1**](MakerCheckerOr4EyeFunctionalityApi.md#retrieveAuditSearchTemplate1) | **GET** makercheckers/searchtemplate | Maker Checker Search Template
[**retrieveCommands**](MakerCheckerOr4EyeFunctionalityApi.md#retrieveCommands) | **GET** makercheckers | List Maker Checker Entries



## approveMakerCheckerEntry

> PostMakerCheckersResponse approveMakerCheckerEntry(auditId, command)

Approve Maker Checker Entry | Reject Maker Checker Entry

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.MakerCheckerOr4EyeFunctionalityApi;

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

        MakerCheckerOr4EyeFunctionalityApi apiInstance = new MakerCheckerOr4EyeFunctionalityApi(defaultClient);
        Long auditId = 56L; // Long | auditId
        String command = "command_example"; // String | command
        try {
            PostMakerCheckersResponse result = apiInstance.approveMakerCheckerEntry(auditId, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MakerCheckerOr4EyeFunctionalityApi#approveMakerCheckerEntry");
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
 **auditId** | **Long**| auditId |
 **command** | **String**| command | [optional]

### Return type

[**PostMakerCheckersResponse**](PostMakerCheckersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteMakerCheckerEntry

> PostMakerCheckersResponse deleteMakerCheckerEntry(auditId)

Delete Maker Checker Entry

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.MakerCheckerOr4EyeFunctionalityApi;

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

        MakerCheckerOr4EyeFunctionalityApi apiInstance = new MakerCheckerOr4EyeFunctionalityApi(defaultClient);
        Long auditId = 56L; // Long | auditId
        try {
            PostMakerCheckersResponse result = apiInstance.deleteMakerCheckerEntry(auditId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MakerCheckerOr4EyeFunctionalityApi#deleteMakerCheckerEntry");
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
 **auditId** | **Long**| auditId |

### Return type

[**PostMakerCheckersResponse**](PostMakerCheckersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAuditSearchTemplate1

> GetMakerCheckersSearchTemplateResponse retrieveAuditSearchTemplate1()

Maker Checker Search Template

This is a convenience resource. It can be useful when building a Checker Inbox UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with. \&quot;actionNames\&quot; and \&quot;entityNames\&quot; returned are those that the requestor has Checker approval permissions for.  Example Requests:  makercheckers/searchtemplate makercheckers/searchtemplate?fields&#x3D;entityNames

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.MakerCheckerOr4EyeFunctionalityApi;

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

        MakerCheckerOr4EyeFunctionalityApi apiInstance = new MakerCheckerOr4EyeFunctionalityApi(defaultClient);
        try {
            GetMakerCheckersSearchTemplateResponse result = apiInstance.retrieveAuditSearchTemplate1();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MakerCheckerOr4EyeFunctionalityApi#retrieveAuditSearchTemplate1");
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

[**GetMakerCheckersSearchTemplateResponse**](GetMakerCheckersSearchTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveCommands

> List&lt;GetMakerCheckerResponse&gt; retrieveCommands(actionName, entityName, resourceId, makerId, makerDateTimeFrom, makerDateTimeTo, officeId, groupId, clientId, loanid, savingsAccountId)

List Maker Checker Entries

Get a list of entries that can be checked by the requestor that match the criteria supplied.  Example Requests:  makercheckers  makercheckers?fields&#x3D;madeOnDate,maker,processingResult  makercheckers?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  makercheckers?officeId&#x3D;1  makercheckers?officeId&#x3D;1&amp;includeJson&#x3D;true

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.MakerCheckerOr4EyeFunctionalityApi;

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

        MakerCheckerOr4EyeFunctionalityApi apiInstance = new MakerCheckerOr4EyeFunctionalityApi(defaultClient);
        String actionName = "actionName_example"; // String | actionName
        String entityName = "entityName_example"; // String | entityName
        Long resourceId = 56L; // Long | resourceId
        Long makerId = 56L; // Long | makerId
        String makerDateTimeFrom = "makerDateTimeFrom_example"; // String | makerDateTimeFrom
        String makerDateTimeTo = "makerDateTimeTo_example"; // String | makerDateTimeTo
        Integer officeId = 56; // Integer | officeId
        Integer groupId = 56; // Integer | groupId
        Integer clientId = 56; // Integer | clientId
        Integer loanid = 56; // Integer | loanid
        Integer savingsAccountId = 56; // Integer | savingsAccountId
        try {
            List<GetMakerCheckerResponse> result = apiInstance.retrieveCommands(actionName, entityName, resourceId, makerId, makerDateTimeFrom, makerDateTimeTo, officeId, groupId, clientId, loanid, savingsAccountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MakerCheckerOr4EyeFunctionalityApi#retrieveCommands");
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
 **actionName** | **String**| actionName | [optional]
 **entityName** | **String**| entityName | [optional]
 **resourceId** | **Long**| resourceId | [optional]
 **makerId** | **Long**| makerId | [optional]
 **makerDateTimeFrom** | **String**| makerDateTimeFrom | [optional]
 **makerDateTimeTo** | **String**| makerDateTimeTo | [optional]
 **officeId** | **Integer**| officeId | [optional]
 **groupId** | **Integer**| groupId | [optional]
 **clientId** | **Integer**| clientId | [optional]
 **loanid** | **Integer**| loanid | [optional]
 **savingsAccountId** | **Integer**| savingsAccountId | [optional]

### Return type

[**List&lt;GetMakerCheckerResponse&gt;**](GetMakerCheckerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


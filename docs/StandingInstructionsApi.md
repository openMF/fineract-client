# StandingInstructionsApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create5**](StandingInstructionsApi.md#create5) | **POST** standinginstructions | Create new Standing Instruction
[**retrieveAll19**](StandingInstructionsApi.md#retrieveAll19) | **GET** standinginstructions | List Standing Instructions
[**retrieveOne10**](StandingInstructionsApi.md#retrieveOne10) | **GET** standinginstructions/{standingInstructionId} | Retrieve Standing Instruction
[**template6**](StandingInstructionsApi.md#template6) | **GET** standinginstructions/template | Retrieve Standing Instruction Template
[**update9**](StandingInstructionsApi.md#update9) | **PUT** standinginstructions/{standingInstructionId} | Update Standing Instruction | Delete Standing Instruction



## create5

> PostStandingInstructionsResponse create5(postStandingInstructionsRequest)

Create new Standing Instruction

Ability to create new instruction for transfer of monetary funds from one account to another

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.StandingInstructionsApi;

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

        StandingInstructionsApi apiInstance = new StandingInstructionsApi(defaultClient);
        PostStandingInstructionsRequest postStandingInstructionsRequest = new PostStandingInstructionsRequest(); // PostStandingInstructionsRequest | 
        try {
            PostStandingInstructionsResponse result = apiInstance.create5(postStandingInstructionsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StandingInstructionsApi#create5");
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
 **postStandingInstructionsRequest** | [**PostStandingInstructionsRequest**](PostStandingInstructionsRequest.md)|  |

### Return type

[**PostStandingInstructionsResponse**](PostStandingInstructionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAll19

> GetStandingInstructionsResponse retrieveAll19(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType)

List Standing Instructions

Example Requests:  standinginstructions

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.StandingInstructionsApi;

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

        StandingInstructionsApi apiInstance = new StandingInstructionsApi(defaultClient);
        String sqlSearch = "sqlSearch_example"; // String | sqlSearch
        String externalId = "externalId_example"; // String | externalId
        Integer offset = 56; // Integer | offset
        Integer limit = 56; // Integer | limit
        String orderBy = "orderBy_example"; // String | orderBy
        String sortOrder = "sortOrder_example"; // String | sortOrder
        Integer transferType = 56; // Integer | transferType
        String clientName = "clientName_example"; // String | clientName
        Long clientId = 56L; // Long | clientId
        Long fromAccountId = 56L; // Long | fromAccountId
        Integer fromAccountType = 56; // Integer | fromAccountType
        try {
            GetStandingInstructionsResponse result = apiInstance.retrieveAll19(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StandingInstructionsApi#retrieveAll19");
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
 **sqlSearch** | **String**| sqlSearch | [optional]
 **externalId** | **String**| externalId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **transferType** | **Integer**| transferType | [optional]
 **clientName** | **String**| clientName | [optional]
 **clientId** | **Long**| clientId | [optional]
 **fromAccountId** | **Long**| fromAccountId | [optional]
 **fromAccountType** | **Integer**| fromAccountType | [optional]

### Return type

[**GetStandingInstructionsResponse**](GetStandingInstructionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveOne10

> GetStandingInstructionsStandingInstructionIdResponse retrieveOne10(standingInstructionId, sqlSearch, externalId, offset, limit, orderBy, sortOrder)

Retrieve Standing Instruction

Example Requests :  standinginstructions/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.StandingInstructionsApi;

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

        StandingInstructionsApi apiInstance = new StandingInstructionsApi(defaultClient);
        Long standingInstructionId = 56L; // Long | standingInstructionId
        String sqlSearch = "sqlSearch_example"; // String | sqlSearch
        String externalId = "externalId_example"; // String | externalId
        Integer offset = 56; // Integer | offset
        Integer limit = 56; // Integer | limit
        String orderBy = "orderBy_example"; // String | orderBy
        String sortOrder = "sortOrder_example"; // String | sortOrder
        try {
            GetStandingInstructionsStandingInstructionIdResponse result = apiInstance.retrieveOne10(standingInstructionId, sqlSearch, externalId, offset, limit, orderBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StandingInstructionsApi#retrieveOne10");
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
 **standingInstructionId** | **Long**| standingInstructionId |
 **sqlSearch** | **String**| sqlSearch | [optional]
 **externalId** | **String**| externalId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**GetStandingInstructionsStandingInstructionIdResponse**](GetStandingInstructionsStandingInstructionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## template6

> GetStandingInstructionsTemplateResponse template6(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType, transferType)

Retrieve Standing Instruction Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1&amp;transferType&#x3D;1  standinginstructions/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1&amp;transferType&#x3D;1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.StandingInstructionsApi;

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

        StandingInstructionsApi apiInstance = new StandingInstructionsApi(defaultClient);
        Long fromOfficeId = 56L; // Long | fromOfficeId
        Long fromClientId = 56L; // Long | fromClientId
        Long fromAccountId = 56L; // Long | fromAccountId
        Integer fromAccountType = 56; // Integer | fromAccountType
        Long toOfficeId = 56L; // Long | toOfficeId
        Long toClientId = 56L; // Long | toClientId
        Long toAccountId = 56L; // Long | toAccountId
        Integer toAccountType = 56; // Integer | toAccountType
        Integer transferType = 56; // Integer | transferType
        try {
            GetStandingInstructionsTemplateResponse result = apiInstance.template6(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType, transferType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StandingInstructionsApi#template6");
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
 **fromOfficeId** | **Long**| fromOfficeId | [optional]
 **fromClientId** | **Long**| fromClientId | [optional]
 **fromAccountId** | **Long**| fromAccountId | [optional]
 **fromAccountType** | **Integer**| fromAccountType | [optional]
 **toOfficeId** | **Long**| toOfficeId | [optional]
 **toClientId** | **Long**| toClientId | [optional]
 **toAccountId** | **Long**| toAccountId | [optional]
 **toAccountType** | **Integer**| toAccountType | [optional]
 **transferType** | **Integer**| transferType | [optional]

### Return type

[**GetStandingInstructionsTemplateResponse**](GetStandingInstructionsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## update9

> PutStandingInstructionsStandingInstructionIdResponse update9(standingInstructionId, command, putStandingInstructionsStandingInstructionIdRequest)

Update Standing Instruction | Delete Standing Instruction

Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;update   Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;delete

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.StandingInstructionsApi;

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

        StandingInstructionsApi apiInstance = new StandingInstructionsApi(defaultClient);
        Long standingInstructionId = 56L; // Long | standingInstructionId
        String command = "command_example"; // String | command
        PutStandingInstructionsStandingInstructionIdRequest putStandingInstructionsStandingInstructionIdRequest = new PutStandingInstructionsStandingInstructionIdRequest(); // PutStandingInstructionsStandingInstructionIdRequest | 
        try {
            PutStandingInstructionsStandingInstructionIdResponse result = apiInstance.update9(standingInstructionId, command, putStandingInstructionsStandingInstructionIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StandingInstructionsApi#update9");
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
 **standingInstructionId** | **Long**| standingInstructionId |
 **command** | **String**| command | [optional]
 **putStandingInstructionsStandingInstructionIdRequest** | [**PutStandingInstructionsStandingInstructionIdRequest**](PutStandingInstructionsStandingInstructionIdRequest.md)|  | [optional]

### Return type

[**PutStandingInstructionsStandingInstructionIdResponse**](PutStandingInstructionsStandingInstructionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


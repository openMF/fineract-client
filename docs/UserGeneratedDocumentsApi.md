# UserGeneratedDocumentsApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTemplate**](UserGeneratedDocumentsApi.md#createTemplate) | **POST** templates | Add a UGD
[**deleteTemplate**](UserGeneratedDocumentsApi.md#deleteTemplate) | **DELETE** templates/{templateId} | Delete a UGD
[**getTemplateByTemplate**](UserGeneratedDocumentsApi.md#getTemplateByTemplate) | **GET** templates/{templateId}/template | 
[**mergeTemplate**](UserGeneratedDocumentsApi.md#mergeTemplate) | **POST** templates/{templateId} | 
[**retrieveAll40**](UserGeneratedDocumentsApi.md#retrieveAll40) | **GET** templates | Retrieve all UGDs
[**retrieveOne28**](UserGeneratedDocumentsApi.md#retrieveOne28) | **GET** templates/{templateId} | Retrieve a UGD
[**saveTemplate**](UserGeneratedDocumentsApi.md#saveTemplate) | **PUT** templates/{templateId} | Update a UGD
[**template20**](UserGeneratedDocumentsApi.md#template20) | **GET** templates/template | Retrieve UGD Details Template



## createTemplate

> PostTemplatesResponse createTemplate(postTemplatesRequest)

Add a UGD

Adds a new UGD.  Mandatory Fields name    Example Requests:  templates/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.UserGeneratedDocumentsApi;

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

        UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi(defaultClient);
        PostTemplatesRequest postTemplatesRequest = new PostTemplatesRequest(); // PostTemplatesRequest | 
        try {
            PostTemplatesResponse result = apiInstance.createTemplate(postTemplatesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserGeneratedDocumentsApi#createTemplate");
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
 **postTemplatesRequest** | [**PostTemplatesRequest**](PostTemplatesRequest.md)|  |

### Return type

[**PostTemplatesResponse**](PostTemplatesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteTemplate

> DeleteTemplatesTemplateIdResponse deleteTemplate(templateId)

Delete a UGD

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.UserGeneratedDocumentsApi;

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

        UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi(defaultClient);
        Long templateId = 56L; // Long | templateId
        try {
            DeleteTemplatesTemplateIdResponse result = apiInstance.deleteTemplate(templateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserGeneratedDocumentsApi#deleteTemplate");
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
 **templateId** | **Long**| templateId |

### Return type

[**DeleteTemplatesTemplateIdResponse**](DeleteTemplatesTemplateIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getTemplateByTemplate

> String getTemplateByTemplate(templateId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.UserGeneratedDocumentsApi;

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

        UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi(defaultClient);
        Long templateId = 56L; // Long | 
        try {
            String result = apiInstance.getTemplateByTemplate(templateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserGeneratedDocumentsApi#getTemplateByTemplate");
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
 **templateId** | **Long**|  |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## mergeTemplate

> String mergeTemplate(templateId, body)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.UserGeneratedDocumentsApi;

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

        UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi(defaultClient);
        Long templateId = 56L; // Long | 
        String body = "body_example"; // String | 
        try {
            String result = apiInstance.mergeTemplate(templateId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserGeneratedDocumentsApi#mergeTemplate");
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
 **templateId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## retrieveAll40

> GetTemplatesResponse retrieveAll40(typeId, entityId)

Retrieve all UGDs

Example Requests:  templates  It is also possible to get specific UGDs by entity and type:  templates?type&#x3D;0&amp;entity&#x3D;0 [Entity: Id]      client: 0, loan: 1  [Type: Id]    Document: 0, E-Mail (not yet): 1,  SMS: 2

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.UserGeneratedDocumentsApi;

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

        UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi(defaultClient);
        Integer typeId = -1; // Integer | typeId
        Integer entityId = -1; // Integer | entityId
        try {
            GetTemplatesResponse result = apiInstance.retrieveAll40(typeId, entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserGeneratedDocumentsApi#retrieveAll40");
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
 **typeId** | **Integer**| typeId | [optional] [default to -1]
 **entityId** | **Integer**| entityId | [optional] [default to -1]

### Return type

[**GetTemplatesResponse**](GetTemplatesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveOne28

> GetTemplatesTemplateIdResponse retrieveOne28(templateId)

Retrieve a UGD

Example Requests:  templates/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.UserGeneratedDocumentsApi;

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

        UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi(defaultClient);
        Long templateId = 56L; // Long | templateId
        try {
            GetTemplatesTemplateIdResponse result = apiInstance.retrieveOne28(templateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserGeneratedDocumentsApi#retrieveOne28");
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
 **templateId** | **Long**| templateId |

### Return type

[**GetTemplatesTemplateIdResponse**](GetTemplatesTemplateIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## saveTemplate

> PutTemplatesTemplateIdResponse saveTemplate(templateId, putTemplatesTemplateIdRequest)

Update a UGD

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.UserGeneratedDocumentsApi;

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

        UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi(defaultClient);
        Long templateId = 56L; // Long | templateId
        PutTemplatesTemplateIdRequest putTemplatesTemplateIdRequest = new PutTemplatesTemplateIdRequest(); // PutTemplatesTemplateIdRequest | 
        try {
            PutTemplatesTemplateIdResponse result = apiInstance.saveTemplate(templateId, putTemplatesTemplateIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserGeneratedDocumentsApi#saveTemplate");
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
 **templateId** | **Long**| templateId |
 **putTemplatesTemplateIdRequest** | [**PutTemplatesTemplateIdRequest**](PutTemplatesTemplateIdRequest.md)|  |

### Return type

[**PutTemplatesTemplateIdResponse**](PutTemplatesTemplateIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## template20

> GetTemplatesTemplateResponse template20()

Retrieve UGD Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for UGDs. The UGD data returned consists of any or all of:  ARGUMENTS name String entity String type String text String optional mappers Mapper optional Example Request:  templates/template

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.UserGeneratedDocumentsApi;

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

        UserGeneratedDocumentsApi apiInstance = new UserGeneratedDocumentsApi(defaultClient);
        try {
            GetTemplatesTemplateResponse result = apiInstance.template20();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserGeneratedDocumentsApi#template20");
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

[**GetTemplatesTemplateResponse**](GetTemplatesTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


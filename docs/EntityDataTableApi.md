# EntityDataTableApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEntityDatatableCheck**](EntityDataTableApi.md#createEntityDatatableCheck) | **POST** entityDatatableChecks | Create Entity-Datatable Checks
[**deleteDatatable1**](EntityDataTableApi.md#deleteDatatable1) | **DELETE** entityDatatableChecks/{entityDatatableCheckId} | Delete Entity-Datatable Checks
[**getTemplate**](EntityDataTableApi.md#getTemplate) | **GET** entityDatatableChecks/template | Retrieve Entity-Datatable Checks Template
[**retrieveAll6**](EntityDataTableApi.md#retrieveAll6) | **GET** entityDatatableChecks | List Entity-Datatable Checks



## createEntityDatatableCheck

> PostEntityDatatableChecksTemplateResponse createEntityDatatableCheck(postEntityDatatableChecksTemplateRequest)

Create Entity-Datatable Checks

Mandatory Fields :  entity, status, datatableName  Non-Mandatory Fields :  productId

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.EntityDataTableApi;

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

        EntityDataTableApi apiInstance = new EntityDataTableApi(defaultClient);
        PostEntityDatatableChecksTemplateRequest postEntityDatatableChecksTemplateRequest = new PostEntityDatatableChecksTemplateRequest(); // PostEntityDatatableChecksTemplateRequest | 
        try {
            PostEntityDatatableChecksTemplateResponse result = apiInstance.createEntityDatatableCheck(postEntityDatatableChecksTemplateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EntityDataTableApi#createEntityDatatableCheck");
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
 **postEntityDatatableChecksTemplateRequest** | [**PostEntityDatatableChecksTemplateRequest**](PostEntityDatatableChecksTemplateRequest.md)|  |

### Return type

[**PostEntityDatatableChecksTemplateResponse**](PostEntityDatatableChecksTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteDatatable1

> DeleteEntityDatatableChecksTemplateResponse deleteDatatable1(entityDatatableCheckId, body)

Delete Entity-Datatable Checks

Deletes an existing Entity-Datatable Check

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.EntityDataTableApi;

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

        EntityDataTableApi apiInstance = new EntityDataTableApi(defaultClient);
        Long entityDatatableCheckId = 56L; // Long | entityDatatableCheckId
        String body = "body_example"; // String | 
        try {
            DeleteEntityDatatableChecksTemplateResponse result = apiInstance.deleteDatatable1(entityDatatableCheckId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EntityDataTableApi#deleteDatatable1");
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
 **entityDatatableCheckId** | **Long**| entityDatatableCheckId |
 **body** | **String**|  | [optional]

### Return type

[**DeleteEntityDatatableChecksTemplateResponse**](DeleteEntityDatatableChecksTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getTemplate

> GetEntityDatatableChecksTemplateResponse getTemplate()

Retrieve Entity-Datatable Checks Template

This is a convenience resource useful for building maintenance user interface screens for Entity-Datatable Checks applications. The template data returned consists of:  Allowed description Lists Example Request:  entityDatatableChecks/template

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.EntityDataTableApi;

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

        EntityDataTableApi apiInstance = new EntityDataTableApi(defaultClient);
        try {
            GetEntityDatatableChecksTemplateResponse result = apiInstance.getTemplate();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EntityDataTableApi#getTemplate");
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

[**GetEntityDatatableChecksTemplateResponse**](GetEntityDatatableChecksTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAll6

> List&lt;GetEntityDatatableChecksResponse&gt; retrieveAll6(status, entity, productId, offset, limit)

List Entity-Datatable Checks

The list capability of Entity-Datatable Checks can support pagination.  OPTIONAL ARGUMENTS offset Integer optional, defaults to 0 Indicates the result from which pagination startslimit Integer optional, defaults to 200 Restricts the size of results returned. To override the default and return all entries you must explicitly pass a non-positive integer value for limit e.g. limit&#x3D;0, or limit&#x3D;-1 Example Request:  entityDatatableChecks?offset&#x3D;0&amp;limit&#x3D;15

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.EntityDataTableApi;

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

        EntityDataTableApi apiInstance = new EntityDataTableApi(defaultClient);
        Long status = 56L; // Long | status
        String entity = "entity_example"; // String | entity
        Long productId = 56L; // Long | productId
        Integer offset = 56; // Integer | offset
        Integer limit = 56; // Integer | limit
        try {
            List<GetEntityDatatableChecksResponse> result = apiInstance.retrieveAll6(status, entity, productId, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EntityDataTableApi#retrieveAll6");
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
 **status** | **Long**| status | [optional]
 **entity** | **String**| entity | [optional]
 **productId** | **Long**| productId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**List&lt;GetEntityDatatableChecksResponse&gt;**](GetEntityDatatableChecksResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


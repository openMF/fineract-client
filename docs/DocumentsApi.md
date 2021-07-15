# DocumentsApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocument**](DocumentsApi.md#createDocument) | **POST** {entityType}/{entityId}/documents | Create a Document
[**deleteDocument**](DocumentsApi.md#deleteDocument) | **DELETE** {entityType}/{entityId}/documents/{documentId} | Remove a Document
[**downloadFile**](DocumentsApi.md#downloadFile) | **GET** {entityType}/{entityId}/documents/{documentId}/attachment | Retrieve Binary File associated with Document
[**getDocument**](DocumentsApi.md#getDocument) | **GET** {entityType}/{entityId}/documents/{documentId} | Retrieve a Document
[**retrieveAllDocuments**](DocumentsApi.md#retrieveAllDocuments) | **GET** {entityType}/{entityId}/documents | List documents
[**updateDocument**](DocumentsApi.md#updateDocument) | **PUT** {entityType}/{entityId}/documents/{documentId} | Update a Document



## createDocument

> PostEntityTypeEntityIdDocumentsResponse createDocument(entityType, entityId, contentLength, file, name, description)

Create a Document

Note: A document is created using a Multi-part form upload   Body Parts  name :  Name or summary of the document  description :  Description of the document  file :  The file to be uploaded  Mandatory Fields :  file and description

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        String entityType = "entityType_example"; // String | entityType
        Long entityId = 56L; // Long | entityId
        Long contentLength = 56L; // Long | Content-Length
        FormDataBodyPart file = new FormDataBodyPart(); // FormDataBodyPart | 
        String name = "name_example"; // String | name
        String description = "description_example"; // String | description
        try {
            PostEntityTypeEntityIdDocumentsResponse result = apiInstance.createDocument(entityType, entityId, contentLength, file, name, description);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#createDocument");
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
 **entityType** | **String**| entityType |
 **entityId** | **Long**| entityId |
 **contentLength** | **Long**| Content-Length | [optional]
 **file** | [**FormDataBodyPart**](FormDataBodyPart.md)|  | [optional]
 **name** | **String**| name | [optional]
 **description** | **String**| description | [optional]

### Return type

[**PostEntityTypeEntityIdDocumentsResponse**](PostEntityTypeEntityIdDocumentsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Not Shown (multi-part form data) |  -  |


## deleteDocument

> DeleteEntityTypeEntityIdDocumentsResponse deleteDocument(entityType, entityId, documentId)

Remove a Document

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        String entityType = "entityType_example"; // String | entityType
        Long entityId = 56L; // Long | entityId
        Long documentId = 56L; // Long | documentId
        try {
            DeleteEntityTypeEntityIdDocumentsResponse result = apiInstance.deleteDocument(entityType, entityId, documentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#deleteDocument");
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
 **entityType** | **String**| entityType |
 **entityId** | **Long**| entityId |
 **documentId** | **Long**| documentId |

### Return type

[**DeleteEntityTypeEntityIdDocumentsResponse**](DeleteEntityTypeEntityIdDocumentsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## downloadFile

> downloadFile(entityType, entityId, documentId)

Retrieve Binary File associated with Document

Request used to download the file associated with the document  Example Requests:  clients/1/documents/1/attachment   loans/1/documents/1/attachment

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        String entityType = "entityType_example"; // String | entityType
        Long entityId = 56L; // Long | entityId
        Long documentId = 56L; // Long | documentId
        try {
            apiInstance.downloadFile(entityType, entityId, documentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#downloadFile");
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
 **entityType** | **String**| entityType |
 **entityId** | **Long**| entityId |
 **documentId** | **Long**| documentId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Not Shown: The corresponding Binary file |  -  |


## getDocument

> GetEntityTypeEntityIdDocumentsResponse getDocument(entityType, entityId, documentId)

Retrieve a Document

Example Requests:  clients/1/documents/1   loans/1/documents/1   client_identifiers/1/documents/1?fields&#x3D;name,description

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        String entityType = "entityType_example"; // String | entityType
        Long entityId = 56L; // Long | entityId
        Long documentId = 56L; // Long | documentId
        try {
            GetEntityTypeEntityIdDocumentsResponse result = apiInstance.getDocument(entityType, entityId, documentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#getDocument");
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
 **entityType** | **String**| entityType |
 **entityId** | **Long**| entityId |
 **documentId** | **Long**| documentId |

### Return type

[**GetEntityTypeEntityIdDocumentsResponse**](GetEntityTypeEntityIdDocumentsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllDocuments

> List&lt;GetEntityTypeEntityIdDocumentsResponse&gt; retrieveAllDocuments(entityType, entityId)

List documents

Example Requests:  clients/1/documents  client_identifiers/1/documents  loans/1/documents?fields&#x3D;name,description

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        String entityType = "entityType_example"; // String | entityType
        Long entityId = 56L; // Long | entityId
        try {
            List<GetEntityTypeEntityIdDocumentsResponse> result = apiInstance.retrieveAllDocuments(entityType, entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#retrieveAllDocuments");
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
 **entityType** | **String**| entityType |
 **entityId** | **Long**| entityId |

### Return type

[**List&lt;GetEntityTypeEntityIdDocumentsResponse&gt;**](GetEntityTypeEntityIdDocumentsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateDocument

> PutEntityTypeEntityIdDocumentsResponse updateDocument(entityType, entityId, documentId, contentLength, file, name, description)

Update a Document

Note: A document is updated using a Multi-part form upload  Body Parts name Name or summary of the document description Description of the document file The file to be uploaded

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        String entityType = "entityType_example"; // String | entityType
        Long entityId = 56L; // Long | entityId
        Long documentId = 56L; // Long | documentId
        Long contentLength = 56L; // Long | Content-Length
        FormDataBodyPart file = new FormDataBodyPart(); // FormDataBodyPart | 
        String name = "name_example"; // String | name
        String description = "description_example"; // String | description
        try {
            PutEntityTypeEntityIdDocumentsResponse result = apiInstance.updateDocument(entityType, entityId, documentId, contentLength, file, name, description);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#updateDocument");
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
 **entityType** | **String**| entityType |
 **entityId** | **Long**| entityId |
 **documentId** | **Long**| documentId |
 **contentLength** | **Long**| Content-Length | [optional]
 **file** | [**FormDataBodyPart**](FormDataBodyPart.md)|  | [optional]
 **name** | **String**| name | [optional]
 **description** | **String**| description | [optional]

### Return type

[**PutEntityTypeEntityIdDocumentsResponse**](PutEntityTypeEntityIdDocumentsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Not Shown (multi-part form data) |  -  |


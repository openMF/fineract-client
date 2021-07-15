# NotesApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewNote**](NotesApi.md#addNewNote) | **POST** {resourceType}/{resourceId}/notes | Add a Resource Note
[**deleteNote**](NotesApi.md#deleteNote) | **DELETE** {resourceType}/{resourceId}/notes/{noteId} | Delete a Resource Note
[**retrieveNote**](NotesApi.md#retrieveNote) | **GET** {resourceType}/{resourceId}/notes/{noteId} | Retrieve a Resource Note
[**retrieveNotesByResource**](NotesApi.md#retrieveNotesByResource) | **GET** {resourceType}/{resourceId}/notes | Retrieve a Resource&#39;s description
[**updateNote**](NotesApi.md#updateNote) | **PUT** {resourceType}/{resourceId}/notes/{noteId} | Update a Resource Note



## addNewNote

> PostResourceTypeResourceIdNotesResponse addNewNote(resourceType, resourceId, postResourceTypeResourceIdNotesRequest)

Add a Resource Note

Adds a new note to a supported resource.  Example Requests:  clients/1/notes   groups/1/notes

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.NotesApi;

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

        NotesApi apiInstance = new NotesApi(defaultClient);
        String resourceType = "resourceType_example"; // String | resourceType
        Long resourceId = 56L; // Long | resourceId
        PostResourceTypeResourceIdNotesRequest postResourceTypeResourceIdNotesRequest = new PostResourceTypeResourceIdNotesRequest(); // PostResourceTypeResourceIdNotesRequest | 
        try {
            PostResourceTypeResourceIdNotesResponse result = apiInstance.addNewNote(resourceType, resourceId, postResourceTypeResourceIdNotesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotesApi#addNewNote");
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
 **resourceType** | **String**| resourceType |
 **resourceId** | **Long**| resourceId |
 **postResourceTypeResourceIdNotesRequest** | [**PostResourceTypeResourceIdNotesRequest**](PostResourceTypeResourceIdNotesRequest.md)|  |

### Return type

[**PostResourceTypeResourceIdNotesResponse**](PostResourceTypeResourceIdNotesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteNote

> DeleteResourceTypeResourceIdNotesNoteIdResponse deleteNote(resourceType, resourceId, noteId)

Delete a Resource Note

Deletes a Resource Note

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.NotesApi;

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

        NotesApi apiInstance = new NotesApi(defaultClient);
        String resourceType = "resourceType_example"; // String | resourceType
        Long resourceId = 56L; // Long | resourceId
        Long noteId = 56L; // Long | noteId
        try {
            DeleteResourceTypeResourceIdNotesNoteIdResponse result = apiInstance.deleteNote(resourceType, resourceId, noteId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotesApi#deleteNote");
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
 **resourceType** | **String**| resourceType |
 **resourceId** | **Long**| resourceId |
 **noteId** | **Long**| noteId |

### Return type

[**DeleteResourceTypeResourceIdNotesNoteIdResponse**](DeleteResourceTypeResourceIdNotesNoteIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveNote

> GetResourceTypeResourceIdNotesNoteIdResponse retrieveNote(resourceType, resourceId, noteId)

Retrieve a Resource Note

Retrieves a Resource Note  Example Requests:  clients/1/notes/76   groups/1/notes/20   clients/1/notes/76?fields&#x3D;note,createdOn,createdByUsername   groups/1/notes/20?fields&#x3D;note,createdOn,createdByUsername

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.NotesApi;

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

        NotesApi apiInstance = new NotesApi(defaultClient);
        String resourceType = "resourceType_example"; // String | resourceType
        Long resourceId = 56L; // Long | resourceId
        Long noteId = 56L; // Long | noteId
        try {
            GetResourceTypeResourceIdNotesNoteIdResponse result = apiInstance.retrieveNote(resourceType, resourceId, noteId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotesApi#retrieveNote");
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
 **resourceType** | **String**| resourceType |
 **resourceId** | **Long**| resourceId |
 **noteId** | **Long**| noteId |

### Return type

[**GetResourceTypeResourceIdNotesNoteIdResponse**](GetResourceTypeResourceIdNotesNoteIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveNotesByResource

> List&lt;GetResourceTypeResourceIdNotesResponse&gt; retrieveNotesByResource(resourceType, resourceId)

Retrieve a Resource&#39;s description

Retrieves a Resource&#39;s Notes  Note: Notes are returned in descending createOn order.  Example Requests:  clients/2/notes   groups/2/notes?fields&#x3D;note,createdOn,createdByUsername

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.NotesApi;

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

        NotesApi apiInstance = new NotesApi(defaultClient);
        String resourceType = "resourceType_example"; // String | resourceType
        Long resourceId = 56L; // Long | resourceId
        try {
            List<GetResourceTypeResourceIdNotesResponse> result = apiInstance.retrieveNotesByResource(resourceType, resourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotesApi#retrieveNotesByResource");
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
 **resourceType** | **String**| resourceType |
 **resourceId** | **Long**| resourceId |

### Return type

[**List&lt;GetResourceTypeResourceIdNotesResponse&gt;**](GetResourceTypeResourceIdNotesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateNote

> PutResourceTypeResourceIdNotesNoteIdResponse updateNote(resourceType, resourceId, noteId, putResourceTypeResourceIdNotesNoteIdRequest)

Update a Resource Note

Updates a Resource Note

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.NotesApi;

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

        NotesApi apiInstance = new NotesApi(defaultClient);
        String resourceType = "resourceType_example"; // String | resourceType
        Long resourceId = 56L; // Long | resourceId
        Long noteId = 56L; // Long | noteId
        PutResourceTypeResourceIdNotesNoteIdRequest putResourceTypeResourceIdNotesNoteIdRequest = new PutResourceTypeResourceIdNotesNoteIdRequest(); // PutResourceTypeResourceIdNotesNoteIdRequest | 
        try {
            PutResourceTypeResourceIdNotesNoteIdResponse result = apiInstance.updateNote(resourceType, resourceId, noteId, putResourceTypeResourceIdNotesNoteIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotesApi#updateNote");
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
 **resourceType** | **String**| resourceType |
 **resourceId** | **Long**| resourceId |
 **noteId** | **Long**| noteId |
 **putResourceTypeResourceIdNotesNoteIdRequest** | [**PutResourceTypeResourceIdNotesNoteIdRequest**](PutResourceTypeResourceIdNotesNoteIdRequest.md)|  |

### Return type

[**PutResourceTypeResourceIdNotesNoteIdResponse**](PutResourceTypeResourceIdNotesNoteIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


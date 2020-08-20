# DocumentsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocument**](DocumentsApi.md#createDocument) | **POST** {entityType}/{entityId}/documents | Create a Document
[**deleteDocument**](DocumentsApi.md#deleteDocument) | **DELETE** {entityType}/{entityId}/documents/{documentId} | Remove a Document
[**downloadFile**](DocumentsApi.md#downloadFile) | **GET** {entityType}/{entityId}/documents/{documentId}/attachment | Retrieve Binary File associated with Document
[**getDocument**](DocumentsApi.md#getDocument) | **GET** {entityType}/{entityId}/documents/{documentId} | Retrieve a Document
[**retreiveAllDocuments**](DocumentsApi.md#retreiveAllDocuments) | **GET** {entityType}/{entityId}/documents | List documents
[**updateDocument**](DocumentsApi.md#updateDocument) | **PUT** {entityType}/{entityId}/documents/{documentId} | Update a Document


<a name="createDocument"></a>
# **createDocument**
> PostEntityTypeEntityIdDocumentsResponse createDocument(entityType, entityId, contentLength, file, name, description)

Create a Document

Note: A document is created using a Multi-part form upload   Body Parts  name :  Name or summary of the document  description :  Description of the document  file :  The file to be uploaded  Mandatory Fields :  file and description

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String entityType = "entityType_example"; // String | entityType
Long entityId = 789L; // Long | entityId
Long contentLength = 789L; // Long | Content-Length
File file = new File("/path/to/file.txt"); // File | file
String name = "name_example"; // String | name
String description = "description_example"; // String | description
try {
    PostEntityTypeEntityIdDocumentsResponse result = apiInstance.createDocument(entityType, entityId, contentLength, file, name, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#createDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityType** | **String**| entityType |
 **entityId** | **Long**| entityId |
 **contentLength** | **Long**| Content-Length | [optional]
 **file** | **File**| file | [optional]
 **name** | **String**| name | [optional]
 **description** | **String**| description | [optional]

### Return type

[**PostEntityTypeEntityIdDocumentsResponse**](PostEntityTypeEntityIdDocumentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="deleteDocument"></a>
# **deleteDocument**
> DeleteEntityTypeEntityIdDocumentsResponse deleteDocument(entityType, entityId, documentId)

Remove a Document



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String entityType = "entityType_example"; // String | entityType
Long entityId = 789L; // Long | entityId
Long documentId = 789L; // Long | documentId
try {
    DeleteEntityTypeEntityIdDocumentsResponse result = apiInstance.deleteDocument(entityType, entityId, documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#deleteDocument");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadFile"></a>
# **downloadFile**
> downloadFile(entityType, entityId, documentId)

Retrieve Binary File associated with Document

Request used to download the file associated with the document  Example Requests:  clients/1/documents/1/attachment   loans/1/documents/1/attachment

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String entityType = "entityType_example"; // String | entityType
Long entityId = 789L; // Long | entityId
Long documentId = 789L; // Long | documentId
try {
    apiInstance.downloadFile(entityType, entityId, documentId);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#downloadFile");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="getDocument"></a>
# **getDocument**
> GetEntityTypeEntityIdDocumentsResponse getDocument(entityType, entityId, documentId)

Retrieve a Document

Example Requests:  clients/1/documents/1   loans/1/documents/1   client_identifiers/1/documents/1?fields&#x3D;name,description

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String entityType = "entityType_example"; // String | entityType
Long entityId = 789L; // Long | entityId
Long documentId = 789L; // Long | documentId
try {
    GetEntityTypeEntityIdDocumentsResponse result = apiInstance.getDocument(entityType, entityId, documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#getDocument");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retreiveAllDocuments"></a>
# **retreiveAllDocuments**
> List&lt;GetEntityTypeEntityIdDocumentsResponse&gt; retreiveAllDocuments(entityType, entityId)

List documents

Example Requests:  clients/1/documents  client_identifiers/1/documents  loans/1/documents?fields&#x3D;name,description

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String entityType = "entityType_example"; // String | entityType
Long entityId = 789L; // Long | entityId
try {
    List<GetEntityTypeEntityIdDocumentsResponse> result = apiInstance.retreiveAllDocuments(entityType, entityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#retreiveAllDocuments");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDocument"></a>
# **updateDocument**
> PutEntityTypeEntityIdDocumentsResponse updateDocument(entityType, entityId, documentId, contentLength, file, name, description)

Update a Document

Note: A document is updated using a Multi-part form upload  Body Parts name Name or summary of the document description Description of the document file The file to be uploaded

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String entityType = "entityType_example"; // String | entityType
Long entityId = 789L; // Long | entityId
Long documentId = 789L; // Long | documentId
Long contentLength = 789L; // Long | Content-Length
File file = new File("/path/to/file.txt"); // File | file
String name = "name_example"; // String | name
String description = "description_example"; // String | description
try {
    PutEntityTypeEntityIdDocumentsResponse result = apiInstance.updateDocument(entityType, entityId, documentId, contentLength, file, name, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#updateDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityType** | **String**| entityType |
 **entityId** | **Long**| entityId |
 **documentId** | **Long**| documentId |
 **contentLength** | **Long**| Content-Length | [optional]
 **file** | **File**| file | [optional]
 **name** | **String**| name | [optional]
 **description** | **String**| description | [optional]

### Return type

[**PutEntityTypeEntityIdDocumentsResponse**](PutEntityTypeEntityIdDocumentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


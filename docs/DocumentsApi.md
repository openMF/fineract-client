# DocumentsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

DocumentsApi apiService = defaultClient.createService(DocumentsApi.class);

// Initialize these parameters earlier.
Call<PostEntityTypeEntityIdDocumentsResponse> call = apiService.createDocument(entityType, entityId, contentLength, file, name, description);
call.enqueue(new Callback<PostEntityTypeEntityIdDocumentsResponse>() {
    @Override
    public void onResponse(Call<PostEntityTypeEntityIdDocumentsResponse> call, Response<PostEntityTypeEntityIdDocumentsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostEntityTypeEntityIdDocumentsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

DocumentsApi apiService = defaultClient.createService(DocumentsApi.class);

// Initialize these parameters earlier.
Call<DeleteEntityTypeEntityIdDocumentsResponse> call = apiService.deleteDocument(entityType, entityId, documentId);
call.enqueue(new Callback<DeleteEntityTypeEntityIdDocumentsResponse>() {
    @Override
    public void onResponse(Call<DeleteEntityTypeEntityIdDocumentsResponse> call, Response<DeleteEntityTypeEntityIdDocumentsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteEntityTypeEntityIdDocumentsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

DocumentsApi apiService = defaultClient.createService(DocumentsApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.downloadFile(entityType, entityId, documentId);
call.enqueue(new Callback<>() {
    @Override
    public void onResponse(Call<> call, Response<> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

DocumentsApi apiService = defaultClient.createService(DocumentsApi.class);

// Initialize these parameters earlier.
Call<GetEntityTypeEntityIdDocumentsResponse> call = apiService.getDocument(entityType, entityId, documentId);
call.enqueue(new Callback<GetEntityTypeEntityIdDocumentsResponse>() {
    @Override
    public void onResponse(Call<GetEntityTypeEntityIdDocumentsResponse> call, Response<GetEntityTypeEntityIdDocumentsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetEntityTypeEntityIdDocumentsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

DocumentsApi apiService = defaultClient.createService(DocumentsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetEntityTypeEntityIdDocumentsResponse&gt;> call = apiService.retreiveAllDocuments(entityType, entityId);
call.enqueue(new Callback<List&lt;GetEntityTypeEntityIdDocumentsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetEntityTypeEntityIdDocumentsResponse&gt;> call, Response<List&lt;GetEntityTypeEntityIdDocumentsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetEntityTypeEntityIdDocumentsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

DocumentsApi apiService = defaultClient.createService(DocumentsApi.class);

// Initialize these parameters earlier.
Call<PutEntityTypeEntityIdDocumentsResponse> call = apiService.updateDocument(entityType, entityId, documentId, contentLength, file, name, description);
call.enqueue(new Callback<PutEntityTypeEntityIdDocumentsResponse>() {
    @Override
    public void onResponse(Call<PutEntityTypeEntityIdDocumentsResponse> call, Response<PutEntityTypeEntityIdDocumentsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutEntityTypeEntityIdDocumentsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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


# NotesApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewNote**](NotesApi.md#addNewNote) | **POST** {resourceType}/{resourceId}/notes | Add a Resource Note
[**deleteNote**](NotesApi.md#deleteNote) | **DELETE** {resourceType}/{resourceId}/notes/{noteId} | Delete a Resource Note
[**retrieveNote**](NotesApi.md#retrieveNote) | **GET** {resourceType}/{resourceId}/notes/{noteId} | Retrieve a Resource Note
[**retrieveNotesByResource**](NotesApi.md#retrieveNotesByResource) | **GET** {resourceType}/{resourceId}/notes | Retrieve a Resource&#39;s Notes
[**updateNote**](NotesApi.md#updateNote) | **PUT** {resourceType}/{resourceId}/notes/{noteId} | Update a Resource Note


<a name="addNewNote"></a>
# **addNewNote**
> PostResourceTypeResourceIdNotesResponse addNewNote(resourceType, resourceId, body)

Add a Resource Note

Adds a new note to a supported resource.  Example Requests:  clients/1/notes   groups/1/notes

### Example
```java

NotesApi apiService = defaultClient.createService(NotesApi.class);

// Initialize these parameters earlier.
Call<PostResourceTypeResourceIdNotesResponse> call = apiService.addNewNote(resourceType, resourceId, body);
call.enqueue(new Callback<PostResourceTypeResourceIdNotesResponse>() {
    @Override
    public void onResponse(Call<PostResourceTypeResourceIdNotesResponse> call, Response<PostResourceTypeResourceIdNotesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostResourceTypeResourceIdNotesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **resourceType** | **String**| resourceType |
 **resourceId** | **Long**| resourceId |
 **body** | [**PostResourceTypeResourceIdNotesRequest**](PostResourceTypeResourceIdNotesRequest.md)| body |

### Return type

[**PostResourceTypeResourceIdNotesResponse**](PostResourceTypeResourceIdNotesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNote"></a>
# **deleteNote**
> DeleteResourceTypeResourceIdNotesNoteIdResponse deleteNote(resourceType, resourceId, noteId)

Delete a Resource Note

Deletes a Resource Note

### Example
```java

NotesApi apiService = defaultClient.createService(NotesApi.class);

// Initialize these parameters earlier.
Call<DeleteResourceTypeResourceIdNotesNoteIdResponse> call = apiService.deleteNote(resourceType, resourceId, noteId);
call.enqueue(new Callback<DeleteResourceTypeResourceIdNotesNoteIdResponse>() {
    @Override
    public void onResponse(Call<DeleteResourceTypeResourceIdNotesNoteIdResponse> call, Response<DeleteResourceTypeResourceIdNotesNoteIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteResourceTypeResourceIdNotesNoteIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **resourceType** | **String**| resourceType |
 **resourceId** | **Long**| resourceId |
 **noteId** | **Long**| noteId |

### Return type

[**DeleteResourceTypeResourceIdNotesNoteIdResponse**](DeleteResourceTypeResourceIdNotesNoteIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveNote"></a>
# **retrieveNote**
> GetResourceTypeResourceIdNotesNoteIdResponse retrieveNote(resourceType, resourceId, noteId)

Retrieve a Resource Note

Retrieves a Resource Note  Example Requests:  clients/1/notes/76   groups/1/notes/20   clients/1/notes/76?fields&#x3D;note,createdOn,createdByUsername   groups/1/notes/20?fields&#x3D;note,createdOn,createdByUsername

### Example
```java

NotesApi apiService = defaultClient.createService(NotesApi.class);

// Initialize these parameters earlier.
Call<GetResourceTypeResourceIdNotesNoteIdResponse> call = apiService.retrieveNote(resourceType, resourceId, noteId);
call.enqueue(new Callback<GetResourceTypeResourceIdNotesNoteIdResponse>() {
    @Override
    public void onResponse(Call<GetResourceTypeResourceIdNotesNoteIdResponse> call, Response<GetResourceTypeResourceIdNotesNoteIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetResourceTypeResourceIdNotesNoteIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **resourceType** | **String**| resourceType |
 **resourceId** | **Long**| resourceId |
 **noteId** | **Long**| noteId |

### Return type

[**GetResourceTypeResourceIdNotesNoteIdResponse**](GetResourceTypeResourceIdNotesNoteIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveNotesByResource"></a>
# **retrieveNotesByResource**
> List&lt;GetResourceTypeResourceIdNotesResponse&gt; retrieveNotesByResource(resourceType, resourceId)

Retrieve a Resource&#39;s Notes

Retrieves a Resource&#39;s Notes  Note: Notes are returned in descending createOn order.  Example Requests:  clients/2/notes   groups/2/notes?fields&#x3D;note,createdOn,createdByUsername

### Example
```java

NotesApi apiService = defaultClient.createService(NotesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetResourceTypeResourceIdNotesResponse&gt;> call = apiService.retrieveNotesByResource(resourceType, resourceId);
call.enqueue(new Callback<List&lt;GetResourceTypeResourceIdNotesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetResourceTypeResourceIdNotesResponse&gt;> call, Response<List&lt;GetResourceTypeResourceIdNotesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetResourceTypeResourceIdNotesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **resourceType** | **String**| resourceType |
 **resourceId** | **Long**| resourceId |

### Return type

[**List&lt;GetResourceTypeResourceIdNotesResponse&gt;**](GetResourceTypeResourceIdNotesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNote"></a>
# **updateNote**
> PutResourceTypeResourceIdNotesNoteIdResponse updateNote(resourceType, resourceId, noteId, body)

Update a Resource Note

Updates a Resource Note

### Example
```java

NotesApi apiService = defaultClient.createService(NotesApi.class);

// Initialize these parameters earlier.
Call<PutResourceTypeResourceIdNotesNoteIdResponse> call = apiService.updateNote(resourceType, resourceId, noteId, body);
call.enqueue(new Callback<PutResourceTypeResourceIdNotesNoteIdResponse>() {
    @Override
    public void onResponse(Call<PutResourceTypeResourceIdNotesNoteIdResponse> call, Response<PutResourceTypeResourceIdNotesNoteIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutResourceTypeResourceIdNotesNoteIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **resourceType** | **String**| resourceType |
 **resourceId** | **Long**| resourceId |
 **noteId** | **Long**| noteId |
 **body** | [**PutResourceTypeResourceIdNotesNoteIdRequest**](PutResourceTypeResourceIdNotesNoteIdRequest.md)| body |

### Return type

[**PutResourceTypeResourceIdNotesNoteIdResponse**](PutResourceTypeResourceIdNotesNoteIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


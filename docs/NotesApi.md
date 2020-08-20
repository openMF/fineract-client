# NotesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.NotesApi;


NotesApi apiInstance = new NotesApi();
String resourceType = "resourceType_example"; // String | resourceType
Long resourceId = 789L; // Long | resourceId
PostResourceTypeResourceIdNotesRequest body = new PostResourceTypeResourceIdNotesRequest(); // PostResourceTypeResourceIdNotesRequest | body
try {
    PostResourceTypeResourceIdNotesResponse result = apiInstance.addNewNote(resourceType, resourceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#addNewNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.NotesApi;


NotesApi apiInstance = new NotesApi();
String resourceType = "resourceType_example"; // String | resourceType
Long resourceId = 789L; // Long | resourceId
Long noteId = 789L; // Long | noteId
try {
    DeleteResourceTypeResourceIdNotesNoteIdResponse result = apiInstance.deleteNote(resourceType, resourceId, noteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#deleteNote");
    e.printStackTrace();
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.NotesApi;


NotesApi apiInstance = new NotesApi();
String resourceType = "resourceType_example"; // String | resourceType
Long resourceId = 789L; // Long | resourceId
Long noteId = 789L; // Long | noteId
try {
    GetResourceTypeResourceIdNotesNoteIdResponse result = apiInstance.retrieveNote(resourceType, resourceId, noteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#retrieveNote");
    e.printStackTrace();
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.NotesApi;


NotesApi apiInstance = new NotesApi();
String resourceType = "resourceType_example"; // String | resourceType
Long resourceId = 789L; // Long | resourceId
try {
    List<GetResourceTypeResourceIdNotesResponse> result = apiInstance.retrieveNotesByResource(resourceType, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#retrieveNotesByResource");
    e.printStackTrace();
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.NotesApi;


NotesApi apiInstance = new NotesApi();
String resourceType = "resourceType_example"; // String | resourceType
Long resourceId = 789L; // Long | resourceId
Long noteId = 789L; // Long | noteId
PutResourceTypeResourceIdNotesNoteIdRequest body = new PutResourceTypeResourceIdNotesNoteIdRequest(); // PutResourceTypeResourceIdNotesNoteIdRequest | body
try {
    PutResourceTypeResourceIdNotesNoteIdResponse result = apiInstance.updateNote(resourceType, resourceId, noteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#updateNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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


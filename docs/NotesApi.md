# NotesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addNewNote**](NotesApi.md#addNewNote) | **POST** v1/{resourceType}/{resourceId}/notes | Add a Resource Note |
| [**deleteNote**](NotesApi.md#deleteNote) | **DELETE** v1/{resourceType}/{resourceId}/notes/{noteId} | Delete a Resource Note |
| [**retrieveNote**](NotesApi.md#retrieveNote) | **GET** v1/{resourceType}/{resourceId}/notes/{noteId} | Retrieve a Resource Note |
| [**retrieveNotesByResource**](NotesApi.md#retrieveNotesByResource) | **GET** v1/{resourceType}/{resourceId}/notes | Retrieve a Resource&#39;s description |
| [**updateNote**](NotesApi.md#updateNote) | **PUT** v1/{resourceType}/{resourceId}/notes/{noteId} | Update a Resource Note |



Add a Resource Note

Adds a new note to a supported resource.  Example Requests:  clients/1/notes   groups/1/notes

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(NotesApi::class.java)
val resourceType : kotlin.String = resourceType_example // kotlin.String | resourceType
val resourceId : kotlin.Long = 789 // kotlin.Long | resourceId
val postResourceTypeResourceIdNotesRequest : PostResourceTypeResourceIdNotesRequest =  // PostResourceTypeResourceIdNotesRequest | 

launch(Dispatchers.IO) {
    val result : PostResourceTypeResourceIdNotesResponse = webService.addNewNote(resourceType, resourceId, postResourceTypeResourceIdNotesRequest)
}
```

### Parameters
| **resourceType** | **kotlin.String**| resourceType | |
| **resourceId** | **kotlin.Long**| resourceId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postResourceTypeResourceIdNotesRequest** | [**PostResourceTypeResourceIdNotesRequest**](PostResourceTypeResourceIdNotesRequest.md)|  | |

### Return type

[**PostResourceTypeResourceIdNotesResponse**](PostResourceTypeResourceIdNotesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Resource Note

Deletes a Resource Note

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(NotesApi::class.java)
val resourceType : kotlin.String = resourceType_example // kotlin.String | resourceType
val resourceId : kotlin.Long = 789 // kotlin.Long | resourceId
val noteId : kotlin.Long = 789 // kotlin.Long | noteId

launch(Dispatchers.IO) {
    val result : DeleteResourceTypeResourceIdNotesNoteIdResponse = webService.deleteNote(resourceType, resourceId, noteId)
}
```

### Parameters
| **resourceType** | **kotlin.String**| resourceType | |
| **resourceId** | **kotlin.Long**| resourceId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **noteId** | **kotlin.Long**| noteId | |

### Return type

[**DeleteResourceTypeResourceIdNotesNoteIdResponse**](DeleteResourceTypeResourceIdNotesNoteIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Resource Note

Retrieves a Resource Note  Example Requests:  clients/1/notes/76   groups/1/notes/20   clients/1/notes/76?fields&#x3D;note,createdOn,createdByUsername   groups/1/notes/20?fields&#x3D;note,createdOn,createdByUsername

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(NotesApi::class.java)
val resourceType : kotlin.String = resourceType_example // kotlin.String | resourceType
val resourceId : kotlin.Long = 789 // kotlin.Long | resourceId
val noteId : kotlin.Long = 789 // kotlin.Long | noteId

launch(Dispatchers.IO) {
    val result : GetResourceTypeResourceIdNotesNoteIdResponse = webService.retrieveNote(resourceType, resourceId, noteId)
}
```

### Parameters
| **resourceType** | **kotlin.String**| resourceType | |
| **resourceId** | **kotlin.Long**| resourceId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **noteId** | **kotlin.Long**| noteId | |

### Return type

[**GetResourceTypeResourceIdNotesNoteIdResponse**](GetResourceTypeResourceIdNotesNoteIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Resource&#39;s description

Retrieves a Resource&#39;s Notes  Note: Notes are returned in descending createOn order.  Example Requests:  clients/2/notes   groups/2/notes?fields&#x3D;note,createdOn,createdByUsername

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(NotesApi::class.java)
val resourceType : kotlin.String = resourceType_example // kotlin.String | resourceType
val resourceId : kotlin.Long = 789 // kotlin.Long | resourceId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetResourceTypeResourceIdNotesResponse> = webService.retrieveNotesByResource(resourceType, resourceId)
}
```

### Parameters
| **resourceType** | **kotlin.String**| resourceType | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resourceId** | **kotlin.Long**| resourceId | |

### Return type

[**kotlin.collections.List&lt;GetResourceTypeResourceIdNotesResponse&gt;**](GetResourceTypeResourceIdNotesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Resource Note

Updates a Resource Note

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(NotesApi::class.java)
val resourceType : kotlin.String = resourceType_example // kotlin.String | resourceType
val resourceId : kotlin.Long = 789 // kotlin.Long | resourceId
val noteId : kotlin.Long = 789 // kotlin.Long | noteId
val putResourceTypeResourceIdNotesNoteIdRequest : PutResourceTypeResourceIdNotesNoteIdRequest =  // PutResourceTypeResourceIdNotesNoteIdRequest | 

launch(Dispatchers.IO) {
    val result : PutResourceTypeResourceIdNotesNoteIdResponse = webService.updateNote(resourceType, resourceId, noteId, putResourceTypeResourceIdNotesNoteIdRequest)
}
```

### Parameters
| **resourceType** | **kotlin.String**| resourceType | |
| **resourceId** | **kotlin.Long**| resourceId | |
| **noteId** | **kotlin.Long**| noteId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putResourceTypeResourceIdNotesNoteIdRequest** | [**PutResourceTypeResourceIdNotesNoteIdRequest**](PutResourceTypeResourceIdNotesNoteIdRequest.md)|  | |

### Return type

[**PutResourceTypeResourceIdNotesNoteIdResponse**](PutResourceTypeResourceIdNotesNoteIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


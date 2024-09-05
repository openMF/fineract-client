# DocumentsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createDocument**](DocumentsApi.md#createDocument) | **POST** v1/{entityType}/{entityId}/documents | Create a Document |
| [**deleteDocument**](DocumentsApi.md#deleteDocument) | **DELETE** v1/{entityType}/{entityId}/documents/{documentId} | Remove a Document |
| [**downloadFile**](DocumentsApi.md#downloadFile) | **GET** v1/{entityType}/{entityId}/documents/{documentId}/attachment | Retrieve Binary File associated with Document |
| [**getDocument**](DocumentsApi.md#getDocument) | **GET** v1/{entityType}/{entityId}/documents/{documentId} | Retrieve a Document |
| [**retrieveAllDocuments**](DocumentsApi.md#retrieveAllDocuments) | **GET** v1/{entityType}/{entityId}/documents | List documents |
| [**updateDocument**](DocumentsApi.md#updateDocument) | **PUT** v1/{entityType}/{entityId}/documents/{documentId} | Update a Document |



Create a Document

Note: A document is created using a Multi-part form upload   Body Parts  name :  Name or summary of the document  description :  Description of the document  file :  The file to be uploaded  Mandatory Fields :  file and description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DocumentsApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | entityType
val entityId : kotlin.Long = 789 // kotlin.Long | entityId
val contentLength : kotlin.Long = 789 // kotlin.Long | Content-Length
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : PostEntityTypeEntityIdDocumentsResponse = webService.createDocument(entityType, entityId, contentLength, dateFormat, description, locale, name, uploadedInputStream)
}
```

### Parameters
| **entityType** | **kotlin.String**| entityType | |
| **entityId** | **kotlin.Long**| entityId | |
| **contentLength** | **kotlin.Long**| Content-Length | [optional] |
| **dateFormat** | **kotlin.String**|  | [optional] |
| **description** | **kotlin.String**|  | [optional] |
| **locale** | **kotlin.String**|  | [optional] |
| **name** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uploadedInputStream** | **java.io.File**|  | [optional] |

### Return type

[**PostEntityTypeEntityIdDocumentsResponse**](PostEntityTypeEntityIdDocumentsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


Remove a Document

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DocumentsApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | entityType
val entityId : kotlin.Long = 789 // kotlin.Long | entityId
val documentId : kotlin.Long = 789 // kotlin.Long | documentId

launch(Dispatchers.IO) {
    val result : DeleteEntityTypeEntityIdDocumentsResponse = webService.deleteDocument(entityType, entityId, documentId)
}
```

### Parameters
| **entityType** | **kotlin.String**| entityType | |
| **entityId** | **kotlin.Long**| entityId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documentId** | **kotlin.Long**| documentId | |

### Return type

[**DeleteEntityTypeEntityIdDocumentsResponse**](DeleteEntityTypeEntityIdDocumentsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Binary File associated with Document

Request used to download the file associated with the document  Example Requests:  clients/1/documents/1/attachment   loans/1/documents/1/attachment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DocumentsApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | entityType
val entityId : kotlin.Long = 789 // kotlin.Long | entityId
val documentId : kotlin.Long = 789 // kotlin.Long | documentId

launch(Dispatchers.IO) {
    webService.downloadFile(entityType, entityId, documentId)
}
```

### Parameters
| **entityType** | **kotlin.String**| entityType | |
| **entityId** | **kotlin.Long**| entityId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documentId** | **kotlin.Long**| documentId | |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


Retrieve a Document

Example Requests:  clients/1/documents/1   loans/1/documents/1   client_identifiers/1/documents/1?fields&#x3D;name,description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DocumentsApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | entityType
val entityId : kotlin.Long = 789 // kotlin.Long | entityId
val documentId : kotlin.Long = 789 // kotlin.Long | documentId

launch(Dispatchers.IO) {
    val result : GetEntityTypeEntityIdDocumentsResponse = webService.getDocument(entityType, entityId, documentId)
}
```

### Parameters
| **entityType** | **kotlin.String**| entityType | |
| **entityId** | **kotlin.Long**| entityId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documentId** | **kotlin.Long**| documentId | |

### Return type

[**GetEntityTypeEntityIdDocumentsResponse**](GetEntityTypeEntityIdDocumentsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List documents

Example Requests:  clients/1/documents  client_identifiers/1/documents  loans/1/documents?fields&#x3D;name,description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DocumentsApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | entityType
val entityId : kotlin.Long = 789 // kotlin.Long | entityId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetEntityTypeEntityIdDocumentsResponse> = webService.retrieveAllDocuments(entityType, entityId)
}
```

### Parameters
| **entityType** | **kotlin.String**| entityType | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.Long**| entityId | |

### Return type

[**kotlin.collections.List&lt;GetEntityTypeEntityIdDocumentsResponse&gt;**](GetEntityTypeEntityIdDocumentsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Document

Note: A document is updated using a Multi-part form upload  Body Parts name Name or summary of the document description Description of the document file The file to be uploaded

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DocumentsApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | entityType
val entityId : kotlin.Long = 789 // kotlin.Long | entityId
val documentId : kotlin.Long = 789 // kotlin.Long | documentId
val contentLength : kotlin.Long = 789 // kotlin.Long | Content-Length
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val description : kotlin.String = description_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : PutEntityTypeEntityIdDocumentsResponse = webService.updateDocument(entityType, entityId, documentId, contentLength, dateFormat, description, locale, name, uploadedInputStream)
}
```

### Parameters
| **entityType** | **kotlin.String**| entityType | |
| **entityId** | **kotlin.Long**| entityId | |
| **documentId** | **kotlin.Long**| documentId | |
| **contentLength** | **kotlin.Long**| Content-Length | [optional] |
| **dateFormat** | **kotlin.String**|  | [optional] |
| **description** | **kotlin.String**|  | [optional] |
| **locale** | **kotlin.String**|  | [optional] |
| **name** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uploadedInputStream** | **java.io.File**|  | [optional] |

### Return type

[**PutEntityTypeEntityIdDocumentsResponse**](PutEntityTypeEntityIdDocumentsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


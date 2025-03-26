# BulkImportApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getOutputTemplate**](BulkImportApi.md#getOutputTemplate) | **GET** v1/imports/downloadOutputTemplate |  |
| [**retrieveImportDocuments**](BulkImportApi.md#retrieveImportDocuments) | **GET** v1/imports |  |
| [**retriveOutputTemplateLocation**](BulkImportApi.md#retriveOutputTemplateLocation) | **GET** v1/imports/getOutputTemplateLocation |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(BulkImportApi::class.java)
val importDocumentId : kotlin.String = importDocumentId_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getOutputTemplate(importDocumentId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **importDocumentId** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(BulkImportApi::class.java)
val entityType : kotlin.String = entityType_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveImportDocuments(entityType)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityType** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(BulkImportApi::class.java)
val importDocumentId : kotlin.String = importDocumentId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retriveOutputTemplateLocation(importDocumentId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **importDocumentId** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


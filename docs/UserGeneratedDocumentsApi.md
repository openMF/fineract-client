# UserGeneratedDocumentsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTemplate**](UserGeneratedDocumentsApi.md#createTemplate) | **POST** v1/templates | Add a UGD |
| [**deleteTemplate**](UserGeneratedDocumentsApi.md#deleteTemplate) | **DELETE** v1/templates/{templateId} | Delete a UGD |
| [**getTemplateByTemplate**](UserGeneratedDocumentsApi.md#getTemplateByTemplate) | **GET** v1/templates/{templateId}/template |  |
| [**mergeTemplate**](UserGeneratedDocumentsApi.md#mergeTemplate) | **POST** v1/templates/{templateId} |  |
| [**retrieveAll40**](UserGeneratedDocumentsApi.md#retrieveAll40) | **GET** v1/templates | Retrieve all UGDs |
| [**retrieveOne30**](UserGeneratedDocumentsApi.md#retrieveOne30) | **GET** v1/templates/{templateId} | Retrieve a UGD |
| [**saveTemplate**](UserGeneratedDocumentsApi.md#saveTemplate) | **PUT** v1/templates/{templateId} | Update a UGD |
| [**template20**](UserGeneratedDocumentsApi.md#template20) | **GET** v1/templates/template | Retrieve UGD Details Template |



Add a UGD

Adds a new UGD.  Mandatory Fields name    Example Requests:  templates/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(UserGeneratedDocumentsApi::class.java)
val postTemplatesRequest : PostTemplatesRequest =  // PostTemplatesRequest | 

launch(Dispatchers.IO) {
    val result : PostTemplatesResponse = webService.createTemplate(postTemplatesRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postTemplatesRequest** | [**PostTemplatesRequest**](PostTemplatesRequest.md)|  | |

### Return type

[**PostTemplatesResponse**](PostTemplatesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a UGD

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(UserGeneratedDocumentsApi::class.java)
val templateId : kotlin.Long = 789 // kotlin.Long | templateId

launch(Dispatchers.IO) {
    val result : DeleteTemplatesTemplateIdResponse = webService.deleteTemplate(templateId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateId** | **kotlin.Long**| templateId | |

### Return type

[**DeleteTemplatesTemplateIdResponse**](DeleteTemplatesTemplateIdResponse.md)

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
val webService = apiClient.createWebservice(UserGeneratedDocumentsApi::class.java)
val templateId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getTemplateByTemplate(templateId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateId** | **kotlin.Long**|  | |

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
val webService = apiClient.createWebservice(UserGeneratedDocumentsApi::class.java)
val templateId : kotlin.Long = 789 // kotlin.Long | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.mergeTemplate(templateId, body)
}
```

### Parameters
| **templateId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html


Retrieve all UGDs

Example Requests:  templates  It is also possible to get specific UGDs by entity and type:  templates?type&#x3D;0&amp;entity&#x3D;0 [Entity: Id]      client: 0, loan: 1  [Type: Id]    Document: 0, E-Mail (not yet): 1,  SMS: 2

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(UserGeneratedDocumentsApi::class.java)
val typeId : kotlin.Int = 56 // kotlin.Int | typeId
val entityId : kotlin.Int = 56 // kotlin.Int | entityId

launch(Dispatchers.IO) {
    val result : GetTemplatesResponse = webService.retrieveAll40(typeId, entityId)
}
```

### Parameters
| **typeId** | **kotlin.Int**| typeId | [optional] [default to -1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.Int**| entityId | [optional] [default to -1] |

### Return type

[**GetTemplatesResponse**](GetTemplatesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a UGD

Example Requests:  templates/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(UserGeneratedDocumentsApi::class.java)
val templateId : kotlin.Long = 789 // kotlin.Long | templateId

launch(Dispatchers.IO) {
    val result : GetTemplatesTemplateIdResponse = webService.retrieveOne30(templateId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateId** | **kotlin.Long**| templateId | |

### Return type

[**GetTemplatesTemplateIdResponse**](GetTemplatesTemplateIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a UGD

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(UserGeneratedDocumentsApi::class.java)
val templateId : kotlin.Long = 789 // kotlin.Long | templateId
val putTemplatesTemplateIdRequest : PutTemplatesTemplateIdRequest =  // PutTemplatesTemplateIdRequest | 

launch(Dispatchers.IO) {
    val result : PutTemplatesTemplateIdResponse = webService.saveTemplate(templateId, putTemplatesTemplateIdRequest)
}
```

### Parameters
| **templateId** | **kotlin.Long**| templateId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putTemplatesTemplateIdRequest** | [**PutTemplatesTemplateIdRequest**](PutTemplatesTemplateIdRequest.md)|  | |

### Return type

[**PutTemplatesTemplateIdResponse**](PutTemplatesTemplateIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve UGD Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for UGDs. The UGD data returned consists of any or all of:  ARGUMENTS name String entity String type String text String optional mappers Mapper optional Example Request:  templates/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(UserGeneratedDocumentsApi::class.java)

launch(Dispatchers.IO) {
    val result : GetTemplatesTemplateResponse = webService.template20()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetTemplatesTemplateResponse**](GetTemplatesTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


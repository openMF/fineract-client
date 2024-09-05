# EntityDataTableApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createEntityDatatableCheck**](EntityDataTableApi.md#createEntityDatatableCheck) | **POST** v1/entityDatatableChecks | Create Entity-Datatable Checks |
| [**deleteDatatable1**](EntityDataTableApi.md#deleteDatatable1) | **DELETE** v1/entityDatatableChecks/{entityDatatableCheckId} | Delete Entity-Datatable Checks |
| [**getTemplate**](EntityDataTableApi.md#getTemplate) | **GET** v1/entityDatatableChecks/template | Retrieve Entity-Datatable Checks Template |
| [**retrieveAll6**](EntityDataTableApi.md#retrieveAll6) | **GET** v1/entityDatatableChecks | List Entity-Datatable Checks |



Create Entity-Datatable Checks

Mandatory Fields :  entity, status, datatableName  Non-Mandatory Fields :  productId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(EntityDataTableApi::class.java)
val postEntityDatatableChecksTemplateRequest : PostEntityDatatableChecksTemplateRequest =  // PostEntityDatatableChecksTemplateRequest | 

launch(Dispatchers.IO) {
    val result : PostEntityDatatableChecksTemplateResponse = webService.createEntityDatatableCheck(postEntityDatatableChecksTemplateRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postEntityDatatableChecksTemplateRequest** | [**PostEntityDatatableChecksTemplateRequest**](PostEntityDatatableChecksTemplateRequest.md)|  | |

### Return type

[**PostEntityDatatableChecksTemplateResponse**](PostEntityDatatableChecksTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete Entity-Datatable Checks

Deletes an existing Entity-Datatable Check

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(EntityDataTableApi::class.java)
val entityDatatableCheckId : kotlin.Long = 789 // kotlin.Long | entityDatatableCheckId
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : DeleteEntityDatatableChecksTemplateResponse = webService.deleteDatatable1(entityDatatableCheckId, body)
}
```

### Parameters
| **entityDatatableCheckId** | **kotlin.Long**| entityDatatableCheckId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

[**DeleteEntityDatatableChecksTemplateResponse**](DeleteEntityDatatableChecksTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve Entity-Datatable Checks Template

This is a convenience resource useful for building maintenance user interface screens for Entity-Datatable Checks applications. The template data returned consists of:  Allowed description Lists Example Request:  entityDatatableChecks/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(EntityDataTableApi::class.java)

launch(Dispatchers.IO) {
    val result : GetEntityDatatableChecksTemplateResponse = webService.getTemplate()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetEntityDatatableChecksTemplateResponse**](GetEntityDatatableChecksTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Entity-Datatable Checks

The list capability of Entity-Datatable Checks can support pagination.  OPTIONAL ARGUMENTS offset Integer optional, defaults to 0 Indicates the result from which pagination startslimit Integer optional, defaults to 200 Restricts the size of results returned. To override the default and return all entries you must explicitly pass a non-positive integer value for limit e.g. limit&#x3D;0, or limit&#x3D;-1 Example Request:  entityDatatableChecks?offset&#x3D;0&amp;limit&#x3D;15

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(EntityDataTableApi::class.java)
val status : kotlin.Long = 789 // kotlin.Long | status
val entity : kotlin.String = entity_example // kotlin.String | entity
val productId : kotlin.Long = 789 // kotlin.Long | productId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetEntityDatatableChecksResponse> = webService.retrieveAll6(status, entity, productId, offset, limit)
}
```

### Parameters
| **status** | **kotlin.Long**| status | [optional] |
| **entity** | **kotlin.String**| entity | [optional] |
| **productId** | **kotlin.Long**| productId | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| limit | [optional] |

### Return type

[**kotlin.collections.List&lt;GetEntityDatatableChecksResponse&gt;**](GetEntityDatatableChecksResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


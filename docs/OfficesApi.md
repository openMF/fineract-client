# OfficesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createOffice**](OfficesApi.md#createOffice) | **POST** v1/offices | Create an Office |
| [**getOfficeTemplate**](OfficesApi.md#getOfficeTemplate) | **GET** v1/offices/downloadtemplate |  |
| [**postOfficeTemplate**](OfficesApi.md#postOfficeTemplate) | **POST** v1/offices/uploadtemplate |  |
| [**retrieveOffice**](OfficesApi.md#retrieveOffice) | **GET** v1/offices/{officeId} | Retrieve an Office |
| [**retrieveOfficeByExternalId**](OfficesApi.md#retrieveOfficeByExternalId) | **GET** v1/offices/external-id/{externalId} | Retrieve an Office using external id |
| [**retrieveOfficeTemplate1**](OfficesApi.md#retrieveOfficeTemplate1) | **GET** v1/offices/template | Retrieve Office Details Template |
| [**retrieveOffices**](OfficesApi.md#retrieveOffices) | **GET** v1/offices | List Offices |
| [**updateOffice**](OfficesApi.md#updateOffice) | **PUT** v1/offices/{officeId} | Update Office |
| [**updateOfficeWithExternalId**](OfficesApi.md#updateOfficeWithExternalId) | **PUT** v1/offices/external-id/{externalId} | Update Office |



Create an Office

Mandatory Fields name, openingDate, parentId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(OfficesApi::class.java)
val postOfficesRequest : PostOfficesRequest =  // PostOfficesRequest | 

launch(Dispatchers.IO) {
    val result : PostOfficesResponse = webService.createOffice(postOfficesRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postOfficesRequest** | [**PostOfficesRequest**](PostOfficesRequest.md)|  | |

### Return type

[**PostOfficesResponse**](PostOfficesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(OfficesApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getOfficeTemplate(dateFormat)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dateFormat** | **kotlin.String**|  | [optional] |

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
val webService = apiClient.createWebservice(OfficesApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postOfficeTemplate(dateFormat, locale, uploadedInputStream)
}
```

### Parameters
| **dateFormat** | **kotlin.String**|  | [optional] |
| **locale** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uploadedInputStream** | **java.io.File**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*


Retrieve an Office

Example Requests:  offices/1   offices/1?template&#x3D;true   offices/1?fields&#x3D;id,name,parentName

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(OfficesApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | officeId

launch(Dispatchers.IO) {
    val result : GetOfficesResponse = webService.retrieveOffice(officeId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **officeId** | **kotlin.Long**| officeId | |

### Return type

[**GetOfficesResponse**](GetOfficesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve an Office using external id

Example Requests:  offices/external-id/asd123   offices/external-id/asd123?template&#x3D;true   offices/external-id/asd123?fields&#x3D;id,name,parentName

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(OfficesApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId

launch(Dispatchers.IO) {
    val result : GetOfficesResponse = webService.retrieveOfficeByExternalId(externalId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String**| externalId | |

### Return type

[**GetOfficesResponse**](GetOfficesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Office Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  offices/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(OfficesApi::class.java)

launch(Dispatchers.IO) {
    val result : GetOfficesTemplateResponse = webService.retrieveOfficeTemplate1()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetOfficesTemplateResponse**](GetOfficesTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Offices

Example Requests:  offices   offices?fields&#x3D;id,name,openingDate

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(OfficesApi::class.java)
val includeAllOffices : kotlin.Boolean = true // kotlin.Boolean | includeAllOffices
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetOfficesResponse> = webService.retrieveOffices(includeAllOffices, orderBy, sortOrder)
}
```

### Parameters
| **includeAllOffices** | **kotlin.Boolean**| includeAllOffices | [optional] [default to false] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |

### Return type

[**kotlin.collections.List&lt;GetOfficesResponse&gt;**](GetOfficesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update Office

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(OfficesApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | officeId
val putOfficesOfficeIdRequest : PutOfficesOfficeIdRequest =  // PutOfficesOfficeIdRequest | 

launch(Dispatchers.IO) {
    val result : PutOfficesOfficeIdResponse = webService.updateOffice(officeId, putOfficesOfficeIdRequest)
}
```

### Parameters
| **officeId** | **kotlin.Long**| officeId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putOfficesOfficeIdRequest** | [**PutOfficesOfficeIdRequest**](PutOfficesOfficeIdRequest.md)|  | |

### Return type

[**PutOfficesOfficeIdResponse**](PutOfficesOfficeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update Office

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(OfficesApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val putOfficesOfficeIdRequest : PutOfficesOfficeIdRequest =  // PutOfficesOfficeIdRequest | 

launch(Dispatchers.IO) {
    val result : PutOfficesOfficeIdResponse = webService.updateOfficeWithExternalId(externalId, putOfficesOfficeIdRequest)
}
```

### Parameters
| **externalId** | **kotlin.String**| externalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putOfficesOfficeIdRequest** | [**PutOfficesOfficeIdRequest**](PutOfficesOfficeIdRequest.md)|  | |

### Return type

[**PutOfficesOfficeIdResponse**](PutOfficesOfficeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


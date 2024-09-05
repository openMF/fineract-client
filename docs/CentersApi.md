# CentersApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**activate2**](CentersApi.md#activate2) | **POST** v1/centers/{centerId} | Activate a Center | Generate Collection Sheet | Save Collection Sheet | Close a Center | Associate Groups | Disassociate Groups |
| [**create7**](CentersApi.md#create7) | **POST** v1/centers | Create a Center |
| [**delete11**](CentersApi.md#delete11) | **DELETE** v1/centers/{centerId} | Delete a Center |
| [**getCentersTemplate**](CentersApi.md#getCentersTemplate) | **GET** v1/centers/downloadtemplate |  |
| [**postCentersTemplate**](CentersApi.md#postCentersTemplate) | **POST** v1/centers/uploadtemplate |  |
| [**retrieveAll23**](CentersApi.md#retrieveAll23) | **GET** v1/centers | List Centers |
| [**retrieveGroupAccount**](CentersApi.md#retrieveGroupAccount) | **GET** v1/centers/{centerId}/accounts | Retrieve Center accounts overview |
| [**retrieveOne14**](CentersApi.md#retrieveOne14) | **GET** v1/centers/{centerId} | Retrieve a Center |
| [**retrieveTemplate6**](CentersApi.md#retrieveTemplate6) | **GET** v1/centers/template | Retrieve a Center Template |
| [**update12**](CentersApi.md#update12) | **PUT** v1/centers/{centerId} | Update a Center |



Activate a Center | Generate Collection Sheet | Save Collection Sheet | Close a Center | Associate Groups | Disassociate Groups

Activate a Center:  Centers can be created in a Pending state. This API exists to enable center activation. If the center happens to be already active, this API will result in an error.  Close a Center:  Centers can be closed if they don&#39;t have any non-closed groups or saving accounts. If the Center has any active groups or savings accounts, this API will result in an error.  Associate Groups:  This API allows associating existing groups to a center. The groups are listed from the office to which the center is associated. If group(s) is already associated with a center, this API will result in an error.  Disassociate Groups:  This API allows to disassociate groups from a center.  Generate Collection Sheet:  This Api retrieves repayment details of all jlg loans under a center as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of JLG loans for a center on a given meeting date.  Showing Request/Response for Close a Center

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CentersApi::class.java)
val centerId : kotlin.Long = 789 // kotlin.Long | centerId
val postCentersCenterIdRequest : PostCentersCenterIdRequest =  // PostCentersCenterIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostCentersCenterIdResponse = webService.activate2(centerId, postCentersCenterIdRequest, command)
}
```

### Parameters
| **centerId** | **kotlin.Long**| centerId | |
| **postCentersCenterIdRequest** | [**PostCentersCenterIdRequest**](PostCentersCenterIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostCentersCenterIdResponse**](PostCentersCenterIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Create a Center

Creates a Center  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, groupMembers

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CentersApi::class.java)
val postCentersRequest : PostCentersRequest =  // PostCentersRequest | 

launch(Dispatchers.IO) {
    val result : PostCentersResponse = webService.create7(postCentersRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postCentersRequest** | [**PostCentersRequest**](PostCentersRequest.md)|  | |

### Return type

[**PostCentersResponse**](PostCentersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Center

A Center can be deleted if it is in pending state and has no association - groups, loans or savings

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CentersApi::class.java)
val centerId : kotlin.Long = 789 // kotlin.Long | centerId

launch(Dispatchers.IO) {
    val result : DeleteCentersCenterIdResponse = webService.delete11(centerId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **centerId** | **kotlin.Long**| centerId | |

### Return type

[**DeleteCentersCenterIdResponse**](DeleteCentersCenterIdResponse.md)

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
val webService = apiClient.createWebservice(CentersApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 
val staffId : kotlin.Long = 789 // kotlin.Long | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getCentersTemplate(officeId, staffId, dateFormat)
}
```

### Parameters
| **officeId** | **kotlin.Long**|  | [optional] |
| **staffId** | **kotlin.Long**|  | [optional] |
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
val webService = apiClient.createWebservice(CentersApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postCentersTemplate(dateFormat, locale, uploadedInputStream)
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


List Centers

The default implementation supports pagination and sorting with the default pagination size set to 200 records. The parameter limit with description -1 will return all entries.  Example Requests:    centers    centers?fields&#x3D;name,officeName,joinedDate    centers?offset&#x3D;10&amp;limit&#x3D;50    centers?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CentersApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | officeId
val staffId : kotlin.Long = 789 // kotlin.Long | staffId
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val name : kotlin.String = name_example // kotlin.String | name
val underHierarchy : kotlin.String = underHierarchy_example // kotlin.String | underHierarchy
val paged : kotlin.Boolean = true // kotlin.Boolean | paged
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder
val meetingDate : kotlin.Any = Object // kotlin.Any | meetingDate
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | dateFormat
val locale : kotlin.String = locale_example // kotlin.String | locale

launch(Dispatchers.IO) {
    val result : GetCentersResponse = webService.retrieveAll23(officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, meetingDate, dateFormat, locale)
}
```

### Parameters
| **officeId** | **kotlin.Long**| officeId | [optional] |
| **staffId** | **kotlin.Long**| staffId | [optional] |
| **externalId** | **kotlin.String**| externalId | [optional] |
| **name** | **kotlin.String**| name | [optional] |
| **underHierarchy** | **kotlin.String**| underHierarchy | [optional] |
| **paged** | **kotlin.Boolean**| paged | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |
| **meetingDate** | [**kotlin.Any**](.md)| meetingDate | [optional] |
| **dateFormat** | **kotlin.String**| dateFormat | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**| locale | [optional] |

### Return type

[**GetCentersResponse**](GetCentersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Center accounts overview

An example of how a savings summary for a Center can be provided. This is requested in a specific use case of the reference application.  It is quite reasonable to add resources like this to simplify User Interface development.    Example Requests:    centers/9/accounts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CentersApi::class.java)
val centerId : kotlin.Long = 789 // kotlin.Long | centerId

launch(Dispatchers.IO) {
    val result : GetCentersCenterIdAccountsResponse = webService.retrieveGroupAccount(centerId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **centerId** | **kotlin.Long**| centerId | |

### Return type

[**GetCentersCenterIdAccountsResponse**](GetCentersCenterIdAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Center

Retrieves a Center  Example Requests:    centers/1    centers/1?associations&#x3D;groupMembers

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CentersApi::class.java)
val centerId : kotlin.Long = 789 // kotlin.Long | centerId
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly

launch(Dispatchers.IO) {
    val result : GetCentersCenterIdResponse = webService.retrieveOne14(centerId, staffInSelectedOfficeOnly)
}
```

### Parameters
| **centerId** | **kotlin.Long**| centerId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **staffInSelectedOfficeOnly** | **kotlin.Boolean**| staffInSelectedOfficeOnly | [optional] [default to false] |

### Return type

[**GetCentersCenterIdResponse**](GetCentersCenterIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Center Template

Retrieves a Center Template  Example Requests:    centers/template    centers/template?officeId&#x3D;2

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CentersApi::class.java)
val command : kotlin.String = command_example // kotlin.String | command
val officeId : kotlin.Long = 789 // kotlin.Long | officeId
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly

launch(Dispatchers.IO) {
    val result : GetCentersTemplateResponse = webService.retrieveTemplate6(command, officeId, staffInSelectedOfficeOnly)
}
```

### Parameters
| **command** | **kotlin.String**| command | [optional] |
| **officeId** | **kotlin.Long**| officeId | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **staffInSelectedOfficeOnly** | **kotlin.Boolean**| staffInSelectedOfficeOnly | [optional] [default to false] |

### Return type

[**GetCentersTemplateResponse**](GetCentersTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Center

Updates a Center

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CentersApi::class.java)
val centerId : kotlin.Long = 789 // kotlin.Long | centerId
val putCentersCenterIdRequest : PutCentersCenterIdRequest =  // PutCentersCenterIdRequest | 

launch(Dispatchers.IO) {
    val result : PutCentersCenterIdResponse = webService.update12(centerId, putCentersCenterIdRequest)
}
```

### Parameters
| **centerId** | **kotlin.Long**| centerId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putCentersCenterIdRequest** | [**PutCentersCenterIdRequest**](PutCentersCenterIdRequest.md)|  | |

### Return type

[**PutCentersCenterIdResponse**](PutCentersCenterIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# StaffApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**create3**](StaffApi.md#create3) | **POST** v1/staff | Create a staff member |
| [**getTemplate1**](StaffApi.md#getTemplate1) | **GET** v1/staff/downloadtemplate |  |
| [**postTemplate**](StaffApi.md#postTemplate) | **POST** v1/staff/uploadtemplate |  |
| [**retrieveAll16**](StaffApi.md#retrieveAll16) | **GET** v1/staff | Retrieve Staff |
| [**retrieveOne8**](StaffApi.md#retrieveOne8) | **GET** v1/staff/{staffId} | Retrieve a Staff Member |
| [**update7**](StaffApi.md#update7) | **PUT** v1/staff/{staffId} | Update a Staff Member |



Create a staff member

Creates a staff member.  Mandatory Fields:  officeId, firstname, lastname  Optional Fields:  isLoanOfficer, isActive

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(StaffApi::class.java)
val postStaffRequest : PostStaffRequest =  // PostStaffRequest | 

launch(Dispatchers.IO) {
    val result : CreateStaffResponse = webService.create3(postStaffRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postStaffRequest** | [**PostStaffRequest**](PostStaffRequest.md)|  | |

### Return type

[**CreateStaffResponse**](CreateStaffResponse.md)

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
val webService = apiClient.createWebservice(StaffApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getTemplate1(officeId, dateFormat)
}
```

### Parameters
| **officeId** | **kotlin.Long**|  | [optional] |
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
val webService = apiClient.createWebservice(StaffApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postTemplate(dateFormat, locale, uploadedInputStream)
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


Retrieve Staff

Returns the list of staff members.  Example Requests:  staff     Retrieve a Staff by status  Returns the details of a Staff based on status.  By default it Returns all the ACTIVE Staff.  If status&#x3D;INACTIVE, then it returns all INACTIVE Staff.  and for status&#x3D;ALL, it Returns both ACTIVE and INACTIVE Staff.  Example Requests:  staff?status&#x3D;active

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(StaffApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | officeId
val staffInOfficeHierarchy : kotlin.Boolean = true // kotlin.Boolean | staffInOfficeHierarchy
val loanOfficersOnly : kotlin.Boolean = true // kotlin.Boolean | loanOfficersOnly
val status : kotlin.String = status_example // kotlin.String | status

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<RetrieveOneResponse> = webService.retrieveAll16(officeId, staffInOfficeHierarchy, loanOfficersOnly, status)
}
```

### Parameters
| **officeId** | **kotlin.Long**| officeId | [optional] |
| **staffInOfficeHierarchy** | **kotlin.Boolean**| staffInOfficeHierarchy | [optional] [default to false] |
| **loanOfficersOnly** | **kotlin.Boolean**| loanOfficersOnly | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | **kotlin.String**| status | [optional] [default to &quot;active&quot;] |

### Return type

[**kotlin.collections.List&lt;RetrieveOneResponse&gt;**](RetrieveOneResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Staff Member

Returns the details of a Staff Member.  Example Requests:  staff/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(StaffApi::class.java)
val staffId : kotlin.Long = 789 // kotlin.Long | staffId

launch(Dispatchers.IO) {
    val result : RetrieveOneResponse = webService.retrieveOne8(staffId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **staffId** | **kotlin.Long**| staffId | |

### Return type

[**RetrieveOneResponse**](RetrieveOneResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Staff Member

Updates the details of a staff member.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(StaffApi::class.java)
val staffId : kotlin.Long = 789 // kotlin.Long | staffId
val putStaffRequest : PutStaffRequest =  // PutStaffRequest | 

launch(Dispatchers.IO) {
    val result : UpdateStaffResponse = webService.update7(staffId, putStaffRequest)
}
```

### Parameters
| **staffId** | **kotlin.Long**| staffId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putStaffRequest** | [**PutStaffRequest**](PutStaffRequest.md)|  | |

### Return type

[**UpdateStaffResponse**](UpdateStaffResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# UsersApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**create15**](UsersApi.md#create15) | **POST** v1/users | Create a User |
| [**delete23**](UsersApi.md#delete23) | **DELETE** v1/users/{userId} | Delete a User |
| [**getUserTemplate**](UsersApi.md#getUserTemplate) | **GET** v1/users/downloadtemplate |  |
| [**postUsersTemplate**](UsersApi.md#postUsersTemplate) | **POST** v1/users/uploadtemplate |  |
| [**retrieveAll41**](UsersApi.md#retrieveAll41) | **GET** v1/users | Retrieve list of users |
| [**retrieveOne31**](UsersApi.md#retrieveOne31) | **GET** v1/users/{userId} | Retrieve a User |
| [**template22**](UsersApi.md#template22) | **GET** v1/users/template | Retrieve User Details Template |
| [**update26**](UsersApi.md#update26) | **PUT** v1/users/{userId} | Update a User |



Create a User

Adds new application user.  Note: Password information is not required (or processed). Password details at present are auto-generated and then sent to the email account given (which is why it can take a few seconds to complete).  Mandatory Fields:  username, firstname, lastname, email, officeId, roles, sendPasswordToEmail  Optional Fields:  staffId,passwordNeverExpires,isSelfServiceUser,clients

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(UsersApi::class.java)
val postUsersRequest : PostUsersRequest =  // PostUsersRequest | 

launch(Dispatchers.IO) {
    val result : PostUsersResponse = webService.create15(postUsersRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postUsersRequest** | [**PostUsersRequest**](PostUsersRequest.md)|  | |

### Return type

[**PostUsersResponse**](PostUsersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a User

Removes the user and the associated roles and permissions.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(UsersApi::class.java)
val userId : kotlin.Long = 789 // kotlin.Long | userId

launch(Dispatchers.IO) {
    val result : DeleteUsersUserIdResponse = webService.delete23(userId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **kotlin.Long**| userId | |

### Return type

[**DeleteUsersUserIdResponse**](DeleteUsersUserIdResponse.md)

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
val webService = apiClient.createWebservice(UsersApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 
val staffId : kotlin.Long = 789 // kotlin.Long | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getUserTemplate(officeId, staffId, dateFormat)
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
val webService = apiClient.createWebservice(UsersApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postUsersTemplate(dateFormat, locale, uploadedInputStream)
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


Retrieve list of users

Example Requests:  users   users?fields&#x3D;id,username,email,officeName

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(UsersApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetUsersResponse> = webService.retrieveAll41()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetUsersResponse&gt;**](GetUsersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a User

Example Requests:  users/1   users/1?template&#x3D;true   users/1?fields&#x3D;username,officeName

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(UsersApi::class.java)
val userId : kotlin.Long = 789 // kotlin.Long | userId

launch(Dispatchers.IO) {
    val result : GetUsersUserIdResponse = webService.retrieveOne31(userId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **kotlin.Long**| userId | |

### Return type

[**GetUsersUserIdResponse**](GetUsersUserIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve User Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  users/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(UsersApi::class.java)

launch(Dispatchers.IO) {
    val result : GetUsersTemplateResponse = webService.template22()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetUsersTemplateResponse**](GetUsersTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a User

When updating a password you must provide the repeatPassword parameter also.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(UsersApi::class.java)
val userId : kotlin.Long = 789 // kotlin.Long | userId
val putUsersUserIdRequest : PutUsersUserIdRequest =  // PutUsersUserIdRequest | 

launch(Dispatchers.IO) {
    val result : PutUsersUserIdResponse = webService.update26(userId, putUsersUserIdRequest)
}
```

### Parameters
| **userId** | **kotlin.Long**| userId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putUsersUserIdRequest** | [**PutUsersUserIdRequest**](PutUsersUserIdRequest.md)|  | |

### Return type

[**PutUsersUserIdResponse**](PutUsersUserIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# MakerCheckerOr4EyeFunctionalityApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**approveMakerCheckerEntry**](MakerCheckerOr4EyeFunctionalityApi.md#approveMakerCheckerEntry) | **POST** v1/makercheckers/{auditId} | Approve Maker Checker Entry | Reject Maker Checker Entry |
| [**deleteMakerCheckerEntry**](MakerCheckerOr4EyeFunctionalityApi.md#deleteMakerCheckerEntry) | **DELETE** v1/makercheckers/{auditId} | Delete Maker Checker Entry |
| [**retrieveAuditSearchTemplate1**](MakerCheckerOr4EyeFunctionalityApi.md#retrieveAuditSearchTemplate1) | **GET** v1/makercheckers/searchtemplate | Maker Checker Search Template |
| [**retrieveCommands**](MakerCheckerOr4EyeFunctionalityApi.md#retrieveCommands) | **GET** v1/makercheckers | List Maker Checker Entries |



Approve Maker Checker Entry | Reject Maker Checker Entry

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(MakerCheckerOr4EyeFunctionalityApi::class.java)
val auditId : kotlin.Long = 789 // kotlin.Long | auditId
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostMakerCheckersResponse = webService.approveMakerCheckerEntry(auditId, command)
}
```

### Parameters
| **auditId** | **kotlin.Long**| auditId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostMakerCheckersResponse**](PostMakerCheckersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Delete Maker Checker Entry

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(MakerCheckerOr4EyeFunctionalityApi::class.java)
val auditId : kotlin.Long = 789 // kotlin.Long | auditId

launch(Dispatchers.IO) {
    val result : PostMakerCheckersResponse = webService.deleteMakerCheckerEntry(auditId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **auditId** | **kotlin.Long**| auditId | |

### Return type

[**PostMakerCheckersResponse**](PostMakerCheckersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Maker Checker Search Template

This is a convenience resource. It can be useful when building a Checker Inbox UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with. \&quot;actionNames\&quot; and \&quot;entityNames\&quot; returned are those that the requestor has Checker approval permissions for.  Example Requests:  makercheckers/searchtemplate makercheckers/searchtemplate?fields&#x3D;entityNames

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(MakerCheckerOr4EyeFunctionalityApi::class.java)

launch(Dispatchers.IO) {
    val result : GetMakerCheckersSearchTemplateResponse = webService.retrieveAuditSearchTemplate1()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetMakerCheckersSearchTemplateResponse**](GetMakerCheckersSearchTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Maker Checker Entries

Get a list of entries that can be checked by the requestor that match the criteria supplied.  Example Requests:  makercheckers  makercheckers?fields&#x3D;madeOnDate,maker,processingResult  makercheckers?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  makercheckers?officeId&#x3D;1  makercheckers?officeId&#x3D;1&amp;includeJson&#x3D;true

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(MakerCheckerOr4EyeFunctionalityApi::class.java)
val actionName : kotlin.String = actionName_example // kotlin.String | actionName
val entityName : kotlin.String = entityName_example // kotlin.String | entityName
val resourceId : kotlin.Long = 789 // kotlin.Long | resourceId
val makerId : kotlin.Long = 789 // kotlin.Long | makerId
val makerDateTimeFrom : kotlin.String = makerDateTimeFrom_example // kotlin.String | makerDateTimeFrom
val makerDateTimeTo : kotlin.String = makerDateTimeTo_example // kotlin.String | makerDateTimeTo
val officeId : kotlin.Int = 56 // kotlin.Int | officeId
val groupId : kotlin.Int = 56 // kotlin.Int | groupId
val clientId : kotlin.Int = 56 // kotlin.Int | clientId
val loanid : kotlin.Int = 56 // kotlin.Int | loanid
val savingsAccountId : kotlin.Int = 56 // kotlin.Int | savingsAccountId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetMakerCheckerResponse> = webService.retrieveCommands(actionName, entityName, resourceId, makerId, makerDateTimeFrom, makerDateTimeTo, officeId, groupId, clientId, loanid, savingsAccountId)
}
```

### Parameters
| **actionName** | **kotlin.String**| actionName | [optional] |
| **entityName** | **kotlin.String**| entityName | [optional] |
| **resourceId** | **kotlin.Long**| resourceId | [optional] |
| **makerId** | **kotlin.Long**| makerId | [optional] |
| **makerDateTimeFrom** | **kotlin.String**| makerDateTimeFrom | [optional] |
| **makerDateTimeTo** | **kotlin.String**| makerDateTimeTo | [optional] |
| **officeId** | **kotlin.Int**| officeId | [optional] |
| **groupId** | **kotlin.Int**| groupId | [optional] |
| **clientId** | **kotlin.Int**| clientId | [optional] |
| **loanid** | **kotlin.Int**| loanid | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **savingsAccountId** | **kotlin.Int**| savingsAccountId | [optional] |

### Return type

[**kotlin.collections.List&lt;GetMakerCheckerResponse&gt;**](GetMakerCheckerResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


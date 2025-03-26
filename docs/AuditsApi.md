# AuditsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieveAuditEntries**](AuditsApi.md#retrieveAuditEntries) | **GET** v1/audits | List Audits |
| [**retrieveAuditEntry**](AuditsApi.md#retrieveAuditEntry) | **GET** v1/audits/{auditId} | Retrieve an Audit Entry |
| [**retrieveAuditSearchTemplate**](AuditsApi.md#retrieveAuditSearchTemplate) | **GET** v1/audits/searchtemplate | Audit Search Template |



List Audits

Get a 200 list of audits that match the criteria supplied and sorted by audit id in descending order, and are within the requestors&#39; data scope. Also it supports pagination and sorting  Example Requests:  audits  audits?fields&#x3D;madeOnDate,maker,processingResult  audits?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  audits?officeId&#x3D;1  audits?officeId&#x3D;1&amp;includeJson&#x3D;true

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AuditsApi::class.java)
val actionName : kotlin.String = actionName_example // kotlin.String | actionName
val entityName : kotlin.String = entityName_example // kotlin.String | entityName
val resourceId : kotlin.Long = 789 // kotlin.Long | resourceId
val makerId : kotlin.Long = 789 // kotlin.Long | makerId
val makerDateTimeFrom : kotlin.String = makerDateTimeFrom_example // kotlin.String | makerDateTimeFrom
val makerDateTimeTo : kotlin.String = makerDateTimeTo_example // kotlin.String | makerDateTimeTo
val checkerId : kotlin.Long = 789 // kotlin.Long | checkerId
val checkerDateTimeFrom : kotlin.String = checkerDateTimeFrom_example // kotlin.String | checkerDateTimeFrom
val checkerDateTimeTo : kotlin.String = checkerDateTimeTo_example // kotlin.String | checkerDateTimeTo
val processingResult : kotlin.Int = 56 // kotlin.Int | processingResult
val officeId : kotlin.Int = 56 // kotlin.Int | officeId
val groupId : kotlin.Int = 56 // kotlin.Int | groupId
val clientId : kotlin.Int = 56 // kotlin.Int | clientId
val loanid : kotlin.Int = 56 // kotlin.Int | loanid
val savingsAccountId : kotlin.Int = 56 // kotlin.Int | savingsAccountId
val paged : kotlin.Boolean = true // kotlin.Boolean | paged
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetMakerCheckerResponse> = webService.retrieveAuditEntries(actionName, entityName, resourceId, makerId, makerDateTimeFrom, makerDateTimeTo, checkerId, checkerDateTimeFrom, checkerDateTimeTo, processingResult, officeId, groupId, clientId, loanid, savingsAccountId, paged, offset, limit, orderBy, sortOrder)
}
```

### Parameters
| **actionName** | **kotlin.String**| actionName | [optional] |
| **entityName** | **kotlin.String**| entityName | [optional] |
| **resourceId** | **kotlin.Long**| resourceId | [optional] |
| **makerId** | **kotlin.Long**| makerId | [optional] |
| **makerDateTimeFrom** | **kotlin.String**| makerDateTimeFrom | [optional] |
| **makerDateTimeTo** | **kotlin.String**| makerDateTimeTo | [optional] |
| **checkerId** | **kotlin.Long**| checkerId | [optional] |
| **checkerDateTimeFrom** | **kotlin.String**| checkerDateTimeFrom | [optional] |
| **checkerDateTimeTo** | **kotlin.String**| checkerDateTimeTo | [optional] |
| **processingResult** | **kotlin.Int**| processingResult | [optional] |
| **officeId** | **kotlin.Int**| officeId | [optional] |
| **groupId** | **kotlin.Int**| groupId | [optional] |
| **clientId** | **kotlin.Int**| clientId | [optional] |
| **loanid** | **kotlin.Int**| loanid | [optional] |
| **savingsAccountId** | **kotlin.Int**| savingsAccountId | [optional] |
| **paged** | **kotlin.Boolean**| paged | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |

### Return type

[**kotlin.collections.List&lt;GetMakerCheckerResponse&gt;**](GetMakerCheckerResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve an Audit Entry

Example Requests:  audits/20 audits/20?fields&#x3D;madeOnDate,maker,processingResult

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AuditsApi::class.java)
val auditId : kotlin.Long = 789 // kotlin.Long | auditId

launch(Dispatchers.IO) {
    val result : GetMakerCheckerResponse = webService.retrieveAuditEntry(auditId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **auditId** | **kotlin.Long**| auditId | |

### Return type

[**GetMakerCheckerResponse**](GetMakerCheckerResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Audit Search Template

This is a convenience resource. It can be useful when building an Audit Search UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with.  Example Requests:  audits/searchtemplate audits/searchtemplate?fields&#x3D;actionNames

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AuditsApi::class.java)

launch(Dispatchers.IO) {
    val result : GetMakerCheckersSearchTemplateResponse = webService.retrieveAuditSearchTemplate()
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


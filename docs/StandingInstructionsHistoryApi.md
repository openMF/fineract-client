# StandingInstructionsHistoryApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieveAll20**](StandingInstructionsHistoryApi.md#retrieveAll20) | **GET** v1/standinginstructionrunhistory | Standing Instructions Logged History |



Standing Instructions Logged History

The list capability of history can support pagination and sorting   Example Requests :  standinginstructionrunhistory  standinginstructionrunhistory?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC  standinginstructionrunhistory?offset&#x3D;10&amp;limit&#x3D;50

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(StandingInstructionsHistoryApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder
val transferType : kotlin.Int = 56 // kotlin.Int | transferType
val clientName : kotlin.String = clientName_example // kotlin.String | clientName
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val fromAccountId : kotlin.Long = 789 // kotlin.Long | fromAccountId
val fromAccountType : kotlin.Int = 56 // kotlin.Int | fromAccountType
val locale : kotlin.String = locale_example // kotlin.String | locale
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | dateFormat
val fromDate : kotlin.Any = Object // kotlin.Any | fromDate
val toDate : kotlin.Any = Object // kotlin.Any | toDate

launch(Dispatchers.IO) {
    val result : GetStandingInstructionRunHistoryResponse = webService.retrieveAll20(externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType, locale, dateFormat, fromDate, toDate)
}
```

### Parameters
| **externalId** | **kotlin.String**| externalId | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |
| **transferType** | **kotlin.Int**| transferType | [optional] |
| **clientName** | **kotlin.String**| clientName | [optional] |
| **clientId** | **kotlin.Long**| clientId | [optional] |
| **fromAccountId** | **kotlin.Long**| fromAccountId | [optional] |
| **fromAccountType** | **kotlin.Int**| fromAccountType | [optional] |
| **locale** | **kotlin.String**| locale | [optional] |
| **dateFormat** | **kotlin.String**| dateFormat | [optional] |
| **fromDate** | [**kotlin.Any**](.md)| fromDate | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **toDate** | [**kotlin.Any**](.md)| toDate | [optional] |

### Return type

[**GetStandingInstructionRunHistoryResponse**](GetStandingInstructionRunHistoryResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


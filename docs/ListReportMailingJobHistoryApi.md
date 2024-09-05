# ListReportMailingJobHistoryApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieveAllByReportMailingJobId**](ListReportMailingJobHistoryApi.md#retrieveAllByReportMailingJobId) | **GET** v1/reportmailingjobrunhistory | List Report Mailing Job History |



List Report Mailing Job History

The list capability of report mailing job history can support pagination and sorting.  Example Requests:  reportmailingjobrunhistory/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ListReportMailingJobHistoryApi::class.java)
val reportMailingJobId : kotlin.Long = 789 // kotlin.Long | reportMailingJobId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder

launch(Dispatchers.IO) {
    val result : ReportMailingJobRunHistoryData = webService.retrieveAllByReportMailingJobId(reportMailingJobId, offset, limit, orderBy, sortOrder)
}
```

### Parameters
| **reportMailingJobId** | **kotlin.Long**| reportMailingJobId | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |

### Return type

[**ReportMailingJobRunHistoryData**](ReportMailingJobRunHistoryData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


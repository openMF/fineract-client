# SelfRunReportApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**runReport1**](SelfRunReportApi.md#runReport1) | **GET** v1/self/runreports/{reportName} | Running A Report |



Running A Report

Example Requests:   self/runreports/Client%20Details?R_officeId&#x3D;1   self/runreports/Client%20Details?R_officeId&#x3D;1&amp;exportCSV&#x3D;true

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfRunReportApi::class.java)
val reportName : kotlin.String = reportName_example // kotlin.String | reportName

launch(Dispatchers.IO) {
    val result : GetRunReportResponse = webService.runReport1(reportName)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reportName** | **kotlin.String**| reportName | |

### Return type

[**GetRunReportResponse**](GetRunReportResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/pdf, application/vnd.ms-excel, text/csv, text/html


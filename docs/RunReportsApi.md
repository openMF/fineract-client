# RunReportsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieveAllAvailableExports**](RunReportsApi.md#retrieveAllAvailableExports) | **GET** v1/runreports/availableExports/{reportName} | Return all available export types for the specific report |
| [**runReport**](RunReportsApi.md#runReport) | **GET** v1/runreports/{reportName} | Running a Report |



Return all available export types for the specific report

Returns the list of all available export types.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RunReportsApi::class.java)
val reportName : kotlin.String = reportName_example // kotlin.String | reportName
val isSelfServiceUserReport : kotlin.Boolean = true // kotlin.Boolean | isSelfServiceUserReport

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<ReportExportType> = webService.retrieveAllAvailableExports(reportName, isSelfServiceUserReport)
}
```

### Parameters
| **reportName** | **kotlin.String**| reportName | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isSelfServiceUserReport** | **kotlin.Boolean**| isSelfServiceUserReport | [optional] [default to false] |

### Return type

[**kotlin.collections.List&lt;ReportExportType&gt;**](ReportExportType.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Running a Report

This resource allows you to run and receive output from pre-defined Apache Fineract reports.  Reports can also be used to provide data for searching and workflow functionality.  The default output is a JSON formatted \&quot;Generic Resultset\&quot;. The Generic Resultset contains Column Heading as well as Data information. However, you can export to CSV format by simply adding \&quot;&amp;exportCSV&#x3D;true\&quot; to the end of your URL.  If Pentaho reports have been pre-defined, they can also be run through this resource. Pentaho reports can return HTML, PDF or CSV formats.  The Apache Fineract reference application uses a JQuery plugin called stretchy reporting which, itself, uses this reports resource to provide a pretty flexible reporting User Interface (UI).    Example Requests:  runreports/Client%20Listing?R_officeId&#x3D;1   runreports/Client%20Listing?R_officeId&#x3D;1&amp;exportCSV&#x3D;true   runreports/OfficeIdSelectOne?R_officeId&#x3D;1&amp;parameterType&#x3D;true   runreports/OfficeIdSelectOne?R_officeId&#x3D;1&amp;parameterType&#x3D;true&amp;exportCSV&#x3D;true   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;HTML&amp;R_officeId&#x3D;1   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;XLS&amp;R_officeId&#x3D;1   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;CSV&amp;R_officeId&#x3D;1   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;PDF&amp;R_officeId&#x3D;1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RunReportsApi::class.java)
val reportName : kotlin.String = reportName_example // kotlin.String | reportName
val isSelfServiceUserReport : kotlin.Boolean = true // kotlin.Boolean | isSelfServiceUserReport

launch(Dispatchers.IO) {
    val result : RunReportsResponse = webService.runReport(reportName, isSelfServiceUserReport)
}
```

### Parameters
| **reportName** | **kotlin.String**| reportName | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isSelfServiceUserReport** | **kotlin.Boolean**| isSelfServiceUserReport | [optional] [default to false] |

### Return type

[**RunReportsResponse**](RunReportsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/pdf, application/vnd.ms-excel, text/csv, text/html


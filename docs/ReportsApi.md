# ReportsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createReport**](ReportsApi.md#createReport) | **POST** v1/reports | Create a Report |
| [**deleteReport**](ReportsApi.md#deleteReport) | **DELETE** v1/reports/{id} | Delete a Report |
| [**retrieveOfficeTemplate**](ReportsApi.md#retrieveOfficeTemplate) | **GET** v1/reports/template | Retrieve Report Template |
| [**retrieveReport**](ReportsApi.md#retrieveReport) | **GET** v1/reports/{id} | Retrieve a Report  |
| [**retrieveReportList**](ReportsApi.md#retrieveReportList) | **GET** v1/reports | List Reports |
| [**updateReport**](ReportsApi.md#updateReport) | **PUT** v1/reports/{id} | Update a Report |



Create a Report

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ReportsApi::class.java)
val postRepostRequest : PostRepostRequest =  // PostRepostRequest | 

launch(Dispatchers.IO) {
    val result : PostReportsResponse = webService.createReport(postRepostRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postRepostRequest** | [**PostRepostRequest**](PostRepostRequest.md)|  | |

### Return type

[**PostReportsResponse**](PostReportsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Report

Only non-core reports can be deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ReportsApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | id

launch(Dispatchers.IO) {
    val result : DeleteReportsResponse = webService.deleteReport(id)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Long**| id | |

### Return type

[**DeleteReportsResponse**](DeleteReportsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Report Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists  Example Request :   reports/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ReportsApi::class.java)

launch(Dispatchers.IO) {
    val result : GetReportsTemplateResponse = webService.retrieveOfficeTemplate()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetReportsTemplateResponse**](GetReportsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Report 

Example Requests:  reports/1   reports/1?template&#x3D;true

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ReportsApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | id

launch(Dispatchers.IO) {
    val result : GetReportsResponse = webService.retrieveReport(id)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Long**| id | |

### Return type

[**GetReportsResponse**](GetReportsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Reports

Lists all reports and their parameters.  Example Request:  reports

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ReportsApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetReportsResponse> = webService.retrieveReportList()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetReportsResponse&gt;**](GetReportsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Report

Only the useReport description can be updated for core reports.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ReportsApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | id
val putReportRequest : PutReportRequest =  // PutReportRequest | 

launch(Dispatchers.IO) {
    val result : PutReportResponse = webService.updateReport(id, putReportRequest)
}
```

### Parameters
| **id** | **kotlin.Long**| id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putReportRequest** | [**PutReportRequest**](PutReportRequest.md)|  | |

### Return type

[**PutReportResponse**](PutReportResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


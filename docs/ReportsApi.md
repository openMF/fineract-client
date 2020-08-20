# ReportsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReport**](ReportsApi.md#createReport) | **POST** reports | Create a Report
[**deleteReport**](ReportsApi.md#deleteReport) | **DELETE** reports/{id} | Delete a Report
[**retrieveOfficeTemplate**](ReportsApi.md#retrieveOfficeTemplate) | **GET** reports/template | Retrieve Report Template
[**retrieveReport**](ReportsApi.md#retrieveReport) | **GET** reports/{id} | Retrieve a Report 
[**retrieveReportList**](ReportsApi.md#retrieveReportList) | **GET** reports | List Reports
[**updateReport**](ReportsApi.md#updateReport) | **PUT** reports/{id} | Update a Report


<a name="createReport"></a>
# **createReport**
> PostReportsResponse createReport(body)

Create a Report



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
PostRepostRequest body = new PostRepostRequest(); // PostRepostRequest | body
try {
    PostReportsResponse result = apiInstance.createReport(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#createReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostRepostRequest**](PostRepostRequest.md)| body |

### Return type

[**PostReportsResponse**](PostReportsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReport"></a>
# **deleteReport**
> DeleteReportsResponse deleteReport(id)

Delete a Report

Only non-core reports can be deleted.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
Long id = 789L; // Long | id
try {
    DeleteReportsResponse result = apiInstance.deleteReport(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#deleteReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**DeleteReportsResponse**](DeleteReportsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOfficeTemplate"></a>
# **retrieveOfficeTemplate**
> GetReportsTemplateResponse retrieveOfficeTemplate()

Retrieve Report Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request :   reports/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
try {
    GetReportsTemplateResponse result = apiInstance.retrieveOfficeTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#retrieveOfficeTemplate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetReportsTemplateResponse**](GetReportsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveReport"></a>
# **retrieveReport**
> GetReportsResponse retrieveReport(id)

Retrieve a Report 

Example Requests:  reports/1   reports/1?template&#x3D;true

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
Long id = 789L; // Long | id
try {
    GetReportsResponse result = apiInstance.retrieveReport(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#retrieveReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**GetReportsResponse**](GetReportsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveReportList"></a>
# **retrieveReportList**
> retrieveReportList()

List Reports

Lists all reports and their parameters.  Example Request:  reports

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
try {
    apiInstance.retrieveReportList();
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#retrieveReportList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReport"></a>
# **updateReport**
> PutReportResponse updateReport(id, body)

Update a Report

Only the useReport value can be updated for core reports.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
Long id = 789L; // Long | id
PutReportRequest body = new PutReportRequest(); // PutReportRequest | body
try {
    PutReportResponse result = apiInstance.updateReport(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#updateReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **body** | [**PutReportRequest**](PutReportRequest.md)| body |

### Return type

[**PutReportResponse**](PutReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# SelfRunReport_Api

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**runReport**](SelfRunReport_Api.md#runReport) | **GET** self/runreports/{reportName} | Running A Report


<a name="runReport"></a>
# **runReport**
> GetRunReportResponse runReport(reportName)

Running A Report

Example Requests:   self/runreports/Client%20Details?R_officeId&#x3D;1   self/runreports/Client%20Details?R_officeId&#x3D;1&amp;exportCSV&#x3D;true

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfRunReport_Api;


SelfRunReport_Api apiInstance = new SelfRunReport_Api();
String reportName = "reportName_example"; // String | reportName
try {
    GetRunReportResponse result = apiInstance.runReport(reportName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfRunReport_Api#runReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportName** | **String**| reportName |

### Return type

[**GetRunReportResponse**](GetRunReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/csv, application/vnd.ms-excel, application/pdf, text/html


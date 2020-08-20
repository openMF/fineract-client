# ListReportMailingJobHistoryApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAllByReportMailingJobId**](ListReportMailingJobHistoryApi.md#retrieveAllByReportMailingJobId) | **GET** reportmailingjobrunhistory | List Report Mailing Job History


<a name="retrieveAllByReportMailingJobId"></a>
# **retrieveAllByReportMailingJobId**
> ReportMailingJobRunHistoryData retrieveAllByReportMailingJobId(reportMailingJobId, offset, limit, orderBy, sortOrder)

List Report Mailing Job History

The list capability of report mailing job history can support pagination and sorting.  Example Requests:  reportmailingjobrunhistory/1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ListReportMailingJobHistoryApi;


ListReportMailingJobHistoryApi apiInstance = new ListReportMailingJobHistoryApi();
Long reportMailingJobId = 789L; // Long | reportMailingJobId
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
String orderBy = "orderBy_example"; // String | orderBy
String sortOrder = "sortOrder_example"; // String | sortOrder
try {
    ReportMailingJobRunHistoryData result = apiInstance.retrieveAllByReportMailingJobId(reportMailingJobId, offset, limit, orderBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListReportMailingJobHistoryApi#retrieveAllByReportMailingJobId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportMailingJobId** | **Long**| reportMailingJobId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**ReportMailingJobRunHistoryData**](ReportMailingJobRunHistoryData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


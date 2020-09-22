# ListReportMailingJobHistoryApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

ListReportMailingJobHistoryApi apiService = defaultClient.createService(ListReportMailingJobHistoryApi.class);

// Initialize these parameters earlier.
Call<ReportMailingJobRunHistoryData> call = apiService.retrieveAllByReportMailingJobId(reportMailingJobId, offset, limit, orderBy, sortOrder);
call.enqueue(new Callback<ReportMailingJobRunHistoryData>() {
    @Override
    public void onResponse(Call<ReportMailingJobRunHistoryData> call, Response<ReportMailingJobRunHistoryData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<ReportMailingJobRunHistoryData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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


# SelfRunReport_Api

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

SelfRunReport_Api apiService = defaultClient.createService(SelfRunReport_Api.class);

// Initialize these parameters earlier.
Call<GetRunReportResponse> call = apiService.runReport(reportName);
call.enqueue(new Callback<GetRunReportResponse>() {
    @Override
    public void onResponse(Call<GetRunReportResponse> call, Response<GetRunReportResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRunReportResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **reportName** | **String**| reportName |

### Return type

[**GetRunReportResponse**](GetRunReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/csv, application/vnd.ms-excel, application/pdf, text/html


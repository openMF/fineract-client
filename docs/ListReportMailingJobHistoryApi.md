# ListReportMailingJobHistoryApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAllByReportMailingJobId**](ListReportMailingJobHistoryApi.md#retrieveAllByReportMailingJobId) | **GET** reportmailingjobrunhistory | List Report Mailing Job History



## retrieveAllByReportMailingJobId

> ReportMailingJobRunHistoryData retrieveAllByReportMailingJobId(reportMailingJobId, offset, limit, orderBy, sortOrder)

List Report Mailing Job History

The list capability of report mailing job history can support pagination and sorting.  Example Requests:  reportmailingjobrunhistory/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ListReportMailingJobHistoryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        ListReportMailingJobHistoryApi apiInstance = new ListReportMailingJobHistoryApi(defaultClient);
        Long reportMailingJobId = 56L; // Long | reportMailingJobId
        Integer offset = 56; // Integer | offset
        Integer limit = 56; // Integer | limit
        String orderBy = "orderBy_example"; // String | orderBy
        String sortOrder = "sortOrder_example"; // String | sortOrder
        try {
            ReportMailingJobRunHistoryData result = apiInstance.retrieveAllByReportMailingJobId(reportMailingJobId, offset, limit, orderBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ListReportMailingJobHistoryApi#retrieveAllByReportMailingJobId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


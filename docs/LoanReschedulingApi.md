# LoanReschedulingApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateLoanScheduleOrSubmitVariableSchedule**](LoanReschedulingApi.md#calculateLoanScheduleOrSubmitVariableSchedule) | **POST** loans/{loanId}/schedule | Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations



## calculateLoanScheduleOrSubmitVariableSchedule

> PostLoansLoanIdScheduleResponse calculateLoanScheduleOrSubmitVariableSchedule(loanId, body, command)

Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations

Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#39;Updates loan repayment schedule by removing Loan term variations&#39;

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanReschedulingApi;

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

        LoanReschedulingApi apiInstance = new LoanReschedulingApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        Object body = null; // Object | 
        String command = "command_example"; // String | command
        try {
            PostLoansLoanIdScheduleResponse result = apiInstance.calculateLoanScheduleOrSubmitVariableSchedule(loanId, body, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanReschedulingApi#calculateLoanScheduleOrSubmitVariableSchedule");
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
 **loanId** | **Long**| loanId |
 **body** | **Object**|  |
 **command** | **String**| command | [optional]

### Return type

[**PostLoansLoanIdScheduleResponse**](PostLoansLoanIdScheduleResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


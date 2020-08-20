# LoanReschedulingApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateLoanScheduleOrSubmitVariableSchedule**](LoanReschedulingApi.md#calculateLoanScheduleOrSubmitVariableSchedule) | **POST** loans/{loanId}/schedule | Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations


<a name="calculateLoanScheduleOrSubmitVariableSchedule"></a>
# **calculateLoanScheduleOrSubmitVariableSchedule**
> PostLoansLoanIdScheduleResponse calculateLoanScheduleOrSubmitVariableSchedule(loanId, body, command)

Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations

Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#39;Updates loan repayment schedule by removing Loan term variations&#39;

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanReschedulingApi;


LoanReschedulingApi apiInstance = new LoanReschedulingApi();
Long loanId = 789L; // Long | loanId
PostLoansLoanIdScheduleRequest body = new PostLoansLoanIdScheduleRequest(); // PostLoansLoanIdScheduleRequest | body
String command = "command_example"; // String | command
try {
    PostLoansLoanIdScheduleResponse result = apiInstance.calculateLoanScheduleOrSubmitVariableSchedule(loanId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanReschedulingApi#calculateLoanScheduleOrSubmitVariableSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |
 **body** | [**PostLoansLoanIdScheduleRequest**](PostLoansLoanIdScheduleRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostLoansLoanIdScheduleResponse**](PostLoansLoanIdScheduleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


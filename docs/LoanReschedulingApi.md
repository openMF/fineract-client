# LoanReschedulingApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

LoanReschedulingApi apiService = defaultClient.createService(LoanReschedulingApi.class);

// Initialize these parameters earlier.
Call<PostLoansLoanIdScheduleResponse> call = apiService.calculateLoanScheduleOrSubmitVariableSchedule(loanId, body, command);
call.enqueue(new Callback<PostLoansLoanIdScheduleResponse>() {
    @Override
    public void onResponse(Call<PostLoansLoanIdScheduleResponse> call, Response<PostLoansLoanIdScheduleResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostLoansLoanIdScheduleResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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


# LoansApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateLoanScheduleOrSubmitLoanApplication**](LoansApi.md#calculateLoanScheduleOrSubmitLoanApplication) | **POST** loans | Calculate loan repayment schedule | Submit a new Loan Application
[**deleteLoanApplication**](LoansApi.md#deleteLoanApplication) | **DELETE** loans/{loanId} | Delete a Loan Application
[**getLoanRepaymentTemplate**](LoansApi.md#getLoanRepaymentTemplate) | **GET** loans/repayments/downloadtemplate | 
[**getLoansTemplate**](LoansApi.md#getLoansTemplate) | **GET** loans/downloadtemplate | 
[**modifyLoanApplication**](LoansApi.md#modifyLoanApplication) | **PUT** loans/{loanId} | Modify a loan application
[**postLoanRepaymentTemplate**](LoansApi.md#postLoanRepaymentTemplate) | **POST** loans/repayments/uploadtemplate | 
[**postLoanTemplate**](LoansApi.md#postLoanTemplate) | **POST** loans/uploadtemplate | 
[**retrieveAll**](LoansApi.md#retrieveAll) | **GET** loans | List Loans
[**retrieveApprovalTemplate**](LoansApi.md#retrieveApprovalTemplate) | **GET** loans/{loanId}/template | 
[**retrieveLoan**](LoansApi.md#retrieveLoan) | **GET** loans/{loanId} | Retrieve a Loan
[**stateTransitions**](LoansApi.md#stateTransitions) | **POST** loans/{loanId} | Approve Loan Application | Recover Loan Guarantee | Undo Loan Application Approval | Assign a Loan Officer | Unassign a Loan Officer | Reject Loan Application | Applicant Withdraws from Loan Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal
[**template**](LoansApi.md#template) | **GET** loans/template | Retrieve Loan Details Template


<a name="calculateLoanScheduleOrSubmitLoanApplication"></a>
# **calculateLoanScheduleOrSubmitLoanApplication**
> PostLoansResponse calculateLoanScheduleOrSubmitLoanApplication(body, command)

Calculate loan repayment schedule | Submit a new Loan Application

It calculates the loan repayment Schedule Submits a new loan application Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, expectedDisbursementDate, submittedOnDate, loanType Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true) Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables

### Example
```java

LoansApi apiService = defaultClient.createService(LoansApi.class);

// Initialize these parameters earlier.
Call<PostLoansResponse> call = apiService.calculateLoanScheduleOrSubmitLoanApplication(body, command);
call.enqueue(new Callback<PostLoansResponse>() {
    @Override
    public void onResponse(Call<PostLoansResponse> call, Response<PostLoansResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostLoansResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostLoansRequest**](PostLoansRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostLoansResponse**](PostLoansResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLoanApplication"></a>
# **deleteLoanApplication**
> DeleteLoansLoanIdResponse deleteLoanApplication(loanId)

Delete a Loan Application

Note: Only loans in \&quot;Submitted and awaiting approval\&quot; status can be deleted.

### Example
```java

LoansApi apiService = defaultClient.createService(LoansApi.class);

// Initialize these parameters earlier.
Call<DeleteLoansLoanIdResponse> call = apiService.deleteLoanApplication(loanId);
call.enqueue(new Callback<DeleteLoansLoanIdResponse>() {
    @Override
    public void onResponse(Call<DeleteLoansLoanIdResponse> call, Response<DeleteLoansLoanIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteLoansLoanIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |

### Return type

[**DeleteLoansLoanIdResponse**](DeleteLoansLoanIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLoanRepaymentTemplate"></a>
# **getLoanRepaymentTemplate**
> getLoanRepaymentTemplate(officeId, dateFormat)



### Example
```java

LoansApi apiService = defaultClient.createService(LoansApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.getLoanRepaymentTemplate(officeId, dateFormat);
call.enqueue(new Callback<>() {
    @Override
    public void onResponse(Call<> call, Response<> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **officeId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="getLoansTemplate"></a>
# **getLoansTemplate**
> getLoansTemplate(officeId, staffId, dateFormat)



### Example
```java

LoansApi apiService = defaultClient.createService(LoansApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.getLoansTemplate(officeId, staffId, dateFormat);
call.enqueue(new Callback<>() {
    @Override
    public void onResponse(Call<> call, Response<> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **officeId** | **Long**|  | [optional]
 **staffId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="modifyLoanApplication"></a>
# **modifyLoanApplication**
> PutLoansLoanIdResponse modifyLoanApplication(loanId, body)

Modify a loan application

Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.

### Example
```java

LoansApi apiService = defaultClient.createService(LoansApi.class);

// Initialize these parameters earlier.
Call<PutLoansLoanIdResponse> call = apiService.modifyLoanApplication(loanId, body);
call.enqueue(new Callback<PutLoansLoanIdResponse>() {
    @Override
    public void onResponse(Call<PutLoansLoanIdResponse> call, Response<PutLoansLoanIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutLoansLoanIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **body** | [**PutLoansLoanIdRequest**](PutLoansLoanIdRequest.md)| body |

### Return type

[**PutLoansLoanIdResponse**](PutLoansLoanIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postLoanRepaymentTemplate"></a>
# **postLoanRepaymentTemplate**
> String postLoanRepaymentTemplate(file, locale, dateFormat)



### Example
```java

LoansApi apiService = defaultClient.createService(LoansApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postLoanRepaymentTemplate(file, locale, dateFormat);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **file** | **File**|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="postLoanTemplate"></a>
# **postLoanTemplate**
> String postLoanTemplate(file, locale, dateFormat)



### Example
```java

LoansApi apiService = defaultClient.createService(LoansApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postLoanTemplate(file, locale, dateFormat);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **file** | **File**|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="retrieveAll"></a>
# **retrieveAll**
> GetLoansResponse retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountNo)

List Loans

The list capability of loans can support pagination and sorting. Example Requests:  loans  loans?fields&#x3D;accountNo  loans?offset&#x3D;10&amp;limit&#x3D;50  loans?orderBy&#x3D;accountNo&amp;sortOrder&#x3D;DESC

### Example
```java

LoansApi apiService = defaultClient.createService(LoansApi.class);

// Initialize these parameters earlier.
Call<GetLoansResponse> call = apiService.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountNo);
call.enqueue(new Callback<GetLoansResponse>() {
    @Override
    public void onResponse(Call<GetLoansResponse> call, Response<GetLoansResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetLoansResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **sqlSearch** | **String**| sqlSearch | [optional]
 **externalId** | **String**| externalId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **accountNo** | **String**| accountNo | [optional]

### Return type

[**GetLoansResponse**](GetLoansResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveApprovalTemplate"></a>
# **retrieveApprovalTemplate**
> String retrieveApprovalTemplate(loanId, templateType)



### Example
```java

LoansApi apiService = defaultClient.createService(LoansApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveApprovalTemplate(loanId, templateType);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **templateType** | **String**| templateType | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveLoan"></a>
# **retrieveLoan**
> GetLoansLoanIdResponse retrieveLoan(loanId, staffInSelectedOfficeOnly)

Retrieve a Loan

Note: template&#x3D;true parameter doesn&#39;t apply to this resource.Example Requests:  loans/1   loans/1?fields&#x3D;id,principal,annualInterestRate   loans/1?associations&#x3D;all  loans/1?associations&#x3D;all&amp;exclude&#x3D;guarantors   loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions

### Example
```java

LoansApi apiService = defaultClient.createService(LoansApi.class);

// Initialize these parameters earlier.
Call<GetLoansLoanIdResponse> call = apiService.retrieveLoan(loanId, staffInSelectedOfficeOnly);
call.enqueue(new Callback<GetLoansLoanIdResponse>() {
    @Override
    public void onResponse(Call<GetLoansLoanIdResponse> call, Response<GetLoansLoanIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetLoansLoanIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]

### Return type

[**GetLoansLoanIdResponse**](GetLoansLoanIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stateTransitions"></a>
# **stateTransitions**
> PostLoansLoanIdResponse stateTransitions(loanId, body, command)

Approve Loan Application | Recover Loan Guarantee | Undo Loan Application Approval | Assign a Loan Officer | Unassign a Loan Officer | Reject Loan Application | Applicant Withdraws from Loan Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal

Approve Loan Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the loan application  Recover Loan Guarantee: Recovers the loan guarantee  Undo Loan Application Approval: Undoes the Loan Application Approval  Assign a Loan Officer: Allows you to assign Loan Officer for existing Loan.  Unassign a Loan Officer: Allows you to unassign the Loan Officer.  Reject Loan Application: Mandatory Fields: rejectedOnDate Allows you to reject the loan application  Applicant Withdraws from Loan Application: Mandatory Fields: withdrawnOnDate Allows the applicant to withdraw the loan application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal Showing request and response for Assign a Loan Officer

### Example
```java

LoansApi apiService = defaultClient.createService(LoansApi.class);

// Initialize these parameters earlier.
Call<PostLoansLoanIdResponse> call = apiService.stateTransitions(loanId, body, command);
call.enqueue(new Callback<PostLoansLoanIdResponse>() {
    @Override
    public void onResponse(Call<PostLoansLoanIdResponse> call, Response<PostLoansLoanIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostLoansLoanIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **loanId** | **Long**| loanId |
 **body** | [**PostLoansLoanIdRequest**](PostLoansLoanIdRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostLoansLoanIdResponse**](PostLoansLoanIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetLoansTemplateResponse template(clientId, groupId, productId, templateType, staffInSelectedOfficeOnly, activeOnly)

Retrieve Loan Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1

### Example
```java

LoansApi apiService = defaultClient.createService(LoansApi.class);

// Initialize these parameters earlier.
Call<GetLoansTemplateResponse> call = apiService.template(clientId, groupId, productId, templateType, staffInSelectedOfficeOnly, activeOnly);
call.enqueue(new Callback<GetLoansTemplateResponse>() {
    @Override
    public void onResponse(Call<GetLoansTemplateResponse> call, Response<GetLoansTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetLoansTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **clientId** | **Long**| clientId | [optional]
 **groupId** | **Long**| groupId | [optional]
 **productId** | **Long**| productId | [optional]
 **templateType** | **String**| templateType | [optional]
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]
 **activeOnly** | **Boolean**| activeOnly | [optional] [default to false]

### Return type

[**GetLoansTemplateResponse**](GetLoansTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# LoansApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoansApi;


LoansApi apiInstance = new LoansApi();
PostLoansRequest body = new PostLoansRequest(); // PostLoansRequest | body
String command = "command_example"; // String | command
try {
    PostLoansResponse result = apiInstance.calculateLoanScheduleOrSubmitLoanApplication(body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#calculateLoanScheduleOrSubmitLoanApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoansApi;


LoansApi apiInstance = new LoansApi();
Long loanId = 789L; // Long | loanId
try {
    DeleteLoansLoanIdResponse result = apiInstance.deleteLoanApplication(loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#deleteLoanApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoansApi;


LoansApi apiInstance = new LoansApi();
Long officeId = 789L; // Long | 
String dateFormat = "dateFormat_example"; // String | 
try {
    apiInstance.getLoanRepaymentTemplate(officeId, dateFormat);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#getLoanRepaymentTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoansApi;


LoansApi apiInstance = new LoansApi();
Long officeId = 789L; // Long | 
Long staffId = 789L; // Long | 
String dateFormat = "dateFormat_example"; // String | 
try {
    apiInstance.getLoansTemplate(officeId, staffId, dateFormat);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#getLoansTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoansApi;


LoansApi apiInstance = new LoansApi();
Long loanId = 789L; // Long | loanId
PutLoansLoanIdRequest body = new PutLoansLoanIdRequest(); // PutLoansLoanIdRequest | body
try {
    PutLoansLoanIdResponse result = apiInstance.modifyLoanApplication(loanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#modifyLoanApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoansApi;


LoansApi apiInstance = new LoansApi();
File file = new File("/path/to/file.txt"); // File | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
try {
    String result = apiInstance.postLoanRepaymentTemplate(file, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#postLoanRepaymentTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoansApi;


LoansApi apiInstance = new LoansApi();
File file = new File("/path/to/file.txt"); // File | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
try {
    String result = apiInstance.postLoanTemplate(file, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#postLoanTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoansApi;


LoansApi apiInstance = new LoansApi();
String sqlSearch = "sqlSearch_example"; // String | sqlSearch
String externalId = "externalId_example"; // String | externalId
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
String orderBy = "orderBy_example"; // String | orderBy
String sortOrder = "sortOrder_example"; // String | sortOrder
String accountNo = "accountNo_example"; // String | accountNo
try {
    GetLoansResponse result = apiInstance.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountNo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoansApi;


LoansApi apiInstance = new LoansApi();
Long loanId = 789L; // Long | loanId
String templateType = "templateType_example"; // String | templateType
try {
    String result = apiInstance.retrieveApprovalTemplate(loanId, templateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#retrieveApprovalTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoansApi;


LoansApi apiInstance = new LoansApi();
Long loanId = 789L; // Long | loanId
Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
try {
    GetLoansLoanIdResponse result = apiInstance.retrieveLoan(loanId, staffInSelectedOfficeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#retrieveLoan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoansApi;


LoansApi apiInstance = new LoansApi();
Long loanId = 789L; // Long | loanId
PostLoansLoanIdRequest body = new PostLoansLoanIdRequest(); // PostLoansLoanIdRequest | body
String command = "command_example"; // String | command
try {
    PostLoansLoanIdResponse result = apiInstance.stateTransitions(loanId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#stateTransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoansApi;


LoansApi apiInstance = new LoansApi();
Long clientId = 789L; // Long | clientId
Long groupId = 789L; // Long | groupId
Long productId = 789L; // Long | productId
String templateType = "templateType_example"; // String | templateType
Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
Boolean activeOnly = false; // Boolean | activeOnly
try {
    GetLoansTemplateResponse result = apiInstance.template(clientId, groupId, productId, templateType, staffInSelectedOfficeOnly, activeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#template");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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


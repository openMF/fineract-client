# SelfLoansApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateLoanScheduleOrSubmitLoanApplication**](SelfLoansApi.md#calculateLoanScheduleOrSubmitLoanApplication) | **POST** self/loans | Calculate Loan Repayment Schedule | Submit a new Loan Application
[**modifyLoanApplication**](SelfLoansApi.md#modifyLoanApplication) | **PUT** self/loans/{loanId} | Update a Loan Application
[**retrieveAllLoanCharges**](SelfLoansApi.md#retrieveAllLoanCharges) | **GET** self/loans/{loanId}/charges | List Loan Charges
[**retrieveGuarantorDetails**](SelfLoansApi.md#retrieveGuarantorDetails) | **GET** self/loans/{loanId}/guarantors | 
[**retrieveLoan**](SelfLoansApi.md#retrieveLoan) | **GET** self/loans/{loanId} | Retrieve a Loan
[**retrieveLoanCharge**](SelfLoansApi.md#retrieveLoanCharge) | **GET** self/loans/{loanId}/charges/{chargeId} | Retrieve a Loan Charge
[**retrieveTransaction**](SelfLoansApi.md#retrieveTransaction) | **GET** self/loans/{loanId}/transactions/{transactionId} | Retrieve a Loan Transaction Details
[**stateTransitions**](SelfLoansApi.md#stateTransitions) | **POST** self/loans/{loanId} | Applicant Withdraws from Loan Application
[**template**](SelfLoansApi.md#template) | **GET** self/loans/template | Retrieve Loan Details Template


<a name="calculateLoanScheduleOrSubmitLoanApplication"></a>
# **calculateLoanScheduleOrSubmitLoanApplication**
> PostSelfLoansResponse calculateLoanScheduleOrSubmitLoanApplication(body, command)

Calculate Loan Repayment Schedule | Submit a new Loan Application

Calculate Loan Repayment Schedule:  Calculates Loan Repayment Schedule  Mandatory Fields: productId, principal, loanTermFrequency, loanTermFrequencyType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, expectedDisbursementDate, transactionProcessingStrategyId  Submit a new Loan Application:  Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, expectedDisbursementDate, submittedOnDate, loanType  Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate  Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables  Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true)  Showing request/response for &#39;Submit a new Loan Application&#39;

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfLoansApi;


SelfLoansApi apiInstance = new SelfLoansApi();
PostSelfLoansRequest body = new PostSelfLoansRequest(); // PostSelfLoansRequest | body
String command = "command_example"; // String | command
try {
    PostSelfLoansResponse result = apiInstance.calculateLoanScheduleOrSubmitLoanApplication(body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfLoansApi#calculateLoanScheduleOrSubmitLoanApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostSelfLoansRequest**](PostSelfLoansRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostSelfLoansResponse**](PostSelfLoansResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyLoanApplication"></a>
# **modifyLoanApplication**
> PutSelfLoansLoanIdResponse modifyLoanApplication(loanId, body)

Update a Loan Application

Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfLoansApi;


SelfLoansApi apiInstance = new SelfLoansApi();
Long loanId = 789L; // Long | loanId
PutSelfLoansLoanIdRequest body = new PutSelfLoansLoanIdRequest(); // PutSelfLoansLoanIdRequest | body
try {
    PutSelfLoansLoanIdResponse result = apiInstance.modifyLoanApplication(loanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfLoansApi#modifyLoanApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |
 **body** | [**PutSelfLoansLoanIdRequest**](PutSelfLoansLoanIdRequest.md)| body |

### Return type

[**PutSelfLoansLoanIdResponse**](PutSelfLoansLoanIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllLoanCharges"></a>
# **retrieveAllLoanCharges**
> List&lt;GetSelfLoansLoanIdChargesResponse&gt; retrieveAllLoanCharges(loanId)

List Loan Charges

Lists loan Charges  Example Requests:  self/loans/1/charges   self/loans/1/charges?fields&#x3D;name,amountOrPercentage

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfLoansApi;


SelfLoansApi apiInstance = new SelfLoansApi();
Long loanId = 789L; // Long | loanId
try {
    List<GetSelfLoansLoanIdChargesResponse> result = apiInstance.retrieveAllLoanCharges(loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfLoansApi#retrieveAllLoanCharges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |

### Return type

[**List&lt;GetSelfLoansLoanIdChargesResponse&gt;**](GetSelfLoansLoanIdChargesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveGuarantorDetails"></a>
# **retrieveGuarantorDetails**
> String retrieveGuarantorDetails(loanId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfLoansApi;


SelfLoansApi apiInstance = new SelfLoansApi();
Long loanId = 789L; // Long | 
try {
    String result = apiInstance.retrieveGuarantorDetails(loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfLoansApi#retrieveGuarantorDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveLoan"></a>
# **retrieveLoan**
> GetSelfLoansLoanIdResponse retrieveLoan(loanId)

Retrieve a Loan

Retrieves a Loan  Example Requests:  self/loans/1   self/loans/1?fields&#x3D;id,principal,annualInterestRate   self/loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfLoansApi;


SelfLoansApi apiInstance = new SelfLoansApi();
Long loanId = 789L; // Long | loanId
try {
    GetSelfLoansLoanIdResponse result = apiInstance.retrieveLoan(loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfLoansApi#retrieveLoan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |

### Return type

[**GetSelfLoansLoanIdResponse**](GetSelfLoansLoanIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveLoanCharge"></a>
# **retrieveLoanCharge**
> GetSelfLoansLoanIdChargesResponse retrieveLoanCharge(loanId, chargeId)

Retrieve a Loan Charge

Retrieves a Loan Charge  Example Requests:  self/loans/1/charges/1   self/loans/1/charges/1?fields&#x3D;name,amountOrPercentage

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfLoansApi;


SelfLoansApi apiInstance = new SelfLoansApi();
Long loanId = 789L; // Long | loanId
Long chargeId = 789L; // Long | chargeId
try {
    GetSelfLoansLoanIdChargesResponse result = apiInstance.retrieveLoanCharge(loanId, chargeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfLoansApi#retrieveLoanCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |
 **chargeId** | **Long**| chargeId |

### Return type

[**GetSelfLoansLoanIdChargesResponse**](GetSelfLoansLoanIdChargesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTransaction"></a>
# **retrieveTransaction**
> GetSelfLoansLoanIdTransactionsTransactionIdResponse retrieveTransaction(loanId, transactionId)

Retrieve a Loan Transaction Details

Retrieves a Loan Transaction DetailsExample Request:  self/loans/5/transactions/3

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfLoansApi;


SelfLoansApi apiInstance = new SelfLoansApi();
Long loanId = 789L; // Long | loanId
Long transactionId = 789L; // Long | transactionId
try {
    GetSelfLoansLoanIdTransactionsTransactionIdResponse result = apiInstance.retrieveTransaction(loanId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfLoansApi#retrieveTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetSelfLoansLoanIdTransactionsTransactionIdResponse**](GetSelfLoansLoanIdTransactionsTransactionIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stateTransitions"></a>
# **stateTransitions**
> PostSelfLoansLoanIdResponse stateTransitions(loanId, body, command)

Applicant Withdraws from Loan Application

Applicant Withdraws from Loan Application  Mandatory Fields: withdrawnOnDate

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfLoansApi;


SelfLoansApi apiInstance = new SelfLoansApi();
Long loanId = 789L; // Long | loanId
PostSelfLoansLoanIdRequest body = new PostSelfLoansLoanIdRequest(); // PostSelfLoansLoanIdRequest | body
String command = "command_example"; // String | command
try {
    PostSelfLoansLoanIdResponse result = apiInstance.stateTransitions(loanId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfLoansApi#stateTransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |
 **body** | [**PostSelfLoansLoanIdRequest**](PostSelfLoansLoanIdRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostSelfLoansLoanIdResponse**](PostSelfLoansLoanIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetSelfLoansTemplateResponse template(clientId, productId, templateType)

Retrieve Loan Details Template

Retrieves Loan Details Template  This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfLoansApi;


SelfLoansApi apiInstance = new SelfLoansApi();
Long clientId = 789L; // Long | clientId
Long productId = 789L; // Long | productId
String templateType = "templateType_example"; // String | templateType
try {
    GetSelfLoansTemplateResponse result = apiInstance.template(clientId, productId, templateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfLoansApi#template");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId | [optional]
 **productId** | **Long**| productId | [optional]
 **templateType** | **String**| templateType | [optional]

### Return type

[**GetSelfLoansTemplateResponse**](GetSelfLoansTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# SelfLoansApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**calculateLoanScheduleOrSubmitLoanApplication1**](SelfLoansApi.md#calculateLoanScheduleOrSubmitLoanApplication1) | **POST** v1/self/loans | Calculate Loan Repayment Schedule | Submit a new Loan Application |
| [**modifyLoanApplication2**](SelfLoansApi.md#modifyLoanApplication2) | **PUT** v1/self/loans/{loanId} | Update a Loan Application |
| [**retrieveAllLoanCharges2**](SelfLoansApi.md#retrieveAllLoanCharges2) | **GET** v1/self/loans/{loanId}/charges | List Loan Charges |
| [**retrieveGuarantorDetails2**](SelfLoansApi.md#retrieveGuarantorDetails2) | **GET** v1/self/loans/{loanId}/guarantors |  |
| [**retrieveLoan2**](SelfLoansApi.md#retrieveLoan2) | **GET** v1/self/loans/{loanId} | Retrieve a Loan |
| [**retrieveLoanCharge4**](SelfLoansApi.md#retrieveLoanCharge4) | **GET** v1/self/loans/{loanId}/charges/{chargeId} | Retrieve a Loan Charge |
| [**retrieveTransaction1**](SelfLoansApi.md#retrieveTransaction1) | **GET** v1/self/loans/{loanId}/transactions/{transactionId} | Retrieve a Loan Transaction Details |
| [**stateTransitions2**](SelfLoansApi.md#stateTransitions2) | **POST** v1/self/loans/{loanId} | Applicant Withdraws from Loan Application |
| [**template17**](SelfLoansApi.md#template17) | **GET** v1/self/loans/template | Retrieve Loan Details Template |



Calculate Loan Repayment Schedule | Submit a new Loan Application

Calculate Loan Repayment Schedule:  Calculates Loan Repayment Schedule  Mandatory Fields: productId, principal, loanTermFrequency, loanTermFrequencyType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, expectedDisbursementDate, transactionProcessingStrategyCode  Submit a new Loan Application:  Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyCode, expectedDisbursementDate, submittedOnDate, loanType  Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate  Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables  Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true)  Showing request/response for &#39;Submit a new Loan Application&#39;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfLoansApi::class.java)
val postSelfLoansRequest : PostSelfLoansRequest =  // PostSelfLoansRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostSelfLoansResponse = webService.calculateLoanScheduleOrSubmitLoanApplication1(postSelfLoansRequest, command)
}
```

### Parameters
| **postSelfLoansRequest** | [**PostSelfLoansRequest**](PostSelfLoansRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostSelfLoansResponse**](PostSelfLoansResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update a Loan Application

Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfLoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val putSelfLoansLoanIdRequest : PutSelfLoansLoanIdRequest =  // PutSelfLoansLoanIdRequest | 

launch(Dispatchers.IO) {
    val result : PutSelfLoansLoanIdResponse = webService.modifyLoanApplication2(loanId, putSelfLoansLoanIdRequest)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putSelfLoansLoanIdRequest** | [**PutSelfLoansLoanIdRequest**](PutSelfLoansLoanIdRequest.md)|  | |

### Return type

[**PutSelfLoansLoanIdResponse**](PutSelfLoansLoanIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List Loan Charges

Lists loan Charges  Example Requests:  self/loans/1/charges   self/loans/1/charges?fields&#x3D;name,amountOrPercentage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfLoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetSelfLoansLoanIdChargesResponse> = webService.retrieveAllLoanCharges2(loanId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanId** | **kotlin.Long**| loanId | |

### Return type

[**kotlin.collections.List&lt;GetSelfLoansLoanIdChargesResponse&gt;**](GetSelfLoansLoanIdChargesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfLoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveGuarantorDetails2(loanId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanId** | **kotlin.Long**|  | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Loan

Retrieves a Loan  Example Requests:  self/loans/1   self/loans/1?fields&#x3D;id,principal,annualInterestRate   self/loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfLoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId

launch(Dispatchers.IO) {
    val result : GetSelfLoansLoanIdResponse = webService.retrieveLoan2(loanId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanId** | **kotlin.Long**| loanId | |

### Return type

[**GetSelfLoansLoanIdResponse**](GetSelfLoansLoanIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Loan Charge

Retrieves a Loan Charge  Example Requests:  self/loans/1/charges/1   self/loans/1/charges/1?fields&#x3D;name,amountOrPercentage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfLoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val chargeId : kotlin.Long = 789 // kotlin.Long | chargeId

launch(Dispatchers.IO) {
    val result : GetSelfLoansLoanIdChargesResponse = webService.retrieveLoanCharge4(loanId, chargeId)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chargeId** | **kotlin.Long**| chargeId | |

### Return type

[**GetSelfLoansLoanIdChargesResponse**](GetSelfLoansLoanIdChargesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Loan Transaction Details

Retrieves a Loan Transaction DetailsExample Request:  self/loans/5/transactions/3

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfLoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId
val fields : kotlin.String = id,date,amount // kotlin.String | Optional Loan Transaction attribute list to be in the response

launch(Dispatchers.IO) {
    val result : GetSelfLoansLoanIdTransactionsTransactionIdResponse = webService.retrieveTransaction1(loanId, transactionId, fields)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **transactionId** | **kotlin.Long**| transactionId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fields** | **kotlin.String**| Optional Loan Transaction attribute list to be in the response | [optional] |

### Return type

[**GetSelfLoansLoanIdTransactionsTransactionIdResponse**](GetSelfLoansLoanIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Applicant Withdraws from Loan Application

Applicant Withdraws from Loan Application  Mandatory Fields: withdrawnOnDate

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfLoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val postSelfLoansLoanIdRequest : PostSelfLoansLoanIdRequest =  // PostSelfLoansLoanIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostSelfLoansLoanIdResponse = webService.stateTransitions2(loanId, postSelfLoansLoanIdRequest, command)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **postSelfLoansLoanIdRequest** | [**PostSelfLoansLoanIdRequest**](PostSelfLoansLoanIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostSelfLoansLoanIdResponse**](PostSelfLoansLoanIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve Loan Details Template

Retrieves Loan Details Template  This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists  Example Requests:  self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfLoansApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val productId : kotlin.Long = 789 // kotlin.Long | productId
val templateType : kotlin.String = templateType_example // kotlin.String | templateType

launch(Dispatchers.IO) {
    val result : GetSelfLoansTemplateResponse = webService.template17(clientId, productId, templateType)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | [optional] |
| **productId** | **kotlin.Long**| productId | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateType** | **kotlin.String**| templateType | [optional] |

### Return type

[**GetSelfLoansTemplateResponse**](GetSelfLoansTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


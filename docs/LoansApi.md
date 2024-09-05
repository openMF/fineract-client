# LoansApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**calculateLoanScheduleOrSubmitLoanApplication**](LoansApi.md#calculateLoanScheduleOrSubmitLoanApplication) | **POST** v1/loans | Calculate loan repayment schedule | Submit a new Loan Application |
| [**createLoanDelinquencyAction**](LoansApi.md#createLoanDelinquencyAction) | **POST** v1/loans/{loanId}/delinquency-actions | Adds a new delinquency action for a loan |
| [**createLoanDelinquencyAction1**](LoansApi.md#createLoanDelinquencyAction1) | **POST** v1/loans/external-id/{loanExternalId}/delinquency-actions | Adds a new delinquency action for a loan |
| [**deleteLoanApplication**](LoansApi.md#deleteLoanApplication) | **DELETE** v1/loans/{loanId} | Delete a Loan Application |
| [**deleteLoanApplication1**](LoansApi.md#deleteLoanApplication1) | **DELETE** v1/loans/external-id/{loanExternalId} | Delete a Loan Application |
| [**getDelinquencyTagHistory**](LoansApi.md#getDelinquencyTagHistory) | **GET** v1/loans/{loanId}/delinquencytags | Retrieve the Loan Delinquency Tag history using the Loan Id |
| [**getDelinquencyTagHistory1**](LoansApi.md#getDelinquencyTagHistory1) | **GET** v1/loans/external-id/{loanExternalId}/delinquencytags | Retrieve the Loan Delinquency Tag history using the Loan Id |
| [**getGlimRepaymentTemplate**](LoansApi.md#getGlimRepaymentTemplate) | **GET** v1/loans/glimAccount/{glimId} |  |
| [**getLoanDelinquencyActions**](LoansApi.md#getLoanDelinquencyActions) | **GET** v1/loans/{loanId}/delinquency-actions | Retrieve delinquency actions related to the loan |
| [**getLoanDelinquencyActions1**](LoansApi.md#getLoanDelinquencyActions1) | **GET** v1/loans/external-id/{loanExternalId}/delinquency-actions | Retrieve delinquency actions related to the loan |
| [**getLoanRepaymentTemplate**](LoansApi.md#getLoanRepaymentTemplate) | **GET** v1/loans/repayments/downloadtemplate |  |
| [**getLoansTemplate**](LoansApi.md#getLoansTemplate) | **GET** v1/loans/downloadtemplate |  |
| [**glimStateTransitions**](LoansApi.md#glimStateTransitions) | **POST** v1/loans/glimAccount/{glimId} | Approve GLIM Application | Undo GLIM Application Approval | Reject GLIM Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal |
| [**modifyLoanApplication**](LoansApi.md#modifyLoanApplication) | **PUT** v1/loans/{loanId} | Modify a loan application |
| [**modifyLoanApplication1**](LoansApi.md#modifyLoanApplication1) | **PUT** v1/loans/external-id/{loanExternalId} | Modify a loan application |
| [**postLoanRepaymentTemplate**](LoansApi.md#postLoanRepaymentTemplate) | **POST** v1/loans/repayments/uploadtemplate |  |
| [**postLoanTemplate**](LoansApi.md#postLoanTemplate) | **POST** v1/loans/uploadtemplate |  |
| [**retrieveAll27**](LoansApi.md#retrieveAll27) | **GET** v1/loans | List Loans |
| [**retrieveApprovalTemplate**](LoansApi.md#retrieveApprovalTemplate) | **GET** v1/loans/{loanId}/template |  |
| [**retrieveApprovalTemplate1**](LoansApi.md#retrieveApprovalTemplate1) | **GET** v1/loans/external-id/{loanExternalId}/template |  |
| [**retrieveLoan**](LoansApi.md#retrieveLoan) | **GET** v1/loans/{loanId} | Retrieve a Loan |
| [**retrieveLoan1**](LoansApi.md#retrieveLoan1) | **GET** v1/loans/external-id/{loanExternalId} | Retrieve a Loan |
| [**stateTransitions**](LoansApi.md#stateTransitions) | **POST** v1/loans/{loanId} | Approve Loan Application | Recover Loan Guarantee | Undo Loan Application Approval | Assign a Loan Officer | Unassign a Loan Officer | Reject Loan Application | Applicant Withdraws from Loan Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal |
| [**stateTransitions1**](LoansApi.md#stateTransitions1) | **POST** v1/loans/external-id/{loanExternalId} | Approve Loan Application | Recover Loan Guarantee | Undo Loan Application Approval | Assign a Loan Officer | Unassign a Loan Officer | Reject Loan Application | Applicant Withdraws from Loan Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal |
| [**template10**](LoansApi.md#template10) | **GET** v1/loans/template | Retrieve Loan Details Template |



Calculate loan repayment schedule | Submit a new Loan Application

It calculates the loan repayment Schedule Submits a new loan application Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyCode, expectedDisbursementDate, submittedOnDate, loanType Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true) Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val postLoansRequest : PostLoansRequest =  // PostLoansRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansResponse = webService.calculateLoanScheduleOrSubmitLoanApplication(postLoansRequest, command)
}
```

### Parameters
| **postLoansRequest** | [**PostLoansRequest**](PostLoansRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansResponse**](PostLoansResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Adds a new delinquency action for a loan

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val postLoansDelinquencyActionRequest : PostLoansDelinquencyActionRequest =  // PostLoansDelinquencyActionRequest | 

launch(Dispatchers.IO) {
    val result : PostLoansDelinquencyActionResponse = webService.createLoanDelinquencyAction(loanId, postLoansDelinquencyActionRequest)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postLoansDelinquencyActionRequest** | [**PostLoansDelinquencyActionRequest**](PostLoansDelinquencyActionRequest.md)|  | |

### Return type

[**PostLoansDelinquencyActionResponse**](PostLoansDelinquencyActionResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Adds a new delinquency action for a loan

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val postLoansDelinquencyActionRequest : PostLoansDelinquencyActionRequest =  // PostLoansDelinquencyActionRequest | 

launch(Dispatchers.IO) {
    val result : PostLoansDelinquencyActionResponse = webService.createLoanDelinquencyAction1(loanExternalId, postLoansDelinquencyActionRequest)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postLoansDelinquencyActionRequest** | [**PostLoansDelinquencyActionRequest**](PostLoansDelinquencyActionRequest.md)|  | |

### Return type

[**PostLoansDelinquencyActionResponse**](PostLoansDelinquencyActionResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Loan Application

Note: Only loans in \&quot;Submitted and awaiting approval\&quot; status can be deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId

launch(Dispatchers.IO) {
    val result : DeleteLoansLoanIdResponse = webService.deleteLoanApplication(loanId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanId** | **kotlin.Long**| loanId | |

### Return type

[**DeleteLoansLoanIdResponse**](DeleteLoansLoanIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Delete a Loan Application

Note: Only loans in \&quot;Submitted and awaiting approval\&quot; status can be deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId

launch(Dispatchers.IO) {
    val result : DeleteLoansLoanIdResponse = webService.deleteLoanApplication1(loanExternalId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanExternalId** | **kotlin.String**| loanExternalId | |

### Return type

[**DeleteLoansLoanIdResponse**](DeleteLoansLoanIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve the Loan Delinquency Tag history using the Loan Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetDelinquencyTagHistoryResponse> = webService.getDelinquencyTagHistory(loanId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanId** | **kotlin.Long**| loanId | |

### Return type

[**kotlin.collections.List&lt;GetDelinquencyTagHistoryResponse&gt;**](GetDelinquencyTagHistoryResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve the Loan Delinquency Tag history using the Loan Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetDelinquencyTagHistoryResponse> = webService.getDelinquencyTagHistory1(loanExternalId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanExternalId** | **kotlin.String**| loanExternalId | |

### Return type

[**kotlin.collections.List&lt;GetDelinquencyTagHistoryResponse&gt;**](GetDelinquencyTagHistoryResponse.md)

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
val webService = apiClient.createWebservice(LoansApi::class.java)
val glimId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getGlimRepaymentTemplate(glimId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **glimId** | **kotlin.Long**|  | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve delinquency actions related to the loan

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetDelinquencyActionsResponse> = webService.getLoanDelinquencyActions(loanId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanId** | **kotlin.Long**| loanId | |

### Return type

[**kotlin.collections.List&lt;GetDelinquencyActionsResponse&gt;**](GetDelinquencyActionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve delinquency actions related to the loan

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetDelinquencyActionsResponse> = webService.getLoanDelinquencyActions1(loanExternalId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanExternalId** | **kotlin.String**| loanExternalId | |

### Return type

[**kotlin.collections.List&lt;GetDelinquencyActionsResponse&gt;**](GetDelinquencyActionsResponse.md)

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
val webService = apiClient.createWebservice(LoansApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getLoanRepaymentTemplate(officeId, dateFormat)
}
```

### Parameters
| **officeId** | **kotlin.Long**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dateFormat** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 
val staffId : kotlin.Long = 789 // kotlin.Long | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getLoansTemplate(officeId, staffId, dateFormat)
}
```

### Parameters
| **officeId** | **kotlin.Long**|  | [optional] |
| **staffId** | **kotlin.Long**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dateFormat** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel


Approve GLIM Application | Undo GLIM Application Approval | Reject GLIM Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal

Approve GLIM Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the GLIM application  Undo GLIM Application Approval: Undoes the GLIM Application Approval  Reject GLIM Application: Mandatory Fields: rejectedOnDate Allows you to reject the GLIM application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val glimId : kotlin.Long = 789 // kotlin.Long | 
val postLoansLoanIdRequest : PostLoansLoanIdRequest =  // PostLoansLoanIdRequest | 
val command : kotlin.String = command_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdResponse = webService.glimStateTransitions(glimId, postLoansLoanIdRequest, command)
}
```

### Parameters
| **glimId** | **kotlin.Long**|  | |
| **postLoansLoanIdRequest** | [**PostLoansLoanIdRequest**](PostLoansLoanIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**|  | [optional] |

### Return type

[**PostLoansLoanIdResponse**](PostLoansLoanIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Modify a loan application

Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val putLoansLoanIdRequest : PutLoansLoanIdRequest =  // PutLoansLoanIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PutLoansLoanIdResponse = webService.modifyLoanApplication(loanId, putLoansLoanIdRequest, command)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **putLoansLoanIdRequest** | [**PutLoansLoanIdRequest**](PutLoansLoanIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PutLoansLoanIdResponse**](PutLoansLoanIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Modify a loan application

Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val putLoansLoanIdRequest : PutLoansLoanIdRequest =  // PutLoansLoanIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PutLoansLoanIdResponse = webService.modifyLoanApplication1(loanExternalId, putLoansLoanIdRequest, command)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **putLoansLoanIdRequest** | [**PutLoansLoanIdRequest**](PutLoansLoanIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PutLoansLoanIdResponse**](PutLoansLoanIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postLoanRepaymentTemplate(dateFormat, locale, uploadedInputStream)
}
```

### Parameters
| **dateFormat** | **kotlin.String**|  | [optional] |
| **locale** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uploadedInputStream** | **java.io.File**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postLoanTemplate(dateFormat, locale, uploadedInputStream)
}
```

### Parameters
| **dateFormat** | **kotlin.String**|  | [optional] |
| **locale** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uploadedInputStream** | **java.io.File**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*


List Loans

The list capability of loans can support pagination and sorting. Example Requests:  loans  loans?fields&#x3D;accountNo  loans?offset&#x3D;10&amp;limit&#x3D;50  loans?orderBy&#x3D;accountNo&amp;sortOrder&#x3D;DESC

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder
val accountNo : kotlin.String = accountNo_example // kotlin.String | accountNo
val status : kotlin.String = status_example // kotlin.String | status

launch(Dispatchers.IO) {
    val result : GetLoansResponse = webService.retrieveAll27(externalId, offset, limit, orderBy, sortOrder, accountNo, status)
}
```

### Parameters
| **externalId** | **kotlin.String**| externalId | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |
| **accountNo** | **kotlin.String**| accountNo | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | **kotlin.String**| status | [optional] |

### Return type

[**GetLoansResponse**](GetLoansResponse.md)

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
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val templateType : kotlin.String = templateType_example // kotlin.String | templateType

launch(Dispatchers.IO) {
    val result : GetLoansApprovalTemplateResponse = webService.retrieveApprovalTemplate(loanId, templateType)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateType** | **kotlin.String**| templateType | [optional] |

### Return type

[**GetLoansApprovalTemplateResponse**](GetLoansApprovalTemplateResponse.md)

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
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val templateType : kotlin.String = templateType_example // kotlin.String | templateType

launch(Dispatchers.IO) {
    val result : GetLoansApprovalTemplateResponse = webService.retrieveApprovalTemplate1(loanExternalId, templateType)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateType** | **kotlin.String**| templateType | [optional] |

### Return type

[**GetLoansApprovalTemplateResponse**](GetLoansApprovalTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Loan

Note: template&#x3D;true parameter doesn&#39;t apply to this resource.Example Requests:  loans/1   loans/1?fields&#x3D;id,principal,annualInterestRate   loans/1?associations&#x3D;all  loans/1?associations&#x3D;all&amp;exclude&#x3D;guarantors   loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly
val associations : kotlin.String = associations_example // kotlin.String | Loan object relations to be included in the response
val exclude : kotlin.String = guarantors,futureSchedule // kotlin.String | Optional Loan object relation list to be filtered in the response
val fields : kotlin.String = id,principal,annualInterestRate // kotlin.String | Optional Loan attribute list to be in the response

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdResponse = webService.retrieveLoan(loanId, staffInSelectedOfficeOnly, associations, exclude, fields)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **staffInSelectedOfficeOnly** | **kotlin.Boolean**| staffInSelectedOfficeOnly | [optional] [default to false] |
| **associations** | **kotlin.String**| Loan object relations to be included in the response | [optional] [default to &quot;all&quot;] |
| **exclude** | **kotlin.String**| Optional Loan object relation list to be filtered in the response | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fields** | **kotlin.String**| Optional Loan attribute list to be in the response | [optional] |

### Return type

[**GetLoansLoanIdResponse**](GetLoansLoanIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Loan

Note: template&#x3D;true parameter doesn&#39;t apply to this resource.Example Requests:  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?fields&#x3D;id,principal,annualInterestRate   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?associations&#x3D;all  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?associations&#x3D;all&amp;exclude&#x3D;guarantors   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly
val associations : kotlin.String = associations_example // kotlin.String | Loan object relations to be included in the response
val exclude : kotlin.String = guarantors,futureSchedule // kotlin.String | Optional Loan object relation list to be filtered in the response
val fields : kotlin.String = id,principal,annualInterestRate // kotlin.String | Optional Loan attribute list to be in the response

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdResponse = webService.retrieveLoan1(loanExternalId, staffInSelectedOfficeOnly, associations, exclude, fields)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **staffInSelectedOfficeOnly** | **kotlin.Boolean**| staffInSelectedOfficeOnly | [optional] [default to false] |
| **associations** | **kotlin.String**| Loan object relations to be included in the response | [optional] [default to &quot;all&quot;] |
| **exclude** | **kotlin.String**| Optional Loan object relation list to be filtered in the response | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fields** | **kotlin.String**| Optional Loan attribute list to be in the response | [optional] |

### Return type

[**GetLoansLoanIdResponse**](GetLoansLoanIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Approve Loan Application | Recover Loan Guarantee | Undo Loan Application Approval | Assign a Loan Officer | Unassign a Loan Officer | Reject Loan Application | Applicant Withdraws from Loan Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal

Approve Loan Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the loan application  Recover Loan Guarantee: Recovers the loan guarantee  Undo Loan Application Approval: Undoes the Loan Application Approval  Assign a Loan Officer: Allows you to assign Loan Officer for existing Loan.  Unassign a Loan Officer: Allows you to unassign the Loan Officer.  Reject Loan Application: Mandatory Fields: rejectedOnDate Allows you to reject the loan application  Applicant Withdraws from Loan Application: Mandatory Fields: withdrawnOnDate Allows the applicant to withdraw the loan application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal Showing request and response for Assign a Loan Officer

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val postLoansLoanIdRequest : PostLoansLoanIdRequest =  // PostLoansLoanIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdResponse = webService.stateTransitions(loanId, postLoansLoanIdRequest, command)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **postLoansLoanIdRequest** | [**PostLoansLoanIdRequest**](PostLoansLoanIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansLoanIdResponse**](PostLoansLoanIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Approve Loan Application | Recover Loan Guarantee | Undo Loan Application Approval | Assign a Loan Officer | Unassign a Loan Officer | Reject Loan Application | Applicant Withdraws from Loan Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal

Approve Loan Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the loan application  Recover Loan Guarantee: Recovers the loan guarantee  Undo Loan Application Approval: Undoes the Loan Application Approval  Assign a Loan Officer: Allows you to assign Loan Officer for existing Loan.  Unassign a Loan Officer: Allows you to unassign the Loan Officer.  Reject Loan Application: Mandatory Fields: rejectedOnDate Allows you to reject the loan application  Applicant Withdraws from Loan Application: Mandatory Fields: withdrawnOnDate Allows the applicant to withdraw the loan application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal Showing request and response for Assign a Loan Officer

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val postLoansLoanIdRequest : PostLoansLoanIdRequest =  // PostLoansLoanIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdResponse = webService.stateTransitions1(loanExternalId, postLoansLoanIdRequest, command)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **postLoansLoanIdRequest** | [**PostLoansLoanIdRequest**](PostLoansLoanIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansLoanIdResponse**](PostLoansLoanIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve Loan Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Requests:  loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoansApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val groupId : kotlin.Long = 789 // kotlin.Long | groupId
val productId : kotlin.Long = 789 // kotlin.Long | productId
val templateType : kotlin.String = templateType_example // kotlin.String | templateType
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly
val activeOnly : kotlin.Boolean = true // kotlin.Boolean | activeOnly

launch(Dispatchers.IO) {
    val result : GetLoansTemplateResponse = webService.template10(clientId, groupId, productId, templateType, staffInSelectedOfficeOnly, activeOnly)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | [optional] |
| **groupId** | **kotlin.Long**| groupId | [optional] |
| **productId** | **kotlin.Long**| productId | [optional] |
| **templateType** | **kotlin.String**| templateType | [optional] |
| **staffInSelectedOfficeOnly** | **kotlin.Boolean**| staffInSelectedOfficeOnly | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **activeOnly** | **kotlin.Boolean**| activeOnly | [optional] [default to false] |

### Return type

[**GetLoansTemplateResponse**](GetLoansTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


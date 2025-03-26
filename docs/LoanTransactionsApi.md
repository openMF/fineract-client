# LoanTransactionsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adjustLoanTransaction**](LoanTransactionsApi.md#adjustLoanTransaction) | **POST** v1/loans/{loanId}/transactions/{transactionId} | Adjust a Transaction |
| [**adjustLoanTransaction1**](LoanTransactionsApi.md#adjustLoanTransaction1) | **POST** v1/loans/{loanId}/transactions/external-id/{externalTransactionId} | Adjust a Transaction |
| [**adjustLoanTransaction2**](LoanTransactionsApi.md#adjustLoanTransaction2) | **POST** v1/loans/external-id/{loanExternalId}/transactions/{transactionId} | Adjust a Transaction |
| [**adjustLoanTransaction3**](LoanTransactionsApi.md#adjustLoanTransaction3) | **POST** v1/loans/external-id/{loanExternalId}/transactions/external-id/{externalTransactionId} | Adjust a Transaction |
| [**executeLoanTransaction**](LoanTransactionsApi.md#executeLoanTransaction) | **POST** v1/loans/{loanId}/transactions | Significant Loan Transactions |
| [**executeLoanTransaction1**](LoanTransactionsApi.md#executeLoanTransaction1) | **POST** v1/loans/external-id/{loanExternalId}/transactions | Significant Loan Transactions |
| [**retrieveTransaction**](LoanTransactionsApi.md#retrieveTransaction) | **GET** v1/loans/{loanId}/transactions/{transactionId} | Retrieve a Transaction Details |
| [**retrieveTransactionByLoanExternalIdAndTransactionExternalId**](LoanTransactionsApi.md#retrieveTransactionByLoanExternalIdAndTransactionExternalId) | **GET** v1/loans/external-id/{loanExternalId}/transactions/external-id/{externalTransactionId} | Retrieve a Transaction Details |
| [**retrieveTransactionByLoanExternalIdAndTransactionId**](LoanTransactionsApi.md#retrieveTransactionByLoanExternalIdAndTransactionId) | **GET** v1/loans/external-id/{loanExternalId}/transactions/{transactionId} | Retrieve a Transaction Details |
| [**retrieveTransactionByTransactionExternalId**](LoanTransactionsApi.md#retrieveTransactionByTransactionExternalId) | **GET** v1/loans/{loanId}/transactions/external-id/{externalTransactionId} | Retrieve a Transaction Details |
| [**retrieveTransactionTemplate**](LoanTransactionsApi.md#retrieveTransactionTemplate) | **GET** v1/loans/{loanId}/transactions/template | Retrieve Loan Transaction Template |
| [**retrieveTransactionTemplate1**](LoanTransactionsApi.md#retrieveTransactionTemplate1) | **GET** v1/loans/external-id/{loanExternalId}/transactions/template | Retrieve Loan Transaction Template |
| [**undoWaiveCharge**](LoanTransactionsApi.md#undoWaiveCharge) | **PUT** v1/loans/{loanId}/transactions/{transactionId} | Undo a Waive Charge Transaction |
| [**undoWaiveCharge1**](LoanTransactionsApi.md#undoWaiveCharge1) | **PUT** v1/loans/{loanId}/transactions/external-id/{transactionExternalId} | Undo a Waive Charge Transaction |
| [**undoWaiveCharge2**](LoanTransactionsApi.md#undoWaiveCharge2) | **PUT** v1/loans/external-id/{loanExternalId}/transactions/{transactionId} | Undo a Waive Charge Transaction |
| [**undoWaiveCharge3**](LoanTransactionsApi.md#undoWaiveCharge3) | **PUT** v1/loans/external-id/{loanExternalId}/transactions/external-id/{transactionExternalId} | Undo a Waive Charge Transaction |



Adjust a Transaction

Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId
val postLoansLoanIdTransactionsTransactionIdRequest : PostLoansLoanIdTransactionsTransactionIdRequest =  // PostLoansLoanIdTransactionsTransactionIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdTransactionsResponse = webService.adjustLoanTransaction(loanId, transactionId, postLoansLoanIdTransactionsTransactionIdRequest, command)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **transactionId** | **kotlin.Long**| transactionId | |
| **postLoansLoanIdTransactionsTransactionIdRequest** | [**PostLoansLoanIdTransactionsTransactionIdRequest**](PostLoansLoanIdTransactionsTransactionIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansLoanIdTransactionsResponse**](PostLoansLoanIdTransactionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Adjust a Transaction

Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val externalTransactionId : kotlin.String = externalTransactionId_example // kotlin.String | externalTransactionId
val postLoansLoanIdTransactionsTransactionIdRequest : PostLoansLoanIdTransactionsTransactionIdRequest =  // PostLoansLoanIdTransactionsTransactionIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdTransactionsResponse = webService.adjustLoanTransaction1(loanId, externalTransactionId, postLoansLoanIdTransactionsTransactionIdRequest, command)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **externalTransactionId** | **kotlin.String**| externalTransactionId | |
| **postLoansLoanIdTransactionsTransactionIdRequest** | [**PostLoansLoanIdTransactionsTransactionIdRequest**](PostLoansLoanIdTransactionsTransactionIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansLoanIdTransactionsResponse**](PostLoansLoanIdTransactionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Adjust a Transaction

Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId
val postLoansLoanIdTransactionsTransactionIdRequest : PostLoansLoanIdTransactionsTransactionIdRequest =  // PostLoansLoanIdTransactionsTransactionIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdTransactionsResponse = webService.adjustLoanTransaction2(loanExternalId, transactionId, postLoansLoanIdTransactionsTransactionIdRequest, command)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **transactionId** | **kotlin.Long**| transactionId | |
| **postLoansLoanIdTransactionsTransactionIdRequest** | [**PostLoansLoanIdTransactionsTransactionIdRequest**](PostLoansLoanIdTransactionsTransactionIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansLoanIdTransactionsResponse**](PostLoansLoanIdTransactionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Adjust a Transaction

Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val externalTransactionId : kotlin.String = externalTransactionId_example // kotlin.String | externalTransactionId
val postLoansLoanIdTransactionsTransactionIdRequest : PostLoansLoanIdTransactionsTransactionIdRequest =  // PostLoansLoanIdTransactionsTransactionIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdTransactionsResponse = webService.adjustLoanTransaction3(loanExternalId, externalTransactionId, postLoansLoanIdTransactionsTransactionIdRequest, command)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **externalTransactionId** | **kotlin.String**| externalTransactionId | |
| **postLoansLoanIdTransactionsTransactionIdRequest** | [**PostLoansLoanIdTransactionsTransactionIdRequest**](PostLoansLoanIdTransactionsTransactionIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansLoanIdTransactionsResponse**](PostLoansLoanIdTransactionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Significant Loan Transactions

This API covers the major loan transaction functionality  Example Requests:  loans/1/transactions?command&#x3D;repayment | Make a Repayment |  loans/1/transactions?command&#x3D;merchantIssuedRefund | Merchant Issued Refund |  loans/1/transactions?command&#x3D;payoutRefund | Payout Refund |  loans/1/transactions?command&#x3D;goodwillCredit | Goodwil Credit |  loans/1/transactions?command&#x3D;chargeRefund | Charge Refund |  loans/1/transactions?command&#x3D;waiveinterest | Waive Interest |  loans/1/transactions?command&#x3D;writeoff | Write-off Loan |  loans/1/transactions?command&#x3D;close-rescheduled | Close Rescheduled Loan |  loans/1/transactions?command&#x3D;close | Close Loan |  loans/1/transactions?command&#x3D;undowriteoff | Undo Loan Write-off |  loans/1/transactions?command&#x3D;recoverypayment | Make Recovery Payment |  loans/1/transactions?command&#x3D;refundByCash | Make a Refund of an Active Loan by Cash |  loans/1/transactions?command&#x3D;foreclosure | Foreclosure of an Active Loan |  loans/1/transactions?command&#x3D;creditBalanceRefund | Credit Balance Refund |   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;charge-off | Charge-off Loan |   loans/1/transactions?command&#x3D;downPayment | Down Payment |   

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val postLoansLoanIdTransactionsRequest : PostLoansLoanIdTransactionsRequest =  // PostLoansLoanIdTransactionsRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdTransactionsResponse = webService.executeLoanTransaction(loanId, postLoansLoanIdTransactionsRequest, command)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **postLoansLoanIdTransactionsRequest** | [**PostLoansLoanIdTransactionsRequest**](PostLoansLoanIdTransactionsRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansLoanIdTransactionsResponse**](PostLoansLoanIdTransactionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Significant Loan Transactions

This API covers the major loan transaction functionality  Example Requests:  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;repayment | Make a Repayment |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;merchantIssuedRefund | Merchant Issued Refund |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;payoutRefund | Payout Refund |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;goodwillCredit | Goodwil Credit |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;chargeRefund | Charge Refund |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;waiveinterest | Waive Interest |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;writeoff | Write-off Loan |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;close-rescheduled | Close Rescheduled Loan |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;close | Close Loan |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;undowriteoff | Undo Loan Write-off |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;recoverypayment | Make Recovery Payment |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;refundByCash | Make a Refund of an Active Loan by Cash |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;foreclosure | Foreclosure of an Active Loan |  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;creditBalanceRefund | Credit Balance Refund |   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;charge-off | Charge-off Loan |   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?command&#x3D;downPayment | Down Payment |   

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val postLoansLoanIdTransactionsRequest : PostLoansLoanIdTransactionsRequest =  // PostLoansLoanIdTransactionsRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdTransactionsResponse = webService.executeLoanTransaction1(loanExternalId, postLoansLoanIdTransactionsRequest, command)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **postLoansLoanIdTransactionsRequest** | [**PostLoansLoanIdTransactionsRequest**](PostLoansLoanIdTransactionsRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansLoanIdTransactionsResponse**](PostLoansLoanIdTransactionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve a Transaction Details

Retrieves a Transaction Details  Example Request:  loans/5/transactions/3

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId
val fields : kotlin.String = id,date,amount // kotlin.String | Optional Loan Transaction attribute list to be in the response

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdTransactionsTransactionIdResponse = webService.retrieveTransaction(loanId, transactionId, fields)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **transactionId** | **kotlin.Long**| transactionId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fields** | **kotlin.String**| Optional Loan Transaction attribute list to be in the response | [optional] |

### Return type

[**GetLoansLoanIdTransactionsTransactionIdResponse**](GetLoansLoanIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Transaction Details

Retrieves a Transaction Details  Example Request:  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions/external-id/5dd80a7c-ccba-4446-b378-01eb6f53e871

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val externalTransactionId : kotlin.String = externalTransactionId_example // kotlin.String | externalTransactionId
val fields : kotlin.String = id,date,amount // kotlin.String | Optional Loan Transaction attribute list to be in the response

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdTransactionsTransactionIdResponse = webService.retrieveTransactionByLoanExternalIdAndTransactionExternalId(loanExternalId, externalTransactionId, fields)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **externalTransactionId** | **kotlin.String**| externalTransactionId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fields** | **kotlin.String**| Optional Loan Transaction attribute list to be in the response | [optional] |

### Return type

[**GetLoansLoanIdTransactionsTransactionIdResponse**](GetLoansLoanIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Transaction Details

Retrieves a Transaction Details  Example Request:  loans/5/transactions/3

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId
val fields : kotlin.String = id,date,amount // kotlin.String | Optional Loan Transaction attribute list to be in the response

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdTransactionsTransactionIdResponse = webService.retrieveTransactionByLoanExternalIdAndTransactionId(loanExternalId, transactionId, fields)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **transactionId** | **kotlin.Long**| transactionId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fields** | **kotlin.String**| Optional Loan Transaction attribute list to be in the response | [optional] |

### Return type

[**GetLoansLoanIdTransactionsTransactionIdResponse**](GetLoansLoanIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Transaction Details

Retrieves a Transaction Details  Example Request:  loans/5/transactions/external-id/5dd80a7c-ccba-4446-b378-01eb6f53e871

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val externalTransactionId : kotlin.String = externalTransactionId_example // kotlin.String | externalTransactionId
val fields : kotlin.String = id,date,amount // kotlin.String | Optional Loan Transaction attribute list to be in the response

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdTransactionsTransactionIdResponse = webService.retrieveTransactionByTransactionExternalId(loanId, externalTransactionId, fields)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **externalTransactionId** | **kotlin.String**| externalTransactionId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fields** | **kotlin.String**| Optional Loan Transaction attribute list to be in the response | [optional] |

### Return type

[**GetLoansLoanIdTransactionsTransactionIdResponse**](GetLoansLoanIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Loan Transaction Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  loans/1/transactions/template?command&#x3D;repaymentloans/1/transactions/template?command&#x3D;merchantIssuedRefundloans/1/transactions/template?command&#x3D;payoutRefundloans/1/transactions/template?command&#x3D;goodwillCredit loans/1/transactions/template?command&#x3D;waiveinterest loans/1/transactions/template?command&#x3D;writeoff loans/1/transactions/template?command&#x3D;close-rescheduled loans/1/transactions/template?command&#x3D;close loans/1/transactions/template?command&#x3D;disburse loans/1/transactions/template?command&#x3D;disburseToSavings loans/1/transactions/template?command&#x3D;recoverypayment loans/1/transactions/template?command&#x3D;prepayLoan loans/1/transactions/template?command&#x3D;refundbycash loans/1/transactions/template?command&#x3D;refundbytransfer loans/1/transactions/template?command&#x3D;foreclosure loans/1/transactions/template?command&#x3D;creditBalanceRefund (returned &#39;amount&#39; field will have the overpaid value) loans/1/transactions/template?command&#x3D;charge-off loans/1/transactions/template?command&#x3D;downPayment 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val command : kotlin.String = command_example // kotlin.String | command
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | dateFormat
val transactionDate : kotlin.Any = Object // kotlin.Any | transactionDate
val locale : kotlin.String = locale_example // kotlin.String | locale

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdTransactionsTemplateResponse = webService.retrieveTransactionTemplate(loanId, command, dateFormat, transactionDate, locale)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **command** | **kotlin.String**| command | [optional] |
| **dateFormat** | **kotlin.String**| dateFormat | [optional] |
| **transactionDate** | [**kotlin.Any**](.md)| transactionDate | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**| locale | [optional] |

### Return type

[**GetLoansLoanIdTransactionsTemplateResponse**](GetLoansLoanIdTransactionsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Loan Transaction Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  loans/1/transactions/template?command&#x3D;repaymentloans/1/transactions/template?command&#x3D;merchantIssuedRefundloans/1/transactions/template?command&#x3D;payoutRefundloans/1/transactions/template?command&#x3D;goodwillCredit loans/1/transactions/template?command&#x3D;waiveinterest loans/1/transactions/template?command&#x3D;writeoff loans/1/transactions/template?command&#x3D;close-rescheduled loans/1/transactions/template?command&#x3D;close loans/1/transactions/template?command&#x3D;disburse loans/1/transactions/template?command&#x3D;disburseToSavings loans/1/transactions/template?command&#x3D;recoverypayment loans/1/transactions/template?command&#x3D;prepayLoan loans/1/transactions/template?command&#x3D;refundbycash loans/1/transactions/template?command&#x3D;refundbytransfer loans/1/transactions/template?command&#x3D;foreclosure loans/1/transactions/template?command&#x3D;creditBalanceRefund (returned &#39;amount&#39; field will have the overpaid value) loans/1/transactions/template?command&#x3D;charge-off loans/1/transactions/template?command&#x3D;downPayment 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val command : kotlin.String = command_example // kotlin.String | command
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | dateFormat
val transactionDate : kotlin.Any = Object // kotlin.Any | transactionDate
val locale : kotlin.String = locale_example // kotlin.String | locale

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdTransactionsTemplateResponse = webService.retrieveTransactionTemplate1(loanExternalId, command, dateFormat, transactionDate, locale)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **command** | **kotlin.String**| command | [optional] |
| **dateFormat** | **kotlin.String**| dateFormat | [optional] |
| **transactionDate** | [**kotlin.Any**](.md)| transactionDate | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**| locale | [optional] |

### Return type

[**GetLoansLoanIdTransactionsTemplateResponse**](GetLoansLoanIdTransactionsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Undo a Waive Charge Transaction

Undo a Waive Charge Transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId
val putChargeTransactionChangesRequest : PutChargeTransactionChangesRequest =  // PutChargeTransactionChangesRequest | 

launch(Dispatchers.IO) {
    val result : PutChargeTransactionChangesResponse = webService.undoWaiveCharge(loanId, transactionId, putChargeTransactionChangesRequest)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **transactionId** | **kotlin.Long**| transactionId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putChargeTransactionChangesRequest** | [**PutChargeTransactionChangesRequest**](PutChargeTransactionChangesRequest.md)|  | |

### Return type

[**PutChargeTransactionChangesResponse**](PutChargeTransactionChangesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Undo a Waive Charge Transaction

Undo a Waive Charge Transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val transactionExternalId : kotlin.String = transactionExternalId_example // kotlin.String | transactionExternalId
val putChargeTransactionChangesRequest : PutChargeTransactionChangesRequest =  // PutChargeTransactionChangesRequest | 

launch(Dispatchers.IO) {
    val result : PutChargeTransactionChangesResponse = webService.undoWaiveCharge1(loanId, transactionExternalId, putChargeTransactionChangesRequest)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **transactionExternalId** | **kotlin.String**| transactionExternalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putChargeTransactionChangesRequest** | [**PutChargeTransactionChangesRequest**](PutChargeTransactionChangesRequest.md)|  | |

### Return type

[**PutChargeTransactionChangesResponse**](PutChargeTransactionChangesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Undo a Waive Charge Transaction

Undo a Waive Charge Transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId
val putChargeTransactionChangesRequest : PutChargeTransactionChangesRequest =  // PutChargeTransactionChangesRequest | 

launch(Dispatchers.IO) {
    val result : PutChargeTransactionChangesResponse = webService.undoWaiveCharge2(loanExternalId, transactionId, putChargeTransactionChangesRequest)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **transactionId** | **kotlin.Long**| transactionId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putChargeTransactionChangesRequest** | [**PutChargeTransactionChangesRequest**](PutChargeTransactionChangesRequest.md)|  | |

### Return type

[**PutChargeTransactionChangesResponse**](PutChargeTransactionChangesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Undo a Waive Charge Transaction

Undo a Waive Charge Transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanTransactionsApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val transactionExternalId : kotlin.String = transactionExternalId_example // kotlin.String | transactionExternalId
val putChargeTransactionChangesRequest : PutChargeTransactionChangesRequest =  // PutChargeTransactionChangesRequest | 

launch(Dispatchers.IO) {
    val result : PutChargeTransactionChangesResponse = webService.undoWaiveCharge3(loanExternalId, transactionExternalId, putChargeTransactionChangesRequest)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **transactionExternalId** | **kotlin.String**| transactionExternalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putChargeTransactionChangesRequest** | [**PutChargeTransactionChangesRequest**](PutChargeTransactionChangesRequest.md)|  | |

### Return type

[**PutChargeTransactionChangesResponse**](PutChargeTransactionChangesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


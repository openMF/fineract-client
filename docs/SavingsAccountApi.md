# SavingsAccountApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**delete19**](SavingsAccountApi.md#delete19) | **DELETE** v1/savingsaccounts/{accountId} | Delete a savings application |
| [**delete20**](SavingsAccountApi.md#delete20) | **DELETE** v1/savingsaccounts/external-id/{externalId} | Delete a savings application |
| [**getSavingsTemplate**](SavingsAccountApi.md#getSavingsTemplate) | **GET** v1/savingsaccounts/downloadtemplate |  |
| [**getSavingsTransactionTemplate**](SavingsAccountApi.md#getSavingsTransactionTemplate) | **GET** v1/savingsaccounts/transactions/downloadtemplate |  |
| [**handleCommands6**](SavingsAccountApi.md#handleCommands6) | **POST** v1/savingsaccounts/{accountId} | Approve savings application | Undo approval savings application | Assign Savings Officer | Unassign Savings Officer | Reject savings application | Withdraw savings application | Activate a savings account | Close a savings account | Calculate Interest on Savings Account | Post Interest on Savings Account | Block Savings Account | Unblock Savings Account | Block Savings Account Credit transactions | Unblock Savings Account Credit transactions | Block Savings Account Debit transactions | Unblock Savings Account debit transactions |
| [**handleCommands7**](SavingsAccountApi.md#handleCommands7) | **POST** v1/savingsaccounts/external-id/{externalId} | Approve savings application | Undo approval savings application | Assign Savings Officer | Unassign Savings Officer | Reject savings application | Withdraw savings application | Activate a savings account | Close a savings account | Calculate Interest on Savings Account | Post Interest on Savings Account | Block Savings Account | Unblock Savings Account | Block Savings Account Credit transactions | Unblock Savings Account Credit transactions | Block Savings Account Debit transactions | Unblock Savings Account debit transactions |
| [**handleGSIMCommands**](SavingsAccountApi.md#handleGSIMCommands) | **POST** v1/savingsaccounts/gsimcommands/{parentAccountId} |  |
| [**postSavingsTemplate**](SavingsAccountApi.md#postSavingsTemplate) | **POST** v1/savingsaccounts/uploadtemplate |  |
| [**postSavingsTransactionTemplate**](SavingsAccountApi.md#postSavingsTransactionTemplate) | **POST** v1/savingsaccounts/transactions/uploadtemplate |  |
| [**retrieveAll33**](SavingsAccountApi.md#retrieveAll33) | **GET** v1/savingsaccounts | List savings applications/accounts |
| [**retrieveOne25**](SavingsAccountApi.md#retrieveOne25) | **GET** v1/savingsaccounts/{accountId} | Retrieve a savings application/account |
| [**retrieveOne26**](SavingsAccountApi.md#retrieveOne26) | **GET** v1/savingsaccounts/external-id/{externalId} | Retrieve a savings application/account by external id |
| [**submitApplication2**](SavingsAccountApi.md#submitApplication2) | **POST** v1/savingsaccounts | Submit new savings application |
| [**submitGSIMApplication**](SavingsAccountApi.md#submitGSIMApplication) | **POST** v1/savingsaccounts/gsim |  |
| [**template14**](SavingsAccountApi.md#template14) | **GET** v1/savingsaccounts/template | Retrieve Savings Account Template |
| [**update20**](SavingsAccountApi.md#update20) | **PUT** v1/savingsaccounts/{accountId} | Modify a savings application | Modify savings account withhold tax applicability |
| [**update21**](SavingsAccountApi.md#update21) | **PUT** v1/savingsaccounts/external-id/{externalId} | Modify a savings application | Modify savings account withhold tax applicability |
| [**updateGsim**](SavingsAccountApi.md#updateGsim) | **PUT** v1/savingsaccounts/gsim/{parentAccountId} |  |



Delete a savings application

At present we support hard delete of savings application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the savings account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | accountId

launch(Dispatchers.IO) {
    val result : DeleteSavingsAccountsAccountIdResponse = webService.delete19(accountId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.Long**| accountId | |

### Return type

[**DeleteSavingsAccountsAccountIdResponse**](DeleteSavingsAccountsAccountIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Delete a savings application

At present we support hard delete of savings application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the savings account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId

launch(Dispatchers.IO) {
    val result : DeleteSavingsAccountsAccountIdResponse = webService.delete20(externalId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String**| externalId | |

### Return type

[**DeleteSavingsAccountsAccountIdResponse**](DeleteSavingsAccountsAccountIdResponse.md)

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
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 
val staffId : kotlin.Long = 789 // kotlin.Long | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getSavingsTemplate(officeId, staffId, dateFormat)
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




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getSavingsTransactionTemplate(officeId, dateFormat)
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


Approve savings application | Undo approval savings application | Assign Savings Officer | Unassign Savings Officer | Reject savings application | Withdraw savings application | Activate a savings account | Close a savings account | Calculate Interest on Savings Account | Post Interest on Savings Account | Block Savings Account | Unblock Savings Account | Block Savings Account Credit transactions | Unblock Savings Account Credit transactions | Block Savings Account Debit transactions | Unblock Savings Account debit transactions

Approve savings application:  Approves savings application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval savings application:  Will move &#39;approved&#39; savings application back to &#39;Submitted and pending approval&#39; state.  Assign Savings Officer:  Allows you to assign Savings Officer for existing Savings Account.  Unassign Savings Officer:  Allows you to unassign the Savings Officer.  Reject savings application:  Rejects savings application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw savings application:  Used when an applicant withdraws from the savings application. It must be in &#39;Submitted and pending approval&#39; state.  Activate a savings account:  Results in an approved savings application being converted into an &#39;active&#39; savings account.  Close a savings account:  Results in an Activated savings application being converted into an &#39;closed&#39; savings account.  closedOnDate is closure date of savings account  withdrawBalance is a boolean description, true value of this field performs a withdrawal transaction with account&#39;s running balance.  Mandatory Fields: dateFormat,locale,closedOnDate  Optional Fields: note, withdrawBalance, paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber  Calculate Interest on Savings Account:  Calculates interest earned on a savings account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Savings Account:  Calculates and Posts interest earned on a savings account based on today&#39;s date and whether an interest posting or crediting event is due.  Block Savings Account:  Blocks Savings account from all types of credit and debit transactions  Unblock Savings Account:  Unblock a blocked account. On unblocking account, user can perform debit and credit transactions  Block Savings Account Credit transactions:  Savings account will be blocked from all types of credit transactions.  Unblock Savings Account Credit transactions:  It unblocks the Saving account&#39;s credit operations. Now all types of credits can be transacted to Savings account  Block Savings Account Debit transactions:  All types of debit operations from Savings account wil be blocked  Unblock Savings Account debit transactions:  It unblocks the Saving account&#39;s debit operations. Now all types of debits can be transacted from Savings account  Showing request/response for &#39;Unassign Savings Officer&#39;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | accountId
val postSavingsAccountsAccountIdRequest : PostSavingsAccountsAccountIdRequest =  // PostSavingsAccountsAccountIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostSavingsAccountsAccountIdResponse = webService.handleCommands6(accountId, postSavingsAccountsAccountIdRequest, command)
}
```

### Parameters
| **accountId** | **kotlin.Long**| accountId | |
| **postSavingsAccountsAccountIdRequest** | [**PostSavingsAccountsAccountIdRequest**](PostSavingsAccountsAccountIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostSavingsAccountsAccountIdResponse**](PostSavingsAccountsAccountIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Approve savings application | Undo approval savings application | Assign Savings Officer | Unassign Savings Officer | Reject savings application | Withdraw savings application | Activate a savings account | Close a savings account | Calculate Interest on Savings Account | Post Interest on Savings Account | Block Savings Account | Unblock Savings Account | Block Savings Account Credit transactions | Unblock Savings Account Credit transactions | Block Savings Account Debit transactions | Unblock Savings Account debit transactions

Approve savings application:  Approves savings application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval savings application:  Will move &#39;approved&#39; savings application back to &#39;Submitted and pending approval&#39; state.  Assign Savings Officer:  Allows you to assign Savings Officer for existing Savings Account.  Unassign Savings Officer:  Allows you to unassign the Savings Officer.  Reject savings application:  Rejects savings application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw savings application:  Used when an applicant withdraws from the savings application. It must be in &#39;Submitted and pending approval&#39; state.  Activate a savings account:  Results in an approved savings application being converted into an &#39;active&#39; savings account.  Close a savings account:  Results in an Activated savings application being converted into an &#39;closed&#39; savings account.  closedOnDate is closure date of savings account  withdrawBalance is a boolean description, true value of this field performs a withdrawal transaction with account&#39;s running balance.  Mandatory Fields: dateFormat,locale,closedOnDate  Optional Fields: note, withdrawBalance, paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber  Calculate Interest on Savings Account:  Calculates interest earned on a savings account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Savings Account:  Calculates and Posts interest earned on a savings account based on today&#39;s date and whether an interest posting or crediting event is due.  Block Savings Account:  Blocks Savings account from all types of credit and debit transactions  Unblock Savings Account:  Unblock a blocked account. On unblocking account, user can perform debit and credit transactions  Block Savings Account Credit transactions:  Savings account will be blocked from all types of credit transactions.  Unblock Savings Account Credit transactions:  It unblocks the Saving account&#39;s credit operations. Now all types of credits can be transacted to Savings account  Block Savings Account Debit transactions:  All types of debit operations from Savings account wil be blocked  Unblock Savings Account debit transactions:  It unblocks the Saving account&#39;s debit operations. Now all types of debits can be transacted from Savings account  Showing request/response for &#39;Unassign Savings Officer&#39;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val postSavingsAccountsAccountIdRequest : PostSavingsAccountsAccountIdRequest =  // PostSavingsAccountsAccountIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostSavingsAccountsAccountIdResponse = webService.handleCommands7(externalId, postSavingsAccountsAccountIdRequest, command)
}
```

### Parameters
| **externalId** | **kotlin.String**| externalId | |
| **postSavingsAccountsAccountIdRequest** | [**PostSavingsAccountsAccountIdRequest**](PostSavingsAccountsAccountIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostSavingsAccountsAccountIdResponse**](PostSavingsAccountsAccountIdResponse.md)

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
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val parentAccountId : kotlin.Long = 789 // kotlin.Long | 
val command : kotlin.String = command_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.handleGSIMCommands(parentAccountId, command, body)
}
```

### Parameters
| **parentAccountId** | **kotlin.Long**|  | |
| **command** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

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
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postSavingsTemplate(dateFormat, locale, uploadedInputStream)
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
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postSavingsTransactionTemplate(dateFormat, locale, uploadedInputStream)
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


List savings applications/accounts

Lists savings applications/accounts  Example Requests:  savingsaccounts   savingsaccounts?fields&#x3D;name

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder

launch(Dispatchers.IO) {
    val result : GetSavingsAccountsResponse = webService.retrieveAll33(externalId, offset, limit, orderBy, sortOrder)
}
```

### Parameters
| **externalId** | **kotlin.String**| externalId | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |

### Return type

[**GetSavingsAccountsResponse**](GetSavingsAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a savings application/account

Retrieves a savings application/account  Example Requests :  savingsaccounts/1   savingsaccounts/1?associations&#x3D;all

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | accountId
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly
val chargeStatus : kotlin.String = chargeStatus_example // kotlin.String | chargeStatus

launch(Dispatchers.IO) {
    val result : GetSavingsAccountsAccountIdResponse = webService.retrieveOne25(accountId, staffInSelectedOfficeOnly, chargeStatus)
}
```

### Parameters
| **accountId** | **kotlin.Long**| accountId | |
| **staffInSelectedOfficeOnly** | **kotlin.Boolean**| staffInSelectedOfficeOnly | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chargeStatus** | **kotlin.String**| chargeStatus | [optional] [default to &quot;all&quot;] |

### Return type

[**GetSavingsAccountsAccountIdResponse**](GetSavingsAccountsAccountIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a savings application/account by external id

Retrieves a savings application/account by external id  Example Requests :  savingsaccounts/external-id/ExternalId1   savingsaccounts/external-id/ExternalId1?associations&#x3D;all

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly
val chargeStatus : kotlin.String = chargeStatus_example // kotlin.String | chargeStatus

launch(Dispatchers.IO) {
    val result : GetSavingsAccountsAccountIdResponse = webService.retrieveOne26(externalId, staffInSelectedOfficeOnly, chargeStatus)
}
```

### Parameters
| **externalId** | **kotlin.String**| externalId | |
| **staffInSelectedOfficeOnly** | **kotlin.Boolean**| staffInSelectedOfficeOnly | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chargeStatus** | **kotlin.String**| chargeStatus | [optional] [default to &quot;all&quot;] |

### Return type

[**GetSavingsAccountsAccountIdResponse**](GetSavingsAccountsAccountIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Submit new savings application

Submits new savings application  Mandatory Fields: clientId or groupId, productId, submittedOnDate  Optional Fields: accountNo, externalId, fieldOfficerId  Inherited from Product (if not provided): nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, allowOverdraft, overdraftLimit, withHoldTax  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type Savings: datatables

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val postSavingsAccountsRequest : PostSavingsAccountsRequest =  // PostSavingsAccountsRequest | 

launch(Dispatchers.IO) {
    val result : PostSavingsAccountsResponse = webService.submitApplication2(postSavingsAccountsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postSavingsAccountsRequest** | [**PostSavingsAccountsRequest**](PostSavingsAccountsRequest.md)|  | |

### Return type

[**PostSavingsAccountsResponse**](PostSavingsAccountsResponse.md)

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
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.submitGSIMApplication(body)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve Savings Account Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  savingsaccounts/template?clientId&#x3D;1   savingsaccounts/template?clientId&#x3D;1&amp;productId&#x3D;1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val groupId : kotlin.Long = 789 // kotlin.Long | groupId
val productId : kotlin.Long = 789 // kotlin.Long | productId
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly

launch(Dispatchers.IO) {
    val result : GetSavingsAccountsTemplateResponse = webService.template14(clientId, groupId, productId, staffInSelectedOfficeOnly)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | [optional] |
| **groupId** | **kotlin.Long**| groupId | [optional] |
| **productId** | **kotlin.Long**| productId | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **staffInSelectedOfficeOnly** | **kotlin.Boolean**| staffInSelectedOfficeOnly | [optional] [default to false] |

### Return type

[**GetSavingsAccountsTemplateResponse**](GetSavingsAccountsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Modify a savings application | Modify savings account withhold tax applicability

Modify a savings application:  Savings application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc  Modify savings account withhold tax applicability:  Savings application&#39;s withhold tax can be modified when in &#39;Active&#39; state. Once the application is activated, can modify the account withhold tax to post tax or vice-versaShowing request/response for &#39;Modify a savings application&#39;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | accountId
val putSavingsAccountsAccountIdRequest : PutSavingsAccountsAccountIdRequest =  // PutSavingsAccountsAccountIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PutSavingsAccountsAccountIdResponse = webService.update20(accountId, putSavingsAccountsAccountIdRequest, command)
}
```

### Parameters
| **accountId** | **kotlin.Long**| accountId | |
| **putSavingsAccountsAccountIdRequest** | [**PutSavingsAccountsAccountIdRequest**](PutSavingsAccountsAccountIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PutSavingsAccountsAccountIdResponse**](PutSavingsAccountsAccountIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Modify a savings application | Modify savings account withhold tax applicability

Modify a savings application:  Savings application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc  Modify savings account withhold tax applicability:  Savings application&#39;s withhold tax can be modified when in &#39;Active&#39; state. Once the application is activated, can modify the account withhold tax to post tax or vice-versaShowing request/response for &#39;Modify a savings application&#39;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val putSavingsAccountsAccountIdRequest : PutSavingsAccountsAccountIdRequest =  // PutSavingsAccountsAccountIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PutSavingsAccountsAccountIdResponse = webService.update21(externalId, putSavingsAccountsAccountIdRequest, command)
}
```

### Parameters
| **externalId** | **kotlin.String**| externalId | |
| **putSavingsAccountsAccountIdRequest** | [**PutSavingsAccountsAccountIdRequest**](PutSavingsAccountsAccountIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PutSavingsAccountsAccountIdResponse**](PutSavingsAccountsAccountIdResponse.md)

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
val webService = apiClient.createWebservice(SavingsAccountApi::class.java)
val parentAccountId : kotlin.Long = 789 // kotlin.Long | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.updateGsim(parentAccountId, body)
}
```

### Parameters
| **parentAccountId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


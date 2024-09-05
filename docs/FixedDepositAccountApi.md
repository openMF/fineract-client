# FixedDepositAccountApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**accountClosureTemplate**](FixedDepositAccountApi.md#accountClosureTemplate) | **GET** v1/fixeddepositaccounts/{accountId}/template |  |
| [**delete15**](FixedDepositAccountApi.md#delete15) | **DELETE** v1/fixeddepositaccounts/{accountId} | Delete a fixed deposit application |
| [**getFixedDepositTemplate**](FixedDepositAccountApi.md#getFixedDepositTemplate) | **GET** v1/fixeddepositaccounts/downloadtemplate |  |
| [**getFixedDepositTransactionTemplate**](FixedDepositAccountApi.md#getFixedDepositTransactionTemplate) | **GET** v1/fixeddepositaccounts/transaction/downloadtemplate |  |
| [**handleCommands4**](FixedDepositAccountApi.md#handleCommands4) | **POST** v1/fixeddepositaccounts/{accountId} | Approve fixed deposit application | Undo approval fixed deposit application | Reject fixed deposit application | Withdraw fixed deposit application | Activate a fixed deposit account | Close a fixed deposit account | Premature Close a fixed deposit account | Calculate Premature amount on Fixed deposit account | Calculate Interest on Fixed Deposit Account | Post Interest on Fixed Deposit Account |
| [**postFixedDepositTemplate**](FixedDepositAccountApi.md#postFixedDepositTemplate) | **POST** v1/fixeddepositaccounts/uploadtemplate |  |
| [**postFixedDepositTransactionTemplate**](FixedDepositAccountApi.md#postFixedDepositTransactionTemplate) | **POST** v1/fixeddepositaccounts/transaction/uploadtemplate |  |
| [**retrieveAll29**](FixedDepositAccountApi.md#retrieveAll29) | **GET** v1/fixeddepositaccounts | List Fixed deposit applications/accounts |
| [**retrieveOne19**](FixedDepositAccountApi.md#retrieveOne19) | **GET** v1/fixeddepositaccounts/{accountId} | Retrieve a fixed deposit application/account |
| [**submitApplication**](FixedDepositAccountApi.md#submitApplication) | **POST** v1/fixeddepositaccounts | Submit new fixed deposit application |
| [**template12**](FixedDepositAccountApi.md#template12) | **GET** v1/fixeddepositaccounts/template | Retrieve Fixed Deposit Account Template |
| [**update16**](FixedDepositAccountApi.md#update16) | **PUT** v1/fixeddepositaccounts/{accountId} | Modify a fixed deposit application |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FixedDepositAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | accountId
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.accountClosureTemplate(accountId, command)
}
```

### Parameters
| **accountId** | **kotlin.Long**| accountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Delete a fixed deposit application

At present we support hard delete of fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the fixed deposit account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FixedDepositAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | accountId

launch(Dispatchers.IO) {
    val result : DeleteFixedDepositAccountsAccountIdResponse = webService.delete15(accountId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.Long**| accountId | |

### Return type

[**DeleteFixedDepositAccountsAccountIdResponse**](DeleteFixedDepositAccountsAccountIdResponse.md)

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
val webService = apiClient.createWebservice(FixedDepositAccountApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 
val staffId : kotlin.Long = 789 // kotlin.Long | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getFixedDepositTemplate(officeId, staffId, dateFormat)
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
val webService = apiClient.createWebservice(FixedDepositAccountApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getFixedDepositTransactionTemplate(officeId, dateFormat)
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


Approve fixed deposit application | Undo approval fixed deposit application | Reject fixed deposit application | Withdraw fixed deposit application | Activate a fixed deposit account | Close a fixed deposit account | Premature Close a fixed deposit account | Calculate Premature amount on Fixed deposit account | Calculate Interest on Fixed Deposit Account | Post Interest on Fixed Deposit Account

Approve fixed deposit application:  Approves fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval fixed deposit application:  Will move &#39;approved&#39; fixed deposit application back to &#39;Submitted and pending approval&#39; state.  Reject fixed deposit application:  Rejects fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw fixed deposit application:  Used when an applicant withdraws from the fixed deposit application. It must be in &#39;Submitted and pending approval&#39; state.  Close a fixed deposit account:  Results in a Matured fixed deposit account being converted into a &#39;closed&#39; fixed deposit account.  Premature Close a fixed deposit account:  Results in an Active fixed deposit account being converted into a &#39;Premature Closed&#39; fixed deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  Calculate Premature amount on Fixed deposit account:  Calculate premature amount on fixed deposit account till premature close date. Premature amount is calculated based on interest chart and penal interest applicable.  Calculate Interest on Fixed Deposit Account:  Calculates interest earned on a fixed deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Fixed Deposit Account:  Calculates and Posts interest earned on a fixed deposit account based on today&#39;s date and whether an interest posting or crediting event is due.  Showing request/response for Calculate Interest on Fixed Deposit Account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FixedDepositAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | accountId
val body : kotlin.Any = Object // kotlin.Any | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostFixedDepositAccountsAccountIdResponse = webService.handleCommands4(accountId, body, command)
}
```

### Parameters
| **accountId** | **kotlin.Long**| accountId | |
| **body** | **kotlin.Any**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostFixedDepositAccountsAccountIdResponse**](PostFixedDepositAccountsAccountIdResponse.md)

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
val webService = apiClient.createWebservice(FixedDepositAccountApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postFixedDepositTemplate(dateFormat, locale, uploadedInputStream)
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
val webService = apiClient.createWebservice(FixedDepositAccountApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postFixedDepositTransactionTemplate(dateFormat, locale, uploadedInputStream)
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


List Fixed deposit applications/accounts

Lists Fixed Deposit Accounts  Example Requests:    fixeddepositaccounts    fixeddepositaccounts?fields&#x3D;name

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FixedDepositAccountApi::class.java)
val paged : kotlin.Boolean = true // kotlin.Boolean | paged
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetFixedDepositAccountsResponse> = webService.retrieveAll29(paged, offset, limit, orderBy, sortOrder)
}
```

### Parameters
| **paged** | **kotlin.Boolean**| paged | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |

### Return type

[**kotlin.collections.List&lt;GetFixedDepositAccountsResponse&gt;**](GetFixedDepositAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a fixed deposit application/account

Retrieves a fixed deposit application/account  Example Requests :    fixeddepositaccounts/1  fixeddepositaccounts/1?associations&#x3D;all

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FixedDepositAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | accountId
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly
val chargeStatus : kotlin.String = chargeStatus_example // kotlin.String | chargeStatus

launch(Dispatchers.IO) {
    val result : GetFixedDepositAccountsAccountIdResponse = webService.retrieveOne19(accountId, staffInSelectedOfficeOnly, chargeStatus)
}
```

### Parameters
| **accountId** | **kotlin.Long**| accountId | |
| **staffInSelectedOfficeOnly** | **kotlin.Boolean**| staffInSelectedOfficeOnly | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chargeStatus** | **kotlin.String**| chargeStatus | [optional] [default to &quot;all&quot;] |

### Return type

[**GetFixedDepositAccountsAccountIdResponse**](GetFixedDepositAccountsAccountIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Submit new fixed deposit application

Submits a new fixed deposit applicationMandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FixedDepositAccountApi::class.java)
val postFixedDepositAccountsRequest : PostFixedDepositAccountsRequest =  // PostFixedDepositAccountsRequest | 

launch(Dispatchers.IO) {
    val result : PostFixedDepositAccountsResponse = webService.submitApplication(postFixedDepositAccountsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postFixedDepositAccountsRequest** | [**PostFixedDepositAccountsRequest**](PostFixedDepositAccountsRequest.md)|  | |

### Return type

[**PostFixedDepositAccountsResponse**](PostFixedDepositAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve Fixed Deposit Account Template

This is a convenience resource. It can be useful when building maintenance user interface screens for fixed deposit applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value ListsExample Requests:    fixeddepositaccounts/template?clientId&#x3D;1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FixedDepositAccountApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val groupId : kotlin.Long = 789 // kotlin.Long | groupId
val productId : kotlin.Long = 789 // kotlin.Long | productId
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly

launch(Dispatchers.IO) {
    val result : GetFixedDepositAccountsTemplateResponse = webService.template12(clientId, groupId, productId, staffInSelectedOfficeOnly)
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

[**GetFixedDepositAccountsTemplateResponse**](GetFixedDepositAccountsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Modify a fixed deposit application

Fixed deposit application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FixedDepositAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | accountId
val putFixedDepositAccountsAccountIdRequest : PutFixedDepositAccountsAccountIdRequest =  // PutFixedDepositAccountsAccountIdRequest | 

launch(Dispatchers.IO) {
    val result : PutFixedDepositAccountsAccountIdResponse = webService.update16(accountId, putFixedDepositAccountsAccountIdRequest)
}
```

### Parameters
| **accountId** | **kotlin.Long**| accountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putFixedDepositAccountsAccountIdRequest** | [**PutFixedDepositAccountsAccountIdRequest**](PutFixedDepositAccountsAccountIdRequest.md)|  | |

### Return type

[**PutFixedDepositAccountsAccountIdResponse**](PutFixedDepositAccountsAccountIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


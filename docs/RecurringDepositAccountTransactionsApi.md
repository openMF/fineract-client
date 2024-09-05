# RecurringDepositAccountTransactionsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**handleTransactionCommands**](RecurringDepositAccountTransactionsApi.md#handleTransactionCommands) | **POST** v1/recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId} | Adjust Transaction | Undo transaction |
| [**retrieveOne21**](RecurringDepositAccountTransactionsApi.md#retrieveOne21) | **GET** v1/recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId} | Retrieve Recurring Deposit Account Transaction |
| [**retrieveTemplate16**](RecurringDepositAccountTransactionsApi.md#retrieveTemplate16) | **GET** v1/recurringdepositaccounts/{recurringDepositAccountId}/transactions/template | Retrieve Recurring Deposit Account Transaction Template |
| [**transaction1**](RecurringDepositAccountTransactionsApi.md#transaction1) | **POST** v1/recurringdepositaccounts/{recurringDepositAccountId}/transactions | Deposit Transaction | Withdrawal Transaction |



Adjust Transaction | Undo transaction

Adjust Transaction:  This command modifies the given transaction.  Undo transaction:  This command reverses the given transaction.  Showing request/response for &#39;Adjust Transaction&#39;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RecurringDepositAccountTransactionsApi::class.java)
val recurringDepositAccountId : kotlin.Long = 789 // kotlin.Long | recurringDepositAccountId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId
val postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest : PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest =  // PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse = webService.handleTransactionCommands(recurringDepositAccountId, transactionId, postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest, command)
}
```

### Parameters
| **recurringDepositAccountId** | **kotlin.Long**| recurringDepositAccountId | |
| **transactionId** | **kotlin.Long**| transactionId | |
| **postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest** | [**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve Recurring Deposit Account Transaction

Retrieves Recurring Deposit Account Transaction  Example Requests:  recurringdepositaccounts/1/transactions/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RecurringDepositAccountTransactionsApi::class.java)
val recurringDepositAccountId : kotlin.Long = 789 // kotlin.Long | recurringDepositAccountId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId

launch(Dispatchers.IO) {
    val result : GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse = webService.retrieveOne21(recurringDepositAccountId, transactionId)
}
```

### Parameters
| **recurringDepositAccountId** | **kotlin.Long**| recurringDepositAccountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionId** | **kotlin.Long**| transactionId | |

### Return type

[**GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse**](GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Recurring Deposit Account Transaction Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  recurringdepositaccounts/1/transactions/template?command&#x3D;deposit  recurringdepositaccounts/1/transactions/template?command&#x3D;withdrawal

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RecurringDepositAccountTransactionsApi::class.java)
val recurringDepositAccountId : kotlin.Long = 789 // kotlin.Long | recurringDepositAccountId
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse = webService.retrieveTemplate16(recurringDepositAccountId, command)
}
```

### Parameters
| **recurringDepositAccountId** | **kotlin.Long**| recurringDepositAccountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse**](GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Deposit Transaction | Withdrawal Transaction

Deposit Transaction:  Used for a deposit transaction  Withdrawal Transaction:  Used for a Withdrawal Transaction  Showing request/response for Deposit Transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RecurringDepositAccountTransactionsApi::class.java)
val recurringDepositAccountId : kotlin.Long = 789 // kotlin.Long | recurringDepositAccountId
val postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest : PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest =  // PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse = webService.transaction1(recurringDepositAccountId, postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest, command)
}
```

### Parameters
| **recurringDepositAccountId** | **kotlin.Long**| recurringDepositAccountId | |
| **postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest** | [**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


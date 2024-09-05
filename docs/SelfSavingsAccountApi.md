# SelfSavingsAccountApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**modifySavingsAccountApplication**](SelfSavingsAccountApi.md#modifySavingsAccountApplication) | **PUT** v1/self/savingsaccounts/{accountId} |  |
| [**retrieveAllSavingsAccountCharges1**](SelfSavingsAccountApi.md#retrieveAllSavingsAccountCharges1) | **GET** v1/self/savingsaccounts/{accountId}/charges | List Savings Charges |
| [**retrieveSavings**](SelfSavingsAccountApi.md#retrieveSavings) | **GET** v1/self/savingsaccounts/{accountId} | Retrieve a savings account |
| [**retrieveSavingsAccountCharge1**](SelfSavingsAccountApi.md#retrieveSavingsAccountCharge1) | **GET** v1/self/savingsaccounts/{accountId}/charges/{savingsAccountChargeId} | Retrieve a Savings account Charge |
| [**retrieveSavingsTransaction**](SelfSavingsAccountApi.md#retrieveSavingsTransaction) | **GET** v1/self/savingsaccounts/{accountId}/transactions/{transactionId} | Retrieve Savings Account Transaction |
| [**submitSavingsAccountApplication**](SelfSavingsAccountApi.md#submitSavingsAccountApplication) | **POST** v1/self/savingsaccounts |  |
| [**template18**](SelfSavingsAccountApi.md#template18) | **GET** v1/self/savingsaccounts/template |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfSavingsAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | 
val command : kotlin.String = command_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.modifySavingsAccountApplication(accountId, command, body)
}
```

### Parameters
| **accountId** | **kotlin.Long**|  | |
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


List Savings Charges

Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfSavingsAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | accountId
val chargeStatus : kotlin.String = chargeStatus_example // kotlin.String | chargeStatus

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetSelfSavingsAccountsAccountIdChargesResponse> = webService.retrieveAllSavingsAccountCharges1(accountId, chargeStatus)
}
```

### Parameters
| **accountId** | **kotlin.Long**| accountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chargeStatus** | **kotlin.String**| chargeStatus | [optional] [default to &quot;all&quot;] |

### Return type

[**kotlin.collections.List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;**](GetSelfSavingsAccountsAccountIdChargesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a savings account

Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfSavingsAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | accountId
val chargeStatus : kotlin.String = chargeStatus_example // kotlin.String | chargeStatus

launch(Dispatchers.IO) {
    val result : GetSelfSavingsAccountsResponse = webService.retrieveSavings(accountId, chargeStatus)
}
```

### Parameters
| **accountId** | **kotlin.Long**| accountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chargeStatus** | **kotlin.String**| chargeStatus | [optional] [default to &quot;all&quot;] |

### Return type

[**GetSelfSavingsAccountsResponse**](GetSelfSavingsAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Savings account Charge

Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfSavingsAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | accountId
val savingsAccountChargeId : kotlin.Long = 789 // kotlin.Long | savingsAccountChargeId

launch(Dispatchers.IO) {
    val result : GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse = webService.retrieveSavingsAccountCharge1(accountId, savingsAccountChargeId)
}
```

### Parameters
| **accountId** | **kotlin.Long**| accountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **savingsAccountChargeId** | **kotlin.Long**| savingsAccountChargeId | |

### Return type

[**GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse**](GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Savings Account Transaction

Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfSavingsAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | accountId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId

launch(Dispatchers.IO) {
    val result : GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse = webService.retrieveSavingsTransaction(accountId, transactionId)
}
```

### Parameters
| **accountId** | **kotlin.Long**| accountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionId** | **kotlin.Long**| transactionId | |

### Return type

[**GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse**](GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse.md)

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
val webService = apiClient.createWebservice(SelfSavingsAccountApi::class.java)
val command : kotlin.String = command_example // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.submitSavingsAccountApplication(command, body)
}
```

### Parameters
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
val webService = apiClient.createWebservice(SelfSavingsAccountApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | 
val productId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.template18(clientId, productId)
}
```

### Parameters
| **clientId** | **kotlin.Long**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productId** | **kotlin.Long**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


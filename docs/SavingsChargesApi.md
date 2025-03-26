# SavingsChargesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addSavingsAccountCharge**](SavingsChargesApi.md#addSavingsAccountCharge) | **POST** v1/savingsaccounts/{savingsAccountId}/charges | Create a Savings account Charge |
| [**deleteSavingsAccountCharge**](SavingsChargesApi.md#deleteSavingsAccountCharge) | **DELETE** v1/savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Delete a Savings account Charge |
| [**payOrWaiveSavingsAccountCharge**](SavingsChargesApi.md#payOrWaiveSavingsAccountCharge) | **POST** v1/savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Pay a Savings account Charge | Waive off a Savings account Charge | Inactivate a Savings account Charge |
| [**retrieveAllSavingsAccountCharges**](SavingsChargesApi.md#retrieveAllSavingsAccountCharges) | **GET** v1/savingsaccounts/{savingsAccountId}/charges | List Savings Charges |
| [**retrieveSavingsAccountCharge**](SavingsChargesApi.md#retrieveSavingsAccountCharge) | **GET** v1/savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Retrieve a Savings account Charge |
| [**retrieveTemplate18**](SavingsChargesApi.md#retrieveTemplate18) | **GET** v1/savingsaccounts/{savingsAccountId}/charges/template | Retrieve Savings Charges Template |
| [**updateSavingsAccountCharge**](SavingsChargesApi.md#updateSavingsAccountCharge) | **PUT** v1/savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Update a Savings account Charge |



Create a Savings account Charge

Creates a Savings account Charge  Mandatory Fields for Savings account Charges: chargeId, amount  chargeId, amount, dueDate, dateFormat, locale  chargeId, amount, feeOnMonthDay, monthDayFormat, locale

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsChargesApi::class.java)
val savingsAccountId : kotlin.Long = 789 // kotlin.Long | savingsAccountId
val postSavingsAccountsSavingsAccountIdChargesRequest : PostSavingsAccountsSavingsAccountIdChargesRequest =  // PostSavingsAccountsSavingsAccountIdChargesRequest | 

launch(Dispatchers.IO) {
    val result : PostSavingsAccountsSavingsAccountIdChargesResponse = webService.addSavingsAccountCharge(savingsAccountId, postSavingsAccountsSavingsAccountIdChargesRequest)
}
```

### Parameters
| **savingsAccountId** | **kotlin.Long**| savingsAccountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postSavingsAccountsSavingsAccountIdChargesRequest** | [**PostSavingsAccountsSavingsAccountIdChargesRequest**](PostSavingsAccountsSavingsAccountIdChargesRequest.md)|  | |

### Return type

[**PostSavingsAccountsSavingsAccountIdChargesResponse**](PostSavingsAccountsSavingsAccountIdChargesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Savings account Charge

Note: Currently, A Savings account Charge may only be removed from Savings that are not yet approved.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsChargesApi::class.java)
val savingsAccountId : kotlin.Long = 789 // kotlin.Long | savingsAccountId
val savingsAccountChargeId : kotlin.Long = 789 // kotlin.Long | savingsAccountChargeId

launch(Dispatchers.IO) {
    val result : DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse = webService.deleteSavingsAccountCharge(savingsAccountId, savingsAccountChargeId)
}
```

### Parameters
| **savingsAccountId** | **kotlin.Long**| savingsAccountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **savingsAccountChargeId** | **kotlin.Long**| savingsAccountChargeId | |

### Return type

[**DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Pay a Savings account Charge | Waive off a Savings account Charge | Inactivate a Savings account Charge

Pay a Savings account Charge:  An active charge will be paid when savings account is active and having sufficient balance.  Waive off a Savings account Charge:  Outstanding charge amount will be waived off.  Inactivate a Savings account Charge:  A charge will be allowed to inactivate when savings account is active and not having any dues as of today. If charge is overpaid, corresponding charge payment transactions will be reversed.  Showing request/response for &#39;Pay a Savings account Charge&#39;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsChargesApi::class.java)
val savingsAccountId : kotlin.Long = 789 // kotlin.Long | savingsAccountId
val savingsAccountChargeId : kotlin.Long = 789 // kotlin.Long | savingsAccountChargeId
val postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest : PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest =  // PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse = webService.payOrWaiveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId, postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest, command)
}
```

### Parameters
| **savingsAccountId** | **kotlin.Long**| savingsAccountId | |
| **savingsAccountChargeId** | **kotlin.Long**| savingsAccountChargeId | |
| **postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest** | [**PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest**](PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List Savings Charges

Lists Savings Charges  Example Requests:  savingsaccounts/1/charges  savingsaccounts/1/charges?chargeStatus&#x3D;all  savingsaccounts/1/charges?chargeStatus&#x3D;inactive  savingsaccounts/1/charges?chargeStatus&#x3D;active  savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsChargesApi::class.java)
val savingsAccountId : kotlin.Long = 789 // kotlin.Long | savingsAccountId
val chargeStatus : kotlin.String = chargeStatus_example // kotlin.String | chargeStatus

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetSavingsAccountsSavingsAccountIdChargesResponse> = webService.retrieveAllSavingsAccountCharges(savingsAccountId, chargeStatus)
}
```

### Parameters
| **savingsAccountId** | **kotlin.Long**| savingsAccountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chargeStatus** | **kotlin.String**| chargeStatus | [optional] [default to &quot;all&quot;] |

### Return type

[**kotlin.collections.List&lt;GetSavingsAccountsSavingsAccountIdChargesResponse&gt;**](GetSavingsAccountsSavingsAccountIdChargesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Savings account Charge

Retrieves a Savings account Charge  Example Requests:  /savingsaccounts/1/charges/5   /savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsChargesApi::class.java)
val savingsAccountId : kotlin.Long = 789 // kotlin.Long | savingsAccountId
val savingsAccountChargeId : kotlin.Long = 789 // kotlin.Long | savingsAccountChargeId

launch(Dispatchers.IO) {
    val result : GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse = webService.retrieveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId)
}
```

### Parameters
| **savingsAccountId** | **kotlin.Long**| savingsAccountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **savingsAccountChargeId** | **kotlin.Long**| savingsAccountChargeId | |

### Return type

[**GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Savings Charges Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  savingsaccounts/1/charges/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsChargesApi::class.java)
val savingsAccountId : kotlin.Long = 789 // kotlin.Long | savingsAccountId

launch(Dispatchers.IO) {
    val result : GetSavingsAccountsSavingsAccountIdChargesTemplateResponse = webService.retrieveTemplate18(savingsAccountId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **savingsAccountId** | **kotlin.Long**| savingsAccountId | |

### Return type

[**GetSavingsAccountsSavingsAccountIdChargesTemplateResponse**](GetSavingsAccountsSavingsAccountIdChargesTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Savings account Charge

Currently Savings account Charges may be updated only if the Savings account is not yet approved.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsChargesApi::class.java)
val savingsAccountId : kotlin.Long = 789 // kotlin.Long | savingsAccountId
val savingsAccountChargeId : kotlin.Long = 789 // kotlin.Long | savingsAccountChargeId
val putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest : PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest =  // PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest | 

launch(Dispatchers.IO) {
    val result : PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse = webService.updateSavingsAccountCharge(savingsAccountId, savingsAccountChargeId, putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest)
}
```

### Parameters
| **savingsAccountId** | **kotlin.Long**| savingsAccountId | |
| **savingsAccountChargeId** | **kotlin.Long**| savingsAccountChargeId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest** | [**PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest**](PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest.md)|  | |

### Return type

[**PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


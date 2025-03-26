# AccountingRulesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAccountingRule**](AccountingRulesApi.md#createAccountingRule) | **POST** v1/accountingrules | Create/Define a Accounting rule |
| [**deleteAccountingRule**](AccountingRulesApi.md#deleteAccountingRule) | **DELETE** v1/accountingrules/{accountingRuleId} | Delete a Accounting Rule |
| [**retreiveAccountingRule**](AccountingRulesApi.md#retreiveAccountingRule) | **GET** v1/accountingrules/{accountingRuleId} | Retrieve a Accounting rule |
| [**retrieveAllAccountingRules**](AccountingRulesApi.md#retrieveAllAccountingRules) | **GET** v1/accountingrules | Retrieve Accounting Rules |
| [**retrieveTemplate1**](AccountingRulesApi.md#retrieveTemplate1) | **GET** v1/accountingrules/template | Retrieve Accounting Rule Details Template |
| [**updateAccountingRule**](AccountingRulesApi.md#updateAccountingRule) | **PUT** v1/accountingrules/{accountingRuleId} | Update a Accounting Rule |



Create/Define a Accounting rule

Define a new Accounting rule.  Mandatory Fields name, officeId, accountToDebit OR debitTags, accountToCredit OR creditTags.  Optional Fields description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountingRulesApi::class.java)
val postAccountingRulesRequest : PostAccountingRulesRequest =  // PostAccountingRulesRequest | 

launch(Dispatchers.IO) {
    val result : PostAccountingRulesResponse = webService.createAccountingRule(postAccountingRulesRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postAccountingRulesRequest** | [**PostAccountingRulesRequest**](PostAccountingRulesRequest.md)|  | [optional] |

### Return type

[**PostAccountingRulesResponse**](PostAccountingRulesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Accounting Rule

Deletes a Accounting rule.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountingRulesApi::class.java)
val accountingRuleId : kotlin.Long = 789 // kotlin.Long | accountingRuleId

launch(Dispatchers.IO) {
    val result : DeleteAccountingRulesResponse = webService.deleteAccountingRule(accountingRuleId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountingRuleId** | **kotlin.Long**| accountingRuleId | |

### Return type

[**DeleteAccountingRulesResponse**](DeleteAccountingRulesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Accounting rule

Returns the details of a defined Accounting rule.  Example Requests:  accountingrules/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountingRulesApi::class.java)
val accountingRuleId : kotlin.Long = 789 // kotlin.Long | accountingRuleId

launch(Dispatchers.IO) {
    val result : AccountingRuleData = webService.retreiveAccountingRule(accountingRuleId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountingRuleId** | **kotlin.Long**| accountingRuleId | |

### Return type

[**AccountingRuleData**](AccountingRuleData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Accounting Rules

Returns the list of defined accounting rules.  Example Requests:  accountingrules

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountingRulesApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetAccountRulesResponse> = webService.retrieveAllAccountingRules()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetAccountRulesResponse&gt;**](GetAccountRulesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Accounting Rule Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  accountingrules/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountingRulesApi::class.java)

launch(Dispatchers.IO) {
    val result : GetAccountRulesTemplateResponse = webService.retrieveTemplate1()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAccountRulesTemplateResponse**](GetAccountRulesTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Accounting Rule

Updates the details of a Accounting rule.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountingRulesApi::class.java)
val accountingRuleId : kotlin.Long = 789 // kotlin.Long | accountingRuleId
val putAccountingRulesRequest : PutAccountingRulesRequest =  // PutAccountingRulesRequest | 

launch(Dispatchers.IO) {
    val result : PutAccountingRulesResponse = webService.updateAccountingRule(accountingRuleId, putAccountingRulesRequest)
}
```

### Parameters
| **accountingRuleId** | **kotlin.Long**| accountingRuleId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putAccountingRulesRequest** | [**PutAccountingRulesRequest**](PutAccountingRulesRequest.md)|  | [optional] |

### Return type

[**PutAccountingRulesResponse**](PutAccountingRulesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


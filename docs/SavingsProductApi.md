# SavingsProductApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**create13**](SavingsProductApi.md#create13) | **POST** v1/savingsproducts | Create a Savings Product |
| [**delete21**](SavingsProductApi.md#delete21) | **DELETE** v1/savingsproducts/{productId} | Delete a Savings Product |
| [**retrieveAll34**](SavingsProductApi.md#retrieveAll34) | **GET** v1/savingsproducts | List Savings Products |
| [**retrieveOne27**](SavingsProductApi.md#retrieveOne27) | **GET** v1/savingsproducts/{productId} | Retrieve a Savings Product |
| [**retrieveTemplate20**](SavingsProductApi.md#retrieveTemplate20) | **GET** v1/savingsproducts/template | Retrieve Savings Product Template |
| [**update22**](SavingsProductApi.md#update22) | **PUT** v1/savingsproducts/{productId} | Update a Savings Product |



Create a Savings Product

Creates a Savings Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, allowOverdraft, overdraftLimit, minBalanceForInterestCalculation,withHoldTax,taxGroupId,accountMapping, lienAllowed, maxAllowedLienLimit

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsProductApi::class.java)
val postSavingsProductsRequest : PostSavingsProductsRequest =  // PostSavingsProductsRequest | 

launch(Dispatchers.IO) {
    val result : PostSavingsProductsResponse = webService.create13(postSavingsProductsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postSavingsProductsRequest** | [**PostSavingsProductsRequest**](PostSavingsProductsRequest.md)|  | |

### Return type

[**PostSavingsProductsResponse**](PostSavingsProductsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Savings Product

Deletes a Savings Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsProductApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | productId

launch(Dispatchers.IO) {
    val result : DeleteSavingsProductsProductIdResponse = webService.delete21(productId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productId** | **kotlin.Long**| productId | |

### Return type

[**DeleteSavingsProductsProductIdResponse**](DeleteSavingsProductsProductIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Savings Products

Lists Savings Products  Example Requests:  savingsproducts  savingsproducts?fields&#x3D;name

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsProductApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetSavingsProductsResponse> = webService.retrieveAll34()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetSavingsProductsResponse&gt;**](GetSavingsProductsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Savings Product

Retrieves a Savings Product  Example Requests:  savingsproducts/1  savingsproducts/1?template&#x3D;true  savingsproducts/1?fields&#x3D;name,description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsProductApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | productId

launch(Dispatchers.IO) {
    val result : GetSavingsProductsProductIdResponse = webService.retrieveOne27(productId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productId** | **kotlin.Long**| productId | |

### Return type

[**GetSavingsProductsProductIdResponse**](GetSavingsProductsProductIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Savings Product Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request: Account Mapping:  savingsproducts/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsProductApi::class.java)

launch(Dispatchers.IO) {
    val result : GetSavingsProductsTemplateResponse = webService.retrieveTemplate20()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSavingsProductsTemplateResponse**](GetSavingsProductsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Savings Product

Updates a Savings Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SavingsProductApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | productId
val putSavingsProductsProductIdRequest : PutSavingsProductsProductIdRequest =  // PutSavingsProductsProductIdRequest | 

launch(Dispatchers.IO) {
    val result : PutSavingsProductsProductIdResponse = webService.update22(productId, putSavingsProductsProductIdRequest)
}
```

### Parameters
| **productId** | **kotlin.Long**| productId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putSavingsProductsProductIdRequest** | [**PutSavingsProductsProductIdRequest**](PutSavingsProductsProductIdRequest.md)|  | |

### Return type

[**PutSavingsProductsProductIdResponse**](PutSavingsProductsProductIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


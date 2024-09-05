# RecurringDepositProductApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**create12**](RecurringDepositProductApi.md#create12) | **POST** v1/recurringdepositproducts | Create a Recurring Deposit Product |
| [**delete18**](RecurringDepositProductApi.md#delete18) | **DELETE** v1/recurringdepositproducts/{productId} | Delete a Recurring Deposit Product |
| [**retrieveAll32**](RecurringDepositProductApi.md#retrieveAll32) | **GET** v1/recurringdepositproducts | List Recuring Deposit Products |
| [**retrieveOne23**](RecurringDepositProductApi.md#retrieveOne23) | **GET** v1/recurringdepositproducts/{productId} | Retrieve a Recurring Deposit Product |
| [**retrieveTemplate17**](RecurringDepositProductApi.md#retrieveTemplate17) | **GET** v1/recurringdepositproducts/template |  |
| [**update19**](RecurringDepositProductApi.md#update19) | **PUT** v1/recurringdepositproducts/{productId} | Update a Recurring Deposit Product |



Create a Recurring Deposit Product

Creates a Recurring Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, recurringDepositFrequency, recurringDepositFrequencyTypeId, accountingRule, depositAmount  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, minDepositAmount, maxDepositAmount, withHoldTax, taxGroupId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RecurringDepositProductApi::class.java)
val postRecurringDepositProductsRequest : PostRecurringDepositProductsRequest =  // PostRecurringDepositProductsRequest | 

launch(Dispatchers.IO) {
    val result : PostRecurringDepositProductsResponse = webService.create12(postRecurringDepositProductsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postRecurringDepositProductsRequest** | [**PostRecurringDepositProductsRequest**](PostRecurringDepositProductsRequest.md)|  | |

### Return type

[**PostRecurringDepositProductsResponse**](PostRecurringDepositProductsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Recurring Deposit Product

Deletes a Recurring Deposit Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RecurringDepositProductApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | productId

launch(Dispatchers.IO) {
    val result : DeleteRecurringDepositProductsProductIdResponse = webService.delete18(productId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productId** | **kotlin.Long**| productId | |

### Return type

[**DeleteRecurringDepositProductsProductIdResponse**](DeleteRecurringDepositProductsProductIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Recuring Deposit Products

Lists Recuring Deposit Products  Example Requests:  recurringdepositproducts   recurringdepositproducts?fields&#x3D;name

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RecurringDepositProductApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetRecurringDepositProductsResponse> = webService.retrieveAll32()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetRecurringDepositProductsResponse&gt;**](GetRecurringDepositProductsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Recurring Deposit Product

Retrieves a Recurring Deposit Product  Example Requests:  recurringdepositproducts/1   recurringdepositproducts/1?template&#x3D;true   recurringdepositproducts/1?fields&#x3D;name,description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RecurringDepositProductApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | productId

launch(Dispatchers.IO) {
    val result : GetRecurringDepositProductsProductIdResponse = webService.retrieveOne23(productId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productId** | **kotlin.Long**| productId | |

### Return type

[**GetRecurringDepositProductsProductIdResponse**](GetRecurringDepositProductsProductIdResponse.md)

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
val webService = apiClient.createWebservice(RecurringDepositProductApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveTemplate17()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Recurring Deposit Product

Updates a Recurring Deposit Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RecurringDepositProductApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | productId
val putRecurringDepositProductsRequest : PutRecurringDepositProductsRequest =  // PutRecurringDepositProductsRequest | 

launch(Dispatchers.IO) {
    val result : PutRecurringDepositProductsResponse = webService.update19(productId, putRecurringDepositProductsRequest)
}
```

### Parameters
| **productId** | **kotlin.Long**| productId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putRecurringDepositProductsRequest** | [**PutRecurringDepositProductsRequest**](PutRecurringDepositProductsRequest.md)|  | |

### Return type

[**PutRecurringDepositProductsResponse**](PutRecurringDepositProductsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


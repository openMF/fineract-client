# FixedDepositProductApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**create11**](FixedDepositProductApi.md#create11) | **POST** v1/fixeddepositproducts | Create a Fixed Deposit Product |
| [**delete16**](FixedDepositProductApi.md#delete16) | **DELETE** v1/fixeddepositproducts/{productId} | Delete a Fixed Deposit Product |
| [**retrieveAll30**](FixedDepositProductApi.md#retrieveAll30) | **GET** v1/fixeddepositproducts | List Fixed Deposit Products |
| [**retrieveOne20**](FixedDepositProductApi.md#retrieveOne20) | **GET** v1/fixeddepositproducts/{productId} | Retrieve a Fixed Deposit Product |
| [**retrieveTemplate15**](FixedDepositProductApi.md#retrieveTemplate15) | **GET** v1/fixeddepositproducts/template |  |
| [**update17**](FixedDepositProductApi.md#update17) | **PUT** v1/fixeddepositproducts/{productId} | Update a Fixed Deposit Product |



Create a Fixed Deposit Product

Creates a Fixed Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, accountingRule  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, , withHoldTax, taxGroupId   Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FixedDepositProductApi::class.java)
val postFixedDepositProductsRequest : PostFixedDepositProductsRequest =  // PostFixedDepositProductsRequest | 

launch(Dispatchers.IO) {
    val result : PostFixedDepositProductsResponse = webService.create11(postFixedDepositProductsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postFixedDepositProductsRequest** | [**PostFixedDepositProductsRequest**](PostFixedDepositProductsRequest.md)|  | |

### Return type

[**PostFixedDepositProductsResponse**](PostFixedDepositProductsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Fixed Deposit Product

Deletes a Fixed Deposit Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FixedDepositProductApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | productId

launch(Dispatchers.IO) {
    val result : DeleteFixedDepositProductsProductIdResponse = webService.delete16(productId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productId** | **kotlin.Long**| productId | |

### Return type

[**DeleteFixedDepositProductsProductIdResponse**](DeleteFixedDepositProductsProductIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Fixed Deposit Products

Lists Fixed Deposit Products  Example Requests:  fixeddepositproducts   fixeddepositproducts?fields&#x3D;name

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FixedDepositProductApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetFixedDepositProductsResponse> = webService.retrieveAll30()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetFixedDepositProductsResponse&gt;**](GetFixedDepositProductsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Fixed Deposit Product

Retrieves a Fixed Deposit Product  Example Requests:  fixeddepositproducts/1   fixeddepositproducts/1?template&#x3D;true   fixeddepositproducts/1?fields&#x3D;name,description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FixedDepositProductApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | productId

launch(Dispatchers.IO) {
    val result : GetFixedDepositProductsProductIdResponse = webService.retrieveOne20(productId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productId** | **kotlin.Long**| productId | |

### Return type

[**GetFixedDepositProductsProductIdResponse**](GetFixedDepositProductsProductIdResponse.md)

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
val webService = apiClient.createWebservice(FixedDepositProductApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveTemplate15()
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


Update a Fixed Deposit Product

Updates a Fixed Deposit Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(FixedDepositProductApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | productId
val putFixedDepositProductsProductIdRequest : PutFixedDepositProductsProductIdRequest =  // PutFixedDepositProductsProductIdRequest | 

launch(Dispatchers.IO) {
    val result : PutFixedDepositProductsProductIdResponse = webService.update17(productId, putFixedDepositProductsProductIdRequest)
}
```

### Parameters
| **productId** | **kotlin.Long**| productId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putFixedDepositProductsProductIdRequest** | [**PutFixedDepositProductsProductIdRequest**](PutFixedDepositProductsProductIdRequest.md)|  | |

### Return type

[**PutFixedDepositProductsProductIdResponse**](PutFixedDepositProductsProductIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


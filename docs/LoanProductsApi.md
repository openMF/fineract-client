# LoanProductsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createLoanProduct**](LoanProductsApi.md#createLoanProduct) | **POST** v1/loanproducts | Create a Loan Product |
| [**retrieveAllLoanProducts**](LoanProductsApi.md#retrieveAllLoanProducts) | **GET** v1/loanproducts | List Loan Products |
| [**retrieveLoanProductDetails**](LoanProductsApi.md#retrieveLoanProductDetails) | **GET** v1/loanproducts/{productId} | Retrieve a Loan Product |
| [**retrieveLoanProductDetails1**](LoanProductsApi.md#retrieveLoanProductDetails1) | **GET** v1/loanproducts/external-id/{externalProductId} | Retrieve a Loan Product |
| [**retrieveTemplate11**](LoanProductsApi.md#retrieveTemplate11) | **GET** v1/loanproducts/template | Retrieve Loan Product Details Template |
| [**updateLoanProduct**](LoanProductsApi.md#updateLoanProduct) | **PUT** v1/loanproducts/{productId} | Update a Loan Product |
| [**updateLoanProduct1**](LoanProductsApi.md#updateLoanProduct1) | **PUT** v1/loanproducts/external-id/{externalProductId} | Update a Loan Product |



Create a Loan Product

Depending of the Accounting Rule (accountingRule) selected, additional fields with details of the appropriate Ledger Account identifiers would need to be passed in.  Refer MifosX Accounting Specs Draft for more details regarding the significance of the selected accounting rule  Mandatory Fields: name, shortName, currencyCode, digitsAfterDecimal, inMultiplesOf, principal, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, interestRateFrequencyType, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyCode, accountingRule, isInterestRecalculationEnabled, daysInYearType, daysInMonthType  Optional Fields: inArrearsTolerance, graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, graceOnArrearsAgeing, charges, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, includeInBorrowerCycle, useBorrowerCycle,principalVariationsForBorrowerCycle, numberOfRepaymentVariationsForBorrowerCycle, interestRateVariationsForBorrowerCycle, multiDisburseLoan,maxTrancheCount, outstandingLoanBalance,overdueDaysForNPA,holdGuaranteeFunds, principalThresholdForLastInstalment, accountMovesOutOfNPAOnlyOnArrearsCompletion, canDefineInstallmentAmount, installmentAmountInMultiplesOf, allowAttributeOverrides, allowPartialPeriodInterestCalcualtion,dueDaysForRepaymentEvent,overDueDaysForRepaymentEvent,enableDownPayment,disbursedAmountPercentageDownPayment,enableAutoRepaymentForDownPayment,repaymentStartDateType,disableScheduleExtensionForDownPayment  Additional Mandatory Fields for Cash(2) based accounting: fundSourceAccountId, loanPortfolioAccountId, interestOnLoanAccountId, incomeFromFeeAccountId, incomeFromPenaltyAccountId, writeOffAccountId, transfersInSuspenseAccountId, overpaymentLiabilityAccountId  Additional Mandatory Fields for periodic (3) and upfront (4)accrual accounting: fundSourceAccountId, loanPortfolioAccountId, interestOnLoanAccountId, incomeFromFeeAccountId, incomeFromPenaltyAccountId, writeOffAccountId, receivableInterestAccountId, receivableFeeAccountId, receivablePenaltyAccountId, transfersInSuspenseAccountId, overpaymentLiabilityAccountId  Additional Mandatory Fields if interest recalculation is enabled(true): interestRecalculationCompoundingMethod, rescheduleStrategyMethod, recalculationRestFrequencyType  Additional Optional Fields if interest recalculation is enabled(true): isArrearsBasedOnOriginalSchedule, preClosureInterestCalculationStrategy  Additional Optional Fields if interest recalculation is enabled(true) and recalculationRestFrequencyType is not same as repayment period: recalculationRestFrequencyInterval, recalculationRestFrequencyDate  Additional Optional Fields if interest recalculation is enabled(true) and interestRecalculationCompoundingMethod is enabled: recalculationCompoundingFrequencyType  Additional Optional Fields if interest recalculation is enabled(true) and interestRecalculationCompoundingMethod is enabled and recalculationCompoundingFrequencyType is not same as repayment period: recalculationCompoundingFrequencyInterval, recalculationCompoundingFrequencyDate  Additional Mandatory Fields if Hold Guarantee funds is enabled(true): mandatoryGuarantee  Additional Optional Fields if Hold Guarantee funds is enabled(true): minimumGuaranteeFromOwnFunds,minimumGuaranteeFromGuarantor

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanProductsApi::class.java)
val postLoanProductsRequest : PostLoanProductsRequest =  // PostLoanProductsRequest | 

launch(Dispatchers.IO) {
    val result : PostLoanProductsResponse = webService.createLoanProduct(postLoanProductsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postLoanProductsRequest** | [**PostLoanProductsRequest**](PostLoanProductsRequest.md)|  | |

### Return type

[**PostLoanProductsResponse**](PostLoanProductsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List Loan Products

Lists Loan Products  Example Requests:  loanproducts   loanproducts?fields&#x3D;name,description,interestRateFrequencyType,amortizationType

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanProductsApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetLoanProductsResponse> = webService.retrieveAllLoanProducts()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetLoanProductsResponse&gt;**](GetLoanProductsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Loan Product

Retrieves a Loan Product  Example Requests:  loanproducts/1   loanproducts/1?template&#x3D;true   loanproducts/1?fields&#x3D;name,description,numberOfRepayments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanProductsApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | productId

launch(Dispatchers.IO) {
    val result : GetLoanProductsProductIdResponse = webService.retrieveLoanProductDetails(productId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productId** | **kotlin.Long**| productId | |

### Return type

[**GetLoanProductsProductIdResponse**](GetLoanProductsProductIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Loan Product

Retrieves a Loan Product  Example Requests:  loanproducts/external-id/2075e308-d4a8-44d9-8203-f5a947b8c2f4   loanproducts/external-id/2075e308-d4a8-44d9-8203-f5a947b8c2f4?template&#x3D;true   loanproducts/external-id/2075e308-d4a8-44d9-8203-f5a947b8c2f4?fields&#x3D;name,description,numberOfRepayments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanProductsApi::class.java)
val externalProductId : kotlin.String = externalProductId_example // kotlin.String | externalProductId

launch(Dispatchers.IO) {
    val result : GetLoanProductsProductIdResponse = webService.retrieveLoanProductDetails1(externalProductId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalProductId** | **kotlin.String**| externalProductId | |

### Return type

[**GetLoanProductsProductIdResponse**](GetLoanProductsProductIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Loan Product Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  loanproducts/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanProductsApi::class.java)
val isProductMixTemplate : kotlin.Boolean = true // kotlin.Boolean | isProductMixTemplate

launch(Dispatchers.IO) {
    val result : GetLoanProductsTemplateResponse = webService.retrieveTemplate11(isProductMixTemplate)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isProductMixTemplate** | **kotlin.Boolean**| isProductMixTemplate | [optional] |

### Return type

[**GetLoanProductsTemplateResponse**](GetLoanProductsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Loan Product

Updates a Loan Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanProductsApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | productId
val putLoanProductsProductIdRequest : PutLoanProductsProductIdRequest =  // PutLoanProductsProductIdRequest | 

launch(Dispatchers.IO) {
    val result : PutLoanProductsProductIdResponse = webService.updateLoanProduct(productId, putLoanProductsProductIdRequest)
}
```

### Parameters
| **productId** | **kotlin.Long**| productId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putLoanProductsProductIdRequest** | [**PutLoanProductsProductIdRequest**](PutLoanProductsProductIdRequest.md)|  | |

### Return type

[**PutLoanProductsProductIdResponse**](PutLoanProductsProductIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update a Loan Product

Updates a Loan Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanProductsApi::class.java)
val externalProductId : kotlin.String = externalProductId_example // kotlin.String | externalProductId
val putLoanProductsProductIdRequest : PutLoanProductsProductIdRequest =  // PutLoanProductsProductIdRequest | 

launch(Dispatchers.IO) {
    val result : PutLoanProductsProductIdResponse = webService.updateLoanProduct1(externalProductId, putLoanProductsProductIdRequest)
}
```

### Parameters
| **externalProductId** | **kotlin.String**| externalProductId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putLoanProductsProductIdRequest** | [**PutLoanProductsProductIdRequest**](PutLoanProductsProductIdRequest.md)|  | |

### Return type

[**PutLoanProductsProductIdResponse**](PutLoanProductsProductIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


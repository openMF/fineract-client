# LoanProductsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLoanProduct**](LoanProductsApi.md#createLoanProduct) | **POST** loanproducts | Create a Loan Product
[**retrieveAllLoanProducts**](LoanProductsApi.md#retrieveAllLoanProducts) | **GET** loanproducts | List Loan Products
[**retrieveLoanProductDetails**](LoanProductsApi.md#retrieveLoanProductDetails) | **GET** loanproducts/{productId} | Retrieve a Loan Product
[**retrieveTemplate**](LoanProductsApi.md#retrieveTemplate) | **GET** loanproducts/template | Retrieve Loan Product Details Template
[**updateLoanProduct**](LoanProductsApi.md#updateLoanProduct) | **PUT** loanproducts/{productId} | Update a Loan Product


<a name="createLoanProduct"></a>
# **createLoanProduct**
> PostLoanProductsResponse createLoanProduct(body)

Create a Loan Product

Depending of the Accounting Rule (accountingRule) selected, additional fields with details of the appropriate Ledger Account identifiers would need to be passed in.  Refer MifosX Accounting Specs Draft for more details regarding the significance of the selected accounting rule  Mandatory Fields: name, shortName, currencyCode, digitsAfterDecimal, inMultiplesOf, principal, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, interestRateFrequencyType, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, accountingRule, isInterestRecalculationEnabled, daysInYearType, daysInMonthType  Optional Fields: inArrearsTolerance, graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, graceOnArrearsAgeing, charges, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, includeInBorrowerCycle, useBorrowerCycle,principalVariationsForBorrowerCycle, numberOfRepaymentVariationsForBorrowerCycle, interestRateVariationsForBorrowerCycle, multiDisburseLoan,maxTrancheCount, outstandingLoanBalance,overdueDaysForNPA,holdGuaranteeFunds, principalThresholdForLastInstalment, accountMovesOutOfNPAOnlyOnArrearsCompletion, canDefineInstallmentAmount, installmentAmountInMultiplesOf, allowAttributeOverrides, allowPartialPeriodInterestCalcualtion  Additional Mandatory Fields for Cash(2) based accounting: fundSourceAccountId, loanPortfolioAccountId, interestOnLoanAccountId, incomeFromFeeAccountId, incomeFromPenaltyAccountId, writeOffAccountId, transfersInSuspenseAccountId, overpaymentLiabilityAccountId  Additional Mandatory Fields for periodic (3) and upfront (4)accrual accounting: fundSourceAccountId, loanPortfolioAccountId, interestOnLoanAccountId, incomeFromFeeAccountId, incomeFromPenaltyAccountId, writeOffAccountId, receivableInterestAccountId, receivableFeeAccountId, receivablePenaltyAccountId, transfersInSuspenseAccountId, overpaymentLiabilityAccountId  Additional Mandatory Fields if interest recalculation is enabled(true): interestRecalculationCompoundingMethod, rescheduleStrategyMethod, recalculationRestFrequencyType  Additional Optional Fields if interest recalculation is enabled(true): isArrearsBasedOnOriginalSchedule, preClosureInterestCalculationStrategy  Additional Optional Fields if interest recalculation is enabled(true) and recalculationRestFrequencyType is not same as repayment period: recalculationRestFrequencyInterval, recalculationRestFrequencyDate  Additional Optional Fields if interest recalculation is enabled(true) and interestRecalculationCompoundingMethod is enabled: recalculationCompoundingFrequencyType  Additional Optional Fields if interest recalculation is enabled(true) and interestRecalculationCompoundingMethod is enabled and recalculationCompoundingFrequencyType is not same as repayment period: recalculationCompoundingFrequencyInterval, recalculationCompoundingFrequencyDate  Additional Mandatory Fields if Hold Guarantee funds is enabled(true): mandatoryGuarantee  Additional Optional Fields if Hold Guarantee funds is enabled(true): minimumGuaranteeFromOwnFunds,minimumGuaranteeFromGuarantor

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanProductsApi;


LoanProductsApi apiInstance = new LoanProductsApi();
PostLoanProductsRequest body = new PostLoanProductsRequest(); // PostLoanProductsRequest | body
try {
    PostLoanProductsResponse result = apiInstance.createLoanProduct(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanProductsApi#createLoanProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostLoanProductsRequest**](PostLoanProductsRequest.md)| body |

### Return type

[**PostLoanProductsResponse**](PostLoanProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllLoanProducts"></a>
# **retrieveAllLoanProducts**
> List&lt;GetLoanProductsResponse&gt; retrieveAllLoanProducts()

List Loan Products

Lists Loan Products  Example Requests:  loanproducts   loanproducts?fields&#x3D;name,description,interestRateFrequencyType,amortizationType

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanProductsApi;


LoanProductsApi apiInstance = new LoanProductsApi();
try {
    List<GetLoanProductsResponse> result = apiInstance.retrieveAllLoanProducts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanProductsApi#retrieveAllLoanProducts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetLoanProductsResponse&gt;**](GetLoanProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveLoanProductDetails"></a>
# **retrieveLoanProductDetails**
> GetLoanProductsProductIdResponse retrieveLoanProductDetails(productId)

Retrieve a Loan Product

Retrieves a Loan Product  Example Requests:  loanproducts/1   loanproducts/1?template&#x3D;true   loanproducts/1?fields&#x3D;name,description,numberOfRepayments

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanProductsApi;


LoanProductsApi apiInstance = new LoanProductsApi();
Long productId = 789L; // Long | productId
try {
    GetLoanProductsProductIdResponse result = apiInstance.retrieveLoanProductDetails(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanProductsApi#retrieveLoanProductDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**GetLoanProductsProductIdResponse**](GetLoanProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> GetLoanProductsTemplateResponse retrieveTemplate(isProductMixTemplate)

Retrieve Loan Product Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loanproducts/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanProductsApi;


LoanProductsApi apiInstance = new LoanProductsApi();
Boolean isProductMixTemplate = true; // Boolean | isProductMixTemplate
try {
    GetLoanProductsTemplateResponse result = apiInstance.retrieveTemplate(isProductMixTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanProductsApi#retrieveTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isProductMixTemplate** | **Boolean**| isProductMixTemplate | [optional]

### Return type

[**GetLoanProductsTemplateResponse**](GetLoanProductsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLoanProduct"></a>
# **updateLoanProduct**
> PutLoanProductsProductIdResponse updateLoanProduct(productId, body)

Update a Loan Product

Updates a Loan Product

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.LoanProductsApi;


LoanProductsApi apiInstance = new LoanProductsApi();
Long productId = 789L; // Long | productId
PutLoanProductsProductIdRequest body = new PutLoanProductsProductIdRequest(); // PutLoanProductsProductIdRequest | body
try {
    PutLoanProductsProductIdResponse result = apiInstance.updateLoanProduct(productId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoanProductsApi#updateLoanProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |
 **body** | [**PutLoanProductsProductIdRequest**](PutLoanProductsProductIdRequest.md)| body |

### Return type

[**PutLoanProductsProductIdResponse**](PutLoanProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# LoanProductsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

LoanProductsApi apiService = defaultClient.createService(LoanProductsApi.class);

// Initialize these parameters earlier.
Call<PostLoanProductsResponse> call = apiService.createLoanProduct(body);
call.enqueue(new Callback<PostLoanProductsResponse>() {
    @Override
    public void onResponse(Call<PostLoanProductsResponse> call, Response<PostLoanProductsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostLoanProductsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

LoanProductsApi apiService = defaultClient.createService(LoanProductsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetLoanProductsResponse&gt;> call = apiService.retrieveAllLoanProducts();
call.enqueue(new Callback<List&lt;GetLoanProductsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetLoanProductsResponse&gt;> call, Response<List&lt;GetLoanProductsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetLoanProductsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

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

LoanProductsApi apiService = defaultClient.createService(LoanProductsApi.class);

// Initialize these parameters earlier.
Call<GetLoanProductsProductIdResponse> call = apiService.retrieveLoanProductDetails(productId);
call.enqueue(new Callback<GetLoanProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<GetLoanProductsProductIdResponse> call, Response<GetLoanProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetLoanProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

LoanProductsApi apiService = defaultClient.createService(LoanProductsApi.class);

// Initialize these parameters earlier.
Call<GetLoanProductsTemplateResponse> call = apiService.retrieveTemplate(isProductMixTemplate);
call.enqueue(new Callback<GetLoanProductsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetLoanProductsTemplateResponse> call, Response<GetLoanProductsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetLoanProductsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

LoanProductsApi apiService = defaultClient.createService(LoanProductsApi.class);

// Initialize these parameters earlier.
Call<PutLoanProductsProductIdResponse> call = apiService.updateLoanProduct(productId, body);
call.enqueue(new Callback<PutLoanProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<PutLoanProductsProductIdResponse> call, Response<PutLoanProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutLoanProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **productId** | **Long**| productId |
 **body** | [**PutLoanProductsProductIdRequest**](PutLoanProductsProductIdRequest.md)| body |

### Return type

[**PutLoanProductsProductIdResponse**](PutLoanProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


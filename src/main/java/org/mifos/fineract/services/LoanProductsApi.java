package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

import java.util.List;

public interface LoanProductsApi {
    /**
     * Create a Loan Product
     * Depending of the Accounting Rule (accountingRule) selected, additional fields with details of the appropriate Ledger Account identifiers would need to be passed in.  Refer MifosX Accounting Specs Draft for more details regarding the significance of the selected accounting rule  Mandatory Fields: name, shortName, currencyCode, digitsAfterDecimal, inMultiplesOf, principal, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, interestRateFrequencyType, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, accountingRule, isInterestRecalculationEnabled, daysInYearType, daysInMonthType  Optional Fields: inArrearsTolerance, graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, graceOnArrearsAgeing, charges, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, includeInBorrowerCycle, useBorrowerCycle,principalVariationsForBorrowerCycle, numberOfRepaymentVariationsForBorrowerCycle, interestRateVariationsForBorrowerCycle, multiDisburseLoan,maxTrancheCount, outstandingLoanBalance,overdueDaysForNPA,holdGuaranteeFunds, principalThresholdForLastInstalment, accountMovesOutOfNPAOnlyOnArrearsCompletion, canDefineInstallmentAmount, installmentAmountInMultiplesOf, allowAttributeOverrides, allowPartialPeriodInterestCalcualtion  Additional Mandatory Fields for Cash(2) based accounting: fundSourceAccountId, loanPortfolioAccountId, interestOnLoanAccountId, incomeFromFeeAccountId, incomeFromPenaltyAccountId, writeOffAccountId, transfersInSuspenseAccountId, overpaymentLiabilityAccountId  Additional Mandatory Fields for periodic (3) and upfront (4)accrual accounting: fundSourceAccountId, loanPortfolioAccountId, interestOnLoanAccountId, incomeFromFeeAccountId, incomeFromPenaltyAccountId, writeOffAccountId, receivableInterestAccountId, receivableFeeAccountId, receivablePenaltyAccountId, transfersInSuspenseAccountId, overpaymentLiabilityAccountId  Additional Mandatory Fields if interest recalculation is enabled(true): interestRecalculationCompoundingMethod, rescheduleStrategyMethod, recalculationRestFrequencyType  Additional Optional Fields if interest recalculation is enabled(true): isArrearsBasedOnOriginalSchedule, preClosureInterestCalculationStrategy  Additional Optional Fields if interest recalculation is enabled(true) and recalculationRestFrequencyType is not same as repayment period: recalculationRestFrequencyInterval, recalculationRestFrequencyDate  Additional Optional Fields if interest recalculation is enabled(true) and interestRecalculationCompoundingMethod is enabled: recalculationCompoundingFrequencyType  Additional Optional Fields if interest recalculation is enabled(true) and interestRecalculationCompoundingMethod is enabled and recalculationCompoundingFrequencyType is not same as repayment period: recalculationCompoundingFrequencyInterval, recalculationCompoundingFrequencyDate  Additional Mandatory Fields if Hold Guarantee funds is enabled(true): mandatoryGuarantee  Additional Optional Fields if Hold Guarantee funds is enabled(true): minimumGuaranteeFromOwnFunds,minimumGuaranteeFromGuarantor
     *
     * @param body body (required)
     * @return Call&lt;PostLoanProductsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("loanproducts")
    Call<PostLoanProductsResponse> createLoanProduct(
            @retrofit2.http.Body PostLoanProductsRequest body
    );

    /**
     * List Loan Products
     * Lists Loan Products  Example Requests:  loanproducts   loanproducts?fields&#x3D;name,description,interestRateFrequencyType,amortizationType
     *
     * @return Call&lt;List&lt;GetLoanProductsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loanproducts")
    Call<List<GetLoanProductsResponse>> retrieveAllLoanProducts();


    /**
     * Retrieve a Loan Product
     * Retrieves a Loan Product  Example Requests:  loanproducts/1   loanproducts/1?template&#x3D;true   loanproducts/1?fields&#x3D;name,description,numberOfRepayments
     *
     * @param productId productId (required)
     * @return Call&lt;GetLoanProductsProductIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loanproducts/{productId}")
    Call<GetLoanProductsProductIdResponse> retrieveLoanProductDetails(
            @retrofit2.http.Path("productId") Long productId
    );

    /**
     * Retrieve Loan Product Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loanproducts/template
     *
     * @param isProductMixTemplate isProductMixTemplate (optional)
     * @return Call&lt;GetLoanProductsTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loanproducts/template")
    Call<GetLoanProductsTemplateResponse> retrieveTemplate(
            @retrofit2.http.Query("isProductMixTemplate") Boolean isProductMixTemplate
    );

    /**
     * Update a Loan Product
     * Updates a Loan Product
     *
     * @param productId productId (required)
     * @param body      body (required)
     * @return Call&lt;PutLoanProductsProductIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("loanproducts/{productId}")
    Call<PutLoanProductsProductIdResponse> updateLoanProduct(
            @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body PutLoanProductsProductIdRequest body
    );

}

package org.openapitools.client.apis

import org.openapitools.client.models.GetLoanProductsProductIdResponse
import org.openapitools.client.models.GetLoanProductsResponse
import org.openapitools.client.models.GetLoanProductsTemplateResponse
import org.openapitools.client.models.PostLoanProductsRequest
import org.openapitools.client.models.PostLoanProductsResponse
import org.openapitools.client.models.PutLoanProductsProductIdRequest
import org.openapitools.client.models.PutLoanProductsProductIdResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface LoanProductsApi {
    /**
     * Create a Loan Product
     * Depending of the Accounting Rule (accountingRule) selected, additional fields with details of the appropriate Ledger Account identifiers would need to be passed in.  Refer MifosX Accounting Specs Draft for more details regarding the significance of the selected accounting rule  Mandatory Fields: name, shortName, currencyCode, digitsAfterDecimal, inMultiplesOf, principal, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, interestRateFrequencyType, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyCode, accountingRule, isInterestRecalculationEnabled, daysInYearType, daysInMonthType  Optional Fields: inArrearsTolerance, graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, graceOnArrearsAgeing, charges, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, includeInBorrowerCycle, useBorrowerCycle,principalVariationsForBorrowerCycle, numberOfRepaymentVariationsForBorrowerCycle, interestRateVariationsForBorrowerCycle, multiDisburseLoan,maxTrancheCount, outstandingLoanBalance,overdueDaysForNPA,holdGuaranteeFunds, principalThresholdForLastInstalment, accountMovesOutOfNPAOnlyOnArrearsCompletion, canDefineInstallmentAmount, installmentAmountInMultiplesOf, allowAttributeOverrides, allowPartialPeriodInterestCalcualtion,dueDaysForRepaymentEvent,overDueDaysForRepaymentEvent,enableDownPayment,disbursedAmountPercentageDownPayment,enableAutoRepaymentForDownPayment,repaymentStartDateType,disableScheduleExtensionForDownPayment  Additional Mandatory Fields for Cash(2) based accounting: fundSourceAccountId, loanPortfolioAccountId, interestOnLoanAccountId, incomeFromFeeAccountId, incomeFromPenaltyAccountId, writeOffAccountId, transfersInSuspenseAccountId, overpaymentLiabilityAccountId  Additional Mandatory Fields for periodic (3) and upfront (4)accrual accounting: fundSourceAccountId, loanPortfolioAccountId, interestOnLoanAccountId, incomeFromFeeAccountId, incomeFromPenaltyAccountId, writeOffAccountId, receivableInterestAccountId, receivableFeeAccountId, receivablePenaltyAccountId, transfersInSuspenseAccountId, overpaymentLiabilityAccountId  Additional Mandatory Fields if interest recalculation is enabled(true): interestRecalculationCompoundingMethod, rescheduleStrategyMethod, recalculationRestFrequencyType  Additional Optional Fields if interest recalculation is enabled(true): isArrearsBasedOnOriginalSchedule, preClosureInterestCalculationStrategy  Additional Optional Fields if interest recalculation is enabled(true) and recalculationRestFrequencyType is not same as repayment period: recalculationRestFrequencyInterval, recalculationRestFrequencyDate  Additional Optional Fields if interest recalculation is enabled(true) and interestRecalculationCompoundingMethod is enabled: recalculationCompoundingFrequencyType  Additional Optional Fields if interest recalculation is enabled(true) and interestRecalculationCompoundingMethod is enabled and recalculationCompoundingFrequencyType is not same as repayment period: recalculationCompoundingFrequencyInterval, recalculationCompoundingFrequencyDate  Additional Mandatory Fields if Hold Guarantee funds is enabled(true): mandatoryGuarantee  Additional Optional Fields if Hold Guarantee funds is enabled(true): minimumGuaranteeFromOwnFunds,minimumGuaranteeFromGuarantor
     * Responses:
     *  - 200: OK
     *
     * @param postLoanProductsRequest
     * @return [PostLoanProductsResponse]
     */
    @POST("v1/loanproducts")
    suspend fun createLoanProduct(@Body postLoanProductsRequest: PostLoanProductsRequest): PostLoanProductsResponse

    /**
     * List Loan Products
     * Lists Loan Products  Example Requests:  loanproducts   loanproducts?fields&#x3D;name,description,interestRateFrequencyType,amortizationType
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetLoanProductsResponse]
     */
    @GET("v1/loanproducts")
    suspend fun retrieveAllLoanProducts(): List<GetLoanProductsResponse>

    /**
     * Retrieve a Loan Product
     * Retrieves a Loan Product  Example Requests:  loanproducts/1   loanproducts/1?template&#x3D;true   loanproducts/1?fields&#x3D;name,description,numberOfRepayments
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @return [GetLoanProductsProductIdResponse]
     */
    @GET("v1/loanproducts/{productId}")
    suspend fun retrieveLoanProductDetails(@Path("productId") productId: Long): GetLoanProductsProductIdResponse

    /**
     * Retrieve a Loan Product
     * Retrieves a Loan Product  Example Requests:  loanproducts/external-id/2075e308-d4a8-44d9-8203-f5a947b8c2f4   loanproducts/external-id/2075e308-d4a8-44d9-8203-f5a947b8c2f4?template&#x3D;true   loanproducts/external-id/2075e308-d4a8-44d9-8203-f5a947b8c2f4?fields&#x3D;name,description,numberOfRepayments
     * Responses:
     *  - 200: OK
     *
     * @param externalProductId externalProductId
     * @return [GetLoanProductsProductIdResponse]
     */
    @GET("v1/loanproducts/external-id/{externalProductId}")
    suspend fun retrieveLoanProductDetails1(@Path("externalProductId") externalProductId: String): GetLoanProductsProductIdResponse

    /**
     * Retrieve Loan Product Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  loanproducts/template
     * Responses:
     *  - 200: OK
     *
     * @param isProductMixTemplate isProductMixTemplate (optional)
     * @return [GetLoanProductsTemplateResponse]
     */
    @GET("v1/loanproducts/template")
    suspend fun retrieveTemplate11(@Query("isProductMixTemplate") isProductMixTemplate: Boolean? = null): GetLoanProductsTemplateResponse

    /**
     * Update a Loan Product
     * Updates a Loan Product
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @param putLoanProductsProductIdRequest
     * @return [PutLoanProductsProductIdResponse]
     */
    @PUT("v1/loanproducts/{productId}")
    suspend fun updateLoanProduct(
        @Path("productId") productId: Long,
        @Body putLoanProductsProductIdRequest: PutLoanProductsProductIdRequest
    ): PutLoanProductsProductIdResponse

    /**
     * Update a Loan Product
     * Updates a Loan Product
     * Responses:
     *  - 200: OK
     *
     * @param externalProductId externalProductId
     * @param putLoanProductsProductIdRequest
     * @return [PutLoanProductsProductIdResponse]
     */
    @PUT("v1/loanproducts/external-id/{externalProductId}")
    suspend fun updateLoanProduct1(
        @Path("externalProductId") externalProductId: String,
        @Body putLoanProductsProductIdRequest: PutLoanProductsProductIdRequest
    ): PutLoanProductsProductIdResponse

}

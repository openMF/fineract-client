package org.openapitools.client.apis

import org.openapitools.client.models.GetSelfLoansLoanIdChargesResponse
import org.openapitools.client.models.GetSelfLoansLoanIdResponse
import org.openapitools.client.models.GetSelfLoansLoanIdTransactionsTransactionIdResponse
import org.openapitools.client.models.GetSelfLoansTemplateResponse
import org.openapitools.client.models.PostSelfLoansLoanIdRequest
import org.openapitools.client.models.PostSelfLoansLoanIdResponse
import org.openapitools.client.models.PostSelfLoansRequest
import org.openapitools.client.models.PostSelfLoansResponse
import org.openapitools.client.models.PutSelfLoansLoanIdRequest
import org.openapitools.client.models.PutSelfLoansLoanIdResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface SelfLoansApi {
    /**
     * Calculate Loan Repayment Schedule | Submit a new Loan Application
     * Calculate Loan Repayment Schedule:  Calculates Loan Repayment Schedule  Mandatory Fields: productId, principal, loanTermFrequency, loanTermFrequencyType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, expectedDisbursementDate, transactionProcessingStrategyCode  Submit a new Loan Application:  Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyCode, expectedDisbursementDate, submittedOnDate, loanType  Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate  Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables  Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true)  Showing request/response for &#39;Submit a new Loan Application&#39;
     * Responses:
     *  - 200: OK
     *
     * @param postSelfLoansRequest
     * @param command command (optional)
     * @return [PostSelfLoansResponse]
     */
    @POST("v1/self/loans")
    suspend fun calculateLoanScheduleOrSubmitLoanApplication1(
        @Body postSelfLoansRequest: PostSelfLoansRequest,
        @Query("command") command: String? = null
    ): PostSelfLoansResponse

    /**
     * Update a Loan Application
     * Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param putSelfLoansLoanIdRequest
     * @return [PutSelfLoansLoanIdResponse]
     */
    @PUT("v1/self/loans/{loanId}")
    suspend fun modifyLoanApplication2(
        @Path("loanId") loanId: Long,
        @Body putSelfLoansLoanIdRequest: PutSelfLoansLoanIdRequest
    ): PutSelfLoansLoanIdResponse

    /**
     * List Loan Charges
     * Lists loan Charges  Example Requests:  self/loans/1/charges   self/loans/1/charges?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [kotlin.collections.List<GetSelfLoansLoanIdChargesResponse]
     */
    @GET("v1/self/loans/{loanId}/charges")
    suspend fun retrieveAllLoanCharges2(@Path("loanId") loanId: Long): List<GetSelfLoansLoanIdChargesResponse>

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @return [kotlin.String]
     */
    @GET("v1/self/loans/{loanId}/guarantors")
    suspend fun retrieveGuarantorDetails2(@Path("loanId") loanId: Long): String

    /**
     * Retrieve a Loan
     * Retrieves a Loan  Example Requests:  self/loans/1   self/loans/1?fields&#x3D;id,principal,annualInterestRate   self/loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [GetSelfLoansLoanIdResponse]
     */
    @GET("v1/self/loans/{loanId}")
    suspend fun retrieveLoan2(@Path("loanId") loanId: Long): GetSelfLoansLoanIdResponse

    /**
     * Retrieve a Loan Charge
     * Retrieves a Loan Charge  Example Requests:  self/loans/1/charges/1   self/loans/1/charges/1?fields&#x3D;name,amountOrPercentage
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param chargeId chargeId
     * @return [GetSelfLoansLoanIdChargesResponse]
     */
    @GET("v1/self/loans/{loanId}/charges/{chargeId}")
    suspend fun retrieveLoanCharge4(
        @Path("loanId") loanId: Long,
        @Path("chargeId") chargeId: Long
    ): GetSelfLoansLoanIdChargesResponse

    /**
     * Retrieve a Loan Transaction Details
     * Retrieves a Loan Transaction DetailsExample Request:  self/loans/5/transactions/3
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param transactionId transactionId
     * @param fields Optional Loan Transaction attribute list to be in the response (optional)
     * @return [GetSelfLoansLoanIdTransactionsTransactionIdResponse]
     */
    @GET("v1/self/loans/{loanId}/transactions/{transactionId}")
    suspend fun retrieveTransaction1(
        @Path("loanId") loanId: Long,
        @Path("transactionId") transactionId: Long,
        @Query("fields") fields: String? = null
    ): GetSelfLoansLoanIdTransactionsTransactionIdResponse

    /**
     * Applicant Withdraws from Loan Application
     * Applicant Withdraws from Loan Application  Mandatory Fields: withdrawnOnDate
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param postSelfLoansLoanIdRequest
     * @param command command (optional)
     * @return [PostSelfLoansLoanIdResponse]
     */
    @POST("v1/self/loans/{loanId}")
    suspend fun stateTransitions2(
        @Path("loanId") loanId: Long,
        @Body postSelfLoansLoanIdRequest: PostSelfLoansLoanIdRequest,
        @Query("command") command: String? = null
    ): PostSelfLoansLoanIdResponse

    /**
     * Retrieve Loan Details Template
     * Retrieves Loan Details Template  This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists  Example Requests:  self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId (optional)
     * @param productId productId (optional)
     * @param templateType templateType (optional)
     * @return [GetSelfLoansTemplateResponse]
     */
    @GET("v1/self/loans/template")
    suspend fun template17(
        @Query("clientId") clientId: Long? = null,
        @Query("productId") productId: Long? = null,
        @Query("templateType") templateType: String? = null
    ): GetSelfLoansTemplateResponse

}

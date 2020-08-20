package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

import java.util.List;

public interface SelfLoansApi {
    /**
     * Calculate Loan Repayment Schedule | Submit a new Loan Application
     * Calculate Loan Repayment Schedule:  Calculates Loan Repayment Schedule  Mandatory Fields: productId, principal, loanTermFrequency, loanTermFrequencyType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, expectedDisbursementDate, transactionProcessingStrategyId  Submit a new Loan Application:  Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, expectedDisbursementDate, submittedOnDate, loanType  Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate  Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables  Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true)  Showing request/response for &#39;Submit a new Loan Application&#39;
     *
     * @param body    body (required)
     * @param command command (optional)
     * @return Call&lt;PostSelfLoansResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("self/loans")
    Call<PostSelfLoansResponse> calculateLoanScheduleOrSubmitLoanApplication(
            @retrofit2.http.Body PostSelfLoansRequest body, @retrofit2.http.Query("command") String command
    );

    /**
     * Update a Loan Application
     * Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.
     *
     * @param loanId loanId (required)
     * @param body   body (required)
     * @return Call&lt;PutSelfLoansLoanIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("self/loans/{loanId}")
    Call<PutSelfLoansLoanIdResponse> modifyLoanApplication(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PutSelfLoansLoanIdRequest body
    );

    /**
     * List Loan Charges
     * Lists loan Charges  Example Requests:  self/loans/1/charges   self/loans/1/charges?fields&#x3D;name,amountOrPercentage
     *
     * @param loanId loanId (required)
     * @return Call&lt;List&lt;GetSelfLoansLoanIdChargesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/loans/{loanId}/charges")
    Call<List<GetSelfLoansLoanIdChargesResponse>> retrieveAllLoanCharges(
            @retrofit2.http.Path("loanId") Long loanId
    );

    /**
     * @param loanId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/loans/{loanId}/guarantors")
    Call<String> retrieveGuarantorDetails(
            @retrofit2.http.Path("loanId") Long loanId
    );

    /**
     * Retrieve a Loan
     * Retrieves a Loan  Example Requests:  self/loans/1   self/loans/1?fields&#x3D;id,principal,annualInterestRate   self/loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions
     *
     * @param loanId loanId (required)
     * @return Call&lt;GetSelfLoansLoanIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/loans/{loanId}")
    Call<GetSelfLoansLoanIdResponse> retrieveLoan(
            @retrofit2.http.Path("loanId") Long loanId
    );

    /**
     * Retrieve a Loan Charge
     * Retrieves a Loan Charge  Example Requests:  self/loans/1/charges/1   self/loans/1/charges/1?fields&#x3D;name,amountOrPercentage
     *
     * @param loanId   loanId (required)
     * @param chargeId chargeId (required)
     * @return Call&lt;GetSelfLoansLoanIdChargesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/loans/{loanId}/charges/{chargeId}")
    Call<GetSelfLoansLoanIdChargesResponse> retrieveLoanCharge(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("chargeId") Long chargeId
    );

    /**
     * Retrieve a Loan Transaction Details
     * Retrieves a Loan Transaction DetailsExample Request:  self/loans/5/transactions/3
     *
     * @param loanId        loanId (required)
     * @param transactionId transactionId (required)
     * @return Call&lt;GetSelfLoansLoanIdTransactionsTransactionIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/loans/{loanId}/transactions/{transactionId}")
    Call<GetSelfLoansLoanIdTransactionsTransactionIdResponse> retrieveTransaction(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("transactionId") Long transactionId
    );

    /**
     * Applicant Withdraws from Loan Application
     * Applicant Withdraws from Loan Application  Mandatory Fields: withdrawnOnDate
     *
     * @param loanId  loanId (required)
     * @param body    body (required)
     * @param command command (optional)
     * @return Call&lt;PostSelfLoansLoanIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("self/loans/{loanId}")
    Call<PostSelfLoansLoanIdResponse> stateTransitions(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PostSelfLoansLoanIdRequest body, @retrofit2.http.Query("command") String command
    );

    /**
     * Retrieve Loan Details Template
     * Retrieves Loan Details Template  This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1
     *
     * @param clientId     clientId (optional)
     * @param productId    productId (optional)
     * @param templateType templateType (optional)
     * @return Call&lt;GetSelfLoansTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/loans/template")
    Call<GetSelfLoansTemplateResponse> template(
            @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("productId") Long productId, @retrofit2.http.Query("templateType") String templateType
    );

}

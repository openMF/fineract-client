package org.mifos.fineract.services;

import okhttp3.MultipartBody;
import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

public interface LoansApi {
    /**
     * Calculate loan repayment schedule | Submit a new Loan Application
     * It calculates the loan repayment Schedule Submits a new loan application Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, expectedDisbursementDate, submittedOnDate, loanType Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true) Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables
     *
     * @param body    body (required)
     * @param command command (optional)
     * @return Observable&lt;PostLoansResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("loans")
    Observable<PostLoansResponse> calculateLoanScheduleOrSubmitLoanApplication(
            @retrofit2.http.Body PostLoansRequest body, @retrofit2.http.Query("command") String command
    );

    /**
     * Delete a Loan Application
     * Note: Only loans in \&quot;Submitted and awaiting approval\&quot; status can be deleted.
     *
     * @param loanId loanId (required)
     * @return Observable&lt;DeleteLoansLoanIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("loans/{loanId}")
    Observable<DeleteLoansLoanIdResponse> deleteLoanApplication(
            @retrofit2.http.Path("loanId") Long loanId
    );

    /**
     * @param officeId   (optional)
     * @param dateFormat (optional)
     * @return Observable&lt;Void&gt;
     */
    @GET("loans/repayments/downloadtemplate")
    Observable<Void> getLoanRepaymentTemplate(
            @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("dateFormat") String dateFormat
    );

    /**
     * @param officeId   (optional)
     * @param staffId    (optional)
     * @param dateFormat (optional)
     * @return Observable&lt;Void&gt;
     */
    @GET("loans/downloadtemplate")
    Observable<Void> getLoansTemplate(
            @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("dateFormat") String dateFormat
    );

    /**
     * Modify a loan application
     * Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.
     *
     * @param loanId loanId (required)
     * @param body   body (required)
     * @return Observable&lt;PutLoansLoanIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("loans/{loanId}")
    Observable<PutLoansLoanIdResponse> modifyLoanApplication(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PutLoansLoanIdRequest body
    );

    /**
     * @param file       (optional)
     * @param locale     (optional)
     * @param dateFormat (optional)
     * @return Observable&lt;String&gt;
     */
    @retrofit2.http.Multipart
    @POST("loans/repayments/uploadtemplate")
    Observable<String> postLoanRepaymentTemplate(
            @retrofit2.http.Part MultipartBody.Part file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
    );

    /**
     * @param file       (optional)
     * @param locale     (optional)
     * @param dateFormat (optional)
     * @return Observable&lt;String&gt;
     */
    @retrofit2.http.Multipart
    @POST("loans/uploadtemplate")
    Observable<String> postLoanTemplate(
            @retrofit2.http.Part MultipartBody.Part file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
    );

    /**
     * List Loans
     * The list capability of loans can support pagination and sorting. Example Requests:  loans  loans?fields&#x3D;accountNo  loans?offset&#x3D;10&amp;limit&#x3D;50  loans?orderBy&#x3D;accountNo&amp;sortOrder&#x3D;DESC
     *
     * @param sqlSearch  sqlSearch (optional)
     * @param externalId externalId (optional)
     * @param offset     offset (optional)
     * @param limit      limit (optional)
     * @param orderBy    orderBy (optional)
     * @param sortOrder  sortOrder (optional)
     * @param accountNo  accountNo (optional)
     * @return Observable&lt;GetLoansResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loans")
    Observable<GetLoansResponse> retrieveAll(
            @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("externalId") String externalId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("accountNo") String accountNo
    );

    /**
     * @param loanId       loanId (required)
     * @param templateType templateType (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loans/{loanId}/template")
    Observable<String> retrieveApprovalTemplate(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Query("templateType") String templateType
    );

    /**
     * Retrieve a Loan
     * Note: template&#x3D;true parameter doesn&#39;t apply to this resource.Example Requests:  loans/1   loans/1?fields&#x3D;id,principal,annualInterestRate   loans/1?associations&#x3D;all  loans/1?associations&#x3D;all&amp;exclude&#x3D;guarantors   loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions
     *
     * @param loanId                    loanId (required)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @return Observable&lt;GetLoansLoanIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loans/{loanId}")
    Observable<GetLoansLoanIdResponse> retrieveLoan(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly
    );

    /**
     * Approve Loan Application | Recover Loan Guarantee | Undo Loan Application Approval | Assign a Loan Officer | Unassign a Loan Officer | Reject Loan Application | Applicant Withdraws from Loan Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal
     * Approve Loan Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the loan application  Recover Loan Guarantee: Recovers the loan guarantee  Undo Loan Application Approval: Undoes the Loan Application Approval  Assign a Loan Officer: Allows you to assign Loan Officer for existing Loan.  Unassign a Loan Officer: Allows you to unassign the Loan Officer.  Reject Loan Application: Mandatory Fields: rejectedOnDate Allows you to reject the loan application  Applicant Withdraws from Loan Application: Mandatory Fields: withdrawnOnDate Allows the applicant to withdraw the loan application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal Showing request and response for Assign a Loan Officer
     *
     * @param loanId  loanId (required)
     * @param body    body (required)
     * @param command command (optional)
     * @return Observable&lt;PostLoansLoanIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("loans/{loanId}")
    Observable<PostLoansLoanIdResponse> stateTransitions(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PostLoansLoanIdRequest body, @retrofit2.http.Query("command") String command
    );

    /**
     * Retrieve Loan Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1
     *
     * @param clientId                  clientId (optional)
     * @param groupId                   groupId (optional)
     * @param productId                 productId (optional)
     * @param templateType              templateType (optional)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param activeOnly                activeOnly (optional, default to false)
     * @return Observable&lt;GetLoansTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loans/template")
    Observable<GetLoansTemplateResponse> template(
            @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("groupId") Long groupId, @retrofit2.http.Query("productId") Long productId, @retrofit2.http.Query("templateType") String templateType, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly, @retrofit2.http.Query("activeOnly") Boolean activeOnly
    );

}

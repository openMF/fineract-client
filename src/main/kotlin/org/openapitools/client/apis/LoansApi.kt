package org.openapitools.client.apis

import okhttp3.MultipartBody
import org.openapitools.client.models.DeleteLoansLoanIdResponse
import org.openapitools.client.models.GetDelinquencyActionsResponse
import org.openapitools.client.models.GetDelinquencyTagHistoryResponse
import org.openapitools.client.models.GetLoansApprovalTemplateResponse
import org.openapitools.client.models.GetLoansLoanIdResponse
import org.openapitools.client.models.GetLoansResponse
import org.openapitools.client.models.GetLoansTemplateResponse
import org.openapitools.client.models.PostLoansDelinquencyActionRequest
import org.openapitools.client.models.PostLoansDelinquencyActionResponse
import org.openapitools.client.models.PostLoansLoanIdRequest
import org.openapitools.client.models.PostLoansLoanIdResponse
import org.openapitools.client.models.PostLoansRequest
import org.openapitools.client.models.PostLoansResponse
import org.openapitools.client.models.PutLoansLoanIdRequest
import org.openapitools.client.models.PutLoansLoanIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface LoansApi {
    /**
     * Calculate loan repayment schedule | Submit a new Loan Application
     * It calculates the loan repayment Schedule Submits a new loan application Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyCode, expectedDisbursementDate, submittedOnDate, loanType Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true) Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables
     * Responses:
     *  - 200: OK
     *
     * @param postLoansRequest
     * @param command command (optional)
     * @return [PostLoansResponse]
     */
    @POST("v1/loans")
    suspend fun calculateLoanScheduleOrSubmitLoanApplication(
        @Body postLoansRequest: PostLoansRequest,
        @Query("command") command: String? = null
    ): PostLoansResponse

    /**
     * Adds a new delinquency action for a loan
     *
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param postLoansDelinquencyActionRequest
     * @return [PostLoansDelinquencyActionResponse]
     */
    @POST("v1/loans/{loanId}/delinquency-actions")
    suspend fun createLoanDelinquencyAction(
        @Path("loanId") loanId: Long,
        @Body postLoansDelinquencyActionRequest: PostLoansDelinquencyActionRequest
    ): PostLoansDelinquencyActionResponse

    /**
     * Adds a new delinquency action for a loan
     *
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param postLoansDelinquencyActionRequest
     * @return [PostLoansDelinquencyActionResponse]
     */
    @POST("v1/loans/external-id/{loanExternalId}/delinquency-actions")
    suspend fun createLoanDelinquencyAction1(
        @Path("loanExternalId") loanExternalId: String,
        @Body postLoansDelinquencyActionRequest: PostLoansDelinquencyActionRequest
    ): PostLoansDelinquencyActionResponse

    /**
     * Delete a Loan Application
     * Note: Only loans in \&quot;Submitted and awaiting approval\&quot; status can be deleted.
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [DeleteLoansLoanIdResponse]
     */
    @DELETE("v1/loans/{loanId}")
    suspend fun deleteLoanApplication(@Path("loanId") loanId: Long): DeleteLoansLoanIdResponse

    /**
     * Delete a Loan Application
     * Note: Only loans in \&quot;Submitted and awaiting approval\&quot; status can be deleted.
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @return [DeleteLoansLoanIdResponse]
     */
    @DELETE("v1/loans/external-id/{loanExternalId}")
    suspend fun deleteLoanApplication1(@Path("loanExternalId") loanExternalId: String): DeleteLoansLoanIdResponse

    /**
     * Retrieve the Loan Delinquency Tag history using the Loan Id
     *
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [kotlin.collections.List<GetDelinquencyTagHistoryResponse]
     */
    @GET("v1/loans/{loanId}/delinquencytags")
    suspend fun getDelinquencyTagHistory(@Path("loanId") loanId: Long): List<GetDelinquencyTagHistoryResponse>

    /**
     * Retrieve the Loan Delinquency Tag history using the Loan Id
     *
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @return [kotlin.collections.List<GetDelinquencyTagHistoryResponse]
     */
    @GET("v1/loans/external-id/{loanExternalId}/delinquencytags")
    suspend fun getDelinquencyTagHistory1(@Path("loanExternalId") loanExternalId: String): List<GetDelinquencyTagHistoryResponse>

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param glimId
     * @return [kotlin.String]
     */
    @GET("v1/loans/glimAccount/{glimId}")
    suspend fun getGlimRepaymentTemplate(@Path("glimId") glimId: Long): String

    /**
     * Retrieve delinquency actions related to the loan
     *
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [kotlin.collections.List<GetDelinquencyActionsResponse]
     */
    @GET("v1/loans/{loanId}/delinquency-actions")
    suspend fun getLoanDelinquencyActions(@Path("loanId") loanId: Long): List<GetDelinquencyActionsResponse>

    /**
     * Retrieve delinquency actions related to the loan
     *
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @return [kotlin.collections.List<GetDelinquencyActionsResponse]
     */
    @GET("v1/loans/external-id/{loanExternalId}/delinquency-actions")
    suspend fun getLoanDelinquencyActions1(@Path("loanExternalId") loanExternalId: String): List<GetDelinquencyActionsResponse>

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/loans/repayments/downloadtemplate")
    suspend fun getLoanRepaymentTemplate(
        @Query("officeId") officeId: Long? = null,
        @Query("dateFormat") dateFormat: String? = null
    ): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param staffId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/loans/downloadtemplate")
    suspend fun getLoansTemplate(
        @Query("officeId") officeId: Long? = null,
        @Query("staffId") staffId: Long? = null,
        @Query("dateFormat") dateFormat: String? = null
    ): Unit

    /**
     * Approve GLIM Application | Undo GLIM Application Approval | Reject GLIM Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal
     * Approve GLIM Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the GLIM application  Undo GLIM Application Approval: Undoes the GLIM Application Approval  Reject GLIM Application: Mandatory Fields: rejectedOnDate Allows you to reject the GLIM application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal
     * Responses:
     *  - 200: OK
     *
     * @param glimId
     * @param postLoansLoanIdRequest
     * @param command  (optional)
     * @return [PostLoansLoanIdResponse]
     */
    @POST("v1/loans/glimAccount/{glimId}")
    suspend fun glimStateTransitions(
        @Path("glimId") glimId: Long,
        @Body postLoansLoanIdRequest: PostLoansLoanIdRequest,
        @Query("command") command: String? = null
    ): PostLoansLoanIdResponse

    /**
     * Modify a loan application
     * Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param putLoansLoanIdRequest
     * @param command command (optional)
     * @return [PutLoansLoanIdResponse]
     */
    @PUT("v1/loans/{loanId}")
    suspend fun modifyLoanApplication(
        @Path("loanId") loanId: Long,
        @Body putLoansLoanIdRequest: PutLoansLoanIdRequest,
        @Query("command") command: String? = null
    ): PutLoansLoanIdResponse

    /**
     * Modify a loan application
     * Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param putLoansLoanIdRequest
     * @param command command (optional)
     * @return [PutLoansLoanIdResponse]
     */
    @PUT("v1/loans/external-id/{loanExternalId}")
    suspend fun modifyLoanApplication1(
        @Path("loanExternalId") loanExternalId: String,
        @Body putLoansLoanIdRequest: PutLoansLoanIdRequest,
        @Query("command") command: String? = null
    ): PutLoansLoanIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/loans/repayments/uploadtemplate")
    suspend fun postLoanRepaymentTemplate(
        @Part("dateFormat") dateFormat: String? = null,
        @Part("locale") locale: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/loans/uploadtemplate")
    suspend fun postLoanTemplate(
        @Part("dateFormat") dateFormat: String? = null,
        @Part("locale") locale: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
    ): String

    /**
     * List Loans
     * The list capability of loans can support pagination and sorting. Example Requests:  loans  loans?fields&#x3D;accountNo  loans?offset&#x3D;10&amp;limit&#x3D;50  loans?orderBy&#x3D;accountNo&amp;sortOrder&#x3D;DESC
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @param accountNo accountNo (optional)
     * @param status status (optional)
     * @return [GetLoansResponse]
     */
    @GET("v1/loans")
    suspend fun retrieveAll27(
        @Query("externalId") externalId: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("accountNo") accountNo: String? = null,
        @Query("status") status: String? = null
    ): GetLoansResponse

    /**
     *
     *
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param templateType templateType (optional)
     * @return [GetLoansApprovalTemplateResponse]
     */
    @GET("v1/loans/{loanId}/template")
    suspend fun retrieveApprovalTemplate(
        @Path("loanId") loanId: Long,
        @Query("templateType") templateType: String? = null
    ): GetLoansApprovalTemplateResponse

    /**
     *
     *
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param templateType templateType (optional)
     * @return [GetLoansApprovalTemplateResponse]
     */
    @GET("v1/loans/external-id/{loanExternalId}/template")
    suspend fun retrieveApprovalTemplate1(
        @Path("loanExternalId") loanExternalId: String,
        @Query("templateType") templateType: String? = null
    ): GetLoansApprovalTemplateResponse

    /**
     * Retrieve a Loan
     * Note: template&#x3D;true parameter doesn&#39;t apply to this resource.Example Requests:  loans/1   loans/1?fields&#x3D;id,principal,annualInterestRate   loans/1?associations&#x3D;all  loans/1?associations&#x3D;all&amp;exclude&#x3D;guarantors   loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param associations Loan object relations to be included in the response (optional, default to "all")
     * @param exclude Optional Loan object relation list to be filtered in the response (optional)
     * @param fields Optional Loan attribute list to be in the response (optional)
     * @return [GetLoansLoanIdResponse]
     */
    @GET("v1/loans/{loanId}")
    suspend fun retrieveLoan(
        @Path("loanId") loanId: Long,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false,
        @Query("associations") associations: String? = "all",
        @Query("exclude") exclude: String? = null,
        @Query("fields") fields: String? = null
    ): GetLoansLoanIdResponse

    /**
     * Retrieve a Loan
     * Note: template&#x3D;true parameter doesn&#39;t apply to this resource.Example Requests:  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?fields&#x3D;id,principal,annualInterestRate   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?associations&#x3D;all  loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?associations&#x3D;all&amp;exclude&#x3D;guarantors   loans/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param associations Loan object relations to be included in the response (optional, default to "all")
     * @param exclude Optional Loan object relation list to be filtered in the response (optional)
     * @param fields Optional Loan attribute list to be in the response (optional)
     * @return [GetLoansLoanIdResponse]
     */
    @GET("v1/loans/external-id/{loanExternalId}")
    suspend fun retrieveLoan1(
        @Path("loanExternalId") loanExternalId: String,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false,
        @Query("associations") associations: String? = "all",
        @Query("exclude") exclude: String? = null,
        @Query("fields") fields: String? = null
    ): GetLoansLoanIdResponse

    /**
     * Approve Loan Application | Recover Loan Guarantee | Undo Loan Application Approval | Assign a Loan Officer | Unassign a Loan Officer | Reject Loan Application | Applicant Withdraws from Loan Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal
     * Approve Loan Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the loan application  Recover Loan Guarantee: Recovers the loan guarantee  Undo Loan Application Approval: Undoes the Loan Application Approval  Assign a Loan Officer: Allows you to assign Loan Officer for existing Loan.  Unassign a Loan Officer: Allows you to unassign the Loan Officer.  Reject Loan Application: Mandatory Fields: rejectedOnDate Allows you to reject the loan application  Applicant Withdraws from Loan Application: Mandatory Fields: withdrawnOnDate Allows the applicant to withdraw the loan application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal Showing request and response for Assign a Loan Officer
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param postLoansLoanIdRequest
     * @param command command (optional)
     * @return [PostLoansLoanIdResponse]
     */
    @POST("v1/loans/{loanId}")
    suspend fun stateTransitions(
        @Path("loanId") loanId: Long,
        @Body postLoansLoanIdRequest: PostLoansLoanIdRequest,
        @Query("command") command: String? = null
    ): PostLoansLoanIdResponse

    /**
     * Approve Loan Application | Recover Loan Guarantee | Undo Loan Application Approval | Assign a Loan Officer | Unassign a Loan Officer | Reject Loan Application | Applicant Withdraws from Loan Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal
     * Approve Loan Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the loan application  Recover Loan Guarantee: Recovers the loan guarantee  Undo Loan Application Approval: Undoes the Loan Application Approval  Assign a Loan Officer: Allows you to assign Loan Officer for existing Loan.  Unassign a Loan Officer: Allows you to unassign the Loan Officer.  Reject Loan Application: Mandatory Fields: rejectedOnDate Allows you to reject the loan application  Applicant Withdraws from Loan Application: Mandatory Fields: withdrawnOnDate Allows the applicant to withdraw the loan application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal Showing request and response for Assign a Loan Officer
     * Responses:
     *  - 200: OK
     *
     * @param loanExternalId loanExternalId
     * @param postLoansLoanIdRequest
     * @param command command (optional)
     * @return [PostLoansLoanIdResponse]
     */
    @POST("v1/loans/external-id/{loanExternalId}")
    suspend fun stateTransitions1(
        @Path("loanExternalId") loanExternalId: String,
        @Body postLoansLoanIdRequest: PostLoansLoanIdRequest,
        @Query("command") command: String? = null
    ): PostLoansLoanIdResponse

    /**
     * Retrieve Loan Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Requests:  loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId (optional)
     * @param groupId groupId (optional)
     * @param productId productId (optional)
     * @param templateType templateType (optional)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param activeOnly activeOnly (optional, default to false)
     * @return [GetLoansTemplateResponse]
     */
    @GET("v1/loans/template")
    suspend fun template10(
        @Query("clientId") clientId: Long? = null,
        @Query("groupId") groupId: Long? = null,
        @Query("productId") productId: Long? = null,
        @Query("templateType") templateType: String? = null,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false,
        @Query("activeOnly") activeOnly: Boolean? = false
    ): GetLoansTemplateResponse

}

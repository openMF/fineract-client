package org.openapitools.client.apis

import okhttp3.MultipartBody
import org.openapitools.client.models.DeleteSavingsAccountsAccountIdResponse
import org.openapitools.client.models.GetSavingsAccountsAccountIdResponse
import org.openapitools.client.models.GetSavingsAccountsResponse
import org.openapitools.client.models.GetSavingsAccountsTemplateResponse
import org.openapitools.client.models.PostSavingsAccountsAccountIdRequest
import org.openapitools.client.models.PostSavingsAccountsAccountIdResponse
import org.openapitools.client.models.PostSavingsAccountsRequest
import org.openapitools.client.models.PostSavingsAccountsResponse
import org.openapitools.client.models.PutSavingsAccountsAccountIdRequest
import org.openapitools.client.models.PutSavingsAccountsAccountIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface SavingsAccountApi {
    /**
     * Delete a savings application
     * At present we support hard delete of savings application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the savings account.
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @return [DeleteSavingsAccountsAccountIdResponse]
     */
    @DELETE("v1/savingsaccounts/{accountId}")
    suspend fun delete19(@Path("accountId") accountId: Long): DeleteSavingsAccountsAccountIdResponse

    /**
     * Delete a savings application
     * At present we support hard delete of savings application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the savings account.
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId
     * @return [DeleteSavingsAccountsAccountIdResponse]
     */
    @DELETE("v1/savingsaccounts/external-id/{externalId}")
    suspend fun delete20(@Path("externalId") externalId: String): DeleteSavingsAccountsAccountIdResponse

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
    @GET("v1/savingsaccounts/downloadtemplate")
    suspend fun getSavingsTemplate(
        @Query("officeId") officeId: Long? = null,
        @Query("staffId") staffId: Long? = null,
        @Query("dateFormat") dateFormat: String? = null
    ): Unit

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
    @GET("v1/savingsaccounts/transactions/downloadtemplate")
    suspend fun getSavingsTransactionTemplate(
        @Query("officeId") officeId: Long? = null,
        @Query("dateFormat") dateFormat: String? = null
    ): Unit

    /**
     * Approve savings application | Undo approval savings application | Assign Savings Officer | Unassign Savings Officer | Reject savings application | Withdraw savings application | Activate a savings account | Close a savings account | Calculate Interest on Savings Account | Post Interest on Savings Account | Block Savings Account | Unblock Savings Account | Block Savings Account Credit transactions | Unblock Savings Account Credit transactions | Block Savings Account Debit transactions | Unblock Savings Account debit transactions
     * Approve savings application:  Approves savings application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval savings application:  Will move &#39;approved&#39; savings application back to &#39;Submitted and pending approval&#39; state.  Assign Savings Officer:  Allows you to assign Savings Officer for existing Savings Account.  Unassign Savings Officer:  Allows you to unassign the Savings Officer.  Reject savings application:  Rejects savings application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw savings application:  Used when an applicant withdraws from the savings application. It must be in &#39;Submitted and pending approval&#39; state.  Activate a savings account:  Results in an approved savings application being converted into an &#39;active&#39; savings account.  Close a savings account:  Results in an Activated savings application being converted into an &#39;closed&#39; savings account.  closedOnDate is closure date of savings account  withdrawBalance is a boolean description, true value of this field performs a withdrawal transaction with account&#39;s running balance.  Mandatory Fields: dateFormat,locale,closedOnDate  Optional Fields: note, withdrawBalance, paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber  Calculate Interest on Savings Account:  Calculates interest earned on a savings account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Savings Account:  Calculates and Posts interest earned on a savings account based on today&#39;s date and whether an interest posting or crediting event is due.  Block Savings Account:  Blocks Savings account from all types of credit and debit transactions  Unblock Savings Account:  Unblock a blocked account. On unblocking account, user can perform debit and credit transactions  Block Savings Account Credit transactions:  Savings account will be blocked from all types of credit transactions.  Unblock Savings Account Credit transactions:  It unblocks the Saving account&#39;s credit operations. Now all types of credits can be transacted to Savings account  Block Savings Account Debit transactions:  All types of debit operations from Savings account wil be blocked  Unblock Savings Account debit transactions:  It unblocks the Saving account&#39;s debit operations. Now all types of debits can be transacted from Savings account  Showing request/response for &#39;Unassign Savings Officer&#39;
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param postSavingsAccountsAccountIdRequest
     * @param command command (optional)
     * @return [PostSavingsAccountsAccountIdResponse]
     */
    @POST("v1/savingsaccounts/{accountId}")
    suspend fun handleCommands6(
        @Path("accountId") accountId: Long,
        @Body postSavingsAccountsAccountIdRequest: PostSavingsAccountsAccountIdRequest,
        @Query("command") command: String? = null
    ): PostSavingsAccountsAccountIdResponse

    /**
     * Approve savings application | Undo approval savings application | Assign Savings Officer | Unassign Savings Officer | Reject savings application | Withdraw savings application | Activate a savings account | Close a savings account | Calculate Interest on Savings Account | Post Interest on Savings Account | Block Savings Account | Unblock Savings Account | Block Savings Account Credit transactions | Unblock Savings Account Credit transactions | Block Savings Account Debit transactions | Unblock Savings Account debit transactions
     * Approve savings application:  Approves savings application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval savings application:  Will move &#39;approved&#39; savings application back to &#39;Submitted and pending approval&#39; state.  Assign Savings Officer:  Allows you to assign Savings Officer for existing Savings Account.  Unassign Savings Officer:  Allows you to unassign the Savings Officer.  Reject savings application:  Rejects savings application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw savings application:  Used when an applicant withdraws from the savings application. It must be in &#39;Submitted and pending approval&#39; state.  Activate a savings account:  Results in an approved savings application being converted into an &#39;active&#39; savings account.  Close a savings account:  Results in an Activated savings application being converted into an &#39;closed&#39; savings account.  closedOnDate is closure date of savings account  withdrawBalance is a boolean description, true value of this field performs a withdrawal transaction with account&#39;s running balance.  Mandatory Fields: dateFormat,locale,closedOnDate  Optional Fields: note, withdrawBalance, paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber  Calculate Interest on Savings Account:  Calculates interest earned on a savings account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Savings Account:  Calculates and Posts interest earned on a savings account based on today&#39;s date and whether an interest posting or crediting event is due.  Block Savings Account:  Blocks Savings account from all types of credit and debit transactions  Unblock Savings Account:  Unblock a blocked account. On unblocking account, user can perform debit and credit transactions  Block Savings Account Credit transactions:  Savings account will be blocked from all types of credit transactions.  Unblock Savings Account Credit transactions:  It unblocks the Saving account&#39;s credit operations. Now all types of credits can be transacted to Savings account  Block Savings Account Debit transactions:  All types of debit operations from Savings account wil be blocked  Unblock Savings Account debit transactions:  It unblocks the Saving account&#39;s debit operations. Now all types of debits can be transacted from Savings account  Showing request/response for &#39;Unassign Savings Officer&#39;
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId
     * @param postSavingsAccountsAccountIdRequest
     * @param command command (optional)
     * @return [PostSavingsAccountsAccountIdResponse]
     */
    @POST("v1/savingsaccounts/external-id/{externalId}")
    suspend fun handleCommands7(
        @Path("externalId") externalId: String,
        @Body postSavingsAccountsAccountIdRequest: PostSavingsAccountsAccountIdRequest,
        @Query("command") command: String? = null
    ): PostSavingsAccountsAccountIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param parentAccountId
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/savingsaccounts/gsimcommands/{parentAccountId}")
    suspend fun handleGSIMCommands(
        @Path("parentAccountId") parentAccountId: Long,
        @Query("command") command: String? = null,
        @Body body: String? = null
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
    @POST("v1/savingsaccounts/uploadtemplate")
    suspend fun postSavingsTemplate(
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
    @POST("v1/savingsaccounts/transactions/uploadtemplate")
    suspend fun postSavingsTransactionTemplate(
        @Part("dateFormat") dateFormat: String? = null,
        @Part("locale") locale: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
    ): String

    /**
     * List savings applications/accounts
     * Lists savings applications/accounts  Example Requests:  savingsaccounts   savingsaccounts?fields&#x3D;name
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [GetSavingsAccountsResponse]
     */
    @GET("v1/savingsaccounts")
    suspend fun retrieveAll33(
        @Query("externalId") externalId: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): GetSavingsAccountsResponse

    /**
     * Retrieve a savings application/account
     * Retrieves a savings application/account  Example Requests :  savingsaccounts/1   savingsaccounts/1?associations&#x3D;all
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param chargeStatus chargeStatus (optional, default to "all")
     * @return [GetSavingsAccountsAccountIdResponse]
     */
    @GET("v1/savingsaccounts/{accountId}")
    suspend fun retrieveOne25(
        @Path("accountId") accountId: Long,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false,
        @Query("chargeStatus") chargeStatus: String? = "all"
    ): GetSavingsAccountsAccountIdResponse

    /**
     * Retrieve a savings application/account by external id
     * Retrieves a savings application/account by external id  Example Requests :  savingsaccounts/external-id/ExternalId1   savingsaccounts/external-id/ExternalId1?associations&#x3D;all
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param chargeStatus chargeStatus (optional, default to "all")
     * @return [GetSavingsAccountsAccountIdResponse]
     */
    @GET("v1/savingsaccounts/external-id/{externalId}")
    suspend fun retrieveOne26(
        @Path("externalId") externalId: String,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false,
        @Query("chargeStatus") chargeStatus: String? = "all"
    ): GetSavingsAccountsAccountIdResponse

    /**
     * Submit new savings application
     * Submits new savings application  Mandatory Fields: clientId or groupId, productId, submittedOnDate  Optional Fields: accountNo, externalId, fieldOfficerId  Inherited from Product (if not provided): nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, allowOverdraft, overdraftLimit, withHoldTax  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type Savings: datatables
     * Responses:
     *  - 200: OK
     *
     * @param postSavingsAccountsRequest
     * @return [PostSavingsAccountsResponse]
     */
    @POST("v1/savingsaccounts")
    suspend fun submitApplication2(@Body postSavingsAccountsRequest: PostSavingsAccountsRequest): PostSavingsAccountsResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/savingsaccounts/gsim")
    suspend fun submitGSIMApplication(@Body body: String? = null): String

    /**
     * Retrieve Savings Account Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  savingsaccounts/template?clientId&#x3D;1   savingsaccounts/template?clientId&#x3D;1&amp;productId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId (optional)
     * @param groupId groupId (optional)
     * @param productId productId (optional)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @return [GetSavingsAccountsTemplateResponse]
     */
    @GET("v1/savingsaccounts/template")
    suspend fun template14(
        @Query("clientId") clientId: Long? = null,
        @Query("groupId") groupId: Long? = null,
        @Query("productId") productId: Long? = null,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false
    ): GetSavingsAccountsTemplateResponse

    /**
     * Modify a savings application | Modify savings account withhold tax applicability
     * Modify a savings application:  Savings application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc  Modify savings account withhold tax applicability:  Savings application&#39;s withhold tax can be modified when in &#39;Active&#39; state. Once the application is activated, can modify the account withhold tax to post tax or vice-versaShowing request/response for &#39;Modify a savings application&#39;
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param putSavingsAccountsAccountIdRequest
     * @param command command (optional)
     * @return [PutSavingsAccountsAccountIdResponse]
     */
    @PUT("v1/savingsaccounts/{accountId}")
    suspend fun update20(
        @Path("accountId") accountId: Long,
        @Body putSavingsAccountsAccountIdRequest: PutSavingsAccountsAccountIdRequest,
        @Query("command") command: String? = null
    ): PutSavingsAccountsAccountIdResponse

    /**
     * Modify a savings application | Modify savings account withhold tax applicability
     * Modify a savings application:  Savings application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc  Modify savings account withhold tax applicability:  Savings application&#39;s withhold tax can be modified when in &#39;Active&#39; state. Once the application is activated, can modify the account withhold tax to post tax or vice-versaShowing request/response for &#39;Modify a savings application&#39;
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId
     * @param putSavingsAccountsAccountIdRequest
     * @param command command (optional)
     * @return [PutSavingsAccountsAccountIdResponse]
     */
    @PUT("v1/savingsaccounts/external-id/{externalId}")
    suspend fun update21(
        @Path("externalId") externalId: String,
        @Body putSavingsAccountsAccountIdRequest: PutSavingsAccountsAccountIdRequest,
        @Query("command") command: String? = null
    ): PutSavingsAccountsAccountIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param parentAccountId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/savingsaccounts/gsim/{parentAccountId}")
    suspend fun updateGsim(
        @Path("parentAccountId") parentAccountId: Long,
        @Body body: String? = null
    ): String

}

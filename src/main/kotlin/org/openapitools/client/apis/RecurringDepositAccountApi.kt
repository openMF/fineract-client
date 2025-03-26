package org.openapitools.client.apis

import okhttp3.MultipartBody
import org.openapitools.client.models.DeleteRecurringDepositAccountsResponse
import org.openapitools.client.models.GetRecurringDepositAccountsAccountIdResponse
import org.openapitools.client.models.GetRecurringDepositAccountsResponse
import org.openapitools.client.models.GetRecurringDepositAccountsTemplateResponse
import org.openapitools.client.models.PostRecurringDepositAccountsAccountIdResponse
import org.openapitools.client.models.PostRecurringDepositAccountsRequest
import org.openapitools.client.models.PostRecurringDepositAccountsResponse
import org.openapitools.client.models.PutRecurringDepositAccountsAccountIdRequest
import org.openapitools.client.models.PutRecurringDepositAccountsAccountIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface RecurringDepositAccountApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param accountId accountId
     * @param command command (optional)
     * @return [kotlin.String]
     */
    @GET("v1/recurringdepositaccounts/{accountId}/template")
    suspend fun accountClosureTemplate1(
        @Path("accountId") accountId: Long,
        @Query("command") command: String? = null
    ): String

    /**
     * Delete a recurring deposit application
     * At present we support hard delete of recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the recurring deposit account.
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @return [DeleteRecurringDepositAccountsResponse]
     */
    @DELETE("v1/recurringdepositaccounts/{accountId}")
    suspend fun delete17(@Path("accountId") accountId: Long): DeleteRecurringDepositAccountsResponse

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
    @GET("v1/recurringdepositaccounts/downloadtemplate")
    suspend fun getRecurringDepositTemplate(
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
    @GET("v1/recurringdepositaccounts/transactions/downloadtemplate")
    suspend fun getRecurringDepositTransactionTemplate(
        @Query("officeId") officeId: Long? = null,
        @Query("dateFormat") dateFormat: String? = null
    ): Unit

    /**
     * Approve recurring deposit application | Undo approval recurring deposit application | Reject recurring deposit application | Withdraw recurring deposit application | Activate a recurring deposit account | Update the recommended deposit amount for a recurring deposit account | Close a recurring deposit account | Premature Close a recurring deposit account | Calculate Premature amount on Recurring deposit account | Calculate Interest on recurring Deposit Account | Post Interest on recurring Deposit Account
     * Approve recurring deposit application:  Approves recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval recurring deposit application:  Will move &#39;approved&#39; recurring deposit application back to &#39;Submitted and pending approval&#39; state.  Reject recurring deposit application  Rejects recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw recurring deposit application:  Used when an applicant withdraws from the recurring deposit application. It must be in &#39;Submitted and pending approval&#39; state.  Activate a recurring deposit account:  Results in an approved recurring deposit application being converted into an &#39;active&#39; recurring deposit account.  Update the recommended deposit amount for a recurring deposit account:  Updates the recommended deposit amount for a RD account as on the effective date.  Close a recurring deposit account  Results in a Matured recurring deposit account being converted into a &#39;closed&#39; recurring deposit account.  On account close allowed actions are.Premature Close a recurring deposit account:  Results in an Active recurring deposit account being converted into a &#39;Premature Closed&#39; recurring deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  On account premature closure allowed actions are.  Calculate Premature amount on Recurring deposit account:  Calculate premature amount on recurring deposit till premature close date. Premature amount is calculated based on interest chart and penal interest applicable if any.  Calculate Interest on recurring Deposit Account:  Calculates interest earned on a recurring deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on recurring Deposit Account:  Calculates and Posts interest earned on a recurring deposit account based on todays date and whether an interest posting or crediting event is due.  Showing request/response for &#39;Post Interest on recurring Deposit Account&#39;
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param body
     * @param command command (optional)
     * @return [PostRecurringDepositAccountsAccountIdResponse]
     */
    @POST("v1/recurringdepositaccounts/{accountId}")
    suspend fun handleCommands5(
        @Path("accountId") accountId: Long,
        @Body body: Any,
        @Query("command") command: String? = null
    ): PostRecurringDepositAccountsAccountIdResponse

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
    @POST("v1/recurringdepositaccounts/uploadtemplate")
    suspend fun postRecurringDepositTemplate(
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
    @POST("v1/recurringdepositaccounts/transactions/uploadtemplate")
    suspend fun postRecurringDepositTransactionsTemplate(
        @Part("dateFormat") dateFormat: String? = null,
        @Part("locale") locale: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
    ): String

    /**
     * List Recurring deposit applications/accounts
     * Lists Recurring deposit applications/accounts  Example Requests:  recurringdepositaccounts   recurringdepositaccounts?fields&#x3D;name
     * Responses:
     *  - 200: OK
     *
     * @param paged paged (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [kotlin.collections.List<GetRecurringDepositAccountsResponse]
     */
    @GET("v1/recurringdepositaccounts")
    suspend fun retrieveAll31(
        @Query("paged") paged: Boolean? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): List<GetRecurringDepositAccountsResponse>

    /**
     * Retrieve a recurring deposit application/account
     * Retrieves a recurring deposit application/account  Example Requests :  recurringdepositaccounts/1   recurringdepositaccounts/1?associations&#x3D;all
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param chargeStatus chargeStatus (optional, default to "all")
     * @return [GetRecurringDepositAccountsAccountIdResponse]
     */
    @GET("v1/recurringdepositaccounts/{accountId}")
    suspend fun retrieveOne22(
        @Path("accountId") accountId: Long,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false,
        @Query("chargeStatus") chargeStatus: String? = "all"
    ): GetRecurringDepositAccountsAccountIdResponse

    /**
     * Submit new recurring deposit application
     * Submits new recurring deposit application  Mandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )  Inherited from Product (if not provided): interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, lockinPeriodFrequency, lockinPeriodFrequencyType, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, charts, withHoldTax
     * Responses:
     *  - 200: OK
     *
     * @param postRecurringDepositAccountsRequest
     * @return [PostRecurringDepositAccountsResponse]
     */
    @POST("v1/recurringdepositaccounts")
    suspend fun submitApplication1(@Body postRecurringDepositAccountsRequest: PostRecurringDepositAccountsRequest): PostRecurringDepositAccountsResponse

    /**
     * Retrieve recurring Deposit Account Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for recurring deposit applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  recurringdepositaccounts/template?clientId&#x3D;1   recurringdepositaccounts/template?clientId&#x3D;1&amp;productId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId (optional)
     * @param groupId groupId (optional)
     * @param productId productId (optional)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @return [GetRecurringDepositAccountsTemplateResponse]
     */
    @GET("v1/recurringdepositaccounts/template")
    suspend fun template13(
        @Query("clientId") clientId: Long? = null,
        @Query("groupId") groupId: Long? = null,
        @Query("productId") productId: Long? = null,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false
    ): GetRecurringDepositAccountsTemplateResponse

    /**
     * Modify a recurring deposit application
     * Recurring deposit application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param putRecurringDepositAccountsAccountIdRequest
     * @return [PutRecurringDepositAccountsAccountIdResponse]
     */
    @PUT("v1/recurringdepositaccounts/{accountId}")
    suspend fun update18(
        @Path("accountId") accountId: Long,
        @Body putRecurringDepositAccountsAccountIdRequest: PutRecurringDepositAccountsAccountIdRequest
    ): PutRecurringDepositAccountsAccountIdResponse

}

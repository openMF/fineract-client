package org.mifos.fineract.services;

import okhttp3.MultipartBody;
import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface RecurringDepositAccountApi {
    /**
     * @param accountId accountId (required)
     * @param command   command (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("recurringdepositaccounts/{accountId}/template")
    Call<String> accountClosureTemplate(
            @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Query("command") String command
    );

    /**
     * Delete a recurring deposit application
     * At present we support hard delete of recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the recurring deposit account.
     *
     * @param accountId accountId (required)
     * @return Call&lt;DeleteRecurringDepositAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("recurringdepositaccounts/{accountId}")
    Call<DeleteRecurringDepositAccountsResponse> delete(
            @retrofit2.http.Path("accountId") Long accountId
    );

    /**
     * @param officeId   (optional)
     * @param staffId    (optional)
     * @param dateFormat (optional)
     * @return Call&lt;Void&gt;
     */
    @GET("recurringdepositaccounts/downloadtemplate")
    Call<Void> getRecurringDepositTemplate(
            @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("dateFormat") String dateFormat
    );

    /**
     * @param officeId   (optional)
     * @param dateFormat (optional)
     * @return Call&lt;Void&gt;
     */
    @GET("recurringdepositaccounts/transactions/downloadtemplate")
    Call<Void> getRecurringDepositTransactionTemplate(
            @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("dateFormat") String dateFormat
    );

    /**
     * Approve recurring deposit application | Undo approval recurring deposit application | Reject recurring deposit application | Withdraw recurring deposit application | Activate a recurring deposit account | Update the recommended deposit amount for a recurring deposit account | Close a recurring deposit account | Premature Close a recurring deposit account | Calculate Premature amount on Recurring deposit account | Calculate Interest on recurring Deposit Account | Post Interest on recurring Deposit Account
     * Approve recurring deposit application:  Approves recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval recurring deposit application:  Will move &#39;approved&#39; recurring deposit application back to &#39;Submitted and pending approval&#39; state.  Reject recurring deposit application  Rejects recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw recurring deposit application:  Used when an applicant withdraws from the recurring deposit application. It must be in &#39;Submitted and pending approval&#39; state.  Activate a recurring deposit account:  Results in an approved recurring deposit application being converted into an &#39;active&#39; recurring deposit account.  Update the recommended deposit amount for a recurring deposit account:  Updates the recommended deposit amount for a RD account as on the effective date.  Close a recurring deposit account  Results in a Matured recurring deposit account being converted into a &#39;closed&#39; recurring deposit account.  On account close allowed actions are.Premature Close a recurring deposit account:  Results in an Active recurring deposit account being converted into a &#39;Premature Closed&#39; recurring deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  On account premature closure allowed actions are.  Calculate Premature amount on Recurring deposit account:  Calculate premature amount on recurring deposit till premature close date. Premature amount is calculated based on interest chart and penal interest applicable if any.  Calculate Interest on recurring Deposit Account:  Calculates interest earned on a recurring deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on recurring Deposit Account:  Calculates and Posts interest earned on a recurring deposit account based on todays date and whether an interest posting or crediting event is due.  Showing request/response for &#39;Post Interest on recurring Deposit Account&#39;
     *
     * @param accountId accountId (required)
     * @param body      body (required)
     * @param command   command (optional)
     * @return Call&lt;PostRecurringDepositAccountsAccountIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("recurringdepositaccounts/{accountId}")
    Call<PostRecurringDepositAccountsAccountIdResponse> handleCommands(
            @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Body PostRecurringDepositAccountsAccountIdRequest body, @retrofit2.http.Query("command") String command
    );

    /**
     * @param file       (optional)
     * @param locale     (optional)
     * @param dateFormat (optional)
     * @return Call&lt;String&gt;
     */
    @retrofit2.http.Multipart
    @POST("recurringdepositaccounts/uploadtemplate")
    Call<String> postRecurringDepositTemplate(
            @retrofit2.http.Part MultipartBody.Part file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
    );

    /**
     * @param file       (optional)
     * @param locale     (optional)
     * @param dateFormat (optional)
     * @return Call&lt;String&gt;
     */
    @retrofit2.http.Multipart
    @POST("recurringdepositaccounts/transactions/uploadtemplate")
    Call<String> postRecurringDepositTransactionsTemplate(
            @retrofit2.http.Part MultipartBody.Part file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
    );

    /**
     * List Recurring deposit applications/accounts
     * Lists Recurring deposit applications/accounts  Example Requests:  recurringdepositaccounts   recurringdepositaccounts?fields&#x3D;name
     *
     * @param paged     paged (optional)
     * @param offset    offset (optional)
     * @param limit     limit (optional)
     * @param orderBy   orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return Call&lt;List&lt;GetRecurringDepositAccountsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("recurringdepositaccounts")
    Call<List<GetRecurringDepositAccountsResponse>> retrieveAll(
            @retrofit2.http.Query("paged") Boolean paged, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
    );

    /**
     * Retrieve a recurring deposit application/account
     * Retrieves a recurring deposit application/account  Example Requests :  recurringdepositaccounts/1   recurringdepositaccounts/1?associations&#x3D;all
     *
     * @param accountId                 accountId (required)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param chargeStatus              chargeStatus (optional, default to all)
     * @return Call&lt;GetRecurringDepositAccountsAccountIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("recurringdepositaccounts/{accountId}")
    Call<GetRecurringDepositAccountsAccountIdResponse> retrieveOne(
            @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly, @retrofit2.http.Query("chargeStatus") String chargeStatus
    );

    /**
     * Submit new recurring deposit application
     * Submits new recurring deposit application  Mandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )  Inherited from Product (if not provided): interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, lockinPeriodFrequency, lockinPeriodFrequencyType, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, charts, withHoldTax
     *
     * @param body body (required)
     * @return Call&lt;PostRecurringDepositAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("recurringdepositaccounts")
    Call<PostRecurringDepositAccountsResponse> submitApplication(
            @retrofit2.http.Body PostRecurringDepositAccountsRequest body
    );

    /**
     * Retrieve recurring Deposit Account Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for recurring deposit applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  recurringdepositaccounts/template?clientId&#x3D;1   recurringdepositaccounts/template?clientId&#x3D;1&amp;productId&#x3D;1
     *
     * @param clientId                  clientId (optional)
     * @param groupId                   groupId (optional)
     * @param productId                 productId (optional)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @return Call&lt;GetRecurringDepositAccountsTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("recurringdepositaccounts/template")
    Call<GetRecurringDepositAccountsTemplateResponse> template(
            @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("groupId") Long groupId, @retrofit2.http.Query("productId") Long productId, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly
    );

    /**
     * Modify a recurring deposit application
     * Recurring deposit application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     *
     * @param accountId accountId (required)
     * @param body      body (required)
     * @return Call&lt;PutRecurringDepositAccountsAccountIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("recurringdepositaccounts/{accountId}")
    Call<PutRecurringDepositAccountsAccountIdResponse> update(
            @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Body PutRecurringDepositAccountsAccountIdRequest body
    );

}

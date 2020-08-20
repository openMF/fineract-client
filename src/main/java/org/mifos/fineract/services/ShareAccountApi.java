package org.mifos.fineract.services;

import okhttp3.MultipartBody;
import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ShareAccountApi {
    /**
     * Submit new share application
     * Submits new share application  Mandatory Fields: clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate  Optional Fields: accountNo, externalId  Inherited from Product (if not provided): minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType
     *
     * @param type type (required)
     * @param body body (required)
     * @return Call&lt;PostAccountsTypeResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("accounts/{type}")
    Call<PostAccountsTypeResponse> createAccount(
            @retrofit2.http.Path("type") String type, @retrofit2.http.Body PostAccountsTypeRequest body
    );

    /**
     * @param officeId   (optional)
     * @param dateFormat (optional)
     * @return Call&lt;Void&gt;
     */
    @GET("accounts/{type}/downloadtemplate")
    Call<Void> getSharedAccountsTemplate(
            @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("dateFormat") String dateFormat
    );

    /**
     * Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account
     * Approve share application:  Approves share application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval share application:  Will move &#39;approved&#39; share application back to &#39;Submitted and pending approval&#39; state.  Reject share application:  Rejects share application so long as its in &#39;Submitted and pending approval&#39; state.  Activate a share account:  Results in an approved share application being converted into an &#39;active&#39; share account.  Close a share account:  Results in an Activated share application being converted into an &#39;closed&#39; share account.  closedDate is closure date of share account  Mandatory Fields: dateFormat,locale,closedDate  Apply additional shares on a share account:  requestedDate is requsted date of share purchase  requestedShares is number of shares to be purchase  Mandatory Fields: dateFormat,locale,requestedDate, requestedShares  Approve additional shares request on a share account  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Reject additional shares request on a share account:  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Redeem shares on a share account:  Results redeem some/all shares from share account.  requestedDate is requsted date of shares redeem  requestedShares is number of shares to be redeemed  Mandatory Fields: dateFormat,locale,requestedDate,requestedShares  Showing request/response for &#39;Reject additional shares request on a share account&#39;  For more info visit this link - https://demo.openmf.org/api-docs/apiLive.htm#shareaccounts
     *
     * @param type      type (required)
     * @param accountId accountId (required)
     * @param body      body (required)
     * @param command   command (optional)
     * @return Call&lt;PostAccountsTypeAccountIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("accounts/{type}/{accountId}")
    Call<PostAccountsTypeAccountIdResponse> handleCommands(
            @retrofit2.http.Path("type") String type, @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Body PostAccountsTypeAccountIdRequest body, @retrofit2.http.Query("command") String command
    );

    /**
     * @param file       (optional)
     * @param locale     (optional)
     * @param dateFormat (optional)
     * @return Call&lt;String&gt;
     */
    @retrofit2.http.Multipart
    @POST("accounts/{type}/uploadtemplate")
    Call<String> postSharedAccountsTemplate(
            @retrofit2.http.Part MultipartBody.Part file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
    );

    /**
     * Retrieve a share application/account
     * Retrieves a share application/account  Example Requests :  shareaccount/1
     *
     * @param accountId accountId (required)
     * @param type      type (required)
     * @return Call&lt;GetAccountsTypeAccountIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accounts/{type}/{accountId}")
    Call<GetAccountsTypeAccountIdResponse> retrieveAccount(
            @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Path("type") String type
    );

    /**
     * List share applications/accounts
     * Lists share applications/accounts  Example Requests:  shareaccount
     *
     * @param type   type (required)
     * @param offset offset (optional)
     * @param limit  limit (optional)
     * @return Call&lt;GetAccountsTypeResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accounts/{type}")
    Call<GetAccountsTypeResponse> retrieveAllAccounts(
            @retrofit2.http.Path("type") String type, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
    );

    /**
     * Retrieve Share Account Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  accounts/share/template?clientId&#x3D;1   accounts/share/template?clientId&#x3D;1&amp;productId&#x3D;1
     *
     * @param type      type (required)
     * @param clientId  clientId (optional)
     * @param productId productId (optional)
     * @return Call&lt;GetAccountsTypeTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accounts/{type}/template")
    Call<GetAccountsTypeTemplateResponse> template(
            @retrofit2.http.Path("type") String type, @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("productId") Long productId
    );

    /**
     * Modify a share application
     * Share application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     *
     * @param type      type (required)
     * @param accountId accountId (required)
     * @param body      body (required)
     * @return Call&lt;PutAccountsTypeAccountIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("accounts/{type}/{accountId}")
    Call<PutAccountsTypeAccountIdResponse> updateAccount(
            @retrofit2.http.Path("type") String type, @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Body PutAccountsTypeAccountIdRequest body
    );

}

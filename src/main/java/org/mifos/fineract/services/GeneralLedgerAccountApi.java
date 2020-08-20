package org.mifos.fineract.services;

import okhttp3.MultipartBody;
import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface GeneralLedgerAccountApi {
    /**
     * Create a General Ledger Account
     * Note: You may optionally create Hierarchical Chart of Accounts by using the \&quot;parentId\&quot; property of an Account Mandatory Fields:  name, glCode, type, usage and manualEntriesAllowed
     *
     * @param body body (optional)
     * @return Call&lt;PostGLAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("glaccounts")
    Call<PostGLAccountsResponse> createGLAccount(
            @retrofit2.http.Body PostGLAccountsRequest body
    );

    /**
     * Delete an accounting closure
     * Note: Only the latest accounting closure associated with a branch may be deleted.
     *
     * @param glAccountId glAccountId (required)
     * @return Call&lt;DeleteGLAccountsRequest&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("glaccounts/{glAccountId}")
    Call<DeleteGLAccountsRequest> deleteGLAccount(
            @retrofit2.http.Path("glAccountId") Long glAccountId
    );

    /**
     * @param dateFormat (optional)
     * @return Call&lt;Void&gt;
     */
    @GET("glaccounts/downloadtemplate")
    Call<Void> getGlAccountsTemplate(
            @retrofit2.http.Query("dateFormat") String dateFormat
    );

    /**
     * @param file       (optional)
     * @param locale     (optional)
     * @param dateFormat (optional)
     * @return Call&lt;String&gt;
     */
    @retrofit2.http.Multipart
    @POST("glaccounts/uploadtemplate")
    Call<String> postGlAccountsTemplate(
            @retrofit2.http.Part MultipartBody.Part file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
    );

    /**
     * Retrieve a General Ledger Account
     * Example Requests:  glaccounts/1   glaccounts/1?template&#x3D;true   glaccounts/1?fields&#x3D;name,glCode   glaccounts/1?fetchRunningBalance&#x3D;true
     *
     * @param glAccountId         glAccountId (required)
     * @param fetchRunningBalance fetchRunningBalance (optional)
     * @return Call&lt;GetGLAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("glaccounts/{glAccountId}")
    Call<GetGLAccountsResponse> retreiveAccount(
            @retrofit2.http.Path("glAccountId") Long glAccountId, @retrofit2.http.Query("fetchRunningBalance") Boolean fetchRunningBalance
    );

    /**
     * List General Ledger Accounts
     * ARGUMENTS type Integer optional manualEntriesAllowed boolean optional usage Integer optional disabled boolean optional parentId Long optional tagId Long optional Example Requests:  glaccounts   glaccounts?type&#x3D;1&amp;manualEntriesAllowed&#x3D;true&amp;usage&#x3D;1&amp;disabled&#x3D;false  glaccounts?fetchRunningBalance&#x3D;true
     *
     * @param type                 type (optional)
     * @param searchParam          searchParam (optional)
     * @param usage                usage (optional)
     * @param manualEntriesAllowed manualEntriesAllowed (optional)
     * @param disabled             disabled (optional)
     * @param fetchRunningBalance  fetchRunningBalance (optional)
     * @return Call&lt;List&lt;GetGLAccountsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("glaccounts")
    Call<List<GetGLAccountsResponse>> retrieveAllAccounts(
            @retrofit2.http.Query("type") Integer type, @retrofit2.http.Query("searchParam") String searchParam, @retrofit2.http.Query("usage") Integer usage, @retrofit2.http.Query("manualEntriesAllowed") Boolean manualEntriesAllowed, @retrofit2.http.Query("disabled") Boolean disabled, @retrofit2.http.Query("fetchRunningBalance") Boolean fetchRunningBalance
    );

    /**
     * Retrieve GL Accounts Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  glaccounts/template glaccounts/template?type&#x3D;1  type is optional and integer value from 1 to 5.  1.Assets  2.Liabilities  3.Equity  4.Income  5.Expenses
     *
     * @param type type (optional)
     * @return Call&lt;GetGLAccountsTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("glaccounts/template")
    Call<GetGLAccountsTemplateResponse> retrieveNewAccountDetails(
            @retrofit2.http.Query("type") Integer type
    );

    /**
     * Update an Accounting closure
     * Once an accounting closure is created, only the comments associated with it may be edited
     *
     * @param glAccountId glAccountId (required)
     * @param body        body (optional)
     * @return Call&lt;PutGLAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("glaccounts/{glAccountId}")
    Call<PutGLAccountsResponse> updateGLAccount(
            @retrofit2.http.Path("glAccountId") Long glAccountId, @retrofit2.http.Body PutGLAccountsRequest body
    );

}

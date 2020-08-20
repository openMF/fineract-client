package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface MappingFinancialActivitiesToAccountsApi {
    /**
     * Create a new Financial Activity to Accounts Mapping
     * Mandatory Fields financialActivityId, glAccountId
     *
     * @param body Request body (optional)
     * @return Call&lt;PostFinancialActivityAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("financialactivityaccounts")
    Call<PostFinancialActivityAccountsResponse> createGLAccount(
            @retrofit2.http.Body PostFinancialActivityAccountsRequest body
    );

    /**
     * Delete a Financial Activity to Account Mapping
     *
     * @param mappingId mappingId (required)
     * @return Call&lt;DeleteFinancialActivityAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("financialactivityaccounts/{mappingId}")
    Call<DeleteFinancialActivityAccountsResponse> deleteGLAccount(
            @retrofit2.http.Path("mappingId") Long mappingId
    );

    /**
     * Retrieve a Financial Activity to Account Mapping
     * Example Requests:  financialactivityaccounts/1
     *
     * @param mappingId mappingId (required)
     * @return Call&lt;GetFinancialActivityAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("financialactivityaccounts/{mappingId}")
    Call<GetFinancialActivityAccountsResponse> retreive(
            @retrofit2.http.Path("mappingId") Long mappingId
    );

    /**
     * List Financial Activities to Accounts Mappings
     * Example Requests:  financialactivityaccounts
     *
     * @return Call&lt;List&lt;GetFinancialActivityAccountsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("financialactivityaccounts")
    Call<List<GetFinancialActivityAccountsResponse>> retrieveAll();


    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("financialactivityaccounts/template")
    Call<String> retrieveTemplate();


    /**
     * Update a Financial Activity to Account Mapping
     * the API updates the Ledger account linked to a Financial Activity
     *
     * @param mappingId mappingId (required)
     * @param body      Request body (optional)
     * @return Call&lt;PutFinancialActivityAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("financialactivityaccounts/{mappingId}")
    Call<PutFinancialActivityAccountsResponse> updateGLAccount(
            @retrofit2.http.Path("mappingId") Long mappingId, @retrofit2.http.Body PostFinancialActivityAccountsRequest body
    );

}

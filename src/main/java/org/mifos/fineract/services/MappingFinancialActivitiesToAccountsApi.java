package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface MappingFinancialActivitiesToAccountsApi {
    /**
     * Create a new Financial Activity to Accounts Mapping
     * Mandatory Fields financialActivityId, glAccountId
     *
     * @param body Request body (optional)
     * @return Observable&lt;PostFinancialActivityAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("financialactivityaccounts")
    Observable<PostFinancialActivityAccountsResponse> createGLAccount(
            @retrofit2.http.Body PostFinancialActivityAccountsRequest body
    );

    /**
     * Delete a Financial Activity to Account Mapping
     *
     * @param mappingId mappingId (required)
     * @return Observable&lt;DeleteFinancialActivityAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("financialactivityaccounts/{mappingId}")
    Observable<DeleteFinancialActivityAccountsResponse> deleteGLAccount(
            @retrofit2.http.Path("mappingId") Long mappingId
    );

    /**
     * Retrieve a Financial Activity to Account Mapping
     * Example Requests:  financialactivityaccounts/1
     *
     * @param mappingId mappingId (required)
     * @return Observable&lt;GetFinancialActivityAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("financialactivityaccounts/{mappingId}")
    Observable<GetFinancialActivityAccountsResponse> retreive(
            @retrofit2.http.Path("mappingId") Long mappingId
    );

    /**
     * List Financial Activities to Accounts Mappings
     * Example Requests:  financialactivityaccounts
     *
     * @return Observable&lt;List&lt;GetFinancialActivityAccountsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("financialactivityaccounts")
    Observable<List<GetFinancialActivityAccountsResponse>> retrieveAll();


    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("financialactivityaccounts/template")
    Observable<String> retrieveTemplate();


    /**
     * Update a Financial Activity to Account Mapping
     * the API updates the Ledger account linked to a Financial Activity
     *
     * @param mappingId mappingId (required)
     * @param body      Request body (optional)
     * @return Observable&lt;PutFinancialActivityAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("financialactivityaccounts/{mappingId}")
    Observable<PutFinancialActivityAccountsResponse> updateGLAccount(
            @retrofit2.http.Path("mappingId") Long mappingId, @retrofit2.http.Body PostFinancialActivityAccountsRequest body
    );

}

package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

import java.util.List;

public interface TaxComponentsApi {
    /**
     * Create a new Tax Component
     * Creates a new Tax Component  Mandatory Fields: name, percentage  Optional Fields: debitAccountType, debitAcountId, creditAccountType, creditAcountId, startDate
     *
     * @param body body (required)
     * @return Observable&lt;PostTaxesComponentsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("taxes/component")
    Observable<PostTaxesComponentsResponse> createTaxCompoent(
            @retrofit2.http.Body PostTaxesComponentsRequest body
    );

    /**
     * List Tax Components
     * List Tax Components
     *
     * @return Observable&lt;List&lt;GetTaxesComponentsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("taxes/component")
    Observable<List<GetTaxesComponentsResponse>> retrieveAllTaxComponents();


    /**
     * Retrieve Tax Component
     * Retrieve Tax Component
     *
     * @param taxComponentId taxComponentId (required)
     * @return Observable&lt;GetTaxesComponentsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("taxes/component/{taxComponentId}")
    Observable<GetTaxesComponentsResponse> retrieveTaxComponent(
            @retrofit2.http.Path("taxComponentId") Long taxComponentId
    );

    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("taxes/component/template")
    Observable<String> retrieveTemplate();


    /**
     * Update Tax Component
     * Updates Tax component. Debit and credit account details cannot be modified. All the future tax components would be replaced with the new percentage.
     *
     * @param taxComponentId taxComponentId (required)
     * @param body           body (required)
     * @return Observable&lt;PutTaxesComponentsTaxComponentIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("taxes/component/{taxComponentId}")
    Observable<PutTaxesComponentsTaxComponentIdResponse> updateTaxCompoent(
            @retrofit2.http.Path("taxComponentId") Long taxComponentId, @retrofit2.http.Body PutTaxesComponentsTaxComponentIdRequest body
    );

}

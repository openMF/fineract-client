package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

import java.util.List;

public interface TaxGroupApi {
    /**
     * Create a new Tax Group
     * Create a new Tax Group Mandatory Fields: name and taxComponents Mandatory Fields in taxComponents: taxComponentId Optional Fields in taxComponents: id, startDate and endDate
     *
     * @param body body (required)
     * @return Call&lt;PostTaxesGroupResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("taxes/group")
    Call<PostTaxesGroupResponse> createTaxGroup(
            @retrofit2.http.Body PostTaxesGroupRequest body
    );

    /**
     * List Tax Group
     * List Tax Group
     *
     * @return Call&lt;List&lt;GetTaxesGroupResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("taxes/group")
    Call<List<GetTaxesGroupResponse>> retrieveAllTaxGroups();


    /**
     * Retrieve Tax Group
     * Retrieve Tax Group
     *
     * @param taxGroupId taxGroupId (required)
     * @return Call&lt;GetTaxesGroupResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("taxes/group/{taxGroupId}")
    Call<GetTaxesGroupResponse> retrieveTaxGroup(
            @retrofit2.http.Path("taxGroupId") Long taxGroupId
    );

    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("taxes/group/template")
    Call<String> retrieveTemplate();


    /**
     * Update Tax Group
     * Updates Tax Group. Only end date can be up-datable and can insert new tax components.
     *
     * @param taxGroupId taxGroupId (required)
     * @param body       body (required)
     * @return Call&lt;PutTaxesGroupTaxGroupIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("taxes/group/{taxGroupId}")
    Call<PutTaxesGroupTaxGroupIdResponse> updateTaxGroup(
            @retrofit2.http.Path("taxGroupId") Long taxGroupId, @retrofit2.http.Body PutTaxesGroupTaxGroupIdRequest body
    );

}

package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ChargesApi {
    /**
     * Create/Define a Charge
     * Define a new charge that can later be associated with loans and savings through their respective product definitions or directly on each account instance.
     *
     * @param body body (required)
     * @return Call&lt;PostChargesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("charges")
    Call<PostChargesResponse> createCharge(
            @retrofit2.http.Body PostChargesRequest body
    );

    /**
     * Delete a Charge
     * Deletes a Charge.
     *
     * @param chargeId chargeId (required)
     * @return Call&lt;DeleteChargesChargeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("charges/{chargeId}")
    Call<DeleteChargesChargeIdResponse> deleteCharge(
            @retrofit2.http.Path("chargeId") Long chargeId
    );

    /**
     * Retrieve Charges
     * Returns the list of defined charges.  Example Requests:  charges
     *
     * @return Call&lt;List&lt;GetChargesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("charges")
    Call<List<GetChargesResponse>> retrieveAllCharges();


    /**
     * Retrieve a Charge
     * Returns the details of a defined Charge.  Example Requests:  charges/1
     *
     * @param chargeId chargeId (required)
     * @return Call&lt;GetChargesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("charges/{chargeId}")
    Call<GetChargesResponse> retrieveCharge(
            @retrofit2.http.Path("chargeId") Long chargeId
    );

    /**
     * Retrieve Charge Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  charges/template
     *
     * @return Call&lt;GetChargesTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("charges/template")
    Call<GetChargesTemplateResponse> retrieveNewChargeDetails();


    /**
     * Update a Charge
     * Updates the details of a Charge.
     *
     * @param chargeId chargeId (required)
     * @param body     body (required)
     * @return Call&lt;PutChargesChargeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("charges/{chargeId}")
    Call<PutChargesChargeIdResponse> updateCharge(
            @retrofit2.http.Path("chargeId") Long chargeId, @retrofit2.http.Body PutChargesChargeIdRequest body
    );

}

package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

import java.util.List;

public interface FloatingRatesApi {
    /**
     * Create a new Floating Rate
     * Creates a new Floating Rate Mandatory Fields: name Optional Fields: isBaseLendingRate, isActive, ratePeriods
     *
     * @param body body (required)
     * @return Call&lt;PostFloatingRatesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("floatingrates")
    Call<PostFloatingRatesResponse> createFloatingRate(
            @retrofit2.http.Body PostFloatingRatesRequest body
    );

    /**
     * List Floating Rates
     * Lists Floating Rates
     *
     * @return Call&lt;List&lt;GetFloatingRatesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("floatingrates")
    Call<List<GetFloatingRatesResponse>> retrieveAll();


    /**
     * Retrieve Floating Rate
     * Retrieves Floating Rate
     *
     * @param floatingRateId floatingRateId (required)
     * @return Call&lt;GetFloatingRatesFloatingRateIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("floatingrates/{floatingRateId}")
    Call<GetFloatingRatesFloatingRateIdResponse> retrieveOne(
            @retrofit2.http.Path("floatingRateId") Long floatingRateId
    );

    /**
     * Update Floating Rate
     * Updates new Floating Rate. Rate Periods in the past cannot be modified. All the future rateperiods would be replaced with the new ratePeriods data sent.
     *
     * @param floatingRateId floatingRateId (required)
     * @param body           body (required)
     * @return Call&lt;PutFloatingRatesFloatingRateIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("floatingrates/{floatingRateId}")
    Call<PutFloatingRatesFloatingRateIdResponse> updateFloatingRate(
            @retrofit2.http.Path("floatingRateId") Long floatingRateId, @retrofit2.http.Body PutFloatingRatesFloatingRateIdRequest body
    );

}

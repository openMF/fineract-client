package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

import java.util.List;

public interface FloatingRatesApi {
    /**
     * Create a new Floating Rate
     * Creates a new Floating Rate Mandatory Fields: name Optional Fields: isBaseLendingRate, isActive, ratePeriods
     *
     * @param body body (required)
     * @return Observable&lt;PostFloatingRatesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("floatingrates")
    Observable<PostFloatingRatesResponse> createFloatingRate(
            @retrofit2.http.Body PostFloatingRatesRequest body
    );

    /**
     * List Floating Rates
     * Lists Floating Rates
     *
     * @return Observable&lt;List&lt;GetFloatingRatesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("floatingrates")
    Observable<List<GetFloatingRatesResponse>> retrieveAll();


    /**
     * Retrieve Floating Rate
     * Retrieves Floating Rate
     *
     * @param floatingRateId floatingRateId (required)
     * @return Observable&lt;GetFloatingRatesFloatingRateIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("floatingrates/{floatingRateId}")
    Observable<GetFloatingRatesFloatingRateIdResponse> retrieveOne(
            @retrofit2.http.Path("floatingRateId") Long floatingRateId
    );

    /**
     * Update Floating Rate
     * Updates new Floating Rate. Rate Periods in the past cannot be modified. All the future rateperiods would be replaced with the new ratePeriods data sent.
     *
     * @param floatingRateId floatingRateId (required)
     * @param body           body (required)
     * @return Observable&lt;PutFloatingRatesFloatingRateIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("floatingrates/{floatingRateId}")
    Observable<PutFloatingRatesFloatingRateIdResponse> updateFloatingRate(
            @retrofit2.http.Path("floatingRateId") Long floatingRateId, @retrofit2.http.Body PutFloatingRatesFloatingRateIdRequest body
    );

}

package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface InterestRateSlabAKAInterestBandsApi {
    /**
     * Create a Slab
     * Creates a new interest rate slab for an interest rate chart. Mandatory Fields periodType, fromPeriod, annualInterestRate Optional Fields toPeriod and description Example Requests:  interestratecharts/1/chartslabs
     *
     * @param chartId chartId (required)
     * @param body    body (required)
     * @return Observable&lt;PostInterestRateChartsChartIdChartSlabsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("interestratecharts/{chartId}/chartslabs")
    Observable<PostInterestRateChartsChartIdChartSlabsResponse> create(
            @retrofit2.http.Path("chartId") Long chartId, @retrofit2.http.Body PostInterestRateChartsChartIdChartSlabsRequest body
    );

    /**
     * Delete a Slab
     * Delete a Slab from a chart
     *
     * @param chartId     chartId (required)
     * @param chartSlabId chartSlabId (required)
     * @return Observable&lt;DeleteInterestRateChartsChartIdChartSlabsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("interestratecharts/{chartId}/chartslabs/{chartSlabId}")
    Observable<DeleteInterestRateChartsChartIdChartSlabsResponse> delete(
            @retrofit2.http.Path("chartId") Long chartId, @retrofit2.http.Path("chartSlabId") Long chartSlabId
    );

    /**
     * Retrieve all Slabs
     * Retrieve list of slabs associated with a chart  Example Requests:  interestratecharts/1/chartslabs
     *
     * @param chartId chartId (required)
     * @return Observable&lt;List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interestratecharts/{chartId}/chartslabs")
    Observable<List<GetInterestRateChartsChartIdChartSlabsResponse>> retrieveAll(
            @retrofit2.http.Path("chartId") Long chartId
    );

    /**
     * Retrieve a Slab
     * Retrieve a slab associated with an Interest rate chart  Example Requests:  interestratecharts/1/chartslabs/1
     *
     * @param chartId     chartId (required)
     * @param chartSlabId chartSlabId (required)
     * @return Observable&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interestratecharts/{chartId}/chartslabs/{chartSlabId}")
    Observable<GetInterestRateChartsChartIdChartSlabsResponse> retrieveOne(
            @retrofit2.http.Path("chartId") Long chartId, @retrofit2.http.Path("chartSlabId") Long chartSlabId
    );

    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interestratecharts/{chartId}/chartslabs/template")
    Observable<String> template();


    /**
     * Update a Slab
     * It updates the Slab from chart
     *
     * @param chartId     chartId (required)
     * @param chartSlabId chartSlabId (required)
     * @param body        body (required)
     * @return Observable&lt;PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("interestratecharts/{chartId}/chartslabs/{chartSlabId}")
    Observable<PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse> update(
            @retrofit2.http.Path("chartId") Long chartId, @retrofit2.http.Path("chartSlabId") Long chartSlabId, @retrofit2.http.Body PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest body
    );

}

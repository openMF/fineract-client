package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface InterestRateChartApi {
    /**
     * Create a Chart
     * Creates a new chart which can be attached to a term deposit products (FD or RD).
     *
     * @param body body (required)
     * @return Observable&lt;PostInterestRateChartsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("interestratecharts")
    Observable<PostInterestRateChartsResponse> create(
            @retrofit2.http.Body PostInterestRateChartsRequest body
    );

    /**
     * Delete a Chart
     * It deletes the chart
     *
     * @param chartId chartId (required)
     * @return Observable&lt;DeleteInterestRateChartsChartIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("interestratecharts/{chartId}")
    Observable<DeleteInterestRateChartsChartIdResponse> delete(
            @retrofit2.http.Path("chartId") Long chartId
    );

    /**
     * Retrieve all Charts
     * Retrieve list of charts associated with a term deposit product(FD or RD). Example Requests:  interestratecharts?productId&#x3D;1
     *
     * @param productId productId (optional)
     * @return Observable&lt;List&lt;GetInterestRateChartsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interestratecharts")
    Observable<List<GetInterestRateChartsResponse>> retrieveAll(
            @retrofit2.http.Query("productId") Long productId
    );

    /**
     * Retrieve a Chart
     * It retrieves the Interest Rate Chart Example Requests:  interestratecharts/1
     *
     * @param chartId chartId (required)
     * @return Observable&lt;GetInterestRateChartsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interestratecharts/{chartId}")
    Observable<GetInterestRateChartsResponse> retrieveOne(
            @retrofit2.http.Path("chartId") Long chartId
    );

    /**
     * Retrieve Chart Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for creating a chart. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  interestratecharts/template
     *
     * @return Observable&lt;GetInterestRateChartsTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interestratecharts/template")
    Observable<GetInterestRateChartsTemplateResponse> template();


    /**
     * Update a Chart
     * It updates the Chart.
     *
     * @param chartId chartId (required)
     * @param body    body (required)
     * @return Observable&lt;PutInterestRateChartsChartIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("interestratecharts/{chartId}")
    Observable<PutInterestRateChartsChartIdResponse> update(
            @retrofit2.http.Path("chartId") Long chartId, @retrofit2.http.Body PutInterestRateChartsChartIdRequest body
    );

}

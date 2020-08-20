package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface InterestRateChartApi {
    /**
     * Create a Chart
     * Creates a new chart which can be attached to a term deposit products (FD or RD).
     *
     * @param body body (required)
     * @return Call&lt;PostInterestRateChartsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("interestratecharts")
    Call<PostInterestRateChartsResponse> create(
            @retrofit2.http.Body PostInterestRateChartsRequest body
    );

    /**
     * Delete a Chart
     * It deletes the chart
     *
     * @param chartId chartId (required)
     * @return Call&lt;DeleteInterestRateChartsChartIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("interestratecharts/{chartId}")
    Call<DeleteInterestRateChartsChartIdResponse> delete(
            @retrofit2.http.Path("chartId") Long chartId
    );

    /**
     * Retrieve all Charts
     * Retrieve list of charts associated with a term deposit product(FD or RD). Example Requests:  interestratecharts?productId&#x3D;1
     *
     * @param productId productId (optional)
     * @return Call&lt;List&lt;GetInterestRateChartsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interestratecharts")
    Call<List<GetInterestRateChartsResponse>> retrieveAll(
            @retrofit2.http.Query("productId") Long productId
    );

    /**
     * Retrieve a Chart
     * It retrieves the Interest Rate Chart Example Requests:  interestratecharts/1
     *
     * @param chartId chartId (required)
     * @return Call&lt;GetInterestRateChartsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interestratecharts/{chartId}")
    Call<GetInterestRateChartsResponse> retrieveOne(
            @retrofit2.http.Path("chartId") Long chartId
    );

    /**
     * Retrieve Chart Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for creating a chart. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  interestratecharts/template
     *
     * @return Call&lt;GetInterestRateChartsTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interestratecharts/template")
    Call<GetInterestRateChartsTemplateResponse> template();


    /**
     * Update a Chart
     * It updates the Chart.
     *
     * @param chartId chartId (required)
     * @param body    body (required)
     * @return Call&lt;PutInterestRateChartsChartIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("interestratecharts/{chartId}")
    Call<PutInterestRateChartsChartIdResponse> update(
            @retrofit2.http.Path("chartId") Long chartId, @retrofit2.http.Body PutInterestRateChartsChartIdRequest body
    );

}

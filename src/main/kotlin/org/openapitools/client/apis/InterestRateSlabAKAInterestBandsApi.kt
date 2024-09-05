package org.openapitools.client.apis

import org.openapitools.client.models.DeleteInterestRateChartsChartIdChartSlabsResponse
import org.openapitools.client.models.GetInterestRateChartsChartIdChartSlabsResponse
import org.openapitools.client.models.PostInterestRateChartsChartIdChartSlabsRequest
import org.openapitools.client.models.PostInterestRateChartsChartIdChartSlabsResponse
import org.openapitools.client.models.PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest
import org.openapitools.client.models.PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface InterestRateSlabAKAInterestBandsApi {
    /**
     * Create a Slab
     * Creates a new interest rate slab for an interest rate chart. Mandatory Fields periodType, fromPeriod, annualInterestRate Optional Fields toPeriod and description Example Requests:  interestratecharts/1/chartslabs
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @param postInterestRateChartsChartIdChartSlabsRequest
     * @return [PostInterestRateChartsChartIdChartSlabsResponse]
     */
    @POST("v1/interestratecharts/{chartId}/chartslabs")
    suspend fun create9(
        @Path("chartId") chartId: Long,
        @Body postInterestRateChartsChartIdChartSlabsRequest: PostInterestRateChartsChartIdChartSlabsRequest
    ): PostInterestRateChartsChartIdChartSlabsResponse

    /**
     * Delete a Slab
     * Delete a Slab from a chart
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @param chartSlabId chartSlabId
     * @return [DeleteInterestRateChartsChartIdChartSlabsResponse]
     */
    @DELETE("v1/interestratecharts/{chartId}/chartslabs/{chartSlabId}")
    suspend fun delete13(
        @Path("chartId") chartId: Long,
        @Path("chartSlabId") chartSlabId: Long
    ): DeleteInterestRateChartsChartIdChartSlabsResponse

    /**
     * Retrieve all Slabs
     * Retrieve list of slabs associated with a chart  Example Requests:  interestratecharts/1/chartslabs
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @return [kotlin.collections.List<GetInterestRateChartsChartIdChartSlabsResponse]
     */
    @GET("v1/interestratecharts/{chartId}/chartslabs")
    suspend fun retrieveAll25(@Path("chartId") chartId: Long): List<GetInterestRateChartsChartIdChartSlabsResponse>

    /**
     * Retrieve a Slab
     * Retrieve a slab associated with an Interest rate chart  Example Requests:  interestratecharts/1/chartslabs/1
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @param chartSlabId chartSlabId
     * @return [GetInterestRateChartsChartIdChartSlabsResponse]
     */
    @GET("v1/interestratecharts/{chartId}/chartslabs/{chartSlabId}")
    suspend fun retrieveOne16(
        @Path("chartId") chartId: Long,
        @Path("chartSlabId") chartSlabId: Long
    ): GetInterestRateChartsChartIdChartSlabsResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param chartId chartId
     * @return [kotlin.String]
     */
    @GET("v1/interestratecharts/{chartId}/chartslabs/template")
    suspend fun template8(@Path("chartId") chartId: Long): String

    /**
     * Update a Slab
     * It updates the Slab from chart
     * Responses:
     *  - 200: OK
     *
     * @param chartId chartId
     * @param chartSlabId chartSlabId
     * @param putInterestRateChartsChartIdChartSlabsChartSlabIdRequest
     * @return [PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse]
     */
    @PUT("v1/interestratecharts/{chartId}/chartslabs/{chartSlabId}")
    suspend fun update14(
        @Path("chartId") chartId: Long,
        @Path("chartSlabId") chartSlabId: Long,
        @Body putInterestRateChartsChartIdChartSlabsChartSlabIdRequest: PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest
    ): PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse

}

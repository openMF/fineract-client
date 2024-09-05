package org.openapitools.client.apis

import org.openapitools.client.models.GetFloatingRatesFloatingRateIdResponse
import org.openapitools.client.models.GetFloatingRatesResponse
import org.openapitools.client.models.PostFloatingRatesRequest
import org.openapitools.client.models.PostFloatingRatesResponse
import org.openapitools.client.models.PutFloatingRatesFloatingRateIdRequest
import org.openapitools.client.models.PutFloatingRatesFloatingRateIdResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface FloatingRatesApi {
    /**
     * Create a new Floating Rate
     * Creates a new Floating Rate Mandatory Fields: name Optional Fields: isBaseLendingRate, isActive, ratePeriods
     * Responses:
     *  - 200: OK
     *
     * @param postFloatingRatesRequest
     * @return [PostFloatingRatesResponse]
     */
    @POST("v1/floatingrates")
    suspend fun createFloatingRate(@Body postFloatingRatesRequest: PostFloatingRatesRequest): PostFloatingRatesResponse

    /**
     * List Floating Rates
     * Lists Floating Rates
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetFloatingRatesResponse]
     */
    @GET("v1/floatingrates")
    suspend fun retrieveAll22(): List<GetFloatingRatesResponse>

    /**
     * Retrieve Floating Rate
     * Retrieves Floating Rate
     * Responses:
     *  - 200: OK
     *
     * @param floatingRateId floatingRateId
     * @return [GetFloatingRatesFloatingRateIdResponse]
     */
    @GET("v1/floatingrates/{floatingRateId}")
    suspend fun retrieveOne13(@Path("floatingRateId") floatingRateId: Long): GetFloatingRatesFloatingRateIdResponse

    /**
     * Update Floating Rate
     * Updates new Floating Rate. Rate Periods in the past cannot be modified. All the future rateperiods would be replaced with the new ratePeriods data sent.
     * Responses:
     *  - 200: OK
     *
     * @param floatingRateId floatingRateId
     * @param putFloatingRatesFloatingRateIdRequest
     * @return [PutFloatingRatesFloatingRateIdResponse]
     */
    @PUT("v1/floatingrates/{floatingRateId}")
    suspend fun updateFloatingRate(
        @Path("floatingRateId") floatingRateId: Long,
        @Body putFloatingRatesFloatingRateIdRequest: PutFloatingRatesFloatingRateIdRequest
    ): PutFloatingRatesFloatingRateIdResponse

}

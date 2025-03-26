package org.openapitools.client.apis

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path


interface RateApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/rates")
    suspend fun createRate(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/rates")
    suspend fun getAllRates(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param rateId
     * @return [kotlin.String]
     */
    @GET("v1/rates/{rateId}")
    suspend fun retrieveRate(@Path("rateId") rateId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param rateId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/rates/{rateId}")
    suspend fun updateRate(
        @Path("rateId") rateId: Long,
        @Body body: String? = null
    ): String

}

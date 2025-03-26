package org.openapitools.client.apis

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query


interface TwoFactorApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/twofactor")
    suspend fun getOTPDeliveryMethods(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param deliveryMethod  (optional)
     * @param extendedToken  (optional, default to false)
     * @return [kotlin.String]
     */
    @POST("v1/twofactor")
    suspend fun requestToken(
        @Query("deliveryMethod") deliveryMethod: String? = null,
        @Query("extendedToken") extendedToken: Boolean? = false
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/twofactor/invalidate")
    suspend fun updateConfiguration2(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param token  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/twofactor/validate")
    suspend fun validate(@Query("token") token: String? = null): String

}

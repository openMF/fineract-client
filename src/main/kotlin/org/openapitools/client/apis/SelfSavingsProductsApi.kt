package org.openapitools.client.apis

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface SelfSavingsProductsApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/savingsproducts")
    suspend fun retrieveAll38(@Query("clientId") clientId: Long? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @param clientId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/savingsproducts/{productId}")
    suspend fun retrieveOne29(
        @Path("productId") productId: Long,
        @Query("clientId") clientId: Long? = null
    ): String

}

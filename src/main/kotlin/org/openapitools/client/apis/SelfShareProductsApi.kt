package org.openapitools.client.apis

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface SelfShareProductsApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/products/share")
    suspend fun retrieveAllProducts1(
        @Query("clientId") clientId: Long? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @param type
     * @param clientId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/products/share/{productId}")
    suspend fun retrieveProduct1(
        @Path("productId") productId: Long,
        @Path("type") type: String,
        @Query("clientId") clientId: Long? = null
    ): String

}

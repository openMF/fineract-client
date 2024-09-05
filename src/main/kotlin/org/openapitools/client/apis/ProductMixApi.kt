package org.openapitools.client.apis

import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path


interface ProductMixApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/loanproducts/{productId}/productmix")
    suspend fun createProductMix(
        @Path("productId") productId: Long,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @return [kotlin.String]
     */
    @DELETE("v1/loanproducts/{productId}/productmix")
    suspend fun deleteProductMix(@Path("productId") productId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @return [kotlin.String]
     */
    @GET("v1/loanproducts/{productId}/productmix")
    suspend fun retrieveTemplate12(@Path("productId") productId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/loanproducts/{productId}/productmix")
    suspend fun updateProductMix(
        @Path("productId") productId: Long,
        @Body body: String? = null
    ): String

}

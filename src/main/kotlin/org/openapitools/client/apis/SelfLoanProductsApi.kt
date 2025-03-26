package org.openapitools.client.apis

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface SelfLoanProductsApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/self/loanproducts")
    suspend fun retrieveAllLoanProducts1(@Query("clientId") clientId: Long? = null): String

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
    @GET("v1/self/loanproducts/{productId}")
    suspend fun retrieveLoanProductDetails2(
        @Path("productId") productId: Long,
        @Query("clientId") clientId: Long? = null
    ): String

}

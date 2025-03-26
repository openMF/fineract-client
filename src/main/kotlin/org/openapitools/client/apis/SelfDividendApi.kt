package org.openapitools.client.apis

import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query


interface SelfDividendApi {
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
    @POST("v1/shareproduct/{productId}/dividend")
    suspend fun createDividendDetail(
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
     * @param dividendId
     * @return [kotlin.String]
     */
    @DELETE("v1/shareproduct/{productId}/dividend/{dividendId}")
    suspend fun deleteDividendDetail(
        @Path("productId") productId: Long,
        @Path("dividendId") dividendId: Long
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @param status  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/shareproduct/{productId}/dividend")
    suspend fun retrieveAll39(
        @Path("productId") productId: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("status") status: Int? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param dividendId
     * @param productId
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @param accountNo  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/shareproduct/{productId}/dividend/{dividendId}")
    suspend fun retrieveDividendDetails(
        @Path("dividendId") dividendId: Long,
        @Path("productId") productId: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("accountNo") accountNo: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param productId
     * @param dividendId
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/shareproduct/{productId}/dividend/{dividendId}")
    suspend fun updateDividendDetail(
        @Path("productId") productId: Long,
        @Path("dividendId") dividendId: Long,
        @Query("command") command: String? = null,
        @Body body: String? = null
    ): String

}

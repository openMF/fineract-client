package org.openapitools.client.apis

import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query


interface SMSApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/sms")
    suspend fun create2(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param resourceId
     * @return [kotlin.String]
     */
    @DELETE("v1/sms/{resourceId}")
    suspend fun delete6(@Path("resourceId") resourceId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/sms")
    suspend fun retrieveAll10(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param campaignId
     * @param status  (optional)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @param locale  (optional)
     * @param dateFormat  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/sms/{campaignId}/messageByStatus")
    suspend fun retrieveAllSmsByStatus(
        @Path("campaignId") campaignId: Long,
        @Query("status") status: Long? = null,
        @Query("fromDate") fromDate: Any? = null,
        @Query("toDate") toDate: Any? = null,
        @Query("locale") locale: String? = null,
        @Query("dateFormat") dateFormat: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param resourceId
     * @return [kotlin.String]
     */
    @GET("v1/sms/{resourceId}")
    suspend fun retrieveOne6(@Path("resourceId") resourceId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param resourceId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/sms/{resourceId}")
    suspend fun update3(
        @Path("resourceId") resourceId: Long,
        @Body body: String? = null
    ): String

}

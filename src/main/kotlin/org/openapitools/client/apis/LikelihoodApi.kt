package org.openapitools.client.apis

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path


interface LikelihoodApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param likelihoodId
     * @param ppiName
     * @return [kotlin.String]
     */
    @GET("v1/likelihood/{ppiName}/{likelihoodId}")
    suspend fun retrieve(
        @Path("likelihoodId") likelihoodId: Long,
        @Path("ppiName") ppiName: String
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param ppiName
     * @return [kotlin.String]
     */
    @GET("v1/likelihood/{ppiName}")
    suspend fun retrieveAll11(@Path("ppiName") ppiName: String): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param likelihoodId
     * @param ppiName
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/likelihood/{ppiName}/{likelihoodId}")
    suspend fun update4(
        @Path("likelihoodId") likelihoodId: Long,
        @Path("ppiName") ppiName: String,
        @Body body: String? = null
    ): String

}

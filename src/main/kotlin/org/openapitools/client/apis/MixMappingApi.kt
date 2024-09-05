package org.openapitools.client.apis

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT


interface MixMappingApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/mixmapping")
    suspend fun retrieveTaxonomyMapping(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/mixmapping")
    suspend fun updateTaxonomyMapping(@Body body: String? = null): String

}

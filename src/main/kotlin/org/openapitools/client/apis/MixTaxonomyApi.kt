package org.openapitools.client.apis

import retrofit2.http.GET


interface MixTaxonomyApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/mixtaxonomy")
    suspend fun retrieveAll14(): String

}

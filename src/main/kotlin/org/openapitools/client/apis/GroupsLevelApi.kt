package org.openapitools.client.apis

import retrofit2.http.GET


interface GroupsLevelApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/grouplevels")
    suspend fun retrieveAllGroups(): String

}

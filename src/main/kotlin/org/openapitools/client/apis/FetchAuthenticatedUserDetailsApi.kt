package org.openapitools.client.apis

import org.openapitools.client.models.GetUserDetailsResponse
import retrofit2.http.GET

interface FetchAuthenticatedUserDetailsApi {
    /**
     * Fetch authenticated user details
     * checks the Authentication and returns the set roles and permissions allowed.
     * Responses:
     *  - 200: OK
     *
     * @return [GetUserDetailsResponse]
     */
    @GET("v1/userdetails")
    suspend fun fetchAuthenticatedUserData(): GetUserDetailsResponse

}

package org.openapitools.client.apis

import org.openapitools.client.models.GetSelfUserDetailsResponse
import retrofit2.http.GET

interface SelfUserDetailsApi {
    /**
     * Fetch authenticated user details
     * Checks the Authentication and returns the set roles and permissions allowed  For more info visit this link - https://fineract.apache.org/legacy-docs/apiLive.htm#selfoauth
     * Responses:
     *  - 200: OK
     *
     * @return [GetSelfUserDetailsResponse]
     */
    @GET("v1/self/userdetails")
    suspend fun fetchAuthenticatedUserData1(): GetSelfUserDetailsResponse

}

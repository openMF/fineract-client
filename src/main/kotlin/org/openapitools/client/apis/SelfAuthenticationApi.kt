package org.openapitools.client.apis

import org.openapitools.client.models.PostAuthenticationRequest
import org.openapitools.client.models.PostSelfAuthenticationResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface SelfAuthenticationApi {
    /**
     * Verify authentication
     * Authenticates the credentials provided and returns the set roles and permissions allowed.  Please visit this link for more info - https://fineract.apache.org/legacy-docs/apiLive.htm#selfbasicauth
     * Responses:
     *  - 200: OK
     *
     * @param postAuthenticationRequest
     * @return [PostSelfAuthenticationResponse]
     */
    @POST("v1/self/authentication")
    suspend fun authenticate1(@Body postAuthenticationRequest: PostAuthenticationRequest): PostSelfAuthenticationResponse

}

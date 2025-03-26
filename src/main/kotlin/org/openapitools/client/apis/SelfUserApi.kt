package org.openapitools.client.apis

import org.openapitools.client.models.PutSelfUserRequest
import org.openapitools.client.models.PutSelfUserResponse
import retrofit2.http.Body
import retrofit2.http.PUT

interface SelfUserApi {
    /**
     * Update User
     * This API can be used by Self Service user to update their own user information. Currently, \&quot;password\&quot; and \&quot;repeatPassword\&quot; are the only parameters accepted.
     * Responses:
     *  - 200: OK
     *
     * @param putSelfUserRequest
     * @return [PutSelfUserResponse]
     */
    @PUT("v1/self/user")
    suspend fun update24(@Body putSelfUserRequest: PutSelfUserRequest): PutSelfUserResponse

}

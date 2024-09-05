package org.openapitools.client.apis

import retrofit2.http.Body
import retrofit2.http.POST


interface SelfServiceRegistrationApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/self/registration")
    suspend fun createSelfServiceRegistrationRequest(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/self/registration/user")
    suspend fun createSelfServiceUser(@Body body: String? = null): String

}

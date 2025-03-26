package org.openapitools.client.apis

import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path


interface ClientFamilyMemberApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/clients/{clientId}/familymembers")
    suspend fun addClientFamilyMembers(
        @Path("clientId") clientId: Long,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param familyMemberId
     * @param clientId clientId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @DELETE("v1/clients/{clientId}/familymembers/{familyMemberId}")
    suspend fun deleteClientFamilyMembers(
        @Path("familyMemberId") familyMemberId: Long,
        @Path("clientId") clientId: Long,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param familyMemberId
     * @param clientId clientId
     * @return [kotlin.String]
     */
    @GET("v1/clients/{clientId}/familymembers/{familyMemberId}")
    suspend fun getFamilyMember(
        @Path("familyMemberId") familyMemberId: Long,
        @Path("clientId") clientId: Long
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId
     * @return [kotlin.String]
     */
    @GET("v1/clients/{clientId}/familymembers")
    suspend fun getFamilyMembers(@Path("clientId") clientId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId
     * @return [kotlin.String]
     */
    @GET("v1/clients/{clientId}/familymembers/template")
    suspend fun getTemplate2(@Path("clientId") clientId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param familyMemberId
     * @param clientId clientId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/clients/{clientId}/familymembers/{familyMemberId}")
    suspend fun updateClientFamilyMembers(
        @Path("familyMemberId") familyMemberId: Long,
        @Path("clientId") clientId: Long,
        @Body body: String? = null
    ): String

}

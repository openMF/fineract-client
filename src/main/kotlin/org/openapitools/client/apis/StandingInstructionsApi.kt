package org.openapitools.client.apis

import org.openapitools.client.models.GetStandingInstructionsResponse
import org.openapitools.client.models.GetStandingInstructionsStandingInstructionIdResponse
import org.openapitools.client.models.GetStandingInstructionsTemplateResponse
import org.openapitools.client.models.PostStandingInstructionsRequest
import org.openapitools.client.models.PostStandingInstructionsResponse
import org.openapitools.client.models.PutStandingInstructionsStandingInstructionIdRequest
import org.openapitools.client.models.PutStandingInstructionsStandingInstructionIdResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface StandingInstructionsApi {
    /**
     * Create new Standing Instruction
     * Ability to create new instruction for transfer of monetary funds from one account to another
     * Responses:
     *  - 200: OK
     *
     * @param postStandingInstructionsRequest
     * @return [PostStandingInstructionsResponse]
     */
    @POST("v1/standinginstructions")
    suspend fun create5(@Body postStandingInstructionsRequest: PostStandingInstructionsRequest): PostStandingInstructionsResponse

    /**
     * List Standing Instructions
     * Example Requests:  standinginstructions
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @param transferType transferType (optional)
     * @param clientName clientName (optional)
     * @param clientId clientId (optional)
     * @param fromAccountId fromAccountId (optional)
     * @param fromAccountType fromAccountType (optional)
     * @return [GetStandingInstructionsResponse]
     */
    @GET("v1/standinginstructions")
    suspend fun retrieveAll19(
        @Query("externalId") externalId: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("transferType") transferType: Int? = null,
        @Query("clientName") clientName: String? = null,
        @Query("clientId") clientId: Long? = null,
        @Query("fromAccountId") fromAccountId: Long? = null,
        @Query("fromAccountType") fromAccountType: Int? = null
    ): GetStandingInstructionsResponse

    /**
     * Retrieve Standing Instruction
     * Example Requests :  standinginstructions/1
     * Responses:
     *  - 200: OK
     *
     * @param standingInstructionId standingInstructionId
     * @param externalId externalId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [GetStandingInstructionsStandingInstructionIdResponse]
     */
    @GET("v1/standinginstructions/{standingInstructionId}")
    suspend fun retrieveOne10(
        @Path("standingInstructionId") standingInstructionId: Long,
        @Query("externalId") externalId: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): GetStandingInstructionsStandingInstructionIdResponse

    /**
     * Retrieve Standing Instruction Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1&amp;transferType&#x3D;1  standinginstructions/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1&amp;transferType&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param fromOfficeId fromOfficeId (optional)
     * @param fromClientId fromClientId (optional)
     * @param fromAccountId fromAccountId (optional)
     * @param fromAccountType fromAccountType (optional)
     * @param toOfficeId toOfficeId (optional)
     * @param toClientId toClientId (optional)
     * @param toAccountId toAccountId (optional)
     * @param toAccountType toAccountType (optional)
     * @param transferType transferType (optional)
     * @return [GetStandingInstructionsTemplateResponse]
     */
    @GET("v1/standinginstructions/template")
    suspend fun template6(
        @Query("fromOfficeId") fromOfficeId: Long? = null,
        @Query("fromClientId") fromClientId: Long? = null,
        @Query("fromAccountId") fromAccountId: Long? = null,
        @Query("fromAccountType") fromAccountType: Int? = null,
        @Query("toOfficeId") toOfficeId: Long? = null,
        @Query("toClientId") toClientId: Long? = null,
        @Query("toAccountId") toAccountId: Long? = null,
        @Query("toAccountType") toAccountType: Int? = null,
        @Query("transferType") transferType: Int? = null
    ): GetStandingInstructionsTemplateResponse

    /**
     * Update Standing Instruction | Delete Standing Instruction
     * Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;update   Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;delete
     * Responses:
     *  - 200: OK
     *
     * @param standingInstructionId standingInstructionId
     * @param command command (optional)
     * @param putStandingInstructionsStandingInstructionIdRequest  (optional)
     * @return [PutStandingInstructionsStandingInstructionIdResponse]
     */
    @PUT("v1/standinginstructions/{standingInstructionId}")
    suspend fun update9(
        @Path("standingInstructionId") standingInstructionId: Long,
        @Query("command") command: String? = null,
        @Body putStandingInstructionsStandingInstructionIdRequest: PutStandingInstructionsStandingInstructionIdRequest? = null
    ): PutStandingInstructionsStandingInstructionIdResponse

}

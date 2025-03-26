package org.openapitools.client.apis

import org.openapitools.client.models.GetTaxesGroupResponse
import org.openapitools.client.models.PostTaxesGroupRequest
import org.openapitools.client.models.PostTaxesGroupResponse
import org.openapitools.client.models.PutTaxesGroupTaxGroupIdRequest
import org.openapitools.client.models.PutTaxesGroupTaxGroupIdResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface TaxGroupApi {
    /**
     * Create a new Tax Group
     * Create a new Tax Group Mandatory Fields: name and taxComponents Mandatory Fields in taxComponents: taxComponentId Optional Fields in taxComponents: id, startDate and endDate
     * Responses:
     *  - 200: OK
     *
     * @param postTaxesGroupRequest
     * @return [PostTaxesGroupResponse]
     */
    @POST("v1/taxes/group")
    suspend fun createTaxGroup(@Body postTaxesGroupRequest: PostTaxesGroupRequest): PostTaxesGroupResponse

    /**
     * List Tax Group
     * List Tax Group
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetTaxesGroupResponse]
     */
    @GET("v1/taxes/group")
    suspend fun retrieveAllTaxGroups(): List<GetTaxesGroupResponse>

    /**
     * Retrieve Tax Group
     * Retrieve Tax Group
     * Responses:
     *  - 200: OK
     *
     * @param taxGroupId taxGroupId
     * @return [GetTaxesGroupResponse]
     */
    @GET("v1/taxes/group/{taxGroupId}")
    suspend fun retrieveTaxGroup(@Path("taxGroupId") taxGroupId: Long): GetTaxesGroupResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/taxes/group/template")
    suspend fun retrieveTemplate22(): String

    /**
     * Update Tax Group
     * Updates Tax Group. Only end date can be up-datable and can insert new tax components.
     * Responses:
     *  - 200: OK
     *
     * @param taxGroupId taxGroupId
     * @param putTaxesGroupTaxGroupIdRequest
     * @return [PutTaxesGroupTaxGroupIdResponse]
     */
    @PUT("v1/taxes/group/{taxGroupId}")
    suspend fun updateTaxGroup(
        @Path("taxGroupId") taxGroupId: Long,
        @Body putTaxesGroupTaxGroupIdRequest: PutTaxesGroupTaxGroupIdRequest
    ): PutTaxesGroupTaxGroupIdResponse

}

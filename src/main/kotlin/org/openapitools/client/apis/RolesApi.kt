package org.openapitools.client.apis

import org.openapitools.client.models.DeleteRolesRoleIdResponse
import org.openapitools.client.models.GetRolesResponse
import org.openapitools.client.models.GetRolesRoleIdPermissionsResponse
import org.openapitools.client.models.GetRolesRoleIdResponse
import org.openapitools.client.models.PostRolesRequest
import org.openapitools.client.models.PostRolesResponse
import org.openapitools.client.models.PostRolesRoleIdResponse
import org.openapitools.client.models.PutRolesRoleIdPermissionsRequest
import org.openapitools.client.models.PutRolesRoleIdPermissionsResponse
import org.openapitools.client.models.PutRolesRoleIdRequest
import org.openapitools.client.models.PutRolesRoleIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface RolesApi {
    /**
     * Enable Role | Disable Role
     * Description : Enable role in case role is disabled. | Disable the role in case role is not associated with any users.      Example Request:   https://DomainName/api/v1/roles/{roleId}?command&#x3D;enable      https://DomainName/api/v1/roles/{roleId}?command&#x3D;disable
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @param command command (optional)
     * @return [PostRolesRoleIdResponse]
     */
    @POST("v1/roles/{roleId}")
    suspend fun actionsOnRoles(
        @Path("roleId") roleId: Long,
        @Query("command") command: String? = null
    ): PostRolesRoleIdResponse

    /**
     * Create a New Role
     * Mandatory Fields name, description
     * Responses:
     *  - 200: OK
     *
     * @param postRolesRequest
     * @return [PostRolesResponse]
     */
    @POST("v1/roles")
    suspend fun createRole(@Body postRolesRequest: PostRolesRequest): PostRolesResponse

    /**
     * Delete a Role
     * Description : Delete the role in case role is not associated with any users.
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @return [DeleteRolesRoleIdResponse]
     */
    @DELETE("v1/roles/{roleId}")
    suspend fun deleteRole(@Path("roleId") roleId: Long): DeleteRolesRoleIdResponse

    /**
     * List Roles
     * Example Requests:  roles   roles?fields&#x3D;name
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetRolesResponse]
     */
    @GET("v1/roles")
    suspend fun retrieveAllRoles(): List<GetRolesResponse>

    /**
     * Retrieve a Role
     * Example Requests:  roles/1   roles/1?fields&#x3D;name
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @return [GetRolesRoleIdResponse]
     */
    @GET("v1/roles/{roleId}")
    suspend fun retrieveRole(@Path("roleId") roleId: Long): GetRolesRoleIdResponse

    /**
     * Retrieve a Role&#39;s Permissions
     * Example Requests:  roles/1/permissions
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @return [GetRolesRoleIdPermissionsResponse]
     */
    @GET("v1/roles/{roleId}/permissions")
    suspend fun retrieveRolePermissions(@Path("roleId") roleId: Long): GetRolesRoleIdPermissionsResponse

    /**
     * Update a Role
     *
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @param putRolesRoleIdRequest
     * @return [PutRolesRoleIdResponse]
     */
    @PUT("v1/roles/{roleId}")
    suspend fun updateRole(
        @Path("roleId") roleId: Long,
        @Body putRolesRoleIdRequest: PutRolesRoleIdRequest
    ): PutRolesRoleIdResponse

    /**
     * Update a Role&#39;s Permissions
     *
     * Responses:
     *  - 200: OK
     *
     * @param roleId roleId
     * @param putRolesRoleIdPermissionsRequest
     * @return [PutRolesRoleIdPermissionsResponse]
     */
    @PUT("v1/roles/{roleId}/permissions")
    suspend fun updateRolePermissions(
        @Path("roleId") roleId: Long,
        @Body putRolesRoleIdPermissionsRequest: PutRolesRoleIdPermissionsRequest
    ): PutRolesRoleIdPermissionsResponse

}

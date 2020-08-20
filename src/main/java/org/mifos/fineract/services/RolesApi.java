package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface RolesApi {
    /**
     * Enable Role | Disable Role
     * Description : Enable role in case role is disabled. | Disable the role in case role is not associated with any users.      Example Request:   https://DomainName/api/v1/roles/{roleId}?command&#x3D;enable      https://DomainName/api/v1/roles/{roleId}?command&#x3D;disable
     *
     * @param roleId  roleId (required)
     * @param command command (optional)
     * @return Call&lt;PostRolesRoleIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("roles/{roleId}")
    Call<PostRolesRoleIdResponse> actionsOnRoles(
            @retrofit2.http.Path("roleId") Long roleId, @retrofit2.http.Query("command") String command
    );

    /**
     * Create a New Role
     * Mandatory Fields name, description
     *
     * @param body body (required)
     * @return Call&lt;PostRolesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("roles")
    Call<PostRolesResponse> createRole(
            @retrofit2.http.Body PostRolesRequest body
    );

    /**
     * Delete a Role
     * Description : Delete the role in case role is not associated with any users.
     *
     * @param roleId roleId (required)
     * @return Call&lt;DeleteRolesRoleIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("roles/{roleId}")
    Call<DeleteRolesRoleIdResponse> deleteRole(
            @retrofit2.http.Path("roleId") Long roleId
    );

    /**
     * List Roles
     * Example Requests:  roles   roles?fields&#x3D;name
     *
     * @return Call&lt;List&lt;GetRolesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("roles")
    Call<List<GetRolesResponse>> retrieveAllRoles();


    /**
     * Retrieve a Role
     * Example Requests:  roles/1   roles/1?fields&#x3D;name
     *
     * @param roleId roleId (required)
     * @return Call&lt;GetRolesRoleIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("roles/{roleId}")
    Call<GetRolesRoleIdResponse> retrieveRole(
            @retrofit2.http.Path("roleId") Long roleId
    );

    /**
     * Retrieve a Role&#39;s Permissions
     * Example Requests:  roles/1/permissions
     *
     * @param roleId roleId (required)
     * @return Call&lt;GetRolesRoleIdPermissionsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("roles/{roleId}/permissions")
    Call<GetRolesRoleIdPermissionsResponse> retrieveRolePermissions(
            @retrofit2.http.Path("roleId") Long roleId
    );

    /**
     * Update a Role
     *
     * @param roleId roleId (required)
     * @param body   body (required)
     * @return Call&lt;PutRolesRoleIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("roles/{roleId}")
    Call<PutRolesRoleIdResponse> updateRole(
            @retrofit2.http.Path("roleId") Long roleId, @retrofit2.http.Body PutRolesRoleIdRequest body
    );

    /**
     * Update a Role&#39;s Permissions
     *
     * @param roleId roleId (required)
     * @param body   body (required)
     * @return Call&lt;PutRolesRoleIdPermissionsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("roles/{roleId}/permissions")
    Call<PutRolesRoleIdPermissionsResponse> updateRolePermissions(
            @retrofit2.http.Path("roleId") Long roleId, @retrofit2.http.Body PutRolesRoleIdPermissionsRequest body
    );

}

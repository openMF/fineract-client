package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostRolesRequest;
import org.mifos.fineract.models.PutRolesRoleIdPermissionsRequest;
import org.mifos.fineract.models.PutRolesRoleIdRequest;

/**
 * API tests for RolesApi
 */
public class RolesApiTest {

    private RolesApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(RolesApi.class);
    }

    /**
     * Enable Role | Disable Role
     * <p>
     * Description : Enable role in case role is disabled. | Disable the role in case role is not associated with any users.      Example Request:   https://DomainName/api/v1/roles/{roleId}?command&#x3D;enable      https://DomainName/api/v1/roles/{roleId}?command&#x3D;disable
     */
    @Test
    public void actionsOnRolesTest() {
        Long roleId = null;
        String command = null;
        // PostRolesRoleIdResponse response = api.actionsOnRoles(roleId, command);

        // TODO: test validations
    }

    /**
     * Create a New Role
     * <p>
     * Mandatory Fields name, description
     */
    @Test
    public void createRoleTest() {
        PostRolesRequest body = null;
        // PostRolesResponse response = api.createRole(body);

        // TODO: test validations
    }

    /**
     * Delete a Role
     * <p>
     * Description : Delete the role in case role is not associated with any users.
     */
    @Test
    public void deleteRoleTest() {
        Long roleId = null;
        // DeleteRolesRoleIdResponse response = api.deleteRole(roleId);

        // TODO: test validations
    }

    /**
     * List Roles
     * <p>
     * Example Requests:  roles   roles?fields&#x3D;name
     */
    @Test
    public void retrieveAllRolesTest() {
        // List<GetRolesResponse> response = api.retrieveAllRoles();

        // TODO: test validations
    }

    /**
     * Retrieve a Role
     * <p>
     * Example Requests:  roles/1   roles/1?fields&#x3D;name
     */
    @Test
    public void retrieveRoleTest() {
        Long roleId = null;
        // GetRolesRoleIdResponse response = api.retrieveRole(roleId);

        // TODO: test validations
    }

    /**
     * Retrieve a Role&#39;s Permissions
     * <p>
     * Example Requests:  roles/1/permissions
     */
    @Test
    public void retrieveRolePermissionsTest() {
        Long roleId = null;
        // GetRolesRoleIdPermissionsResponse response = api.retrieveRolePermissions(roleId);

        // TODO: test validations
    }

    /**
     * Update a Role
     */
    @Test
    public void updateRoleTest() {
        Long roleId = null;
        PutRolesRoleIdRequest body = null;
        // PutRolesRoleIdResponse response = api.updateRole(roleId, body);

        // TODO: test validations
    }

    /**
     * Update a Role&#39;s Permissions
     */
    @Test
    public void updateRolePermissionsTest() {
        Long roleId = null;
        PutRolesRoleIdPermissionsRequest body = null;
        // PutRolesRoleIdPermissionsResponse response = api.updateRolePermissions(roleId, body);

        // TODO: test validations
    }
}

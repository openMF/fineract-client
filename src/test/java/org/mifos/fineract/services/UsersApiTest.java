package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostUsersRequest;
import org.mifos.fineract.models.PutUsersUserIdRequest;

import java.io.File;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private UsersApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(UsersApi.class);
    }

    /**
     * Create a User
     *
     * Adds new application user.  Note: Password information is not required (or processed). Password details at present are auto-generated and then sent to the email account given (which is why it can take a few seconds to complete).  Mandatory Fields:  username, firstname, lastname, email, officeId, roles, sendPasswordToEmail  Optional Fields:  staffId,passwordNeverExpires,isSelfServiceUser,clients
     */
    @Test
    public void createTest() {
        PostUsersRequest body = null;
        // PostUsersResponse response = api.create(body);

        // TODO: test validations
    }
    /**
     * Delete a User
     *
     * Removes the user and the associated roles and permissions.
     */
    @Test
    public void deleteTest() {
        Long userId = null;
        // DeleteUsersUserIdResponse response = api.delete(userId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getUserTemplateTest() {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        // api.getUserTemplate(officeId, staffId, dateFormat);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void postUsersTemplateTest() {
        File file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postUsersTemplate(file, locale, dateFormat);

        // TODO: test validations
    }
    /**
     * Retrieve list of users
     *
     * Example Requests:  users   users?fields&#x3D;id,username,email,officeName
     */
    @Test
    public void retrieveAllTest() {
        // List<GetUsersResponse> response = api.retrieveAll();

        // TODO: test validations
    }
    /**
     * Retrieve a User
     *
     * Example Requests:  users/1   users/1?template&#x3D;true   users/1?fields&#x3D;username,officeName
     */
    @Test
    public void retrieveOneTest() {
        Long userId = null;
        // GetUsersUserIdResponse response = api.retrieveOne(userId);

        // TODO: test validations
    }
    /**
     * Retrieve User Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  users/template
     */
    @Test
    public void templateTest() {
        // GetUsersTemplateResponse response = api.template();

        // TODO: test validations
    }
    /**
     * Update a User
     *
     * When updating a password you must provide the repeatPassword parameter also.
     */
    @Test
    public void updateTest() {
        Long userId = null;
        PutUsersUserIdRequest body = null;
        // PutUsersUserIdResponse response = api.update(userId, body);

        // TODO: test validations
    }
}

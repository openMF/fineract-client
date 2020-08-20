package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.PutSelfUserRequest;

/**
 * API tests for SelfUserApi
 */
public class SelfUserApiTest {

    private SelfUserApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfUserApi.class);
    }

    /**
     * Update User
     * <p>
     * This API can be used by Self Service user to update their own user information. Currently, \&quot;password\&quot; and \&quot;repeatPassword\&quot; are the only parameters accepted.
     */
    @Test
    public void updateTest() {
        PutSelfUserRequest body = null;
        // PutSelfUserResponse response = api.update(body);

        // TODO: test validations
    }
}

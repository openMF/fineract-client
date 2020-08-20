package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for AuthenticationHttpBasicApi
 */
public class AuthenticationHttpBasicApiTest {

    private AuthenticationHttpBasicApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuthenticationHttpBasicApi.class);
    }

    /**
     * Verify authentication
     * <p>
     * Authenticates the credentials provided and returns the set roles and permissions allowed.
     */
    @Test
    public void authenticateTest() {
        String username = null;
        String password = null;
        // PostAuthenticationResponse response = api.authenticate(username, password);

        // TODO: test validations
    }
}

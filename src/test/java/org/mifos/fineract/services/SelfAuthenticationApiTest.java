package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for SelfAuthenticationApi
 */
public class SelfAuthenticationApiTest {

    private SelfAuthenticationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfAuthenticationApi.class);
    }

    /**
     * Verify authentication
     * <p>
     * Authenticates the credentials provided and returns the set roles and permissions allowed.  Please visit this link for more info - https://demo.openmf.org/api-docs/apiLive.htm#selfbasicauth
     */
    @Test
    public void authenticateTest() {
        String username = null;
        String password = null;
        // PostSelfAuthenticationResponse response = api.authenticate(username, password);

        // TODO: test validations
    }
}

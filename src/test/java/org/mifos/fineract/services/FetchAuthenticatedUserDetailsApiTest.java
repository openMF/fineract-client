package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for FetchAuthenticatedUserDetailsApi
 */
public class FetchAuthenticatedUserDetailsApiTest {

    private FetchAuthenticatedUserDetailsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FetchAuthenticatedUserDetailsApi.class);
    }

    /**
     * Fetch authenticated user details
     * <p>
     * checks the Authentication and returns the set roles and permissions allowed.
     */
    @Test
    public void fetchAuthenticatedUserDataTest() {
        String accessToken = null;
        // GetUserDetailsResponse response = api.fetchAuthenticatedUserData(accessToken);

        // TODO: test validations
    }
}

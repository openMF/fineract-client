package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for SelfUserDetailsApi
 */
public class SelfUserDetailsApiTest {

    private SelfUserDetailsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SelfUserDetailsApi.class);
    }

    /**
     * Fetch authenticated user details
     * <p>
     * Checks the Authentication and returns the set roles and permissions allowed  For more info visit this link - https://demo.openmf.org/api-docs/apiLive.htm#selfoauth
     */
    @Test
    public void fetchAuthenticatedUserDataTest() {
        String accessToken = null;
        // GetSelfUserDetailsResponse response = api.fetchAuthenticatedUserData(accessToken);

        // TODO: test validations
    }
}

package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for SelfServiceRegistrationApi
 */
public class SelfServiceRegistrationApiTest {

    private SelfServiceRegistrationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfServiceRegistrationApi.class);
    }

    /**
     *
     */
    @Test
    public void createSelfServiceRegistrationRequestTest() {
        String body = null;
        // String response = api.createSelfServiceRegistrationRequest(body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void createSelfServiceUserTest() {
        String body = null;
        // String response = api.createSelfServiceUser(body);

        // TODO: test validations
    }
}

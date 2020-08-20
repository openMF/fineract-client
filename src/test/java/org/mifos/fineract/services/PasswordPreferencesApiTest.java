package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.PutPasswordPreferencesTemplateRequest;

/**
 * API tests for PasswordPreferencesApi
 */
public class PasswordPreferencesApiTest {

    private PasswordPreferencesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PasswordPreferencesApi.class);
    }

    /**
     *
     */
    @Test
    public void retrieveTest() {
        // GetPasswordPreferencesTemplateResponse response = api.retrieve();

        // TODO: test validations
    }

    /**
     * List Application Password validation policies
     * <p>
     * ARGUMENTS Example Requests:  passwordpreferences
     */
    @Test
    public void templateTest() {
        // List<GetPasswordPreferencesTemplateResponse> response = api.template();

        // TODO: test validations
    }

    /**
     * Update password preferences
     */
    @Test
    public void updateTest() {
        PutPasswordPreferencesTemplateRequest body = null;
        // api.update(body);

        // TODO: test validations
    }
}

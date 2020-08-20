package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PutGlobalConfigurationsRequest;

/**
 * API tests for GlobalConfigurationApi
 */
public class GlobalConfigurationApiTest {

    private GlobalConfigurationApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(GlobalConfigurationApi.class);
    }

    /**
     * Retrieve Global Configuration | Retrieve Global Configuration for surveys
     * <p>
     * Returns the list global enable/disable configurations.  Example Requests:  configurations   Returns the list global enable/disable survey configurations.  Example Requests:  configurations/survey
     */
    @Test
    public void retrieveConfigurationTest() {
        Boolean survey = null;
        // List<GetGlobalConfigurationsResponse> response = api.retrieveConfiguration(survey);

        // TODO: test validations
    }

    /**
     * Retrieve Global Configuration
     * <p>
     * Returns a global enable/disable configurations.  Example Requests:  configurations/1
     */
    @Test
    public void retrieveOneTest() {
        Long configId = null;
        // GetGlobalConfigurationsResponse response = api.retrieveOne(configId);

        // TODO: test validations
    }

    /**
     * Update Global Configuration
     * <p>
     * Updates an enable/disable global configuration item.
     */
    @Test
    public void updateConfigurationTest() {
        Long configId = null;
        PutGlobalConfigurationsRequest body = null;
        // PutGlobalConfigurationsResponse response = api.updateConfiguration(configId, body);

        // TODO: test validations
    }
}

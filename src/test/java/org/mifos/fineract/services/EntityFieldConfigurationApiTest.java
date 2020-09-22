package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for EntityFieldConfigurationApi
 */
public class EntityFieldConfigurationApiTest {

    private EntityFieldConfigurationApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(EntityFieldConfigurationApi.class);
    }

    /**
     * Retrieves the Entity Field Configuration
     *
     * It retrieves all the Entity Field Configuration
     */
    @Test
    public void getAddressesTest() {
        String entity = null;
        // List<GetFieldConfigurationEntityResponse> response = api.getAddresses(entity);

        // TODO: test validations
    }
}

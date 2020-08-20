package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for ProvisioningCategoryApi
 */
public class ProvisioningCategoryApiTest {

    private ProvisioningCategoryApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ProvisioningCategoryApi.class);
    }

    /**
     *
     */
    @Test
    public void createProvisioningCategoryTest() {
        String body = null;
        // String response = api.createProvisioningCategory(body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void deleteProvisioningCategoryTest() {
        Long categoryId = null;
        // String response = api.deleteProvisioningCategory(categoryId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveAllTest() {
        // String response = api.retrieveAll();

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void updateProvisioningCategoryTest() {
        Long categoryId = null;
        String body = null;
        // String response = api.updateProvisioningCategory(categoryId, body);

        // TODO: test validations
    }
}

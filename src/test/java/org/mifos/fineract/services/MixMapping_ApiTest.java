package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for MixMapping_Api
 */
public class MixMapping_ApiTest {

    private MixMapping_Api api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MixMapping_Api.class);
    }

    /**
     *
     */
    @Test
    public void retrieveTaxonomyMappingTest() {
        // String response = api.retrieveTaxonomyMapping();

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void updateTaxonomyMappingTest() {
        String body = null;
        // String response = api.updateTaxonomyMapping(body);

        // TODO: test validations
    }
}

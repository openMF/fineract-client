package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for MixTaxonomyApi
 */
public class MixTaxonomyApiTest {

    private MixTaxonomyApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MixTaxonomyApi.class);
    }

    /**
     *
     */
    @Test
    public void retrieveAllTest() {
        // String response = api.retrieveAll();

        // TODO: test validations
    }
}

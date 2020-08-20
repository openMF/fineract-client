package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for MixTaxonomyApi
 */
public class MixTaxonomyApiTest {

    private MixTaxonomyApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(MixTaxonomyApi.class);
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

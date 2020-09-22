package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for PovertyLineApi
 */
public class PovertyLineApiTest {

    private PovertyLineApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(PovertyLineApi.class);
    }

    /**
     *
     */
    @Test
    public void retrieveAllTest() {
        String ppiName = null;
        // String response = api.retrieveAll(ppiName);

        // TODO: test validations
    }
    /**
     *
     */
    @Test
    public void retrieveAll_0Test() {
        String ppiName = null;
        Long likelihoodId = null;
        // String response = api.retrieveAll_0(ppiName, likelihoodId);

        // TODO: test validations
    }
}

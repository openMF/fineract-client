package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for LikelihoodApi
 */
public class LikelihoodApiTest {

    private LikelihoodApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LikelihoodApi.class);
    }

    /**
     *
     */
    @Test
    public void retrieveTest() {
        Long likelihoodId = null;
        // String response = api.retrieve(likelihoodId);

        // TODO: test validations
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
    public void updateTest() {
        Long likelihoodId = null;
        String body = null;
        // String response = api.update(likelihoodId, body);

        // TODO: test validations
    }
}

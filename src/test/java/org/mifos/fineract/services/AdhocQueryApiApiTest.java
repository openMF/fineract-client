package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for AdhocQueryApiApi
 */
public class AdhocQueryApiApiTest {

    private AdhocQueryApiApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(AdhocQueryApiApi.class);
    }

    /**
     *
     */
    @Test
    public void createAdHocQueryTest() {
        String body = null;
        // String response = api.createAdHocQuery(body);

        // TODO: test validations
    }
    /**
     *
     */
    @Test
    public void deleteAdHocQueryTest() {
        Long adHocId = null;
        // String response = api.deleteAdHocQuery(adHocId);

        // TODO: test validations
    }
    /**
     * 
     *
     *
     */
    @Test
    public void retrieveAdHocQueryTest() {
        Long adHocId = null;
        // String response = api.retrieveAdHocQuery(adHocId);

        // TODO: test validations
    }
    /**
     * 
     *
     *
     */
    @Test
    public void retrieveAllTest() {
        // String response = api.retrieveAll();

        // TODO: test validations
    }
    /**
     * 
     *
     *
     */
    @Test
    public void templateTest() {
        // String response = api.template();

        // TODO: test validations
    }
    /**
     * 
     *
     *
     */
    @Test
    public void updateTest() {
        Long adHocId = null;
        String body = null;
        // String response = api.update(adHocId, body);

        // TODO: test validations
    }
}

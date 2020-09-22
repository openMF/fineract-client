package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for SmsApi
 */
public class SmsApiTest {

    private SmsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SmsApi.class);
    }

    /**
     *
     */
    @Test
    public void createTest() {
        String body = null;
        // String response = api.create(body);

        // TODO: test validations
    }
    /**
     *
     */
    @Test
    public void deleteTest() {
        Long resourceId = null;
        // String response = api.delete(resourceId);

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
    public void retrieveAllSmsByStatusTest() {
        Long campaignId = null;
        Long status = null;
        String fromDate = null;
        String toDate = null;
        String locale = null;
        String dateFormat = null;
        String sqlSearch = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // String response = api.retrieveAllSmsByStatus(campaignId, status, fromDate, toDate, locale, dateFormat, sqlSearch, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }
    /**
     * 
     *
     *
     */
    @Test
    public void retrieveOneTest() {
        Long resourceId = null;
        // String response = api.retrieveOne(resourceId);

        // TODO: test validations
    }
    /**
     * 
     *
     *
     */
    @Test
    public void updateTest() {
        Long resourceId = null;
        String body = null;
        // String response = api.update(resourceId, body);

        // TODO: test validations
    }
}

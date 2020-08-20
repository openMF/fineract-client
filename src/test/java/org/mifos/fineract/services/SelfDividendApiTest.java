package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for SelfDividendApi
 */
public class SelfDividendApiTest {

    private SelfDividendApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SelfDividendApi.class);
    }

    /**
     *
     */
    @Test
    public void createDividendDetailTest() {
        Long productId = null;
        String body = null;
        // String response = api.createDividendDetail(productId, body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void deleteDividendDetailTest() {
        Long productId = null;
        Long dividendId = null;
        // String response = api.deleteDividendDetail(productId, dividendId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveAllTest() {
        Long productId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        Integer status = null;
        // String response = api.retrieveAll(productId, offset, limit, orderBy, sortOrder, status);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveDividendDetailsTest() {
        Long dividendId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        String accountNo = null;
        // String response = api.retrieveDividendDetails(dividendId, offset, limit, orderBy, sortOrder, accountNo);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void updateDividendDetailTest() {
        Long productId = null;
        Long dividendId = null;
        String command = null;
        String body = null;
        // String response = api.updateDividendDetail(productId, dividendId, command, body);

        // TODO: test validations
    }
}

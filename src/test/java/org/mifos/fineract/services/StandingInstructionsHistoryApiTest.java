package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for StandingInstructionsHistoryApi
 */
public class StandingInstructionsHistoryApiTest {

    private StandingInstructionsHistoryApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StandingInstructionsHistoryApi.class);
    }

    /**
     * Standing Instructions Logged History
     * <p>
     * The list capability of history can support pagination and sorting   Example Requests :  standinginstructionrunhistory  standinginstructionrunhistory?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC  standinginstructionrunhistory?offset&#x3D;10&amp;limit&#x3D;50
     */
    @Test
    public void retrieveAllTest() {
        String sqlSearch = null;
        String externalId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        Integer transferType = null;
        String clientName = null;
        Long clientId = null;
        Long fromAccountId = null;
        Integer fromAccountType = null;
        String locale = null;
        String dateFormat = null;
        String fromDate = null;
        String toDate = null;
        // GetStandingInstructionRunHistoryResponse response = api.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType, locale, dateFormat, fromDate, toDate);

        // TODO: test validations
    }
}

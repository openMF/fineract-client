package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostFundsRequest;
import org.mifos.fineract.models.PutFundsFundIdRequest;

/**
 * API tests for FundsApi
 */
public class FundsApiTest {

    private FundsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(FundsApi.class);
    }

    /**
     * Create a Fund
     * <p>
     * Creates a Fund
     */
    @Test
    public void createFundTest() {
        PostFundsRequest body = null;
        // PostFundsResponse response = api.createFund(body);

        // TODO: test validations
    }

    /**
     * Retrieve a Fund
     * <p>
     * Returns the details of a Fund.  Example Requests:  funds/1
     */
    @Test
    public void retreiveFundTest() {
        Long fundId = null;
        // GetFundsResponse response = api.retreiveFund(fundId);

        // TODO: test validations
    }

    /**
     * Retrieve Funds
     * <p>
     * Returns the list of funds.  Example Requests:  funds
     */
    @Test
    public void retrieveFundsTest() {
        // List<GetFundsResponse> response = api.retrieveFunds();

        // TODO: test validations
    }

    /**
     * Update a Fund
     * <p>
     * Updates the details of a fund.
     */
    @Test
    public void updateFundTest() {
        Long fundId = null;
        PutFundsFundIdRequest body = null;
        // PutFundsFundIdResponse response = api.updateFund(fundId, body);

        // TODO: test validations
    }
}

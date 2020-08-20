package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.ScorecardData;

/**
 * API tests for SelfScoreCardApi
 */
public class SelfScoreCardApiTest {

    private SelfScoreCardApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfScoreCardApi.class);
    }

    /**
     *
     */
    @Test
    public void createScorecardTest() {
        Long surveyId = null;
        ScorecardData body = null;
        // api.createScorecard(surveyId, body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void findByClientTest() {
        Long clientId = null;
        // List<ScorecardData> response = api.findByClient(clientId);

        // TODO: test validations
    }
}

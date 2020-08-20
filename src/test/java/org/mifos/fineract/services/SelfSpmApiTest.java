package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for SelfSpmApi
 */
public class SelfSpmApiTest {

    private SelfSpmApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SelfSpmApi.class);
    }

    /**
     *
     */
    @Test
    public void fetchAllSurveysTest() {
        // List<SurveyData> response = api.fetchAllSurveys();

        // TODO: test validations
    }
}

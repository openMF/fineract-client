package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.ScorecardData;

/**
 * API tests for ScoreCardApi
 */
public class ScoreCardApiTest {

    private ScoreCardApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ScoreCardApi.class);
    }

    /**
     * Create a Scorecard entry
     * <p>
     * Add a new entry to a survey.  Mandatory Fields clientId, createdOn, questionId, responseId, staffId
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

    /**
     * List all Scorecard entries
     * <p>
     * List all Scorecard entries for a survey.
     */
    @Test
    public void findBySurveyTest() {
        Long surveyId = null;
        // List<Scorecard> response = api.findBySurvey(surveyId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void findBySurveyAndClientTest() {
        Long surveyId = null;
        Long clientId = null;
        // List<ScorecardData> response = api.findBySurveyAndClient(surveyId, clientId);

        // TODO: test validations
    }
}

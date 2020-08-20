package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.SurveyData;

/**
 * API tests for SpmSurveysApi
 */
public class SpmSurveysApiTest {

    private SpmSurveysApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SpmSurveysApi.class);
    }

    /**
     * Deactivate Survey
     */
    @Test
    public void activateOrDeactivateSurveyTest() {
        Long id = null;
        String command = null;
        // api.activateOrDeactivateSurvey(id, command);

        // TODO: test validations
    }

    /**
     * Create a Survey
     * <p>
     * Adds a new survey to collect client related data.  Mandatory Fields  countryCode, key, name, questions, responses, sequenceNo, text, value
     */
    @Test
    public void createSurveyTest() {
        SurveyData body = null;
        // api.createSurvey(body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void editSurveyTest() {
        Long id = null;
        SurveyData body = null;
        // String response = api.editSurvey(id, body);

        // TODO: test validations
    }

    /**
     * List all Surveys
     */
    @Test
    public void fetchAllSurveysTest() {
        Boolean isActive = null;
        // List<SurveyData> response = api.fetchAllSurveys(isActive);

        // TODO: test validations
    }

    /**
     * Retrieve a Survey
     */
    @Test
    public void findSurveyTest() {
        Long id = null;
        // SurveyData response = api.findSurvey(id);

        // TODO: test validations
    }
}

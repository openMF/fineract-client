package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostSurveySurveyNameApptableIdRequest;

/**
 * API tests for SurveyApi
 */
public class SurveyApiTest {

    private SurveyApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SurveyApi.class);
    }

    /**
     * Create an entry in the survey table
     * <p>
     * Insert and entry in a survey table (full fill the survey).  Refer Link for sample Body:  [ https://demo.openmf.org/api-docs/apiLive.htm#survey_create ]
     */
    @Test
    public void createDatatableEntryTest() {
        String surveyName = null;
        Long apptableId = null;
        PostSurveySurveyNameApptableIdRequest body2 = null;
        String body = null;
        // PostSurveySurveyNameApptableIdResponse response = api.createDatatableEntry(surveyName, apptableId, body2, body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void deleteDatatableEntriesTest() {
        String surveyName = null;
        Long clientId = null;
        Long fulfilledId = null;
        // String response = api.deleteDatatableEntries(surveyName, clientId, fulfilledId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getClientSurveyOverviewTest() {
        String surveyName = null;
        Long clientId = null;
        // String response = api.getClientSurveyOverview(surveyName, clientId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getSurveyEntryTest() {
        String surveyName = null;
        Long clientId = null;
        Long entryId = null;
        // String response = api.getSurveyEntry(surveyName, clientId, entryId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void registerTest() {
        String surveyName = null;
        String apptable = null;
        String body = null;
        // String response = api.register(surveyName, apptable, body);

        // TODO: test validations
    }

    /**
     * Retrieve survey
     * <p>
     * Lists a registered survey table details and the Apache Fineract Core application table they are registered to.
     */
    @Test
    public void retrieveSurveyTest() {
        String surveyName = null;
        // GetSurveyResponse response = api.retrieveSurvey(surveyName);

        // TODO: test validations
    }

    /**
     * Retrieve surveys
     * <p>
     * Retrieve surveys. This allows to retrieve the list of survey tables registered .
     */
    @Test
    public void retrieveSurveysTest() {
        // List<GetSurveyResponse> response = api.retrieveSurveys();

        // TODO: test validations
    }
}

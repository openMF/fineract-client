package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PutWorkingDaysRequest;

/**
 * API tests for WorkingDaysApi
 */
public class WorkingDaysApiTest {

    private WorkingDaysApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(WorkingDaysApi.class);
    }

    /**
     * List Working days
     * <p>
     * Example Requests:  workingdays
     */
    @Test
    public void retrieveAllTest() {
        // List<GetWorkingDaysResponse> response = api.retrieveAll();

        // TODO: test validations
    }

    /**
     * Working Days Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for working days.  Example Request:  workingdays/template
     */
    @Test
    public void templateTest() {
        // GetWorkingDaysTemplateResponse response = api.template();

        // TODO: test validations
    }

    /**
     * Update a Working Day
     * <p>
     * Mandatory Fields recurrence,repaymentRescheduleType,extendTermForDailyRepayments,locale
     */
    @Test
    public void updateTest() {
        PutWorkingDaysRequest body = null;
        // PutWorkingDaysResponse response = api.update(body);

        // TODO: test validations
    }
}

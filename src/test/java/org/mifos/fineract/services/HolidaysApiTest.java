package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostHolidaysHolidayIdRequest;
import org.mifos.fineract.models.PostHolidaysRequest;
import org.mifos.fineract.models.PutHolidaysHolidayIdRequest;

/**
 * API tests for HolidaysApi
 */
public class HolidaysApiTest {

    private HolidaysApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(HolidaysApi.class);
    }

    /**
     * Create a Holiday
     *
     * Mandatory Fields: name, description, fromDate, toDate, repaymentsRescheduledTo, offices
     */
    @Test
    public void createNewHolidayTest() {
        PostHolidaysRequest body = null;
        // PostHolidaysResponse response = api.createNewHoliday(body);

        // TODO: test validations
    }
    /**
     * Delete a Holiday
     *
     * This API allows to delete a holiday. This is a soft delete the deleted holiday status is marked as deleted.
     */
    @Test
    public void deleteTest() {
        Long holidayId = null;
        // DeleteHolidaysHolidayIdResponse response = api.delete(holidayId);

        // TODO: test validations
    }
    /**
     * Activate a Holiday
     *
     * Always Holidays are created in pending state. This API allows to activate a holiday.  Only the active holidays are considered for rescheduling the loan repayment.
     */
    @Test
    public void handleCommandsTest() {
        Long holidayId = null;
        PostHolidaysHolidayIdRequest body = null;
        String command = null;
        // PostHolidaysHolidayIdResponse response = api.handleCommands(holidayId, body, command);

        // TODO: test validations
    }
    /**
     * List Holidays
     *
     * Example Requests:  holidays?officeId&#x3D;1
     */
    @Test
    public void retrieveAllHolidaysTest() {
        Long officeId = null;
        String fromDate = null;
        String toDate = null;
        String locale = null;
        String dateFormat = null;
        // List<GetHolidaysResponse> response = api.retrieveAllHolidays(officeId, fromDate, toDate, locale, dateFormat);

        // TODO: test validations
    }
    /**
     * Retrieve a Holiday
     *
     * Example Requests:  holidays/1
     */
    @Test
    public void retrieveOneTest() {
        Long holidayId = null;
        // GetHolidaysResponse response = api.retrieveOne(holidayId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveRepaymentScheduleUpdationTyeOptionsTest() {
        // String response = api.retrieveRepaymentScheduleUpdationTyeOptions();

        // TODO: test validations
    }
    /**
     * Update a Holiday
     *
     * If a holiday is in pending state (created and not activated) then all fields are allowed to modify. Once holidays become active only name and descriptions are allowed to modify.
     */
    @Test
    public void updateTest() {
        Long holidayId = null;
        PutHolidaysHolidayIdRequest body = null;
        // PutHolidaysHolidayIdResponse response = api.update(holidayId, body);

        // TODO: test validations
    }
}

package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostStaffRequest;
import org.mifos.fineract.models.PutStaffRequest;

import java.io.File;

/**
 * API tests for StaffApi
 */
public class StaffApiTest {

    private StaffApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(StaffApi.class);
    }

    /**
     * Create a staff member
     * <p>
     * Creates a staff member.  Mandatory Fields:  officeId, firstname, lastname  Optional Fields:  isLoanOfficer, isActive
     */
    @Test
    public void createStaffTest() {
        PostStaffRequest body = null;
        // PostStaffResponse response = api.createStaff(body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getStaffTemplateTest() {
        Long officeId = null;
        String dateFormat = null;
        // api.getStaffTemplate(officeId, dateFormat);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void postStaffTemplateTest() {
        File file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postStaffTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * Retrieve a Staff Member
     * <p>
     * Returns the details of a Staff Member.  Example Requests:  staff/1
     */
    @Test
    public void retreiveStaffTest() {
        Long staffId = null;
        // GetStaffResponse response = api.retreiveStaff(staffId);

        // TODO: test validations
    }

    /**
     * Retrieve Staff
     * <p>
     * Returns the list of staff members.  Example Requests:  staff     Retrieve a Staff by status  Returns the details of a Staff based on status.  By default it Returns all the ACTIVE Staff.  If status&#x3D;INACTIVE, then it returns all INACTIVE Staff.  and for status&#x3D;ALL, it Returns both ACTIVE and INACTIVE Staff.  Example Requests:  staff?status&#x3D;active
     */
    @Test
    public void retrieveStaffTest() {
        String sqlSearch = null;
        Long officeId = null;
        Boolean staffInOfficeHierarchy = null;
        Boolean loanOfficersOnly = null;
        String status = null;
        // GetStaffResponse response = api.retrieveStaff(sqlSearch, officeId, staffInOfficeHierarchy, loanOfficersOnly, status);

        // TODO: test validations
    }

    /**
     * Update a Staff Member
     * <p>
     * Updates the details of a staff member.
     */
    @Test
    public void updateStaffTest() {
        Long staffId = null;
        PutStaffRequest body = null;
        // PutStaffResponse response = api.updateStaff(staffId, body);

        // TODO: test validations
    }
}

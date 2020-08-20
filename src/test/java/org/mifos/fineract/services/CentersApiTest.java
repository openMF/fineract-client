package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.PostCentersCenterIdRequest;
import org.mifos.fineract.models.PostCentersRequest;
import org.mifos.fineract.models.PutCentersCenterIdRequest;

import java.io.File;

/**
 * API tests for CentersApi
 */
public class CentersApiTest {

    private CentersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CentersApi.class);
    }

    /**
     * Activate a Center | Generate Collection Sheet | Save Collection Sheet | Close a Center | Associate Groups | Disassociate Groups
     * <p>
     * Activate a Center:  Centers can be created in a Pending state. This API exists to enable center activation. If the center happens to be already active, this API will result in an error.  Close a Center:  Centers can be closed if they don&#39;t have any non-closed groups or saving accounts. If the Center has any active groups or savings accounts, this API will result in an error.  Associate Groups:  This API allows associating existing groups to a center. The groups are listed from the office to which the center is associated. If group(s) is already associated with a center, this API will result in an error.  Disassociate Groups:  This API allows to disassociate groups from a center.  Generate Collection Sheet:  This Api retrieves repayment details of all jlg loans under a center as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of JLG loans for a center on a given meeting date.  Showing Request/Response for Close a Center
     */
    @Test
    public void activateTest() {
        Long centerId = null;
        PostCentersCenterIdRequest body = null;
        String command = null;
        // PostCentersCenterIdResponse response = api.activate(centerId, body, command);

        // TODO: test validations
    }

    /**
     * Create a Center
     * <p>
     * Creates a Center  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, groupMembers
     */
    @Test
    public void createTest() {
        PostCentersRequest body = null;
        // PostCentersResponse response = api.create(body);

        // TODO: test validations
    }

    /**
     * Delete a Center
     * <p>
     * A Center can be deleted if it is in pending state and has no association - groups, loans or savings
     */
    @Test
    public void deleteTest() {
        Long centerId = null;
        // DeleteCentersCenterIdResponse response = api.delete(centerId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getCentersTemplateTest() {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        // api.getCentersTemplate(officeId, staffId, dateFormat);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void postCentersTemplateTest() {
        File file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postCentersTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * List Centers
     * <p>
     * The default implementation supports pagination and sorting with the default pagination size set to 200 records. The parameter limit with value -1 will return all entries.  Example Requests:    centers    centers?fields&#x3D;name,officeName,joinedDate    centers?offset&#x3D;10&amp;limit&#x3D;50    centers?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC
     */
    @Test
    public void retrieveAllTest() {
        String sqlSearch = null;
        Long officeId = null;
        Long staffId = null;
        String externalId = null;
        String name = null;
        String underHierarchy = null;
        Boolean paged = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        String meetingDate = null;
        String dateFormat = null;
        String locale = null;
        // GetCentersResponse response = api.retrieveAll(sqlSearch, officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, meetingDate, dateFormat, locale);

        // TODO: test validations
    }

    /**
     * Retrieve Center accounts overview
     * <p>
     * An example of how a savings summary for a Center can be provided. This is requested in a specific use case of the reference application.  It is quite reasonable to add resources like this to simplify User Interface development.    Example Requests:    centers/9/accounts
     */
    @Test
    public void retrieveGroupAccountTest() {
        Long centerId = null;
        // GetCentersCenterIdAccountsResponse response = api.retrieveGroupAccount(centerId);

        // TODO: test validations
    }

    /**
     * Retrieve a Center
     * <p>
     * Retrieves a Center  Example Requests:    centers/1    centers/1?associations&#x3D;groupMembers
     */
    @Test
    public void retrieveOneTest() {
        Long centerId = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetCentersCenterIdResponse response = api.retrieveOne(centerId, staffInSelectedOfficeOnly);

        // TODO: test validations
    }

    /**
     * Retrieve a Center Template
     * <p>
     * Retrieves a Center Template  Example Requests:    centers/template    centers/template?officeId&#x3D;2
     */
    @Test
    public void retrieveTemplateTest() {
        String command = null;
        Long officeId = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetCentersTemplateResponse response = api.retrieveTemplate(command, officeId, staffInSelectedOfficeOnly);

        // TODO: test validations
    }

    /**
     * Update a Center
     * <p>
     * Updates a Center
     */
    @Test
    public void updateTest() {
        Long centerId = null;
        PutCentersCenterIdRequest body = null;
        // PutCentersCenterIdResponse response = api.update(centerId, body);

        // TODO: test validations
    }
}

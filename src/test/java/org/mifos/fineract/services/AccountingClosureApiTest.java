package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.PostGLCLosuresRequest;
import org.mifos.fineract.models.PutGlClosuresRequest;

/**
 * API tests for AccountingClosureApi
 */
public class AccountingClosureApiTest {

    private AccountingClosureApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountingClosureApi.class);
    }

    /**
     * Create an Accounting Closure
     * <p>
     * Mandatory Fields officeId,closingDate
     */
    @Test
    public void createGLClosureTest() {
        PostGLCLosuresRequest body = null;
        // PostGlClosuresResponse response = api.createGLClosure(body);

        // TODO: test validations
    }

    /**
     * Delete an accounting closure
     * <p>
     * Note: Only the latest accounting closure associated with a branch may be deleted.
     */
    @Test
    public void deleteGLClosureTest() {
        Long glClosureId = null;
        // DeleteGlClosuresResponse response = api.deleteGLClosure(glClosureId);

        // TODO: test validations
    }

    /**
     * Retrieve an Accounting Closure
     * <p>
     * Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate
     */
    @Test
    public void retreiveClosureTest() {
        Long glClosureId = null;
        // GetGLClosureResponse response = api.retreiveClosure(glClosureId);

        // TODO: test validations
    }

    /**
     * List Accounting closures
     * <p>
     * Example Requests:  glclosures
     */
    @Test
    public void retrieveAllClosuresTest() {
        Long officeId = null;
        // List<GetGLClosureResponse> response = api.retrieveAllClosures(officeId);

        // TODO: test validations
    }

    /**
     * Update an Accounting closure
     * <p>
     * Once an accounting closure is created, only the comments associated with it may be edited
     */
    @Test
    public void updateGLClosureTest() {
        Long glClosureId = null;
        PutGlClosuresRequest body = null;
        // PutGlClosuresResponse response = api.updateGLClosure(glClosureId, body);

        // TODO: test validations
    }
}

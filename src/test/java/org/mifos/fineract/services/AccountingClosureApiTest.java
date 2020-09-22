package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostGLCLosuresRequest;
import org.mifos.fineract.models.PutGlClosuresRequest;

/**
 * API tests for AccountingClosureApi
 */
public class AccountingClosureApiTest {

    private AccountingClosureApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(AccountingClosureApi.class);
    }

    /**
     * Create an Accounting Closure
     *
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
     *
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
     *
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
     *
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
     *
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

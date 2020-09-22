package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostCodesRequest;
import org.mifos.fineract.models.PutCodesRequest;

/**
 * API tests for CodesApi
 */
public class CodesApiTest {

    private CodesApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(CodesApi.class);
    }

    /**
     * Create a Code
     *
     * Creates a code. Codes created through api are always &#39;user defined&#39; and so system defined is marked as false.
     */
    @Test
    public void createCodeTest() {
        PostCodesRequest body = null;
        // PostCodesResponse response = api.createCode(body);

        // TODO: test validations
    }
    /**
     * Delete a Code
     *
     * Deletes a code if it is not system defined.
     */
    @Test
    public void deleteCodeTest() {
        Long codeId = null;
        // DeleteCodesResponse response = api.deleteCode(codeId);

        // TODO: test validations
    }
    /**
     * Retrieve a Code
     *
     * Returns the details of a Code.  Example Requests:  codes/1
     */
    @Test
    public void retrieveCodeTest() {
        Long codeId = null;
        // GetCodesResponse response = api.retrieveCode(codeId);

        // TODO: test validations
    }
    /**
     * Retrieve Codes
     *
     * Returns the list of codes.  Example Requests:  codes
     */
    @Test
    public void retrieveCodesTest() {
        // List<GetCodesResponse> response = api.retrieveCodes();

        // TODO: test validations
    }
    /**
     * Update a Code
     *
     * Updates the details of a code if it is not system defined.
     */
    @Test
    public void updateCodeTest() {
        Long codeId = null;
        PutCodesRequest body = null;
        // PutCodesResponse response = api.updateCode(codeId, body);

        // TODO: test validations
    }
}

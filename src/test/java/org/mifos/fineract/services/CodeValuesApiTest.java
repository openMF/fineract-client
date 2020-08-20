package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.PostCodeValuesDataRequest;
import org.mifos.fineract.models.PutCodeValuesDataRequest;

/**
 * API tests for CodeValuesApi
 */
public class CodeValuesApiTest {

    private CodeValuesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CodeValuesApi.class);
    }

    /**
     * Create a Code Value
     */
    @Test
    public void createCodeValueTest() {
        Long codeId = null;
        PostCodeValuesDataRequest body = null;
        // PostCodeValueDataResponse response = api.createCodeValue(codeId, body);

        // TODO: test validations
    }

    /**
     * Delete a Code Value
     * <p>
     * Deletes a code value
     */
    @Test
    public void deleteCodeValueTest() {
        Long codeId = null;
        Long codeValueId = null;
        // DeleteCodeValueDataResponse response = api.deleteCodeValue(codeId, codeValueId);

        // TODO: test validations
    }

    /**
     * List Code Values
     * <p>
     * Returns the list of Code Values for a given Code  Example Requests:  codes/1/codevalues
     */
    @Test
    public void retrieveAllCodeValuesTest() {
        Long codeId = null;
        // List<GetCodeValuesDataResponse> response = api.retrieveAllCodeValues(codeId);

        // TODO: test validations
    }

    /**
     * Retrieve a Code Value
     * <p>
     * Returns the details of a Code Value  Example Requests:  codes/1/codevalues/1
     */
    @Test
    public void retrieveCodeValueTest() {
        Long codeValueId = null;
        // GetCodeValuesDataResponse response = api.retrieveCodeValue(codeValueId);

        // TODO: test validations
    }

    /**
     * Update a Code Value
     * <p>
     * Updates the details of a code value.
     */
    @Test
    public void updateCodeValueTest() {
        Long codeId = null;
        Long codeValueId = null;
        PutCodeValuesDataRequest body = null;
        // PutCodeValueDataResponse response = api.updateCodeValue(codeId, codeValueId, body);

        // TODO: test validations
    }
}

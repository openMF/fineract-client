package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostAccountNumberFormatsRequest;
import org.mifos.fineract.models.PutAccountNumberFormatsRequest;

/**
 * API tests for AccountNumberFormatApi
 */
public class AccountNumberFormatApiTest {

    private AccountNumberFormatApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(AccountNumberFormatApi.class);
    }

    /**
     * Create an Account number format
     *
     * Note: You may associate a single Account number format for a given account type Mandatory Fields for Account number formats accountType
     */
    @Test
    public void createTest() {
        PostAccountNumberFormatsRequest body = null;
        // PostAccountNumberFormatsResponse response = api.create(body);

        // TODO: test validations
    }
    /**
     * Delete an Account number format
     *
     * Note: Account numbers created while this format was active would remain unchanged.
     */
    @Test
    public void deleteTest() {
        Long accountNumberFormatId = null;
        // DeleteAccountNumberFormatsResponse response = api.delete(accountNumberFormatId);

        // TODO: test validations
    }
    /**
     * List Account number formats
     *
     * Example Requests:  accountnumberformats   accountnumberformats?fields&#x3D;accountType,prefixType
     */
    @Test
    public void retrieveAllTest() {
        // List<GetAccountNumberFormatsIdResponse> response = api.retrieveAll();

        // TODO: test validations
    }
    /**
     * Retrieve an Account number format
     *
     * Example Requests:  accountnumberformats/1   accountnumberformats/1?template&#x3D;true   accountnumberformats/1?fields&#x3D;accountType,prefixType
     */
    @Test
    public void retrieveOneTest() {
        Long accountNumberFormatId = null;
        // GetAccountNumberFormatsIdResponse response = api.retrieveOne(accountNumberFormatId);

        // TODO: test validations
    }
    /**
     * Retrieve Account number format Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  accountnumberformats/template
     */
    @Test
    public void retrieveTemplateTest() {
        // GetAccountNumberFormatsResponseTemplate response = api.retrieveTemplate();

        // TODO: test validations
    }

    /**
     * Update an Account number format
     */
    @Test
    public void updateTest() {
        Long accountNumberFormatId = null;
        PutAccountNumberFormatsRequest body = null;
        // PutAccountNumberFormatsResponse response = api.update(accountNumberFormatId, body);

        // TODO: test validations
    }
}

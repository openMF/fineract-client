package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostTaxesGroupRequest;
import org.mifos.fineract.models.PutTaxesGroupTaxGroupIdRequest;

/**
 * API tests for TaxGroupApi
 */
public class TaxGroupApiTest {

    private TaxGroupApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(TaxGroupApi.class);
    }

    /**
     * Create a new Tax Group
     *
     * Create a new Tax Group Mandatory Fields: name and taxComponents Mandatory Fields in taxComponents: taxComponentId Optional Fields in taxComponents: id, startDate and endDate
     */
    @Test
    public void createTaxGroupTest() {
        PostTaxesGroupRequest body = null;
        // PostTaxesGroupResponse response = api.createTaxGroup(body);

        // TODO: test validations
    }
    /**
     * List Tax Group
     *
     * List Tax Group
     */
    @Test
    public void retrieveAllTaxGroupsTest() {
        // List<GetTaxesGroupResponse> response = api.retrieveAllTaxGroups();

        // TODO: test validations
    }
    /**
     * Retrieve Tax Group
     *
     * Retrieve Tax Group
     */
    @Test
    public void retrieveTaxGroupTest() {
        Long taxGroupId = null;
        // GetTaxesGroupResponse response = api.retrieveTaxGroup(taxGroupId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveTemplateTest() {
        // String response = api.retrieveTemplate();

        // TODO: test validations
    }
    /**
     * Update Tax Group
     *
     * Updates Tax Group. Only end date can be up-datable and can insert new tax components.
     */
    @Test
    public void updateTaxGroupTest() {
        Long taxGroupId = null;
        PutTaxesGroupTaxGroupIdRequest body = null;
        // PutTaxesGroupTaxGroupIdResponse response = api.updateTaxGroup(taxGroupId, body);

        // TODO: test validations
    }
}

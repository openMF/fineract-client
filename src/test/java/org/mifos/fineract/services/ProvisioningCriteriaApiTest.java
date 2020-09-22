package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostProvisioningCriteriaRequest;
import org.mifos.fineract.models.PutProvisioningCriteriaRequest;

/**
 * API tests for ProvisioningCriteriaApi
 */
public class ProvisioningCriteriaApiTest {

    private ProvisioningCriteriaApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(ProvisioningCriteriaApi.class);
    }

    /**
     * Create a new Provisioning Criteria
     *
     * Creates a new Provisioning Criteria  Mandatory Fields:  criteriaName provisioningcriteria  Optional Fields:  loanProducts
     */
    @Test
    public void createProvisioningCriteriaTest() {
        PostProvisioningCriteriaRequest body = null;
        // PostProvisioningCriteriaResponse response = api.createProvisioningCriteria(body);

        // TODO: test validations
    }
    /**
     * Deletes Provisioning Criteria
     *
     * Deletes Provisioning Criteria
     */
    @Test
    public void deleteProvisioningCriteriaTest() {
        Long criteriaId = null;
        // DeleteProvisioningCriteriaResponse response = api.deleteProvisioningCriteria(criteriaId);

        // TODO: test validations
    }
    /**
     * Retrieves all created Provisioning Criterias
     *
     * Retrieves all created Provisioning Criterias
     */
    @Test
    public void retrieveAllProvisioningCriteriasTest() {
        // List<GetProvisioningCriteriaResponse> response = api.retrieveAllProvisioningCriterias();

        // TODO: test validations
    }
    /**
     * Retrieves a Provisioning Criteria
     *
     * Retrieves a Provisioning Criteria
     */
    @Test
    public void retrieveProvisioningCriteriaTest() {
        Long criteriaId = null;
        // GetProvisioningCriteriaCriteriaIdResponse response = api.retrieveProvisioningCriteria(criteriaId);

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
     * Updates a new Provisioning Criteria
     *
     * Updates a new Provisioning Criteria  Optional Fields criteriaName, loanProducts, provisioningcriteria
     */
    @Test
    public void updateProvisioningCriteriaTest() {
        Long criteriaId = null;
        PutProvisioningCriteriaRequest body = null;
        // PutProvisioningCriteriaResponse response = api.updateProvisioningCriteria(criteriaId, body);

        // TODO: test validations
    }
}

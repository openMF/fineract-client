package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostChargesRequest;
import org.mifos.fineract.models.PutChargesChargeIdRequest;

/**
 * API tests for ChargesApi
 */
public class ChargesApiTest {

    private ChargesApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(ChargesApi.class);
    }

    /**
     * Create/Define a Charge
     * <p>
     * Define a new charge that can later be associated with loans and savings through their respective product definitions or directly on each account instance.
     */
    @Test
    public void createChargeTest() {
        PostChargesRequest body = null;
        // PostChargesResponse response = api.createCharge(body);

        // TODO: test validations
    }

    /**
     * Delete a Charge
     * <p>
     * Deletes a Charge.
     */
    @Test
    public void deleteChargeTest() {
        Long chargeId = null;
        // DeleteChargesChargeIdResponse response = api.deleteCharge(chargeId);

        // TODO: test validations
    }

    /**
     * Retrieve Charges
     * <p>
     * Returns the list of defined charges.  Example Requests:  charges
     */
    @Test
    public void retrieveAllChargesTest() {
        // List<GetChargesResponse> response = api.retrieveAllCharges();

        // TODO: test validations
    }

    /**
     * Retrieve a Charge
     * <p>
     * Returns the details of a defined Charge.  Example Requests:  charges/1
     */
    @Test
    public void retrieveChargeTest() {
        Long chargeId = null;
        // GetChargesResponse response = api.retrieveCharge(chargeId);

        // TODO: test validations
    }

    /**
     * Retrieve Charge Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  charges/template
     */
    @Test
    public void retrieveNewChargeDetailsTest() {
        // GetChargesTemplateResponse response = api.retrieveNewChargeDetails();

        // TODO: test validations
    }

    /**
     * Update a Charge
     * <p>
     * Updates the details of a Charge.
     */
    @Test
    public void updateChargeTest() {
        Long chargeId = null;
        PutChargesChargeIdRequest body = null;
        // PutChargesChargeIdResponse response = api.updateCharge(chargeId, body);

        // TODO: test validations
    }
}

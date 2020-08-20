package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostClientsClientIdChargesChargeIdRequest;
import org.mifos.fineract.models.PostClientsClientIdChargesRequest;

/**
 * API tests for ClientChargesApi
 */
public class ClientChargesApiTest {

    private ClientChargesApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(ClientChargesApi.class);
    }

    /**
     * Add Client Charge
     * <p>
     * This API associates a Client charge with an implicit Client account Mandatory Fields :  chargeId and dueDate   Optional Fields :  amount
     */
    @Test
    public void applyClientChargeTest() {
        Long clientId = null;
        PostClientsClientIdChargesRequest body = null;
        // PostClientsClientIdChargesResponse response = api.applyClientCharge(clientId, body);

        // TODO: test validations
    }

    /**
     * Delete a Client Charge
     * <p>
     * Deletes a Client Charge on which no transactions have taken place (either payments or waivers).
     */
    @Test
    public void deleteClientChargeTest() {
        Long clientId = null;
        Long chargeId = null;
        // DeleteClientsClientIdChargesChargeIdResponse response = api.deleteClientCharge(clientId, chargeId);

        // TODO: test validations
    }

    /**
     * Pay a Client Charge | Waive a Client Charge
     * <p>
     * Pay a Client Charge:  Mandatory Fields:transactionDate and amount \&quot;Pay either a part of or the entire due amount for a charge.(command&#x3D;paycharge)  Waive a Client Charge:   This API provides the facility of waiving off the remaining amount on a client charge (command&#x3D;waive)  Showing request/response for &#39;Pay a Client Charge&#39;
     */
    @Test
    public void payOrWaiveClientChargeTest() {
        Long clientId = null;
        Long chargeId = null;
        PostClientsClientIdChargesChargeIdRequest body = null;
        String command = null;
        // PostClientsClientIdChargesChargeIdResponse response = api.payOrWaiveClientCharge(clientId, chargeId, body, command);

        // TODO: test validations
    }

    /**
     * List Client Charges
     * <p>
     * The list capability of client charges supports pagination.Example Requests: clients/1/charges  clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5
     */
    @Test
    public void retrieveAllClientChargesTest() {
        Long clientId = null;
        String chargeStatus = null;
        Boolean pendingPayment = null;
        Integer limit = null;
        Integer offset = null;
        // GetClientsClientIdChargesResponse response = api.retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset);

        // TODO: test validations
    }

    /**
     * Retrieve a Client Charge
     * <p>
     * Example Requests: clients/1/charges/1   clients/1/charges/1?fields&#x3D;name,id
     */
    @Test
    public void retrieveClientChargeTest() {
        Long clientId = null;
        Long chargeId = null;
        // GetClientsChargesPageItems response = api.retrieveClientCharge(clientId, chargeId);

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
}

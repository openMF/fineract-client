package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostClientClientIdAddressesRequest;
import org.mifos.fineract.models.PutClientClientIdAddressesRequest;

/**
 * API tests for ClientsAddressApi
 */
public class ClientsAddressApiTest {

    private ClientsAddressApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(ClientsAddressApi.class);
    }

    /**
     * Create an address for a Client
     *
     * Mandatory Fields :  type and clientId
     */
    @Test
    public void addClientAddressTest() {
        Long clientid = null;
        PostClientClientIdAddressesRequest body = null;
        Long type = null;
        // PostClientClientIdAddressesResponse response = api.addClientAddress(clientid, body, type);

        // TODO: test validations
    }
    /**
     * List all addresses for a Client
     *
     * Example Requests:  client/1/addresses   clients/1/addresses?status&#x3D;false,true&amp;&amp;type&#x3D;1,2,3
     */
    @Test
    public void getAddressesTest() {
        Long clientid = null;
        String status = null;
        Long type = null;
        // List<GetClientClientIdAddressesResponse> response = api.getAddresses(clientid, status, type);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getAddressesTemplateTest() {
        // String response = api.getAddressesTemplate();

        // TODO: test validations
    }
    /**
     * Update an address for a Client
     *
     * All the address fields can be updated by using update client address API  Mandatory Fields type and addressId
     */
    @Test
    public void updateClientAddressTest() {
        Long clientid = null;
        PutClientClientIdAddressesRequest body = null;
        // PutClientClientIdAddressesResponse response = api.updateClientAddress(clientid, body);

        // TODO: test validations
    }
}

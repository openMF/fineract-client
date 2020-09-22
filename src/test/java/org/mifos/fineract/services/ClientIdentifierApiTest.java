package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostClientsClientIdIdentifiersRequest;
import org.mifos.fineract.models.PutClientsClientIdIdentifiersIdentifierIdRequest;

/**
 * API tests for ClientIdentifierApi
 */
public class ClientIdentifierApiTest {

    private ClientIdentifierApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(ClientIdentifierApi.class);
    }

    /**
     * Create an Identifier for a Client
     * <p>
     * Mandatory Fields documentKey, documentTypeId
     */
    @Test
    public void createClientIdentifierTest() {
        Long clientId = null;
        PostClientsClientIdIdentifiersRequest body = null;
        // PostClientsClientIdIdentifiersResponse response = api.createClientIdentifier(clientId, body);

        // TODO: test validations
    }
    /**
     * Delete a Client Identifier
     *
     * Deletes a Client Identifier
     */
    @Test
    public void deleteClientIdentifierTest() {
        Long clientId = null;
        Long identifierId = null;
        // DeleteClientsClientIdIdentifiersIdentifierIdResponse response = api.deleteClientIdentifier(clientId, identifierId);

        // TODO: test validations
    }
    /**
     * Retrieve Client Identifier Details Template
     *
     * This is a convenience resource useful for building maintenance user interface screens for client applications. The template data returned consists of any or all of:   Field Defaults  Allowed Value Lists   Example Request: clients/1/identifiers/template
     */
    @Test
    public void newClientIdentifierDetailsTest() {
        // GetClientsClientIdIdentifiersTemplateResponse response = api.newClientIdentifierDetails();

        // TODO: test validations
    }
    /**
     * List all Identifiers for a Client
     *
     * Example Requests: clients/1/identifiers   clients/1/identifiers?fields&#x3D;documentKey,documentType,description
     */
    @Test
    public void retrieveAllClientIdentifiersTest() {
        Long clientId = null;
        // List<GetClientsClientIdIdentifiersResponse> response = api.retrieveAllClientIdentifiers(clientId);

        // TODO: test validations
    }
    /**
     * Retrieve a Client Identifier
     *
     * Example Requests: clients/1/identifier/2   clients/1/identifier/2?template&#x3D;true  clients/1/identifiers/2?fields&#x3D;documentKey,documentType,description
     */
    @Test
    public void retrieveClientIdentifiersTest() {
        Long clientId = null;
        Long identifierId = null;
        // GetClientsClientIdIdentifiersResponse response = api.retrieveClientIdentifiers(clientId, identifierId);

        // TODO: test validations
    }
    /**
     * Update a Client Identifier
     *
     * Updates a Client Identifier
     */
    @Test
    public void updateClientIdentiferTest() {
        Long clientId = null;
        Long identifierId = null;
        PutClientsClientIdIdentifiersIdentifierIdRequest body = null;
        // PutClientsClientIdIdentifiersIdentifierIdResponse response = api.updateClientIdentifer(clientId, identifierId, body);

        // TODO: test validations
    }
}

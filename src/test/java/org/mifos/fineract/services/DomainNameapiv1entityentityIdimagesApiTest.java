package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

import java.io.File;

/**
 * API tests for DomainNameapiv1entityentityIdimagesApi
 */
public class DomainNameapiv1entityentityIdimagesApiTest {

    private DomainNameapiv1entityentityIdimagesApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(DomainNameapiv1entityentityIdimagesApi.class);
    }

    /**
     *
     */
    @Test
    public void addNewClientImageTest() {
        String entity = null;
        Long entityId = null;
        Long contentLength = null;
        File file = null;
        // String response = api.addNewClientImage(entity, entityId, contentLength, file);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void deleteClientImageTest() {
        String entity = null;
        Long entityId = null;
        // String response = api.deleteClientImage(entity, entityId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveImageTest() {
        String entity = null;
        Long entityId = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        String output = null;
        // api.retrieveImage(entity, entityId, maxWidth, maxHeight, output);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void updateClientImageTest() {
        String entity = null;
        Long entityId = null;
        Long contentLength = null;
        File file = null;
        // String response = api.updateClientImage(entity, entityId, contentLength, file);

        // TODO: test validations
    }
}

package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

import java.io.File;

/**
 * API tests for DocumentsApi
 */
public class DocumentsApiTest {

    private DocumentsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(DocumentsApi.class);
    }

    /**
     * Create a Document
     * <p>
     * Note: A document is created using a Multi-part form upload   Body Parts  name :  Name or summary of the document  description :  Description of the document  file :  The file to be uploaded  Mandatory Fields :  file and description
     */
    @Test
    public void createDocumentTest() {
        String entityType = null;
        Long entityId = null;
        Long contentLength = null;
        File file = null;
        String name = null;
        String description = null;
        // PostEntityTypeEntityIdDocumentsResponse response = api.createDocument(entityType, entityId, contentLength, file, name, description);

        // TODO: test validations
    }

    /**
     * Remove a Document
     */
    @Test
    public void deleteDocumentTest() {
        String entityType = null;
        Long entityId = null;
        Long documentId = null;
        // DeleteEntityTypeEntityIdDocumentsResponse response = api.deleteDocument(entityType, entityId, documentId);

        // TODO: test validations
    }

    /**
     * Retrieve Binary File associated with Document
     * <p>
     * Request used to download the file associated with the document  Example Requests:  clients/1/documents/1/attachment   loans/1/documents/1/attachment
     */
    @Test
    public void downloadFileTest() {
        String entityType = null;
        Long entityId = null;
        Long documentId = null;
        // api.downloadFile(entityType, entityId, documentId);

        // TODO: test validations
    }

    /**
     * Retrieve a Document
     * <p>
     * Example Requests:  clients/1/documents/1   loans/1/documents/1   client_identifiers/1/documents/1?fields&#x3D;name,description
     */
    @Test
    public void getDocumentTest() {
        String entityType = null;
        Long entityId = null;
        Long documentId = null;
        // GetEntityTypeEntityIdDocumentsResponse response = api.getDocument(entityType, entityId, documentId);

        // TODO: test validations
    }

    /**
     * List documents
     * <p>
     * Example Requests:  clients/1/documents  client_identifiers/1/documents  loans/1/documents?fields&#x3D;name,description
     */
    @Test
    public void retreiveAllDocumentsTest() {
        String entityType = null;
        Long entityId = null;
        // List<GetEntityTypeEntityIdDocumentsResponse> response = api.retreiveAllDocuments(entityType, entityId);

        // TODO: test validations
    }

    /**
     * Update a Document
     * <p>
     * Note: A document is updated using a Multi-part form upload  Body Parts name Name or summary of the document description Description of the document file The file to be uploaded
     */
    @Test
    public void updateDocumentTest() {
        String entityType = null;
        Long entityId = null;
        Long documentId = null;
        Long contentLength = null;
        File file = null;
        String name = null;
        String description = null;
        // PutEntityTypeEntityIdDocumentsResponse response = api.updateDocument(entityType, entityId, documentId, contentLength, file, name, description);

        // TODO: test validations
    }
}

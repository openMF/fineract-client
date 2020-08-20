package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostResourceTypeResourceIdNotesRequest;
import org.mifos.fineract.models.PutResourceTypeResourceIdNotesNoteIdRequest;

/**
 * API tests for NotesApi
 */
public class NotesApiTest {

    private NotesApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(NotesApi.class);
    }

    /**
     * Add a Resource Note
     * <p>
     * Adds a new note to a supported resource.  Example Requests:  clients/1/notes   groups/1/notes
     */
    @Test
    public void addNewNoteTest() {
        String resourceType = null;
        Long resourceId = null;
        PostResourceTypeResourceIdNotesRequest body = null;
        // PostResourceTypeResourceIdNotesResponse response = api.addNewNote(resourceType, resourceId, body);

        // TODO: test validations
    }

    /**
     * Delete a Resource Note
     * <p>
     * Deletes a Resource Note
     */
    @Test
    public void deleteNoteTest() {
        String resourceType = null;
        Long resourceId = null;
        Long noteId = null;
        // DeleteResourceTypeResourceIdNotesNoteIdResponse response = api.deleteNote(resourceType, resourceId, noteId);

        // TODO: test validations
    }

    /**
     * Retrieve a Resource Note
     * <p>
     * Retrieves a Resource Note  Example Requests:  clients/1/notes/76   groups/1/notes/20   clients/1/notes/76?fields&#x3D;note,createdOn,createdByUsername   groups/1/notes/20?fields&#x3D;note,createdOn,createdByUsername
     */
    @Test
    public void retrieveNoteTest() {
        String resourceType = null;
        Long resourceId = null;
        Long noteId = null;
        // GetResourceTypeResourceIdNotesNoteIdResponse response = api.retrieveNote(resourceType, resourceId, noteId);

        // TODO: test validations
    }

    /**
     * Retrieve a Resource&#39;s Notes
     * <p>
     * Retrieves a Resource&#39;s Notes  Note: Notes are returned in descending createOn order.  Example Requests:  clients/2/notes   groups/2/notes?fields&#x3D;note,createdOn,createdByUsername
     */
    @Test
    public void retrieveNotesByResourceTest() {
        String resourceType = null;
        Long resourceId = null;
        // List<GetResourceTypeResourceIdNotesResponse> response = api.retrieveNotesByResource(resourceType, resourceId);

        // TODO: test validations
    }

    /**
     * Update a Resource Note
     * <p>
     * Updates a Resource Note
     */
    @Test
    public void updateNoteTest() {
        String resourceType = null;
        Long resourceId = null;
        Long noteId = null;
        PutResourceTypeResourceIdNotesNoteIdRequest body = null;
        // PutResourceTypeResourceIdNotesNoteIdResponse response = api.updateNote(resourceType, resourceId, noteId, body);

        // TODO: test validations
    }
}

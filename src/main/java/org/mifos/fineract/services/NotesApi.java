package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface NotesApi {
    /**
     * Add a Resource Note
     * Adds a new note to a supported resource.  Example Requests:  clients/1/notes   groups/1/notes
     *
     * @param resourceType resourceType (required)
     * @param resourceId   resourceId (required)
     * @param body         body (required)
     * @return Observable&lt;PostResourceTypeResourceIdNotesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("{resourceType}/{resourceId}/notes")
    Observable<PostResourceTypeResourceIdNotesResponse> addNewNote(
            @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Body PostResourceTypeResourceIdNotesRequest body
    );

    /**
     * Delete a Resource Note
     * Deletes a Resource Note
     *
     * @param resourceType resourceType (required)
     * @param resourceId   resourceId (required)
     * @param noteId       noteId (required)
     * @return Observable&lt;DeleteResourceTypeResourceIdNotesNoteIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("{resourceType}/{resourceId}/notes/{noteId}")
    Observable<DeleteResourceTypeResourceIdNotesNoteIdResponse> deleteNote(
            @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Path("noteId") Long noteId
    );

    /**
     * Retrieve a Resource Note
     * Retrieves a Resource Note  Example Requests:  clients/1/notes/76   groups/1/notes/20   clients/1/notes/76?fields&#x3D;note,createdOn,createdByUsername   groups/1/notes/20?fields&#x3D;note,createdOn,createdByUsername
     *
     * @param resourceType resourceType (required)
     * @param resourceId   resourceId (required)
     * @param noteId       noteId (required)
     * @return Observable&lt;GetResourceTypeResourceIdNotesNoteIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("{resourceType}/{resourceId}/notes/{noteId}")
    Observable<GetResourceTypeResourceIdNotesNoteIdResponse> retrieveNote(
            @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Path("noteId") Long noteId
    );

    /**
     * Retrieve a Resource&#39;s Notes
     * Retrieves a Resource&#39;s Notes  Note: Notes are returned in descending createOn order.  Example Requests:  clients/2/notes   groups/2/notes?fields&#x3D;note,createdOn,createdByUsername
     *
     * @param resourceType resourceType (required)
     * @param resourceId   resourceId (required)
     * @return Observable&lt;List&lt;GetResourceTypeResourceIdNotesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("{resourceType}/{resourceId}/notes")
    Observable<List<GetResourceTypeResourceIdNotesResponse>> retrieveNotesByResource(
            @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId
    );

    /**
     * Update a Resource Note
     * Updates a Resource Note
     *
     * @param resourceType resourceType (required)
     * @param resourceId   resourceId (required)
     * @param noteId       noteId (required)
     * @param body         body (required)
     * @return Observable&lt;PutResourceTypeResourceIdNotesNoteIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("{resourceType}/{resourceId}/notes/{noteId}")
    Observable<PutResourceTypeResourceIdNotesNoteIdResponse> updateNote(
            @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Path("noteId") Long noteId, @retrofit2.http.Body PutResourceTypeResourceIdNotesNoteIdRequest body
    );

}

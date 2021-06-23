/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteResourceTypeResourceIdNotesNoteIdResponse;
import org.apache.fineract.client.models.GetResourceTypeResourceIdNotesNoteIdResponse;
import org.apache.fineract.client.models.GetResourceTypeResourceIdNotesResponse;
import org.apache.fineract.client.models.PostResourceTypeResourceIdNotesRequest;
import org.apache.fineract.client.models.PostResourceTypeResourceIdNotesResponse;
import org.apache.fineract.client.models.PutResourceTypeResourceIdNotesNoteIdRequest;
import org.apache.fineract.client.models.PutResourceTypeResourceIdNotesNoteIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NotesApi {
  /**
   * Add a Resource Note
   * Adds a new note to a supported resource.  Example Requests:  clients/1/notes   groups/1/notes
   * @param resourceType resourceType (required)
   * @param resourceId resourceId (required)
   * @param postResourceTypeResourceIdNotesRequest  (required)
   * @return Observable&lt;PostResourceTypeResourceIdNotesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("{resourceType}/{resourceId}/notes")
  Observable<PostResourceTypeResourceIdNotesResponse> addNewNote(
    @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Body PostResourceTypeResourceIdNotesRequest postResourceTypeResourceIdNotesRequest
  );

  /**
   * Delete a Resource Note
   * Deletes a Resource Note
   * @param resourceType resourceType (required)
   * @param resourceId resourceId (required)
   * @param noteId noteId (required)
   * @return Observable&lt;DeleteResourceTypeResourceIdNotesNoteIdResponse&gt;
   */
  @DELETE("{resourceType}/{resourceId}/notes/{noteId}")
  Observable<DeleteResourceTypeResourceIdNotesNoteIdResponse> deleteNote(
    @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Path("noteId") Long noteId
  );

  /**
   * Retrieve a Resource Note
   * Retrieves a Resource Note  Example Requests:  clients/1/notes/76   groups/1/notes/20   clients/1/notes/76?fields&#x3D;note,createdOn,createdByUsername   groups/1/notes/20?fields&#x3D;note,createdOn,createdByUsername
   * @param resourceType resourceType (required)
   * @param resourceId resourceId (required)
   * @param noteId noteId (required)
   * @return Observable&lt;GetResourceTypeResourceIdNotesNoteIdResponse&gt;
   */
  @GET("{resourceType}/{resourceId}/notes/{noteId}")
  Observable<GetResourceTypeResourceIdNotesNoteIdResponse> retrieveNote(
    @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Path("noteId") Long noteId
  );

  /**
   * Retrieve a Resource&#39;s description
   * Retrieves a Resource&#39;s Notes  Note: Notes are returned in descending createOn order.  Example Requests:  clients/2/notes   groups/2/notes?fields&#x3D;note,createdOn,createdByUsername
   * @param resourceType resourceType (required)
   * @param resourceId resourceId (required)
   * @return Observable&lt;List&lt;GetResourceTypeResourceIdNotesResponse&gt;&gt;
   */
  @GET("{resourceType}/{resourceId}/notes")
  Observable<List<GetResourceTypeResourceIdNotesResponse>> retrieveNotesByResource(
    @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId
  );

  /**
   * Update a Resource Note
   * Updates a Resource Note
   * @param resourceType resourceType (required)
   * @param resourceId resourceId (required)
   * @param noteId noteId (required)
   * @param putResourceTypeResourceIdNotesNoteIdRequest  (required)
   * @return Observable&lt;PutResourceTypeResourceIdNotesNoteIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("{resourceType}/{resourceId}/notes/{noteId}")
  Observable<PutResourceTypeResourceIdNotesNoteIdResponse> updateNote(
    @retrofit2.http.Path("resourceType") String resourceType, @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Path("noteId") Long noteId, @retrofit2.http.Body PutResourceTypeResourceIdNotesNoteIdRequest putResourceTypeResourceIdNotesNoteIdRequest
  );

}

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

import rx.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteEntityTypeEntityIdDocumentsResponse;
import org.apache.fineract.client.models.FormDataBodyPart;
import org.apache.fineract.client.models.GetEntityTypeEntityIdDocumentsResponse;
import org.apache.fineract.client.models.PostEntityTypeEntityIdDocumentsResponse;
import org.apache.fineract.client.models.PutEntityTypeEntityIdDocumentsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DocumentsApi {
  /**
   * Create a Document
   * Note: A document is created using a Multi-part form upload   Body Parts  name :  Name or summary of the document  description :  Description of the document  file :  The file to be uploaded  Mandatory Fields :  file and description
   * @param entityType entityType (required)
   * @param entityId entityId (required)
   * @param contentLength Content-Length (optional)
   * @param file  (optional)
   * @param name name (optional)
   * @param description description (optional)
   * @return Observable&lt;PostEntityTypeEntityIdDocumentsResponse&gt;
   */
  @retrofit2.http.Multipart
  @POST("{entityType}/{entityId}/documents")
  Observable<PostEntityTypeEntityIdDocumentsResponse> createDocument(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part("file") FormDataBodyPart file, @retrofit2.http.Part("name") String name, @retrofit2.http.Part("description") String description
  );

  /**
   * Remove a Document
   * 
   * @param entityType entityType (required)
   * @param entityId entityId (required)
   * @param documentId documentId (required)
   * @return Observable&lt;DeleteEntityTypeEntityIdDocumentsResponse&gt;
   */
  @DELETE("{entityType}/{entityId}/documents/{documentId}")
  Observable<DeleteEntityTypeEntityIdDocumentsResponse> deleteDocument(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId
  );

  /**
   * Retrieve Binary File associated with Document
   * Request used to download the file associated with the document  Example Requests:  clients/1/documents/1/attachment   loans/1/documents/1/attachment
   * @param entityType entityType (required)
   * @param entityId entityId (required)
   * @param documentId documentId (required)
   * @return Observable&lt;Void&gt;
   */
  @GET("{entityType}/{entityId}/documents/{documentId}/attachment")
  Observable<Void> downloadFile(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId
  );

  /**
   * Retrieve a Document
   * Example Requests:  clients/1/documents/1   loans/1/documents/1   client_identifiers/1/documents/1?fields&#x3D;name,description
   * @param entityType entityType (required)
   * @param entityId entityId (required)
   * @param documentId documentId (required)
   * @return Observable&lt;GetEntityTypeEntityIdDocumentsResponse&gt;
   */
  @GET("{entityType}/{entityId}/documents/{documentId}")
  Observable<GetEntityTypeEntityIdDocumentsResponse> getDocument(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId
  );

  /**
   * List documents
   * Example Requests:  clients/1/documents  client_identifiers/1/documents  loans/1/documents?fields&#x3D;name,description
   * @param entityType entityType (required)
   * @param entityId entityId (required)
   * @return Observable&lt;List&lt;GetEntityTypeEntityIdDocumentsResponse&gt;&gt;
   */
  @GET("{entityType}/{entityId}/documents")
  Observable<List<GetEntityTypeEntityIdDocumentsResponse>> retrieveAllDocuments(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId
  );

  /**
   * Update a Document
   * Note: A document is updated using a Multi-part form upload  Body Parts name Name or summary of the document description Description of the document file The file to be uploaded
   * @param entityType entityType (required)
   * @param entityId entityId (required)
   * @param documentId documentId (required)
   * @param contentLength Content-Length (optional)
   * @param file  (optional)
   * @param name name (optional)
   * @param description description (optional)
   * @return Observable&lt;PutEntityTypeEntityIdDocumentsResponse&gt;
   */
  @retrofit2.http.Multipart
  @PUT("{entityType}/{entityId}/documents/{documentId}")
  Observable<PutEntityTypeEntityIdDocumentsResponse> updateDocument(
    @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part("file") FormDataBodyPart file, @retrofit2.http.Part("name") String name, @retrofit2.http.Part("description") String description
  );

}

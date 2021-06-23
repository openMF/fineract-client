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

import org.apache.fineract.client.models.DeleteClientsClientIdIdentifiersIdentifierIdResponse;
import org.apache.fineract.client.models.GetClientsClientIdIdentifiersResponse;
import org.apache.fineract.client.models.GetClientsClientIdIdentifiersTemplateResponse;
import org.apache.fineract.client.models.PostClientsClientIdIdentifiersRequest;
import org.apache.fineract.client.models.PostClientsClientIdIdentifiersResponse;
import org.apache.fineract.client.models.PutClientsClientIdIdentifiersIdentifierIdRequest;
import org.apache.fineract.client.models.PutClientsClientIdIdentifiersIdentifierIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClientIdentifierApi {
  /**
   * Create an Identifier for a Client
   * Mandatory Fields documentKey, documentTypeId 
   * @param clientId clientId (required)
   * @param postClientsClientIdIdentifiersRequest  (required)
   * @return Observable&lt;PostClientsClientIdIdentifiersResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clients/{clientId}/identifiers")
  Observable<PostClientsClientIdIdentifiersResponse> createClientIdentifier(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body PostClientsClientIdIdentifiersRequest postClientsClientIdIdentifiersRequest
  );

  /**
   * Delete a Client Identifier
   * Deletes a Client Identifier
   * @param clientId clientId (required)
   * @param identifierId identifierId (required)
   * @return Observable&lt;DeleteClientsClientIdIdentifiersIdentifierIdResponse&gt;
   */
  @DELETE("clients/{clientId}/identifiers/{identifierId}")
  Observable<DeleteClientsClientIdIdentifiersIdentifierIdResponse> deleteClientIdentifier(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("identifierId") Long identifierId
  );

  /**
   * Retrieve Client Identifier Details Template
   * This is a convenience resource useful for building maintenance user interface screens for client applications. The template data returned consists of any or all of:   Field Defaults  Allowed description Lists   Example Request: clients/1/identifiers/template
   * @param clientId clientId (required)
   * @return Observable&lt;GetClientsClientIdIdentifiersTemplateResponse&gt;
   */
  @GET("clients/{clientId}/identifiers/template")
  Observable<GetClientsClientIdIdentifiersTemplateResponse> newClientIdentifierDetails(
    @retrofit2.http.Path("clientId") Long clientId
  );

  /**
   * List all Identifiers for a Client
   * Example Requests: clients/1/identifiers   clients/1/identifiers?fields&#x3D;documentKey,documentType,description
   * @param clientId clientId (required)
   * @return Observable&lt;List&lt;GetClientsClientIdIdentifiersResponse&gt;&gt;
   */
  @GET("clients/{clientId}/identifiers")
  Observable<List<GetClientsClientIdIdentifiersResponse>> retrieveAllClientIdentifiers(
    @retrofit2.http.Path("clientId") Long clientId
  );

  /**
   * Retrieve a Client Identifier
   * Example Requests: clients/1/identifier/2   clients/1/identifier/2?template&#x3D;true  clients/1/identifiers/2?fields&#x3D;documentKey,documentType,description
   * @param clientId clientId (required)
   * @param identifierId identifierId (required)
   * @return Observable&lt;GetClientsClientIdIdentifiersResponse&gt;
   */
  @GET("clients/{clientId}/identifiers/{identifierId}")
  Observable<GetClientsClientIdIdentifiersResponse> retrieveClientIdentifiers(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("identifierId") Long identifierId
  );

  /**
   * Update a Client Identifier
   * Updates a Client Identifier
   * @param clientId clientId (required)
   * @param identifierId identifierId (required)
   * @param putClientsClientIdIdentifiersIdentifierIdRequest  (required)
   * @return Observable&lt;PutClientsClientIdIdentifiersIdentifierIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("clients/{clientId}/identifiers/{identifierId}")
  Observable<PutClientsClientIdIdentifiersIdentifierIdResponse> updateClientIdentifer(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("identifierId") Long identifierId, @retrofit2.http.Body PutClientsClientIdIdentifiersIdentifierIdRequest putClientsClientIdIdentifiersIdentifierIdRequest
  );

}

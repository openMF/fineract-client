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

import org.apache.fineract.client.models.DeleteTemplatesTemplateIdResponse;
import org.apache.fineract.client.models.GetTemplatesResponse;
import org.apache.fineract.client.models.GetTemplatesTemplateIdResponse;
import org.apache.fineract.client.models.GetTemplatesTemplateResponse;
import org.apache.fineract.client.models.PostTemplatesRequest;
import org.apache.fineract.client.models.PostTemplatesResponse;
import org.apache.fineract.client.models.PutTemplatesTemplateIdRequest;
import org.apache.fineract.client.models.PutTemplatesTemplateIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserGeneratedDocumentsApi {
  /**
   * Add a UGD
   * Adds a new UGD.  Mandatory Fields name    Example Requests:  templates/1
   * @param postTemplatesRequest  (required)
   * @return Observable&lt;PostTemplatesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("templates")
  Observable<PostTemplatesResponse> createTemplate(
    @retrofit2.http.Body PostTemplatesRequest postTemplatesRequest
  );

  /**
   * Delete a UGD
   * 
   * @param templateId templateId (required)
   * @return Observable&lt;DeleteTemplatesTemplateIdResponse&gt;
   */
  @DELETE("templates/{templateId}")
  Observable<DeleteTemplatesTemplateIdResponse> deleteTemplate(
    @retrofit2.http.Path("templateId") Long templateId
  );

  /**
   * 
   * 
   * @param templateId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("templates/{templateId}/template")
  Observable<String> getTemplateByTemplate(
    @retrofit2.http.Path("templateId") Long templateId
  );

  /**
   * 
   * 
   * @param templateId  (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("templates/{templateId}")
  Observable<String> mergeTemplate(
    @retrofit2.http.Path("templateId") Long templateId, @retrofit2.http.Body String body
  );

  /**
   * Retrieve all UGDs
   * Example Requests:  templates  It is also possible to get specific UGDs by entity and type:  templates?type&#x3D;0&amp;entity&#x3D;0 [Entity: Id]      client: 0, loan: 1  [Type: Id]    Document: 0, E-Mail (not yet): 1,  SMS: 2
   * @param typeId typeId (optional, default to -1)
   * @param entityId entityId (optional, default to -1)
   * @return Observable&lt;GetTemplatesResponse&gt;
   */
  @GET("templates")
  Observable<GetTemplatesResponse> retrieveAll40(
    @retrofit2.http.Query("typeId") Integer typeId, @retrofit2.http.Query("entityId") Integer entityId
  );

  /**
   * Retrieve a UGD
   * Example Requests:  templates/1
   * @param templateId templateId (required)
   * @return Observable&lt;GetTemplatesTemplateIdResponse&gt;
   */
  @GET("templates/{templateId}")
  Observable<GetTemplatesTemplateIdResponse> retrieveOne28(
    @retrofit2.http.Path("templateId") Long templateId
  );

  /**
   * Update a UGD
   * 
   * @param templateId templateId (required)
   * @param putTemplatesTemplateIdRequest  (required)
   * @return Observable&lt;PutTemplatesTemplateIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("templates/{templateId}")
  Observable<PutTemplatesTemplateIdResponse> saveTemplate(
    @retrofit2.http.Path("templateId") Long templateId, @retrofit2.http.Body PutTemplatesTemplateIdRequest putTemplatesTemplateIdRequest
  );

  /**
   * Retrieve UGD Details Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for UGDs. The UGD data returned consists of any or all of:  ARGUMENTS name String entity String type String text String optional mappers Mapper optional Example Request:  templates/template
   * @return Observable&lt;GetTemplatesTemplateResponse&gt;
   */
  @GET("templates/template")
  Observable<GetTemplatesTemplateResponse> template20();
    

}

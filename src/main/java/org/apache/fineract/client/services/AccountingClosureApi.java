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

import org.apache.fineract.client.models.DeleteGlClosuresResponse;
import org.apache.fineract.client.models.GetGlClosureResponse;
import org.apache.fineract.client.models.PostGlClosuresRequest;
import org.apache.fineract.client.models.PostGlClosuresResponse;
import org.apache.fineract.client.models.PutGlClosuresRequest;
import org.apache.fineract.client.models.PutGlClosuresResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AccountingClosureApi {
  /**
   * Create an Accounting Closure
   * Mandatory Fields officeId,closingDate
   * @param postGlClosuresRequest  (required)
   * @return Observable&lt;PostGlClosuresResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("glclosures")
  Observable<PostGlClosuresResponse> createGLClosure(
    @retrofit2.http.Body PostGlClosuresRequest postGlClosuresRequest
  );

  /**
   * Delete an accounting closure
   * Note: Only the latest accounting closure associated with a branch may be deleted.
   * @param glClosureId glclosureId (required)
   * @return Observable&lt;DeleteGlClosuresResponse&gt;
   */
  @DELETE("glclosures/{glClosureId}")
  Observable<DeleteGlClosuresResponse> deleteGLClosure(
    @retrofit2.http.Path("glClosureId") Long glClosureId
  );

  /**
   * Retrieve an Accounting Closure
   * Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate
   * @param glClosureId glClosureId (required)
   * @return Observable&lt;GetGlClosureResponse&gt;
   */
  @GET("glclosures/{glClosureId}")
  Observable<GetGlClosureResponse> retreiveClosure(
    @retrofit2.http.Path("glClosureId") Long glClosureId
  );

  /**
   * List Accounting closures
   * Example Requests:  glclosures
   * @param officeId  (optional)
   * @return Observable&lt;List&lt;GetGlClosureResponse&gt;&gt;
   */
  @GET("glclosures")
  Observable<List<GetGlClosureResponse>> retrieveAllClosures(
    @retrofit2.http.Query("officeId") Long officeId
  );

  /**
   * Update an Accounting closure
   * Once an accounting closure is created, only the comments associated with it may be edited
   * @param glClosureId glClosureId (required)
   * @param putGlClosuresRequest  (optional)
   * @return Observable&lt;PutGlClosuresResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("glclosures/{glClosureId}")
  Observable<PutGlClosuresResponse> updateGLClosure(
    @retrofit2.http.Path("glClosureId") Long glClosureId, @retrofit2.http.Body PutGlClosuresRequest putGlClosuresRequest
  );

}

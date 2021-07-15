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

import org.apache.fineract.client.models.DeleteCodesResponse;
import org.apache.fineract.client.models.GetCodesResponse;
import org.apache.fineract.client.models.PostCodesRequest;
import org.apache.fineract.client.models.PostCodesResponse;
import org.apache.fineract.client.models.PutCodesRequest;
import org.apache.fineract.client.models.PutCodesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CodesApi {
  /**
   * Create a Code
   * Creates a code. Codes created through api are always &#39;user defined&#39; and so system defined is marked as false.
   * @param postCodesRequest  (required)
   * @return Observable&lt;PostCodesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("codes")
  Observable<PostCodesResponse> createCode(
    @retrofit2.http.Body PostCodesRequest postCodesRequest
  );

  /**
   * Delete a Code
   * Deletes a code if it is not system defined.
   * @param codeId codeId (required)
   * @return Observable&lt;DeleteCodesResponse&gt;
   */
  @DELETE("codes/{codeId}")
  Observable<DeleteCodesResponse> deleteCode(
    @retrofit2.http.Path("codeId") Long codeId
  );

  /**
   * Retrieve a Code
   * Returns the details of a Code.  Example Requests:  codes/1
   * @param codeId codeId (required)
   * @return Observable&lt;GetCodesResponse&gt;
   */
  @GET("codes/{codeId}")
  Observable<GetCodesResponse> retrieveCode(
    @retrofit2.http.Path("codeId") Long codeId
  );

  /**
   * Retrieve Codes
   * Returns the list of codes.  Example Requests:  codes
   * @return Observable&lt;List&lt;GetCodesResponse&gt;&gt;
   */
  @GET("codes")
  Observable<List<GetCodesResponse>> retrieveCodes();
    

  /**
   * Update a Code
   * Updates the details of a code if it is not system defined.
   * @param codeId codeId (required)
   * @param putCodesRequest  (required)
   * @return Observable&lt;PutCodesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("codes/{codeId}")
  Observable<PutCodesResponse> updateCode(
    @retrofit2.http.Path("codeId") Long codeId, @retrofit2.http.Body PutCodesRequest putCodesRequest
  );

}

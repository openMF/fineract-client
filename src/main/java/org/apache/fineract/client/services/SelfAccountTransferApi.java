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

import org.apache.fineract.client.models.GetAccountTransferTemplateResponse;
import org.apache.fineract.client.models.PostNewTransferResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfAccountTransferApi {
  /**
   * Create new Transfer
   * Ability to create new transfer of monetary funds from one account to another.   Example Requests:   self/accounttransfers/ 
   * @param type  (optional, default to &quot;&quot;)
   * @param body  (optional)
   * @return Observable&lt;List&lt;PostNewTransferResponse&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("self/accounttransfers")
  Observable<List<PostNewTransferResponse>> create14(
    @retrofit2.http.Query("type") String type, @retrofit2.http.Body String body
  );

  /**
   * Retrieve Account Transfer Template
   * Returns list of loan/savings accounts that can be used for account transfer   Example Requests:  self/accounttransfers/template 
   * @param type  (optional, default to &quot;&quot;)
   * @return Observable&lt;List&lt;GetAccountTransferTemplateResponse&gt;&gt;
   */
  @GET("self/accounttransfers/template")
  Observable<List<GetAccountTransferTemplateResponse>> template15(
    @retrofit2.http.Query("type") String type
  );

}

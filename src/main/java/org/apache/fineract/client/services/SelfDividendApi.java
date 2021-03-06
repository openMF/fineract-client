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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfDividendApi {
  /**
   * 
   * 
   * @param productId  (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("shareproduct/{productId}/dividend")
  Observable<String> createDividendDetail(
    @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param productId  (required)
   * @param dividendId  (required)
   * @return Observable&lt;String&gt;
   */
  @DELETE("shareproduct/{productId}/dividend/{dividendId}")
  Observable<String> deleteDividendDetail(
    @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Path("dividendId") Long dividendId
  );

  /**
   * 
   * 
   * @param productId  (required)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @param status  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("shareproduct/{productId}/dividend")
  Observable<String> retrieveAll39(
    @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("status") Integer status
  );

  /**
   * 
   * 
   * @param dividendId  (required)
   * @param productId  (required)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @param accountNo  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("shareproduct/{productId}/dividend/{dividendId}")
  Observable<String> retrieveDividendDetails(
    @retrofit2.http.Path("dividendId") Long dividendId, @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("accountNo") String accountNo
  );

  /**
   * 
   * 
   * @param productId  (required)
   * @param dividendId  (required)
   * @param command  (optional)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("shareproduct/{productId}/dividend/{dividendId}")
  Observable<String> updateDividendDetail(
    @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Path("dividendId") Long dividendId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
  );

}

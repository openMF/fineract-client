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
import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SavingsAccountTransactionsApi {
  /**
   * 
   * 
   * @param savingsId  (required)
   * @param transactionId  (required)
   * @param command  (optional)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("savingsaccounts/{savingsId}/transactions/{transactionId}")
  Call<String> adjustTransaction1(
    @retrofit2.http.Path("savingsId") Long savingsId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param savingsId  (required)
   * @param transactionId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("savingsaccounts/{savingsId}/transactions/{transactionId}")
  Call<String> retrieveOne23(
    @retrofit2.http.Path("savingsId") Long savingsId, @retrofit2.http.Path("transactionId") Long transactionId
  );

  /**
   * 
   * 
   * @param savingsId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("savingsaccounts/{savingsId}/transactions/template")
  Call<String> retrieveTemplate18(
    @retrofit2.http.Path("savingsId") Long savingsId
  );

  /**
   * 
   * 
   * @param savingsId  (required)
   * @param command  (optional)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("savingsaccounts/{savingsId}/transactions")
  Call<String> transaction2(
    @retrofit2.http.Path("savingsId") Long savingsId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
  );

}

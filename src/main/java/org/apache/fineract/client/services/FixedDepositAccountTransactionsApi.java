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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FixedDepositAccountTransactionsApi {
  /**
   * 
   * 
   * @param fixedDepositAccountId  (required)
   * @param transactionId  (required)
   * @param command  (optional)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId}")
  Observable<String> adjustTransaction(
    @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param fixedDepositAccountId  (required)
   * @param transactionId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId}")
  Observable<String> retrieveOne17(
    @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId, @retrofit2.http.Path("transactionId") Long transactionId
  );

  /**
   * 
   * 
   * @param fixedDepositAccountId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("fixeddepositaccounts/{fixedDepositAccountId}/transactions/template")
  Observable<String> retrieveTemplate13(
    @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId
  );

  /**
   * 
   * 
   * @param fixedDepositAccountId  (required)
   * @param command  (optional)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fixeddepositaccounts/{fixedDepositAccountId}/transactions")
  Observable<String> transaction(
    @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
  );

}

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

import org.apache.fineract.client.models.GetClientsClientIdTransactionsResponse;
import org.apache.fineract.client.models.GetClientsClientIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.PostClientsClientIdTransactionsTransactionIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClientTransactionApi {
  /**
   * List Client Transactions
   * The list capability of client transaction can support pagination.  Example Requests:  clients/189/transactions  clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50
   * @param clientId clientId (required)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @return Observable&lt;GetClientsClientIdTransactionsResponse&gt;
   */
  @GET("clients/{clientId}/transactions")
  Observable<GetClientsClientIdTransactionsResponse> retrieveAllClientTransactions(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * Retrieve a Client Transaction
   * Example Requests: clients/1/transactions/1   clients/1/transactions/1?fields&#x3D;id,officeName
   * @param clientId clientId (required)
   * @param transactionId transactionId (required)
   * @return Observable&lt;GetClientsClientIdTransactionsTransactionIdResponse&gt;
   */
  @GET("clients/{clientId}/transactions/{transactionId}")
  Observable<GetClientsClientIdTransactionsTransactionIdResponse> retrieveClientTransaction(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("transactionId") Long transactionId
  );

  /**
   * Undo a Client Transaction
   * Undoes a Client Transaction
   * @param clientId clientId (required)
   * @param transactionId transactionId (required)
   * @param command command (optional)
   * @return Observable&lt;PostClientsClientIdTransactionsTransactionIdResponse&gt;
   */
  @POST("clients/{clientId}/transactions/{transactionId}")
  Observable<PostClientsClientIdTransactionsTransactionIdResponse> undoClientTransaction(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Query("command") String command
  );

}

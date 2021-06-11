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

import org.apache.fineract.client.models.FormDataBodyPart;
import org.apache.fineract.client.models.GetSelfClientsClientIdAccountsResponse;
import org.apache.fineract.client.models.GetSelfClientsClientIdChargesChargeIdResponse;
import org.apache.fineract.client.models.GetSelfClientsClientIdChargesResponse;
import org.apache.fineract.client.models.GetSelfClientsClientIdResponse;
import org.apache.fineract.client.models.GetSelfClientsClientIdTransactionsResponse;
import org.apache.fineract.client.models.GetSelfClientsClientIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.GetSelfClientsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfClientApi {
  /**
   * 
   * 
   * @param clientId  (required)
   * @param contentLength  (optional)
   * @param file  (optional)
   * @return Call&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("self/clients/{clientId}/images")
  Call<String> addNewClientImage2(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part("file") FormDataBodyPart file
  );

  /**
   * 
   * 
   * @param clientId  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("self/clients/{clientId}/images")
  Call<String> deleteClientImage1(
    @retrofit2.http.Path("clientId") Long clientId
  );

  /**
   * List Clients associated to the user
   * The list capability of clients can support pagination and sorting.  Example Requests:  self/clients  self/clients?fields&#x3D;displayName,officeName  self/clients?offset&#x3D;10&amp;limit&#x3D;50  self/clients?orderBy&#x3D;displayName&amp;sortOrder&#x3D;DESC
   * @param displayName displayName (optional)
   * @param firstName firstName (optional)
   * @param lastName lastName (optional)
   * @param offset offset (optional)
   * @param status status (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @return Call&lt;GetSelfClientsResponse&gt;
   */
  @GET("self/clients")
  Call<GetSelfClientsResponse> retrieveAll36(
    @retrofit2.http.Query("displayName") String displayName, @retrofit2.http.Query("firstName") String firstName, @retrofit2.http.Query("lastName") String lastName, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("status") String status, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * List Client Charges
   * The list capability of client charges supports pagination.  Example Requests:  self/clients/1/charges  self/clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5
   * @param clientId clientId (required)
   * @param chargeStatus chargeStatus (optional, default to &quot;all&quot;)
   * @param pendingPayment pendingPayment (optional)
   * @param limit limit (optional)
   * @param offset offset (optional)
   * @return Call&lt;GetSelfClientsClientIdChargesResponse&gt;
   */
  @GET("self/clients/{clientId}/charges")
  Call<GetSelfClientsClientIdChargesResponse> retrieveAllClientCharges1(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("chargeStatus") String chargeStatus, @retrofit2.http.Query("pendingPayment") Boolean pendingPayment, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * List Client Transactions
   * The list capability of client transaction can support pagination.  Example Requests:  self/clients/189/transactions  self/clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50
   * @param clientId clientId (required)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @return Call&lt;GetSelfClientsClientIdTransactionsResponse&gt;
   */
  @GET("self/clients/{clientId}/transactions")
  Call<GetSelfClientsClientIdTransactionsResponse> retrieveAllClientTransactions1(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * Retrieve client accounts overview
   * An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:  self/clients/1/accounts   self/clients/1/accounts?fields&#x3D;loanAccounts,savingsAccounts
   * @param clientId clientId (required)
   * @return Call&lt;GetSelfClientsClientIdAccountsResponse&gt;
   */
  @GET("self/clients/{clientId}/accounts")
  Call<GetSelfClientsClientIdAccountsResponse> retrieveAssociatedAccounts1(
    @retrofit2.http.Path("clientId") Long clientId
  );

  /**
   * Retrieve a Client Charge
   * Retrieves a Client Charge  Example Requests:  self/clients/1/charges/1   self/clients/1/charges/1?fields&#x3D;name,id
   * @param clientId clientId (required)
   * @param chargeId chargeId (required)
   * @return Call&lt;GetSelfClientsClientIdChargesChargeIdResponse&gt;
   */
  @GET("self/clients/{clientId}/charges/{chargeId}")
  Call<GetSelfClientsClientIdChargesChargeIdResponse> retrieveClientCharge1(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("chargeId") Long chargeId
  );

  /**
   * Retrieve a Client Transaction
   * Retrieves a Client TransactionExample Requests:  self/clients/1/transactions/1   self/clients/1/transactions/1?fields&#x3D;id,officeName
   * @param clientId clientId (required)
   * @param transactionId transactionId (required)
   * @return Call&lt;GetSelfClientsClientIdTransactionsTransactionIdResponse&gt;
   */
  @GET("self/clients/{clientId}/transactions/{transactionId}")
  Call<GetSelfClientsClientIdTransactionsTransactionIdResponse> retrieveClientTransaction1(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("transactionId") Long transactionId
  );

  /**
   * Retrieve Client Image
   * Optional arguments are identical to those of Get Image associated with an Entity (Binary file)  Example Requests:  self/clients/1/images
   * @param clientId clientId (required)
   * @param maxWidth  (optional)
   * @param maxHeight  (optional)
   * @param output  (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("self/clients/{clientId}/images")
  Call<Void> retrieveImage1(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("maxWidth") Integer maxWidth, @retrofit2.http.Query("maxHeight") Integer maxHeight, @retrofit2.http.Query("output") String output
  );

  /**
   * 
   * 
   * @param clientId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("self/clients/{clientId}/obligeedetails")
  Call<String> retrieveObligeeDetails1(
    @retrofit2.http.Path("clientId") Long clientId
  );

  /**
   * Retrieve a Client
   * Retrieves a Client  Example Requests:  self/clients/1  self/clients/1?fields&#x3D;id,displayName,officeName
   * @param clientId clientId (required)
   * @return Call&lt;GetSelfClientsClientIdResponse&gt;
   */
  @GET("self/clients/{clientId}")
  Call<GetSelfClientsClientIdResponse> retrieveOne26(
    @retrofit2.http.Path("clientId") Long clientId
  );

}

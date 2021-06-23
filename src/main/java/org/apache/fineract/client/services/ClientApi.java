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

import org.apache.fineract.client.models.DeleteClientsClientIdResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetClientsClientIdAccountsResponse;
import org.apache.fineract.client.models.GetClientsClientIdResponse;
import org.apache.fineract.client.models.GetClientsResponse;
import org.apache.fineract.client.models.GetClientsTemplateResponse;
import org.apache.fineract.client.models.PostClientsClientIdRequest;
import org.apache.fineract.client.models.PostClientsClientIdResponse;
import org.apache.fineract.client.models.PostClientsRequest;
import org.apache.fineract.client.models.PostClientsResponse;
import org.apache.fineract.client.models.PutClientsClientIdRequest;
import org.apache.fineract.client.models.PutClientsClientIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClientApi {
  /**
   * Activate a Client | Close a Client | Reject a Client | Withdraw a Client | Reactivate a Client | UndoReject a Client | UndoWithdraw a Client | Assign a Staff | Unassign a Staff | Update Default Savings Account | Propose a Client Transfer | Withdraw a Client Transfer | Reject a Client Transfer | Accept a Client Transfer | Propose and Accept a Client Transfer
   * Activate a Client:  Clients can be created in a Pending state. This API exists to enable client activation (for when a client becomes an approved member of the financial Institution).  If the client happens to be already active this API will result in an error.  Close a Client:  Clients can be closed if they do not have any non-closed loans/savingsAccount. This API exists to close a client .  If the client have any active loans/savingsAccount this API will result in an error.  Reject a Client:  Clients can be rejected when client is in pending for activation status.  If the client is any other status, this API throws an error.  Mandatory Fields: rejectionDate, rejectionReasonId  Withdraw a Client:  Client applications can be withdrawn when client is in a pending for activation status.  If the client is any other status, this API throws an error.  Mandatory Fields: withdrawalDate, withdrawalReasonId  Reactivate a Client: Clients can be reactivated after they have been closed.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reactivationDate  UndoReject a Client:  Clients can be reactivated after they have been rejected.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reopenedDateUndoWithdraw a Client:  Clients can be reactivated after they have been withdrawn.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reopenedDate  Assign a Staff:  Allows you to assign a Staff for existed Client.  The selected Staff should belong to the same office (or an officer higher up in the hierarchy) as the Client he manages.  Unassign a Staff:  Allows you to unassign the Staff assigned to a Client.  Update Default Savings Account:  Allows you to modify or assign a default savings account for an existing Client.  The selected savings account should be one among the existing savings account for a particular customer.  Propose a Client Transfer:  Allows you to propose the transfer of a Client to a different Office.  Withdraw a Client Transfer:  Allows you to withdraw the proposed transfer of a Client to a different Office.  Withdrawal can happen only if the destination Branch (to which the transfer was proposed) has not already accepted the transfer proposal  Reject a Client Transfer:  Allows the Destination Branch to reject the proposed Client Transfer.  Accept a Client Transfer:  Allows the Destination Branch to accept the proposed Client Transfer.  The destination branch may also choose to link this client to a group (in which case, any existing active JLG loan of the client is rescheduled to match the meeting frequency of the group) and loan Officer at the time of accepting the transfer  Propose and Accept a Client Transfer:  Abstraction over the Propose and Accept Client Transfer API&#39;s which enable a user with Data Scope over both the Target and Destination Branches to directly transfer a Client to the destination Office.  Showing request/response for &#39;Reject a Client Transfer&#39;
   * @param clientId clientId (required)
   * @param postClientsClientIdRequest  (required)
   * @param command command (optional)
   * @return Observable&lt;PostClientsClientIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clients/{clientId}")
  Observable<PostClientsClientIdResponse> activate1(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body PostClientsClientIdRequest postClientsClientIdRequest, @retrofit2.http.Query("command") String command
  );

  /**
   * Create a Client
   * Note:  1. You can enter either:firstname/middlename/lastname - for a person (middlename is optional) OR fullname - for a business or organisation (or person known by one name).  2.If address is enable(enable-address&#x3D;true), then additional field called address has to be passed.  Mandatory Fields: firstname and lastname OR fullname, officeId, active&#x3D;true and activationDate OR active&#x3D;false, if(address enabled) address  Optional Fields: groupId, externalId, accountNo, staffId, mobileNo, savingsProductId, genderId, clientTypeId, clientClassificationId
   * @param postClientsRequest  (required)
   * @return Observable&lt;PostClientsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clients")
  Observable<PostClientsResponse> create6(
    @retrofit2.http.Body PostClientsRequest postClientsRequest
  );

  /**
   * Delete a Client
   * If a client is in Pending state, you are allowed to Delete it. The delete is a &#39;hard delete&#39; and cannot be recovered from. Once clients become active or have loans or savings associated with them, you cannot delete the client but you may Close the client if they have left the program.
   * @param clientId clientId (required)
   * @param body  (required)
   * @return Observable&lt;DeleteClientsClientIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("clients/{clientId}")
  Observable<DeleteClientsClientIdResponse> delete9(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body Object body
  );

  /**
   * 
   * 
   * @param legalFormType  (optional)
   * @param officeId  (optional)
   * @param staffId  (optional)
   * @param dateFormat  (optional)
   * @return Completable
   */
  @GET("clients/downloadtemplate")
  Completable getClientTemplate(
    @retrofit2.http.Query("legalFormType") String legalFormType, @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * 
   * 
   * @param legalFormType  (optional)
   * @param file  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Observable&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("clients/uploadtemplate")
  Observable<String> postClientTemplate(
    @retrofit2.http.Query("legalFormType") String legalFormType, @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * List Clients
   * The list capability of clients can support pagination and sorting.  Example Requests:  clients  clients?fields&#x3D;displayName,officeName,timeline  clients?offset&#x3D;10&amp;limit&#x3D;50  clients?orderBy&#x3D;displayName&amp;sortOrder&#x3D;DESC
   * @param sqlSearch sqlSearch (optional)
   * @param officeId officeId (optional)
   * @param externalId externalId (optional)
   * @param displayName displayName (optional)
   * @param firstName firstName (optional)
   * @param lastName lastName (optional)
   * @param status status (optional)
   * @param underHierarchy underHierarchy (optional)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @param orphansOnly orphansOnly (optional)
   * @return Observable&lt;GetClientsResponse&gt;
   */
  @GET("clients")
  Observable<GetClientsResponse> retrieveAll21(
    @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("externalId") String externalId, @retrofit2.http.Query("displayName") String displayName, @retrofit2.http.Query("firstName") String firstName, @retrofit2.http.Query("lastName") String lastName, @retrofit2.http.Query("status") String status, @retrofit2.http.Query("underHierarchy") String underHierarchy, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("orphansOnly") Boolean orphansOnly
  );

  /**
   * Retrieve client accounts overview
   * An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:   clients/1/accounts  clients/1/accounts?fields&#x3D;loanAccounts,savingsAccounts
   * @param clientId clientId (required)
   * @return Observable&lt;GetClientsClientIdAccountsResponse&gt;
   */
  @GET("clients/{clientId}/accounts")
  Observable<GetClientsClientIdAccountsResponse> retrieveAssociatedAccounts(
    @retrofit2.http.Path("clientId") Long clientId
  );

  /**
   * 
   * 
   * @param clientId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("clients/{clientId}/obligeedetails")
  Observable<String> retrieveObligeeDetails(
    @retrofit2.http.Path("clientId") Long clientId
  );

  /**
   * Retrieve a Client
   * Example Requests:  clients/1   clients/1?template&#x3D;true   clients/1?fields&#x3D;id,displayName,officeName
   * @param clientId clientId (required)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @return Observable&lt;GetClientsClientIdResponse&gt;
   */
  @GET("clients/{clientId}")
  Observable<GetClientsClientIdResponse> retrieveOne11(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly
  );

  /**
   * Retrieve Client Details Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  clients/template
   * @param officeId officeId (optional)
   * @param commandParam commandParam (optional)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @return Observable&lt;GetClientsTemplateResponse&gt;
   */
  @GET("clients/template")
  Observable<GetClientsTemplateResponse> retrieveTemplate5(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("commandParam") String commandParam, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly
  );

  /**
   * 
   * 
   * @param clientId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("clients/{clientId}/transferproposaldate")
  Observable<String> retrieveTransferTemplate(
    @retrofit2.http.Path("clientId") Long clientId
  );

  /**
   * Update a Client
   * Note: You can update any of the basic attributes of a client (but not its associations) using this API.  Changing the relationship between a client and its office is not supported through this API. An API specific to handling transfers of clients between offices is available for the same.  The relationship between a client and a group must be removed through the Groups API.
   * @param clientId clientId (required)
   * @param putClientsClientIdRequest  (required)
   * @return Observable&lt;PutClientsClientIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("clients/{clientId}")
  Observable<PutClientsClientIdResponse> update10(
    @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body PutClientsClientIdRequest putClientsClientIdRequest
  );

}

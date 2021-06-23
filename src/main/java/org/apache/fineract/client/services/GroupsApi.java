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

import org.apache.fineract.client.models.DeleteGroupsGroupIdResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetGroupsGroupIdAccountsResponse;
import org.apache.fineract.client.models.GetGroupsGroupIdResponse;
import org.apache.fineract.client.models.GetGroupsResponse;
import org.apache.fineract.client.models.GetGroupsTemplateResponse;
import org.apache.fineract.client.models.PostGroupsGroupIdCommandUnassignStaffRequest;
import org.apache.fineract.client.models.PostGroupsGroupIdCommandUnassignStaffResponse;
import org.apache.fineract.client.models.PostGroupsGroupIdRequest;
import org.apache.fineract.client.models.PostGroupsGroupIdResponse;
import org.apache.fineract.client.models.PostGroupsRequest;
import org.apache.fineract.client.models.PostGroupsResponse;
import org.apache.fineract.client.models.PutGroupsGroupIdRequest;
import org.apache.fineract.client.models.PutGroupsGroupIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GroupsApi {
  /**
   * Activate a Group | Associate Clients | Disassociate Clients | Transfer Clients across groups | Generate Collection Sheet | Save Collection Sheet | Unassign a Staff | Assign a Staff | Close a Group | Unassign a Role | Update a Role
   * Activate a Group:  Groups can be created in a Pending state. This API exists to enable group activation.    If the group happens to be already active this API will result in an error.  Mandatory Fields: activationDate  Associate Clients:  This API allows to associate existing clients to a group.    The clients are listed from the office to which the group is associated.    If client(s) is already associated with group then API will result in an error.  Mandatory Fields: clientMembers  Disassociate Clients:  This API allows to disassociate clients from a group.    Disassociating a client with active joint liability group loans results in an error.  Mandatory Fields: clientMembers  Transfer Clients across groups:  This API allows to transfer clients from one group to another  Mandatory Fields: destinationGroupId and clients  Optional Fields: inheritDestinationGroupLoanOfficer (defaults to true) and transferActiveLoans (defaults to true)  Generate Collection Sheet:  This API retrieves repayment details of all jlg loans of all members of a group on a specified meeting date.  Mandatory Fields: calendarId and transactionDate  Save Collection Sheet:  This api allows the loan officer to perform bulk repayments of JLG loans for a group on its meeting date.  Mandatory Fields: calendarId, transactionDate, actualDisbursementDate  Optional Fields: clientsAttendance, bulkRepaymentTransaction, bulkDisbursementTransactions  Unassign a Staff:  Allows you to unassign the Staff.  Mandatory Fields: staffId  Assign a Staff:  Allows you to assign Staff to an existing Group.    The selected Staff should be belong to the same office (or an office higher up in the hierarchy) as this groupMandatory Fields: staffId  Optional Fields: inheritStaffForClientAccounts (Optional: Boolean if true all members of the group (i.e all clients with active loans and savings ) will inherit the staffId)  Close a Group:  This API exists to close a group. Groups can be closed if they don&#39;t have any non-closed clients/loans/savingsAccounts.    If the group has any active clients/loans/savingsAccount, this API will result in an error.Assign a Role:  Allows you to assign a Role to an existing member of a group.    We can define the different roles applicable to group members by adding code values to the pre-defined system code GROUPROLE. Example:Group leader etc.  Mandatory Fields: clientId, role  Unassign a Role:  Allows you to unassign Roles associated tp Group members.  Update a Role:  Allows you to update the member Role.  Mandatory Fields: role  Showing request/response for Transfer Clients across groups
   * @param groupId groupId (required)
   * @param postGroupsGroupIdRequest  (required)
   * @param command command (optional)
   * @param roleId roleId (optional)
   * @return Observable&lt;PostGroupsGroupIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("groups/{groupId}")
  Observable<PostGroupsGroupIdResponse> activateOrGenerateCollectionSheet(
    @retrofit2.http.Path("groupId") Long groupId, @retrofit2.http.Body PostGroupsGroupIdRequest postGroupsGroupIdRequest, @retrofit2.http.Query("command") String command, @retrofit2.http.Query("roleId") Long roleId
  );

  /**
   * Create a Group
   * Creates a Group  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, clientMembers
   * @param postGroupsRequest  (required)
   * @return Observable&lt;PostGroupsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("groups")
  Observable<PostGroupsResponse> create8(
    @retrofit2.http.Body PostGroupsRequest postGroupsRequest
  );

  /**
   * Delete a Group
   * A group can be deleted if it is in pending state and has no associations - clients, loans or savings
   * @param groupId groupId (required)
   * @return Observable&lt;DeleteGroupsGroupIdResponse&gt;
   */
  @DELETE("groups/{groupId}")
  Observable<DeleteGroupsGroupIdResponse> delete11(
    @retrofit2.http.Path("groupId") Long groupId
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param staffId  (optional)
   * @param dateFormat  (optional)
   * @return Completable
   */
  @GET("groups/downloadtemplate")
  Completable getGroupsTemplate(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * 
   * 
   * @param file  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Observable&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("groups/uploadtemplate")
  Observable<String> postGroupTemplate(
    @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * Retrieve Group accounts overview
   * Retrieves details of all Loan and Savings accounts associated with this group.    Example Requests:    groups/1/accounts      groups/1/accounts?fields&#x3D;loanAccounts,savingsAccounts,memberLoanAccounts,  memberSavingsAccounts
   * @param groupId groupId (required)
   * @return Observable&lt;GetGroupsGroupIdAccountsResponse&gt;
   */
  @GET("groups/{groupId}/accounts")
  Observable<GetGroupsGroupIdAccountsResponse> retrieveAccounts(
    @retrofit2.http.Path("groupId") Long groupId
  );

  /**
   * List Groups
   * The default implementation of listing Groups returns 200 entries with support for pagination and sorting. Using the parameter limit with description -1 returns all entries.  Example Requests:    groups    groups?fields&#x3D;name,officeName,joinedDate    groups?offset&#x3D;10&amp;limit&#x3D;50    groups?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC
   * @param officeId officeId (optional)
   * @param staffId staffId (optional)
   * @param externalId externalId (optional)
   * @param name name (optional)
   * @param underHierarchy underHierarchy (optional)
   * @param paged paged (optional)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @param orphansOnly orphansOnly (optional)
   * @return Observable&lt;GetGroupsResponse&gt;
   */
  @GET("groups")
  Observable<GetGroupsResponse> retrieveAll24(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("externalId") String externalId, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("underHierarchy") String underHierarchy, @retrofit2.http.Query("paged") Boolean paged, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("orphansOnly") Boolean orphansOnly
  );

  /**
   * 
   * 
   * @param groupId  (required)
   * @param parentGSIMAccountNo  (optional)
   * @param parentGSIMId  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("groups/{groupId}/gsimaccounts")
  Observable<String> retrieveGsimAccounts(
    @retrofit2.http.Path("groupId") Long groupId, @retrofit2.http.Query("parentGSIMAccountNo") String parentGSIMAccountNo, @retrofit2.http.Query("parentGSIMId") Long parentGSIMId
  );

  /**
   * Retrieve a Group
   * Retrieve group information.  Example Requests:    groups/1    groups/1?associations&#x3D;clientMembers
   * @param groupId groupId (required)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @param roleId roleId (optional)
   * @return Observable&lt;GetGroupsGroupIdResponse&gt;
   */
  @GET("groups/{groupId}")
  Observable<GetGroupsGroupIdResponse> retrieveOne14(
    @retrofit2.http.Path("groupId") Long groupId, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly, @retrofit2.http.Query("roleId") Long roleId
  );

  /**
   * Retrieve Group Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    groups/template    groups/template?officeId&#x3D;2    groups/template?centerId&#x3D;1    groups/template?centerId&#x3D;1&amp;staffInSelectedOfficeOnly&#x3D;true
   * @param officeId officeId (optional)
   * @param center center (optional)
   * @param centerId centerId (optional)
   * @param command command (optional)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @return Observable&lt;GetGroupsTemplateResponse&gt;
   */
  @GET("groups/template")
  Observable<GetGroupsTemplateResponse> retrieveTemplate7(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("center") Boolean center, @retrofit2.http.Query("centerId") Long centerId, @retrofit2.http.Query("command") String command, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly
  );

  /**
   * 
   * 
   * @param groupId  (required)
   * @param parentLoanAccountNo  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("groups/{groupId}/glimaccounts")
  Observable<String> retrieveglimAccounts(
    @retrofit2.http.Path("groupId") Long groupId, @retrofit2.http.Query("parentLoanAccountNo") String parentLoanAccountNo
  );

  /**
   * Unassign a Staff
   * Allows you to unassign the Staff.  Mandatory Fields: staffId
   * @param groupId groupId (required)
   * @param postGroupsGroupIdCommandUnassignStaffRequest  (required)
   * @return Observable&lt;PostGroupsGroupIdCommandUnassignStaffResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("groups/{groupId}/command/unassign_staff")
  Observable<PostGroupsGroupIdCommandUnassignStaffResponse> unassignLoanOfficer(
    @retrofit2.http.Path("groupId") Long groupId, @retrofit2.http.Body PostGroupsGroupIdCommandUnassignStaffRequest postGroupsGroupIdCommandUnassignStaffRequest
  );

  /**
   * Update a Group
   * Updates a Group
   * @param groupId groupId (required)
   * @param putGroupsGroupIdRequest  (required)
   * @return Observable&lt;PutGroupsGroupIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("groups/{groupId}")
  Observable<PutGroupsGroupIdResponse> update12(
    @retrofit2.http.Path("groupId") Long groupId, @retrofit2.http.Body PutGroupsGroupIdRequest putGroupsGroupIdRequest
  );

}

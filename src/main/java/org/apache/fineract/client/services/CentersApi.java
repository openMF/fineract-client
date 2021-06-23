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

import org.apache.fineract.client.models.DeleteCentersCenterIdResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetCentersCenterIdAccountsResponse;
import org.apache.fineract.client.models.GetCentersCenterIdResponse;
import org.apache.fineract.client.models.GetCentersResponse;
import org.apache.fineract.client.models.GetCentersTemplateResponse;
import org.apache.fineract.client.models.PostCentersCenterIdRequest;
import org.apache.fineract.client.models.PostCentersCenterIdResponse;
import org.apache.fineract.client.models.PostCentersRequest;
import org.apache.fineract.client.models.PostCentersResponse;
import org.apache.fineract.client.models.PutCentersCenterIdRequest;
import org.apache.fineract.client.models.PutCentersCenterIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CentersApi {
  /**
   * Activate a Center | Generate Collection Sheet | Save Collection Sheet | Close a Center | Associate Groups | Disassociate Groups
   * Activate a Center:  Centers can be created in a Pending state. This API exists to enable center activation. If the center happens to be already active, this API will result in an error.  Close a Center:  Centers can be closed if they don&#39;t have any non-closed groups or saving accounts. If the Center has any active groups or savings accounts, this API will result in an error.  Associate Groups:  This API allows associating existing groups to a center. The groups are listed from the office to which the center is associated. If group(s) is already associated with a center, this API will result in an error.  Disassociate Groups:  This API allows to disassociate groups from a center.  Generate Collection Sheet:  This Api retrieves repayment details of all jlg loans under a center as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of JLG loans for a center on a given meeting date.  Showing Request/Response for Close a Center
   * @param centerId centerId (required)
   * @param postCentersCenterIdRequest  (required)
   * @param command command (optional)
   * @return Observable&lt;PostCentersCenterIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("centers/{centerId}")
  Observable<PostCentersCenterIdResponse> activate2(
    @retrofit2.http.Path("centerId") Long centerId, @retrofit2.http.Body PostCentersCenterIdRequest postCentersCenterIdRequest, @retrofit2.http.Query("command") String command
  );

  /**
   * Create a Center
   * Creates a Center  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, groupMembers
   * @param postCentersRequest  (required)
   * @return Observable&lt;PostCentersResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("centers")
  Observable<PostCentersResponse> create7(
    @retrofit2.http.Body PostCentersRequest postCentersRequest
  );

  /**
   * Delete a Center
   * A Center can be deleted if it is in pending state and has no association - groups, loans or savings
   * @param centerId centerId (required)
   * @return Observable&lt;DeleteCentersCenterIdResponse&gt;
   */
  @DELETE("centers/{centerId}")
  Observable<DeleteCentersCenterIdResponse> delete10(
    @retrofit2.http.Path("centerId") Long centerId
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param staffId  (optional)
   * @param dateFormat  (optional)
   * @return Completable
   */
  @GET("centers/downloadtemplate")
  Completable getCentersTemplate(
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
  @POST("centers/uploadtemplate")
  Observable<String> postCentersTemplate(
    @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * List Centers
   * The default implementation supports pagination and sorting with the default pagination size set to 200 records. The parameter limit with description -1 will return all entries.  Example Requests:    centers    centers?fields&#x3D;name,officeName,joinedDate    centers?offset&#x3D;10&amp;limit&#x3D;50    centers?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC
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
   * @param meetingDate meetingDate (optional)
   * @param dateFormat dateFormat (optional)
   * @param locale locale (optional)
   * @return Observable&lt;GetCentersResponse&gt;
   */
  @GET("centers")
  Observable<GetCentersResponse> retrieveAll23(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("externalId") String externalId, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("underHierarchy") String underHierarchy, @retrofit2.http.Query("paged") Boolean paged, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("meetingDate") Object meetingDate, @retrofit2.http.Query("dateFormat") String dateFormat, @retrofit2.http.Query("locale") String locale
  );

  /**
   * Retrieve Center accounts overview
   * An example of how a savings summary for a Center can be provided. This is requested in a specific use case of the reference application.  It is quite reasonable to add resources like this to simplify User Interface development.    Example Requests:    centers/9/accounts
   * @param centerId centerId (required)
   * @return Observable&lt;GetCentersCenterIdAccountsResponse&gt;
   */
  @GET("centers/{centerId}/accounts")
  Observable<GetCentersCenterIdAccountsResponse> retrieveGroupAccount(
    @retrofit2.http.Path("centerId") Long centerId
  );

  /**
   * Retrieve a Center
   * Retrieves a Center  Example Requests:    centers/1    centers/1?associations&#x3D;groupMembers
   * @param centerId centerId (required)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @return Observable&lt;GetCentersCenterIdResponse&gt;
   */
  @GET("centers/{centerId}")
  Observable<GetCentersCenterIdResponse> retrieveOne13(
    @retrofit2.http.Path("centerId") Long centerId, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly
  );

  /**
   * Retrieve a Center Template
   * Retrieves a Center Template  Example Requests:    centers/template    centers/template?officeId&#x3D;2
   * @param command command (optional)
   * @param officeId officeId (optional)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @return Observable&lt;GetCentersTemplateResponse&gt;
   */
  @GET("centers/template")
  Observable<GetCentersTemplateResponse> retrieveTemplate6(
    @retrofit2.http.Query("command") String command, @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly
  );

  /**
   * Update a Center
   * Updates a Center
   * @param centerId centerId (required)
   * @param putCentersCenterIdRequest  (required)
   * @return Observable&lt;PutCentersCenterIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("centers/{centerId}")
  Observable<PutCentersCenterIdResponse> update11(
    @retrofit2.http.Path("centerId") Long centerId, @retrofit2.http.Body PutCentersCenterIdRequest putCentersCenterIdRequest
  );

}

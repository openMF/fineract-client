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

import org.apache.fineract.client.models.CreateStaffResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.PostStaffRequest;
import org.apache.fineract.client.models.PutStaffRequest;
import org.apache.fineract.client.models.RetrieveOneResponse;
import org.apache.fineract.client.models.UpdateStaffResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StaffApi {
  /**
   * Create a staff member
   * Creates a staff member.  Mandatory Fields:  officeId, firstname, lastname  Optional Fields:  isLoanOfficer, isActive
   * @param postStaffRequest  (required)
   * @return Call&lt;CreateStaffResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("staff")
  Call<CreateStaffResponse> create3(
    @retrofit2.http.Body PostStaffRequest postStaffRequest
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("staff/downloadtemplate")
  Call<Void> getTemplate1(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * 
   * 
   * @param file  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("staff/uploadtemplate")
  Call<String> postTemplate(
    @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * Retrieve Staff
   * Returns the list of staff members.  Example Requests:  staff     Retrieve a Staff by status  Returns the details of a Staff based on status.  By default it Returns all the ACTIVE Staff.  If status&#x3D;INACTIVE, then it returns all INACTIVE Staff.  and for status&#x3D;ALL, it Returns both ACTIVE and INACTIVE Staff.  Example Requests:  staff?status&#x3D;active
   * @param officeId officeId (optional)
   * @param staffInOfficeHierarchy staffInOfficeHierarchy (optional, default to false)
   * @param loanOfficersOnly loanOfficersOnly (optional, default to false)
   * @param status status (optional, default to &quot;active&quot;)
   * @return Call&lt;List&lt;RetrieveOneResponse&gt;&gt;
   */
  @GET("staff")
  Call<List<RetrieveOneResponse>> retrieveAll16(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffInOfficeHierarchy") Boolean staffInOfficeHierarchy, @retrofit2.http.Query("loanOfficersOnly") Boolean loanOfficersOnly, @retrofit2.http.Query("status") String status
  );

  /**
   * Retrieve a Staff Member
   * Returns the details of a Staff Member.  Example Requests:  staff/1
   * @param staffId staffId (required)
   * @return Call&lt;RetrieveOneResponse&gt;
   */
  @GET("staff/{staffId}")
  Call<RetrieveOneResponse> retrieveOne8(
    @retrofit2.http.Path("staffId") Long staffId
  );

  /**
   * Update a Staff Member
   * Updates the details of a staff member.
   * @param staffId staffId (required)
   * @param putStaffRequest  (required)
   * @return Call&lt;UpdateStaffResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("staff/{staffId}")
  Call<UpdateStaffResponse> update7(
    @retrofit2.http.Path("staffId") Long staffId, @retrofit2.http.Body PutStaffRequest putStaffRequest
  );

}

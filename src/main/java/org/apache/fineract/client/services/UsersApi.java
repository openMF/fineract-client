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

import org.apache.fineract.client.models.DeleteUsersUserIdResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetUsersResponse;
import org.apache.fineract.client.models.GetUsersTemplateResponse;
import org.apache.fineract.client.models.GetUsersUserIdResponse;
import org.apache.fineract.client.models.PostUsersRequest;
import org.apache.fineract.client.models.PostUsersResponse;
import org.apache.fineract.client.models.PutUsersUserIdRequest;
import org.apache.fineract.client.models.PutUsersUserIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UsersApi {
  /**
   * Create a User
   * Adds new application user.  Note: Password information is not required (or processed). Password details at present are auto-generated and then sent to the email account given (which is why it can take a few seconds to complete).  Mandatory Fields:  username, firstname, lastname, email, officeId, roles, sendPasswordToEmail  Optional Fields:  staffId,passwordNeverExpires,isSelfServiceUser,clients
   * @param postUsersRequest  (required)
   * @return Observable&lt;PostUsersResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users")
  Observable<PostUsersResponse> create15(
    @retrofit2.http.Body PostUsersRequest postUsersRequest
  );

  /**
   * Delete a User
   * Removes the user and the associated roles and permissions.
   * @param userId userId (required)
   * @return Observable&lt;DeleteUsersUserIdResponse&gt;
   */
  @DELETE("users/{userId}")
  Observable<DeleteUsersUserIdResponse> delete21(
    @retrofit2.http.Path("userId") Long userId
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param staffId  (optional)
   * @param dateFormat  (optional)
   * @return Observable&lt;Void&gt;
   */
  @GET("users/downloadtemplate")
  Observable<Void> getUserTemplate(
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
  @POST("users/uploadtemplate")
  Observable<String> postUsersTemplate(
    @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * Retrieve list of users
   * Example Requests:  users   users?fields&#x3D;id,username,email,officeName
   * @return Observable&lt;List&lt;GetUsersResponse&gt;&gt;
   */
  @GET("users")
  Observable<List<GetUsersResponse>> retrieveAll41();
    

  /**
   * Retrieve a User
   * Example Requests:  users/1   users/1?template&#x3D;true   users/1?fields&#x3D;username,officeName
   * @param userId userId (required)
   * @return Observable&lt;GetUsersUserIdResponse&gt;
   */
  @GET("users/{userId}")
  Observable<GetUsersUserIdResponse> retrieveOne29(
    @retrofit2.http.Path("userId") Long userId
  );

  /**
   * Retrieve User Details Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  users/template
   * @return Observable&lt;GetUsersTemplateResponse&gt;
   */
  @GET("users/template")
  Observable<GetUsersTemplateResponse> template22();
    

  /**
   * Update a User
   * When updating a password you must provide the repeatPassword parameter also.
   * @param userId userId (required)
   * @param putUsersUserIdRequest  (required)
   * @return Observable&lt;PutUsersUserIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{userId}")
  Observable<PutUsersUserIdResponse> update24(
    @retrofit2.http.Path("userId") Long userId, @retrofit2.http.Body PutUsersUserIdRequest putUsersUserIdRequest
  );

}

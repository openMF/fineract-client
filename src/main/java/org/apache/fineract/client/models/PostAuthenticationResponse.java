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
/*
 * Apache Fineract
 * Apache Fineract is a secure, multi-tenanted microfinance platform  The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform<br>The [reference app](https://cui.fineract.dev) (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation  - The API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) - Find out more about Apache Fineract [here](/fineract-provider/api-docs/apiLive.htm#top) - You can [Try The API From Your Browser](/fineract-provider/api-docs/apiLive.htm#interact) - The Generic Options are available [here](/fineract-provider/api-docs/apiLive.htm#genopts) - Find out more about [Updating Dates and Numbers](/fineract-provider/api-docs/apiLive.htm#dates_and_numbers) - For the Authentication and the Basic of HTTP and HTTPS refer [here](/fineract-provider/api-docs/apiLive.htm#authentication_overview) - Check about ERROR codes [here](/fineract-provider/api-docs/apiLive.htm#errors)  Please refer to the [old documentation](/fineract-provider/api-docs/apiLive.htm) for any documentation queries
 *
 * The version of the OpenAPI document: 1.5.0-11-gd287218-dirty
 * Contact: dev@fineract.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.fineract.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.EnumOptionData;
import org.apache.fineract.client.models.RoleData;

/**
 * PostAuthenticationResponse
 */
@ApiModel(description = "PostAuthenticationResponse")

public class PostAuthenticationResponse {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public static final String SERIALIZED_NAME_BASE64_ENCODED_AUTHENTICATION_KEY = "base64EncodedAuthenticationKey";
  @SerializedName(SERIALIZED_NAME_BASE64_ENCODED_AUTHENTICATION_KEY)
  private String base64EncodedAuthenticationKey;

  public static final String SERIALIZED_NAME_AUTHENTICATED = "authenticated";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATED)
  private Boolean authenticated;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Long officeId;

  public static final String SERIALIZED_NAME_OFFICE_NAME = "officeName";
  @SerializedName(SERIALIZED_NAME_OFFICE_NAME)
  private String officeName;

  public static final String SERIALIZED_NAME_STAFF_ID = "staffId";
  @SerializedName(SERIALIZED_NAME_STAFF_ID)
  private Long staffId;

  public static final String SERIALIZED_NAME_STAFF_DISPLAY_NAME = "staffDisplayName";
  @SerializedName(SERIALIZED_NAME_STAFF_DISPLAY_NAME)
  private String staffDisplayName;

  public static final String SERIALIZED_NAME_ORGANISATIONAL_ROLE = "organisationalRole";
  @SerializedName(SERIALIZED_NAME_ORGANISATIONAL_ROLE)
  private EnumOptionData organisationalRole;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<RoleData> roles = null;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<String> permissions = null;


  public PostAuthenticationResponse username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mifos", value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public PostAuthenticationResponse userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public PostAuthenticationResponse base64EncodedAuthenticationKey(String base64EncodedAuthenticationKey) {
    
    this.base64EncodedAuthenticationKey = base64EncodedAuthenticationKey;
    return this;
  }

   /**
   * Get base64EncodedAuthenticationKey
   * @return base64EncodedAuthenticationKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bWlmb3M6cGFzc3dvcmQ=", value = "")

  public String getBase64EncodedAuthenticationKey() {
    return base64EncodedAuthenticationKey;
  }


  public void setBase64EncodedAuthenticationKey(String base64EncodedAuthenticationKey) {
    this.base64EncodedAuthenticationKey = base64EncodedAuthenticationKey;
  }


  public PostAuthenticationResponse authenticated(Boolean authenticated) {
    
    this.authenticated = authenticated;
    return this;
  }

   /**
   * Get authenticated
   * @return authenticated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getAuthenticated() {
    return authenticated;
  }


  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }


  public PostAuthenticationResponse officeId(Long officeId) {
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getOfficeId() {
    return officeId;
  }


  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }


  public PostAuthenticationResponse officeName(String officeName) {
    
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Head Office", value = "")

  public String getOfficeName() {
    return officeName;
  }


  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }


  public PostAuthenticationResponse staffId(Long staffId) {
    
    this.staffId = staffId;
    return this;
  }

   /**
   * Get staffId
   * @return staffId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getStaffId() {
    return staffId;
  }


  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }


  public PostAuthenticationResponse staffDisplayName(String staffDisplayName) {
    
    this.staffDisplayName = staffDisplayName;
    return this;
  }

   /**
   * Get staffDisplayName
   * @return staffDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Director, Program", value = "")

  public String getStaffDisplayName() {
    return staffDisplayName;
  }


  public void setStaffDisplayName(String staffDisplayName) {
    this.staffDisplayName = staffDisplayName;
  }


  public PostAuthenticationResponse organisationalRole(EnumOptionData organisationalRole) {
    
    this.organisationalRole = organisationalRole;
    return this;
  }

   /**
   * Get organisationalRole
   * @return organisationalRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getOrganisationalRole() {
    return organisationalRole;
  }


  public void setOrganisationalRole(EnumOptionData organisationalRole) {
    this.organisationalRole = organisationalRole;
  }


  public PostAuthenticationResponse roles(List<RoleData> roles) {
    
    this.roles = roles;
    return this;
  }

  public PostAuthenticationResponse addRolesItem(RoleData rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<RoleData>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RoleData> getRoles() {
    return roles;
  }


  public void setRoles(List<RoleData> roles) {
    this.roles = roles;
  }


  public PostAuthenticationResponse permissions(List<String> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public PostAuthenticationResponse addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<String>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALL_FUNCTIONS", value = "")

  public List<String> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAuthenticationResponse postAuthenticationResponse = (PostAuthenticationResponse) o;
    return Objects.equals(this.username, postAuthenticationResponse.username) &&
        Objects.equals(this.userId, postAuthenticationResponse.userId) &&
        Objects.equals(this.base64EncodedAuthenticationKey, postAuthenticationResponse.base64EncodedAuthenticationKey) &&
        Objects.equals(this.authenticated, postAuthenticationResponse.authenticated) &&
        Objects.equals(this.officeId, postAuthenticationResponse.officeId) &&
        Objects.equals(this.officeName, postAuthenticationResponse.officeName) &&
        Objects.equals(this.staffId, postAuthenticationResponse.staffId) &&
        Objects.equals(this.staffDisplayName, postAuthenticationResponse.staffDisplayName) &&
        Objects.equals(this.organisationalRole, postAuthenticationResponse.organisationalRole) &&
        Objects.equals(this.roles, postAuthenticationResponse.roles) &&
        Objects.equals(this.permissions, postAuthenticationResponse.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, userId, base64EncodedAuthenticationKey, authenticated, officeId, officeName, staffId, staffDisplayName, organisationalRole, roles, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAuthenticationResponse {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    base64EncodedAuthenticationKey: ").append(toIndentedString(base64EncodedAuthenticationKey)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffDisplayName: ").append(toIndentedString(staffDisplayName)).append("\n");
    sb.append("    organisationalRole: ").append(toIndentedString(organisationalRole)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


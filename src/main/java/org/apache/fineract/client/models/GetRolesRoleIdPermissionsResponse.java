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
import org.apache.fineract.client.models.GetRolesRoleIdPermissionsResponsePermissionData;

/**
 * GetRolesRoleIdPermissionsResponse
 */
@ApiModel(description = "GetRolesRoleIdPermissionsResponse")

public class GetRolesRoleIdPermissionsResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PERMISSION_USAGE_DATA = "permissionUsageData";
  @SerializedName(SERIALIZED_NAME_PERMISSION_USAGE_DATA)
  private List<GetRolesRoleIdPermissionsResponsePermissionData> permissionUsageData = null;


  public GetRolesRoleIdPermissionsResponse id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public GetRolesRoleIdPermissionsResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Super Users", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetRolesRoleIdPermissionsResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This role provides all application permissions.", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetRolesRoleIdPermissionsResponse permissionUsageData(List<GetRolesRoleIdPermissionsResponsePermissionData> permissionUsageData) {
    
    this.permissionUsageData = permissionUsageData;
    return this;
  }

  public GetRolesRoleIdPermissionsResponse addPermissionUsageDataItem(GetRolesRoleIdPermissionsResponsePermissionData permissionUsageDataItem) {
    if (this.permissionUsageData == null) {
      this.permissionUsageData = new ArrayList<GetRolesRoleIdPermissionsResponsePermissionData>();
    }
    this.permissionUsageData.add(permissionUsageDataItem);
    return this;
  }

   /**
   * Get permissionUsageData
   * @return permissionUsageData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetRolesRoleIdPermissionsResponsePermissionData> getPermissionUsageData() {
    return permissionUsageData;
  }


  public void setPermissionUsageData(List<GetRolesRoleIdPermissionsResponsePermissionData> permissionUsageData) {
    this.permissionUsageData = permissionUsageData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRolesRoleIdPermissionsResponse getRolesRoleIdPermissionsResponse = (GetRolesRoleIdPermissionsResponse) o;
    return Objects.equals(this.id, getRolesRoleIdPermissionsResponse.id) &&
        Objects.equals(this.name, getRolesRoleIdPermissionsResponse.name) &&
        Objects.equals(this.description, getRolesRoleIdPermissionsResponse.description) &&
        Objects.equals(this.permissionUsageData, getRolesRoleIdPermissionsResponse.permissionUsageData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, permissionUsageData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRolesRoleIdPermissionsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    permissionUsageData: ").append(toIndentedString(permissionUsageData)).append("\n");
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


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
 * The version of the OpenAPI document: 1.5.0-23-g1ac2469-dirty
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
import org.apache.fineract.client.models.GetGroupsTemplateClientOptions;
import org.apache.fineract.client.models.GetGroupsTemplateDatatables;
import org.apache.fineract.client.models.GetGroupsTemplateOfficeOptions;
import org.apache.fineract.client.models.GetGroupsTemplateStaffOptions;

/**
 * GetGroupsTemplateResponse
 */
@ApiModel(description = "GetGroupsTemplateResponse")

public class GetGroupsTemplateResponse {
  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Integer officeId;

  public static final String SERIALIZED_NAME_OFFICE_OPTIONS = "officeOptions";
  @SerializedName(SERIALIZED_NAME_OFFICE_OPTIONS)
  private List<GetGroupsTemplateOfficeOptions> officeOptions = null;

  public static final String SERIALIZED_NAME_STAFF_OPTIONS = "staffOptions";
  @SerializedName(SERIALIZED_NAME_STAFF_OPTIONS)
  private List<GetGroupsTemplateStaffOptions> staffOptions = null;

  public static final String SERIALIZED_NAME_CLIENT_OPTIONS = "clientOptions";
  @SerializedName(SERIALIZED_NAME_CLIENT_OPTIONS)
  private List<GetGroupsTemplateClientOptions> clientOptions = null;

  public static final String SERIALIZED_NAME_DATATABLES = "datatables";
  @SerializedName(SERIALIZED_NAME_DATATABLES)
  private List<GetGroupsTemplateDatatables> datatables = null;


  public GetGroupsTemplateResponse officeId(Integer officeId) {
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getOfficeId() {
    return officeId;
  }


  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }


  public GetGroupsTemplateResponse officeOptions(List<GetGroupsTemplateOfficeOptions> officeOptions) {
    
    this.officeOptions = officeOptions;
    return this;
  }

  public GetGroupsTemplateResponse addOfficeOptionsItem(GetGroupsTemplateOfficeOptions officeOptionsItem) {
    if (this.officeOptions == null) {
      this.officeOptions = new ArrayList<GetGroupsTemplateOfficeOptions>();
    }
    this.officeOptions.add(officeOptionsItem);
    return this;
  }

   /**
   * Get officeOptions
   * @return officeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetGroupsTemplateOfficeOptions> getOfficeOptions() {
    return officeOptions;
  }


  public void setOfficeOptions(List<GetGroupsTemplateOfficeOptions> officeOptions) {
    this.officeOptions = officeOptions;
  }


  public GetGroupsTemplateResponse staffOptions(List<GetGroupsTemplateStaffOptions> staffOptions) {
    
    this.staffOptions = staffOptions;
    return this;
  }

  public GetGroupsTemplateResponse addStaffOptionsItem(GetGroupsTemplateStaffOptions staffOptionsItem) {
    if (this.staffOptions == null) {
      this.staffOptions = new ArrayList<GetGroupsTemplateStaffOptions>();
    }
    this.staffOptions.add(staffOptionsItem);
    return this;
  }

   /**
   * Get staffOptions
   * @return staffOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetGroupsTemplateStaffOptions> getStaffOptions() {
    return staffOptions;
  }


  public void setStaffOptions(List<GetGroupsTemplateStaffOptions> staffOptions) {
    this.staffOptions = staffOptions;
  }


  public GetGroupsTemplateResponse clientOptions(List<GetGroupsTemplateClientOptions> clientOptions) {
    
    this.clientOptions = clientOptions;
    return this;
  }

  public GetGroupsTemplateResponse addClientOptionsItem(GetGroupsTemplateClientOptions clientOptionsItem) {
    if (this.clientOptions == null) {
      this.clientOptions = new ArrayList<GetGroupsTemplateClientOptions>();
    }
    this.clientOptions.add(clientOptionsItem);
    return this;
  }

   /**
   * Get clientOptions
   * @return clientOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetGroupsTemplateClientOptions> getClientOptions() {
    return clientOptions;
  }


  public void setClientOptions(List<GetGroupsTemplateClientOptions> clientOptions) {
    this.clientOptions = clientOptions;
  }


  public GetGroupsTemplateResponse datatables(List<GetGroupsTemplateDatatables> datatables) {
    
    this.datatables = datatables;
    return this;
  }

  public GetGroupsTemplateResponse addDatatablesItem(GetGroupsTemplateDatatables datatablesItem) {
    if (this.datatables == null) {
      this.datatables = new ArrayList<GetGroupsTemplateDatatables>();
    }
    this.datatables.add(datatablesItem);
    return this;
  }

   /**
   * Get datatables
   * @return datatables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetGroupsTemplateDatatables> getDatatables() {
    return datatables;
  }


  public void setDatatables(List<GetGroupsTemplateDatatables> datatables) {
    this.datatables = datatables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupsTemplateResponse getGroupsTemplateResponse = (GetGroupsTemplateResponse) o;
    return Objects.equals(this.officeId, getGroupsTemplateResponse.officeId) &&
        Objects.equals(this.officeOptions, getGroupsTemplateResponse.officeOptions) &&
        Objects.equals(this.staffOptions, getGroupsTemplateResponse.staffOptions) &&
        Objects.equals(this.clientOptions, getGroupsTemplateResponse.clientOptions) &&
        Objects.equals(this.datatables, getGroupsTemplateResponse.datatables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officeId, officeOptions, staffOptions, clientOptions, datatables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupsTemplateResponse {\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeOptions: ").append(toIndentedString(officeOptions)).append("\n");
    sb.append("    staffOptions: ").append(toIndentedString(staffOptions)).append("\n");
    sb.append("    clientOptions: ").append(toIndentedString(clientOptions)).append("\n");
    sb.append("    datatables: ").append(toIndentedString(datatables)).append("\n");
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

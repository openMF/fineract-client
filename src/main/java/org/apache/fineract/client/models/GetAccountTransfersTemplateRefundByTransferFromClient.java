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
import java.util.Date;
import org.apache.fineract.client.models.GetAccountTransfersStatus;
import org.apache.fineract.client.models.GetAccountTransfersTimeline;

/**
 * GetAccountTransfersTemplateRefundByTransferFromClient
 */

public class GetAccountTransfersTemplateRefundByTransferFromClient {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ACCOUNT_NO = "accountNo";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private Long accountNo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GetAccountTransfersStatus status;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ACTIVATION_DATE = "activationDate";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_DATE)
  private Date activationDate;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private Object gender;

  public static final String SERIALIZED_NAME_CLIENT_TYPE = "clientType";
  @SerializedName(SERIALIZED_NAME_CLIENT_TYPE)
  private Object clientType;

  public static final String SERIALIZED_NAME_CLIENT_CLASSIFICATION = "clientClassification";
  @SerializedName(SERIALIZED_NAME_CLIENT_CLASSIFICATION)
  private Object clientClassification;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Integer officeId;

  public static final String SERIALIZED_NAME_OFFICE_NAME = "officeName";
  @SerializedName(SERIALIZED_NAME_OFFICE_NAME)
  private String officeName;

  public static final String SERIALIZED_NAME_TIMELINE = "timeline";
  @SerializedName(SERIALIZED_NAME_TIMELINE)
  private GetAccountTransfersTimeline timeline;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private Object groups;


  public GetAccountTransfersTemplateRefundByTransferFromClient id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetAccountTransfersTemplateRefundByTransferFromClient accountNo(Long accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }


  public GetAccountTransfersTemplateRefundByTransferFromClient status(GetAccountTransfersStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountTransfersStatus getStatus() {
    return status;
  }


  public void setStatus(GetAccountTransfersStatus status) {
    this.status = status;
  }


  public GetAccountTransfersTemplateRefundByTransferFromClient active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public GetAccountTransfersTemplateRefundByTransferFromClient activationDate(Date activationDate) {
    
    this.activationDate = activationDate;
    return this;
  }

   /**
   * Get activationDate
   * @return activationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getActivationDate() {
    return activationDate;
  }


  public void setActivationDate(Date activationDate) {
    this.activationDate = activationDate;
  }


  public GetAccountTransfersTemplateRefundByTransferFromClient firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Daniel", value = "")

  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public GetAccountTransfersTemplateRefundByTransferFromClient lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Owusu", value = "")

  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public GetAccountTransfersTemplateRefundByTransferFromClient displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Daniel Owusu", value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public GetAccountTransfersTemplateRefundByTransferFromClient gender(Object gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getGender() {
    return gender;
  }


  public void setGender(Object gender) {
    this.gender = gender;
  }


  public GetAccountTransfersTemplateRefundByTransferFromClient clientType(Object clientType) {
    
    this.clientType = clientType;
    return this;
  }

   /**
   * Get clientType
   * @return clientType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getClientType() {
    return clientType;
  }


  public void setClientType(Object clientType) {
    this.clientType = clientType;
  }


  public GetAccountTransfersTemplateRefundByTransferFromClient clientClassification(Object clientClassification) {
    
    this.clientClassification = clientClassification;
    return this;
  }

   /**
   * Get clientClassification
   * @return clientClassification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getClientClassification() {
    return clientClassification;
  }


  public void setClientClassification(Object clientClassification) {
    this.clientClassification = clientClassification;
  }


  public GetAccountTransfersTemplateRefundByTransferFromClient officeId(Integer officeId) {
    
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


  public GetAccountTransfersTemplateRefundByTransferFromClient officeName(String officeName) {
    
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


  public GetAccountTransfersTemplateRefundByTransferFromClient timeline(GetAccountTransfersTimeline timeline) {
    
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountTransfersTimeline getTimeline() {
    return timeline;
  }


  public void setTimeline(GetAccountTransfersTimeline timeline) {
    this.timeline = timeline;
  }


  public GetAccountTransfersTemplateRefundByTransferFromClient groups(Object groups) {
    
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getGroups() {
    return groups;
  }


  public void setGroups(Object groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountTransfersTemplateRefundByTransferFromClient getAccountTransfersTemplateRefundByTransferFromClient = (GetAccountTransfersTemplateRefundByTransferFromClient) o;
    return Objects.equals(this.id, getAccountTransfersTemplateRefundByTransferFromClient.id) &&
        Objects.equals(this.accountNo, getAccountTransfersTemplateRefundByTransferFromClient.accountNo) &&
        Objects.equals(this.status, getAccountTransfersTemplateRefundByTransferFromClient.status) &&
        Objects.equals(this.active, getAccountTransfersTemplateRefundByTransferFromClient.active) &&
        Objects.equals(this.activationDate, getAccountTransfersTemplateRefundByTransferFromClient.activationDate) &&
        Objects.equals(this.firstname, getAccountTransfersTemplateRefundByTransferFromClient.firstname) &&
        Objects.equals(this.lastname, getAccountTransfersTemplateRefundByTransferFromClient.lastname) &&
        Objects.equals(this.displayName, getAccountTransfersTemplateRefundByTransferFromClient.displayName) &&
        Objects.equals(this.gender, getAccountTransfersTemplateRefundByTransferFromClient.gender) &&
        Objects.equals(this.clientType, getAccountTransfersTemplateRefundByTransferFromClient.clientType) &&
        Objects.equals(this.clientClassification, getAccountTransfersTemplateRefundByTransferFromClient.clientClassification) &&
        Objects.equals(this.officeId, getAccountTransfersTemplateRefundByTransferFromClient.officeId) &&
        Objects.equals(this.officeName, getAccountTransfersTemplateRefundByTransferFromClient.officeName) &&
        Objects.equals(this.timeline, getAccountTransfersTemplateRefundByTransferFromClient.timeline) &&
        Objects.equals(this.groups, getAccountTransfersTemplateRefundByTransferFromClient.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, status, active, activationDate, firstname, lastname, displayName, gender, clientType, clientClassification, officeId, officeName, timeline, groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountTransfersTemplateRefundByTransferFromClient {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    clientClassification: ").append(toIndentedString(clientClassification)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

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
 * The version of the OpenAPI document: 1.5.0-39-gc7b9611-dirty
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

/**
 * PostStaffRequest
 */
@ApiModel(description = "PostStaffRequest")

public class PostStaffRequest {
  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Long officeId;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_IS_LOAN_OFFICER = "isLoanOfficer";
  @SerializedName(SERIALIZED_NAME_IS_LOAN_OFFICER)
  private Boolean isLoanOfficer;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_MOBILE_NO = "mobileNo";
  @SerializedName(SERIALIZED_NAME_MOBILE_NO)
  private String mobileNo;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_JOINING_DATE = "joiningDate";
  @SerializedName(SERIALIZED_NAME_JOINING_DATE)
  private Date joiningDate;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;


  public PostStaffRequest officeId(Long officeId) {
    
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


  public PostStaffRequest firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John", value = "")

  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public PostStaffRequest lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Doe", value = "")

  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public PostStaffRequest isLoanOfficer(Boolean isLoanOfficer) {
    
    this.isLoanOfficer = isLoanOfficer;
    return this;
  }

   /**
   * Get isLoanOfficer
   * @return isLoanOfficer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsLoanOfficer() {
    return isLoanOfficer;
  }


  public void setIsLoanOfficer(Boolean isLoanOfficer) {
    this.isLoanOfficer = isLoanOfficer;
  }


  public PostStaffRequest externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "17H", value = "")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public PostStaffRequest mobileNo(String mobileNo) {
    
    this.mobileNo = mobileNo;
    return this;
  }

   /**
   * Get mobileNo
   * @return mobileNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "353851239876", value = "")

  public String getMobileNo() {
    return mobileNo;
  }


  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }


  public PostStaffRequest isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public PostStaffRequest joiningDate(Date joiningDate) {
    
    this.joiningDate = joiningDate;
    return this;
  }

   /**
   * Get joiningDate
   * @return joiningDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getJoiningDate() {
    return joiningDate;
  }


  public void setJoiningDate(Date joiningDate) {
    this.joiningDate = joiningDate;
  }


  public PostStaffRequest locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en", value = "")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public PostStaffRequest dateFormat(String dateFormat) {
    
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dd MMMM yyyy", value = "")

  public String getDateFormat() {
    return dateFormat;
  }


  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostStaffRequest postStaffRequest = (PostStaffRequest) o;
    return Objects.equals(this.officeId, postStaffRequest.officeId) &&
        Objects.equals(this.firstname, postStaffRequest.firstname) &&
        Objects.equals(this.lastname, postStaffRequest.lastname) &&
        Objects.equals(this.isLoanOfficer, postStaffRequest.isLoanOfficer) &&
        Objects.equals(this.externalId, postStaffRequest.externalId) &&
        Objects.equals(this.mobileNo, postStaffRequest.mobileNo) &&
        Objects.equals(this.isActive, postStaffRequest.isActive) &&
        Objects.equals(this.joiningDate, postStaffRequest.joiningDate) &&
        Objects.equals(this.locale, postStaffRequest.locale) &&
        Objects.equals(this.dateFormat, postStaffRequest.dateFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officeId, firstname, lastname, isLoanOfficer, externalId, mobileNo, isActive, joiningDate, locale, dateFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostStaffRequest {\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    isLoanOfficer: ").append(toIndentedString(isLoanOfficer)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    joiningDate: ").append(toIndentedString(joiningDate)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
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


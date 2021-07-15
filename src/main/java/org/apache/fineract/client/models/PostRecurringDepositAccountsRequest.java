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

/**
 * PostRecurringDepositAccountsRequest
 */
@ApiModel(description = "PostRecurringDepositAccountsRequest")

public class PostRecurringDepositAccountsRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_SUBMITTED_ON_DATE = "submittedOnDate";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_ON_DATE)
  private String submittedOnDate;

  public static final String SERIALIZED_NAME_DEPOSIT_PERIOD = "depositPeriod";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_PERIOD)
  private Integer depositPeriod;

  public static final String SERIALIZED_NAME_DEPOSIT_PERIOD_FREQUENCY_ID = "depositPeriodFrequencyId";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_PERIOD_FREQUENCY_ID)
  private Integer depositPeriodFrequencyId;

  public static final String SERIALIZED_NAME_DEPOSIT_AMOUNT = "depositAmount";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_AMOUNT)
  private Float depositAmount;

  public static final String SERIALIZED_NAME_IS_CALENDAR_INHERITED = "isCalendarInherited";
  @SerializedName(SERIALIZED_NAME_IS_CALENDAR_INHERITED)
  private Boolean isCalendarInherited;

  public static final String SERIALIZED_NAME_RECURRING_FREQUENCY = "recurringFrequency";
  @SerializedName(SERIALIZED_NAME_RECURRING_FREQUENCY)
  private Integer recurringFrequency;

  public static final String SERIALIZED_NAME_RECURRING_FREQUENCY_TYPE = "recurringFrequencyType";
  @SerializedName(SERIALIZED_NAME_RECURRING_FREQUENCY_TYPE)
  private Integer recurringFrequencyType;

  public static final String SERIALIZED_NAME_MANDATORY_RECOMMENDED_DEPOSIT_AMOUNT = "mandatoryRecommendedDepositAmount";
  @SerializedName(SERIALIZED_NAME_MANDATORY_RECOMMENDED_DEPOSIT_AMOUNT)
  private Long mandatoryRecommendedDepositAmount;


  public PostRecurringDepositAccountsRequest clientId(Integer clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getClientId() {
    return clientId;
  }


  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }


  public PostRecurringDepositAccountsRequest productId(Integer productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getProductId() {
    return productId;
  }


  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public PostRecurringDepositAccountsRequest locale(String locale) {
    
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


  public PostRecurringDepositAccountsRequest dateFormat(String dateFormat) {
    
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


  public PostRecurringDepositAccountsRequest submittedOnDate(String submittedOnDate) {
    
    this.submittedOnDate = submittedOnDate;
    return this;
  }

   /**
   * Get submittedOnDate
   * @return submittedOnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "02 June 2014", value = "")

  public String getSubmittedOnDate() {
    return submittedOnDate;
  }


  public void setSubmittedOnDate(String submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
  }


  public PostRecurringDepositAccountsRequest depositPeriod(Integer depositPeriod) {
    
    this.depositPeriod = depositPeriod;
    return this;
  }

   /**
   * Get depositPeriod
   * @return depositPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "")

  public Integer getDepositPeriod() {
    return depositPeriod;
  }


  public void setDepositPeriod(Integer depositPeriod) {
    this.depositPeriod = depositPeriod;
  }


  public PostRecurringDepositAccountsRequest depositPeriodFrequencyId(Integer depositPeriodFrequencyId) {
    
    this.depositPeriodFrequencyId = depositPeriodFrequencyId;
    return this;
  }

   /**
   * Get depositPeriodFrequencyId
   * @return depositPeriodFrequencyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getDepositPeriodFrequencyId() {
    return depositPeriodFrequencyId;
  }


  public void setDepositPeriodFrequencyId(Integer depositPeriodFrequencyId) {
    this.depositPeriodFrequencyId = depositPeriodFrequencyId;
  }


  public PostRecurringDepositAccountsRequest depositAmount(Float depositAmount) {
    
    this.depositAmount = depositAmount;
    return this;
  }

   /**
   * Get depositAmount
   * @return depositAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "")

  public Float getDepositAmount() {
    return depositAmount;
  }


  public void setDepositAmount(Float depositAmount) {
    this.depositAmount = depositAmount;
  }


  public PostRecurringDepositAccountsRequest isCalendarInherited(Boolean isCalendarInherited) {
    
    this.isCalendarInherited = isCalendarInherited;
    return this;
  }

   /**
   * Get isCalendarInherited
   * @return isCalendarInherited
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsCalendarInherited() {
    return isCalendarInherited;
  }


  public void setIsCalendarInherited(Boolean isCalendarInherited) {
    this.isCalendarInherited = isCalendarInherited;
  }


  public PostRecurringDepositAccountsRequest recurringFrequency(Integer recurringFrequency) {
    
    this.recurringFrequency = recurringFrequency;
    return this;
  }

   /**
   * Get recurringFrequency
   * @return recurringFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getRecurringFrequency() {
    return recurringFrequency;
  }


  public void setRecurringFrequency(Integer recurringFrequency) {
    this.recurringFrequency = recurringFrequency;
  }


  public PostRecurringDepositAccountsRequest recurringFrequencyType(Integer recurringFrequencyType) {
    
    this.recurringFrequencyType = recurringFrequencyType;
    return this;
  }

   /**
   * Get recurringFrequencyType
   * @return recurringFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getRecurringFrequencyType() {
    return recurringFrequencyType;
  }


  public void setRecurringFrequencyType(Integer recurringFrequencyType) {
    this.recurringFrequencyType = recurringFrequencyType;
  }


  public PostRecurringDepositAccountsRequest mandatoryRecommendedDepositAmount(Long mandatoryRecommendedDepositAmount) {
    
    this.mandatoryRecommendedDepositAmount = mandatoryRecommendedDepositAmount;
    return this;
  }

   /**
   * Get mandatoryRecommendedDepositAmount
   * @return mandatoryRecommendedDepositAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000", value = "")

  public Long getMandatoryRecommendedDepositAmount() {
    return mandatoryRecommendedDepositAmount;
  }


  public void setMandatoryRecommendedDepositAmount(Long mandatoryRecommendedDepositAmount) {
    this.mandatoryRecommendedDepositAmount = mandatoryRecommendedDepositAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostRecurringDepositAccountsRequest postRecurringDepositAccountsRequest = (PostRecurringDepositAccountsRequest) o;
    return Objects.equals(this.clientId, postRecurringDepositAccountsRequest.clientId) &&
        Objects.equals(this.productId, postRecurringDepositAccountsRequest.productId) &&
        Objects.equals(this.locale, postRecurringDepositAccountsRequest.locale) &&
        Objects.equals(this.dateFormat, postRecurringDepositAccountsRequest.dateFormat) &&
        Objects.equals(this.submittedOnDate, postRecurringDepositAccountsRequest.submittedOnDate) &&
        Objects.equals(this.depositPeriod, postRecurringDepositAccountsRequest.depositPeriod) &&
        Objects.equals(this.depositPeriodFrequencyId, postRecurringDepositAccountsRequest.depositPeriodFrequencyId) &&
        Objects.equals(this.depositAmount, postRecurringDepositAccountsRequest.depositAmount) &&
        Objects.equals(this.isCalendarInherited, postRecurringDepositAccountsRequest.isCalendarInherited) &&
        Objects.equals(this.recurringFrequency, postRecurringDepositAccountsRequest.recurringFrequency) &&
        Objects.equals(this.recurringFrequencyType, postRecurringDepositAccountsRequest.recurringFrequencyType) &&
        Objects.equals(this.mandatoryRecommendedDepositAmount, postRecurringDepositAccountsRequest.mandatoryRecommendedDepositAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, productId, locale, dateFormat, submittedOnDate, depositPeriod, depositPeriodFrequencyId, depositAmount, isCalendarInherited, recurringFrequency, recurringFrequencyType, mandatoryRecommendedDepositAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRecurringDepositAccountsRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
    sb.append("    depositPeriod: ").append(toIndentedString(depositPeriod)).append("\n");
    sb.append("    depositPeriodFrequencyId: ").append(toIndentedString(depositPeriodFrequencyId)).append("\n");
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    isCalendarInherited: ").append(toIndentedString(isCalendarInherited)).append("\n");
    sb.append("    recurringFrequency: ").append(toIndentedString(recurringFrequency)).append("\n");
    sb.append("    recurringFrequencyType: ").append(toIndentedString(recurringFrequencyType)).append("\n");
    sb.append("    mandatoryRecommendedDepositAmount: ").append(toIndentedString(mandatoryRecommendedDepositAmount)).append("\n");
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

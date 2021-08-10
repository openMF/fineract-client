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
import org.apache.fineract.client.models.GetSavingsCurrency;
import org.apache.fineract.client.models.GetSavingsInterestCalculationDaysInYearType;
import org.apache.fineract.client.models.GetSavingsInterestCalculationType;
import org.apache.fineract.client.models.GetSavingsInterestCompoundingPeriodType;
import org.apache.fineract.client.models.GetSavingsInterestPostingPeriodType;
import org.apache.fineract.client.models.GetSavingsStatus;
import org.apache.fineract.client.models.GetSavingsSummary;
import org.apache.fineract.client.models.GetSavingsTimeline;

/**
 * GetSavingsPageItems
 */

public class GetSavingsPageItems {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ACCOUNT_NO = "accountNo";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private String accountNo;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "clientName";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_SAVINGS_PRODUCT_ID = "savingsProductId";
  @SerializedName(SERIALIZED_NAME_SAVINGS_PRODUCT_ID)
  private Integer savingsProductId;

  public static final String SERIALIZED_NAME_SAVINGS_PRODUCT_NAME = "savingsProductName";
  @SerializedName(SERIALIZED_NAME_SAVINGS_PRODUCT_NAME)
  private String savingsProductName;

  public static final String SERIALIZED_NAME_FIELD_OFFICER_ID = "fieldOfficerId";
  @SerializedName(SERIALIZED_NAME_FIELD_OFFICER_ID)
  private Integer fieldOfficerId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GetSavingsStatus status;

  public static final String SERIALIZED_NAME_TIMELINE = "timeline";
  @SerializedName(SERIALIZED_NAME_TIMELINE)
  private GetSavingsTimeline timeline;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetSavingsCurrency currency;

  public static final String SERIALIZED_NAME_NOMINAL_ANNUAL_INTEREST_RATE = "nominalAnnualInterestRate";
  @SerializedName(SERIALIZED_NAME_NOMINAL_ANNUAL_INTEREST_RATE)
  private Double nominalAnnualInterestRate;

  public static final String SERIALIZED_NAME_INTEREST_COMPOUNDING_PERIOD_TYPE = "interestCompoundingPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_COMPOUNDING_PERIOD_TYPE)
  private GetSavingsInterestCompoundingPeriodType interestCompoundingPeriodType;

  public static final String SERIALIZED_NAME_INTEREST_POSTING_PERIOD_TYPE = "interestPostingPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_POSTING_PERIOD_TYPE)
  private GetSavingsInterestPostingPeriodType interestPostingPeriodType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_TYPE = "interestCalculationType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_TYPE)
  private GetSavingsInterestCalculationType interestCalculationType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_DAYS_IN_YEAR_TYPE = "interestCalculationDaysInYearType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_DAYS_IN_YEAR_TYPE)
  private GetSavingsInterestCalculationDaysInYearType interestCalculationDaysInYearType;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private GetSavingsSummary summary;


  public GetSavingsPageItems id(Integer id) {
    
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


  public GetSavingsPageItems accountNo(String accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000000001", value = "")

  public String getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }


  public GetSavingsPageItems clientId(Integer clientId) {
    
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


  public GetSavingsPageItems clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "small business", value = "")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public GetSavingsPageItems savingsProductId(Integer savingsProductId) {
    
    this.savingsProductId = savingsProductId;
    return this;
  }

   /**
   * Get savingsProductId
   * @return savingsProductId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getSavingsProductId() {
    return savingsProductId;
  }


  public void setSavingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
  }


  public GetSavingsPageItems savingsProductName(String savingsProductName) {
    
    this.savingsProductName = savingsProductName;
    return this;
  }

   /**
   * Get savingsProductName
   * @return savingsProductName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Passbook Savings", value = "")

  public String getSavingsProductName() {
    return savingsProductName;
  }


  public void setSavingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
  }


  public GetSavingsPageItems fieldOfficerId(Integer fieldOfficerId) {
    
    this.fieldOfficerId = fieldOfficerId;
    return this;
  }

   /**
   * Get fieldOfficerId
   * @return fieldOfficerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getFieldOfficerId() {
    return fieldOfficerId;
  }


  public void setFieldOfficerId(Integer fieldOfficerId) {
    this.fieldOfficerId = fieldOfficerId;
  }


  public GetSavingsPageItems status(GetSavingsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSavingsStatus getStatus() {
    return status;
  }


  public void setStatus(GetSavingsStatus status) {
    this.status = status;
  }


  public GetSavingsPageItems timeline(GetSavingsTimeline timeline) {
    
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSavingsTimeline getTimeline() {
    return timeline;
  }


  public void setTimeline(GetSavingsTimeline timeline) {
    this.timeline = timeline;
  }


  public GetSavingsPageItems currency(GetSavingsCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSavingsCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetSavingsCurrency currency) {
    this.currency = currency;
  }


  public GetSavingsPageItems nominalAnnualInterestRate(Double nominalAnnualInterestRate) {
    
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
    return this;
  }

   /**
   * Get nominalAnnualInterestRate
   * @return nominalAnnualInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Double getNominalAnnualInterestRate() {
    return nominalAnnualInterestRate;
  }


  public void setNominalAnnualInterestRate(Double nominalAnnualInterestRate) {
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
  }


  public GetSavingsPageItems interestCompoundingPeriodType(GetSavingsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSavingsInterestCompoundingPeriodType getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }


  public void setInterestCompoundingPeriodType(GetSavingsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }


  public GetSavingsPageItems interestPostingPeriodType(GetSavingsInterestPostingPeriodType interestPostingPeriodType) {
    
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSavingsInterestPostingPeriodType getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }


  public void setInterestPostingPeriodType(GetSavingsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }


  public GetSavingsPageItems interestCalculationType(GetSavingsInterestCalculationType interestCalculationType) {
    
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSavingsInterestCalculationType getInterestCalculationType() {
    return interestCalculationType;
  }


  public void setInterestCalculationType(GetSavingsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }


  public GetSavingsPageItems interestCalculationDaysInYearType(GetSavingsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSavingsInterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }


  public void setInterestCalculationDaysInYearType(GetSavingsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }


  public GetSavingsPageItems summary(GetSavingsSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSavingsSummary getSummary() {
    return summary;
  }


  public void setSummary(GetSavingsSummary summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsPageItems getSavingsPageItems = (GetSavingsPageItems) o;
    return Objects.equals(this.id, getSavingsPageItems.id) &&
        Objects.equals(this.accountNo, getSavingsPageItems.accountNo) &&
        Objects.equals(this.clientId, getSavingsPageItems.clientId) &&
        Objects.equals(this.clientName, getSavingsPageItems.clientName) &&
        Objects.equals(this.savingsProductId, getSavingsPageItems.savingsProductId) &&
        Objects.equals(this.savingsProductName, getSavingsPageItems.savingsProductName) &&
        Objects.equals(this.fieldOfficerId, getSavingsPageItems.fieldOfficerId) &&
        Objects.equals(this.status, getSavingsPageItems.status) &&
        Objects.equals(this.timeline, getSavingsPageItems.timeline) &&
        Objects.equals(this.currency, getSavingsPageItems.currency) &&
        Objects.equals(this.nominalAnnualInterestRate, getSavingsPageItems.nominalAnnualInterestRate) &&
        Objects.equals(this.interestCompoundingPeriodType, getSavingsPageItems.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, getSavingsPageItems.interestPostingPeriodType) &&
        Objects.equals(this.interestCalculationType, getSavingsPageItems.interestCalculationType) &&
        Objects.equals(this.interestCalculationDaysInYearType, getSavingsPageItems.interestCalculationDaysInYearType) &&
        Objects.equals(this.summary, getSavingsPageItems.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, clientId, clientName, savingsProductId, savingsProductName, fieldOfficerId, status, timeline, currency, nominalAnnualInterestRate, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, summary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsPageItems {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    savingsProductId: ").append(toIndentedString(savingsProductId)).append("\n");
    sb.append("    savingsProductName: ").append(toIndentedString(savingsProductName)).append("\n");
    sb.append("    fieldOfficerId: ").append(toIndentedString(fieldOfficerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    nominalAnnualInterestRate: ").append(toIndentedString(nominalAnnualInterestRate)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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


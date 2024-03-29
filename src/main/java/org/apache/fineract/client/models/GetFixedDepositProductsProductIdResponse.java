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
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.GetFixedDepositProductsInterestCalculationDaysInYearType;
import org.apache.fineract.client.models.GetFixedDepositProductsInterestCalculationType;
import org.apache.fineract.client.models.GetFixedDepositProductsInterestPostingPeriodType;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdAccountingMappings;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdActiveChart;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdCurrency;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdFeeToIncomeAccountMappings;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdInterestCompoundingPeriodType;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdMaxDepositTermType;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdMinDepositTermType;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdPenaltyToIncomeAccountMappings;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdPreClosurePenalInterestOnType;

/**
 * GetFixedDepositProductsProductIdResponse
 */
@ApiModel(description = "GetFixedDepositProductsProductIdResponse")

public class GetFixedDepositProductsProductIdResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORT_NAME = "shortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetFixedDepositProductsProductIdCurrency currency;

  public static final String SERIALIZED_NAME_INTEREST_COMPOUNDING_PERIOD_TYPE = "interestCompoundingPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_COMPOUNDING_PERIOD_TYPE)
  private GetFixedDepositProductsProductIdInterestCompoundingPeriodType interestCompoundingPeriodType;

  public static final String SERIALIZED_NAME_INTEREST_POSTING_PERIOD_TYPE = "interestPostingPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_POSTING_PERIOD_TYPE)
  private GetFixedDepositProductsInterestPostingPeriodType interestPostingPeriodType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_TYPE = "interestCalculationType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_TYPE)
  private GetFixedDepositProductsInterestCalculationType interestCalculationType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_DAYS_IN_YEAR_TYPE = "interestCalculationDaysInYearType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_DAYS_IN_YEAR_TYPE)
  private GetFixedDepositProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType;

  public static final String SERIALIZED_NAME_ACCOUNTING_MAPPINGS = "accountingMappings";
  @SerializedName(SERIALIZED_NAME_ACCOUNTING_MAPPINGS)
  private GetFixedDepositProductsProductIdAccountingMappings accountingMappings;

  public static final String SERIALIZED_NAME_FEE_TO_INCOME_ACCOUNT_MAPPINGS = "feeToIncomeAccountMappings";
  @SerializedName(SERIALIZED_NAME_FEE_TO_INCOME_ACCOUNT_MAPPINGS)
  private List<GetFixedDepositProductsProductIdFeeToIncomeAccountMappings> feeToIncomeAccountMappings = null;

  public static final String SERIALIZED_NAME_PENALTY_TO_INCOME_ACCOUNT_MAPPINGS = "penaltyToIncomeAccountMappings";
  @SerializedName(SERIALIZED_NAME_PENALTY_TO_INCOME_ACCOUNT_MAPPINGS)
  private List<GetFixedDepositProductsProductIdPenaltyToIncomeAccountMappings> penaltyToIncomeAccountMappings = null;

  public static final String SERIALIZED_NAME_PRE_CLOSURE_PENAL_APPLICABLE = "preClosurePenalApplicable";
  @SerializedName(SERIALIZED_NAME_PRE_CLOSURE_PENAL_APPLICABLE)
  private Boolean preClosurePenalApplicable;

  public static final String SERIALIZED_NAME_PRE_CLOSURE_PENAL_INTEREST = "preClosurePenalInterest";
  @SerializedName(SERIALIZED_NAME_PRE_CLOSURE_PENAL_INTEREST)
  private Double preClosurePenalInterest;

  public static final String SERIALIZED_NAME_PRE_CLOSURE_PENAL_INTEREST_ON_TYPE = "preClosurePenalInterestOnType";
  @SerializedName(SERIALIZED_NAME_PRE_CLOSURE_PENAL_INTEREST_ON_TYPE)
  private GetFixedDepositProductsProductIdPreClosurePenalInterestOnType preClosurePenalInterestOnType;

  public static final String SERIALIZED_NAME_MIN_DEPOSIT_TERM = "minDepositTerm";
  @SerializedName(SERIALIZED_NAME_MIN_DEPOSIT_TERM)
  private Integer minDepositTerm;

  public static final String SERIALIZED_NAME_MIN_DEPOSIT_TERM_TYPE = "minDepositTermType";
  @SerializedName(SERIALIZED_NAME_MIN_DEPOSIT_TERM_TYPE)
  private GetFixedDepositProductsProductIdMinDepositTermType minDepositTermType;

  public static final String SERIALIZED_NAME_MAX_DEPOSIT_TERM = "maxDepositTerm";
  @SerializedName(SERIALIZED_NAME_MAX_DEPOSIT_TERM)
  private Integer maxDepositTerm;

  public static final String SERIALIZED_NAME_MAX_DEPOSIT_TERM_TYPE = "maxDepositTermType";
  @SerializedName(SERIALIZED_NAME_MAX_DEPOSIT_TERM_TYPE)
  private GetFixedDepositProductsProductIdMaxDepositTermType maxDepositTermType;

  public static final String SERIALIZED_NAME_ACTIVE_CHART = "activeChart";
  @SerializedName(SERIALIZED_NAME_ACTIVE_CHART)
  private GetFixedDepositProductsProductIdActiveChart activeChart;


  public GetFixedDepositProductsProductIdResponse id(Integer id) {
    
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


  public GetFixedDepositProductsProductIdResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fixed deposit product", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetFixedDepositProductsProductIdResponse shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FD01", value = "")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public GetFixedDepositProductsProductIdResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Daily compounding using Daily Balance, 5% per year, 365 days in year", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetFixedDepositProductsProductIdResponse currency(GetFixedDepositProductsProductIdCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetFixedDepositProductsProductIdCurrency currency) {
    this.currency = currency;
  }


  public GetFixedDepositProductsProductIdResponse interestCompoundingPeriodType(GetFixedDepositProductsProductIdInterestCompoundingPeriodType interestCompoundingPeriodType) {
    
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdInterestCompoundingPeriodType getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }


  public void setInterestCompoundingPeriodType(GetFixedDepositProductsProductIdInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }


  public GetFixedDepositProductsProductIdResponse interestPostingPeriodType(GetFixedDepositProductsInterestPostingPeriodType interestPostingPeriodType) {
    
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsInterestPostingPeriodType getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }


  public void setInterestPostingPeriodType(GetFixedDepositProductsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }


  public GetFixedDepositProductsProductIdResponse interestCalculationType(GetFixedDepositProductsInterestCalculationType interestCalculationType) {
    
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsInterestCalculationType getInterestCalculationType() {
    return interestCalculationType;
  }


  public void setInterestCalculationType(GetFixedDepositProductsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }


  public GetFixedDepositProductsProductIdResponse interestCalculationDaysInYearType(GetFixedDepositProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsInterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }


  public void setInterestCalculationDaysInYearType(GetFixedDepositProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }


  public GetFixedDepositProductsProductIdResponse accountingMappings(GetFixedDepositProductsProductIdAccountingMappings accountingMappings) {
    
    this.accountingMappings = accountingMappings;
    return this;
  }

   /**
   * Get accountingMappings
   * @return accountingMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdAccountingMappings getAccountingMappings() {
    return accountingMappings;
  }


  public void setAccountingMappings(GetFixedDepositProductsProductIdAccountingMappings accountingMappings) {
    this.accountingMappings = accountingMappings;
  }


  public GetFixedDepositProductsProductIdResponse feeToIncomeAccountMappings(List<GetFixedDepositProductsProductIdFeeToIncomeAccountMappings> feeToIncomeAccountMappings) {
    
    this.feeToIncomeAccountMappings = feeToIncomeAccountMappings;
    return this;
  }

  public GetFixedDepositProductsProductIdResponse addFeeToIncomeAccountMappingsItem(GetFixedDepositProductsProductIdFeeToIncomeAccountMappings feeToIncomeAccountMappingsItem) {
    if (this.feeToIncomeAccountMappings == null) {
      this.feeToIncomeAccountMappings = new ArrayList<GetFixedDepositProductsProductIdFeeToIncomeAccountMappings>();
    }
    this.feeToIncomeAccountMappings.add(feeToIncomeAccountMappingsItem);
    return this;
  }

   /**
   * Get feeToIncomeAccountMappings
   * @return feeToIncomeAccountMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetFixedDepositProductsProductIdFeeToIncomeAccountMappings> getFeeToIncomeAccountMappings() {
    return feeToIncomeAccountMappings;
  }


  public void setFeeToIncomeAccountMappings(List<GetFixedDepositProductsProductIdFeeToIncomeAccountMappings> feeToIncomeAccountMappings) {
    this.feeToIncomeAccountMappings = feeToIncomeAccountMappings;
  }


  public GetFixedDepositProductsProductIdResponse penaltyToIncomeAccountMappings(List<GetFixedDepositProductsProductIdPenaltyToIncomeAccountMappings> penaltyToIncomeAccountMappings) {
    
    this.penaltyToIncomeAccountMappings = penaltyToIncomeAccountMappings;
    return this;
  }

  public GetFixedDepositProductsProductIdResponse addPenaltyToIncomeAccountMappingsItem(GetFixedDepositProductsProductIdPenaltyToIncomeAccountMappings penaltyToIncomeAccountMappingsItem) {
    if (this.penaltyToIncomeAccountMappings == null) {
      this.penaltyToIncomeAccountMappings = new ArrayList<GetFixedDepositProductsProductIdPenaltyToIncomeAccountMappings>();
    }
    this.penaltyToIncomeAccountMappings.add(penaltyToIncomeAccountMappingsItem);
    return this;
  }

   /**
   * Get penaltyToIncomeAccountMappings
   * @return penaltyToIncomeAccountMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetFixedDepositProductsProductIdPenaltyToIncomeAccountMappings> getPenaltyToIncomeAccountMappings() {
    return penaltyToIncomeAccountMappings;
  }


  public void setPenaltyToIncomeAccountMappings(List<GetFixedDepositProductsProductIdPenaltyToIncomeAccountMappings> penaltyToIncomeAccountMappings) {
    this.penaltyToIncomeAccountMappings = penaltyToIncomeAccountMappings;
  }


  public GetFixedDepositProductsProductIdResponse preClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    
    this.preClosurePenalApplicable = preClosurePenalApplicable;
    return this;
  }

   /**
   * Get preClosurePenalApplicable
   * @return preClosurePenalApplicable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getPreClosurePenalApplicable() {
    return preClosurePenalApplicable;
  }


  public void setPreClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    this.preClosurePenalApplicable = preClosurePenalApplicable;
  }


  public GetFixedDepositProductsProductIdResponse preClosurePenalInterest(Double preClosurePenalInterest) {
    
    this.preClosurePenalInterest = preClosurePenalInterest;
    return this;
  }

   /**
   * Get preClosurePenalInterest
   * @return preClosurePenalInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.75", value = "")

  public Double getPreClosurePenalInterest() {
    return preClosurePenalInterest;
  }


  public void setPreClosurePenalInterest(Double preClosurePenalInterest) {
    this.preClosurePenalInterest = preClosurePenalInterest;
  }


  public GetFixedDepositProductsProductIdResponse preClosurePenalInterestOnType(GetFixedDepositProductsProductIdPreClosurePenalInterestOnType preClosurePenalInterestOnType) {
    
    this.preClosurePenalInterestOnType = preClosurePenalInterestOnType;
    return this;
  }

   /**
   * Get preClosurePenalInterestOnType
   * @return preClosurePenalInterestOnType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdPreClosurePenalInterestOnType getPreClosurePenalInterestOnType() {
    return preClosurePenalInterestOnType;
  }


  public void setPreClosurePenalInterestOnType(GetFixedDepositProductsProductIdPreClosurePenalInterestOnType preClosurePenalInterestOnType) {
    this.preClosurePenalInterestOnType = preClosurePenalInterestOnType;
  }


  public GetFixedDepositProductsProductIdResponse minDepositTerm(Integer minDepositTerm) {
    
    this.minDepositTerm = minDepositTerm;
    return this;
  }

   /**
   * Get minDepositTerm
   * @return minDepositTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getMinDepositTerm() {
    return minDepositTerm;
  }


  public void setMinDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
  }


  public GetFixedDepositProductsProductIdResponse minDepositTermType(GetFixedDepositProductsProductIdMinDepositTermType minDepositTermType) {
    
    this.minDepositTermType = minDepositTermType;
    return this;
  }

   /**
   * Get minDepositTermType
   * @return minDepositTermType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdMinDepositTermType getMinDepositTermType() {
    return minDepositTermType;
  }


  public void setMinDepositTermType(GetFixedDepositProductsProductIdMinDepositTermType minDepositTermType) {
    this.minDepositTermType = minDepositTermType;
  }


  public GetFixedDepositProductsProductIdResponse maxDepositTerm(Integer maxDepositTerm) {
    
    this.maxDepositTerm = maxDepositTerm;
    return this;
  }

   /**
   * Get maxDepositTerm
   * @return maxDepositTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getMaxDepositTerm() {
    return maxDepositTerm;
  }


  public void setMaxDepositTerm(Integer maxDepositTerm) {
    this.maxDepositTerm = maxDepositTerm;
  }


  public GetFixedDepositProductsProductIdResponse maxDepositTermType(GetFixedDepositProductsProductIdMaxDepositTermType maxDepositTermType) {
    
    this.maxDepositTermType = maxDepositTermType;
    return this;
  }

   /**
   * Get maxDepositTermType
   * @return maxDepositTermType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdMaxDepositTermType getMaxDepositTermType() {
    return maxDepositTermType;
  }


  public void setMaxDepositTermType(GetFixedDepositProductsProductIdMaxDepositTermType maxDepositTermType) {
    this.maxDepositTermType = maxDepositTermType;
  }


  public GetFixedDepositProductsProductIdResponse activeChart(GetFixedDepositProductsProductIdActiveChart activeChart) {
    
    this.activeChart = activeChart;
    return this;
  }

   /**
   * Get activeChart
   * @return activeChart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositProductsProductIdActiveChart getActiveChart() {
    return activeChart;
  }


  public void setActiveChart(GetFixedDepositProductsProductIdActiveChart activeChart) {
    this.activeChart = activeChart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFixedDepositProductsProductIdResponse getFixedDepositProductsProductIdResponse = (GetFixedDepositProductsProductIdResponse) o;
    return Objects.equals(this.id, getFixedDepositProductsProductIdResponse.id) &&
        Objects.equals(this.name, getFixedDepositProductsProductIdResponse.name) &&
        Objects.equals(this.shortName, getFixedDepositProductsProductIdResponse.shortName) &&
        Objects.equals(this.description, getFixedDepositProductsProductIdResponse.description) &&
        Objects.equals(this.currency, getFixedDepositProductsProductIdResponse.currency) &&
        Objects.equals(this.interestCompoundingPeriodType, getFixedDepositProductsProductIdResponse.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, getFixedDepositProductsProductIdResponse.interestPostingPeriodType) &&
        Objects.equals(this.interestCalculationType, getFixedDepositProductsProductIdResponse.interestCalculationType) &&
        Objects.equals(this.interestCalculationDaysInYearType, getFixedDepositProductsProductIdResponse.interestCalculationDaysInYearType) &&
        Objects.equals(this.accountingMappings, getFixedDepositProductsProductIdResponse.accountingMappings) &&
        Objects.equals(this.feeToIncomeAccountMappings, getFixedDepositProductsProductIdResponse.feeToIncomeAccountMappings) &&
        Objects.equals(this.penaltyToIncomeAccountMappings, getFixedDepositProductsProductIdResponse.penaltyToIncomeAccountMappings) &&
        Objects.equals(this.preClosurePenalApplicable, getFixedDepositProductsProductIdResponse.preClosurePenalApplicable) &&
        Objects.equals(this.preClosurePenalInterest, getFixedDepositProductsProductIdResponse.preClosurePenalInterest) &&
        Objects.equals(this.preClosurePenalInterestOnType, getFixedDepositProductsProductIdResponse.preClosurePenalInterestOnType) &&
        Objects.equals(this.minDepositTerm, getFixedDepositProductsProductIdResponse.minDepositTerm) &&
        Objects.equals(this.minDepositTermType, getFixedDepositProductsProductIdResponse.minDepositTermType) &&
        Objects.equals(this.maxDepositTerm, getFixedDepositProductsProductIdResponse.maxDepositTerm) &&
        Objects.equals(this.maxDepositTermType, getFixedDepositProductsProductIdResponse.maxDepositTermType) &&
        Objects.equals(this.activeChart, getFixedDepositProductsProductIdResponse.activeChart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, shortName, description, currency, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, accountingMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnType, minDepositTerm, minDepositTermType, maxDepositTerm, maxDepositTermType, activeChart);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFixedDepositProductsProductIdResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    accountingMappings: ").append(toIndentedString(accountingMappings)).append("\n");
    sb.append("    feeToIncomeAccountMappings: ").append(toIndentedString(feeToIncomeAccountMappings)).append("\n");
    sb.append("    penaltyToIncomeAccountMappings: ").append(toIndentedString(penaltyToIncomeAccountMappings)).append("\n");
    sb.append("    preClosurePenalApplicable: ").append(toIndentedString(preClosurePenalApplicable)).append("\n");
    sb.append("    preClosurePenalInterest: ").append(toIndentedString(preClosurePenalInterest)).append("\n");
    sb.append("    preClosurePenalInterestOnType: ").append(toIndentedString(preClosurePenalInterestOnType)).append("\n");
    sb.append("    minDepositTerm: ").append(toIndentedString(minDepositTerm)).append("\n");
    sb.append("    minDepositTermType: ").append(toIndentedString(minDepositTermType)).append("\n");
    sb.append("    maxDepositTerm: ").append(toIndentedString(maxDepositTerm)).append("\n");
    sb.append("    maxDepositTermType: ").append(toIndentedString(maxDepositTermType)).append("\n");
    sb.append("    activeChart: ").append(toIndentedString(activeChart)).append("\n");
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


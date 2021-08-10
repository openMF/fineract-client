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
import java.util.Date;
import java.util.List;
import org.apache.fineract.client.models.GetLoanProductsAccountingRule;
import org.apache.fineract.client.models.GetLoanProductsAmortizationType;
import org.apache.fineract.client.models.GetLoanProductsCurrency;
import org.apache.fineract.client.models.GetLoanProductsInterestRateFrequencyType;
import org.apache.fineract.client.models.GetLoanProductsInterestRecalculationData;
import org.apache.fineract.client.models.GetLoanProductsInterestType;
import org.apache.fineract.client.models.GetLoanProductsRepaymentFrequencyType;
import org.apache.fineract.client.models.GetLoansProductsDaysInMonthType;
import org.apache.fineract.client.models.GetLoansProductsDaysInYearType;
import org.apache.fineract.client.models.GetLoansProductsInterestCalculationPeriodType;

/**
 * GetLoanProductsResponse
 */
@ApiModel(description = "GetLoanProductsResponse")

public class GetLoanProductsResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORT_NAME = "shortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_INCLUDE_IN_BORROWER_CYCLE = "includeInBorrowerCycle";
  @SerializedName(SERIALIZED_NAME_INCLUDE_IN_BORROWER_CYCLE)
  private Boolean includeInBorrowerCycle;

  public static final String SERIALIZED_NAME_USE_BORROWER_CYCLE = "useBorrowerCycle";
  @SerializedName(SERIALIZED_NAME_USE_BORROWER_CYCLE)
  private Boolean useBorrowerCycle;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private Date startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private Date endDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetLoanProductsCurrency currency;

  public static final String SERIALIZED_NAME_PRINCIPAL = "principal";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL)
  private Float principal;

  public static final String SERIALIZED_NAME_MIN_PRINCIPAL = "minPrincipal";
  @SerializedName(SERIALIZED_NAME_MIN_PRINCIPAL)
  private Float minPrincipal;

  public static final String SERIALIZED_NAME_MAX_PRINCIPAL = "maxPrincipal";
  @SerializedName(SERIALIZED_NAME_MAX_PRINCIPAL)
  private Float maxPrincipal;

  public static final String SERIALIZED_NAME_NUMBER_OF_REPAYMENTS = "numberOfRepayments";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_REPAYMENTS)
  private Integer numberOfRepayments;

  public static final String SERIALIZED_NAME_MIN_NUMBER_OF_REPAYMENTS = "minNumberOfRepayments";
  @SerializedName(SERIALIZED_NAME_MIN_NUMBER_OF_REPAYMENTS)
  private Integer minNumberOfRepayments;

  public static final String SERIALIZED_NAME_MAX_NUMBER_OF_REPAYMENTS = "maxNumberOfRepayments";
  @SerializedName(SERIALIZED_NAME_MAX_NUMBER_OF_REPAYMENTS)
  private Integer maxNumberOfRepayments;

  public static final String SERIALIZED_NAME_REPAYMENT_EVERY = "repaymentEvery";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_EVERY)
  private Integer repaymentEvery;

  public static final String SERIALIZED_NAME_REPAYMENT_FREQUENCY_TYPE = "repaymentFrequencyType";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_FREQUENCY_TYPE)
  private GetLoanProductsRepaymentFrequencyType repaymentFrequencyType;

  public static final String SERIALIZED_NAME_INTEREST_RATE_PER_PERIOD = "interestRatePerPeriod";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE_PER_PERIOD)
  private Float interestRatePerPeriod;

  public static final String SERIALIZED_NAME_INTEREST_RATE_FREQUENCY_TYPE = "interestRateFrequencyType";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE_FREQUENCY_TYPE)
  private GetLoanProductsInterestRateFrequencyType interestRateFrequencyType;

  public static final String SERIALIZED_NAME_ANNUAL_INTEREST_RATE = "annualInterestRate";
  @SerializedName(SERIALIZED_NAME_ANNUAL_INTEREST_RATE)
  private Float annualInterestRate;

  public static final String SERIALIZED_NAME_AMORTIZATION_TYPE = "amortizationType";
  @SerializedName(SERIALIZED_NAME_AMORTIZATION_TYPE)
  private GetLoanProductsAmortizationType amortizationType;

  public static final String SERIALIZED_NAME_INTEREST_TYPE = "interestType";
  @SerializedName(SERIALIZED_NAME_INTEREST_TYPE)
  private GetLoanProductsInterestType interestType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_PERIOD_TYPE = "interestCalculationPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_PERIOD_TYPE)
  private GetLoansProductsInterestCalculationPeriodType interestCalculationPeriodType;

  public static final String SERIALIZED_NAME_TRANSACTION_PROCESSING_STRATEGY_ID = "transactionProcessingStrategyId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_PROCESSING_STRATEGY_ID)
  private Integer transactionProcessingStrategyId;

  public static final String SERIALIZED_NAME_TRANSACTION_PROCESSING_STRATEGY_NAME = "transactionProcessingStrategyName";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_PROCESSING_STRATEGY_NAME)
  private String transactionProcessingStrategyName;

  public static final String SERIALIZED_NAME_PRINCIPAL_VARIATIONS_FOR_BORROWER_CYCLE = "principalVariationsForBorrowerCycle";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_VARIATIONS_FOR_BORROWER_CYCLE)
  private List<Integer> principalVariationsForBorrowerCycle = null;

  public static final String SERIALIZED_NAME_INTEREST_RATE_VARIATIONS_FOR_BORROWER_CYCLE = "interestRateVariationsForBorrowerCycle";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE_VARIATIONS_FOR_BORROWER_CYCLE)
  private List<Integer> interestRateVariationsForBorrowerCycle = null;

  public static final String SERIALIZED_NAME_NUMBER_OF_REPAYMENT_VARIATIONS_FOR_BORROWER_CYCLE = "numberOfRepaymentVariationsForBorrowerCycle";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_REPAYMENT_VARIATIONS_FOR_BORROWER_CYCLE)
  private List<Integer> numberOfRepaymentVariationsForBorrowerCycle = null;

  public static final String SERIALIZED_NAME_DAYS_IN_MONTH_TYPE = "daysInMonthType";
  @SerializedName(SERIALIZED_NAME_DAYS_IN_MONTH_TYPE)
  private GetLoansProductsDaysInMonthType daysInMonthType;

  public static final String SERIALIZED_NAME_DAYS_IN_YEAR_TYPE = "daysInYearType";
  @SerializedName(SERIALIZED_NAME_DAYS_IN_YEAR_TYPE)
  private GetLoansProductsDaysInYearType daysInYearType;

  public static final String SERIALIZED_NAME_IS_INTEREST_RECALCULATION_ENABLED = "isInterestRecalculationEnabled";
  @SerializedName(SERIALIZED_NAME_IS_INTEREST_RECALCULATION_ENABLED)
  private Boolean isInterestRecalculationEnabled;

  public static final String SERIALIZED_NAME_INTEREST_RECALCULATION_DATA = "interestRecalculationData";
  @SerializedName(SERIALIZED_NAME_INTEREST_RECALCULATION_DATA)
  private GetLoanProductsInterestRecalculationData interestRecalculationData;

  public static final String SERIALIZED_NAME_ACCOUNTING_RULE = "accountingRule";
  @SerializedName(SERIALIZED_NAME_ACCOUNTING_RULE)
  private GetLoanProductsAccountingRule accountingRule;

  public static final String SERIALIZED_NAME_PRINCIPAL_THRESHOLD_FOR_LAST_INSTALMENT = "principalThresholdForLastInstalment";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_THRESHOLD_FOR_LAST_INSTALMENT)
  private Integer principalThresholdForLastInstalment;


  public GetLoanProductsResponse id(Integer id) {
    
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


  public GetLoanProductsResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "personal loan product", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetLoanProductsResponse shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pe1", value = "")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public GetLoanProductsResponse includeInBorrowerCycle(Boolean includeInBorrowerCycle) {
    
    this.includeInBorrowerCycle = includeInBorrowerCycle;
    return this;
  }

   /**
   * Get includeInBorrowerCycle
   * @return includeInBorrowerCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIncludeInBorrowerCycle() {
    return includeInBorrowerCycle;
  }


  public void setIncludeInBorrowerCycle(Boolean includeInBorrowerCycle) {
    this.includeInBorrowerCycle = includeInBorrowerCycle;
  }


  public GetLoanProductsResponse useBorrowerCycle(Boolean useBorrowerCycle) {
    
    this.useBorrowerCycle = useBorrowerCycle;
    return this;
  }

   /**
   * Get useBorrowerCycle
   * @return useBorrowerCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getUseBorrowerCycle() {
    return useBorrowerCycle;
  }


  public void setUseBorrowerCycle(Boolean useBorrowerCycle) {
    this.useBorrowerCycle = useBorrowerCycle;
  }


  public GetLoanProductsResponse startDate(Date startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getStartDate() {
    return startDate;
  }


  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  public GetLoanProductsResponse endDate(Date endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getEndDate() {
    return endDate;
  }


  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  public GetLoanProductsResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "loanProduct.active", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public GetLoanProductsResponse currency(GetLoanProductsCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetLoanProductsCurrency currency) {
    this.currency = currency;
  }


  public GetLoanProductsResponse principal(Float principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * Get principal
   * @return principal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000.0", value = "")

  public Float getPrincipal() {
    return principal;
  }


  public void setPrincipal(Float principal) {
    this.principal = principal;
  }


  public GetLoanProductsResponse minPrincipal(Float minPrincipal) {
    
    this.minPrincipal = minPrincipal;
    return this;
  }

   /**
   * Get minPrincipal
   * @return minPrincipal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000.0", value = "")

  public Float getMinPrincipal() {
    return minPrincipal;
  }


  public void setMinPrincipal(Float minPrincipal) {
    this.minPrincipal = minPrincipal;
  }


  public GetLoanProductsResponse maxPrincipal(Float maxPrincipal) {
    
    this.maxPrincipal = maxPrincipal;
    return this;
  }

   /**
   * Get maxPrincipal
   * @return maxPrincipal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15000.0", value = "")

  public Float getMaxPrincipal() {
    return maxPrincipal;
  }


  public void setMaxPrincipal(Float maxPrincipal) {
    this.maxPrincipal = maxPrincipal;
  }


  public GetLoanProductsResponse numberOfRepayments(Integer numberOfRepayments) {
    
    this.numberOfRepayments = numberOfRepayments;
    return this;
  }

   /**
   * Get numberOfRepayments
   * @return numberOfRepayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public Integer getNumberOfRepayments() {
    return numberOfRepayments;
  }


  public void setNumberOfRepayments(Integer numberOfRepayments) {
    this.numberOfRepayments = numberOfRepayments;
  }


  public GetLoanProductsResponse minNumberOfRepayments(Integer minNumberOfRepayments) {
    
    this.minNumberOfRepayments = minNumberOfRepayments;
    return this;
  }

   /**
   * Get minNumberOfRepayments
   * @return minNumberOfRepayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getMinNumberOfRepayments() {
    return minNumberOfRepayments;
  }


  public void setMinNumberOfRepayments(Integer minNumberOfRepayments) {
    this.minNumberOfRepayments = minNumberOfRepayments;
  }


  public GetLoanProductsResponse maxNumberOfRepayments(Integer maxNumberOfRepayments) {
    
    this.maxNumberOfRepayments = maxNumberOfRepayments;
    return this;
  }

   /**
   * Get maxNumberOfRepayments
   * @return maxNumberOfRepayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15", value = "")

  public Integer getMaxNumberOfRepayments() {
    return maxNumberOfRepayments;
  }


  public void setMaxNumberOfRepayments(Integer maxNumberOfRepayments) {
    this.maxNumberOfRepayments = maxNumberOfRepayments;
  }


  public GetLoanProductsResponse repaymentEvery(Integer repaymentEvery) {
    
    this.repaymentEvery = repaymentEvery;
    return this;
  }

   /**
   * Get repaymentEvery
   * @return repaymentEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "")

  public Integer getRepaymentEvery() {
    return repaymentEvery;
  }


  public void setRepaymentEvery(Integer repaymentEvery) {
    this.repaymentEvery = repaymentEvery;
  }


  public GetLoanProductsResponse repaymentFrequencyType(GetLoanProductsRepaymentFrequencyType repaymentFrequencyType) {
    
    this.repaymentFrequencyType = repaymentFrequencyType;
    return this;
  }

   /**
   * Get repaymentFrequencyType
   * @return repaymentFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsRepaymentFrequencyType getRepaymentFrequencyType() {
    return repaymentFrequencyType;
  }


  public void setRepaymentFrequencyType(GetLoanProductsRepaymentFrequencyType repaymentFrequencyType) {
    this.repaymentFrequencyType = repaymentFrequencyType;
  }


  public GetLoanProductsResponse interestRatePerPeriod(Float interestRatePerPeriod) {
    
    this.interestRatePerPeriod = interestRatePerPeriod;
    return this;
  }

   /**
   * Get interestRatePerPeriod
   * @return interestRatePerPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15.0", value = "")

  public Float getInterestRatePerPeriod() {
    return interestRatePerPeriod;
  }


  public void setInterestRatePerPeriod(Float interestRatePerPeriod) {
    this.interestRatePerPeriod = interestRatePerPeriod;
  }


  public GetLoanProductsResponse interestRateFrequencyType(GetLoanProductsInterestRateFrequencyType interestRateFrequencyType) {
    
    this.interestRateFrequencyType = interestRateFrequencyType;
    return this;
  }

   /**
   * Get interestRateFrequencyType
   * @return interestRateFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsInterestRateFrequencyType getInterestRateFrequencyType() {
    return interestRateFrequencyType;
  }


  public void setInterestRateFrequencyType(GetLoanProductsInterestRateFrequencyType interestRateFrequencyType) {
    this.interestRateFrequencyType = interestRateFrequencyType;
  }


  public GetLoanProductsResponse annualInterestRate(Float annualInterestRate) {
    
    this.annualInterestRate = annualInterestRate;
    return this;
  }

   /**
   * Get annualInterestRate
   * @return annualInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15.0", value = "")

  public Float getAnnualInterestRate() {
    return annualInterestRate;
  }


  public void setAnnualInterestRate(Float annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }


  public GetLoanProductsResponse amortizationType(GetLoanProductsAmortizationType amortizationType) {
    
    this.amortizationType = amortizationType;
    return this;
  }

   /**
   * Get amortizationType
   * @return amortizationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsAmortizationType getAmortizationType() {
    return amortizationType;
  }


  public void setAmortizationType(GetLoanProductsAmortizationType amortizationType) {
    this.amortizationType = amortizationType;
  }


  public GetLoanProductsResponse interestType(GetLoanProductsInterestType interestType) {
    
    this.interestType = interestType;
    return this;
  }

   /**
   * Get interestType
   * @return interestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsInterestType getInterestType() {
    return interestType;
  }


  public void setInterestType(GetLoanProductsInterestType interestType) {
    this.interestType = interestType;
  }


  public GetLoanProductsResponse interestCalculationPeriodType(GetLoansProductsInterestCalculationPeriodType interestCalculationPeriodType) {
    
    this.interestCalculationPeriodType = interestCalculationPeriodType;
    return this;
  }

   /**
   * Get interestCalculationPeriodType
   * @return interestCalculationPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansProductsInterestCalculationPeriodType getInterestCalculationPeriodType() {
    return interestCalculationPeriodType;
  }


  public void setInterestCalculationPeriodType(GetLoansProductsInterestCalculationPeriodType interestCalculationPeriodType) {
    this.interestCalculationPeriodType = interestCalculationPeriodType;
  }


  public GetLoanProductsResponse transactionProcessingStrategyId(Integer transactionProcessingStrategyId) {
    
    this.transactionProcessingStrategyId = transactionProcessingStrategyId;
    return this;
  }

   /**
   * Get transactionProcessingStrategyId
   * @return transactionProcessingStrategyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getTransactionProcessingStrategyId() {
    return transactionProcessingStrategyId;
  }


  public void setTransactionProcessingStrategyId(Integer transactionProcessingStrategyId) {
    this.transactionProcessingStrategyId = transactionProcessingStrategyId;
  }


  public GetLoanProductsResponse transactionProcessingStrategyName(String transactionProcessingStrategyName) {
    
    this.transactionProcessingStrategyName = transactionProcessingStrategyName;
    return this;
  }

   /**
   * Get transactionProcessingStrategyName
   * @return transactionProcessingStrategyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mifos style", value = "")

  public String getTransactionProcessingStrategyName() {
    return transactionProcessingStrategyName;
  }


  public void setTransactionProcessingStrategyName(String transactionProcessingStrategyName) {
    this.transactionProcessingStrategyName = transactionProcessingStrategyName;
  }


  public GetLoanProductsResponse principalVariationsForBorrowerCycle(List<Integer> principalVariationsForBorrowerCycle) {
    
    this.principalVariationsForBorrowerCycle = principalVariationsForBorrowerCycle;
    return this;
  }

  public GetLoanProductsResponse addPrincipalVariationsForBorrowerCycleItem(Integer principalVariationsForBorrowerCycleItem) {
    if (this.principalVariationsForBorrowerCycle == null) {
      this.principalVariationsForBorrowerCycle = new ArrayList<Integer>();
    }
    this.principalVariationsForBorrowerCycle.add(principalVariationsForBorrowerCycleItem);
    return this;
  }

   /**
   * Get principalVariationsForBorrowerCycle
   * @return principalVariationsForBorrowerCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "")

  public List<Integer> getPrincipalVariationsForBorrowerCycle() {
    return principalVariationsForBorrowerCycle;
  }


  public void setPrincipalVariationsForBorrowerCycle(List<Integer> principalVariationsForBorrowerCycle) {
    this.principalVariationsForBorrowerCycle = principalVariationsForBorrowerCycle;
  }


  public GetLoanProductsResponse interestRateVariationsForBorrowerCycle(List<Integer> interestRateVariationsForBorrowerCycle) {
    
    this.interestRateVariationsForBorrowerCycle = interestRateVariationsForBorrowerCycle;
    return this;
  }

  public GetLoanProductsResponse addInterestRateVariationsForBorrowerCycleItem(Integer interestRateVariationsForBorrowerCycleItem) {
    if (this.interestRateVariationsForBorrowerCycle == null) {
      this.interestRateVariationsForBorrowerCycle = new ArrayList<Integer>();
    }
    this.interestRateVariationsForBorrowerCycle.add(interestRateVariationsForBorrowerCycleItem);
    return this;
  }

   /**
   * Get interestRateVariationsForBorrowerCycle
   * @return interestRateVariationsForBorrowerCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "")

  public List<Integer> getInterestRateVariationsForBorrowerCycle() {
    return interestRateVariationsForBorrowerCycle;
  }


  public void setInterestRateVariationsForBorrowerCycle(List<Integer> interestRateVariationsForBorrowerCycle) {
    this.interestRateVariationsForBorrowerCycle = interestRateVariationsForBorrowerCycle;
  }


  public GetLoanProductsResponse numberOfRepaymentVariationsForBorrowerCycle(List<Integer> numberOfRepaymentVariationsForBorrowerCycle) {
    
    this.numberOfRepaymentVariationsForBorrowerCycle = numberOfRepaymentVariationsForBorrowerCycle;
    return this;
  }

  public GetLoanProductsResponse addNumberOfRepaymentVariationsForBorrowerCycleItem(Integer numberOfRepaymentVariationsForBorrowerCycleItem) {
    if (this.numberOfRepaymentVariationsForBorrowerCycle == null) {
      this.numberOfRepaymentVariationsForBorrowerCycle = new ArrayList<Integer>();
    }
    this.numberOfRepaymentVariationsForBorrowerCycle.add(numberOfRepaymentVariationsForBorrowerCycleItem);
    return this;
  }

   /**
   * Get numberOfRepaymentVariationsForBorrowerCycle
   * @return numberOfRepaymentVariationsForBorrowerCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "")

  public List<Integer> getNumberOfRepaymentVariationsForBorrowerCycle() {
    return numberOfRepaymentVariationsForBorrowerCycle;
  }


  public void setNumberOfRepaymentVariationsForBorrowerCycle(List<Integer> numberOfRepaymentVariationsForBorrowerCycle) {
    this.numberOfRepaymentVariationsForBorrowerCycle = numberOfRepaymentVariationsForBorrowerCycle;
  }


  public GetLoanProductsResponse daysInMonthType(GetLoansProductsDaysInMonthType daysInMonthType) {
    
    this.daysInMonthType = daysInMonthType;
    return this;
  }

   /**
   * Get daysInMonthType
   * @return daysInMonthType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansProductsDaysInMonthType getDaysInMonthType() {
    return daysInMonthType;
  }


  public void setDaysInMonthType(GetLoansProductsDaysInMonthType daysInMonthType) {
    this.daysInMonthType = daysInMonthType;
  }


  public GetLoanProductsResponse daysInYearType(GetLoansProductsDaysInYearType daysInYearType) {
    
    this.daysInYearType = daysInYearType;
    return this;
  }

   /**
   * Get daysInYearType
   * @return daysInYearType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansProductsDaysInYearType getDaysInYearType() {
    return daysInYearType;
  }


  public void setDaysInYearType(GetLoansProductsDaysInYearType daysInYearType) {
    this.daysInYearType = daysInYearType;
  }


  public GetLoanProductsResponse isInterestRecalculationEnabled(Boolean isInterestRecalculationEnabled) {
    
    this.isInterestRecalculationEnabled = isInterestRecalculationEnabled;
    return this;
  }

   /**
   * Get isInterestRecalculationEnabled
   * @return isInterestRecalculationEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsInterestRecalculationEnabled() {
    return isInterestRecalculationEnabled;
  }


  public void setIsInterestRecalculationEnabled(Boolean isInterestRecalculationEnabled) {
    this.isInterestRecalculationEnabled = isInterestRecalculationEnabled;
  }


  public GetLoanProductsResponse interestRecalculationData(GetLoanProductsInterestRecalculationData interestRecalculationData) {
    
    this.interestRecalculationData = interestRecalculationData;
    return this;
  }

   /**
   * Get interestRecalculationData
   * @return interestRecalculationData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsInterestRecalculationData getInterestRecalculationData() {
    return interestRecalculationData;
  }


  public void setInterestRecalculationData(GetLoanProductsInterestRecalculationData interestRecalculationData) {
    this.interestRecalculationData = interestRecalculationData;
  }


  public GetLoanProductsResponse accountingRule(GetLoanProductsAccountingRule accountingRule) {
    
    this.accountingRule = accountingRule;
    return this;
  }

   /**
   * Get accountingRule
   * @return accountingRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsAccountingRule getAccountingRule() {
    return accountingRule;
  }


  public void setAccountingRule(GetLoanProductsAccountingRule accountingRule) {
    this.accountingRule = accountingRule;
  }


  public GetLoanProductsResponse principalThresholdForLastInstalment(Integer principalThresholdForLastInstalment) {
    
    this.principalThresholdForLastInstalment = principalThresholdForLastInstalment;
    return this;
  }

   /**
   * Get principalThresholdForLastInstalment
   * @return principalThresholdForLastInstalment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getPrincipalThresholdForLastInstalment() {
    return principalThresholdForLastInstalment;
  }


  public void setPrincipalThresholdForLastInstalment(Integer principalThresholdForLastInstalment) {
    this.principalThresholdForLastInstalment = principalThresholdForLastInstalment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoanProductsResponse getLoanProductsResponse = (GetLoanProductsResponse) o;
    return Objects.equals(this.id, getLoanProductsResponse.id) &&
        Objects.equals(this.name, getLoanProductsResponse.name) &&
        Objects.equals(this.shortName, getLoanProductsResponse.shortName) &&
        Objects.equals(this.includeInBorrowerCycle, getLoanProductsResponse.includeInBorrowerCycle) &&
        Objects.equals(this.useBorrowerCycle, getLoanProductsResponse.useBorrowerCycle) &&
        Objects.equals(this.startDate, getLoanProductsResponse.startDate) &&
        Objects.equals(this.endDate, getLoanProductsResponse.endDate) &&
        Objects.equals(this.status, getLoanProductsResponse.status) &&
        Objects.equals(this.currency, getLoanProductsResponse.currency) &&
        Objects.equals(this.principal, getLoanProductsResponse.principal) &&
        Objects.equals(this.minPrincipal, getLoanProductsResponse.minPrincipal) &&
        Objects.equals(this.maxPrincipal, getLoanProductsResponse.maxPrincipal) &&
        Objects.equals(this.numberOfRepayments, getLoanProductsResponse.numberOfRepayments) &&
        Objects.equals(this.minNumberOfRepayments, getLoanProductsResponse.minNumberOfRepayments) &&
        Objects.equals(this.maxNumberOfRepayments, getLoanProductsResponse.maxNumberOfRepayments) &&
        Objects.equals(this.repaymentEvery, getLoanProductsResponse.repaymentEvery) &&
        Objects.equals(this.repaymentFrequencyType, getLoanProductsResponse.repaymentFrequencyType) &&
        Objects.equals(this.interestRatePerPeriod, getLoanProductsResponse.interestRatePerPeriod) &&
        Objects.equals(this.interestRateFrequencyType, getLoanProductsResponse.interestRateFrequencyType) &&
        Objects.equals(this.annualInterestRate, getLoanProductsResponse.annualInterestRate) &&
        Objects.equals(this.amortizationType, getLoanProductsResponse.amortizationType) &&
        Objects.equals(this.interestType, getLoanProductsResponse.interestType) &&
        Objects.equals(this.interestCalculationPeriodType, getLoanProductsResponse.interestCalculationPeriodType) &&
        Objects.equals(this.transactionProcessingStrategyId, getLoanProductsResponse.transactionProcessingStrategyId) &&
        Objects.equals(this.transactionProcessingStrategyName, getLoanProductsResponse.transactionProcessingStrategyName) &&
        Objects.equals(this.principalVariationsForBorrowerCycle, getLoanProductsResponse.principalVariationsForBorrowerCycle) &&
        Objects.equals(this.interestRateVariationsForBorrowerCycle, getLoanProductsResponse.interestRateVariationsForBorrowerCycle) &&
        Objects.equals(this.numberOfRepaymentVariationsForBorrowerCycle, getLoanProductsResponse.numberOfRepaymentVariationsForBorrowerCycle) &&
        Objects.equals(this.daysInMonthType, getLoanProductsResponse.daysInMonthType) &&
        Objects.equals(this.daysInYearType, getLoanProductsResponse.daysInYearType) &&
        Objects.equals(this.isInterestRecalculationEnabled, getLoanProductsResponse.isInterestRecalculationEnabled) &&
        Objects.equals(this.interestRecalculationData, getLoanProductsResponse.interestRecalculationData) &&
        Objects.equals(this.accountingRule, getLoanProductsResponse.accountingRule) &&
        Objects.equals(this.principalThresholdForLastInstalment, getLoanProductsResponse.principalThresholdForLastInstalment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, shortName, includeInBorrowerCycle, useBorrowerCycle, startDate, endDate, status, currency, principal, minPrincipal, maxPrincipal, numberOfRepayments, minNumberOfRepayments, maxNumberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, interestRateFrequencyType, annualInterestRate, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, transactionProcessingStrategyName, principalVariationsForBorrowerCycle, interestRateVariationsForBorrowerCycle, numberOfRepaymentVariationsForBorrowerCycle, daysInMonthType, daysInYearType, isInterestRecalculationEnabled, interestRecalculationData, accountingRule, principalThresholdForLastInstalment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoanProductsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    includeInBorrowerCycle: ").append(toIndentedString(includeInBorrowerCycle)).append("\n");
    sb.append("    useBorrowerCycle: ").append(toIndentedString(useBorrowerCycle)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    minPrincipal: ").append(toIndentedString(minPrincipal)).append("\n");
    sb.append("    maxPrincipal: ").append(toIndentedString(maxPrincipal)).append("\n");
    sb.append("    numberOfRepayments: ").append(toIndentedString(numberOfRepayments)).append("\n");
    sb.append("    minNumberOfRepayments: ").append(toIndentedString(minNumberOfRepayments)).append("\n");
    sb.append("    maxNumberOfRepayments: ").append(toIndentedString(maxNumberOfRepayments)).append("\n");
    sb.append("    repaymentEvery: ").append(toIndentedString(repaymentEvery)).append("\n");
    sb.append("    repaymentFrequencyType: ").append(toIndentedString(repaymentFrequencyType)).append("\n");
    sb.append("    interestRatePerPeriod: ").append(toIndentedString(interestRatePerPeriod)).append("\n");
    sb.append("    interestRateFrequencyType: ").append(toIndentedString(interestRateFrequencyType)).append("\n");
    sb.append("    annualInterestRate: ").append(toIndentedString(annualInterestRate)).append("\n");
    sb.append("    amortizationType: ").append(toIndentedString(amortizationType)).append("\n");
    sb.append("    interestType: ").append(toIndentedString(interestType)).append("\n");
    sb.append("    interestCalculationPeriodType: ").append(toIndentedString(interestCalculationPeriodType)).append("\n");
    sb.append("    transactionProcessingStrategyId: ").append(toIndentedString(transactionProcessingStrategyId)).append("\n");
    sb.append("    transactionProcessingStrategyName: ").append(toIndentedString(transactionProcessingStrategyName)).append("\n");
    sb.append("    principalVariationsForBorrowerCycle: ").append(toIndentedString(principalVariationsForBorrowerCycle)).append("\n");
    sb.append("    interestRateVariationsForBorrowerCycle: ").append(toIndentedString(interestRateVariationsForBorrowerCycle)).append("\n");
    sb.append("    numberOfRepaymentVariationsForBorrowerCycle: ").append(toIndentedString(numberOfRepaymentVariationsForBorrowerCycle)).append("\n");
    sb.append("    daysInMonthType: ").append(toIndentedString(daysInMonthType)).append("\n");
    sb.append("    daysInYearType: ").append(toIndentedString(daysInYearType)).append("\n");
    sb.append("    isInterestRecalculationEnabled: ").append(toIndentedString(isInterestRecalculationEnabled)).append("\n");
    sb.append("    interestRecalculationData: ").append(toIndentedString(interestRecalculationData)).append("\n");
    sb.append("    accountingRule: ").append(toIndentedString(accountingRule)).append("\n");
    sb.append("    principalThresholdForLastInstalment: ").append(toIndentedString(principalThresholdForLastInstalment)).append("\n");
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


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
import org.apache.fineract.client.models.GetLoansLoanIdAmortizationType;
import org.apache.fineract.client.models.GetLoansLoanIdCurrency;
import org.apache.fineract.client.models.GetLoansLoanIdInterestCalculationPeriodType;
import org.apache.fineract.client.models.GetLoansLoanIdInterestRateFrequencyType;
import org.apache.fineract.client.models.GetLoansLoanIdInterestType;
import org.apache.fineract.client.models.GetLoansLoanIdLoanType;
import org.apache.fineract.client.models.GetLoansLoanIdRepaymentFrequencyType;
import org.apache.fineract.client.models.GetLoansLoanIdStatus;
import org.apache.fineract.client.models.GetLoansLoanIdSummary;
import org.apache.fineract.client.models.GetLoansLoanIdTermPeriodFrequencyType;
import org.apache.fineract.client.models.GetLoansLoanIdTimeline;

/**
 * GetLoansLoanIdResponse
 */
@ApiModel(description = "GetLoansLoanIdResponse")

public class GetLoansLoanIdResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ACCOUNT_NO = "accountNo";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private Long accountNo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GetLoansLoanIdStatus status;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "clientName";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_CLIENT_OFFICE_ID = "clientOfficeId";
  @SerializedName(SERIALIZED_NAME_CLIENT_OFFICE_ID)
  private Integer clientOfficeId;

  public static final String SERIALIZED_NAME_LOAN_PRODUCT_ID = "loanProductId";
  @SerializedName(SERIALIZED_NAME_LOAN_PRODUCT_ID)
  private Integer loanProductId;

  public static final String SERIALIZED_NAME_LOAN_PRODUCT_NAME = "loanProductName";
  @SerializedName(SERIALIZED_NAME_LOAN_PRODUCT_NAME)
  private String loanProductName;

  public static final String SERIALIZED_NAME_LOAN_PRODUCT_DESCRIPTION = "loanProductDescription";
  @SerializedName(SERIALIZED_NAME_LOAN_PRODUCT_DESCRIPTION)
  private String loanProductDescription;

  public static final String SERIALIZED_NAME_LOAN_PURPOSE_ID = "loanPurposeId";
  @SerializedName(SERIALIZED_NAME_LOAN_PURPOSE_ID)
  private Integer loanPurposeId;

  public static final String SERIALIZED_NAME_LOAN_PURPOSE_NAME = "loanPurposeName";
  @SerializedName(SERIALIZED_NAME_LOAN_PURPOSE_NAME)
  private String loanPurposeName;

  public static final String SERIALIZED_NAME_LOAN_OFFICER_ID = "loanOfficerId";
  @SerializedName(SERIALIZED_NAME_LOAN_OFFICER_ID)
  private Integer loanOfficerId;

  public static final String SERIALIZED_NAME_LOAN_OFFICER_NAME = "loanOfficerName";
  @SerializedName(SERIALIZED_NAME_LOAN_OFFICER_NAME)
  private String loanOfficerName;

  public static final String SERIALIZED_NAME_LOAN_TYPE = "loanType";
  @SerializedName(SERIALIZED_NAME_LOAN_TYPE)
  private GetLoansLoanIdLoanType loanType;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetLoansLoanIdCurrency currency;

  public static final String SERIALIZED_NAME_PRINCIPAL = "principal";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL)
  private Long principal;

  public static final String SERIALIZED_NAME_TERM_FREQUENCY = "termFrequency";
  @SerializedName(SERIALIZED_NAME_TERM_FREQUENCY)
  private Integer termFrequency;

  public static final String SERIALIZED_NAME_TERM_PERIOD_FREQUENCY_TYPE = "termPeriodFrequencyType";
  @SerializedName(SERIALIZED_NAME_TERM_PERIOD_FREQUENCY_TYPE)
  private GetLoansLoanIdTermPeriodFrequencyType termPeriodFrequencyType;

  public static final String SERIALIZED_NAME_NUMBER_OF_REPAYMENTS = "numberOfRepayments";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_REPAYMENTS)
  private Integer numberOfRepayments;

  public static final String SERIALIZED_NAME_REPAYMENT_EVERY = "repaymentEvery";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_EVERY)
  private Integer repaymentEvery;

  public static final String SERIALIZED_NAME_REPAYMENT_FREQUENCY_TYPE = "repaymentFrequencyType";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_FREQUENCY_TYPE)
  private GetLoansLoanIdRepaymentFrequencyType repaymentFrequencyType;

  public static final String SERIALIZED_NAME_INTEREST_RATE_PER_PERIOD = "interestRatePerPeriod";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE_PER_PERIOD)
  private Integer interestRatePerPeriod;

  public static final String SERIALIZED_NAME_INTEREST_RATE_FREQUENCY_TYPE = "interestRateFrequencyType";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE_FREQUENCY_TYPE)
  private GetLoansLoanIdInterestRateFrequencyType interestRateFrequencyType;

  public static final String SERIALIZED_NAME_ANNUAL_INTEREST_RATE = "annualInterestRate";
  @SerializedName(SERIALIZED_NAME_ANNUAL_INTEREST_RATE)
  private Integer annualInterestRate;

  public static final String SERIALIZED_NAME_AMORTIZATION_TYPE = "amortizationType";
  @SerializedName(SERIALIZED_NAME_AMORTIZATION_TYPE)
  private GetLoansLoanIdAmortizationType amortizationType;

  public static final String SERIALIZED_NAME_INTEREST_TYPE = "interestType";
  @SerializedName(SERIALIZED_NAME_INTEREST_TYPE)
  private GetLoansLoanIdInterestType interestType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_PERIOD_TYPE = "interestCalculationPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_PERIOD_TYPE)
  private GetLoansLoanIdInterestCalculationPeriodType interestCalculationPeriodType;

  public static final String SERIALIZED_NAME_TRANSACTION_PROCESSING_STRATEGY_ID = "transactionProcessingStrategyId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_PROCESSING_STRATEGY_ID)
  private Integer transactionProcessingStrategyId;

  public static final String SERIALIZED_NAME_TIMELINE = "timeline";
  @SerializedName(SERIALIZED_NAME_TIMELINE)
  private GetLoansLoanIdTimeline timeline;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private GetLoansLoanIdSummary summary;


  public GetLoansLoanIdResponse id(Long id) {
    
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


  public GetLoansLoanIdResponse accountNo(Long accountNo) {
    
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


  public GetLoansLoanIdResponse status(GetLoansLoanIdStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdStatus getStatus() {
    return status;
  }


  public void setStatus(GetLoansLoanIdStatus status) {
    this.status = status;
  }


  public GetLoansLoanIdResponse clientId(Integer clientId) {
    
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


  public GetLoansLoanIdResponse clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Kampala first Client", value = "")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public GetLoansLoanIdResponse clientOfficeId(Integer clientOfficeId) {
    
    this.clientOfficeId = clientOfficeId;
    return this;
  }

   /**
   * Get clientOfficeId
   * @return clientOfficeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getClientOfficeId() {
    return clientOfficeId;
  }


  public void setClientOfficeId(Integer clientOfficeId) {
    this.clientOfficeId = clientOfficeId;
  }


  public GetLoansLoanIdResponse loanProductId(Integer loanProductId) {
    
    this.loanProductId = loanProductId;
    return this;
  }

   /**
   * Get loanProductId
   * @return loanProductId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getLoanProductId() {
    return loanProductId;
  }


  public void setLoanProductId(Integer loanProductId) {
    this.loanProductId = loanProductId;
  }


  public GetLoansLoanIdResponse loanProductName(String loanProductName) {
    
    this.loanProductName = loanProductName;
    return this;
  }

   /**
   * Get loanProductName
   * @return loanProductName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Kampala Product (with cash accounting)", value = "")

  public String getLoanProductName() {
    return loanProductName;
  }


  public void setLoanProductName(String loanProductName) {
    this.loanProductName = loanProductName;
  }


  public GetLoansLoanIdResponse loanProductDescription(String loanProductDescription) {
    
    this.loanProductDescription = loanProductDescription;
    return this;
  }

   /**
   * Get loanProductDescription
   * @return loanProductDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Typical Kampala loan product with cash accounting enabled for testing.", value = "")

  public String getLoanProductDescription() {
    return loanProductDescription;
  }


  public void setLoanProductDescription(String loanProductDescription) {
    this.loanProductDescription = loanProductDescription;
  }


  public GetLoansLoanIdResponse loanPurposeId(Integer loanPurposeId) {
    
    this.loanPurposeId = loanPurposeId;
    return this;
  }

   /**
   * Get loanPurposeId
   * @return loanPurposeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22", value = "")

  public Integer getLoanPurposeId() {
    return loanPurposeId;
  }


  public void setLoanPurposeId(Integer loanPurposeId) {
    this.loanPurposeId = loanPurposeId;
  }


  public GetLoansLoanIdResponse loanPurposeName(String loanPurposeName) {
    
    this.loanPurposeName = loanPurposeName;
    return this;
  }

   /**
   * Get loanPurposeName
   * @return loanPurposeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "option.HousingImprovement", value = "")

  public String getLoanPurposeName() {
    return loanPurposeName;
  }


  public void setLoanPurposeName(String loanPurposeName) {
    this.loanPurposeName = loanPurposeName;
  }


  public GetLoansLoanIdResponse loanOfficerId(Integer loanOfficerId) {
    
    this.loanOfficerId = loanOfficerId;
    return this;
  }

   /**
   * Get loanOfficerId
   * @return loanOfficerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getLoanOfficerId() {
    return loanOfficerId;
  }


  public void setLoanOfficerId(Integer loanOfficerId) {
    this.loanOfficerId = loanOfficerId;
  }


  public GetLoansLoanIdResponse loanOfficerName(String loanOfficerName) {
    
    this.loanOfficerName = loanOfficerName;
    return this;
  }

   /**
   * Get loanOfficerName
   * @return loanOfficerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LoanOfficer, Kampala", value = "")

  public String getLoanOfficerName() {
    return loanOfficerName;
  }


  public void setLoanOfficerName(String loanOfficerName) {
    this.loanOfficerName = loanOfficerName;
  }


  public GetLoansLoanIdResponse loanType(GetLoansLoanIdLoanType loanType) {
    
    this.loanType = loanType;
    return this;
  }

   /**
   * Get loanType
   * @return loanType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdLoanType getLoanType() {
    return loanType;
  }


  public void setLoanType(GetLoansLoanIdLoanType loanType) {
    this.loanType = loanType;
  }


  public GetLoansLoanIdResponse currency(GetLoansLoanIdCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetLoansLoanIdCurrency currency) {
    this.currency = currency;
  }


  public GetLoansLoanIdResponse principal(Long principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * Get principal
   * @return principal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000000", value = "")

  public Long getPrincipal() {
    return principal;
  }


  public void setPrincipal(Long principal) {
    this.principal = principal;
  }


  public GetLoansLoanIdResponse termFrequency(Integer termFrequency) {
    
    this.termFrequency = termFrequency;
    return this;
  }

   /**
   * Get termFrequency
   * @return termFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "")

  public Integer getTermFrequency() {
    return termFrequency;
  }


  public void setTermFrequency(Integer termFrequency) {
    this.termFrequency = termFrequency;
  }


  public GetLoansLoanIdResponse termPeriodFrequencyType(GetLoansLoanIdTermPeriodFrequencyType termPeriodFrequencyType) {
    
    this.termPeriodFrequencyType = termPeriodFrequencyType;
    return this;
  }

   /**
   * Get termPeriodFrequencyType
   * @return termPeriodFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdTermPeriodFrequencyType getTermPeriodFrequencyType() {
    return termPeriodFrequencyType;
  }


  public void setTermPeriodFrequencyType(GetLoansLoanIdTermPeriodFrequencyType termPeriodFrequencyType) {
    this.termPeriodFrequencyType = termPeriodFrequencyType;
  }


  public GetLoansLoanIdResponse numberOfRepayments(Integer numberOfRepayments) {
    
    this.numberOfRepayments = numberOfRepayments;
    return this;
  }

   /**
   * Get numberOfRepayments
   * @return numberOfRepayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "")

  public Integer getNumberOfRepayments() {
    return numberOfRepayments;
  }


  public void setNumberOfRepayments(Integer numberOfRepayments) {
    this.numberOfRepayments = numberOfRepayments;
  }


  public GetLoansLoanIdResponse repaymentEvery(Integer repaymentEvery) {
    
    this.repaymentEvery = repaymentEvery;
    return this;
  }

   /**
   * Get repaymentEvery
   * @return repaymentEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getRepaymentEvery() {
    return repaymentEvery;
  }


  public void setRepaymentEvery(Integer repaymentEvery) {
    this.repaymentEvery = repaymentEvery;
  }


  public GetLoansLoanIdResponse repaymentFrequencyType(GetLoansLoanIdRepaymentFrequencyType repaymentFrequencyType) {
    
    this.repaymentFrequencyType = repaymentFrequencyType;
    return this;
  }

   /**
   * Get repaymentFrequencyType
   * @return repaymentFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdRepaymentFrequencyType getRepaymentFrequencyType() {
    return repaymentFrequencyType;
  }


  public void setRepaymentFrequencyType(GetLoansLoanIdRepaymentFrequencyType repaymentFrequencyType) {
    this.repaymentFrequencyType = repaymentFrequencyType;
  }


  public GetLoansLoanIdResponse interestRatePerPeriod(Integer interestRatePerPeriod) {
    
    this.interestRatePerPeriod = interestRatePerPeriod;
    return this;
  }

   /**
   * Get interestRatePerPeriod
   * @return interestRatePerPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24", value = "")

  public Integer getInterestRatePerPeriod() {
    return interestRatePerPeriod;
  }


  public void setInterestRatePerPeriod(Integer interestRatePerPeriod) {
    this.interestRatePerPeriod = interestRatePerPeriod;
  }


  public GetLoansLoanIdResponse interestRateFrequencyType(GetLoansLoanIdInterestRateFrequencyType interestRateFrequencyType) {
    
    this.interestRateFrequencyType = interestRateFrequencyType;
    return this;
  }

   /**
   * Get interestRateFrequencyType
   * @return interestRateFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdInterestRateFrequencyType getInterestRateFrequencyType() {
    return interestRateFrequencyType;
  }


  public void setInterestRateFrequencyType(GetLoansLoanIdInterestRateFrequencyType interestRateFrequencyType) {
    this.interestRateFrequencyType = interestRateFrequencyType;
  }


  public GetLoansLoanIdResponse annualInterestRate(Integer annualInterestRate) {
    
    this.annualInterestRate = annualInterestRate;
    return this;
  }

   /**
   * Get annualInterestRate
   * @return annualInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24", value = "")

  public Integer getAnnualInterestRate() {
    return annualInterestRate;
  }


  public void setAnnualInterestRate(Integer annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }


  public GetLoansLoanIdResponse amortizationType(GetLoansLoanIdAmortizationType amortizationType) {
    
    this.amortizationType = amortizationType;
    return this;
  }

   /**
   * Get amortizationType
   * @return amortizationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdAmortizationType getAmortizationType() {
    return amortizationType;
  }


  public void setAmortizationType(GetLoansLoanIdAmortizationType amortizationType) {
    this.amortizationType = amortizationType;
  }


  public GetLoansLoanIdResponse interestType(GetLoansLoanIdInterestType interestType) {
    
    this.interestType = interestType;
    return this;
  }

   /**
   * Get interestType
   * @return interestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdInterestType getInterestType() {
    return interestType;
  }


  public void setInterestType(GetLoansLoanIdInterestType interestType) {
    this.interestType = interestType;
  }


  public GetLoansLoanIdResponse interestCalculationPeriodType(GetLoansLoanIdInterestCalculationPeriodType interestCalculationPeriodType) {
    
    this.interestCalculationPeriodType = interestCalculationPeriodType;
    return this;
  }

   /**
   * Get interestCalculationPeriodType
   * @return interestCalculationPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdInterestCalculationPeriodType getInterestCalculationPeriodType() {
    return interestCalculationPeriodType;
  }


  public void setInterestCalculationPeriodType(GetLoansLoanIdInterestCalculationPeriodType interestCalculationPeriodType) {
    this.interestCalculationPeriodType = interestCalculationPeriodType;
  }


  public GetLoansLoanIdResponse transactionProcessingStrategyId(Integer transactionProcessingStrategyId) {
    
    this.transactionProcessingStrategyId = transactionProcessingStrategyId;
    return this;
  }

   /**
   * Get transactionProcessingStrategyId
   * @return transactionProcessingStrategyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getTransactionProcessingStrategyId() {
    return transactionProcessingStrategyId;
  }


  public void setTransactionProcessingStrategyId(Integer transactionProcessingStrategyId) {
    this.transactionProcessingStrategyId = transactionProcessingStrategyId;
  }


  public GetLoansLoanIdResponse timeline(GetLoansLoanIdTimeline timeline) {
    
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdTimeline getTimeline() {
    return timeline;
  }


  public void setTimeline(GetLoansLoanIdTimeline timeline) {
    this.timeline = timeline;
  }


  public GetLoansLoanIdResponse summary(GetLoansLoanIdSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoansLoanIdSummary getSummary() {
    return summary;
  }


  public void setSummary(GetLoansLoanIdSummary summary) {
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
    GetLoansLoanIdResponse getLoansLoanIdResponse = (GetLoansLoanIdResponse) o;
    return Objects.equals(this.id, getLoansLoanIdResponse.id) &&
        Objects.equals(this.accountNo, getLoansLoanIdResponse.accountNo) &&
        Objects.equals(this.status, getLoansLoanIdResponse.status) &&
        Objects.equals(this.clientId, getLoansLoanIdResponse.clientId) &&
        Objects.equals(this.clientName, getLoansLoanIdResponse.clientName) &&
        Objects.equals(this.clientOfficeId, getLoansLoanIdResponse.clientOfficeId) &&
        Objects.equals(this.loanProductId, getLoansLoanIdResponse.loanProductId) &&
        Objects.equals(this.loanProductName, getLoansLoanIdResponse.loanProductName) &&
        Objects.equals(this.loanProductDescription, getLoansLoanIdResponse.loanProductDescription) &&
        Objects.equals(this.loanPurposeId, getLoansLoanIdResponse.loanPurposeId) &&
        Objects.equals(this.loanPurposeName, getLoansLoanIdResponse.loanPurposeName) &&
        Objects.equals(this.loanOfficerId, getLoansLoanIdResponse.loanOfficerId) &&
        Objects.equals(this.loanOfficerName, getLoansLoanIdResponse.loanOfficerName) &&
        Objects.equals(this.loanType, getLoansLoanIdResponse.loanType) &&
        Objects.equals(this.currency, getLoansLoanIdResponse.currency) &&
        Objects.equals(this.principal, getLoansLoanIdResponse.principal) &&
        Objects.equals(this.termFrequency, getLoansLoanIdResponse.termFrequency) &&
        Objects.equals(this.termPeriodFrequencyType, getLoansLoanIdResponse.termPeriodFrequencyType) &&
        Objects.equals(this.numberOfRepayments, getLoansLoanIdResponse.numberOfRepayments) &&
        Objects.equals(this.repaymentEvery, getLoansLoanIdResponse.repaymentEvery) &&
        Objects.equals(this.repaymentFrequencyType, getLoansLoanIdResponse.repaymentFrequencyType) &&
        Objects.equals(this.interestRatePerPeriod, getLoansLoanIdResponse.interestRatePerPeriod) &&
        Objects.equals(this.interestRateFrequencyType, getLoansLoanIdResponse.interestRateFrequencyType) &&
        Objects.equals(this.annualInterestRate, getLoansLoanIdResponse.annualInterestRate) &&
        Objects.equals(this.amortizationType, getLoansLoanIdResponse.amortizationType) &&
        Objects.equals(this.interestType, getLoansLoanIdResponse.interestType) &&
        Objects.equals(this.interestCalculationPeriodType, getLoansLoanIdResponse.interestCalculationPeriodType) &&
        Objects.equals(this.transactionProcessingStrategyId, getLoansLoanIdResponse.transactionProcessingStrategyId) &&
        Objects.equals(this.timeline, getLoansLoanIdResponse.timeline) &&
        Objects.equals(this.summary, getLoansLoanIdResponse.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, status, clientId, clientName, clientOfficeId, loanProductId, loanProductName, loanProductDescription, loanPurposeId, loanPurposeName, loanOfficerId, loanOfficerName, loanType, currency, principal, termFrequency, termPeriodFrequencyType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, interestRateFrequencyType, annualInterestRate, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, timeline, summary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoansLoanIdResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientOfficeId: ").append(toIndentedString(clientOfficeId)).append("\n");
    sb.append("    loanProductId: ").append(toIndentedString(loanProductId)).append("\n");
    sb.append("    loanProductName: ").append(toIndentedString(loanProductName)).append("\n");
    sb.append("    loanProductDescription: ").append(toIndentedString(loanProductDescription)).append("\n");
    sb.append("    loanPurposeId: ").append(toIndentedString(loanPurposeId)).append("\n");
    sb.append("    loanPurposeName: ").append(toIndentedString(loanPurposeName)).append("\n");
    sb.append("    loanOfficerId: ").append(toIndentedString(loanOfficerId)).append("\n");
    sb.append("    loanOfficerName: ").append(toIndentedString(loanOfficerName)).append("\n");
    sb.append("    loanType: ").append(toIndentedString(loanType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    termFrequency: ").append(toIndentedString(termFrequency)).append("\n");
    sb.append("    termPeriodFrequencyType: ").append(toIndentedString(termPeriodFrequencyType)).append("\n");
    sb.append("    numberOfRepayments: ").append(toIndentedString(numberOfRepayments)).append("\n");
    sb.append("    repaymentEvery: ").append(toIndentedString(repaymentEvery)).append("\n");
    sb.append("    repaymentFrequencyType: ").append(toIndentedString(repaymentFrequencyType)).append("\n");
    sb.append("    interestRatePerPeriod: ").append(toIndentedString(interestRatePerPeriod)).append("\n");
    sb.append("    interestRateFrequencyType: ").append(toIndentedString(interestRateFrequencyType)).append("\n");
    sb.append("    annualInterestRate: ").append(toIndentedString(annualInterestRate)).append("\n");
    sb.append("    amortizationType: ").append(toIndentedString(amortizationType)).append("\n");
    sb.append("    interestType: ").append(toIndentedString(interestType)).append("\n");
    sb.append("    interestCalculationPeriodType: ").append(toIndentedString(interestCalculationPeriodType)).append("\n");
    sb.append("    transactionProcessingStrategyId: ").append(toIndentedString(transactionProcessingStrategyId)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
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

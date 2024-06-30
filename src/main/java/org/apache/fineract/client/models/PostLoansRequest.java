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

/**
 * PostLoansRequest
 */
@ApiModel(description = "PostLoansRequest")

public class PostLoansRequest {
  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_PRINCIPAL = "principal";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL)
  private Double principal;

  public static final String SERIALIZED_NAME_LOAN_TERM_FREQUENCY = "loanTermFrequency";
  @SerializedName(SERIALIZED_NAME_LOAN_TERM_FREQUENCY)
  private Integer loanTermFrequency;

  public static final String SERIALIZED_NAME_LOAN_TERM_FREQUENCY_TYPE = "loanTermFrequencyType";
  @SerializedName(SERIALIZED_NAME_LOAN_TERM_FREQUENCY_TYPE)
  private Integer loanTermFrequencyType;

  public static final String SERIALIZED_NAME_NUMBER_OF_REPAYMENTS = "numberOfRepayments";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_REPAYMENTS)
  private Integer numberOfRepayments;

  public static final String SERIALIZED_NAME_REPAYMENT_EVERY = "repaymentEvery";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_EVERY)
  private Integer repaymentEvery;

  public static final String SERIALIZED_NAME_REPAYMENT_FREQUENCY_TYPE = "repaymentFrequencyType";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_FREQUENCY_TYPE)
  private Integer repaymentFrequencyType;

  public static final String SERIALIZED_NAME_INTEREST_RATE_PER_PERIOD = "interestRatePerPeriod";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE_PER_PERIOD)
  private Integer interestRatePerPeriod;

  public static final String SERIALIZED_NAME_AMORTIZATION_TYPE = "amortizationType";
  @SerializedName(SERIALIZED_NAME_AMORTIZATION_TYPE)
  private Integer amortizationType;

  public static final String SERIALIZED_NAME_INTEREST_TYPE = "interestType";
  @SerializedName(SERIALIZED_NAME_INTEREST_TYPE)
  private Integer interestType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_PERIOD_TYPE = "interestCalculationPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_PERIOD_TYPE)
  private Integer interestCalculationPeriodType;

  public static final String SERIALIZED_NAME_EXPECTED_DISBURSEMENT_DATE = "expectedDisbursementDate";
  @SerializedName(SERIALIZED_NAME_EXPECTED_DISBURSEMENT_DATE)
  private String expectedDisbursementDate;

  public static final String SERIALIZED_NAME_TRANSACTION_PROCESSING_STRATEGY_CODE = "transactionProcessingStrategyCode";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_PROCESSING_STRATEGY_CODE)
  private String transactionProcessingStrategyCode;

  /**
   * Gets or Sets daysInYearType
   */
  @JsonAdapter(DaysInYearTypeEnum.Adapter.class)
  public enum DaysInYearTypeEnum {
    NUMBER_null(null);

    private Integer value;

    DaysInYearTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DaysInYearTypeEnum fromValue(Integer value) {
      for (DaysInYearTypeEnum b : DaysInYearTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DaysInYearTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DaysInYearTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DaysInYearTypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return DaysInYearTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DAYS_IN_YEAR_TYPE = "daysInYearType";
  @SerializedName(SERIALIZED_NAME_DAYS_IN_YEAR_TYPE)
  private DaysInYearTypeEnum daysInYearType;


  public PostLoansRequest dateFormat(String dateFormat) {
    
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


  public PostLoansRequest locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en_GB", value = "")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public PostLoansRequest productId(Integer productId) {
    
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


  public PostLoansRequest principal(Double principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * Get principal
   * @return principal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getPrincipal() {
    return principal;
  }


  public void setPrincipal(Double principal) {
    this.principal = principal;
  }


  public PostLoansRequest loanTermFrequency(Integer loanTermFrequency) {
    
    this.loanTermFrequency = loanTermFrequency;
    return this;
  }

   /**
   * Get loanTermFrequency
   * @return loanTermFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "")

  public Integer getLoanTermFrequency() {
    return loanTermFrequency;
  }


  public void setLoanTermFrequency(Integer loanTermFrequency) {
    this.loanTermFrequency = loanTermFrequency;
  }


  public PostLoansRequest loanTermFrequencyType(Integer loanTermFrequencyType) {
    
    this.loanTermFrequencyType = loanTermFrequencyType;
    return this;
  }

   /**
   * Get loanTermFrequencyType
   * @return loanTermFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getLoanTermFrequencyType() {
    return loanTermFrequencyType;
  }


  public void setLoanTermFrequencyType(Integer loanTermFrequencyType) {
    this.loanTermFrequencyType = loanTermFrequencyType;
  }


  public PostLoansRequest numberOfRepayments(Integer numberOfRepayments) {
    
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


  public PostLoansRequest repaymentEvery(Integer repaymentEvery) {
    
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


  public PostLoansRequest repaymentFrequencyType(Integer repaymentFrequencyType) {
    
    this.repaymentFrequencyType = repaymentFrequencyType;
    return this;
  }

   /**
   * Get repaymentFrequencyType
   * @return repaymentFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getRepaymentFrequencyType() {
    return repaymentFrequencyType;
  }


  public void setRepaymentFrequencyType(Integer repaymentFrequencyType) {
    this.repaymentFrequencyType = repaymentFrequencyType;
  }


  public PostLoansRequest interestRatePerPeriod(Integer interestRatePerPeriod) {
    
    this.interestRatePerPeriod = interestRatePerPeriod;
    return this;
  }

   /**
   * Get interestRatePerPeriod
   * @return interestRatePerPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getInterestRatePerPeriod() {
    return interestRatePerPeriod;
  }


  public void setInterestRatePerPeriod(Integer interestRatePerPeriod) {
    this.interestRatePerPeriod = interestRatePerPeriod;
  }


  public PostLoansRequest amortizationType(Integer amortizationType) {
    
    this.amortizationType = amortizationType;
    return this;
  }

   /**
   * Get amortizationType
   * @return amortizationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getAmortizationType() {
    return amortizationType;
  }


  public void setAmortizationType(Integer amortizationType) {
    this.amortizationType = amortizationType;
  }


  public PostLoansRequest interestType(Integer interestType) {
    
    this.interestType = interestType;
    return this;
  }

   /**
   * Get interestType
   * @return interestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getInterestType() {
    return interestType;
  }


  public void setInterestType(Integer interestType) {
    this.interestType = interestType;
  }


  public PostLoansRequest interestCalculationPeriodType(Integer interestCalculationPeriodType) {
    
    this.interestCalculationPeriodType = interestCalculationPeriodType;
    return this;
  }

   /**
   * Get interestCalculationPeriodType
   * @return interestCalculationPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getInterestCalculationPeriodType() {
    return interestCalculationPeriodType;
  }


  public void setInterestCalculationPeriodType(Integer interestCalculationPeriodType) {
    this.interestCalculationPeriodType = interestCalculationPeriodType;
  }


  public PostLoansRequest expectedDisbursementDate(String expectedDisbursementDate) {
    
    this.expectedDisbursementDate = expectedDisbursementDate;
    return this;
  }

   /**
   * Get expectedDisbursementDate
   * @return expectedDisbursementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20 September 2011", value = "")

  public String getExpectedDisbursementDate() {
    return expectedDisbursementDate;
  }


  public void setExpectedDisbursementDate(String expectedDisbursementDate) {
    this.expectedDisbursementDate = expectedDisbursementDate;
  }


  public PostLoansRequest transactionProcessingStrategyCode(String transactionProcessingStrategyCode) {
    
    this.transactionProcessingStrategyCode = transactionProcessingStrategyCode;
    return this;
  }

   /**
   * Get transactionProcessingStrategyCode
   * @return transactionProcessingStrategyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public String getTransactionProcessingStrategyCode() {
    return transactionProcessingStrategyCode;
  }


  public void setTransactionProcessingStrategyCode(String transactionProcessingStrategyCode) {
    this.transactionProcessingStrategyCode = transactionProcessingStrategyCode;
  }


  public PostLoansRequest daysInYearType(DaysInYearTypeEnum daysInYearType) {
    
    this.daysInYearType = daysInYearType;
    return this;
  }

   /**
   * Get daysInYearType
   * @return daysInYearType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "360", value = "")

  public DaysInYearTypeEnum getDaysInYearType() {
    return daysInYearType;
  }


  public void setDaysInYearType(DaysInYearTypeEnum daysInYearType) {
    this.daysInYearType = daysInYearType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostLoansRequest postLoansRequest = (PostLoansRequest) o;
    return Objects.equals(this.dateFormat, postLoansRequest.dateFormat) &&
        Objects.equals(this.locale, postLoansRequest.locale) &&
        Objects.equals(this.productId, postLoansRequest.productId) &&
        Objects.equals(this.principal, postLoansRequest.principal) &&
        Objects.equals(this.loanTermFrequency, postLoansRequest.loanTermFrequency) &&
        Objects.equals(this.loanTermFrequencyType, postLoansRequest.loanTermFrequencyType) &&
        Objects.equals(this.numberOfRepayments, postLoansRequest.numberOfRepayments) &&
        Objects.equals(this.repaymentEvery, postLoansRequest.repaymentEvery) &&
        Objects.equals(this.repaymentFrequencyType, postLoansRequest.repaymentFrequencyType) &&
        Objects.equals(this.interestRatePerPeriod, postLoansRequest.interestRatePerPeriod) &&
        Objects.equals(this.amortizationType, postLoansRequest.amortizationType) &&
        Objects.equals(this.interestType, postLoansRequest.interestType) &&
        Objects.equals(this.interestCalculationPeriodType, postLoansRequest.interestCalculationPeriodType) &&
        Objects.equals(this.expectedDisbursementDate, postLoansRequest.expectedDisbursementDate) &&
        Objects.equals(this.transactionProcessingStrategyCode, postLoansRequest.transactionProcessingStrategyCode) &&
        Objects.equals(this.daysInYearType, postLoansRequest.daysInYearType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFormat, locale, productId, principal, loanTermFrequency, loanTermFrequencyType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, expectedDisbursementDate, transactionProcessingStrategyCode, daysInYearType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostLoansRequest {\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    loanTermFrequency: ").append(toIndentedString(loanTermFrequency)).append("\n");
    sb.append("    loanTermFrequencyType: ").append(toIndentedString(loanTermFrequencyType)).append("\n");
    sb.append("    numberOfRepayments: ").append(toIndentedString(numberOfRepayments)).append("\n");
    sb.append("    repaymentEvery: ").append(toIndentedString(repaymentEvery)).append("\n");
    sb.append("    repaymentFrequencyType: ").append(toIndentedString(repaymentFrequencyType)).append("\n");
    sb.append("    interestRatePerPeriod: ").append(toIndentedString(interestRatePerPeriod)).append("\n");
    sb.append("    amortizationType: ").append(toIndentedString(amortizationType)).append("\n");
    sb.append("    interestType: ").append(toIndentedString(interestType)).append("\n");
    sb.append("    interestCalculationPeriodType: ").append(toIndentedString(interestCalculationPeriodType)).append("\n");
    sb.append("    expectedDisbursementDate: ").append(toIndentedString(expectedDisbursementDate)).append("\n");
    sb.append("    transactionProcessingStrategyCode: ").append(toIndentedString(transactionProcessingStrategyCode)).append("\n");
    sb.append("    daysInYearType: ").append(toIndentedString(daysInYearType)).append("\n");
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


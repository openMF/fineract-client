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
import org.apache.fineract.client.models.PostSavingsCharges;

/**
 * PostSavingsProductsRequest
 */
@ApiModel(description = "PostSavingsProductsRequest")

public class PostSavingsProductsRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORT_NAME = "shortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_DIGITS_AFTER_DECIMAL = "digitsAfterDecimal";
  @SerializedName(SERIALIZED_NAME_DIGITS_AFTER_DECIMAL)
  private Integer digitsAfterDecimal;

  public static final String SERIALIZED_NAME_IN_MULTIPLES_OF = "inMultiplesOf";
  @SerializedName(SERIALIZED_NAME_IN_MULTIPLES_OF)
  private Integer inMultiplesOf;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_NOMINAL_ANNUAL_INTEREST_RATE = "nominalAnnualInterestRate";
  @SerializedName(SERIALIZED_NAME_NOMINAL_ANNUAL_INTEREST_RATE)
  private Double nominalAnnualInterestRate;

  public static final String SERIALIZED_NAME_INTEREST_COMPOUNDING_PERIOD_TYPE = "interestCompoundingPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_COMPOUNDING_PERIOD_TYPE)
  private Integer interestCompoundingPeriodType;

  public static final String SERIALIZED_NAME_INTEREST_POSTING_PERIOD_TYPE = "interestPostingPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_POSTING_PERIOD_TYPE)
  private Integer interestPostingPeriodType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_TYPE = "interestCalculationType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_TYPE)
  private Integer interestCalculationType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_DAYS_IN_YEAR_TYPE = "interestCalculationDaysInYearType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_DAYS_IN_YEAR_TYPE)
  private Integer interestCalculationDaysInYearType;

  public static final String SERIALIZED_NAME_ACCOUNTING_RULE = "accountingRule";
  @SerializedName(SERIALIZED_NAME_ACCOUNTING_RULE)
  private Integer accountingRule;

  public static final String SERIALIZED_NAME_CHARGES = "charges";
  @SerializedName(SERIALIZED_NAME_CHARGES)
  private List<PostSavingsCharges> charges = null;


  public PostSavingsProductsRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Passbook Savings", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PostSavingsProductsRequest shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PBSV", value = "")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public PostSavingsProductsRequest description(String description) {
    
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


  public PostSavingsProductsRequest currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public PostSavingsProductsRequest digitsAfterDecimal(Integer digitsAfterDecimal) {
    
    this.digitsAfterDecimal = digitsAfterDecimal;
    return this;
  }

   /**
   * Get digitsAfterDecimal
   * @return digitsAfterDecimal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getDigitsAfterDecimal() {
    return digitsAfterDecimal;
  }


  public void setDigitsAfterDecimal(Integer digitsAfterDecimal) {
    this.digitsAfterDecimal = digitsAfterDecimal;
  }


  public PostSavingsProductsRequest inMultiplesOf(Integer inMultiplesOf) {
    
    this.inMultiplesOf = inMultiplesOf;
    return this;
  }

   /**
   * Get inMultiplesOf
   * @return inMultiplesOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getInMultiplesOf() {
    return inMultiplesOf;
  }


  public void setInMultiplesOf(Integer inMultiplesOf) {
    this.inMultiplesOf = inMultiplesOf;
  }


  public PostSavingsProductsRequest locale(String locale) {
    
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


  public PostSavingsProductsRequest nominalAnnualInterestRate(Double nominalAnnualInterestRate) {
    
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
    return this;
  }

   /**
   * Get nominalAnnualInterestRate
   * @return nominalAnnualInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5.0", value = "")

  public Double getNominalAnnualInterestRate() {
    return nominalAnnualInterestRate;
  }


  public void setNominalAnnualInterestRate(Double nominalAnnualInterestRate) {
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
  }


  public PostSavingsProductsRequest interestCompoundingPeriodType(Integer interestCompoundingPeriodType) {
    
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }


  public void setInterestCompoundingPeriodType(Integer interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }


  public PostSavingsProductsRequest interestPostingPeriodType(Integer interestPostingPeriodType) {
    
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public Integer getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }


  public void setInterestPostingPeriodType(Integer interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }


  public PostSavingsProductsRequest interestCalculationType(Integer interestCalculationType) {
    
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getInterestCalculationType() {
    return interestCalculationType;
  }


  public void setInterestCalculationType(Integer interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }


  public PostSavingsProductsRequest interestCalculationDaysInYearType(Integer interestCalculationDaysInYearType) {
    
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "365", value = "")

  public Integer getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }


  public void setInterestCalculationDaysInYearType(Integer interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }


  public PostSavingsProductsRequest accountingRule(Integer accountingRule) {
    
    this.accountingRule = accountingRule;
    return this;
  }

   /**
   * Get accountingRule
   * @return accountingRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getAccountingRule() {
    return accountingRule;
  }


  public void setAccountingRule(Integer accountingRule) {
    this.accountingRule = accountingRule;
  }


  public PostSavingsProductsRequest charges(List<PostSavingsCharges> charges) {
    
    this.charges = charges;
    return this;
  }

  public PostSavingsProductsRequest addChargesItem(PostSavingsCharges chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<PostSavingsCharges>();
    }
    this.charges.add(chargesItem);
    return this;
  }

   /**
   * Get charges
   * @return charges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PostSavingsCharges> getCharges() {
    return charges;
  }


  public void setCharges(List<PostSavingsCharges> charges) {
    this.charges = charges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSavingsProductsRequest postSavingsProductsRequest = (PostSavingsProductsRequest) o;
    return Objects.equals(this.name, postSavingsProductsRequest.name) &&
        Objects.equals(this.shortName, postSavingsProductsRequest.shortName) &&
        Objects.equals(this.description, postSavingsProductsRequest.description) &&
        Objects.equals(this.currencyCode, postSavingsProductsRequest.currencyCode) &&
        Objects.equals(this.digitsAfterDecimal, postSavingsProductsRequest.digitsAfterDecimal) &&
        Objects.equals(this.inMultiplesOf, postSavingsProductsRequest.inMultiplesOf) &&
        Objects.equals(this.locale, postSavingsProductsRequest.locale) &&
        Objects.equals(this.nominalAnnualInterestRate, postSavingsProductsRequest.nominalAnnualInterestRate) &&
        Objects.equals(this.interestCompoundingPeriodType, postSavingsProductsRequest.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, postSavingsProductsRequest.interestPostingPeriodType) &&
        Objects.equals(this.interestCalculationType, postSavingsProductsRequest.interestCalculationType) &&
        Objects.equals(this.interestCalculationDaysInYearType, postSavingsProductsRequest.interestCalculationDaysInYearType) &&
        Objects.equals(this.accountingRule, postSavingsProductsRequest.accountingRule) &&
        Objects.equals(this.charges, postSavingsProductsRequest.charges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shortName, description, currencyCode, digitsAfterDecimal, inMultiplesOf, locale, nominalAnnualInterestRate, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, accountingRule, charges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSavingsProductsRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    digitsAfterDecimal: ").append(toIndentedString(digitsAfterDecimal)).append("\n");
    sb.append("    inMultiplesOf: ").append(toIndentedString(inMultiplesOf)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    nominalAnnualInterestRate: ").append(toIndentedString(nominalAnnualInterestRate)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    accountingRule: ").append(toIndentedString(accountingRule)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
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


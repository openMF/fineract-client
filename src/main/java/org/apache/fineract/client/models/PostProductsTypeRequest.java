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
import org.apache.fineract.client.models.PostProductsChargesSelected;
import org.apache.fineract.client.models.PostProductsMarketPricePeriods;

/**
 * PostProductsTypeRequest
 */
@ApiModel(description = "PostProductsTypeRequest")

public class PostProductsTypeRequest {
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

  public static final String SERIALIZED_NAME_TOTAL_SHARES = "totalShares";
  @SerializedName(SERIALIZED_NAME_TOTAL_SHARES)
  private Integer totalShares;

  public static final String SERIALIZED_NAME_SHARES_ISSUED = "sharesIssued";
  @SerializedName(SERIALIZED_NAME_SHARES_ISSUED)
  private Integer sharesIssued;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private Integer unitPrice;

  public static final String SERIALIZED_NAME_MINIMUM_SHARES = "minimumShares";
  @SerializedName(SERIALIZED_NAME_MINIMUM_SHARES)
  private Integer minimumShares;

  public static final String SERIALIZED_NAME_NOMINAL_SHARES = "nominalShares";
  @SerializedName(SERIALIZED_NAME_NOMINAL_SHARES)
  private Integer nominalShares;

  public static final String SERIALIZED_NAME_MAXIMUM_SHARES = "maximumShares";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_SHARES)
  private Integer maximumShares;

  public static final String SERIALIZED_NAME_MINIMUM_ACTIVE_PERIOD_FOR_DIVIDENDS = "minimumActivePeriodForDividends";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ACTIVE_PERIOD_FOR_DIVIDENDS)
  private Integer minimumActivePeriodForDividends;

  public static final String SERIALIZED_NAME_MINIMUMACTIVEPERIOD_FREQUENCY_TYPE = "minimumactiveperiodFrequencyType";
  @SerializedName(SERIALIZED_NAME_MINIMUMACTIVEPERIOD_FREQUENCY_TYPE)
  private Integer minimumactiveperiodFrequencyType;

  public static final String SERIALIZED_NAME_LOCKIN_PERIOD_FREQUENCY = "lockinPeriodFrequency";
  @SerializedName(SERIALIZED_NAME_LOCKIN_PERIOD_FREQUENCY)
  private Integer lockinPeriodFrequency;

  public static final String SERIALIZED_NAME_LOCKIN_PERIOD_FREQUENCY_TYPE = "lockinPeriodFrequencyType";
  @SerializedName(SERIALIZED_NAME_LOCKIN_PERIOD_FREQUENCY_TYPE)
  private Integer lockinPeriodFrequencyType;

  public static final String SERIALIZED_NAME_ALLOW_DIVIDEND_CALCULATION_FOR_INACTIVE_CLIENTS = "allowDividendCalculationForInactiveClients";
  @SerializedName(SERIALIZED_NAME_ALLOW_DIVIDEND_CALCULATION_FOR_INACTIVE_CLIENTS)
  private Boolean allowDividendCalculationForInactiveClients;

  public static final String SERIALIZED_NAME_MARKET_PRICE_PERIODS = "marketPricePeriods";
  @SerializedName(SERIALIZED_NAME_MARKET_PRICE_PERIODS)
  private List<PostProductsMarketPricePeriods> marketPricePeriods = null;

  public static final String SERIALIZED_NAME_CHARGES_SELECTED = "chargesSelected";
  @SerializedName(SERIALIZED_NAME_CHARGES_SELECTED)
  private List<PostProductsChargesSelected> chargesSelected = null;

  public static final String SERIALIZED_NAME_ACCOUNTING_RULE = "accountingRule";
  @SerializedName(SERIALIZED_NAME_ACCOUNTING_RULE)
  private Integer accountingRule;


  public PostProductsTypeRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Share Product", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PostProductsTypeRequest shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SP", value = "")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public PostProductsTypeRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Description", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PostProductsTypeRequest currencyCode(String currencyCode) {
    
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


  public PostProductsTypeRequest digitsAfterDecimal(Integer digitsAfterDecimal) {
    
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


  public PostProductsTypeRequest inMultiplesOf(Integer inMultiplesOf) {
    
    this.inMultiplesOf = inMultiplesOf;
    return this;
  }

   /**
   * Get inMultiplesOf
   * @return inMultiplesOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getInMultiplesOf() {
    return inMultiplesOf;
  }


  public void setInMultiplesOf(Integer inMultiplesOf) {
    this.inMultiplesOf = inMultiplesOf;
  }


  public PostProductsTypeRequest locale(String locale) {
    
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


  public PostProductsTypeRequest totalShares(Integer totalShares) {
    
    this.totalShares = totalShares;
    return this;
  }

   /**
   * Get totalShares
   * @return totalShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "")

  public Integer getTotalShares() {
    return totalShares;
  }


  public void setTotalShares(Integer totalShares) {
    this.totalShares = totalShares;
  }


  public PostProductsTypeRequest sharesIssued(Integer sharesIssued) {
    
    this.sharesIssued = sharesIssued;
    return this;
  }

   /**
   * Get sharesIssued
   * @return sharesIssued
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "")

  public Integer getSharesIssued() {
    return sharesIssued;
  }


  public void setSharesIssued(Integer sharesIssued) {
    this.sharesIssued = sharesIssued;
  }


  public PostProductsTypeRequest unitPrice(Integer unitPrice) {
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getUnitPrice() {
    return unitPrice;
  }


  public void setUnitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
  }


  public PostProductsTypeRequest minimumShares(Integer minimumShares) {
    
    this.minimumShares = minimumShares;
    return this;
  }

   /**
   * Get minimumShares
   * @return minimumShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public Integer getMinimumShares() {
    return minimumShares;
  }


  public void setMinimumShares(Integer minimumShares) {
    this.minimumShares = minimumShares;
  }


  public PostProductsTypeRequest nominalShares(Integer nominalShares) {
    
    this.nominalShares = nominalShares;
    return this;
  }

   /**
   * Get nominalShares
   * @return nominalShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "")

  public Integer getNominalShares() {
    return nominalShares;
  }


  public void setNominalShares(Integer nominalShares) {
    this.nominalShares = nominalShares;
  }


  public PostProductsTypeRequest maximumShares(Integer maximumShares) {
    
    this.maximumShares = maximumShares;
    return this;
  }

   /**
   * Get maximumShares
   * @return maximumShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "")

  public Integer getMaximumShares() {
    return maximumShares;
  }


  public void setMaximumShares(Integer maximumShares) {
    this.maximumShares = maximumShares;
  }


  public PostProductsTypeRequest minimumActivePeriodForDividends(Integer minimumActivePeriodForDividends) {
    
    this.minimumActivePeriodForDividends = minimumActivePeriodForDividends;
    return this;
  }

   /**
   * Get minimumActivePeriodForDividends
   * @return minimumActivePeriodForDividends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getMinimumActivePeriodForDividends() {
    return minimumActivePeriodForDividends;
  }


  public void setMinimumActivePeriodForDividends(Integer minimumActivePeriodForDividends) {
    this.minimumActivePeriodForDividends = minimumActivePeriodForDividends;
  }


  public PostProductsTypeRequest minimumactiveperiodFrequencyType(Integer minimumactiveperiodFrequencyType) {
    
    this.minimumactiveperiodFrequencyType = minimumactiveperiodFrequencyType;
    return this;
  }

   /**
   * Get minimumactiveperiodFrequencyType
   * @return minimumactiveperiodFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getMinimumactiveperiodFrequencyType() {
    return minimumactiveperiodFrequencyType;
  }


  public void setMinimumactiveperiodFrequencyType(Integer minimumactiveperiodFrequencyType) {
    this.minimumactiveperiodFrequencyType = minimumactiveperiodFrequencyType;
  }


  public PostProductsTypeRequest lockinPeriodFrequency(Integer lockinPeriodFrequency) {
    
    this.lockinPeriodFrequency = lockinPeriodFrequency;
    return this;
  }

   /**
   * Get lockinPeriodFrequency
   * @return lockinPeriodFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getLockinPeriodFrequency() {
    return lockinPeriodFrequency;
  }


  public void setLockinPeriodFrequency(Integer lockinPeriodFrequency) {
    this.lockinPeriodFrequency = lockinPeriodFrequency;
  }


  public PostProductsTypeRequest lockinPeriodFrequencyType(Integer lockinPeriodFrequencyType) {
    
    this.lockinPeriodFrequencyType = lockinPeriodFrequencyType;
    return this;
  }

   /**
   * Get lockinPeriodFrequencyType
   * @return lockinPeriodFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getLockinPeriodFrequencyType() {
    return lockinPeriodFrequencyType;
  }


  public void setLockinPeriodFrequencyType(Integer lockinPeriodFrequencyType) {
    this.lockinPeriodFrequencyType = lockinPeriodFrequencyType;
  }


  public PostProductsTypeRequest allowDividendCalculationForInactiveClients(Boolean allowDividendCalculationForInactiveClients) {
    
    this.allowDividendCalculationForInactiveClients = allowDividendCalculationForInactiveClients;
    return this;
  }

   /**
   * Get allowDividendCalculationForInactiveClients
   * @return allowDividendCalculationForInactiveClients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getAllowDividendCalculationForInactiveClients() {
    return allowDividendCalculationForInactiveClients;
  }


  public void setAllowDividendCalculationForInactiveClients(Boolean allowDividendCalculationForInactiveClients) {
    this.allowDividendCalculationForInactiveClients = allowDividendCalculationForInactiveClients;
  }


  public PostProductsTypeRequest marketPricePeriods(List<PostProductsMarketPricePeriods> marketPricePeriods) {
    
    this.marketPricePeriods = marketPricePeriods;
    return this;
  }

  public PostProductsTypeRequest addMarketPricePeriodsItem(PostProductsMarketPricePeriods marketPricePeriodsItem) {
    if (this.marketPricePeriods == null) {
      this.marketPricePeriods = new ArrayList<PostProductsMarketPricePeriods>();
    }
    this.marketPricePeriods.add(marketPricePeriodsItem);
    return this;
  }

   /**
   * Get marketPricePeriods
   * @return marketPricePeriods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PostProductsMarketPricePeriods> getMarketPricePeriods() {
    return marketPricePeriods;
  }


  public void setMarketPricePeriods(List<PostProductsMarketPricePeriods> marketPricePeriods) {
    this.marketPricePeriods = marketPricePeriods;
  }


  public PostProductsTypeRequest chargesSelected(List<PostProductsChargesSelected> chargesSelected) {
    
    this.chargesSelected = chargesSelected;
    return this;
  }

  public PostProductsTypeRequest addChargesSelectedItem(PostProductsChargesSelected chargesSelectedItem) {
    if (this.chargesSelected == null) {
      this.chargesSelected = new ArrayList<PostProductsChargesSelected>();
    }
    this.chargesSelected.add(chargesSelectedItem);
    return this;
  }

   /**
   * Get chargesSelected
   * @return chargesSelected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PostProductsChargesSelected> getChargesSelected() {
    return chargesSelected;
  }


  public void setChargesSelected(List<PostProductsChargesSelected> chargesSelected) {
    this.chargesSelected = chargesSelected;
  }


  public PostProductsTypeRequest accountingRule(Integer accountingRule) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostProductsTypeRequest postProductsTypeRequest = (PostProductsTypeRequest) o;
    return Objects.equals(this.name, postProductsTypeRequest.name) &&
        Objects.equals(this.shortName, postProductsTypeRequest.shortName) &&
        Objects.equals(this.description, postProductsTypeRequest.description) &&
        Objects.equals(this.currencyCode, postProductsTypeRequest.currencyCode) &&
        Objects.equals(this.digitsAfterDecimal, postProductsTypeRequest.digitsAfterDecimal) &&
        Objects.equals(this.inMultiplesOf, postProductsTypeRequest.inMultiplesOf) &&
        Objects.equals(this.locale, postProductsTypeRequest.locale) &&
        Objects.equals(this.totalShares, postProductsTypeRequest.totalShares) &&
        Objects.equals(this.sharesIssued, postProductsTypeRequest.sharesIssued) &&
        Objects.equals(this.unitPrice, postProductsTypeRequest.unitPrice) &&
        Objects.equals(this.minimumShares, postProductsTypeRequest.minimumShares) &&
        Objects.equals(this.nominalShares, postProductsTypeRequest.nominalShares) &&
        Objects.equals(this.maximumShares, postProductsTypeRequest.maximumShares) &&
        Objects.equals(this.minimumActivePeriodForDividends, postProductsTypeRequest.minimumActivePeriodForDividends) &&
        Objects.equals(this.minimumactiveperiodFrequencyType, postProductsTypeRequest.minimumactiveperiodFrequencyType) &&
        Objects.equals(this.lockinPeriodFrequency, postProductsTypeRequest.lockinPeriodFrequency) &&
        Objects.equals(this.lockinPeriodFrequencyType, postProductsTypeRequest.lockinPeriodFrequencyType) &&
        Objects.equals(this.allowDividendCalculationForInactiveClients, postProductsTypeRequest.allowDividendCalculationForInactiveClients) &&
        Objects.equals(this.marketPricePeriods, postProductsTypeRequest.marketPricePeriods) &&
        Objects.equals(this.chargesSelected, postProductsTypeRequest.chargesSelected) &&
        Objects.equals(this.accountingRule, postProductsTypeRequest.accountingRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shortName, description, currencyCode, digitsAfterDecimal, inMultiplesOf, locale, totalShares, sharesIssued, unitPrice, minimumShares, nominalShares, maximumShares, minimumActivePeriodForDividends, minimumactiveperiodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType, allowDividendCalculationForInactiveClients, marketPricePeriods, chargesSelected, accountingRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostProductsTypeRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    digitsAfterDecimal: ").append(toIndentedString(digitsAfterDecimal)).append("\n");
    sb.append("    inMultiplesOf: ").append(toIndentedString(inMultiplesOf)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    totalShares: ").append(toIndentedString(totalShares)).append("\n");
    sb.append("    sharesIssued: ").append(toIndentedString(sharesIssued)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    minimumShares: ").append(toIndentedString(minimumShares)).append("\n");
    sb.append("    nominalShares: ").append(toIndentedString(nominalShares)).append("\n");
    sb.append("    maximumShares: ").append(toIndentedString(maximumShares)).append("\n");
    sb.append("    minimumActivePeriodForDividends: ").append(toIndentedString(minimumActivePeriodForDividends)).append("\n");
    sb.append("    minimumactiveperiodFrequencyType: ").append(toIndentedString(minimumactiveperiodFrequencyType)).append("\n");
    sb.append("    lockinPeriodFrequency: ").append(toIndentedString(lockinPeriodFrequency)).append("\n");
    sb.append("    lockinPeriodFrequencyType: ").append(toIndentedString(lockinPeriodFrequencyType)).append("\n");
    sb.append("    allowDividendCalculationForInactiveClients: ").append(toIndentedString(allowDividendCalculationForInactiveClients)).append("\n");
    sb.append("    marketPricePeriods: ").append(toIndentedString(marketPricePeriods)).append("\n");
    sb.append("    chargesSelected: ").append(toIndentedString(chargesSelected)).append("\n");
    sb.append("    accountingRule: ").append(toIndentedString(accountingRule)).append("\n");
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


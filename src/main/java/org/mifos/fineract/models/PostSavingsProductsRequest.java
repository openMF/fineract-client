/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.fineract.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PostSavingsProductsRequest
 */

public class PostSavingsProductsRequest {
    @SerializedName("name")
    private String name = null;

    @SerializedName("shortName")
    private String shortName = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("currencyCode")
    private String currencyCode = null;

    @SerializedName("digitsAfterDecimal")
    private Integer digitsAfterDecimal = null;

    @SerializedName("inMultiplesOf")
    private Integer inMultiplesOf = null;

    @SerializedName("locale")
    private String locale = null;

    @SerializedName("nominalAnnualInterestRate")
    private Double nominalAnnualInterestRate = null;

    @SerializedName("interestCompoundingPeriodType")
    private Integer interestCompoundingPeriodType = null;

    @SerializedName("interestPostingPeriodType")
    private Integer interestPostingPeriodType = null;

    @SerializedName("interestCalculationType")
    private Integer interestCalculationType = null;

    @SerializedName("interestCalculationDaysInYearType")
    private Integer interestCalculationDaysInYearType = null;

    @SerializedName("accountingRule")
    private Integer accountingRule = null;

    @SerializedName("charges")
    private List<PostSavingsCharges> charges = null;

    public PostSavingsProductsRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
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
     *
     * @return shortName
     **/
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
     *
     * @return description
     **/
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
     *
     * @return currencyCode
     **/
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
     *
     * @return digitsAfterDecimal
     **/
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
     *
     * @return inMultiplesOf
     **/
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
     *
     * @return locale
     **/
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
     *
     * @return nominalAnnualInterestRate
     **/
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
     *
     * @return interestCompoundingPeriodType
     **/
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
     *
     * @return interestPostingPeriodType
     **/
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
     *
     * @return interestCalculationType
     **/
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
     *
     * @return interestCalculationDaysInYearType
     **/
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
     *
     * @return accountingRule
     **/
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
     *
     * @return charges
     **/
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


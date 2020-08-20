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
 * PostFixedDepositProductsRequest
 */

public class PostFixedDepositProductsRequest {
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

    @SerializedName("preClosurePenalApplicable")
    private Boolean preClosurePenalApplicable = null;

    @SerializedName("preClosurePenalInterest")
    private Double preClosurePenalInterest = null;

    @SerializedName("preClosurePenalInterestOnTypeId")
    private Integer preClosurePenalInterestOnTypeId = null;

    @SerializedName("minDepositTerm")
    private Integer minDepositTerm = null;

    @SerializedName("minDepositTermTypeId")
    private Integer minDepositTermTypeId = null;

    @SerializedName("maxDepositTerm")
    private Integer maxDepositTerm = null;

    @SerializedName("maxDepositTermTypeId")
    private Integer maxDepositTermTypeId = null;

    @SerializedName("charts")
    private List<PostFixedDepositProductsCharts> charts = null;

    public PostFixedDepositProductsRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(example = "Fixed deposit product", value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PostFixedDepositProductsRequest shortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * Get shortName
     *
     * @return shortName
     **/
    @ApiModelProperty(example = "FD01", value = "")
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public PostFixedDepositProductsRequest description(String description) {
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

    public PostFixedDepositProductsRequest currencyCode(String currencyCode) {
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

    public PostFixedDepositProductsRequest digitsAfterDecimal(Integer digitsAfterDecimal) {
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

    public PostFixedDepositProductsRequest inMultiplesOf(Integer inMultiplesOf) {
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

    public PostFixedDepositProductsRequest locale(String locale) {
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

    public PostFixedDepositProductsRequest interestCompoundingPeriodType(Integer interestCompoundingPeriodType) {
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

    public PostFixedDepositProductsRequest interestPostingPeriodType(Integer interestPostingPeriodType) {
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

    public PostFixedDepositProductsRequest interestCalculationType(Integer interestCalculationType) {
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

    public PostFixedDepositProductsRequest interestCalculationDaysInYearType(Integer interestCalculationDaysInYearType) {
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

    public PostFixedDepositProductsRequest accountingRule(Integer accountingRule) {
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

    public PostFixedDepositProductsRequest preClosurePenalApplicable(Boolean preClosurePenalApplicable) {
        this.preClosurePenalApplicable = preClosurePenalApplicable;
        return this;
    }

    /**
     * Get preClosurePenalApplicable
     *
     * @return preClosurePenalApplicable
     **/
    @ApiModelProperty(example = "true", value = "")
    public Boolean isPreClosurePenalApplicable() {
        return preClosurePenalApplicable;
    }

    public void setPreClosurePenalApplicable(Boolean preClosurePenalApplicable) {
        this.preClosurePenalApplicable = preClosurePenalApplicable;
    }

    public PostFixedDepositProductsRequest preClosurePenalInterest(Double preClosurePenalInterest) {
        this.preClosurePenalInterest = preClosurePenalInterest;
        return this;
    }

    /**
     * Get preClosurePenalInterest
     *
     * @return preClosurePenalInterest
     **/
    @ApiModelProperty(example = "1.75", value = "")
    public Double getPreClosurePenalInterest() {
        return preClosurePenalInterest;
    }

    public void setPreClosurePenalInterest(Double preClosurePenalInterest) {
        this.preClosurePenalInterest = preClosurePenalInterest;
    }

    public PostFixedDepositProductsRequest preClosurePenalInterestOnTypeId(Integer preClosurePenalInterestOnTypeId) {
        this.preClosurePenalInterestOnTypeId = preClosurePenalInterestOnTypeId;
        return this;
    }

    /**
     * Get preClosurePenalInterestOnTypeId
     *
     * @return preClosurePenalInterestOnTypeId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getPreClosurePenalInterestOnTypeId() {
        return preClosurePenalInterestOnTypeId;
    }

    public void setPreClosurePenalInterestOnTypeId(Integer preClosurePenalInterestOnTypeId) {
        this.preClosurePenalInterestOnTypeId = preClosurePenalInterestOnTypeId;
    }

    public PostFixedDepositProductsRequest minDepositTerm(Integer minDepositTerm) {
        this.minDepositTerm = minDepositTerm;
        return this;
    }

    /**
     * Get minDepositTerm
     *
     * @return minDepositTerm
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getMinDepositTerm() {
        return minDepositTerm;
    }

    public void setMinDepositTerm(Integer minDepositTerm) {
        this.minDepositTerm = minDepositTerm;
    }

    public PostFixedDepositProductsRequest minDepositTermTypeId(Integer minDepositTermTypeId) {
        this.minDepositTermTypeId = minDepositTermTypeId;
        return this;
    }

    /**
     * Get minDepositTermTypeId
     *
     * @return minDepositTermTypeId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getMinDepositTermTypeId() {
        return minDepositTermTypeId;
    }

    public void setMinDepositTermTypeId(Integer minDepositTermTypeId) {
        this.minDepositTermTypeId = minDepositTermTypeId;
    }

    public PostFixedDepositProductsRequest maxDepositTerm(Integer maxDepositTerm) {
        this.maxDepositTerm = maxDepositTerm;
        return this;
    }

    /**
     * Get maxDepositTerm
     *
     * @return maxDepositTerm
     **/
    @ApiModelProperty(example = "5", value = "")
    public Integer getMaxDepositTerm() {
        return maxDepositTerm;
    }

    public void setMaxDepositTerm(Integer maxDepositTerm) {
        this.maxDepositTerm = maxDepositTerm;
    }

    public PostFixedDepositProductsRequest maxDepositTermTypeId(Integer maxDepositTermTypeId) {
        this.maxDepositTermTypeId = maxDepositTermTypeId;
        return this;
    }

    /**
     * Get maxDepositTermTypeId
     *
     * @return maxDepositTermTypeId
     **/
    @ApiModelProperty(example = "3", value = "")
    public Integer getMaxDepositTermTypeId() {
        return maxDepositTermTypeId;
    }

    public void setMaxDepositTermTypeId(Integer maxDepositTermTypeId) {
        this.maxDepositTermTypeId = maxDepositTermTypeId;
    }

    public PostFixedDepositProductsRequest charts(List<PostFixedDepositProductsCharts> charts) {
        this.charts = charts;
        return this;
    }

    public PostFixedDepositProductsRequest addChartsItem(PostFixedDepositProductsCharts chartsItem) {
        if (this.charts == null) {
            this.charts = new ArrayList<PostFixedDepositProductsCharts>();
        }
        this.charts.add(chartsItem);
        return this;
    }

    /**
     * Get charts
     *
     * @return charts
     **/
    @ApiModelProperty(value = "")
    public List<PostFixedDepositProductsCharts> getCharts() {
        return charts;
    }

    public void setCharts(List<PostFixedDepositProductsCharts> charts) {
        this.charts = charts;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostFixedDepositProductsRequest postFixedDepositProductsRequest = (PostFixedDepositProductsRequest) o;
        return Objects.equals(this.name, postFixedDepositProductsRequest.name) &&
                Objects.equals(this.shortName, postFixedDepositProductsRequest.shortName) &&
                Objects.equals(this.description, postFixedDepositProductsRequest.description) &&
                Objects.equals(this.currencyCode, postFixedDepositProductsRequest.currencyCode) &&
                Objects.equals(this.digitsAfterDecimal, postFixedDepositProductsRequest.digitsAfterDecimal) &&
                Objects.equals(this.inMultiplesOf, postFixedDepositProductsRequest.inMultiplesOf) &&
                Objects.equals(this.locale, postFixedDepositProductsRequest.locale) &&
                Objects.equals(this.interestCompoundingPeriodType, postFixedDepositProductsRequest.interestCompoundingPeriodType) &&
                Objects.equals(this.interestPostingPeriodType, postFixedDepositProductsRequest.interestPostingPeriodType) &&
                Objects.equals(this.interestCalculationType, postFixedDepositProductsRequest.interestCalculationType) &&
                Objects.equals(this.interestCalculationDaysInYearType, postFixedDepositProductsRequest.interestCalculationDaysInYearType) &&
                Objects.equals(this.accountingRule, postFixedDepositProductsRequest.accountingRule) &&
                Objects.equals(this.preClosurePenalApplicable, postFixedDepositProductsRequest.preClosurePenalApplicable) &&
                Objects.equals(this.preClosurePenalInterest, postFixedDepositProductsRequest.preClosurePenalInterest) &&
                Objects.equals(this.preClosurePenalInterestOnTypeId, postFixedDepositProductsRequest.preClosurePenalInterestOnTypeId) &&
                Objects.equals(this.minDepositTerm, postFixedDepositProductsRequest.minDepositTerm) &&
                Objects.equals(this.minDepositTermTypeId, postFixedDepositProductsRequest.minDepositTermTypeId) &&
                Objects.equals(this.maxDepositTerm, postFixedDepositProductsRequest.maxDepositTerm) &&
                Objects.equals(this.maxDepositTermTypeId, postFixedDepositProductsRequest.maxDepositTermTypeId) &&
                Objects.equals(this.charts, postFixedDepositProductsRequest.charts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shortName, description, currencyCode, digitsAfterDecimal, inMultiplesOf, locale, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, accountingRule, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, minDepositTerm, minDepositTermTypeId, maxDepositTerm, maxDepositTermTypeId, charts);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostFixedDepositProductsRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    digitsAfterDecimal: ").append(toIndentedString(digitsAfterDecimal)).append("\n");
        sb.append("    inMultiplesOf: ").append(toIndentedString(inMultiplesOf)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
        sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
        sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
        sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
        sb.append("    accountingRule: ").append(toIndentedString(accountingRule)).append("\n");
        sb.append("    preClosurePenalApplicable: ").append(toIndentedString(preClosurePenalApplicable)).append("\n");
        sb.append("    preClosurePenalInterest: ").append(toIndentedString(preClosurePenalInterest)).append("\n");
        sb.append("    preClosurePenalInterestOnTypeId: ").append(toIndentedString(preClosurePenalInterestOnTypeId)).append("\n");
        sb.append("    minDepositTerm: ").append(toIndentedString(minDepositTerm)).append("\n");
        sb.append("    minDepositTermTypeId: ").append(toIndentedString(minDepositTermTypeId)).append("\n");
        sb.append("    maxDepositTerm: ").append(toIndentedString(maxDepositTerm)).append("\n");
        sb.append("    maxDepositTermTypeId: ").append(toIndentedString(maxDepositTermTypeId)).append("\n");
        sb.append("    charts: ").append(toIndentedString(charts)).append("\n");
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


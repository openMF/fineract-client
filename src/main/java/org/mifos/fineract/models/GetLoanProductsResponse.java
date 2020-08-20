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
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetLoanProductsResponse
 */

public class GetLoanProductsResponse {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("shortName")
    private String shortName = null;

    @SerializedName("includeInBorrowerCycle")
    private Boolean includeInBorrowerCycle = null;

    @SerializedName("useBorrowerCycle")
    private Boolean useBorrowerCycle = null;

    @SerializedName("startDate")
    private LocalDate startDate = null;

    @SerializedName("endDate")
    private LocalDate endDate = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("currency")
    private GetLoanProductsCurrency currency = null;

    @SerializedName("principal")
    private Float principal = null;

    @SerializedName("minPrincipal")
    private Float minPrincipal = null;

    @SerializedName("maxPrincipal")
    private Float maxPrincipal = null;

    @SerializedName("numberOfRepayments")
    private Integer numberOfRepayments = null;

    @SerializedName("minNumberOfRepayments")
    private Integer minNumberOfRepayments = null;

    @SerializedName("maxNumberOfRepayments")
    private Integer maxNumberOfRepayments = null;

    @SerializedName("repaymentEvery")
    private Integer repaymentEvery = null;

    @SerializedName("repaymentFrequencyType")
    private GetLoanProductsRepaymentFrequencyType repaymentFrequencyType = null;

    @SerializedName("interestRatePerPeriod")
    private Float interestRatePerPeriod = null;

    @SerializedName("interestRateFrequencyType")
    private GetLoanProductsInterestRateFrequencyType interestRateFrequencyType = null;

    @SerializedName("annualInterestRate")
    private Float annualInterestRate = null;

    @SerializedName("amortizationType")
    private GetLoanProductsAmortizationType amortizationType = null;

    @SerializedName("interestType")
    private GetLoanProductsInterestType interestType = null;

    @SerializedName("interestCalculationPeriodType")
    private GetLoansProductsInterestCalculationPeriodType interestCalculationPeriodType = null;

    @SerializedName("transactionProcessingStrategyId")
    private Integer transactionProcessingStrategyId = null;

    @SerializedName("transactionProcessingStrategyName")
    private String transactionProcessingStrategyName = null;

    @SerializedName("principalVariationsForBorrowerCycle")
    private List<Integer> principalVariationsForBorrowerCycle = null;

    @SerializedName("interestRateVariationsForBorrowerCycle")
    private List<Integer> interestRateVariationsForBorrowerCycle = null;

    @SerializedName("numberOfRepaymentVariationsForBorrowerCycle")
    private List<Integer> numberOfRepaymentVariationsForBorrowerCycle = null;

    @SerializedName("daysInMonthType")
    private GetLoansProductsDaysInMonthType daysInMonthType = null;

    @SerializedName("daysInYearType")
    private GetLoansProductsDaysInYearType daysInYearType = null;

    @SerializedName("isInterestRecalculationEnabled")
    private Boolean isInterestRecalculationEnabled = null;

    @SerializedName("interestRecalculationData")
    private GetLoanProductsInterestRecalculationData interestRecalculationData = null;

    @SerializedName("accountingRule")
    private GetLoanProductsAccountingRule accountingRule = null;

    @SerializedName("principalThresholdForLastInstalment")
    private Integer principalThresholdForLastInstalment = null;

    public GetLoanProductsResponse id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
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
     *
     * @return name
     **/
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
     *
     * @return shortName
     **/
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
     *
     * @return includeInBorrowerCycle
     **/
    @ApiModelProperty(example = "false", value = "")
    public Boolean isIncludeInBorrowerCycle() {
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
     *
     * @return useBorrowerCycle
     **/
    @ApiModelProperty(example = "false", value = "")
    public Boolean isUseBorrowerCycle() {
        return useBorrowerCycle;
    }

    public void setUseBorrowerCycle(Boolean useBorrowerCycle) {
        this.useBorrowerCycle = useBorrowerCycle;
    }

    public GetLoanProductsResponse startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get startDate
     *
     * @return startDate
     **/
    @ApiModelProperty(example = "[2013, 9, 2]", value = "")
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public GetLoanProductsResponse endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get endDate
     *
     * @return endDate
     **/
    @ApiModelProperty(example = "[2014, 2, 7]", value = "")
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public GetLoanProductsResponse status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
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
     *
     * @return currency
     **/
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
     *
     * @return principal
     **/
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
     *
     * @return minPrincipal
     **/
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
     *
     * @return maxPrincipal
     **/
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
     *
     * @return numberOfRepayments
     **/
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
     *
     * @return minNumberOfRepayments
     **/
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
     *
     * @return maxNumberOfRepayments
     **/
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
     *
     * @return repaymentEvery
     **/
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
     *
     * @return repaymentFrequencyType
     **/
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
     *
     * @return interestRatePerPeriod
     **/
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
     *
     * @return interestRateFrequencyType
     **/
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
     *
     * @return annualInterestRate
     **/
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
     *
     * @return amortizationType
     **/
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
     *
     * @return interestType
     **/
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
     *
     * @return interestCalculationPeriodType
     **/
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
     *
     * @return transactionProcessingStrategyId
     **/
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
     *
     * @return transactionProcessingStrategyName
     **/
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
     *
     * @return principalVariationsForBorrowerCycle
     **/
    @ApiModelProperty(example = "\"[]\"", value = "")
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
     *
     * @return interestRateVariationsForBorrowerCycle
     **/
    @ApiModelProperty(example = "\"[]\"", value = "")
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
     *
     * @return numberOfRepaymentVariationsForBorrowerCycle
     **/
    @ApiModelProperty(example = "\"[]\"", value = "")
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
     *
     * @return daysInMonthType
     **/
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
     *
     * @return daysInYearType
     **/
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
     *
     * @return isInterestRecalculationEnabled
     **/
    @ApiModelProperty(example = "true", value = "")
    public Boolean isIsInterestRecalculationEnabled() {
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
     *
     * @return interestRecalculationData
     **/
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
     *
     * @return accountingRule
     **/
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
     *
     * @return principalThresholdForLastInstalment
     **/
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


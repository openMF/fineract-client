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
 * GetAccountsTypeAccountIdResponse
 */

public class GetAccountsTypeAccountIdResponse {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("accountNo")
    private Long accountNo = null;

    @SerializedName("savingsAccountNumber")
    private Long savingsAccountNumber = null;

    @SerializedName("clientId")
    private Integer clientId = null;

    @SerializedName("clientName")
    private String clientName = null;

    @SerializedName("productId")
    private Integer productId = null;

    @SerializedName("productName")
    private String productName = null;

    @SerializedName("status")
    private GetAccountsStatus status = null;

    @SerializedName("timeline")
    private GetAccountsTimeline timeline = null;

    @SerializedName("currency")
    private GetAccountsCurrency currency = null;

    @SerializedName("summary")
    private GetAccountsSummary summary = null;

    @SerializedName("purchasedShares")
    private List<GetAccountsPurchasedShares> purchasedShares = null;

    @SerializedName("savingsAccountId")
    private Integer savingsAccountId = null;

    @SerializedName("currentMarketPrice")
    private Integer currentMarketPrice = null;

    @SerializedName("lockinPeriod")
    private Integer lockinPeriod = null;

    @SerializedName("lockPeriodTypeEnum")
    private GetAccountsLockPeriodTypeEnum lockPeriodTypeEnum = null;

    @SerializedName("minimumActivePeriod")
    private Integer minimumActivePeriod = null;

    @SerializedName("minimumActivePeriodTypeEnum")
    private GetAccountsLockPeriodTypeEnum minimumActivePeriodTypeEnum = null;

    @SerializedName("allowDividendCalculationForInactiveClients")
    private Boolean allowDividendCalculationForInactiveClients = null;

    @SerializedName("charges")
    private List<GetAccountsCharges> charges = null;

    @SerializedName("dividends")
    private List<String> dividends = null;

    public GetAccountsTypeAccountIdResponse id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(example = "2", value = "")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GetAccountsTypeAccountIdResponse accountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }

    /**
     * Get accountNo
     *
     * @return accountNo
     **/
    @ApiModelProperty(example = "2", value = "")
    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public GetAccountsTypeAccountIdResponse savingsAccountNumber(Long savingsAccountNumber) {
        this.savingsAccountNumber = savingsAccountNumber;
        return this;
    }

    /**
     * Get savingsAccountNumber
     *
     * @return savingsAccountNumber
     **/
    @ApiModelProperty(example = "13", value = "")
    public Long getSavingsAccountNumber() {
        return savingsAccountNumber;
    }

    public void setSavingsAccountNumber(Long savingsAccountNumber) {
        this.savingsAccountNumber = savingsAccountNumber;
    }

    public GetAccountsTypeAccountIdResponse clientId(Integer clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get clientId
     *
     * @return clientId
     **/
    @ApiModelProperty(example = "7", value = "")
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public GetAccountsTypeAccountIdResponse clientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * Get clientName
     *
     * @return clientName
     **/
    @ApiModelProperty(example = "Client_FirstName_2KX8C Client_LastName_NWNG", value = "")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public GetAccountsTypeAccountIdResponse productId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Get productId
     *
     * @return productId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public GetAccountsTypeAccountIdResponse productName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * Get productName
     *
     * @return productName
     **/
    @ApiModelProperty(example = "Share Product", value = "")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public GetAccountsTypeAccountIdResponse status(GetAccountsStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @ApiModelProperty(value = "")
    public GetAccountsStatus getStatus() {
        return status;
    }

    public void setStatus(GetAccountsStatus status) {
        this.status = status;
    }

    public GetAccountsTypeAccountIdResponse timeline(GetAccountsTimeline timeline) {
        this.timeline = timeline;
        return this;
    }

    /**
     * Get timeline
     *
     * @return timeline
     **/
    @ApiModelProperty(value = "")
    public GetAccountsTimeline getTimeline() {
        return timeline;
    }

    public void setTimeline(GetAccountsTimeline timeline) {
        this.timeline = timeline;
    }

    public GetAccountsTypeAccountIdResponse currency(GetAccountsCurrency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/
    @ApiModelProperty(value = "")
    public GetAccountsCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(GetAccountsCurrency currency) {
        this.currency = currency;
    }

    public GetAccountsTypeAccountIdResponse summary(GetAccountsSummary summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get summary
     *
     * @return summary
     **/
    @ApiModelProperty(value = "")
    public GetAccountsSummary getSummary() {
        return summary;
    }

    public void setSummary(GetAccountsSummary summary) {
        this.summary = summary;
    }

    public GetAccountsTypeAccountIdResponse purchasedShares(List<GetAccountsPurchasedShares> purchasedShares) {
        this.purchasedShares = purchasedShares;
        return this;
    }

    public GetAccountsTypeAccountIdResponse addPurchasedSharesItem(GetAccountsPurchasedShares purchasedSharesItem) {
        if (this.purchasedShares == null) {
            this.purchasedShares = new ArrayList<GetAccountsPurchasedShares>();
        }
        this.purchasedShares.add(purchasedSharesItem);
        return this;
    }

    /**
     * Get purchasedShares
     *
     * @return purchasedShares
     **/
    @ApiModelProperty(value = "")
    public List<GetAccountsPurchasedShares> getPurchasedShares() {
        return purchasedShares;
    }

    public void setPurchasedShares(List<GetAccountsPurchasedShares> purchasedShares) {
        this.purchasedShares = purchasedShares;
    }

    public GetAccountsTypeAccountIdResponse savingsAccountId(Integer savingsAccountId) {
        this.savingsAccountId = savingsAccountId;
        return this;
    }

    /**
     * Get savingsAccountId
     *
     * @return savingsAccountId
     **/
    @ApiModelProperty(example = "13", value = "")
    public Integer getSavingsAccountId() {
        return savingsAccountId;
    }

    public void setSavingsAccountId(Integer savingsAccountId) {
        this.savingsAccountId = savingsAccountId;
    }

    public GetAccountsTypeAccountIdResponse currentMarketPrice(Integer currentMarketPrice) {
        this.currentMarketPrice = currentMarketPrice;
        return this;
    }

    /**
     * Get currentMarketPrice
     *
     * @return currentMarketPrice
     **/
    @ApiModelProperty(example = "5", value = "")
    public Integer getCurrentMarketPrice() {
        return currentMarketPrice;
    }

    public void setCurrentMarketPrice(Integer currentMarketPrice) {
        this.currentMarketPrice = currentMarketPrice;
    }

    public GetAccountsTypeAccountIdResponse lockinPeriod(Integer lockinPeriod) {
        this.lockinPeriod = lockinPeriod;
        return this;
    }

    /**
     * Get lockinPeriod
     *
     * @return lockinPeriod
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getLockinPeriod() {
        return lockinPeriod;
    }

    public void setLockinPeriod(Integer lockinPeriod) {
        this.lockinPeriod = lockinPeriod;
    }

    public GetAccountsTypeAccountIdResponse lockPeriodTypeEnum(GetAccountsLockPeriodTypeEnum lockPeriodTypeEnum) {
        this.lockPeriodTypeEnum = lockPeriodTypeEnum;
        return this;
    }

    /**
     * Get lockPeriodTypeEnum
     *
     * @return lockPeriodTypeEnum
     **/
    @ApiModelProperty(value = "")
    public GetAccountsLockPeriodTypeEnum getLockPeriodTypeEnum() {
        return lockPeriodTypeEnum;
    }

    public void setLockPeriodTypeEnum(GetAccountsLockPeriodTypeEnum lockPeriodTypeEnum) {
        this.lockPeriodTypeEnum = lockPeriodTypeEnum;
    }

    public GetAccountsTypeAccountIdResponse minimumActivePeriod(Integer minimumActivePeriod) {
        this.minimumActivePeriod = minimumActivePeriod;
        return this;
    }

    /**
     * Get minimumActivePeriod
     *
     * @return minimumActivePeriod
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getMinimumActivePeriod() {
        return minimumActivePeriod;
    }

    public void setMinimumActivePeriod(Integer minimumActivePeriod) {
        this.minimumActivePeriod = minimumActivePeriod;
    }

    public GetAccountsTypeAccountIdResponse minimumActivePeriodTypeEnum(GetAccountsLockPeriodTypeEnum minimumActivePeriodTypeEnum) {
        this.minimumActivePeriodTypeEnum = minimumActivePeriodTypeEnum;
        return this;
    }

    /**
     * Get minimumActivePeriodTypeEnum
     *
     * @return minimumActivePeriodTypeEnum
     **/
    @ApiModelProperty(value = "")
    public GetAccountsLockPeriodTypeEnum getMinimumActivePeriodTypeEnum() {
        return minimumActivePeriodTypeEnum;
    }

    public void setMinimumActivePeriodTypeEnum(GetAccountsLockPeriodTypeEnum minimumActivePeriodTypeEnum) {
        this.minimumActivePeriodTypeEnum = minimumActivePeriodTypeEnum;
    }

    public GetAccountsTypeAccountIdResponse allowDividendCalculationForInactiveClients(Boolean allowDividendCalculationForInactiveClients) {
        this.allowDividendCalculationForInactiveClients = allowDividendCalculationForInactiveClients;
        return this;
    }

    /**
     * Get allowDividendCalculationForInactiveClients
     *
     * @return allowDividendCalculationForInactiveClients
     **/
    @ApiModelProperty(example = "true", value = "")
    public Boolean isAllowDividendCalculationForInactiveClients() {
        return allowDividendCalculationForInactiveClients;
    }

    public void setAllowDividendCalculationForInactiveClients(Boolean allowDividendCalculationForInactiveClients) {
        this.allowDividendCalculationForInactiveClients = allowDividendCalculationForInactiveClients;
    }

    public GetAccountsTypeAccountIdResponse charges(List<GetAccountsCharges> charges) {
        this.charges = charges;
        return this;
    }

    public GetAccountsTypeAccountIdResponse addChargesItem(GetAccountsCharges chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<GetAccountsCharges>();
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
    public List<GetAccountsCharges> getCharges() {
        return charges;
    }

    public void setCharges(List<GetAccountsCharges> charges) {
        this.charges = charges;
    }

    public GetAccountsTypeAccountIdResponse dividends(List<String> dividends) {
        this.dividends = dividends;
        return this;
    }

    public GetAccountsTypeAccountIdResponse addDividendsItem(String dividendsItem) {
        if (this.dividends == null) {
            this.dividends = new ArrayList<String>();
        }
        this.dividends.add(dividendsItem);
        return this;
    }

    /**
     * Get dividends
     *
     * @return dividends
     **/
    @ApiModelProperty(value = "")
    public List<String> getDividends() {
        return dividends;
    }

    public void setDividends(List<String> dividends) {
        this.dividends = dividends;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAccountsTypeAccountIdResponse getAccountsTypeAccountIdResponse = (GetAccountsTypeAccountIdResponse) o;
        return Objects.equals(this.id, getAccountsTypeAccountIdResponse.id) &&
                Objects.equals(this.accountNo, getAccountsTypeAccountIdResponse.accountNo) &&
                Objects.equals(this.savingsAccountNumber, getAccountsTypeAccountIdResponse.savingsAccountNumber) &&
                Objects.equals(this.clientId, getAccountsTypeAccountIdResponse.clientId) &&
                Objects.equals(this.clientName, getAccountsTypeAccountIdResponse.clientName) &&
                Objects.equals(this.productId, getAccountsTypeAccountIdResponse.productId) &&
                Objects.equals(this.productName, getAccountsTypeAccountIdResponse.productName) &&
                Objects.equals(this.status, getAccountsTypeAccountIdResponse.status) &&
                Objects.equals(this.timeline, getAccountsTypeAccountIdResponse.timeline) &&
                Objects.equals(this.currency, getAccountsTypeAccountIdResponse.currency) &&
                Objects.equals(this.summary, getAccountsTypeAccountIdResponse.summary) &&
                Objects.equals(this.purchasedShares, getAccountsTypeAccountIdResponse.purchasedShares) &&
                Objects.equals(this.savingsAccountId, getAccountsTypeAccountIdResponse.savingsAccountId) &&
                Objects.equals(this.currentMarketPrice, getAccountsTypeAccountIdResponse.currentMarketPrice) &&
                Objects.equals(this.lockinPeriod, getAccountsTypeAccountIdResponse.lockinPeriod) &&
                Objects.equals(this.lockPeriodTypeEnum, getAccountsTypeAccountIdResponse.lockPeriodTypeEnum) &&
                Objects.equals(this.minimumActivePeriod, getAccountsTypeAccountIdResponse.minimumActivePeriod) &&
                Objects.equals(this.minimumActivePeriodTypeEnum, getAccountsTypeAccountIdResponse.minimumActivePeriodTypeEnum) &&
                Objects.equals(this.allowDividendCalculationForInactiveClients, getAccountsTypeAccountIdResponse.allowDividendCalculationForInactiveClients) &&
                Objects.equals(this.charges, getAccountsTypeAccountIdResponse.charges) &&
                Objects.equals(this.dividends, getAccountsTypeAccountIdResponse.dividends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNo, savingsAccountNumber, clientId, clientName, productId, productName, status, timeline, currency, summary, purchasedShares, savingsAccountId, currentMarketPrice, lockinPeriod, lockPeriodTypeEnum, minimumActivePeriod, minimumActivePeriodTypeEnum, allowDividendCalculationForInactiveClients, charges, dividends);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAccountsTypeAccountIdResponse {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
        sb.append("    savingsAccountNumber: ").append(toIndentedString(savingsAccountNumber)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    purchasedShares: ").append(toIndentedString(purchasedShares)).append("\n");
        sb.append("    savingsAccountId: ").append(toIndentedString(savingsAccountId)).append("\n");
        sb.append("    currentMarketPrice: ").append(toIndentedString(currentMarketPrice)).append("\n");
        sb.append("    lockinPeriod: ").append(toIndentedString(lockinPeriod)).append("\n");
        sb.append("    lockPeriodTypeEnum: ").append(toIndentedString(lockPeriodTypeEnum)).append("\n");
        sb.append("    minimumActivePeriod: ").append(toIndentedString(minimumActivePeriod)).append("\n");
        sb.append("    minimumActivePeriodTypeEnum: ").append(toIndentedString(minimumActivePeriodTypeEnum)).append("\n");
        sb.append("    allowDividendCalculationForInactiveClients: ").append(toIndentedString(allowDividendCalculationForInactiveClients)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    dividends: ").append(toIndentedString(dividends)).append("\n");
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


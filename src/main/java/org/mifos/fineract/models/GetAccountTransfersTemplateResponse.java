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
 * GetAccountTransfersTemplateResponse
 */

public class GetAccountTransfersTemplateResponse {
    @SerializedName("transferAmount")
    private Long transferAmount = null;

    @SerializedName("transferDate")
    private LocalDate transferDate = null;

    @SerializedName("fromOffice")
    private GetAccountTransfersFromOffice fromOffice = null;

    @SerializedName("fromAccountType")
    private GetAccountTransfersFromAccountType fromAccountType = null;

    @SerializedName("fromOfficeOptions")
    private List<GetAccountTransfersFromOfficeOptions> fromOfficeOptions = null;

    @SerializedName("fromClientOptions")
    private List<GetAccountTransfersFromClientOptions> fromClientOptions = null;

    @SerializedName("fromAccountTypeOptions")
    private List<GetAccountTransfersFromAccountTypeOptions> fromAccountTypeOptions = null;

    @SerializedName("toOfficeOptions")
    private List<GetAccountTransfersToOfficeOptions> toOfficeOptions = null;

    @SerializedName("toAccountTypeOptions")
    private List<GetAccountTransfersToAccountTypeOptions> toAccountTypeOptions = null;

    public GetAccountTransfersTemplateResponse transferAmount(Long transferAmount) {
        this.transferAmount = transferAmount;
        return this;
    }

    /**
     * Get transferAmount
     *
     * @return transferAmount
     **/
    @ApiModelProperty(example = "0", value = "")
    public Long getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(Long transferAmount) {
        this.transferAmount = transferAmount;
    }

    public GetAccountTransfersTemplateResponse transferDate(LocalDate transferDate) {
        this.transferDate = transferDate;
        return this;
    }

    /**
     * Get transferDate
     *
     * @return transferDate
     **/
    @ApiModelProperty(example = "[2013, 8, 15]", value = "")
    public LocalDate getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDate transferDate) {
        this.transferDate = transferDate;
    }

    public GetAccountTransfersTemplateResponse fromOffice(GetAccountTransfersFromOffice fromOffice) {
        this.fromOffice = fromOffice;
        return this;
    }

    /**
     * Get fromOffice
     *
     * @return fromOffice
     **/
    @ApiModelProperty(value = "")
    public GetAccountTransfersFromOffice getFromOffice() {
        return fromOffice;
    }

    public void setFromOffice(GetAccountTransfersFromOffice fromOffice) {
        this.fromOffice = fromOffice;
    }

    public GetAccountTransfersTemplateResponse fromAccountType(GetAccountTransfersFromAccountType fromAccountType) {
        this.fromAccountType = fromAccountType;
        return this;
    }

    /**
     * Get fromAccountType
     *
     * @return fromAccountType
     **/
    @ApiModelProperty(value = "")
    public GetAccountTransfersFromAccountType getFromAccountType() {
        return fromAccountType;
    }

    public void setFromAccountType(GetAccountTransfersFromAccountType fromAccountType) {
        this.fromAccountType = fromAccountType;
    }

    public GetAccountTransfersTemplateResponse fromOfficeOptions(List<GetAccountTransfersFromOfficeOptions> fromOfficeOptions) {
        this.fromOfficeOptions = fromOfficeOptions;
        return this;
    }

    public GetAccountTransfersTemplateResponse addFromOfficeOptionsItem(GetAccountTransfersFromOfficeOptions fromOfficeOptionsItem) {
        if (this.fromOfficeOptions == null) {
            this.fromOfficeOptions = new ArrayList<GetAccountTransfersFromOfficeOptions>();
        }
        this.fromOfficeOptions.add(fromOfficeOptionsItem);
        return this;
    }

    /**
     * Get fromOfficeOptions
     *
     * @return fromOfficeOptions
     **/
    @ApiModelProperty(value = "")
    public List<GetAccountTransfersFromOfficeOptions> getFromOfficeOptions() {
        return fromOfficeOptions;
    }

    public void setFromOfficeOptions(List<GetAccountTransfersFromOfficeOptions> fromOfficeOptions) {
        this.fromOfficeOptions = fromOfficeOptions;
    }

    public GetAccountTransfersTemplateResponse fromClientOptions(List<GetAccountTransfersFromClientOptions> fromClientOptions) {
        this.fromClientOptions = fromClientOptions;
        return this;
    }

    public GetAccountTransfersTemplateResponse addFromClientOptionsItem(GetAccountTransfersFromClientOptions fromClientOptionsItem) {
        if (this.fromClientOptions == null) {
            this.fromClientOptions = new ArrayList<GetAccountTransfersFromClientOptions>();
        }
        this.fromClientOptions.add(fromClientOptionsItem);
        return this;
    }

    /**
     * Get fromClientOptions
     *
     * @return fromClientOptions
     **/
    @ApiModelProperty(value = "")
    public List<GetAccountTransfersFromClientOptions> getFromClientOptions() {
        return fromClientOptions;
    }

    public void setFromClientOptions(List<GetAccountTransfersFromClientOptions> fromClientOptions) {
        this.fromClientOptions = fromClientOptions;
    }

    public GetAccountTransfersTemplateResponse fromAccountTypeOptions(List<GetAccountTransfersFromAccountTypeOptions> fromAccountTypeOptions) {
        this.fromAccountTypeOptions = fromAccountTypeOptions;
        return this;
    }

    public GetAccountTransfersTemplateResponse addFromAccountTypeOptionsItem(GetAccountTransfersFromAccountTypeOptions fromAccountTypeOptionsItem) {
        if (this.fromAccountTypeOptions == null) {
            this.fromAccountTypeOptions = new ArrayList<GetAccountTransfersFromAccountTypeOptions>();
        }
        this.fromAccountTypeOptions.add(fromAccountTypeOptionsItem);
        return this;
    }

    /**
     * Get fromAccountTypeOptions
     *
     * @return fromAccountTypeOptions
     **/
    @ApiModelProperty(value = "")
    public List<GetAccountTransfersFromAccountTypeOptions> getFromAccountTypeOptions() {
        return fromAccountTypeOptions;
    }

    public void setFromAccountTypeOptions(List<GetAccountTransfersFromAccountTypeOptions> fromAccountTypeOptions) {
        this.fromAccountTypeOptions = fromAccountTypeOptions;
    }

    public GetAccountTransfersTemplateResponse toOfficeOptions(List<GetAccountTransfersToOfficeOptions> toOfficeOptions) {
        this.toOfficeOptions = toOfficeOptions;
        return this;
    }

    public GetAccountTransfersTemplateResponse addToOfficeOptionsItem(GetAccountTransfersToOfficeOptions toOfficeOptionsItem) {
        if (this.toOfficeOptions == null) {
            this.toOfficeOptions = new ArrayList<GetAccountTransfersToOfficeOptions>();
        }
        this.toOfficeOptions.add(toOfficeOptionsItem);
        return this;
    }

    /**
     * Get toOfficeOptions
     *
     * @return toOfficeOptions
     **/
    @ApiModelProperty(value = "")
    public List<GetAccountTransfersToOfficeOptions> getToOfficeOptions() {
        return toOfficeOptions;
    }

    public void setToOfficeOptions(List<GetAccountTransfersToOfficeOptions> toOfficeOptions) {
        this.toOfficeOptions = toOfficeOptions;
    }

    public GetAccountTransfersTemplateResponse toAccountTypeOptions(List<GetAccountTransfersToAccountTypeOptions> toAccountTypeOptions) {
        this.toAccountTypeOptions = toAccountTypeOptions;
        return this;
    }

    public GetAccountTransfersTemplateResponse addToAccountTypeOptionsItem(GetAccountTransfersToAccountTypeOptions toAccountTypeOptionsItem) {
        if (this.toAccountTypeOptions == null) {
            this.toAccountTypeOptions = new ArrayList<GetAccountTransfersToAccountTypeOptions>();
        }
        this.toAccountTypeOptions.add(toAccountTypeOptionsItem);
        return this;
    }

    /**
     * Get toAccountTypeOptions
     *
     * @return toAccountTypeOptions
     **/
    @ApiModelProperty(value = "")
    public List<GetAccountTransfersToAccountTypeOptions> getToAccountTypeOptions() {
        return toAccountTypeOptions;
    }

    public void setToAccountTypeOptions(List<GetAccountTransfersToAccountTypeOptions> toAccountTypeOptions) {
        this.toAccountTypeOptions = toAccountTypeOptions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAccountTransfersTemplateResponse getAccountTransfersTemplateResponse = (GetAccountTransfersTemplateResponse) o;
        return Objects.equals(this.transferAmount, getAccountTransfersTemplateResponse.transferAmount) &&
                Objects.equals(this.transferDate, getAccountTransfersTemplateResponse.transferDate) &&
                Objects.equals(this.fromOffice, getAccountTransfersTemplateResponse.fromOffice) &&
                Objects.equals(this.fromAccountType, getAccountTransfersTemplateResponse.fromAccountType) &&
                Objects.equals(this.fromOfficeOptions, getAccountTransfersTemplateResponse.fromOfficeOptions) &&
                Objects.equals(this.fromClientOptions, getAccountTransfersTemplateResponse.fromClientOptions) &&
                Objects.equals(this.fromAccountTypeOptions, getAccountTransfersTemplateResponse.fromAccountTypeOptions) &&
                Objects.equals(this.toOfficeOptions, getAccountTransfersTemplateResponse.toOfficeOptions) &&
                Objects.equals(this.toAccountTypeOptions, getAccountTransfersTemplateResponse.toAccountTypeOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transferAmount, transferDate, fromOffice, fromAccountType, fromOfficeOptions, fromClientOptions, fromAccountTypeOptions, toOfficeOptions, toAccountTypeOptions);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAccountTransfersTemplateResponse {\n");

        sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
        sb.append("    transferDate: ").append(toIndentedString(transferDate)).append("\n");
        sb.append("    fromOffice: ").append(toIndentedString(fromOffice)).append("\n");
        sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
        sb.append("    fromOfficeOptions: ").append(toIndentedString(fromOfficeOptions)).append("\n");
        sb.append("    fromClientOptions: ").append(toIndentedString(fromClientOptions)).append("\n");
        sb.append("    fromAccountTypeOptions: ").append(toIndentedString(fromAccountTypeOptions)).append("\n");
        sb.append("    toOfficeOptions: ").append(toIndentedString(toOfficeOptions)).append("\n");
        sb.append("    toAccountTypeOptions: ").append(toIndentedString(toAccountTypeOptions)).append("\n");
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


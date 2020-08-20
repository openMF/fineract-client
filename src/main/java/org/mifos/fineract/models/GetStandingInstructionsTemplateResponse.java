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
 * GetStandingInstructionsTemplateResponse
 */

public class GetStandingInstructionsTemplateResponse {
    @SerializedName("fromOffice")
    private GetFromOfficeResponseStandingInstructionSwagger fromOffice = null;

    @SerializedName("fromAccountType")
    private GetFromAccountTypeResponseStandingInstructionSwagger fromAccountType = null;

    @SerializedName("fromOfficeOptions")
    private List<GetFromOfficeOptionsResponseStandingInstructionSwagger> fromOfficeOptions = null;

    @SerializedName("fromClientOptions")
    private List<GetFromClientOptionsResponseStandingInstructionSwagger> fromClientOptions = null;

    @SerializedName("fromAccountTypeOptions")
    private List<GetFromAccountTypeOptionsResponseStandingInstructionSwagger> fromAccountTypeOptions = null;

    @SerializedName("toOfficeOptions")
    private List<GetToOfficeOptionsResponseStandingInstructionSwagger> toOfficeOptions = null;

    @SerializedName("toAccountTypeOptions")
    private List<GetToAccountTypeOptionsResponseStandingInstructionSwagger> toAccountTypeOptions = null;

    @SerializedName("transferTypeOptions")
    private List<GetTransferTypeOptionsResponseStandingInstructionSwagger> transferTypeOptions = null;

    @SerializedName("statusOptions")
    private List<GetStatusOptionsResponseStandingInstructionSwagger> statusOptions = null;

    @SerializedName("instructionTypeOptions")
    private List<GetInstructionTypeOptionsResponseStandingInstructionSwagger> instructionTypeOptions = null;

    @SerializedName("priorityOptions")
    private List<GetPriorityOptionsResponseStandingInstructionSwagger> priorityOptions = null;

    @SerializedName("recurrenceTypeOptions")
    private List<GetRecurrenceTypeOptionsResponseStandingInstructionSwagger> recurrenceTypeOptions = null;

    @SerializedName("recurrenceFrequencyOptions")
    private List<GetRecurrenceFrequencyOptionsResponseStandingInstructionSwagger> recurrenceFrequencyOptions = null;

    public GetStandingInstructionsTemplateResponse fromOffice(GetFromOfficeResponseStandingInstructionSwagger fromOffice) {
        this.fromOffice = fromOffice;
        return this;
    }

    /**
     * Get fromOffice
     *
     * @return fromOffice
     **/
    @ApiModelProperty(value = "")
    public GetFromOfficeResponseStandingInstructionSwagger getFromOffice() {
        return fromOffice;
    }

    public void setFromOffice(GetFromOfficeResponseStandingInstructionSwagger fromOffice) {
        this.fromOffice = fromOffice;
    }

    public GetStandingInstructionsTemplateResponse fromAccountType(GetFromAccountTypeResponseStandingInstructionSwagger fromAccountType) {
        this.fromAccountType = fromAccountType;
        return this;
    }

    /**
     * Get fromAccountType
     *
     * @return fromAccountType
     **/
    @ApiModelProperty(value = "")
    public GetFromAccountTypeResponseStandingInstructionSwagger getFromAccountType() {
        return fromAccountType;
    }

    public void setFromAccountType(GetFromAccountTypeResponseStandingInstructionSwagger fromAccountType) {
        this.fromAccountType = fromAccountType;
    }

    public GetStandingInstructionsTemplateResponse fromOfficeOptions(List<GetFromOfficeOptionsResponseStandingInstructionSwagger> fromOfficeOptions) {
        this.fromOfficeOptions = fromOfficeOptions;
        return this;
    }

    public GetStandingInstructionsTemplateResponse addFromOfficeOptionsItem(GetFromOfficeOptionsResponseStandingInstructionSwagger fromOfficeOptionsItem) {
        if (this.fromOfficeOptions == null) {
            this.fromOfficeOptions = new ArrayList<GetFromOfficeOptionsResponseStandingInstructionSwagger>();
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
    public List<GetFromOfficeOptionsResponseStandingInstructionSwagger> getFromOfficeOptions() {
        return fromOfficeOptions;
    }

    public void setFromOfficeOptions(List<GetFromOfficeOptionsResponseStandingInstructionSwagger> fromOfficeOptions) {
        this.fromOfficeOptions = fromOfficeOptions;
    }

    public GetStandingInstructionsTemplateResponse fromClientOptions(List<GetFromClientOptionsResponseStandingInstructionSwagger> fromClientOptions) {
        this.fromClientOptions = fromClientOptions;
        return this;
    }

    public GetStandingInstructionsTemplateResponse addFromClientOptionsItem(GetFromClientOptionsResponseStandingInstructionSwagger fromClientOptionsItem) {
        if (this.fromClientOptions == null) {
            this.fromClientOptions = new ArrayList<GetFromClientOptionsResponseStandingInstructionSwagger>();
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
    public List<GetFromClientOptionsResponseStandingInstructionSwagger> getFromClientOptions() {
        return fromClientOptions;
    }

    public void setFromClientOptions(List<GetFromClientOptionsResponseStandingInstructionSwagger> fromClientOptions) {
        this.fromClientOptions = fromClientOptions;
    }

    public GetStandingInstructionsTemplateResponse fromAccountTypeOptions(List<GetFromAccountTypeOptionsResponseStandingInstructionSwagger> fromAccountTypeOptions) {
        this.fromAccountTypeOptions = fromAccountTypeOptions;
        return this;
    }

    public GetStandingInstructionsTemplateResponse addFromAccountTypeOptionsItem(GetFromAccountTypeOptionsResponseStandingInstructionSwagger fromAccountTypeOptionsItem) {
        if (this.fromAccountTypeOptions == null) {
            this.fromAccountTypeOptions = new ArrayList<GetFromAccountTypeOptionsResponseStandingInstructionSwagger>();
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
    public List<GetFromAccountTypeOptionsResponseStandingInstructionSwagger> getFromAccountTypeOptions() {
        return fromAccountTypeOptions;
    }

    public void setFromAccountTypeOptions(List<GetFromAccountTypeOptionsResponseStandingInstructionSwagger> fromAccountTypeOptions) {
        this.fromAccountTypeOptions = fromAccountTypeOptions;
    }

    public GetStandingInstructionsTemplateResponse toOfficeOptions(List<GetToOfficeOptionsResponseStandingInstructionSwagger> toOfficeOptions) {
        this.toOfficeOptions = toOfficeOptions;
        return this;
    }

    public GetStandingInstructionsTemplateResponse addToOfficeOptionsItem(GetToOfficeOptionsResponseStandingInstructionSwagger toOfficeOptionsItem) {
        if (this.toOfficeOptions == null) {
            this.toOfficeOptions = new ArrayList<GetToOfficeOptionsResponseStandingInstructionSwagger>();
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
    public List<GetToOfficeOptionsResponseStandingInstructionSwagger> getToOfficeOptions() {
        return toOfficeOptions;
    }

    public void setToOfficeOptions(List<GetToOfficeOptionsResponseStandingInstructionSwagger> toOfficeOptions) {
        this.toOfficeOptions = toOfficeOptions;
    }

    public GetStandingInstructionsTemplateResponse toAccountTypeOptions(List<GetToAccountTypeOptionsResponseStandingInstructionSwagger> toAccountTypeOptions) {
        this.toAccountTypeOptions = toAccountTypeOptions;
        return this;
    }

    public GetStandingInstructionsTemplateResponse addToAccountTypeOptionsItem(GetToAccountTypeOptionsResponseStandingInstructionSwagger toAccountTypeOptionsItem) {
        if (this.toAccountTypeOptions == null) {
            this.toAccountTypeOptions = new ArrayList<GetToAccountTypeOptionsResponseStandingInstructionSwagger>();
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
    public List<GetToAccountTypeOptionsResponseStandingInstructionSwagger> getToAccountTypeOptions() {
        return toAccountTypeOptions;
    }

    public void setToAccountTypeOptions(List<GetToAccountTypeOptionsResponseStandingInstructionSwagger> toAccountTypeOptions) {
        this.toAccountTypeOptions = toAccountTypeOptions;
    }

    public GetStandingInstructionsTemplateResponse transferTypeOptions(List<GetTransferTypeOptionsResponseStandingInstructionSwagger> transferTypeOptions) {
        this.transferTypeOptions = transferTypeOptions;
        return this;
    }

    public GetStandingInstructionsTemplateResponse addTransferTypeOptionsItem(GetTransferTypeOptionsResponseStandingInstructionSwagger transferTypeOptionsItem) {
        if (this.transferTypeOptions == null) {
            this.transferTypeOptions = new ArrayList<GetTransferTypeOptionsResponseStandingInstructionSwagger>();
        }
        this.transferTypeOptions.add(transferTypeOptionsItem);
        return this;
    }

    /**
     * Get transferTypeOptions
     *
     * @return transferTypeOptions
     **/
    @ApiModelProperty(value = "")
    public List<GetTransferTypeOptionsResponseStandingInstructionSwagger> getTransferTypeOptions() {
        return transferTypeOptions;
    }

    public void setTransferTypeOptions(List<GetTransferTypeOptionsResponseStandingInstructionSwagger> transferTypeOptions) {
        this.transferTypeOptions = transferTypeOptions;
    }

    public GetStandingInstructionsTemplateResponse statusOptions(List<GetStatusOptionsResponseStandingInstructionSwagger> statusOptions) {
        this.statusOptions = statusOptions;
        return this;
    }

    public GetStandingInstructionsTemplateResponse addStatusOptionsItem(GetStatusOptionsResponseStandingInstructionSwagger statusOptionsItem) {
        if (this.statusOptions == null) {
            this.statusOptions = new ArrayList<GetStatusOptionsResponseStandingInstructionSwagger>();
        }
        this.statusOptions.add(statusOptionsItem);
        return this;
    }

    /**
     * Get statusOptions
     *
     * @return statusOptions
     **/
    @ApiModelProperty(value = "")
    public List<GetStatusOptionsResponseStandingInstructionSwagger> getStatusOptions() {
        return statusOptions;
    }

    public void setStatusOptions(List<GetStatusOptionsResponseStandingInstructionSwagger> statusOptions) {
        this.statusOptions = statusOptions;
    }

    public GetStandingInstructionsTemplateResponse instructionTypeOptions(List<GetInstructionTypeOptionsResponseStandingInstructionSwagger> instructionTypeOptions) {
        this.instructionTypeOptions = instructionTypeOptions;
        return this;
    }

    public GetStandingInstructionsTemplateResponse addInstructionTypeOptionsItem(GetInstructionTypeOptionsResponseStandingInstructionSwagger instructionTypeOptionsItem) {
        if (this.instructionTypeOptions == null) {
            this.instructionTypeOptions = new ArrayList<GetInstructionTypeOptionsResponseStandingInstructionSwagger>();
        }
        this.instructionTypeOptions.add(instructionTypeOptionsItem);
        return this;
    }

    /**
     * Get instructionTypeOptions
     *
     * @return instructionTypeOptions
     **/
    @ApiModelProperty(value = "")
    public List<GetInstructionTypeOptionsResponseStandingInstructionSwagger> getInstructionTypeOptions() {
        return instructionTypeOptions;
    }

    public void setInstructionTypeOptions(List<GetInstructionTypeOptionsResponseStandingInstructionSwagger> instructionTypeOptions) {
        this.instructionTypeOptions = instructionTypeOptions;
    }

    public GetStandingInstructionsTemplateResponse priorityOptions(List<GetPriorityOptionsResponseStandingInstructionSwagger> priorityOptions) {
        this.priorityOptions = priorityOptions;
        return this;
    }

    public GetStandingInstructionsTemplateResponse addPriorityOptionsItem(GetPriorityOptionsResponseStandingInstructionSwagger priorityOptionsItem) {
        if (this.priorityOptions == null) {
            this.priorityOptions = new ArrayList<GetPriorityOptionsResponseStandingInstructionSwagger>();
        }
        this.priorityOptions.add(priorityOptionsItem);
        return this;
    }

    /**
     * Get priorityOptions
     *
     * @return priorityOptions
     **/
    @ApiModelProperty(value = "")
    public List<GetPriorityOptionsResponseStandingInstructionSwagger> getPriorityOptions() {
        return priorityOptions;
    }

    public void setPriorityOptions(List<GetPriorityOptionsResponseStandingInstructionSwagger> priorityOptions) {
        this.priorityOptions = priorityOptions;
    }

    public GetStandingInstructionsTemplateResponse recurrenceTypeOptions(List<GetRecurrenceTypeOptionsResponseStandingInstructionSwagger> recurrenceTypeOptions) {
        this.recurrenceTypeOptions = recurrenceTypeOptions;
        return this;
    }

    public GetStandingInstructionsTemplateResponse addRecurrenceTypeOptionsItem(GetRecurrenceTypeOptionsResponseStandingInstructionSwagger recurrenceTypeOptionsItem) {
        if (this.recurrenceTypeOptions == null) {
            this.recurrenceTypeOptions = new ArrayList<GetRecurrenceTypeOptionsResponseStandingInstructionSwagger>();
        }
        this.recurrenceTypeOptions.add(recurrenceTypeOptionsItem);
        return this;
    }

    /**
     * Get recurrenceTypeOptions
     *
     * @return recurrenceTypeOptions
     **/
    @ApiModelProperty(value = "")
    public List<GetRecurrenceTypeOptionsResponseStandingInstructionSwagger> getRecurrenceTypeOptions() {
        return recurrenceTypeOptions;
    }

    public void setRecurrenceTypeOptions(List<GetRecurrenceTypeOptionsResponseStandingInstructionSwagger> recurrenceTypeOptions) {
        this.recurrenceTypeOptions = recurrenceTypeOptions;
    }

    public GetStandingInstructionsTemplateResponse recurrenceFrequencyOptions(List<GetRecurrenceFrequencyOptionsResponseStandingInstructionSwagger> recurrenceFrequencyOptions) {
        this.recurrenceFrequencyOptions = recurrenceFrequencyOptions;
        return this;
    }

    public GetStandingInstructionsTemplateResponse addRecurrenceFrequencyOptionsItem(GetRecurrenceFrequencyOptionsResponseStandingInstructionSwagger recurrenceFrequencyOptionsItem) {
        if (this.recurrenceFrequencyOptions == null) {
            this.recurrenceFrequencyOptions = new ArrayList<GetRecurrenceFrequencyOptionsResponseStandingInstructionSwagger>();
        }
        this.recurrenceFrequencyOptions.add(recurrenceFrequencyOptionsItem);
        return this;
    }

    /**
     * Get recurrenceFrequencyOptions
     *
     * @return recurrenceFrequencyOptions
     **/
    @ApiModelProperty(value = "")
    public List<GetRecurrenceFrequencyOptionsResponseStandingInstructionSwagger> getRecurrenceFrequencyOptions() {
        return recurrenceFrequencyOptions;
    }

    public void setRecurrenceFrequencyOptions(List<GetRecurrenceFrequencyOptionsResponseStandingInstructionSwagger> recurrenceFrequencyOptions) {
        this.recurrenceFrequencyOptions = recurrenceFrequencyOptions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetStandingInstructionsTemplateResponse getStandingInstructionsTemplateResponse = (GetStandingInstructionsTemplateResponse) o;
        return Objects.equals(this.fromOffice, getStandingInstructionsTemplateResponse.fromOffice) &&
                Objects.equals(this.fromAccountType, getStandingInstructionsTemplateResponse.fromAccountType) &&
                Objects.equals(this.fromOfficeOptions, getStandingInstructionsTemplateResponse.fromOfficeOptions) &&
                Objects.equals(this.fromClientOptions, getStandingInstructionsTemplateResponse.fromClientOptions) &&
                Objects.equals(this.fromAccountTypeOptions, getStandingInstructionsTemplateResponse.fromAccountTypeOptions) &&
                Objects.equals(this.toOfficeOptions, getStandingInstructionsTemplateResponse.toOfficeOptions) &&
                Objects.equals(this.toAccountTypeOptions, getStandingInstructionsTemplateResponse.toAccountTypeOptions) &&
                Objects.equals(this.transferTypeOptions, getStandingInstructionsTemplateResponse.transferTypeOptions) &&
                Objects.equals(this.statusOptions, getStandingInstructionsTemplateResponse.statusOptions) &&
                Objects.equals(this.instructionTypeOptions, getStandingInstructionsTemplateResponse.instructionTypeOptions) &&
                Objects.equals(this.priorityOptions, getStandingInstructionsTemplateResponse.priorityOptions) &&
                Objects.equals(this.recurrenceTypeOptions, getStandingInstructionsTemplateResponse.recurrenceTypeOptions) &&
                Objects.equals(this.recurrenceFrequencyOptions, getStandingInstructionsTemplateResponse.recurrenceFrequencyOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromOffice, fromAccountType, fromOfficeOptions, fromClientOptions, fromAccountTypeOptions, toOfficeOptions, toAccountTypeOptions, transferTypeOptions, statusOptions, instructionTypeOptions, priorityOptions, recurrenceTypeOptions, recurrenceFrequencyOptions);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetStandingInstructionsTemplateResponse {\n");

        sb.append("    fromOffice: ").append(toIndentedString(fromOffice)).append("\n");
        sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
        sb.append("    fromOfficeOptions: ").append(toIndentedString(fromOfficeOptions)).append("\n");
        sb.append("    fromClientOptions: ").append(toIndentedString(fromClientOptions)).append("\n");
        sb.append("    fromAccountTypeOptions: ").append(toIndentedString(fromAccountTypeOptions)).append("\n");
        sb.append("    toOfficeOptions: ").append(toIndentedString(toOfficeOptions)).append("\n");
        sb.append("    toAccountTypeOptions: ").append(toIndentedString(toAccountTypeOptions)).append("\n");
        sb.append("    transferTypeOptions: ").append(toIndentedString(transferTypeOptions)).append("\n");
        sb.append("    statusOptions: ").append(toIndentedString(statusOptions)).append("\n");
        sb.append("    instructionTypeOptions: ").append(toIndentedString(instructionTypeOptions)).append("\n");
        sb.append("    priorityOptions: ").append(toIndentedString(priorityOptions)).append("\n");
        sb.append("    recurrenceTypeOptions: ").append(toIndentedString(recurrenceTypeOptions)).append("\n");
        sb.append("    recurrenceFrequencyOptions: ").append(toIndentedString(recurrenceFrequencyOptions)).append("\n");
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


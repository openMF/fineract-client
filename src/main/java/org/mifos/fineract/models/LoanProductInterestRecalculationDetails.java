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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * LoanProductInterestRecalculationDetails
 */

public class LoanProductInterestRecalculationDetails {
    @SerializedName("id")
    private Long id = null;

    @SerializedName("interestRecalculationCompoundingMethod")
    private Integer interestRecalculationCompoundingMethod = null;

    @SerializedName("rescheduleStrategyMethod")
    private Integer rescheduleStrategyMethod = null;
    @SerializedName("restFrequencyType")
    private RestFrequencyTypeEnum restFrequencyType = null;
    @SerializedName("restInterval")
    private Integer restInterval = null;
    @SerializedName("restFrequencyNthDay")
    private Integer restFrequencyNthDay = null;
    @SerializedName("restFrequencyWeekday")
    private Integer restFrequencyWeekday = null;
    @SerializedName("restFrequencyOnDay")
    private Integer restFrequencyOnDay = null;
    @SerializedName("compoundingFrequencyType")
    private CompoundingFrequencyTypeEnum compoundingFrequencyType = null;
    @SerializedName("compoundingInterval")
    private Integer compoundingInterval = null;
    @SerializedName("compoundingFrequencyNthDay")
    private Integer compoundingFrequencyNthDay = null;
    @SerializedName("compoundingFrequencyWeekday")
    private Integer compoundingFrequencyWeekday = null;
    @SerializedName("compoundingFrequencyOnDay")
    private Integer compoundingFrequencyOnDay = null;
    @SerializedName("isCompoundingToBePostedAsTransaction")
    private Boolean isCompoundingToBePostedAsTransaction = null;
    @SerializedName("arrearsBasedOnOriginalSchedule")
    private Boolean arrearsBasedOnOriginalSchedule = null;
    @SerializedName("new")
    private Boolean _new = null;

    public LoanProductInterestRecalculationDetails id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(value = "")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LoanProductInterestRecalculationDetails interestRecalculationCompoundingMethod(Integer interestRecalculationCompoundingMethod) {
        this.interestRecalculationCompoundingMethod = interestRecalculationCompoundingMethod;
        return this;
    }

    /**
     * Get interestRecalculationCompoundingMethod
     *
     * @return interestRecalculationCompoundingMethod
     **/
    @ApiModelProperty(value = "")
    public Integer getInterestRecalculationCompoundingMethod() {
        return interestRecalculationCompoundingMethod;
    }

    public void setInterestRecalculationCompoundingMethod(Integer interestRecalculationCompoundingMethod) {
        this.interestRecalculationCompoundingMethod = interestRecalculationCompoundingMethod;
    }

    public LoanProductInterestRecalculationDetails rescheduleStrategyMethod(Integer rescheduleStrategyMethod) {
        this.rescheduleStrategyMethod = rescheduleStrategyMethod;
        return this;
    }

    /**
     * Get rescheduleStrategyMethod
     *
     * @return rescheduleStrategyMethod
     **/
    @ApiModelProperty(value = "")
    public Integer getRescheduleStrategyMethod() {
        return rescheduleStrategyMethod;
    }

    public void setRescheduleStrategyMethod(Integer rescheduleStrategyMethod) {
        this.rescheduleStrategyMethod = rescheduleStrategyMethod;
    }

    public LoanProductInterestRecalculationDetails restFrequencyType(RestFrequencyTypeEnum restFrequencyType) {
        this.restFrequencyType = restFrequencyType;
        return this;
    }

    /**
     * Get restFrequencyType
     *
     * @return restFrequencyType
     **/
    @ApiModelProperty(value = "")
    public RestFrequencyTypeEnum getRestFrequencyType() {
        return restFrequencyType;
    }

    public void setRestFrequencyType(RestFrequencyTypeEnum restFrequencyType) {
        this.restFrequencyType = restFrequencyType;
    }

    public LoanProductInterestRecalculationDetails restInterval(Integer restInterval) {
        this.restInterval = restInterval;
        return this;
    }

    /**
     * Get restInterval
     *
     * @return restInterval
     **/
    @ApiModelProperty(value = "")
    public Integer getRestInterval() {
        return restInterval;
    }

    public void setRestInterval(Integer restInterval) {
        this.restInterval = restInterval;
    }

    public LoanProductInterestRecalculationDetails restFrequencyNthDay(Integer restFrequencyNthDay) {
        this.restFrequencyNthDay = restFrequencyNthDay;
        return this;
    }

    /**
     * Get restFrequencyNthDay
     *
     * @return restFrequencyNthDay
     **/
    @ApiModelProperty(value = "")
    public Integer getRestFrequencyNthDay() {
        return restFrequencyNthDay;
    }

    public void setRestFrequencyNthDay(Integer restFrequencyNthDay) {
        this.restFrequencyNthDay = restFrequencyNthDay;
    }

    public LoanProductInterestRecalculationDetails restFrequencyWeekday(Integer restFrequencyWeekday) {
        this.restFrequencyWeekday = restFrequencyWeekday;
        return this;
    }

    /**
     * Get restFrequencyWeekday
     *
     * @return restFrequencyWeekday
     **/
    @ApiModelProperty(value = "")
    public Integer getRestFrequencyWeekday() {
        return restFrequencyWeekday;
    }

    public void setRestFrequencyWeekday(Integer restFrequencyWeekday) {
        this.restFrequencyWeekday = restFrequencyWeekday;
    }

    public LoanProductInterestRecalculationDetails restFrequencyOnDay(Integer restFrequencyOnDay) {
        this.restFrequencyOnDay = restFrequencyOnDay;
        return this;
    }

    /**
     * Get restFrequencyOnDay
     *
     * @return restFrequencyOnDay
     **/
    @ApiModelProperty(value = "")
    public Integer getRestFrequencyOnDay() {
        return restFrequencyOnDay;
    }

    public void setRestFrequencyOnDay(Integer restFrequencyOnDay) {
        this.restFrequencyOnDay = restFrequencyOnDay;
    }

    public LoanProductInterestRecalculationDetails compoundingFrequencyType(CompoundingFrequencyTypeEnum compoundingFrequencyType) {
        this.compoundingFrequencyType = compoundingFrequencyType;
        return this;
    }

    /**
     * Get compoundingFrequencyType
     *
     * @return compoundingFrequencyType
     **/
    @ApiModelProperty(value = "")
    public CompoundingFrequencyTypeEnum getCompoundingFrequencyType() {
        return compoundingFrequencyType;
    }

    public void setCompoundingFrequencyType(CompoundingFrequencyTypeEnum compoundingFrequencyType) {
        this.compoundingFrequencyType = compoundingFrequencyType;
    }

    public LoanProductInterestRecalculationDetails compoundingInterval(Integer compoundingInterval) {
        this.compoundingInterval = compoundingInterval;
        return this;
    }

    /**
     * Get compoundingInterval
     *
     * @return compoundingInterval
     **/
    @ApiModelProperty(value = "")
    public Integer getCompoundingInterval() {
        return compoundingInterval;
    }

    public void setCompoundingInterval(Integer compoundingInterval) {
        this.compoundingInterval = compoundingInterval;
    }

    public LoanProductInterestRecalculationDetails compoundingFrequencyNthDay(Integer compoundingFrequencyNthDay) {
        this.compoundingFrequencyNthDay = compoundingFrequencyNthDay;
        return this;
    }

    /**
     * Get compoundingFrequencyNthDay
     *
     * @return compoundingFrequencyNthDay
     **/
    @ApiModelProperty(value = "")
    public Integer getCompoundingFrequencyNthDay() {
        return compoundingFrequencyNthDay;
    }

    public void setCompoundingFrequencyNthDay(Integer compoundingFrequencyNthDay) {
        this.compoundingFrequencyNthDay = compoundingFrequencyNthDay;
    }

    public LoanProductInterestRecalculationDetails compoundingFrequencyWeekday(Integer compoundingFrequencyWeekday) {
        this.compoundingFrequencyWeekday = compoundingFrequencyWeekday;
        return this;
    }

    /**
     * Get compoundingFrequencyWeekday
     *
     * @return compoundingFrequencyWeekday
     **/
    @ApiModelProperty(value = "")
    public Integer getCompoundingFrequencyWeekday() {
        return compoundingFrequencyWeekday;
    }

    public void setCompoundingFrequencyWeekday(Integer compoundingFrequencyWeekday) {
        this.compoundingFrequencyWeekday = compoundingFrequencyWeekday;
    }

    public LoanProductInterestRecalculationDetails compoundingFrequencyOnDay(Integer compoundingFrequencyOnDay) {
        this.compoundingFrequencyOnDay = compoundingFrequencyOnDay;
        return this;
    }

    /**
     * Get compoundingFrequencyOnDay
     *
     * @return compoundingFrequencyOnDay
     **/
    @ApiModelProperty(value = "")
    public Integer getCompoundingFrequencyOnDay() {
        return compoundingFrequencyOnDay;
    }

    public void setCompoundingFrequencyOnDay(Integer compoundingFrequencyOnDay) {
        this.compoundingFrequencyOnDay = compoundingFrequencyOnDay;
    }

    public LoanProductInterestRecalculationDetails isCompoundingToBePostedAsTransaction(Boolean isCompoundingToBePostedAsTransaction) {
        this.isCompoundingToBePostedAsTransaction = isCompoundingToBePostedAsTransaction;
        return this;
    }

    /**
     * Get isCompoundingToBePostedAsTransaction
     *
     * @return isCompoundingToBePostedAsTransaction
     **/
    @ApiModelProperty(value = "")
    public Boolean isIsCompoundingToBePostedAsTransaction() {
        return isCompoundingToBePostedAsTransaction;
    }

    public void setIsCompoundingToBePostedAsTransaction(Boolean isCompoundingToBePostedAsTransaction) {
        this.isCompoundingToBePostedAsTransaction = isCompoundingToBePostedAsTransaction;
    }

    public LoanProductInterestRecalculationDetails arrearsBasedOnOriginalSchedule(Boolean arrearsBasedOnOriginalSchedule) {
        this.arrearsBasedOnOriginalSchedule = arrearsBasedOnOriginalSchedule;
        return this;
    }

    /**
     * Get arrearsBasedOnOriginalSchedule
     *
     * @return arrearsBasedOnOriginalSchedule
     **/
    @ApiModelProperty(value = "")
    public Boolean isArrearsBasedOnOriginalSchedule() {
        return arrearsBasedOnOriginalSchedule;
    }

    public void setArrearsBasedOnOriginalSchedule(Boolean arrearsBasedOnOriginalSchedule) {
        this.arrearsBasedOnOriginalSchedule = arrearsBasedOnOriginalSchedule;
    }

    public LoanProductInterestRecalculationDetails _new(Boolean _new) {
        this._new = _new;
        return this;
    }

    /**
     * Get _new
     *
     * @return _new
     **/
    @ApiModelProperty(value = "")
    public Boolean isNew() {
        return _new;
    }

    public void setNew(Boolean _new) {
        this._new = _new;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoanProductInterestRecalculationDetails loanProductInterestRecalculationDetails = (LoanProductInterestRecalculationDetails) o;
        return Objects.equals(this.id, loanProductInterestRecalculationDetails.id) &&
                Objects.equals(this.interestRecalculationCompoundingMethod, loanProductInterestRecalculationDetails.interestRecalculationCompoundingMethod) &&
                Objects.equals(this.rescheduleStrategyMethod, loanProductInterestRecalculationDetails.rescheduleStrategyMethod) &&
                Objects.equals(this.restFrequencyType, loanProductInterestRecalculationDetails.restFrequencyType) &&
                Objects.equals(this.restInterval, loanProductInterestRecalculationDetails.restInterval) &&
                Objects.equals(this.restFrequencyNthDay, loanProductInterestRecalculationDetails.restFrequencyNthDay) &&
                Objects.equals(this.restFrequencyWeekday, loanProductInterestRecalculationDetails.restFrequencyWeekday) &&
                Objects.equals(this.restFrequencyOnDay, loanProductInterestRecalculationDetails.restFrequencyOnDay) &&
                Objects.equals(this.compoundingFrequencyType, loanProductInterestRecalculationDetails.compoundingFrequencyType) &&
                Objects.equals(this.compoundingInterval, loanProductInterestRecalculationDetails.compoundingInterval) &&
                Objects.equals(this.compoundingFrequencyNthDay, loanProductInterestRecalculationDetails.compoundingFrequencyNthDay) &&
                Objects.equals(this.compoundingFrequencyWeekday, loanProductInterestRecalculationDetails.compoundingFrequencyWeekday) &&
                Objects.equals(this.compoundingFrequencyOnDay, loanProductInterestRecalculationDetails.compoundingFrequencyOnDay) &&
                Objects.equals(this.isCompoundingToBePostedAsTransaction, loanProductInterestRecalculationDetails.isCompoundingToBePostedAsTransaction) &&
                Objects.equals(this.arrearsBasedOnOriginalSchedule, loanProductInterestRecalculationDetails.arrearsBasedOnOriginalSchedule) &&
                Objects.equals(this._new, loanProductInterestRecalculationDetails._new);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, interestRecalculationCompoundingMethod, rescheduleStrategyMethod, restFrequencyType, restInterval, restFrequencyNthDay, restFrequencyWeekday, restFrequencyOnDay, compoundingFrequencyType, compoundingInterval, compoundingFrequencyNthDay, compoundingFrequencyWeekday, compoundingFrequencyOnDay, isCompoundingToBePostedAsTransaction, arrearsBasedOnOriginalSchedule, _new);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoanProductInterestRecalculationDetails {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    interestRecalculationCompoundingMethod: ").append(toIndentedString(interestRecalculationCompoundingMethod)).append("\n");
        sb.append("    rescheduleStrategyMethod: ").append(toIndentedString(rescheduleStrategyMethod)).append("\n");
        sb.append("    restFrequencyType: ").append(toIndentedString(restFrequencyType)).append("\n");
        sb.append("    restInterval: ").append(toIndentedString(restInterval)).append("\n");
        sb.append("    restFrequencyNthDay: ").append(toIndentedString(restFrequencyNthDay)).append("\n");
        sb.append("    restFrequencyWeekday: ").append(toIndentedString(restFrequencyWeekday)).append("\n");
        sb.append("    restFrequencyOnDay: ").append(toIndentedString(restFrequencyOnDay)).append("\n");
        sb.append("    compoundingFrequencyType: ").append(toIndentedString(compoundingFrequencyType)).append("\n");
        sb.append("    compoundingInterval: ").append(toIndentedString(compoundingInterval)).append("\n");
        sb.append("    compoundingFrequencyNthDay: ").append(toIndentedString(compoundingFrequencyNthDay)).append("\n");
        sb.append("    compoundingFrequencyWeekday: ").append(toIndentedString(compoundingFrequencyWeekday)).append("\n");
        sb.append("    compoundingFrequencyOnDay: ").append(toIndentedString(compoundingFrequencyOnDay)).append("\n");
        sb.append("    isCompoundingToBePostedAsTransaction: ").append(toIndentedString(isCompoundingToBePostedAsTransaction)).append("\n");
        sb.append("    arrearsBasedOnOriginalSchedule: ").append(toIndentedString(arrearsBasedOnOriginalSchedule)).append("\n");
        sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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


    /**
     * Gets or Sets restFrequencyType
     */
    @JsonAdapter(RestFrequencyTypeEnum.Adapter.class)
    public enum RestFrequencyTypeEnum {
        INVALID("INVALID"),

        SAME_AS_REPAYMENT_PERIOD("SAME_AS_REPAYMENT_PERIOD"),

        DAILY("DAILY"),

        WEEKLY("WEEKLY"),

        MONTHLY("MONTHLY");

        private String value;

        RestFrequencyTypeEnum(String value) {
            this.value = value;
        }

        public static RestFrequencyTypeEnum fromValue(String text) {
            for (RestFrequencyTypeEnum b : RestFrequencyTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<RestFrequencyTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RestFrequencyTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RestFrequencyTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RestFrequencyTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or Sets compoundingFrequencyType
     */
    @JsonAdapter(CompoundingFrequencyTypeEnum.Adapter.class)
    public enum CompoundingFrequencyTypeEnum {
        INVALID("INVALID"),

        SAME_AS_REPAYMENT_PERIOD("SAME_AS_REPAYMENT_PERIOD"),

        DAILY("DAILY"),

        WEEKLY("WEEKLY"),

        MONTHLY("MONTHLY");

        private String value;

        CompoundingFrequencyTypeEnum(String value) {
            this.value = value;
        }

        public static CompoundingFrequencyTypeEnum fromValue(String text) {
            for (CompoundingFrequencyTypeEnum b : CompoundingFrequencyTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<CompoundingFrequencyTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CompoundingFrequencyTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CompoundingFrequencyTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CompoundingFrequencyTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

}


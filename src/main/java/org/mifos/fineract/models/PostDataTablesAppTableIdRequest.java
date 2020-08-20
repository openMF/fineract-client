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

import java.util.Objects;

/**
 * PostDataTablesAppTableIdRequest
 */

public class PostDataTablesAppTableIdRequest {
    @SerializedName("BusinessDescription")
    private String businessDescription = null;

    @SerializedName("Comment")
    private String comment = null;

    @SerializedName("Education_cv")
    private String educationCv = null;

    @SerializedName("Gender_cd")
    private Long genderCd = null;

    @SerializedName("HighestRatePaid")
    private Double highestRatePaid = null;

    @SerializedName("NextVisit")
    private String nextVisit = null;

    @SerializedName("YearsinBusiness")
    private Long yearsinBusiness = null;

    @SerializedName("dateFormat")
    private String dateFormat = null;

    @SerializedName("locale")
    private String locale = null;

    public PostDataTablesAppTableIdRequest businessDescription(String businessDescription) {
        this.businessDescription = businessDescription;
        return this;
    }

    /**
     * Get businessDescription
     *
     * @return businessDescription
     **/
    @ApiModelProperty(example = "Livestock sales", value = "")
    public String getBusinessDescription() {
        return businessDescription;
    }

    public void setBusinessDescription(String businessDescription) {
        this.businessDescription = businessDescription;
    }

    public PostDataTablesAppTableIdRequest comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Get comment
     *
     * @return comment
     **/
    @ApiModelProperty(example = "First comment made", value = "")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public PostDataTablesAppTableIdRequest educationCv(String educationCv) {
        this.educationCv = educationCv;
        return this;
    }

    /**
     * Get educationCv
     *
     * @return educationCv
     **/
    @ApiModelProperty(example = "Primary", value = "")
    public String getEducationCv() {
        return educationCv;
    }

    public void setEducationCv(String educationCv) {
        this.educationCv = educationCv;
    }

    public PostDataTablesAppTableIdRequest genderCd(Long genderCd) {
        this.genderCd = genderCd;
        return this;
    }

    /**
     * Get genderCd
     *
     * @return genderCd
     **/
    @ApiModelProperty(example = "6", value = "")
    public Long getGenderCd() {
        return genderCd;
    }

    public void setGenderCd(Long genderCd) {
        this.genderCd = genderCd;
    }

    public PostDataTablesAppTableIdRequest highestRatePaid(Double highestRatePaid) {
        this.highestRatePaid = highestRatePaid;
        return this;
    }

    /**
     * Get highestRatePaid
     *
     * @return highestRatePaid
     **/
    @ApiModelProperty(example = "8.5", value = "")
    public Double getHighestRatePaid() {
        return highestRatePaid;
    }

    public void setHighestRatePaid(Double highestRatePaid) {
        this.highestRatePaid = highestRatePaid;
    }

    public PostDataTablesAppTableIdRequest nextVisit(String nextVisit) {
        this.nextVisit = nextVisit;
        return this;
    }

    /**
     * Get nextVisit
     *
     * @return nextVisit
     **/
    @ApiModelProperty(example = "01 October 2012", value = "")
    public String getNextVisit() {
        return nextVisit;
    }

    public void setNextVisit(String nextVisit) {
        this.nextVisit = nextVisit;
    }

    public PostDataTablesAppTableIdRequest yearsinBusiness(Long yearsinBusiness) {
        this.yearsinBusiness = yearsinBusiness;
        return this;
    }

    /**
     * Get yearsinBusiness
     *
     * @return yearsinBusiness
     **/
    @ApiModelProperty(example = "5", value = "")
    public Long getYearsinBusiness() {
        return yearsinBusiness;
    }

    public void setYearsinBusiness(Long yearsinBusiness) {
        this.yearsinBusiness = yearsinBusiness;
    }

    public PostDataTablesAppTableIdRequest dateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * Get dateFormat
     *
     * @return dateFormat
     **/
    @ApiModelProperty(example = "dd MMMM yyyy", value = "")
    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public PostDataTablesAppTableIdRequest locale(String locale) {
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


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostDataTablesAppTableIdRequest postDataTablesAppTableIdRequest = (PostDataTablesAppTableIdRequest) o;
        return Objects.equals(this.businessDescription, postDataTablesAppTableIdRequest.businessDescription) &&
                Objects.equals(this.comment, postDataTablesAppTableIdRequest.comment) &&
                Objects.equals(this.educationCv, postDataTablesAppTableIdRequest.educationCv) &&
                Objects.equals(this.genderCd, postDataTablesAppTableIdRequest.genderCd) &&
                Objects.equals(this.highestRatePaid, postDataTablesAppTableIdRequest.highestRatePaid) &&
                Objects.equals(this.nextVisit, postDataTablesAppTableIdRequest.nextVisit) &&
                Objects.equals(this.yearsinBusiness, postDataTablesAppTableIdRequest.yearsinBusiness) &&
                Objects.equals(this.dateFormat, postDataTablesAppTableIdRequest.dateFormat) &&
                Objects.equals(this.locale, postDataTablesAppTableIdRequest.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessDescription, comment, educationCv, genderCd, highestRatePaid, nextVisit, yearsinBusiness, dateFormat, locale);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostDataTablesAppTableIdRequest {\n");

        sb.append("    businessDescription: ").append(toIndentedString(businessDescription)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    educationCv: ").append(toIndentedString(educationCv)).append("\n");
        sb.append("    genderCd: ").append(toIndentedString(genderCd)).append("\n");
        sb.append("    highestRatePaid: ").append(toIndentedString(highestRatePaid)).append("\n");
        sb.append("    nextVisit: ").append(toIndentedString(nextVisit)).append("\n");
        sb.append("    yearsinBusiness: ").append(toIndentedString(yearsinBusiness)).append("\n");
        sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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


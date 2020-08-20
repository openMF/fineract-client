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
import org.joda.time.LocalDate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * InteropQuoteRequestData
 */

public class InteropQuoteRequestData {
    @SerializedName("transactionCode")
    private String transactionCode = null;

    @SerializedName("requestCode")
    private String requestCode = null;

    @SerializedName("accountId")
    private String accountId = null;

    @SerializedName("amount")
    private MoneyData amount = null;
    @SerializedName("transactionRole")
    private TransactionRoleEnum transactionRole = null;
    @SerializedName("transactionType")
    private InteropTransactionTypeData transactionType = null;
    @SerializedName("note")
    private String note = null;
    @SerializedName("geoCode")
    private GeoCodeData geoCode = null;
    @SerializedName("expiration")
    private LocalDateTime expiration = null;
    @SerializedName("extensionList")
    private List<ExtensionData> extensionList = null;
    @SerializedName("quoteCode")
    private String quoteCode = null;
    @SerializedName("amountType")
    private AmountTypeEnum amountType = null;
    @SerializedName("fees")
    private MoneyData fees = null;
    @SerializedName("expirationLocalDate")
    private LocalDate expirationLocalDate = null;

    public InteropQuoteRequestData transactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
        return this;
    }

    /**
     * Get transactionCode
     *
     * @return transactionCode
     **/
    @ApiModelProperty(required = true, value = "")
    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public InteropQuoteRequestData requestCode(String requestCode) {
        this.requestCode = requestCode;
        return this;
    }

    /**
     * Get requestCode
     *
     * @return requestCode
     **/
    @ApiModelProperty(value = "")
    public String getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(String requestCode) {
        this.requestCode = requestCode;
    }

    public InteropQuoteRequestData accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     *
     * @return accountId
     **/
    @ApiModelProperty(required = true, value = "")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public InteropQuoteRequestData amount(MoneyData amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @ApiModelProperty(required = true, value = "")
    public MoneyData getAmount() {
        return amount;
    }

    public void setAmount(MoneyData amount) {
        this.amount = amount;
    }

    public InteropQuoteRequestData transactionRole(TransactionRoleEnum transactionRole) {
        this.transactionRole = transactionRole;
        return this;
    }

    /**
     * Get transactionRole
     *
     * @return transactionRole
     **/
    @ApiModelProperty(required = true, value = "")
    public TransactionRoleEnum getTransactionRole() {
        return transactionRole;
    }

    public void setTransactionRole(TransactionRoleEnum transactionRole) {
        this.transactionRole = transactionRole;
    }

    public InteropQuoteRequestData transactionType(InteropTransactionTypeData transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Get transactionType
     *
     * @return transactionType
     **/
    @ApiModelProperty(value = "")
    public InteropTransactionTypeData getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(InteropTransactionTypeData transactionType) {
        this.transactionType = transactionType;
    }

    public InteropQuoteRequestData note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Get note
     *
     * @return note
     **/
    @ApiModelProperty(value = "")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public InteropQuoteRequestData geoCode(GeoCodeData geoCode) {
        this.geoCode = geoCode;
        return this;
    }

    /**
     * Get geoCode
     *
     * @return geoCode
     **/
    @ApiModelProperty(value = "")
    public GeoCodeData getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(GeoCodeData geoCode) {
        this.geoCode = geoCode;
    }

    public InteropQuoteRequestData expiration(LocalDateTime expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * Get expiration
     *
     * @return expiration
     **/
    @ApiModelProperty(value = "")
    public LocalDateTime getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDateTime expiration) {
        this.expiration = expiration;
    }

    public InteropQuoteRequestData extensionList(List<ExtensionData> extensionList) {
        this.extensionList = extensionList;
        return this;
    }

    public InteropQuoteRequestData addExtensionListItem(ExtensionData extensionListItem) {
        if (this.extensionList == null) {
            this.extensionList = new ArrayList<ExtensionData>();
        }
        this.extensionList.add(extensionListItem);
        return this;
    }

    /**
     * Get extensionList
     *
     * @return extensionList
     **/
    @ApiModelProperty(value = "")
    public List<ExtensionData> getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(List<ExtensionData> extensionList) {
        this.extensionList = extensionList;
    }

    public InteropQuoteRequestData quoteCode(String quoteCode) {
        this.quoteCode = quoteCode;
        return this;
    }

    /**
     * Get quoteCode
     *
     * @return quoteCode
     **/
    @ApiModelProperty(required = true, value = "")
    public String getQuoteCode() {
        return quoteCode;
    }

    public void setQuoteCode(String quoteCode) {
        this.quoteCode = quoteCode;
    }

    public InteropQuoteRequestData amountType(AmountTypeEnum amountType) {
        this.amountType = amountType;
        return this;
    }

    /**
     * Get amountType
     *
     * @return amountType
     **/
    @ApiModelProperty(required = true, value = "")
    public AmountTypeEnum getAmountType() {
        return amountType;
    }

    public void setAmountType(AmountTypeEnum amountType) {
        this.amountType = amountType;
    }

    public InteropQuoteRequestData fees(MoneyData fees) {
        this.fees = fees;
        return this;
    }

    /**
     * Get fees
     *
     * @return fees
     **/
    @ApiModelProperty(value = "")
    public MoneyData getFees() {
        return fees;
    }

    public void setFees(MoneyData fees) {
        this.fees = fees;
    }

    public InteropQuoteRequestData expirationLocalDate(LocalDate expirationLocalDate) {
        this.expirationLocalDate = expirationLocalDate;
        return this;
    }

    /**
     * Get expirationLocalDate
     *
     * @return expirationLocalDate
     **/
    @ApiModelProperty(value = "")
    public LocalDate getExpirationLocalDate() {
        return expirationLocalDate;
    }

    public void setExpirationLocalDate(LocalDate expirationLocalDate) {
        this.expirationLocalDate = expirationLocalDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InteropQuoteRequestData interopQuoteRequestData = (InteropQuoteRequestData) o;
        return Objects.equals(this.transactionCode, interopQuoteRequestData.transactionCode) &&
                Objects.equals(this.requestCode, interopQuoteRequestData.requestCode) &&
                Objects.equals(this.accountId, interopQuoteRequestData.accountId) &&
                Objects.equals(this.amount, interopQuoteRequestData.amount) &&
                Objects.equals(this.transactionRole, interopQuoteRequestData.transactionRole) &&
                Objects.equals(this.transactionType, interopQuoteRequestData.transactionType) &&
                Objects.equals(this.note, interopQuoteRequestData.note) &&
                Objects.equals(this.geoCode, interopQuoteRequestData.geoCode) &&
                Objects.equals(this.expiration, interopQuoteRequestData.expiration) &&
                Objects.equals(this.extensionList, interopQuoteRequestData.extensionList) &&
                Objects.equals(this.quoteCode, interopQuoteRequestData.quoteCode) &&
                Objects.equals(this.amountType, interopQuoteRequestData.amountType) &&
                Objects.equals(this.fees, interopQuoteRequestData.fees) &&
                Objects.equals(this.expirationLocalDate, interopQuoteRequestData.expirationLocalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionCode, requestCode, accountId, amount, transactionRole, transactionType, note, geoCode, expiration, extensionList, quoteCode, amountType, fees, expirationLocalDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteropQuoteRequestData {\n");

        sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
        sb.append("    requestCode: ").append(toIndentedString(requestCode)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    transactionRole: ").append(toIndentedString(transactionRole)).append("\n");
        sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    geoCode: ").append(toIndentedString(geoCode)).append("\n");
        sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
        sb.append("    extensionList: ").append(toIndentedString(extensionList)).append("\n");
        sb.append("    quoteCode: ").append(toIndentedString(quoteCode)).append("\n");
        sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
        sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
        sb.append("    expirationLocalDate: ").append(toIndentedString(expirationLocalDate)).append("\n");
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
     * Gets or Sets transactionRole
     */
    @JsonAdapter(TransactionRoleEnum.Adapter.class)
    public enum TransactionRoleEnum {
        PAYER("PAYER"),

        PAYEE("PAYEE");

        private String value;

        TransactionRoleEnum(String value) {
            this.value = value;
        }

        public static TransactionRoleEnum fromValue(String text) {
            for (TransactionRoleEnum b : TransactionRoleEnum.values()) {
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

        public static class Adapter extends TypeAdapter<TransactionRoleEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TransactionRoleEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TransactionRoleEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TransactionRoleEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or Sets amountType
     */
    @JsonAdapter(AmountTypeEnum.Adapter.class)
    public enum AmountTypeEnum {
        SEND("SEND"),

        RECEIVE("RECEIVE");

        private String value;

        AmountTypeEnum(String value) {
            this.value = value;
        }

        public static AmountTypeEnum fromValue(String text) {
            for (AmountTypeEnum b : AmountTypeEnum.values()) {
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

        public static class Adapter extends TypeAdapter<AmountTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AmountTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AmountTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AmountTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

}


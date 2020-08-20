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
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Client
 */

public class Client {
    @SerializedName("id")
    private Long id = null;

    @SerializedName("office")
    private Office office = null;

    @SerializedName("transferToOffice")
    private Office transferToOffice = null;

    @SerializedName("image")
    private Image image = null;

    @SerializedName("status")
    private Integer status = null;

    @SerializedName("firstname")
    private String firstname = null;

    @SerializedName("middlename")
    private String middlename = null;

    @SerializedName("lastname")
    private String lastname = null;

    @SerializedName("displayName")
    private String displayName = null;

    @SerializedName("externalId")
    private String externalId = null;

    @SerializedName("staff")
    private Staff staff = null;

    @SerializedName("groups")
    private List<Group> groups = null;

    @SerializedName("accountNumberRequiresAutoGeneration")
    private Boolean accountNumberRequiresAutoGeneration = null;

    @SerializedName("closureDate")
    private LocalDate closureDate = null;

    @SerializedName("withdrawalDate")
    private LocalDate withdrawalDate = null;

    @SerializedName("submittedOnDate")
    private LocalDate submittedOnDate = null;

    @SerializedName("legalForm")
    private Integer legalForm = null;

    @SerializedName("reopenedDate")
    private LocalDate reopenedDate = null;

    @SerializedName("proposedTransferDate")
    private DateTime proposedTransferDate = null;

    @SerializedName("notActive")
    private Boolean notActive = null;

    @SerializedName("transferOnHold")
    private Boolean transferOnHold = null;

    @SerializedName("transferInProgress")
    private Boolean transferInProgress = null;

    @SerializedName("activationLocalDate")
    private LocalDate activationLocalDate = null;

    @SerializedName("officeJoiningLocalDate")
    private LocalDate officeJoiningLocalDate = null;

    @SerializedName("withdrawn")
    private Boolean withdrawn = null;

    @SerializedName("notPending")
    private Boolean notPending = null;

    @SerializedName("transferInProgressOrOnHold")
    private Boolean transferInProgressOrOnHold = null;

    @SerializedName("notStaff")
    private Boolean notStaff = null;

    @SerializedName("rejectedDate")
    private LocalDate rejectedDate = null;

    @SerializedName("active")
    private Boolean active = null;

    @SerializedName("rejected")
    private Boolean rejected = null;

    @SerializedName("pending")
    private Boolean pending = null;

    @SerializedName("closed")
    private Boolean closed = null;

    @SerializedName("new")
    private Boolean _new = null;

    public Client id(Long id) {
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

    public Client office(Office office) {
        this.office = office;
        return this;
    }

    /**
     * Get office
     *
     * @return office
     **/
    @ApiModelProperty(value = "")
    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public Client transferToOffice(Office transferToOffice) {
        this.transferToOffice = transferToOffice;
        return this;
    }

    /**
     * Get transferToOffice
     *
     * @return transferToOffice
     **/
    @ApiModelProperty(value = "")
    public Office getTransferToOffice() {
        return transferToOffice;
    }

    public void setTransferToOffice(Office transferToOffice) {
        this.transferToOffice = transferToOffice;
    }

    public Client image(Image image) {
        this.image = image;
        return this;
    }

    /**
     * Get image
     *
     * @return image
     **/
    @ApiModelProperty(value = "")
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Client status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @ApiModelProperty(value = "")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Client firstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    /**
     * Get firstname
     *
     * @return firstname
     **/
    @ApiModelProperty(value = "")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Client middlename(String middlename) {
        this.middlename = middlename;
        return this;
    }

    /**
     * Get middlename
     *
     * @return middlename
     **/
    @ApiModelProperty(value = "")
    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public Client lastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    /**
     * Get lastname
     *
     * @return lastname
     **/
    @ApiModelProperty(value = "")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Client displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get displayName
     *
     * @return displayName
     **/
    @ApiModelProperty(value = "")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Client externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Get externalId
     *
     * @return externalId
     **/
    @ApiModelProperty(value = "")
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Client staff(Staff staff) {
        this.staff = staff;
        return this;
    }

    /**
     * Get staff
     *
     * @return staff
     **/
    @ApiModelProperty(value = "")
    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Client groups(List<Group> groups) {
        this.groups = groups;
        return this;
    }

    public Client addGroupsItem(Group groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<Group>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    /**
     * Get groups
     *
     * @return groups
     **/
    @ApiModelProperty(value = "")
    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public Client accountNumberRequiresAutoGeneration(Boolean accountNumberRequiresAutoGeneration) {
        this.accountNumberRequiresAutoGeneration = accountNumberRequiresAutoGeneration;
        return this;
    }

    /**
     * Get accountNumberRequiresAutoGeneration
     *
     * @return accountNumberRequiresAutoGeneration
     **/
    @ApiModelProperty(value = "")
    public Boolean isAccountNumberRequiresAutoGeneration() {
        return accountNumberRequiresAutoGeneration;
    }

    public void setAccountNumberRequiresAutoGeneration(Boolean accountNumberRequiresAutoGeneration) {
        this.accountNumberRequiresAutoGeneration = accountNumberRequiresAutoGeneration;
    }

    public Client closureDate(LocalDate closureDate) {
        this.closureDate = closureDate;
        return this;
    }

    /**
     * Get closureDate
     *
     * @return closureDate
     **/
    @ApiModelProperty(value = "")
    public LocalDate getClosureDate() {
        return closureDate;
    }

    public void setClosureDate(LocalDate closureDate) {
        this.closureDate = closureDate;
    }

    public Client withdrawalDate(LocalDate withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
        return this;
    }

    /**
     * Get withdrawalDate
     *
     * @return withdrawalDate
     **/
    @ApiModelProperty(value = "")
    public LocalDate getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(LocalDate withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }

    public Client submittedOnDate(LocalDate submittedOnDate) {
        this.submittedOnDate = submittedOnDate;
        return this;
    }

    /**
     * Get submittedOnDate
     *
     * @return submittedOnDate
     **/
    @ApiModelProperty(value = "")
    public LocalDate getSubmittedOnDate() {
        return submittedOnDate;
    }

    public void setSubmittedOnDate(LocalDate submittedOnDate) {
        this.submittedOnDate = submittedOnDate;
    }

    public Client legalForm(Integer legalForm) {
        this.legalForm = legalForm;
        return this;
    }

    /**
     * Get legalForm
     *
     * @return legalForm
     **/
    @ApiModelProperty(value = "")
    public Integer getLegalForm() {
        return legalForm;
    }

    public void setLegalForm(Integer legalForm) {
        this.legalForm = legalForm;
    }

    public Client reopenedDate(LocalDate reopenedDate) {
        this.reopenedDate = reopenedDate;
        return this;
    }

    /**
     * Get reopenedDate
     *
     * @return reopenedDate
     **/
    @ApiModelProperty(value = "")
    public LocalDate getReopenedDate() {
        return reopenedDate;
    }

    public void setReopenedDate(LocalDate reopenedDate) {
        this.reopenedDate = reopenedDate;
    }

    public Client proposedTransferDate(DateTime proposedTransferDate) {
        this.proposedTransferDate = proposedTransferDate;
        return this;
    }

    /**
     * Get proposedTransferDate
     *
     * @return proposedTransferDate
     **/
    @ApiModelProperty(value = "")
    public DateTime getProposedTransferDate() {
        return proposedTransferDate;
    }

    public void setProposedTransferDate(DateTime proposedTransferDate) {
        this.proposedTransferDate = proposedTransferDate;
    }

    public Client notActive(Boolean notActive) {
        this.notActive = notActive;
        return this;
    }

    /**
     * Get notActive
     *
     * @return notActive
     **/
    @ApiModelProperty(value = "")
    public Boolean isNotActive() {
        return notActive;
    }

    public void setNotActive(Boolean notActive) {
        this.notActive = notActive;
    }

    public Client transferOnHold(Boolean transferOnHold) {
        this.transferOnHold = transferOnHold;
        return this;
    }

    /**
     * Get transferOnHold
     *
     * @return transferOnHold
     **/
    @ApiModelProperty(value = "")
    public Boolean isTransferOnHold() {
        return transferOnHold;
    }

    public void setTransferOnHold(Boolean transferOnHold) {
        this.transferOnHold = transferOnHold;
    }

    public Client transferInProgress(Boolean transferInProgress) {
        this.transferInProgress = transferInProgress;
        return this;
    }

    /**
     * Get transferInProgress
     *
     * @return transferInProgress
     **/
    @ApiModelProperty(value = "")
    public Boolean isTransferInProgress() {
        return transferInProgress;
    }

    public void setTransferInProgress(Boolean transferInProgress) {
        this.transferInProgress = transferInProgress;
    }

    public Client activationLocalDate(LocalDate activationLocalDate) {
        this.activationLocalDate = activationLocalDate;
        return this;
    }

    /**
     * Get activationLocalDate
     *
     * @return activationLocalDate
     **/
    @ApiModelProperty(value = "")
    public LocalDate getActivationLocalDate() {
        return activationLocalDate;
    }

    public void setActivationLocalDate(LocalDate activationLocalDate) {
        this.activationLocalDate = activationLocalDate;
    }

    public Client officeJoiningLocalDate(LocalDate officeJoiningLocalDate) {
        this.officeJoiningLocalDate = officeJoiningLocalDate;
        return this;
    }

    /**
     * Get officeJoiningLocalDate
     *
     * @return officeJoiningLocalDate
     **/
    @ApiModelProperty(value = "")
    public LocalDate getOfficeJoiningLocalDate() {
        return officeJoiningLocalDate;
    }

    public void setOfficeJoiningLocalDate(LocalDate officeJoiningLocalDate) {
        this.officeJoiningLocalDate = officeJoiningLocalDate;
    }

    public Client withdrawn(Boolean withdrawn) {
        this.withdrawn = withdrawn;
        return this;
    }

    /**
     * Get withdrawn
     *
     * @return withdrawn
     **/
    @ApiModelProperty(value = "")
    public Boolean isWithdrawn() {
        return withdrawn;
    }

    public void setWithdrawn(Boolean withdrawn) {
        this.withdrawn = withdrawn;
    }

    public Client notPending(Boolean notPending) {
        this.notPending = notPending;
        return this;
    }

    /**
     * Get notPending
     *
     * @return notPending
     **/
    @ApiModelProperty(value = "")
    public Boolean isNotPending() {
        return notPending;
    }

    public void setNotPending(Boolean notPending) {
        this.notPending = notPending;
    }

    public Client transferInProgressOrOnHold(Boolean transferInProgressOrOnHold) {
        this.transferInProgressOrOnHold = transferInProgressOrOnHold;
        return this;
    }

    /**
     * Get transferInProgressOrOnHold
     *
     * @return transferInProgressOrOnHold
     **/
    @ApiModelProperty(value = "")
    public Boolean isTransferInProgressOrOnHold() {
        return transferInProgressOrOnHold;
    }

    public void setTransferInProgressOrOnHold(Boolean transferInProgressOrOnHold) {
        this.transferInProgressOrOnHold = transferInProgressOrOnHold;
    }

    public Client notStaff(Boolean notStaff) {
        this.notStaff = notStaff;
        return this;
    }

    /**
     * Get notStaff
     *
     * @return notStaff
     **/
    @ApiModelProperty(value = "")
    public Boolean isNotStaff() {
        return notStaff;
    }

    public void setNotStaff(Boolean notStaff) {
        this.notStaff = notStaff;
    }

    public Client rejectedDate(LocalDate rejectedDate) {
        this.rejectedDate = rejectedDate;
        return this;
    }

    /**
     * Get rejectedDate
     *
     * @return rejectedDate
     **/
    @ApiModelProperty(value = "")
    public LocalDate getRejectedDate() {
        return rejectedDate;
    }

    public void setRejectedDate(LocalDate rejectedDate) {
        this.rejectedDate = rejectedDate;
    }

    public Client active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get active
     *
     * @return active
     **/
    @ApiModelProperty(value = "")
    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Client rejected(Boolean rejected) {
        this.rejected = rejected;
        return this;
    }

    /**
     * Get rejected
     *
     * @return rejected
     **/
    @ApiModelProperty(value = "")
    public Boolean isRejected() {
        return rejected;
    }

    public void setRejected(Boolean rejected) {
        this.rejected = rejected;
    }

    public Client pending(Boolean pending) {
        this.pending = pending;
        return this;
    }

    /**
     * Get pending
     *
     * @return pending
     **/
    @ApiModelProperty(value = "")
    public Boolean isPending() {
        return pending;
    }

    public void setPending(Boolean pending) {
        this.pending = pending;
    }

    public Client closed(Boolean closed) {
        this.closed = closed;
        return this;
    }

    /**
     * Get closed
     *
     * @return closed
     **/
    @ApiModelProperty(value = "")
    public Boolean isClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Client _new(Boolean _new) {
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
        Client client = (Client) o;
        return Objects.equals(this.id, client.id) &&
                Objects.equals(this.office, client.office) &&
                Objects.equals(this.transferToOffice, client.transferToOffice) &&
                Objects.equals(this.image, client.image) &&
                Objects.equals(this.status, client.status) &&
                Objects.equals(this.firstname, client.firstname) &&
                Objects.equals(this.middlename, client.middlename) &&
                Objects.equals(this.lastname, client.lastname) &&
                Objects.equals(this.displayName, client.displayName) &&
                Objects.equals(this.externalId, client.externalId) &&
                Objects.equals(this.staff, client.staff) &&
                Objects.equals(this.groups, client.groups) &&
                Objects.equals(this.accountNumberRequiresAutoGeneration, client.accountNumberRequiresAutoGeneration) &&
                Objects.equals(this.closureDate, client.closureDate) &&
                Objects.equals(this.withdrawalDate, client.withdrawalDate) &&
                Objects.equals(this.submittedOnDate, client.submittedOnDate) &&
                Objects.equals(this.legalForm, client.legalForm) &&
                Objects.equals(this.reopenedDate, client.reopenedDate) &&
                Objects.equals(this.proposedTransferDate, client.proposedTransferDate) &&
                Objects.equals(this.notActive, client.notActive) &&
                Objects.equals(this.transferOnHold, client.transferOnHold) &&
                Objects.equals(this.transferInProgress, client.transferInProgress) &&
                Objects.equals(this.activationLocalDate, client.activationLocalDate) &&
                Objects.equals(this.officeJoiningLocalDate, client.officeJoiningLocalDate) &&
                Objects.equals(this.withdrawn, client.withdrawn) &&
                Objects.equals(this.notPending, client.notPending) &&
                Objects.equals(this.transferInProgressOrOnHold, client.transferInProgressOrOnHold) &&
                Objects.equals(this.notStaff, client.notStaff) &&
                Objects.equals(this.rejectedDate, client.rejectedDate) &&
                Objects.equals(this.active, client.active) &&
                Objects.equals(this.rejected, client.rejected) &&
                Objects.equals(this.pending, client.pending) &&
                Objects.equals(this.closed, client.closed) &&
                Objects.equals(this._new, client._new);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, office, transferToOffice, image, status, firstname, middlename, lastname, displayName, externalId, staff, groups, accountNumberRequiresAutoGeneration, closureDate, withdrawalDate, submittedOnDate, legalForm, reopenedDate, proposedTransferDate, notActive, transferOnHold, transferInProgress, activationLocalDate, officeJoiningLocalDate, withdrawn, notPending, transferInProgressOrOnHold, notStaff, rejectedDate, active, rejected, pending, closed, _new);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Client {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    office: ").append(toIndentedString(office)).append("\n");
        sb.append("    transferToOffice: ").append(toIndentedString(transferToOffice)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
        sb.append("    middlename: ").append(toIndentedString(middlename)).append("\n");
        sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    staff: ").append(toIndentedString(staff)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    accountNumberRequiresAutoGeneration: ").append(toIndentedString(accountNumberRequiresAutoGeneration)).append("\n");
        sb.append("    closureDate: ").append(toIndentedString(closureDate)).append("\n");
        sb.append("    withdrawalDate: ").append(toIndentedString(withdrawalDate)).append("\n");
        sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
        sb.append("    legalForm: ").append(toIndentedString(legalForm)).append("\n");
        sb.append("    reopenedDate: ").append(toIndentedString(reopenedDate)).append("\n");
        sb.append("    proposedTransferDate: ").append(toIndentedString(proposedTransferDate)).append("\n");
        sb.append("    notActive: ").append(toIndentedString(notActive)).append("\n");
        sb.append("    transferOnHold: ").append(toIndentedString(transferOnHold)).append("\n");
        sb.append("    transferInProgress: ").append(toIndentedString(transferInProgress)).append("\n");
        sb.append("    activationLocalDate: ").append(toIndentedString(activationLocalDate)).append("\n");
        sb.append("    officeJoiningLocalDate: ").append(toIndentedString(officeJoiningLocalDate)).append("\n");
        sb.append("    withdrawn: ").append(toIndentedString(withdrawn)).append("\n");
        sb.append("    notPending: ").append(toIndentedString(notPending)).append("\n");
        sb.append("    transferInProgressOrOnHold: ").append(toIndentedString(transferInProgressOrOnHold)).append("\n");
        sb.append("    notStaff: ").append(toIndentedString(notStaff)).append("\n");
        sb.append("    rejectedDate: ").append(toIndentedString(rejectedDate)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
        sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
        sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
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

}


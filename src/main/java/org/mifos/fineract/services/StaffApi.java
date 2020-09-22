package org.mifos.fineract.services;

import okhttp3.MultipartBody;
import org.mifos.fineract.models.*;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface StaffApi {
    /**
     * Create a staff member
     * Creates a staff member.  Mandatory Fields:  officeId, firstname, lastname  Optional Fields:  isLoanOfficer, isActive
     *
     * @param body body (required)
     * @return Observable&lt;PostStaffResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("staff")
    Observable<PostStaffResponse> createStaff(
            @retrofit2.http.Body PostStaffRequest body
    );

    /**
     * @param officeId   (optional)
     * @param dateFormat (optional)
     * @return Observable&lt;Void&gt;
     */
    @GET("staff/downloadtemplate")
    Observable<Void> getStaffTemplate(
            @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("dateFormat") String dateFormat
    );

    /**
     * @param file       (optional)
     * @param locale     (optional)
     * @param dateFormat (optional)
     * @return Observable&lt;String&gt;
     */
    @retrofit2.http.Multipart
    @POST("staff/uploadtemplate")
    Observable<String> postStaffTemplate(
            @retrofit2.http.Part MultipartBody.Part file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
    );

    /**
     * Retrieve a Staff Member
     * Returns the details of a Staff Member.  Example Requests:  staff/1
     *
     * @param staffId staffId (required)
     * @return Observable&lt;GetStaffResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("staff/{staffId}")
    Observable<GetStaffResponse> retreiveStaff(
            @retrofit2.http.Path("staffId") Long staffId
    );

    /**
     * Retrieve Staff
     * Returns the list of staff members.  Example Requests:  staff     Retrieve a Staff by status  Returns the details of a Staff based on status.  By default it Returns all the ACTIVE Staff.  If status&#x3D;INACTIVE, then it returns all INACTIVE Staff.  and for status&#x3D;ALL, it Returns both ACTIVE and INACTIVE Staff.  Example Requests:  staff?status&#x3D;active
     *
     * @param sqlSearch              sqlSearch (optional)
     * @param officeId               officeId (optional)
     * @param staffInOfficeHierarchy staffInOfficeHierarchy (optional, default to false)
     * @param loanOfficersOnly       loanOfficersOnly (optional, default to false)
     * @param status                 status (optional, default to active)
     * @return Observable&lt;GetStaffResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("staff")
    Observable<GetStaffResponse> retrieveStaff(
            @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffInOfficeHierarchy") Boolean staffInOfficeHierarchy, @retrofit2.http.Query("loanOfficersOnly") Boolean loanOfficersOnly, @retrofit2.http.Query("status") String status
    );

    /**
     * Update a Staff Member
     * Updates the details of a staff member.
     *
     * @param staffId staffId (required)
     * @param body    body (required)
     * @return Observable&lt;PutStaffResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("staff/{staffId}")
    Observable<PutStaffResponse> updateStaff(
            @retrofit2.http.Path("staffId") Long staffId, @retrofit2.http.Body PutStaffRequest body
    );

}

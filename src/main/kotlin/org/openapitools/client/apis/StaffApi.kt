package org.openapitools.client.apis

import okhttp3.MultipartBody
import org.openapitools.client.models.CreateStaffResponse
import org.openapitools.client.models.PostStaffRequest
import org.openapitools.client.models.PutStaffRequest
import org.openapitools.client.models.RetrieveOneResponse
import org.openapitools.client.models.UpdateStaffResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface StaffApi {
    /**
     * Create a staff member
     * Creates a staff member.  Mandatory Fields:  officeId, firstname, lastname  Optional Fields:  isLoanOfficer, isActive
     * Responses:
     *  - 200: OK
     *
     * @param postStaffRequest
     * @return [CreateStaffResponse]
     */
    @POST("v1/staff")
    suspend fun create3(@Body postStaffRequest: PostStaffRequest): CreateStaffResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/staff/downloadtemplate")
    suspend fun getTemplate1(
        @Query("officeId") officeId: Long? = null,
        @Query("dateFormat") dateFormat: String? = null
    ): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/staff/uploadtemplate")
    suspend fun postTemplate(
        @Part("dateFormat") dateFormat: String? = null,
        @Part("locale") locale: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
    ): String

    /**
     * Retrieve Staff
     * Returns the list of staff members.  Example Requests:  staff     Retrieve a Staff by status  Returns the details of a Staff based on status.  By default it Returns all the ACTIVE Staff.  If status&#x3D;INACTIVE, then it returns all INACTIVE Staff.  and for status&#x3D;ALL, it Returns both ACTIVE and INACTIVE Staff.  Example Requests:  staff?status&#x3D;active
     * Responses:
     *  - 200: OK
     *
     * @param officeId officeId (optional)
     * @param staffInOfficeHierarchy staffInOfficeHierarchy (optional, default to false)
     * @param loanOfficersOnly loanOfficersOnly (optional, default to false)
     * @param status status (optional, default to "active")
     * @return [kotlin.collections.List<RetrieveOneResponse]
     */
    @GET("v1/staff")
    suspend fun retrieveAll16(
        @Query("officeId") officeId: Long? = null,
        @Query("staffInOfficeHierarchy") staffInOfficeHierarchy: Boolean? = false,
        @Query("loanOfficersOnly") loanOfficersOnly: Boolean? = false,
        @Query("status") status: String? = "active"
    ): List<RetrieveOneResponse>

    /**
     * Retrieve a Staff Member
     * Returns the details of a Staff Member.  Example Requests:  staff/1
     * Responses:
     *  - 200: OK
     *
     * @param staffId staffId
     * @return [RetrieveOneResponse]
     */
    @GET("v1/staff/{staffId}")
    suspend fun retrieveOne8(@Path("staffId") staffId: Long): RetrieveOneResponse

    /**
     * Update a Staff Member
     * Updates the details of a staff member.
     * Responses:
     *  - 200: OK
     *
     * @param staffId staffId
     * @param putStaffRequest
     * @return [UpdateStaffResponse]
     */
    @PUT("v1/staff/{staffId}")
    suspend fun update7(
        @Path("staffId") staffId: Long,
        @Body putStaffRequest: PutStaffRequest
    ): UpdateStaffResponse

}

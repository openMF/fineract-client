package org.openapitools.client.apis

import okhttp3.MultipartBody
import org.openapitools.client.models.DeleteCentersCenterIdResponse
import org.openapitools.client.models.GetCentersCenterIdAccountsResponse
import org.openapitools.client.models.GetCentersCenterIdResponse
import org.openapitools.client.models.GetCentersResponse
import org.openapitools.client.models.GetCentersTemplateResponse
import org.openapitools.client.models.PostCentersCenterIdRequest
import org.openapitools.client.models.PostCentersCenterIdResponse
import org.openapitools.client.models.PostCentersRequest
import org.openapitools.client.models.PostCentersResponse
import org.openapitools.client.models.PutCentersCenterIdRequest
import org.openapitools.client.models.PutCentersCenterIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface CentersApi {
    /**
     * Activate a Center | Generate Collection Sheet | Save Collection Sheet | Close a Center | Associate Groups | Disassociate Groups
     * Activate a Center:  Centers can be created in a Pending state. This API exists to enable center activation. If the center happens to be already active, this API will result in an error.  Close a Center:  Centers can be closed if they don&#39;t have any non-closed groups or saving accounts. If the Center has any active groups or savings accounts, this API will result in an error.  Associate Groups:  This API allows associating existing groups to a center. The groups are listed from the office to which the center is associated. If group(s) is already associated with a center, this API will result in an error.  Disassociate Groups:  This API allows to disassociate groups from a center.  Generate Collection Sheet:  This Api retrieves repayment details of all jlg loans under a center as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of JLG loans for a center on a given meeting date.  Showing Request/Response for Close a Center
     * Responses:
     *  - 200: OK
     *
     * @param centerId centerId
     * @param postCentersCenterIdRequest
     * @param command command (optional)
     * @return [PostCentersCenterIdResponse]
     */
    @POST("v1/centers/{centerId}")
    suspend fun activate2(
        @Path("centerId") centerId: Long,
        @Body postCentersCenterIdRequest: PostCentersCenterIdRequest,
        @Query("command") command: String? = null
    ): PostCentersCenterIdResponse

    /**
     * Create a Center
     * Creates a Center  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, groupMembers
     * Responses:
     *  - 200: OK
     *
     * @param postCentersRequest
     * @return [PostCentersResponse]
     */
    @POST("v1/centers")
    suspend fun create7(@Body postCentersRequest: PostCentersRequest): PostCentersResponse

    /**
     * Delete a Center
     * A Center can be deleted if it is in pending state and has no association - groups, loans or savings
     * Responses:
     *  - 200: OK
     *
     * @param centerId centerId
     * @return [DeleteCentersCenterIdResponse]
     */
    @DELETE("v1/centers/{centerId}")
    suspend fun delete11(@Path("centerId") centerId: Long): DeleteCentersCenterIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param staffId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/centers/downloadtemplate")
    suspend fun getCentersTemplate(
        @Query("officeId") officeId: Long? = null,
        @Query("staffId") staffId: Long? = null,
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
    @POST("v1/centers/uploadtemplate")
    suspend fun postCentersTemplate(
        @Part("dateFormat") dateFormat: String? = null,
        @Part("locale") locale: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
    ): String

    /**
     * List Centers
     * The default implementation supports pagination and sorting with the default pagination size set to 200 records. The parameter limit with description -1 will return all entries.  Example Requests:    centers    centers?fields&#x3D;name,officeName,joinedDate    centers?offset&#x3D;10&amp;limit&#x3D;50    centers?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC
     * Responses:
     *  - 200: OK
     *
     * @param officeId officeId (optional)
     * @param staffId staffId (optional)
     * @param externalId externalId (optional)
     * @param name name (optional)
     * @param underHierarchy underHierarchy (optional)
     * @param paged paged (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @param meetingDate meetingDate (optional)
     * @param dateFormat dateFormat (optional)
     * @param locale locale (optional)
     * @return [GetCentersResponse]
     */
    @GET("v1/centers")
    suspend fun retrieveAll23(
        @Query("officeId") officeId: Long? = null,
        @Query("staffId") staffId: Long? = null,
        @Query("externalId") externalId: String? = null,
        @Query("name") name: String? = null,
        @Query("underHierarchy") underHierarchy: String? = null,
        @Query("paged") paged: Boolean? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("meetingDate") meetingDate: Any? = null,
        @Query("dateFormat") dateFormat: String? = null,
        @Query("locale") locale: String? = null
    ): GetCentersResponse

    /**
     * Retrieve Center accounts overview
     * An example of how a savings summary for a Center can be provided. This is requested in a specific use case of the reference application.  It is quite reasonable to add resources like this to simplify User Interface development.    Example Requests:    centers/9/accounts
     * Responses:
     *  - 200: OK
     *
     * @param centerId centerId
     * @return [GetCentersCenterIdAccountsResponse]
     */
    @GET("v1/centers/{centerId}/accounts")
    suspend fun retrieveGroupAccount(@Path("centerId") centerId: Long): GetCentersCenterIdAccountsResponse

    /**
     * Retrieve a Center
     * Retrieves a Center  Example Requests:    centers/1    centers/1?associations&#x3D;groupMembers
     * Responses:
     *  - 200: OK
     *
     * @param centerId centerId
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @return [GetCentersCenterIdResponse]
     */
    @GET("v1/centers/{centerId}")
    suspend fun retrieveOne14(
        @Path("centerId") centerId: Long,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false
    ): GetCentersCenterIdResponse

    /**
     * Retrieve a Center Template
     * Retrieves a Center Template  Example Requests:    centers/template    centers/template?officeId&#x3D;2
     * Responses:
     *  - 200: OK
     *
     * @param command command (optional)
     * @param officeId officeId (optional)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @return [GetCentersTemplateResponse]
     */
    @GET("v1/centers/template")
    suspend fun retrieveTemplate6(
        @Query("command") command: String? = null,
        @Query("officeId") officeId: Long? = null,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false
    ): GetCentersTemplateResponse

    /**
     * Update a Center
     * Updates a Center
     * Responses:
     *  - 200: OK
     *
     * @param centerId centerId
     * @param putCentersCenterIdRequest
     * @return [PutCentersCenterIdResponse]
     */
    @PUT("v1/centers/{centerId}")
    suspend fun update12(
        @Path("centerId") centerId: Long,
        @Body putCentersCenterIdRequest: PutCentersCenterIdRequest
    ): PutCentersCenterIdResponse

}

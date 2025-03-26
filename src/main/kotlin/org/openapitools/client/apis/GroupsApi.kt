package org.openapitools.client.apis

import okhttp3.MultipartBody
import org.openapitools.client.models.DeleteGroupsGroupIdResponse
import org.openapitools.client.models.GetGroupsGroupIdAccountsResponse
import org.openapitools.client.models.GetGroupsGroupIdResponse
import org.openapitools.client.models.GetGroupsResponse
import org.openapitools.client.models.GetGroupsTemplateResponse
import org.openapitools.client.models.PostGroupsGroupIdCommandUnassignStaffRequest
import org.openapitools.client.models.PostGroupsGroupIdCommandUnassignStaffResponse
import org.openapitools.client.models.PostGroupsGroupIdRequest
import org.openapitools.client.models.PostGroupsGroupIdResponse
import org.openapitools.client.models.PostGroupsRequest
import org.openapitools.client.models.PostGroupsResponse
import org.openapitools.client.models.PutGroupsGroupIdRequest
import org.openapitools.client.models.PutGroupsGroupIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface GroupsApi {
    /**
     * Activate a Group | Associate Clients | Disassociate Clients | Transfer Clients across groups | Generate Collection Sheet | Save Collection Sheet | Unassign a Staff | Assign a Staff | Close a Group | Unassign a Role | Update a Role
     * Activate a Group:  Groups can be created in a Pending state. This API exists to enable group activation.    If the group happens to be already active this API will result in an error.  Mandatory Fields: activationDate  Associate Clients:  This API allows to associate existing clients to a group.    The clients are listed from the office to which the group is associated.    If client(s) is already associated with group then API will result in an error.  Mandatory Fields: clientMembers  Disassociate Clients:  This API allows to disassociate clients from a group.    Disassociating a client with active joint liability group loans results in an error.  Mandatory Fields: clientMembers  Transfer Clients across groups:  This API allows to transfer clients from one group to another  Mandatory Fields: destinationGroupId and clients  Optional Fields: inheritDestinationGroupLoanOfficer (defaults to true) and transferActiveLoans (defaults to true)  Generate Collection Sheet:  This API retrieves repayment details of all jlg loans of all members of a group on a specified meeting date.  Mandatory Fields: calendarId and transactionDate  Save Collection Sheet:  This api allows the loan officer to perform bulk repayments of JLG loans for a group on its meeting date.  Mandatory Fields: calendarId, transactionDate, actualDisbursementDate  Optional Fields: clientsAttendance, bulkRepaymentTransaction, bulkDisbursementTransactions  Unassign a Staff:  Allows you to unassign the Staff.  Mandatory Fields: staffId  Assign a Staff:  Allows you to assign Staff to an existing Group.    The selected Staff should be belong to the same office (or an office higher up in the hierarchy) as this groupMandatory Fields: staffId  Optional Fields: inheritStaffForClientAccounts (Optional: Boolean if true all members of the group (i.e all clients with active loans and savings ) will inherit the staffId)  Close a Group:  This API exists to close a group. Groups can be closed if they don&#39;t have any non-closed clients/loans/savingsAccounts.    If the group has any active clients/loans/savingsAccount, this API will result in an error.Assign a Role:  Allows you to assign a Role to an existing member of a group.    We can define the different roles applicable to group members by adding code values to the pre-defined system code GROUPROLE. Example:Group leader etc.  Mandatory Fields: clientId, role  Unassign a Role:  Allows you to unassign Roles associated tp Group members.  Update a Role:  Allows you to update the member Role.  Mandatory Fields: role  Showing request/response for Transfer Clients across groups
     * Responses:
     *  - 200: OK
     *
     * @param groupId groupId
     * @param postGroupsGroupIdRequest
     * @param command command (optional)
     * @param roleId roleId (optional)
     * @return [PostGroupsGroupIdResponse]
     */
    @POST("v1/groups/{groupId}")
    suspend fun activateOrGenerateCollectionSheet(
        @Path("groupId") groupId: Long,
        @Body postGroupsGroupIdRequest: PostGroupsGroupIdRequest,
        @Query("command") command: String? = null,
        @Query("roleId") roleId: Long? = null
    ): PostGroupsGroupIdResponse

    /**
     * Create a Group
     * Creates a Group  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, clientMembers
     * Responses:
     *  - 200: OK
     *
     * @param postGroupsRequest
     * @return [PostGroupsResponse]
     */
    @POST("v1/groups")
    suspend fun create8(@Body postGroupsRequest: PostGroupsRequest): PostGroupsResponse

    /**
     * Delete a Group
     * A group can be deleted if it is in pending state and has no associations - clients, loans or savings
     * Responses:
     *  - 200: OK
     *
     * @param groupId groupId
     * @return [DeleteGroupsGroupIdResponse]
     */
    @DELETE("v1/groups/{groupId}")
    suspend fun delete12(@Path("groupId") groupId: Long): DeleteGroupsGroupIdResponse

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
    @GET("v1/groups/downloadtemplate")
    suspend fun getGroupsTemplate(
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
    @POST("v1/groups/uploadtemplate")
    suspend fun postGroupTemplate(
        @Part("dateFormat") dateFormat: String? = null,
        @Part("locale") locale: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
    ): String

    /**
     * Retrieve Group accounts overview
     * Retrieves details of all Loan and Savings accounts associated with this group.    Example Requests:    groups/1/accounts      groups/1/accounts?fields&#x3D;loanAccounts,savingsAccounts,memberLoanAccounts,  memberSavingsAccounts
     * Responses:
     *  - 200: OK
     *
     * @param groupId groupId
     * @return [GetGroupsGroupIdAccountsResponse]
     */
    @GET("v1/groups/{groupId}/accounts")
    suspend fun retrieveAccounts(@Path("groupId") groupId: Long): GetGroupsGroupIdAccountsResponse

    /**
     * List Groups
     * The default implementation of listing Groups returns 200 entries with support for pagination and sorting. Using the parameter limit with description -1 returns all entries.  Example Requests:    groups    groups?fields&#x3D;name,officeName,joinedDate    groups?offset&#x3D;10&amp;limit&#x3D;50    groups?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC
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
     * @param orphansOnly orphansOnly (optional)
     * @return [GetGroupsResponse]
     */
    @GET("v1/groups")
    suspend fun retrieveAll24(
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
        @Query("orphansOnly") orphansOnly: Boolean? = null
    ): GetGroupsResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param groupId
     * @param parentGSIMAccountNo  (optional)
     * @param parentGSIMId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/groups/{groupId}/gsimaccounts")
    suspend fun retrieveGsimAccounts(
        @Path("groupId") groupId: Long,
        @Query("parentGSIMAccountNo") parentGSIMAccountNo: String? = null,
        @Query("parentGSIMId") parentGSIMId: Long? = null
    ): String

    /**
     * Retrieve a Group
     * Retrieve group information.  Example Requests:    groups/1    groups/1?associations&#x3D;clientMembers
     * Responses:
     *  - 200: OK
     *
     * @param groupId groupId
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @param roleId roleId (optional)
     * @return [GetGroupsGroupIdResponse]
     */
    @GET("v1/groups/{groupId}")
    suspend fun retrieveOne15(
        @Path("groupId") groupId: Long,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false,
        @Query("roleId") roleId: Long? = null
    ): GetGroupsGroupIdResponse

    /**
     * Retrieve Group Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    groups/template    groups/template?officeId&#x3D;2    groups/template?centerId&#x3D;1    groups/template?centerId&#x3D;1&amp;staffInSelectedOfficeOnly&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param officeId officeId (optional)
     * @param center center (optional)
     * @param centerId centerId (optional)
     * @param command command (optional)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @return [GetGroupsTemplateResponse]
     */
    @GET("v1/groups/template")
    suspend fun retrieveTemplate7(
        @Query("officeId") officeId: Long? = null,
        @Query("center") center: Boolean? = null,
        @Query("centerId") centerId: Long? = null,
        @Query("command") command: String? = null,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false
    ): GetGroupsTemplateResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param groupId
     * @param parentLoanAccountNo  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/groups/{groupId}/glimaccounts")
    suspend fun retrieveglimAccounts(
        @Path("groupId") groupId: Long,
        @Query("parentLoanAccountNo") parentLoanAccountNo: String? = null
    ): String

    /**
     * Unassign a Staff
     * Allows you to unassign the Staff.  Mandatory Fields: staffId
     * Responses:
     *  - 200: OK
     *
     * @param groupId groupId
     * @param postGroupsGroupIdCommandUnassignStaffRequest
     * @return [PostGroupsGroupIdCommandUnassignStaffResponse]
     */
    @POST("v1/groups/{groupId}/command/unassign_staff")
    suspend fun unassignLoanOfficer(
        @Path("groupId") groupId: Long,
        @Body postGroupsGroupIdCommandUnassignStaffRequest: PostGroupsGroupIdCommandUnassignStaffRequest
    ): PostGroupsGroupIdCommandUnassignStaffResponse

    /**
     * Update a Group
     * Updates a Group
     * Responses:
     *  - 200: OK
     *
     * @param groupId groupId
     * @param putGroupsGroupIdRequest
     * @return [PutGroupsGroupIdResponse]
     */
    @PUT("v1/groups/{groupId}")
    suspend fun update13(
        @Path("groupId") groupId: Long,
        @Body putGroupsGroupIdRequest: PutGroupsGroupIdRequest
    ): PutGroupsGroupIdResponse

}

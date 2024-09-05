package org.openapitools.client.apis

import okhttp3.MultipartBody
import org.openapitools.client.models.DeleteClientsClientIdResponse
import org.openapitools.client.models.GetClientObligeeDetailsResponse
import org.openapitools.client.models.GetClientTransferProposalDateResponse
import org.openapitools.client.models.GetClientsClientIdAccountsResponse
import org.openapitools.client.models.GetClientsClientIdResponse
import org.openapitools.client.models.GetClientsResponse
import org.openapitools.client.models.GetClientsTemplateResponse
import org.openapitools.client.models.PostClientsClientIdRequest
import org.openapitools.client.models.PostClientsClientIdResponse
import org.openapitools.client.models.PostClientsRequest
import org.openapitools.client.models.PostClientsResponse
import org.openapitools.client.models.PutClientsClientIdRequest
import org.openapitools.client.models.PutClientsClientIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface ClientApi {
    /**
     * Activate a Client | Close a Client | Reject a Client | Withdraw a Client | Reactivate a Client | UndoReject a Client | UndoWithdraw a Client | Assign a Staff | Unassign a Staff | Update Default Savings Account | Propose a Client Transfer | Withdraw a Client Transfer | Reject a Client Transfer | Accept a Client Transfer | Propose and Accept a Client Transfer
     * Activate a Client:  Clients can be created in a Pending state. This API exists to enable client activation (for when a client becomes an approved member of the financial Institution).  If the client happens to be already active this API will result in an error.  Close a Client:  Clients can be closed if they do not have any non-closed loans/savingsAccount. This API exists to close a client .  If the client have any active loans/savingsAccount this API will result in an error.  Reject a Client:  Clients can be rejected when client is in pending for activation status.  If the client is any other status, this API throws an error.  Mandatory Fields: rejectionDate, rejectionReasonId  Withdraw a Client:  Client applications can be withdrawn when client is in a pending for activation status.  If the client is any other status, this API throws an error.  Mandatory Fields: withdrawalDate, withdrawalReasonId  Reactivate a Client: Clients can be reactivated after they have been closed.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reactivationDate  UndoReject a Client:  Clients can be reactivated after they have been rejected.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reopenedDateUndoWithdraw a Client:  Clients can be reactivated after they have been withdrawn.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reopenedDate  Assign a Staff:  Allows you to assign a Staff for existed Client.  The selected Staff should belong to the same office (or an officer higher up in the hierarchy) as the Client he manages.  Unassign a Staff:  Allows you to unassign the Staff assigned to a Client.  Update Default Savings Account:  Allows you to modify or assign a default savings account for an existing Client.  The selected savings account should be one among the existing savings account for a particular customer.  Propose a Client Transfer:  Allows you to propose the transfer of a Client to a different Office.  Withdraw a Client Transfer:  Allows you to withdraw the proposed transfer of a Client to a different Office.  Withdrawal can happen only if the destination Branch (to which the transfer was proposed) has not already accepted the transfer proposal  Reject a Client Transfer:  Allows the Destination Branch to reject the proposed Client Transfer.  Accept a Client Transfer:  Allows the Destination Branch to accept the proposed Client Transfer.  The destination branch may also choose to link this client to a group (in which case, any existing active JLG loan of the client is rescheduled to match the meeting frequency of the group) and loan Officer at the time of accepting the transfer  Propose and Accept a Client Transfer:  Abstraction over the Propose and Accept Client Transfer API&#39;s which enable a user with Data Scope over both the Target and Destination Branches to directly transfer a Client to the destination Office.  Showing request/response for &#39;Reject a Client Transfer&#39;
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param postClientsClientIdRequest
     * @param command command (optional)
     * @return [PostClientsClientIdResponse]
     */
    @POST("v1/clients/{clientId}")
    suspend fun activate1(
        @Path("clientId") clientId: Long,
        @Body postClientsClientIdRequest: PostClientsClientIdRequest,
        @Query("command") command: String? = null
    ): PostClientsClientIdResponse

    /**
     * Activate a Client | Close a Client | Reject a Client | Withdraw a Client | Reactivate a Client | UndoReject a Client | UndoWithdraw a Client | Assign a Staff | Unassign a Staff | Update Default Savings Account | Propose a Client Transfer | Withdraw a Client Transfer | Reject a Client Transfer | Accept a Client Transfer | Propose and Accept a Client Transfer
     * Activate a Client:  Clients can be created in a Pending state. This API exists to enable client activation (for when a client becomes an approved member of the financial Institution).  If the client happens to be already active this API will result in an error.  Close a Client:  Clients can be closed if they do not have any non-closed loans/savingsAccount. This API exists to close a client .  If the client have any active loans/savingsAccount this API will result in an error.  Reject a Client:  Clients can be rejected when client is in pending for activation status.  If the client is any other status, this API throws an error.  Mandatory Fields: rejectionDate, rejectionReasonId  Withdraw a Client:  Client applications can be withdrawn when client is in a pending for activation status.  If the client is any other status, this API throws an error.  Mandatory Fields: withdrawalDate, withdrawalReasonId  Reactivate a Client: Clients can be reactivated after they have been closed.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reactivationDate  UndoReject a Client:  Clients can be reactivated after they have been rejected.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reopenedDateUndoWithdraw a Client:  Clients can be reactivated after they have been withdrawn.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reopenedDate  Assign a Staff:  Allows you to assign a Staff for existed Client.  The selected Staff should belong to the same office (or an officer higher up in the hierarchy) as the Client he manages.  Unassign a Staff:  Allows you to unassign the Staff assigned to a Client.  Update Default Savings Account:  Allows you to modify or assign a default savings account for an existing Client.  The selected savings account should be one among the existing savings account for a particular customer.  Propose a Client Transfer:  Allows you to propose the transfer of a Client to a different Office.  Withdraw a Client Transfer:  Allows you to withdraw the proposed transfer of a Client to a different Office.  Withdrawal can happen only if the destination Branch (to which the transfer was proposed) has not already accepted the transfer proposal  Reject a Client Transfer:  Allows the Destination Branch to reject the proposed Client Transfer.  Accept a Client Transfer:  Allows the Destination Branch to accept the proposed Client Transfer.  The destination branch may also choose to link this client to a group (in which case, any existing active JLG loan of the client is rescheduled to match the meeting frequency of the group) and loan Officer at the time of accepting the transfer  Propose and Accept a Client Transfer:  Abstraction over the Propose and Accept Client Transfer API&#39;s which enable a user with Data Scope over both the Target and Destination Branches to directly transfer a Client to the destination Office.  Showing request/response for &#39;Reject a Client Transfer&#39;
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId
     * @param postClientsClientIdRequest
     * @param command command (optional)
     * @return [PostClientsClientIdResponse]
     */
    @POST("v1/clients/external-id/{externalId}")
    suspend fun applyCommand(
        @Path("externalId") externalId: String,
        @Body postClientsClientIdRequest: PostClientsClientIdRequest,
        @Query("command") command: String? = null
    ): PostClientsClientIdResponse

    /**
     * Create a Client
     * Note:  1. You can enter either:firstname/middlename/lastname - for a person (middlename is optional) OR fullname - for a business or organisation (or person known by one name).  2.If address is enable(enable-address&#x3D;true), then additional field called address has to be passed.  Mandatory Fields: firstname and lastname OR fullname, officeId, active&#x3D;true and activationDate OR active&#x3D;false, if(address enabled) address  Optional Fields: groupId, externalId, accountNo, staffId, mobileNo, savingsProductId, genderId, clientTypeId, clientClassificationId
     * Responses:
     *  - 200: OK
     *
     * @param postClientsRequest
     * @return [PostClientsResponse]
     */
    @POST("v1/clients")
    suspend fun create6(@Body postClientsRequest: PostClientsRequest): PostClientsResponse

    /**
     * Delete a Client
     * If a client is in Pending state, you are allowed to Delete it. The delete is a &#39;hard delete&#39; and cannot be recovered from. Once clients become active or have loans or savings associated with them, you cannot delete the client but you may Close the client if they have left the program.
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId
     * @param body
     * @return [DeleteClientsClientIdResponse]
     */
    @DELETE("v1/clients/external-id/{externalId}")
    suspend fun delete10(
        @Path("externalId") externalId: String,
        @Body body: Any
    ): DeleteClientsClientIdResponse

    /**
     * Delete a Client
     * If a client is in Pending state, you are allowed to Delete it. The delete is a &#39;hard delete&#39; and cannot be recovered from. Once clients become active or have loans or savings associated with them, you cannot delete the client but you may Close the client if they have left the program.
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param body
     * @return [DeleteClientsClientIdResponse]
     */
    @DELETE("v1/clients/{clientId}")
    suspend fun delete9(
        @Path("clientId") clientId: Long,
        @Body body: Any
    ): DeleteClientsClientIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param legalFormType  (optional)
     * @param officeId  (optional)
     * @param staffId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/clients/downloadtemplate")
    suspend fun getClientTemplate(
        @Query("legalFormType") legalFormType: String? = null,
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
     * @param legalFormType  (optional)
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/clients/uploadtemplate")
    suspend fun postClientTemplate(
        @Query("legalFormType") legalFormType: String? = null,
        @Part("dateFormat") dateFormat: String? = null,
        @Part("locale") locale: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
    ): String

    /**
     * List Clients
     * The list capability of clients can support pagination and sorting.  Example Requests:  clients  clients?fields&#x3D;displayName,officeName,timeline  clients?offset&#x3D;10&amp;limit&#x3D;50  clients?orderBy&#x3D;displayName&amp;sortOrder&#x3D;DESC
     * Responses:
     *  - 200: OK
     *
     * @param officeId officeId (optional)
     * @param externalId externalId (optional)
     * @param displayName displayName (optional)
     * @param firstName firstName (optional)
     * @param lastName lastName (optional)
     * @param status status (optional)
     * @param underHierarchy underHierarchy (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @param orphansOnly orphansOnly (optional)
     * @return [GetClientsResponse]
     */
    @GET("v1/clients")
    suspend fun retrieveAll21(
        @Query("officeId") officeId: Long? = null,
        @Query("externalId") externalId: String? = null,
        @Query("displayName") displayName: String? = null,
        @Query("firstName") firstName: String? = null,
        @Query("lastName") lastName: String? = null,
        @Query("status") status: String? = null,
        @Query("underHierarchy") underHierarchy: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("orphansOnly") orphansOnly: Boolean? = null
    ): GetClientsResponse

    /**
     * Retrieve client accounts overview
     * An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:   clients/1/accounts  clients/1/accounts?fields&#x3D;loanAccounts,savingsAccounts
     * Responses:
     *  - 200: OK
     *  - 400: Bad Request
     *
     * @param clientId clientId
     * @return [GetClientsClientIdAccountsResponse]
     */
    @GET("v1/clients/{clientId}/accounts")
    suspend fun retrieveAssociatedAccounts(@Path("clientId") clientId: Long): GetClientsClientIdAccountsResponse

    /**
     * Retrieve client accounts overview
     * An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:   clients/123-456/accounts  clients/123-456/accounts?fields&#x3D;loanAccounts,savingsAccounts
     * Responses:
     *  - 200: OK
     *  - 400: Bad Request
     *
     * @param externalId externalId
     * @return [GetClientsClientIdAccountsResponse]
     */
    @GET("v1/clients/external-id/{externalId}/accounts")
    suspend fun retrieveAssociatedAccounts1(@Path("externalId") externalId: String): GetClientsClientIdAccountsResponse

    /**
     * Retrieve client obligee details
     * Retrieve client obligee details
     * Responses:
     *  - 200: OK
     *  - 400: Bad Request
     *
     * @param clientId
     * @return [GetClientObligeeDetailsResponse]
     */
    @GET("v1/clients/{clientId}/obligeedetails")
    suspend fun retrieveObligeeDetails(@Path("clientId") clientId: Long): GetClientObligeeDetailsResponse

    /**
     * Retrieve client obligee details
     * Retrieve client obligee details using the client external Id
     * Responses:
     *  - 200: OK
     *  - 400: Bad Request
     *
     * @param externalId
     * @return [GetClientObligeeDetailsResponse]
     */
    @GET("v1/clients/external-id/{externalId}/obligeedetails")
    suspend fun retrieveObligeeDetails1(@Path("externalId") externalId: String): GetClientObligeeDetailsResponse

    /**
     * Retrieve a Client
     * Example Requests:  clients/1   clients/1?template&#x3D;true   clients/1?fields&#x3D;id,displayName,officeName
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @return [GetClientsClientIdResponse]
     */
    @GET("v1/clients/{clientId}")
    suspend fun retrieveOne11(
        @Path("clientId") clientId: Long,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false
    ): GetClientsClientIdResponse

    /**
     * Retrieve a Client by External Id
     * Example Requests:  clients/123-456   clients/123-456?template&#x3D;true   clients/123-456?fields&#x3D;id,displayName,officeName
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @return [GetClientsClientIdResponse]
     */
    @GET("v1/clients/external-id/{externalId}")
    suspend fun retrieveOne12(
        @Path("externalId") externalId: String,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false
    ): GetClientsClientIdResponse

    /**
     * Retrieve Client Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  clients/template
     * Responses:
     *  - 200: OK
     *
     * @param officeId officeId (optional)
     * @param commandParam commandParam (optional)
     * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
     * @return [GetClientsTemplateResponse]
     */
    @GET("v1/clients/template")
    suspend fun retrieveTemplate5(
        @Query("officeId") officeId: Long? = null,
        @Query("commandParam") commandParam: String? = null,
        @Query("staffInSelectedOfficeOnly") staffInSelectedOfficeOnly: Boolean? = false
    ): GetClientsTemplateResponse

    /**
     * Retrieve client transfer template
     * Retrieve client transfer template
     * Responses:
     *  - 200: OK
     *  - 400: Bad Request
     *
     * @param clientId
     * @return [GetClientTransferProposalDateResponse]
     */
    @GET("v1/clients/{clientId}/transferproposaldate")
    suspend fun retrieveTransferTemplate(@Path("clientId") clientId: Long): GetClientTransferProposalDateResponse

    /**
     * Retrieve client transfer template
     * Retrieve client transfer template using the client external Id
     * Responses:
     *  - 200: OK
     *  - 400: Bad Request
     *
     * @param externalId
     * @return [GetClientTransferProposalDateResponse]
     */
    @GET("v1/clients/external-id/{externalId}/transferproposaldate")
    suspend fun retrieveTransferTemplate1(@Path("externalId") externalId: String): GetClientTransferProposalDateResponse

    /**
     * Update a Client
     * Note: You can update any of the basic attributes of a client (but not its associations) using this API.  Changing the relationship between a client and its office is not supported through this API. An API specific to handling transfers of clients between offices is available for the same.  The relationship between a client and a group must be removed through the Groups API.
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param putClientsClientIdRequest
     * @return [PutClientsClientIdResponse]
     */
    @PUT("v1/clients/{clientId}")
    suspend fun update10(
        @Path("clientId") clientId: Long,
        @Body putClientsClientIdRequest: PutClientsClientIdRequest
    ): PutClientsClientIdResponse

    /**
     * Update a Client using the External Id
     * Note: You can update any of the basic attributes of a client (but not its associations) using this API.  Changing the relationship between a client and its office is not supported through this API. An API specific to handling transfers of clients between offices is available for the same.  The relationship between a client and a group must be removed through the Groups API.
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId
     * @param putClientsClientIdRequest
     * @return [PutClientsClientIdResponse]
     */
    @PUT("v1/clients/external-id/{externalId}")
    suspend fun update11(
        @Path("externalId") externalId: String,
        @Body putClientsClientIdRequest: PutClientsClientIdRequest
    ): PutClientsClientIdResponse

}

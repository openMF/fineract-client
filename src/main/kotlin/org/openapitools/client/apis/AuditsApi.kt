package org.openapitools.client.apis

import org.openapitools.client.models.GetMakerCheckerResponse
import org.openapitools.client.models.GetMakerCheckersSearchTemplateResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AuditsApi {
    /**
     * List Audits
     * Get a 200 list of audits that match the criteria supplied and sorted by audit id in descending order, and are within the requestors&#39; data scope. Also it supports pagination and sorting  Example Requests:  audits  audits?fields&#x3D;madeOnDate,maker,processingResult  audits?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  audits?officeId&#x3D;1  audits?officeId&#x3D;1&amp;includeJson&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param actionName actionName (optional)
     * @param entityName entityName (optional)
     * @param resourceId resourceId (optional)
     * @param makerId makerId (optional)
     * @param makerDateTimeFrom makerDateTimeFrom (optional)
     * @param makerDateTimeTo makerDateTimeTo (optional)
     * @param checkerId checkerId (optional)
     * @param checkerDateTimeFrom checkerDateTimeFrom (optional)
     * @param checkerDateTimeTo checkerDateTimeTo (optional)
     * @param processingResult processingResult (optional)
     * @param officeId officeId (optional)
     * @param groupId groupId (optional)
     * @param clientId clientId (optional)
     * @param loanid loanid (optional)
     * @param savingsAccountId savingsAccountId (optional)
     * @param paged paged (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [kotlin.collections.List<GetMakerCheckerResponse>]
     */
    @GET("v1/audits")
    suspend fun retrieveAuditEntries(
        @Query("actionName") actionName: String? = null,
        @Query("entityName") entityName: String? = null,
        @Query("resourceId") resourceId: Long? = null,
        @Query("makerId") makerId: Long? = null,
        @Query("makerDateTimeFrom") makerDateTimeFrom: String? = null,
        @Query("makerDateTimeTo") makerDateTimeTo: String? = null,
        @Query("checkerId") checkerId: Long? = null,
        @Query("checkerDateTimeFrom") checkerDateTimeFrom: String? = null,
        @Query("checkerDateTimeTo") checkerDateTimeTo: String? = null,
        @Query("processingResult") processingResult: Int? = null,
        @Query("officeId") officeId: Int? = null,
        @Query("groupId") groupId: Int? = null,
        @Query("clientId") clientId: Int? = null,
        @Query("loanid") loanid: Int? = null,
        @Query("savingsAccountId") savingsAccountId: Int? = null,
        @Query("paged") paged: Boolean? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): List<GetMakerCheckerResponse>

    /**
     * Retrieve an Audit Entry
     * Example Requests:  audits/20 audits/20?fields&#x3D;madeOnDate,maker,processingResult
     * Responses:
     *  - 200: OK
     *
     * @param auditId auditId
     * @return [GetMakerCheckerResponse]
     */
    @GET("v1/audits/{auditId}")
    suspend fun retrieveAuditEntry(@Path("auditId") auditId: Long): GetMakerCheckerResponse

    /**
     * Audit Search Template
     * This is a convenience resource. It can be useful when building an Audit Search UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with.  Example Requests:  audits/searchtemplate audits/searchtemplate?fields&#x3D;actionNames
     * Responses:
     *  - 200: OK
     *
     * @return [GetMakerCheckersSearchTemplateResponse]
     */
    @GET("v1/audits/searchtemplate")
    suspend fun retrieveAuditSearchTemplate(): GetMakerCheckersSearchTemplateResponse

}

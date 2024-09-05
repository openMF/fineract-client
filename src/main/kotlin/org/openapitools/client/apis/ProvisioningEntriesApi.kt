package org.openapitools.client.apis

import org.openapitools.client.models.LoanProductProvisioningEntryData
import org.openapitools.client.models.PostProvisioningEntriesRequest
import org.openapitools.client.models.PostProvisioningEntriesResponse
import org.openapitools.client.models.ProvisioningEntryData
import org.openapitools.client.models.PutProvisioningEntriesRequest
import org.openapitools.client.models.PutProvisioningEntriesResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ProvisioningEntriesApi {
    /**
     * Create new Provisioning Entries
     * Creates a new Provisioning Entries  Mandatory Fields date dateFormat locale Optional Fields createjournalentries
     * Responses:
     *  - 200: OK
     *
     * @param postProvisioningEntriesRequest  (optional)
     * @return [PostProvisioningEntriesResponse]
     */
    @POST("v1/provisioningentries")
    suspend fun createProvisioningEntries(@Body postProvisioningEntriesRequest: PostProvisioningEntriesRequest? = null): PostProvisioningEntriesResponse

    /**
     * Recreates Provisioning Entry
     * Recreates Provisioning Entry | createjournalentry.
     * Responses:
     *  - 200: OK
     *
     * @param entryId entryId
     * @param command command&#x3D;createjournalentry command&#x3D;recreateprovisioningentry (optional)
     * @param putProvisioningEntriesRequest  (optional)
     * @return [PutProvisioningEntriesResponse]
     */
    @POST("v1/provisioningentries/{entryId}")
    suspend fun modifyProvisioningEntry(
        @Path("entryId") entryId: Long,
        @Query("command") command: String? = null,
        @Body putProvisioningEntriesRequest: PutProvisioningEntriesRequest? = null
    ): PutProvisioningEntriesResponse

    /**
     * List all Provisioning Entries
     *
     * Responses:
     *  - 200: OK
     *
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [kotlin.collections.List<ProvisioningEntryData]
     */
    @GET("v1/provisioningentries")
    suspend fun retrieveAllProvisioningEntries(
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): List<ProvisioningEntryData>

    /**
     *
     *
     * Responses:
     *  - 200: OK
     *
     * @param entryId  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @param officeId  (optional)
     * @param productId  (optional)
     * @param categoryId  (optional)
     * @return [LoanProductProvisioningEntryData]
     */
    @GET("v1/provisioningentries/entries")
    suspend fun retrieveProviioningEntries(
        @Query("entryId") entryId: Long? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("officeId") officeId: Long? = null,
        @Query("productId") productId: Long? = null,
        @Query("categoryId") categoryId: Long? = null
    ): LoanProductProvisioningEntryData

    /**
     * Retrieves a Provisioning Entry
     * Returns the details of a generated Provisioning Entry.
     * Responses:
     *  - 200: OK
     *
     * @param entryId entryId
     * @return [ProvisioningEntryData]
     */
    @GET("v1/provisioningentries/{entryId}")
    suspend fun retrieveProvisioningEntry(@Path("entryId") entryId: Long): ProvisioningEntryData

}

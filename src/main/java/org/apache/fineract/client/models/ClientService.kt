package org.apache.fineract.client.models

import retrofit2.http.GET
import retrofit2.http.Query

interface ClientService {

    @GET("clients")
    suspend fun retrieveAll21(
        @Query("sqlSearch") sqlSearch: String?,
        @Query("officeId") officeId: Long?,
        @Query("externalId") externalId: String?,
        @Query("displayName") displayName: String?,
        @Query("firstName") firstName: String?,
        @Query("lastName") lastName: String?,
        @Query("status") status: String?,
        @Query("underHierarchy") underHierarchy: String?,
        @Query("offset") offset: Int?,
        @Query("limit") limit: Int?,
        @Query("orderBy") orderBy: String?,
        @Query("sortOrder") sortOrder: String?,
        @Query("orphansOnly") orphansOnly: Boolean?
    ): GetClientsResponse

}
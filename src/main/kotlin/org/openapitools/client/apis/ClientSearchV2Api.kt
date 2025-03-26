package org.openapitools.client.apis

import org.openapitools.client.models.PageClientSearchData
import org.openapitools.client.models.PagedRequestClientTextSearch
import retrofit2.http.Body
import retrofit2.http.POST

interface ClientSearchV2Api {
    /**
     * Search Clients by text
     *
     * Responses:
     *  - 0: default response
     *
     * @param pagedRequestClientTextSearch  (optional)
     * @return [PageClientSearchData]
     */
    @POST("v2/clients/search")
    suspend fun searchByText(@Body pagedRequestClientTextSearch: PagedRequestClientTextSearch? = null): PageClientSearchData

}

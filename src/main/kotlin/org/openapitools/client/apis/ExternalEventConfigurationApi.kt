package org.openapitools.client.apis

import org.openapitools.client.models.CommandProcessingResult
import org.openapitools.client.models.GetExternalEventConfigurationsResponse
import org.openapitools.client.models.PutExternalEventConfigurationsRequest
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT

interface ExternalEventConfigurationApi {
    /**
     * List all external event configurations
     *
     * Responses:
     *  - 200: List of all external event configurations
     *
     * @return [GetExternalEventConfigurationsResponse]
     */
    @GET("v1/externalevents/configuration")
    suspend fun retrieveExternalEventConfiguration(): GetExternalEventConfigurationsResponse

    /**
     * Enable/Disable external events posting
     *
     * Responses:
     *  - 200: OK
     *
     * @param putExternalEventConfigurationsRequest
     * @return [CommandProcessingResult]
     */
    @PUT("v1/externalevents/configuration")
    suspend fun updateExternalEventConfigurationsDetails(@Body putExternalEventConfigurationsRequest: PutExternalEventConfigurationsRequest): CommandProcessingResult

}

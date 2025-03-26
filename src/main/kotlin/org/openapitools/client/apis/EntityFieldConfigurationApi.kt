package org.openapitools.client.apis

import org.openapitools.client.models.GetFieldConfigurationEntityResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface EntityFieldConfigurationApi {
    /**
     * Retrieves the Entity Field Configuration
     * It retrieves all the Entity Field Configuration
     * Responses:
     *  - 200: OK
     *
     * @param entity entity
     * @return [kotlin.collections.List<GetFieldConfigurationEntityResponse>]
     */
    @GET("v1/fieldconfiguration/{entity}")
    suspend fun getAddresses(@Path("entity") entity: String): List<GetFieldConfigurationEntityResponse>

}

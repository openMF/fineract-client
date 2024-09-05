package org.openapitools.client.apis

import org.openapitools.client.models.GetGlobalConfigurationsResponse
import org.openapitools.client.models.GlobalConfigurationPropertyData
import org.openapitools.client.models.PutGlobalConfigurationsRequest
import org.openapitools.client.models.PutGlobalConfigurationsResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface GlobalConfigurationApi {
    /**
     * Retrieve Global Configuration | Retrieve Global Configuration for surveys
     * Returns the list global enable/disable configurations.  Example Requests:  configurations   Returns the list global enable/disable survey configurations.  Example Requests:  configurations/survey
     * Responses:
     *  - 200: List of example \\n response \\nsurveys response   \\ngiven below
     *
     * @param survey survey (optional, default to false)
     * @return [GetGlobalConfigurationsResponse]
     */
    @GET("v1/configurations")
    suspend fun retrieveConfiguration(@Query("survey") survey: Boolean? = false): GetGlobalConfigurationsResponse

    /**
     * Retrieve Global Configuration
     * Returns a global enable/disable configurations.  Example Requests:  configurations/1
     * Responses:
     *  - 200: OK
     *
     * @param configId configId
     * @return [GetGlobalConfigurationsResponse]
     */
    @GET("v1/configurations/{configId}")
    suspend fun retrieveOne3(@Path("configId") configId: Long): GetGlobalConfigurationsResponse

    /**
     * Retrieve Global Configuration
     * Returns a global enable/disable configuration.  Example Requests:  configurations/name/Enable-Address
     * Responses:
     *  - 200: OK
     *
     * @param name name
     * @return [GlobalConfigurationPropertyData]
     */
    @GET("v1/configurations/name/{name}")
    suspend fun retrieveOneByName(@Path("name") name: String): GlobalConfigurationPropertyData

    /**
     * Update Global Configuration
     * Updates an enable/disable global configuration item.
     * Responses:
     *  - 200: OK
     *
     * @param configId configId
     * @param putGlobalConfigurationsRequest
     * @return [PutGlobalConfigurationsResponse]
     */
    @PUT("v1/configurations/{configId}")
    suspend fun updateConfiguration1(
        @Path("configId") configId: Long,
        @Body putGlobalConfigurationsRequest: PutGlobalConfigurationsRequest
    ): PutGlobalConfigurationsResponse

}

package org.openapitools.client.apis

import org.openapitools.client.models.ChangeInstanceModeRequest
import retrofit2.http.Body
import retrofit2.http.PUT

interface InstanceModeApi {
    /**
     * Changes the Fineract instance mode
     *
     * Responses:
     *  - 200: OK
     *
     * @param changeInstanceModeRequest
     * @return [Unit]
     */
    @PUT("v1/instance-mode")
    suspend fun changeMode(@Body changeInstanceModeRequest: ChangeInstanceModeRequest)

}

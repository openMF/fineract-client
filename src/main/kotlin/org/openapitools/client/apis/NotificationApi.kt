package org.openapitools.client.apis

import org.openapitools.client.models.GetNotificationsResponse
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Query

interface NotificationApi {
    /**
     *
     *
     * Responses:
     *  - 200: OK
     *
     * @param orderBy orderBy (optional)
     * @param limit limit (optional)
     * @param offset offset (optional)
     * @param sortOrder sortOrder (optional)
     * @param isRead isRead (optional)
     * @return [GetNotificationsResponse]
     */
    @GET("v1/notifications")
    suspend fun getAllNotifications(
        @Query("orderBy") orderBy: String? = null,
        @Query("limit") limit: Int? = null,
        @Query("offset") offset: Int? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("isRead") isRead: Boolean? = null
    ): GetNotificationsResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [Unit]
     */
    @PUT("v1/notifications")
    suspend fun update5(): Unit

}

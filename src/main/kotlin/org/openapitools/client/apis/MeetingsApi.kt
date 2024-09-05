package org.openapitools.client.apis

import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query


interface MeetingsApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType
     * @param entityId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/{entityType}/{entityId}/meetings")
    suspend fun createMeeting(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType
     * @param entityId
     * @param meetingId
     * @return [kotlin.String]
     */
    @DELETE("v1/{entityType}/{entityId}/meetings/{meetingId}")
    suspend fun deleteMeeting(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("meetingId") meetingId: Long
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType
     * @param entityId
     * @param meetingId
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/{entityType}/{entityId}/meetings/{meetingId}")
    suspend fun performMeetingCommands(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("meetingId") meetingId: Long,
        @Query("command") command: String? = null,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param meetingId
     * @param entityType
     * @param entityId
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/meetings/{meetingId}")
    suspend fun retrieveMeeting(
        @Path("meetingId") meetingId: Long,
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType
     * @param entityId
     * @param limit  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/meetings")
    suspend fun retrieveMeetings(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Query("limit") limit: Int? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType
     * @param entityId
     * @param calendarId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/{entityType}/{entityId}/meetings/template")
    suspend fun template11(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Query("calendarId") calendarId: Long? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType
     * @param entityId
     * @param meetingId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/{entityType}/{entityId}/meetings/{meetingId}")
    suspend fun updateMeeting(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("meetingId") meetingId: Long,
        @Body body: String? = null
    ): String

}

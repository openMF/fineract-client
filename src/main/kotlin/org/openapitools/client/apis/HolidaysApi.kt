package org.openapitools.client.apis

import org.openapitools.client.models.DeleteHolidaysHolidayIdResponse
import org.openapitools.client.models.GetHolidaysResponse
import org.openapitools.client.models.PostHolidaysHolidayIdResponse
import org.openapitools.client.models.PostHolidaysRequest
import org.openapitools.client.models.PostHolidaysResponse
import org.openapitools.client.models.PutHolidaysHolidayIdRequest
import org.openapitools.client.models.PutHolidaysHolidayIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface HolidaysApi {
    /**
     * Create a Holiday
     * Mandatory Fields: name, description, fromDate, toDate, repaymentsRescheduledTo, offices
     * Responses:
     *  - 200: OK
     *
     * @param postHolidaysRequest
     * @return [PostHolidaysResponse]
     */
    @POST("v1/holidays")
    suspend fun createNewHoliday(@Body postHolidaysRequest: PostHolidaysRequest): PostHolidaysResponse

    /**
     * Delete a Holiday
     * This API allows to delete a holiday. This is a soft delete the deleted holiday status is marked as deleted.
     * Responses:
     *  - 200: OK
     *
     * @param holidayId holidayId
     * @return [DeleteHolidaysHolidayIdResponse]
     */
    @DELETE("v1/holidays/{holidayId}")
    suspend fun delete7(@Path("holidayId") holidayId: Long): DeleteHolidaysHolidayIdResponse

    /**
     * Activate a Holiday
     * Always Holidays are created in pending state. This API allows to activate a holiday.  Only the active holidays are considered for rescheduling the loan repayment.
     * Responses:
     *  - 200: OK
     *
     * @param holidayId holidayId
     * @param body
     * @param command command (optional)
     * @return [PostHolidaysHolidayIdResponse]
     */
    @POST("v1/holidays/{holidayId}")
    suspend fun handleCommands1(
        @Path("holidayId") holidayId: Long,
        @Body body: Any,
        @Query("command") command: String? = null
    ): PostHolidaysHolidayIdResponse

    /**
     * List Holidays
     * Example Requests:  holidays?officeId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param officeId officeId (optional)
     * @param fromDate fromDate (optional)
     * @param toDate toDate (optional)
     * @param locale locale (optional)
     * @param dateFormat dateFormat (optional)
     * @return [kotlin.collections.List<GetHolidaysResponse]
     */
    @GET("v1/holidays")
    suspend fun retrieveAllHolidays(
        @Query("officeId") officeId: Long? = null,
        @Query("fromDate") fromDate: Any? = null,
        @Query("toDate") toDate: Any? = null,
        @Query("locale") locale: String? = null,
        @Query("dateFormat") dateFormat: String? = null
    ): List<GetHolidaysResponse>

    /**
     * Retrieve a Holiday
     * Example Requests:  holidays/1
     * Responses:
     *  - 200: OK
     *
     * @param holidayId holidayId
     * @return [GetHolidaysResponse]
     */
    @GET("v1/holidays/{holidayId}")
    suspend fun retrieveOne7(@Path("holidayId") holidayId: Long): GetHolidaysResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/holidays/template")
    suspend fun retrieveRepaymentScheduleUpdationTyeOptions(): String

    /**
     * Update a Holiday
     * If a holiday is in pending state (created and not activated) then all fields are allowed to modify. Once holidays become active only name and descriptions are allowed to modify.
     * Responses:
     *  - 200: OK
     *
     * @param holidayId holidayId
     * @param putHolidaysHolidayIdRequest
     * @return [PutHolidaysHolidayIdResponse]
     */
    @PUT("v1/holidays/{holidayId}")
    suspend fun update6(
        @Path("holidayId") holidayId: Long,
        @Body putHolidaysHolidayIdRequest: PutHolidaysHolidayIdRequest
    ): PutHolidaysHolidayIdResponse

}

package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface HolidaysApi {
    /**
     * Create a Holiday
     * Mandatory Fields: name, description, fromDate, toDate, repaymentsRescheduledTo, offices
     *
     * @param body body (required)
     * @return Observable&lt;PostHolidaysResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("holidays")
    Observable<PostHolidaysResponse> createNewHoliday(
            @retrofit2.http.Body PostHolidaysRequest body
    );

    /**
     * Delete a Holiday
     * This API allows to delete a holiday. This is a soft delete the deleted holiday status is marked as deleted.
     *
     * @param holidayId holidayId (required)
     * @return Observable&lt;DeleteHolidaysHolidayIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("holidays/{holidayId}")
    Observable<DeleteHolidaysHolidayIdResponse> delete(
            @retrofit2.http.Path("holidayId") Long holidayId
    );

    /**
     * Activate a Holiday
     * Always Holidays are created in pending state. This API allows to activate a holiday.  Only the active holidays are considered for rescheduling the loan repayment.
     *
     * @param holidayId holidayId (required)
     * @param body      body (required)
     * @param command   command (optional)
     * @return Observable&lt;PostHolidaysHolidayIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("holidays/{holidayId}")
    Observable<PostHolidaysHolidayIdResponse> handleCommands(
            @retrofit2.http.Path("holidayId") Long holidayId, @retrofit2.http.Body PostHolidaysHolidayIdRequest body, @retrofit2.http.Query("command") String command
    );

    /**
     * List Holidays
     * Example Requests:  holidays?officeId&#x3D;1
     *
     * @param officeId   officeId (optional)
     * @param fromDate   fromDate (optional)
     * @param toDate     toDate (optional)
     * @param locale     locale (optional)
     * @param dateFormat dateFormat (optional)
     * @return Observable&lt;List&lt;GetHolidaysResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("holidays")
    Observable<List<GetHolidaysResponse>> retrieveAllHolidays(
            @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("fromDate") String fromDate, @retrofit2.http.Query("toDate") String toDate, @retrofit2.http.Query("locale") String locale, @retrofit2.http.Query("dateFormat") String dateFormat
    );

    /**
     * Retrieve a Holiday
     * Example Requests:  holidays/1
     *
     * @param holidayId holidayId (required)
     * @return Observable&lt;GetHolidaysResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("holidays/{holidayId}")
    Observable<GetHolidaysResponse> retrieveOne(
            @retrofit2.http.Path("holidayId") Long holidayId
    );

    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("holidays/template")
    Observable<String> retrieveRepaymentScheduleUpdationTyeOptions();


    /**
     * Update a Holiday
     * If a holiday is in pending state (created and not activated) then all fields are allowed to modify. Once holidays become active only name and descriptions are allowed to modify.
     *
     * @param holidayId holidayId (required)
     * @param body      body (required)
     * @return Observable&lt;PutHolidaysHolidayIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("holidays/{holidayId}")
    Observable<PutHolidaysHolidayIdResponse> update(
            @retrofit2.http.Path("holidayId") Long holidayId, @retrofit2.http.Body PutHolidaysHolidayIdRequest body
    );

}

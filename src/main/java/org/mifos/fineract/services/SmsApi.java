package org.mifos.fineract.services;

import retrofit2.Call;
import retrofit2.http.*;

public interface SmsApi {
    /**
     * @param body (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("sms")
    Call<String> create(
            @retrofit2.http.Body String body
    );

    /**
     * @param resourceId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("sms/{resourceId}")
    Call<String> delete(
            @retrofit2.http.Path("resourceId") Long resourceId
    );

    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("sms")
    Call<String> retrieveAll();


    /**
     * @param campaignId (required)
     * @param status     (optional)
     * @param fromDate   (optional)
     * @param toDate     (optional)
     * @param locale     (optional)
     * @param dateFormat (optional)
     * @param sqlSearch  (optional)
     * @param offset     (optional)
     * @param limit      (optional)
     * @param orderBy    (optional)
     * @param sortOrder  (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("sms/{campaignId}/messageByStatus")
    Call<String> retrieveAllSmsByStatus(
            @retrofit2.http.Path("campaignId") Long campaignId, @retrofit2.http.Query("status") Long status, @retrofit2.http.Query("fromDate") String fromDate, @retrofit2.http.Query("toDate") String toDate, @retrofit2.http.Query("locale") String locale, @retrofit2.http.Query("dateFormat") String dateFormat, @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
    );

    /**
     * @param resourceId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("sms/{resourceId}")
    Call<String> retrieveOne(
            @retrofit2.http.Path("resourceId") Long resourceId
    );

    /**
     * @param resourceId (required)
     * @param body       (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("sms/{resourceId}")
    Call<String> update(
            @retrofit2.http.Path("resourceId") Long resourceId, @retrofit2.http.Body String body
    );

}

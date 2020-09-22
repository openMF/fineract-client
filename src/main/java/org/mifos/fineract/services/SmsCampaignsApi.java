package org.mifos.fineract.services;

import org.mifos.fineract.models.CommandWrapper;
import retrofit2.http.*;
import rx.Observable;

public interface SmsCampaignsApi {
    /**
     * Create a SMS Campaign
     * Mandatory Fields campaignName, campaignType, triggerType, providerId, runReportId, message  Mandatory Fields for Cash based on selected report id paramValue in json format
     *
     * @param body body (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("smscampaigns")
    Observable<String> createCampaign(
            @retrofit2.http.Body CommandWrapper body
    );

    /**
     * Delete a SMS Campaign
     * Note: Only closed SMS Campaigns can be deleted
     *
     * @param campaignId (required)
     * @return Observable&lt;String&gt;
     */
    @DELETE("smscampaigns/{campaignId}")
    Observable<String> delete(
            @retrofit2.http.Path("campaignId") Long campaignId
    );

    /**
     * SMS Campaign
     * Activates | Deactivates | Reactivates
     *
     * @param campaignId (required)
     * @param command    (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("smscampaigns/{campaignId}")
    Observable<String> handleCommands(
            @retrofit2.http.Path("campaignId") Long campaignId, @retrofit2.http.Query("command") String command
    );

    /**
     * @param body (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("smscampaigns/preview")
    Observable<String> preview(
            @retrofit2.http.Body String body
    );

    /**
     * List SMS Campaigns
     * Example Requests:  smscampaigns
     *
     * @param sqlSearch (optional)
     * @param offset    (optional)
     * @param limit     (optional)
     * @param orderBy   (optional)
     * @param sortOrder (optional)
     * @return Observable&lt;String&gt;
     */
    @GET("smscampaigns")
    Observable<String> retrieveAllEmails(
            @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
    );

    /**
     * Retrieve a SMS Campaign
     * Example Requests:  smscampaigns/1
     *
     * @param resourceId (required)
     * @return Observable&lt;String&gt;
     */
    @GET("smscampaigns/{resourceId}")
    Observable<String> retrieveCampaign(
            @retrofit2.http.Path("resourceId") Long resourceId
    );

    /**
     * Retrieve a SMS Campaign
     * Example Requests:  smscampaigns/1   smscampaigns/1?template&#x3D;true   smscampaigns/template
     *
     * @return Observable&lt;String&gt;
     */
    @GET("smscampaigns/template")
    Observable<String> template();


    /**
     * Update a Campaign
     *
     * @param campaignId (required)
     * @param body       body (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("smscampaigns/{campaignId}")
    Observable<String> updateCampaign(
            @retrofit2.http.Path("campaignId") Long campaignId, @retrofit2.http.Body CommandWrapper body
    );

}

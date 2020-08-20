package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.CommandWrapper;

/**
 * API tests for SmsCampaignsApi
 */
public class SmsCampaignsApiTest {

    private SmsCampaignsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SmsCampaignsApi.class);
    }

    /**
     * Create a SMS Campaign
     * <p>
     * Mandatory Fields campaignName, campaignType, triggerType, providerId, runReportId, message  Mandatory Fields for Cash based on selected report id paramValue in json format
     */
    @Test
    public void createCampaignTest() {
        CommandWrapper body = null;
        // String response = api.createCampaign(body);

        // TODO: test validations
    }

    /**
     * Delete a SMS Campaign
     * <p>
     * Note: Only closed SMS Campaigns can be deleted
     */
    @Test
    public void deleteTest() {
        Long campaignId = null;
        // String response = api.delete(campaignId);

        // TODO: test validations
    }

    /**
     * SMS Campaign
     * <p>
     * Activates | Deactivates | Reactivates
     */
    @Test
    public void handleCommandsTest() {
        Long campaignId = null;
        String command = null;
        // String response = api.handleCommands(campaignId, command);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void previewTest() {
        String body = null;
        // String response = api.preview(body);

        // TODO: test validations
    }

    /**
     * List SMS Campaigns
     * <p>
     * Example Requests:  smscampaigns
     */
    @Test
    public void retrieveAllEmailsTest() {
        String sqlSearch = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // String response = api.retrieveAllEmails(sqlSearch, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve a SMS Campaign
     * <p>
     * Example Requests:  smscampaigns/1
     */
    @Test
    public void retrieveCampaignTest() {
        Long resourceId = null;
        // String response = api.retrieveCampaign(resourceId);

        // TODO: test validations
    }

    /**
     * Retrieve a SMS Campaign
     * <p>
     * Example Requests:  smscampaigns/1   smscampaigns/1?template&#x3D;true   smscampaigns/template
     */
    @Test
    public void templateTest() {
        // String response = api.template();

        // TODO: test validations
    }

    /**
     * Update a Campaign
     */
    @Test
    public void updateCampaignTest() {
        Long campaignId = null;
        CommandWrapper body = null;
        // String response = api.updateCampaign(campaignId, body);

        // TODO: test validations
    }
}

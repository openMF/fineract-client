package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostAdhocQuerySearchRequest;

/**
 * API tests for SearchApiApi
 */
public class SearchApiTest {

    private SearchApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SearchApi.class);
    }

    /**
     * Adhoc query search
     *
     * AdHocQuery search has more search options, it is a POST request, it uses request body to send search parameters   Mandatory fields:entities  Optional fields:loanStatus, loanProducts, offices, loanDateOption, loanFromDate, loanToDate,  includeOutStandingAmountPercentage, outStandingAmountPercentageCondition,  minOutStandingAmountPercentage and maxOutStandingAmountPercentage OR outStandingAmountPercentage,  includeOutstandingAmount, outstandingAmountCondition,  minOutstandingAmount and maxOutstandingAmount OR outstandingAmount
     */
    @Test
    public void advancedSearchTest() {
        PostAdhocQuerySearchRequest body2 = null;
        String body = null;
        // PostAdhocQuerySearchResponse response = api.advancedSearch(body2, body);

        // TODO: test validations
    }
    /**
     * Retrive Adhoc Search query template
     *
     * Mandatory Fields  search?query&#x3D;000000001
     */
    @Test
    public void retrieveAdHocSearchQueryTemplateTest() {
        // GetSearchResponse response = api.retrieveAdHocSearchQueryTemplate();

        // TODO: test validations
    }
    /**
     * Search Resources
     *
     * Example Requests:  search?query&#x3D;000000001   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups&amp;exactMatch&#x3D;true
     */
    @Test
    public void searchDataTest() {
        String query = null;
        String resource = null;
        Boolean exactMatch = null;
        // GetSearchResponse response = api.searchData(query, resource, exactMatch);

        // TODO: test validations
    }
}

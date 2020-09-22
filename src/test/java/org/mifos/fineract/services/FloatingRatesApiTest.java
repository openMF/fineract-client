package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostFloatingRatesRequest;
import org.mifos.fineract.models.PutFloatingRatesFloatingRateIdRequest;

/**
 * API tests for FloatingRatesApi
 */
public class FloatingRatesApiTest {

    private FloatingRatesApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(FloatingRatesApi.class);
    }

    /**
     * Create a new Floating Rate
     *
     * Creates a new Floating Rate Mandatory Fields: name Optional Fields: isBaseLendingRate, isActive, ratePeriods
     */
    @Test
    public void createFloatingRateTest() {
        PostFloatingRatesRequest body = null;
        // PostFloatingRatesResponse response = api.createFloatingRate(body);

        // TODO: test validations
    }
    /**
     * List Floating Rates
     *
     * Lists Floating Rates
     */
    @Test
    public void retrieveAllTest() {
        // List<GetFloatingRatesResponse> response = api.retrieveAll();

        // TODO: test validations
    }
    /**
     * Retrieve Floating Rate
     *
     * Retrieves Floating Rate
     */
    @Test
    public void retrieveOneTest() {
        Long floatingRateId = null;
        // GetFloatingRatesFloatingRateIdResponse response = api.retrieveOne(floatingRateId);

        // TODO: test validations
    }
    /**
     * Update Floating Rate
     *
     * Updates new Floating Rate. Rate Periods in the past cannot be modified. All the future rateperiods would be replaced with the new ratePeriods data sent.
     */
    @Test
    public void updateFloatingRateTest() {
        Long floatingRateId = null;
        PutFloatingRatesFloatingRateIdRequest body = null;
        // PutFloatingRatesFloatingRateIdResponse response = api.updateFloatingRate(floatingRateId, body);

        // TODO: test validations
    }
}

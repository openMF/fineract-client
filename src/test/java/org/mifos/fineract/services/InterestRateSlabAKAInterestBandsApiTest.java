package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostInterestRateChartsChartIdChartSlabsRequest;
import org.mifos.fineract.models.PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest;

/**
 * API tests for InterestRateSlabAKAInterestBandsApi
 */
public class InterestRateSlabAKAInterestBandsApiTest {

    private InterestRateSlabAKAInterestBandsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(InterestRateSlabAKAInterestBandsApi.class);
    }

    /**
     * Create a Slab
     *
     * Creates a new interest rate slab for an interest rate chart. Mandatory Fields periodType, fromPeriod, annualInterestRate Optional Fields toPeriod and description Example Requests:  interestratecharts/1/chartslabs
     */
    @Test
    public void createTest() {
        Long chartId = null;
        PostInterestRateChartsChartIdChartSlabsRequest body = null;
        // PostInterestRateChartsChartIdChartSlabsResponse response = api.create(chartId, body);

        // TODO: test validations
    }
    /**
     * Delete a Slab
     *
     * Delete a Slab from a chart
     */
    @Test
    public void deleteTest() {
        Long chartId = null;
        Long chartSlabId = null;
        // DeleteInterestRateChartsChartIdChartSlabsResponse response = api.delete(chartId, chartSlabId);

        // TODO: test validations
    }
    /**
     * Retrieve all Slabs
     *
     * Retrieve list of slabs associated with a chart  Example Requests:  interestratecharts/1/chartslabs
     */
    @Test
    public void retrieveAllTest() {
        Long chartId = null;
        // List<GetInterestRateChartsChartIdChartSlabsResponse> response = api.retrieveAll(chartId);

        // TODO: test validations
    }

    /**
     * Retrieve a Slab
     * <p>
     * Retrieve a slab associated with an Interest rate chart  Example Requests:  interestratecharts/1/chartslabs/1
     */
    @Test
    public void retrieveOneTest() {
        Long chartId = null;
        Long chartSlabId = null;
        // GetInterestRateChartsChartIdChartSlabsResponse response = api.retrieveOne(chartId, chartSlabId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void templateTest() {
        // String response = api.template();

        // TODO: test validations
    }
    /**
     * Update a Slab
     *
     * It updates the Slab from chart
     */
    @Test
    public void updateTest() {
        Long chartId = null;
        Long chartSlabId = null;
        PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest body = null;
        // PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse response = api.update(chartId, chartSlabId, body);

        // TODO: test validations
    }
}

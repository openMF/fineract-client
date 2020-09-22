package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostInterestRateChartsRequest;
import org.mifos.fineract.models.PutInterestRateChartsChartIdRequest;

/**
 * API tests for InterestRateChartApi
 */
public class InterestRateChartApiTest {

    private InterestRateChartApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(InterestRateChartApi.class);
    }

    /**
     * Create a Chart
     *
     * Creates a new chart which can be attached to a term deposit products (FD or RD).
     */
    @Test
    public void createTest() {
        PostInterestRateChartsRequest body = null;
        // PostInterestRateChartsResponse response = api.create(body);

        // TODO: test validations
    }
    /**
     * Delete a Chart
     *
     * It deletes the chart
     */
    @Test
    public void deleteTest() {
        Long chartId = null;
        // DeleteInterestRateChartsChartIdResponse response = api.delete(chartId);

        // TODO: test validations
    }
    /**
     * Retrieve all Charts
     *
     * Retrieve list of charts associated with a term deposit product(FD or RD). Example Requests:  interestratecharts?productId&#x3D;1
     */
    @Test
    public void retrieveAllTest() {
        Long productId = null;
        // List<GetInterestRateChartsResponse> response = api.retrieveAll(productId);

        // TODO: test validations
    }
    /**
     * Retrieve a Chart
     *
     * It retrieves the Interest Rate Chart Example Requests:  interestratecharts/1
     */
    @Test
    public void retrieveOneTest() {
        Long chartId = null;
        // GetInterestRateChartsResponse response = api.retrieveOne(chartId);

        // TODO: test validations
    }
    /**
     * Retrieve Chart Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for creating a chart. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  interestratecharts/template
     */
    @Test
    public void templateTest() {
        // GetInterestRateChartsTemplateResponse response = api.template();

        // TODO: test validations
    }
    /**
     * Update a Chart
     *
     * It updates the Chart.
     */
    @Test
    public void updateTest() {
        Long chartId = null;
        PutInterestRateChartsChartIdRequest body = null;
        // PutInterestRateChartsChartIdResponse response = api.update(chartId, body);

        // TODO: test validations
    }
}

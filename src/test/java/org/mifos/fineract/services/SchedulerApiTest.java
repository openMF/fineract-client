package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for SchedulerApi
 */
public class SchedulerApiTest {

    private SchedulerApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SchedulerApi.class);
    }

    /**
     * Activate Scheduler Jobs | Suspend Scheduler Jobs
     * <p>
     * Activates the scheduler job service. | Suspends the scheduler job service.
     */
    @Test
    public void changeSchedulerStatusTest() {
        String command = null;
        // api.changeSchedulerStatus(command);

        // TODO: test validations
    }

    /**
     * Retrieve Scheduler Status
     * <p>
     * Returns the scheduler status.  Example Requests:  scheduler
     */
    @Test
    public void retrieveStatusTest() {
        // GetSchedulerResponse response = api.retrieveStatus();

        // TODO: test validations
    }
}

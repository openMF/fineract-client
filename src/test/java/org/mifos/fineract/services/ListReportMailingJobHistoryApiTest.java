package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for ListReportMailingJobHistoryApi
 */
public class ListReportMailingJobHistoryApiTest {

    private ListReportMailingJobHistoryApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(ListReportMailingJobHistoryApi.class);
    }

    /**
     * List Report Mailing Job History
     * <p>
     * The list capability of report mailing job history can support pagination and sorting.  Example Requests:  reportmailingjobrunhistory/1
     */
    @Test
    public void retrieveAllByReportMailingJobIdTest() {
        Long reportMailingJobId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // ReportMailingJobRunHistoryData response = api.retrieveAllByReportMailingJobId(reportMailingJobId, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }
}

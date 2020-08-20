package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostBatchesRequest;

/**
 * API tests for BatchApiApi
 */
public class BatchApiApiTest {

    private BatchApiApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(BatchApiApi.class);
    }

    /**
     * Batch requests in a single transaction
     * <p>
     * The Apache Fineract Batch API is also capable of executing all the requests in a single transaction, by setting a Query Parameter, \&quot;enclosingTransaction&#x3D;true\&quot;. So, if one or more of the requests in a batch returns an erroneous response all of the Data base transactions made by other successful requests will be rolled back.  If there has been a rollback in a transaction then a single response will be provided, with a &#39;400&#39; status code and a body consisting of the error details of the first failed request.
     */
    @Test
    public void handleBatchRequestsTest() {
        PostBatchesRequest body = null;
        Boolean enclosingTransaction = null;
        // BatchResponse response = api.handleBatchRequests(body, enclosingTransaction);

        // TODO: test validations
    }
}

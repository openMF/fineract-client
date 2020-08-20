package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PutExternalServiceRequest;

/**
 * API tests for ExternalServicesApi
 */
public class ExternalServicesApiTest {

    private ExternalServicesApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(ExternalServicesApi.class);
    }

    /**
     * Retrieve External Services Configuration
     * <p>
     * Returns a external Service configurations based on the Service Name.  Service Names supported are S3 and SMTP.  Example Requests:  externalservice/SMTP
     */
    @Test
    public void retrieveOneTest() {
        String servicename = null;
        // ExternalServicesPropertiesData response = api.retrieveOne(servicename);

        // TODO: test validations
    }

    /**
     * Update External Service
     * <p>
     * Updates the external Service Configuration for a Service Name.  Example:   externalservice/S3
     */
    @Test
    public void updateExternalServicePropertiesTest() {
        String servicename = null;
        PutExternalServiceRequest body = null;
        // api.updateExternalServiceProperties(servicename, body);

        // TODO: test validations
    }
}

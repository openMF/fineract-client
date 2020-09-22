package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PutCachesRequest;

/**
 * API tests for CacheApi
 */
public class CacheApiTest {

    private CacheApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(CacheApi.class);
    }

    /**
     * Retrieve Cache Types
     *
     * Returns the list of caches.  Example Requests:  caches
     */
    @Test
    public void retrieveAllTest() {
        // List<GetCachesResponse> response = api.retrieveAll();

        // TODO: test validations
    }
    /**
     * Switch Cache
     *
     * Switches the cache to chosen one.
     */
    @Test
    public void switchCacheTest() {
        PutCachesRequest body = null;
        // PutCachesResponse response = api.switchCache(body);

        // TODO: test validations
    }
}

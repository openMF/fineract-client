package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.PutCachesRequest;

/**
 * API tests for CacheApi
 */
public class CacheApiTest {

    private CacheApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CacheApi.class);
    }

    /**
     * Retrieve Cache Types
     * <p>
     * Returns the list of caches.  Example Requests:  caches
     */
    @Test
    public void retrieveAllTest() {
        // List<GetCachesResponse> response = api.retrieveAll();

        // TODO: test validations
    }

    /**
     * Switch Cache
     * <p>
     * Switches the cache to chosen one.
     */
    @Test
    public void switchCacheTest() {
        PutCachesRequest body = null;
        // PutCachesResponse response = api.switchCache(body);

        // TODO: test validations
    }
}

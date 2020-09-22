package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for DomainNameapiv1entitytoentitymappingApi
 */
public class DomainNameapiv1entitytoentitymappingApiTest {

    private DomainNameapiv1entitytoentitymappingApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(DomainNameapiv1entitytoentitymappingApi.class);
    }

    /**
     *
     */
    @Test
    public void createMapTest() {
        Long relId = null;
        String body = null;
        // String response = api.createMap(relId, body);

        // TODO: test validations
    }
    /**
     *
     */
    @Test
    public void deleteTest() {
        Long mapId = null;
        // String response = api.delete(mapId);

        // TODO: test validations
    }
    /**
     * 
     *
     *
     */
    @Test
    public void getEntityToEntityMappingsTest() {
        Long mapId = null;
        Long fromId = null;
        Long toId = null;
        // String response = api.getEntityToEntityMappings(mapId, fromId, toId);

        // TODO: test validations
    }
    /**
     * 
     *
     *
     */
    @Test
    public void retrieveAllTest() {
        // String response = api.retrieveAll();

        // TODO: test validations
    }
    /**
     * 
     *
     *
     */
    @Test
    public void retrieveOneTest() {
        Long mapId = null;
        // String response = api.retrieveOne(mapId);

        // TODO: test validations
    }
    /**
     * 
     *
     *
     */
    @Test
    public void updateMapTest() {
        Long mapId = null;
        String body = null;
        // String response = api.updateMap(mapId, body);

        // TODO: test validations
    }
}

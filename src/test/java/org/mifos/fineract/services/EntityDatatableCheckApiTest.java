package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostEntityDatatableChecksTemplateRequest;

/**
 * API tests for EntityDatatableCheckApi
 */
public class EntityDatatableCheckApiTest {

    private EntityDatatableCheckApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(EntityDatatableCheckApi.class);
    }

    /**
     * Create Entity-Datatable Checks
     * <p>
     * Mandatory Fields :  entity, status, datatableName  Non-Mandatory Fields :  productId
     */
    @Test
    public void createEntityDatatableCheckTest() {
        PostEntityDatatableChecksTemplateRequest body = null;
        // PostEntityDatatableChecksTemplateResponse response = api.createEntityDatatableCheck(body);

        // TODO: test validations
    }

    /**
     * Delete Entity-Datatable Checks
     * <p>
     * Deletes an existing Entity-Datatable Check
     */
    @Test
    public void deleteDatatableTest() {
        Long entityDatatableCheckId = null;
        String body = null;
        // DeleteEntityDatatableChecksTemplateResponse response = api.deleteDatatable(entityDatatableCheckId, body);

        // TODO: test validations
    }

    /**
     * Retrieve Entity-Datatable Checks Template
     * <p>
     * This is a convenience resource useful for building maintenance user interface screens for Entity-Datatable Checks applications. The template data returned consists of:  Allowed Value Lists Example Request:  entityDatatableChecks/template
     */
    @Test
    public void getTemplateTest() {
        // GetEntityDatatableChecksTemplateResponse response = api.getTemplate();

        // TODO: test validations
    }

    /**
     * List Entity-Datatable Checks
     * <p>
     * The list capability of Entity-Datatable Checks can support pagination.  OPTIONAL ARGUMENTS offset Integer optional, defaults to 0 Indicates the result from which pagination startslimit Integer optional, defaults to 200 Restricts the size of results returned. To override the default and return all entries you must explicitly pass a non-positive integer value for limit e.g. limit&#x3D;0, or limit&#x3D;-1 Example Request:  entityDatatableChecks?offset&#x3D;0&amp;limit&#x3D;15
     */
    @Test
    public void retrieveAllTest() {
        Long status = null;
        String entity = null;
        Long productId = null;
        Integer offset = null;
        Integer limit = null;
        // List<GetEntityDatatableChecksResponse> response = api.retrieveAll(status, entity, productId, offset, limit);

        // TODO: test validations
    }
}

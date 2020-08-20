package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostTemplatesRequest;
import org.mifos.fineract.models.PutTemplatesTemplateIdRequest;

/**
 * API tests for UserGeneratedDocumentsApi
 */
public class UserGeneratedDocumentsApiTest {

    private UserGeneratedDocumentsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(UserGeneratedDocumentsApi.class);
    }

    /**
     * Add a UGD
     * <p>
     * Adds a new UGD.  Mandatory Fields name    Example Requests:  templates/1
     */
    @Test
    public void createTemplateTest() {
        PostTemplatesRequest body = null;
        // PostTemplatesResponse response = api.createTemplate(body);

        // TODO: test validations
    }

    /**
     * Delete a UGD
     */
    @Test
    public void deleteTemplateTest() {
        Long templateId = null;
        // DeleteTemplatesTemplateIdResponse response = api.deleteTemplate(templateId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getTemplateByTemplateTest() {
        Long templateId = null;
        // String response = api.getTemplateByTemplate(templateId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void mergeTemplateTest() {
        Long templateId = null;
        String body = null;
        // String response = api.mergeTemplate(templateId, body);

        // TODO: test validations
    }

    /**
     * Retrieve all UGDs
     * <p>
     * Example Requests:  templates  It is also possible to get specific UGDs by entity and type:  templates?type&#x3D;0&amp;entity&#x3D;0 [Entity: Id]      client: 0, loan: 1  [Type: Id]    Document: 0, E-Mail (not yet): 1,  SMS: 2
     */
    @Test
    public void retrieveAllTest() {
        Integer typeId = null;
        Integer entityId = null;
        // GetTemplatesResponse response = api.retrieveAll(typeId, entityId);

        // TODO: test validations
    }

    /**
     * Retrieve a UGD
     * <p>
     * Example Requests:  templates/1
     */
    @Test
    public void retrieveOneTest() {
        Long templateId = null;
        // GetTemplatesTemplateIdResponse response = api.retrieveOne(templateId);

        // TODO: test validations
    }

    /**
     * Update a UGD
     */
    @Test
    public void saveTemplateTest() {
        Long templateId = null;
        PutTemplatesTemplateIdRequest body = null;
        // PutTemplatesTemplateIdResponse response = api.saveTemplate(templateId, body);

        // TODO: test validations
    }

    /**
     * Retrieve UGD Details Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for UGDs. The UGD data returned consists of any or all of:  ARGUMENTS name String entity String type String text String optional mappers Mapper optional Example Request:  templates/template
     */
    @Test
    public void templateTest() {
        // GetTemplatesTemplateResponse response = api.template();

        // TODO: test validations
    }
}

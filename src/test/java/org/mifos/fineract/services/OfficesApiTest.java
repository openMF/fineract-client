package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostOfficesRequest;
import org.mifos.fineract.models.PutOfficesOfficeIdRequest;

import java.io.File;

/**
 * API tests for OfficesApi
 */
public class OfficesApiTest {

    private OfficesApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(OfficesApi.class);
    }

    /**
     * Create an Office
     * <p>
     * Mandatory Fields name, openingDate, parentId
     */
    @Test
    public void createOfficeTest() {
        PostOfficesRequest body = null;
        // PostOfficesResponse response = api.createOffice(body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void getOfficeTemplateTest() {
        String dateFormat = null;
        // api.getOfficeTemplate(dateFormat);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void postOfficeTemplateTest() {
        File file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postOfficeTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * Retrieve an Office
     * <p>
     * Example Requests:  offices/1   offices/1?template&#x3D;true   offices/1?fields&#x3D;id,name,parentName
     */
    @Test
    public void retreiveOfficeTest() {
        Long officeId = null;
        // GetOfficesResponse response = api.retreiveOffice(officeId);

        // TODO: test validations
    }

    /**
     * Retrieve Office Details Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  offices/template
     */
    @Test
    public void retrieveOfficeTemplateTest() {
        // GetOfficesTemplateResponse response = api.retrieveOfficeTemplate();

        // TODO: test validations
    }

    /**
     * List Offices
     * <p>
     * Example Requests:  offices   offices?fields&#x3D;id,name,openingDate
     */
    @Test
    public void retrieveOfficesTest() {
        Boolean includeAllOffices = null;
        String orderBy = null;
        String sortOrder = null;
        // List<GetOfficesResponse> response = api.retrieveOffices(includeAllOffices, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Update Office
     */
    @Test
    public void updateOfficeTest() {
        Long officeId = null;
        PutOfficesOfficeIdRequest body = null;
        // PutOfficesOfficeIdResponse response = api.updateOffice(officeId, body);

        // TODO: test validations
    }
}

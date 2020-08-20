package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostCollectionSheetRequest;

/**
 * API tests for CollectionSheetApi
 */
public class CollectionSheetApiTest {

    private CollectionSheetApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(CollectionSheetApi.class);
    }

    /**
     * Generate Individual Collection Sheet | Save Collection Sheet
     * <p>
     * Generate Individual Collection Sheet:  This Api retrieves repayment details of all individual loans under a office as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of individual loans and deposit of mandatory savings on a given meeting date.
     */
    @Test
    public void generateCollectionSheetTest() {
        PostCollectionSheetRequest body = null;
        String command = null;
        // PostCollectionSheetResponse response = api.generateCollectionSheet(body, command);

        // TODO: test validations
    }
}

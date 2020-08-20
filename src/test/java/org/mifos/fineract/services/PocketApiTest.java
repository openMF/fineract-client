package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;

/**
 * API tests for PocketApi
 */
public class PocketApiTest {

    private PocketApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PocketApi.class);
    }

    /**
     * Link/delink accounts to/from pocket
     * <p>
     * Pockets behave as favourites. An user can link his/her Loan, Savings and Share accounts to pocket for faster access. In a similar way linked accounts can be delinked from the pocket.  Example Requests:  self/pockets?command&#x3D;linkAccounts  self/pockets?command&#x3D;delinkAccounts
     */
    @Test
    public void handleCommandsTest() {
        String command = null;
        String body = null;
        // PostLinkDelinkAccountsToFromPocketResponse response = api.handleCommands(command, body);

        // TODO: test validations
    }

    /**
     * Retrieve accounts linked to pocket
     * <p>
     * All linked loan  Example Requests:   self/pockets
     */
    @Test
    public void retrieveAllTest() {
        // GetAccountsLinkedToPocketResponse response = api.retrieveAll();

        // TODO: test validations
    }
}

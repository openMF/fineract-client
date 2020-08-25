package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for MakerCheckerOr4EyeFunctionalityApi
 */
public class CheckerInboxApiTest {

    private CheckerInboxApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(CheckerInboxApi.class);
    }

    /**
     * Approve Maker Checker Entry | Reject Maker Checker Entry
     */
    @Test
    public void approveMakerCheckerEntryTest() {
        Long auditId = null;
        String command = null;
        // PostMakerCheckersResponse response = api.approveMakerCheckerEntry(auditId, command);

        // TODO: test validations
    }

    /**
     * Delete Maker Checker Entry
     */
    @Test
    public void deleteMakerCheckerEntryTest() {
        Long auditId = null;
        // PostMakerCheckersResponse response = api.deleteMakerCheckerEntry(auditId);

        // TODO: test validations
    }

    /**
     * Maker Checker Search Template
     * <p>
     * This is a convenience resource. It can be useful when building a Checker Inbox UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with. \&quot;actionNames\&quot; and \&quot;entityNames\&quot; returned are those that the requestor has Checker approval permissions for.  Example Requests:  makercheckers/searchtemplate makercheckers/searchtemplate?fields&#x3D;entityNames
     */
    @Test
    public void retrieveAuditSearchTemplateTest() {
        // GetMakerCheckersSearchTemplateResponse response = api.retrieveAuditSearchTemplate();

        // TODO: test validations
    }

    /**
     * List Maker Checker Entries
     * <p>
     * Get a list of entries that can be checked by the requestor that match the criteria supplied.  Example Requests:  makercheckers  makercheckers?fields&#x3D;madeOnDate,maker,processingResult  makercheckers?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  makercheckers?officeId&#x3D;1  makercheckers?officeId&#x3D;1&amp;includeJson&#x3D;true
     */
    @Test
    public void retrieveCommandsTest() {
        String actionName = null;
        String entityName = null;
        Long resourceId = null;
        Long makerId = null;
        String makerDateTimeFrom = null;
        String makerDateTimeTo = null;
        Integer officeId = null;
        Integer groupId = null;
        Integer clientId = null;
        Integer loanid = null;
        Integer savingsAccountId = null;
        // List<GetMakerCheckerResponse> response = api.retrieveCommands(actionName, entityName, resourceId, makerId, makerDateTimeFrom, makerDateTimeTo, officeId, groupId, clientId, loanid, savingsAccountId);

        // TODO: test validations
    }
}

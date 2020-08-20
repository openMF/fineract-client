package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;

/**
 * API tests for AuditsApi
 */
public class AuditsApiTest {

    private AuditsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(AuditsApi.class);
    }

    /**
     * List Audits
     * <p>
     * Get a 200 list of audits that match the criteria supplied and sorted by audit id in descending order, and are within the requestors&#39; data scope. Also it supports pagination and sorting  Example Requests:  audits  audits?fields&#x3D;madeOnDate,maker,processingResult  audits?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  audits?officeId&#x3D;1  audits?officeId&#x3D;1&amp;includeJson&#x3D;true
     */
    @Test
    public void retrieveAuditEntriesTest() {
        String actionName = null;
        String entityName = null;
        Long resourceId = null;
        Long makerId = null;
        String makerDateTimeFrom = null;
        String makerDateTimeTo = null;
        Long checkerId = null;
        String checkerDateTimeFrom = null;
        String checkerDateTimeTo = null;
        Integer processingResult = null;
        Integer officeId = null;
        Integer groupId = null;
        Integer clientId = null;
        Integer loanid = null;
        Integer savingsAccountId = null;
        Boolean paged = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // List<GetMakerCheckerResponse> response = api.retrieveAuditEntries(actionName, entityName, resourceId, makerId, makerDateTimeFrom, makerDateTimeTo, checkerId, checkerDateTimeFrom, checkerDateTimeTo, processingResult, officeId, groupId, clientId, loanid, savingsAccountId, paged, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve an Audit Entry
     * <p>
     * Example Requests:  audits/20 audits/20?fields&#x3D;madeOnDate,maker,processingResult
     */
    @Test
    public void retrieveAuditEntryTest() {
        Long auditId = null;
        // GetMakerCheckerResponse response = api.retrieveAuditEntry(auditId);

        // TODO: test validations
    }

    /**
     * Audit Search Template
     * <p>
     * This is a convenience resource. It can be useful when building an Audit Search UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with.  Example Requests:  audits/searchtemplate audits/searchtemplate?fields&#x3D;actionNames
     */
    @Test
    public void retrieveAuditSearchTemplateTest() {
        // GetMakerCheckersSearchTemplateResponse response = api.retrieveAuditSearchTemplate();

        // TODO: test validations
    }
}

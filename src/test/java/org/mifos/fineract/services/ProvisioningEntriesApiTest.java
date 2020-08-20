package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.PostProvisioningEntriesRequest;
import org.mifos.fineract.models.PutProvisioningEntriesRequest;

/**
 * API tests for ProvisioningEntriesApi
 */
public class ProvisioningEntriesApiTest {

    private ProvisioningEntriesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ProvisioningEntriesApi.class);
    }

    /**
     * Create new Provisioning Entries
     * <p>
     * Creates a new Provisioning Entries  Mandatory Fields date dateFormat locale Optional Fields createjournalentries
     */
    @Test
    public void createProvisioningEntriesTest() {
        PostProvisioningEntriesRequest body = null;
        // PostProvisioningEntriesResponse response = api.createProvisioningEntries(body);

        // TODO: test validations
    }

    /**
     * Recreates Provisioning Entry
     * <p>
     * Recreates Provisioning Entry | createjournalentry.
     */
    @Test
    public void modifyProvisioningEntryTest() {
        Long entryId = null;
        String command = null;
        PutProvisioningEntriesRequest body = null;
        // PutProvisioningEntriesResponse response = api.modifyProvisioningEntry(entryId, command, body);

        // TODO: test validations
    }

    /**
     * List all Provisioning Entries
     */
    @Test
    public void retrieveAllProvisioningEntriesTest() {
        Integer offset = null;
        Integer limit = null;
        // List<ProvisioningEntryData> response = api.retrieveAllProvisioningEntries(offset, limit);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveProviioningEntriesTest() {
        Long entryId = null;
        Integer offset = null;
        Integer limit = null;
        Long officeId = null;
        Long productId = null;
        Long categoryId = null;
        // LoanProductProvisioningEntryData response = api.retrieveProviioningEntries(entryId, offset, limit, officeId, productId, categoryId);

        // TODO: test validations
    }

    /**
     * Retrieves a Provisioning Entry
     * <p>
     * Returns the details of a generated Provisioning Entry.
     */
    @Test
    public void retrieveProvisioningEntryTest() {
        Long entryId = null;
        // ProvisioningEntryData response = api.retrieveProvisioningEntry(entryId);

        // TODO: test validations
    }
}

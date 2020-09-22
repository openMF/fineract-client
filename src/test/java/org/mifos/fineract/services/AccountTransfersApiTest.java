package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostAccountTransfersRefundByTransferRequest;
import org.mifos.fineract.models.PostAccountTransfersRequest;

/**
 * API tests for AccountTransfersApi
 */
public class AccountTransfersApiTest {

    private AccountTransfersApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(AccountTransfersApi.class);
    }

    /**
     * Create new Transfer
     *
     * Ability to create new transfer of monetary funds from one account to another.
     */
    @Test
    public void createTest() {
        PostAccountTransfersRequest body = null;
        // PostAccountTransfersResponse response = api.create(body);

        // TODO: test validations
    }
    /**
     * List account transfers
     *
     * Lists account&#39;s transfers  Example Requests:    accounttransfers
     */
    @Test
    public void retrieveAllTest() {
        String sqlSearch = null;
        String externalId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        Long accountDetailId = null;
        // GetAccountTransfersResponse response = api.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountDetailId);

        // TODO: test validations
    }
    /**
     * Retrieve account transfer
     *
     * Retrieves account transfer  Example Requests :    accounttransfers/1
     */
    @Test
    public void retrieveOneTest() {
        Long transferId = null;
        // GetAccountTransfersPageItems response = api.retrieveOne(transferId);

        // TODO: test validations
    }
    /**
     * Retrieve Account Transfer Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1    accounttransfers/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1
     */
    @Test
    public void templateTest() {
        Long fromOfficeId = null;
        Long fromClientId = null;
        Long fromAccountId = null;
        Integer fromAccountType = null;
        Long toOfficeId = null;
        Long toClientId = null;
        Long toAccountId = null;
        Integer toAccountType = null;
        // GetAccountTransfersTemplateResponse response = api.template(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType);

        // TODO: test validations
    }
    /**
     * Retrieve Refund of an Active Loan by Transfer Template
     *
     * Retrieves Refund of an Active Loan by Transfer TemplateExample Requests :    accounttransfers/templateRefundByTransfer?fromAccountId&#x3D;2&amp;fromAccountType&#x3D;1&amp; toAccountId&#x3D;1&amp;toAccountType&#x3D;2&amp;toClientId&#x3D;1&amp;toOfficeId&#x3D;1
     */
    @Test
    public void templateRefundByTransferTest() {
        Long fromOfficeId = null;
        Long fromClientId = null;
        Long fromAccountId = null;
        Integer fromAccountType = null;
        Long toOfficeId = null;
        Long toClientId = null;
        Long toAccountId = null;
        Integer toAccountType = null;
        // GetAccountTransfersTemplateRefundByTransferResponse response = api.templateRefundByTransfer(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType);

        // TODO: test validations
    }
    /**
     * Refund of an Active Loan by Transfer
     *
     * Ability to refund an active loan by transferring to a savings account.
     */
    @Test
    public void templateRefundByTransferPostTest() {
        PostAccountTransfersRefundByTransferRequest body = null;
        // PostAccountTransfersRefundByTransferResponse response = api.templateRefundByTransferPost(body);

        // TODO: test validations
    }
}

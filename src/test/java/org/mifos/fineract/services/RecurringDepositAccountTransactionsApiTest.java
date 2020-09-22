package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest;

/**
 * API tests for RecurringDepositAccountTransactionsApi
 */
public class RecurringDepositAccountTransactionsApiTest {

    private RecurringDepositAccountTransactionsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(RecurringDepositAccountTransactionsApi.class);
    }

    /**
     * Adjust Transaction | Undo transaction
     *
     * Adjust Transaction:  This command modifies the given transaction.  Undo transaction:  This command reverses the given transaction.  Showing request/response for &#39;Adjust Transaction&#39;
     */
    @Test
    public void handleTransactionCommandsTest() {
        Long recurringDepositAccountId = null;
        Long transactionId = null;
        PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest body = null;
        String command = null;
        // PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse response = api.handleTransactionCommands(recurringDepositAccountId, transactionId, body, command);

        // TODO: test validations
    }
    /**
     * Retrieve Recurring Deposit Account Transaction
     *
     * Retrieves Recurring Deposit Account Transaction  Example Requests:  recurringdepositaccounts/1/transactions/1
     */
    @Test
    public void retrieveOneTest() {
        Long recurringDepositAccountId = null;
        Long transactionId = null;
        // GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse response = api.retrieveOne(recurringDepositAccountId, transactionId);

        // TODO: test validations
    }
    /**
     * Retrieve Recurring Deposit Account Transaction Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  recurringdepositaccounts/1/transactions/template?command&#x3D;deposit  recurringdepositaccounts/1/transactions/template?command&#x3D;withdrawal
     */
    @Test
    public void retrieveTemplateTest() {
        Long recurringDepositAccountId = null;
        String command = null;
        // GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse response = api.retrieveTemplate(recurringDepositAccountId, command);

        // TODO: test validations
    }
    /**
     * Deposit Transaction | Withdrawal Transaction
     *
     * Deposit Transaction:  Used for a deposit transaction  Withdrawal Transaction:  Used for a Withdrawal Transaction  Showing request/response for Deposit Transaction
     */
    @Test
    public void transactionTest() {
        Long recurringDepositAccountId = null;
        PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest body = null;
        String command = null;
        // PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse response = api.transaction(recurringDepositAccountId, body, command);

        // TODO: test validations
    }
}

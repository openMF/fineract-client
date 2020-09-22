package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface RecurringDepositAccountTransactionsApi {
    /**
     * Adjust Transaction | Undo transaction
     * Adjust Transaction:  This command modifies the given transaction.  Undo transaction:  This command reverses the given transaction.  Showing request/response for &#39;Adjust Transaction&#39;
     *
     * @param recurringDepositAccountId recurringDepositAccountId (required)
     * @param transactionId             transactionId (required)
     * @param body                      body (required)
     * @param command                   command (optional)
     * @return Observable&lt;PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId}")
    Observable<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> handleTransactionCommands(
            @retrofit2.http.Path("recurringDepositAccountId") Long recurringDepositAccountId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Body PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest body, @retrofit2.http.Query("command") String command
    );

    /**
     * Retrieve Recurring Deposit Account Transaction
     * Retrieves Recurring Deposit Account Transaction  Example Requests:  recurringdepositaccounts/1/transactions/1
     *
     * @param recurringDepositAccountId recurringDepositAccountId (required)
     * @param transactionId             transactionId (required)
     * @return Observable&lt;GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId}")
    Observable<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> retrieveOne(
            @retrofit2.http.Path("recurringDepositAccountId") Long recurringDepositAccountId, @retrofit2.http.Path("transactionId") Long transactionId
    );

    /**
     * Retrieve Recurring Deposit Account Transaction Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  recurringdepositaccounts/1/transactions/template?command&#x3D;deposit  recurringdepositaccounts/1/transactions/template?command&#x3D;withdrawal
     *
     * @param recurringDepositAccountId recurringDepositAccountId (required)
     * @param command                   command (optional)
     * @return Observable&lt;GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("recurringdepositaccounts/{recurringDepositAccountId}/transactions/template")
    Observable<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse> retrieveTemplate(
            @retrofit2.http.Path("recurringDepositAccountId") Long recurringDepositAccountId, @retrofit2.http.Query("command") String command
    );

    /**
     * Deposit Transaction | Withdrawal Transaction
     * Deposit Transaction:  Used for a deposit transaction  Withdrawal Transaction:  Used for a Withdrawal Transaction  Showing request/response for Deposit Transaction
     *
     * @param recurringDepositAccountId recurringDepositAccountId (required)
     * @param body                      body (required)
     * @param command                   command (optional)
     * @return Observable&lt;PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("recurringdepositaccounts/{recurringDepositAccountId}/transactions")
    Observable<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse> transaction(
            @retrofit2.http.Path("recurringDepositAccountId") Long recurringDepositAccountId, @retrofit2.http.Body PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest body, @retrofit2.http.Query("command") String command
    );

}

package org.mifos.fineract.services;

import org.mifos.fineract.models.GetSelfSavingsAccountsAccountIdChargesResponse;
import org.mifos.fineract.models.GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse;
import org.mifos.fineract.models.GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse;
import org.mifos.fineract.models.GetSelfSavingsAccountsResponse;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

import java.util.List;

public interface SelfSavingsAccountApi {
    /**
     * @param accountId (required)
     * @param command   (optional)
     * @param body      (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("self/savingsaccounts/{accountId}")
    Observable<String> modifySavingsAccountApplication(
            @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
    );

    /**
     * List Savings Charges
     * Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
     *
     * @param accountId    accountId (required)
     * @param chargeStatus chargeStatus (optional, default to all)
     * @return Observable&lt;List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/savingsaccounts/{accountId}/charges")
    Observable<List<GetSelfSavingsAccountsAccountIdChargesResponse>> retrieveAllSavingsAccountCharges(
            @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Query("chargeStatus") String chargeStatus
    );

    /**
     * Retrieve a savings account
     * Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions
     *
     * @param accountId    accountId (required)
     * @param chargeStatus chargeStatus (optional, default to all)
     * @return Observable&lt;GetSelfSavingsAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/savingsaccounts/{accountId}")
    Observable<GetSelfSavingsAccountsResponse> retrieveSavings(
            @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Query("chargeStatus") String chargeStatus
    );

    /**
     * Retrieve a Savings account Charge
     * Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
     *
     * @param accountId              accountId (required)
     * @param savingsAccountChargeId savingsAccountChargeId (required)
     * @return Observable&lt;GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/savingsaccounts/{accountId}/charges/{savingsAccountChargeId}")
    Observable<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse> retrieveSavingsAccountCharge(
            @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Path("savingsAccountChargeId") Long savingsAccountChargeId
    );

    /**
     * Retrieve Savings Account Transaction
     * Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1
     *
     * @param accountId     accountId (required)
     * @param transactionId transactionId (required)
     * @return Observable&lt;GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/savingsaccounts/{accountId}/transactions/{transactionId}")
    Observable<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse> retrieveSavingsTransaction(
            @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Path("transactionId") Long transactionId
    );

    /**
     * @param command (optional)
     * @param body    (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("self/savingsaccounts")
    Observable<String> submitSavingsAccountApplication(
            @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
    );

    /**
     * @param clientId  (optional)
     * @param productId (optional)
     * @param body      (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/savingsaccounts/template")
    Observable<String> template(
            @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("productId") Long productId, @retrofit2.http.Body String body
    );

}

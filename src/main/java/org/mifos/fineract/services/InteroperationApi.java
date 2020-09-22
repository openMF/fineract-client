package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface InteroperationApi {
    /**
     * Calculate Interoperation Quote
     *
     * @param body body (required)
     * @return Observable&lt;InteropQuoteResponseData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("interoperation/quotes")
    Observable<InteropQuoteResponseData> createQuote(
            @retrofit2.http.Body InteropQuoteRequestData body
    );

    /**
     * Allow Interoperation Transaction Request
     *
     * @param body body (required)
     * @return Observable&lt;InteropTransactionRequestResponseData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("interoperation/requests")
    Observable<InteropTransactionRequestResponseData> createTransactionRequest(
            @retrofit2.http.Body InteropTransactionRequestData body
    );

    /**
     * Allow Interoperation Identifier registration
     *
     * @param idType  idType (required)
     * @param idValue idValue (required)
     * @param body    body (required)
     * @return Observable&lt;InteropIdentifierAccountResponseData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("interoperation/parties/{idType}/{idValue}")
    Observable<InteropIdentifierAccountResponseData> deleteAccountIdentifier(
            @retrofit2.http.Path("idType") String idType, @retrofit2.http.Path("idValue") String idValue, @retrofit2.http.Body InteropIdentifierRequestData body
    );

    /**
     * Allow Interoperation Identifier registration
     *
     * @param idType      idType (required)
     * @param idValue     idValue (required)
     * @param subIdOrType subIdOrType (required)
     * @param body        body (required)
     * @return Observable&lt;InteropIdentifierAccountResponseData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("interoperation/parties/{idType}/{idValue}/{subIdOrType}")
    Observable<InteropIdentifierAccountResponseData> deleteAccountIdentifier_0(
            @retrofit2.http.Path("idType") String idType, @retrofit2.http.Path("idValue") String idValue, @retrofit2.http.Path("subIdOrType") String subIdOrType, @retrofit2.http.Body InteropIdentifierRequestData body
    );

    /**
     * Query Interoperation Account by secondary identifier
     *
     * @param idType  idType (required)
     * @param idValue idValue (required)
     * @return Observable&lt;InteropIdentifierAccountResponseData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interoperation/parties/{idType}/{idValue}")
    Observable<InteropIdentifierAccountResponseData> getAccountByIdentifier(
            @retrofit2.http.Path("idType") String idType, @retrofit2.http.Path("idValue") String idValue
    );

    /**
     * Query Interoperation Account by secondary identifier
     *
     * @param idType      idType (required)
     * @param idValue     idValue (required)
     * @param subIdOrType subIdOrType (required)
     * @return Observable&lt;InteropIdentifierAccountResponseData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interoperation/parties/{idType}/{idValue}/{subIdOrType}")
    Observable<InteropIdentifierAccountResponseData> getAccountByIdentifier_0(
            @retrofit2.http.Path("idType") String idType, @retrofit2.http.Path("idValue") String idValue, @retrofit2.http.Path("subIdOrType") String subIdOrType
    );

    /**
     * Query Interoperation Account details
     *
     * @param accountId accountId (required)
     * @return Observable&lt;InteropAccountData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interoperation/accounts/{accountId}")
    Observable<InteropAccountData> getAccountDetails(
            @retrofit2.http.Path("accountId") String accountId
    );

    /**
     * Query Interoperation secondary identifiers by Account Id
     *
     * @param accountId accountId (required)
     * @return Observable&lt;InteropIdentifiersResponseData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interoperation/accounts/{accountId}/identifiers")
    Observable<InteropIdentifiersResponseData> getAccountIdentifiers(
            @retrofit2.http.Path("accountId") String accountId
    );

    /**
     * Query transactions by Account Id
     *
     * @param accountId           accountId (required)
     * @param debit               debit (optional, default to true)
     * @param credit              credit (optional, default to false)
     * @param fromBookingDateTime fromBookingDateTime (optional)
     * @param toBookingDateTime   toBookingDateTime (optional)
     * @return Observable&lt;InteropTransactionsData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interoperation/accounts/{accountId}/transactions")
    Observable<InteropTransactionsData> getAccountTransactions(
            @retrofit2.http.Path("accountId") String accountId, @retrofit2.http.Query("debit") Boolean debit, @retrofit2.http.Query("credit") Boolean credit, @retrofit2.http.Query("fromBookingDateTime") String fromBookingDateTime, @retrofit2.http.Query("toBookingDateTime") String toBookingDateTime
    );

    /**
     * Query Interoperation Quote
     *
     * @param transactionCode transactionCode (required)
     * @param quoteCode       quoteCode (required)
     * @return Observable&lt;InteropQuoteResponseData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interoperation/transactions/{transactionCode}/quotes/{quoteCode}")
    Observable<InteropQuoteResponseData> getQuote(
            @retrofit2.http.Path("transactionCode") String transactionCode, @retrofit2.http.Path("quoteCode") String quoteCode
    );

    /**
     * Query Interoperation Transaction Request
     *
     * @param transactionCode transactionCode (required)
     * @param requestCode     requestCode (required)
     * @return Observable&lt;InteropTransactionRequestResponseData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interoperation/transactions/{transactionCode}/requests/{requestCode}")
    Observable<InteropTransactionRequestResponseData> getTransactionRequest(
            @retrofit2.http.Path("transactionCode") String transactionCode, @retrofit2.http.Path("requestCode") String requestCode
    );

    /**
     * Query Interoperation Transfer
     *
     * @param transactionCode transactionCode (required)
     * @param transferCode    transferCode (required)
     * @return Observable&lt;InteropTransferResponseData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interoperation/transactions/{transactionCode}/transfers/{transferCode}")
    Observable<InteropTransferResponseData> getTransfer(
            @retrofit2.http.Path("transactionCode") String transactionCode, @retrofit2.http.Path("transferCode") String transferCode
    );

    /**
     * Query Interoperation Health Request
     *
     * @return Observable&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("interoperation/health")
    Observable<Void> health();


    /**
     * Prepare Interoperation Transfer
     *
     * @param body   body (required)
     * @param action action (optional)
     * @return Observable&lt;InteropTransferResponseData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("interoperation/transfers")
    Observable<InteropTransferResponseData> performTransfer(
            @retrofit2.http.Body InteropTransferRequestData body, @retrofit2.http.Query("action") String action
    );

    /**
     * Interoperation Identifier registration
     *
     * @param idType  idType (required)
     * @param idValue idValue (required)
     * @param body    body (required)
     * @return Observable&lt;InteropIdentifierAccountResponseData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("interoperation/parties/{idType}/{idValue}")
    Observable<InteropIdentifierAccountResponseData> registerAccountIdentifier(
            @retrofit2.http.Path("idType") String idType, @retrofit2.http.Path("idValue") String idValue, @retrofit2.http.Body InteropIdentifierRequestData body
    );

    /**
     * Interoperation Identifier registration
     *
     * @param idType      idType (required)
     * @param idValue     idValue (required)
     * @param subIdOrType subIdOrType (required)
     * @param body        body (required)
     * @return Observable&lt;InteropIdentifierAccountResponseData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("interoperation/parties/{idType}/{idValue}/{subIdOrType}")
    Observable<InteropIdentifierAccountResponseData> registerAccountIdentifier_0(
            @retrofit2.http.Path("idType") String idType, @retrofit2.http.Path("idValue") String idValue, @retrofit2.http.Path("subIdOrType") String subIdOrType, @retrofit2.http.Body InteropIdentifierRequestData body
    );

}

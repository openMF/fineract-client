package org.mifos.fineract.services;

import org.mifos.fineract.models.GetClientsClientIdTransactionsResponse;
import org.mifos.fineract.models.GetClientsClientIdTransactionsTransactionIdResponse;
import org.mifos.fineract.models.PostClientsClientIdTransactionsTransactionIdResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ClientTransactionApi {
    /**
     * List Client Transactions
     * The list capability of client transaction can support pagination.  Example Requests:  clients/189/transactions  clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50
     *
     * @param clientId clientId (required)
     * @param offset   offset (optional)
     * @param limit    limit (optional)
     * @return Call&lt;GetClientsClientIdTransactionsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("clients/{clientId}/transactions")
    Call<GetClientsClientIdTransactionsResponse> retrieveAllClientTransactions(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
    );

    /**
     * Retrieve a Client Transaction
     * Example Requests: clients/1/transactions/1   clients/1/transactions/1?fields&#x3D;id,officeName
     *
     * @param clientId      clientId (required)
     * @param transactionId transactionId (required)
     * @return Call&lt;GetClientsClientIdTransactionsTransactionIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("clients/{clientId}/transactions/{transactionId}")
    Call<GetClientsClientIdTransactionsTransactionIdResponse> retrieveClientTransaction(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("transactionId") Long transactionId
    );

    /**
     * Undo a Client Transaction
     * Undoes a Client Transaction
     *
     * @param clientId      clientId (required)
     * @param transactionId transactionId (required)
     * @param command       command (optional)
     * @return Call&lt;PostClientsClientIdTransactionsTransactionIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("clients/{clientId}/transactions/{transactionId}")
    Call<PostClientsClientIdTransactionsTransactionIdResponse> undoClientTransaction(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Query("command") String command
    );

}

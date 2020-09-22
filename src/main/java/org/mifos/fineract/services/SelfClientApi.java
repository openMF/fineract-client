package org.mifos.fineract.services;

import okhttp3.MultipartBody;
import org.mifos.fineract.models.*;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface SelfClientApi {
    /**
     * @param clientId      (required)
     * @param contentLength (optional)
     * @param file          (optional)
     * @return Observable&lt;String&gt;
     */
    @retrofit2.http.Multipart
    @POST("self/clients/{clientId}/images")
    Observable<String> addNewClientImage(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part MultipartBody.Part file
    );

    /**
     * @param clientId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("self/clients/{clientId}/images")
    Observable<String> deleteClientImage(
            @retrofit2.http.Path("clientId") Long clientId
    );

    /**
     * List Clients associated to the user
     * The list capability of clients can support pagination and sorting.  Example Requests:  self/clients  self/clients?fields&#x3D;displayName,officeName  self/clients?offset&#x3D;10&amp;limit&#x3D;50  self/clients?orderBy&#x3D;displayName&amp;sortOrder&#x3D;DESC
     *
     * @param displayName displayName (optional)
     * @param firstName   firstName (optional)
     * @param lastName    lastName (optional)
     * @param offset      offset (optional)
     * @param limit       limit (optional)
     * @param orderBy     orderBy (optional)
     * @param sortOrder   sortOrder (optional)
     * @return Observable&lt;GetSelfClientsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/clients")
    Observable<GetSelfClientsResponse> retrieveAll(
            @retrofit2.http.Query("displayName") String displayName, @retrofit2.http.Query("firstName") String firstName, @retrofit2.http.Query("lastName") String lastName, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
    );

    /**
     * List Client Charges
     * The list capability of client charges supports pagination.  Example Requests:  self/clients/1/charges  self/clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5
     *
     * @param clientId       clientId (required)
     * @param chargeStatus   chargeStatus (optional, default to all)
     * @param pendingPayment pendingPayment (optional)
     * @param limit          limit (optional)
     * @param offset         offset (optional)
     * @return Observable&lt;GetSelfClientsClientIdChargesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/clients/{clientId}/charges")
    Observable<GetSelfClientsClientIdChargesResponse> retrieveAllClientCharges(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("chargeStatus") String chargeStatus, @retrofit2.http.Query("pendingPayment") Boolean pendingPayment, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
    );

    /**
     * List Client Transactions
     * The list capability of client transaction can support pagination.  Example Requests:  self/clients/189/transactions  self/clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50
     *
     * @param clientId clientId (required)
     * @param offset   offset (optional)
     * @param limit    limit (optional)
     * @return Observable&lt;GetSelfClientsClientIdTransactionsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/clients/{clientId}/transactions")
    Observable<GetSelfClientsClientIdTransactionsResponse> retrieveAllClientTransactions(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
    );

    /**
     * Retrieve client accounts overview
     * An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:  self/clients/1/accounts   self/clients/1/accounts?fields&#x3D;loanAccounts,savingsAccounts
     *
     * @param clientId clientId (required)
     * @return Observable&lt;GetSelfClientsClientIdAccountsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/clients/{clientId}/accounts")
    Observable<GetSelfClientsClientIdAccountsResponse> retrieveAssociatedAccounts(
            @retrofit2.http.Path("clientId") Long clientId
    );

    /**
     * Retrieve a Client Charge
     * Retrieves a Client Charge  Example Requests:  self/clients/1/charges/1   self/clients/1/charges/1?fields&#x3D;name,id
     *
     * @param clientId clientId (required)
     * @param chargeId chargeId (required)
     * @return Observable&lt;GetSelfClientsClientIdChargesChargeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/clients/{clientId}/charges/{chargeId}")
    Observable<GetSelfClientsClientIdChargesChargeIdResponse> retrieveClientCharge(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("chargeId") Long chargeId
    );

    /**
     * Retrieve a Client Transaction
     * Retrieves a Client TransactionExample Requests:  self/clients/1/transactions/1   self/clients/1/transactions/1?fields&#x3D;id,officeName
     *
     * @param clientId      clientId (required)
     * @param transactionId transactionId (required)
     * @return Observable&lt;GetSelfClientsClientIdTransactionsTransactionIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/clients/{clientId}/transactions/{transactionId}")
    Observable<GetSelfClientsClientIdTransactionsTransactionIdResponse> retrieveClientTransaction(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("transactionId") Long transactionId
    );

    /**
     * Retrieve Client Image
     * Optional arguments are identical to those of Get Image associated with an Entity (Binary file)  Example Requests:  self/clients/1/images
     *
     * @param clientId  clientId (required)
     * @param maxWidth  (optional)
     * @param maxHeight (optional)
     * @param output    (optional)
     * @return Observable&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/clients/{clientId}/images")
    Observable<Void> retrieveImage(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("maxWidth") Integer maxWidth, @retrofit2.http.Query("maxHeight") Integer maxHeight, @retrofit2.http.Query("output") String output
    );

    /**
     * @param clientId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/clients/{clientId}/obligeedetails")
    Observable<String> retrieveObligeeDetails(
            @retrofit2.http.Path("clientId") Long clientId
    );

    /**
     * Retrieve a Client
     * Retrieves a Client  Example Requests:  self/clients/1  self/clients/1?fields&#x3D;id,displayName,officeName
     *
     * @param clientId clientId (required)
     * @return Observable&lt;GetSelfClientsClientIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/clients/{clientId}")
    Observable<GetSelfClientsClientIdResponse> retrieveOne(
            @retrofit2.http.Path("clientId") Long clientId
    );

}

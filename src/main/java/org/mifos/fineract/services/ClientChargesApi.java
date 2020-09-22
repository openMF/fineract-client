package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface ClientChargesApi {
    /**
     * Add Client Charge
     * This API associates a Client charge with an implicit Client account Mandatory Fields :  chargeId and dueDate   Optional Fields :  amount
     *
     * @param clientId clientId (required)
     * @param body     body (required)
     * @return Observable&lt;PostClientsClientIdChargesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("clients/{clientId}/charges")
    Observable<PostClientsClientIdChargesResponse> applyClientCharge(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Body PostClientsClientIdChargesRequest body
    );

    /**
     * Delete a Client Charge
     * Deletes a Client Charge on which no transactions have taken place (either payments or waivers).
     *
     * @param clientId clientId (required)
     * @param chargeId chargeId (required)
     * @return Observable&lt;DeleteClientsClientIdChargesChargeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("clients/{clientId}/charges/{chargeId}")
    Observable<DeleteClientsClientIdChargesChargeIdResponse> deleteClientCharge(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("chargeId") Long chargeId
    );

    /**
     * Pay a Client Charge | Waive a Client Charge
     * Pay a Client Charge:  Mandatory Fields:transactionDate and amount \&quot;Pay either a part of or the entire due amount for a charge.(command&#x3D;paycharge)  Waive a Client Charge:   This API provides the facility of waiving off the remaining amount on a client charge (command&#x3D;waive)  Showing request/response for &#39;Pay a Client Charge&#39;
     *
     * @param clientId clientId (required)
     * @param chargeId chargeId (required)
     * @param body     body (required)
     * @param command  command (optional)
     * @return Observable&lt;PostClientsClientIdChargesChargeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("clients/{clientId}/charges/{chargeId}")
    Observable<PostClientsClientIdChargesChargeIdResponse> payOrWaiveClientCharge(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("chargeId") Long chargeId, @retrofit2.http.Body PostClientsClientIdChargesChargeIdRequest body, @retrofit2.http.Query("command") String command
    );

    /**
     * List Client Charges
     * The list capability of client charges supports pagination.Example Requests: clients/1/charges  clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5
     *
     * @param clientId       clientId (required)
     * @param chargeStatus   chargeStatus (optional, default to all)
     * @param pendingPayment pendingPayment (optional)
     * @param limit          limit (optional)
     * @param offset         offset (optional)
     * @return Observable&lt;GetClientsClientIdChargesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("clients/{clientId}/charges")
    Observable<GetClientsClientIdChargesResponse> retrieveAllClientCharges(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Query("chargeStatus") String chargeStatus, @retrofit2.http.Query("pendingPayment") Boolean pendingPayment, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
    );

    /**
     * Retrieve a Client Charge
     * Example Requests: clients/1/charges/1   clients/1/charges/1?fields&#x3D;name,id
     *
     * @param clientId clientId (required)
     * @param chargeId chargeId (required)
     * @return Observable&lt;GetClientsChargesPageItems&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("clients/{clientId}/charges/{chargeId}")
    Observable<GetClientsChargesPageItems> retrieveClientCharge(
            @retrofit2.http.Path("clientId") Long clientId, @retrofit2.http.Path("chargeId") Long chargeId
    );

    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("clients/{clientId}/charges/template")
    Observable<String> retrieveTemplate();


}

package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface TellerCashManagementApi {
    /**
     * Allocate Cash To Cashier
     * Mandatory Fields:  Date, Amount, Currency, Notes/Comments
     *
     * @param tellerId  tellerId (required)
     * @param cashierId cashierId (required)
     * @param body      body (required)
     * @return Observable&lt;PostTellersTellerIdCashiersCashierIdAllocateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("tellers/{tellerId}/cashiers/{cashierId}/allocate")
    Observable<PostTellersTellerIdCashiersCashierIdAllocateResponse> allocateCashToCashier(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Body PostTellersTellerIdCashiersCashierIdAllocateRequest body
    );

    /**
     * Create Cashiers
     * Mandatory Fields:  Cashier/staff, Fromm Date, To Date, Full Day or From time and To time    Optional Fields:  Description/Notes
     *
     * @param tellerId tellerId (required)
     * @param body     body (required)
     * @return Observable&lt;PostTellersTellerIdCashiersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("tellers/{tellerId}/cashiers")
    Observable<PostTellersTellerIdCashiersResponse> createCashier(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Body PostTellersTellerIdCashiersRequest body
    );

    /**
     * Create teller
     * Mandatory Fields Teller name, OfficeId, Description, Start Date, Status Optional Fields End Date
     *
     * @param body body (required)
     * @return Observable&lt;PostTellersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("tellers")
    Observable<PostTellersResponse> createTeller(
            @retrofit2.http.Body PostTellersRequest body
    );

    /**
     * Delete Cashier
     *
     * @param tellerId  tellerId (required)
     * @param cashierId cashierId (required)
     * @return Observable&lt;DeleteTellersTellerIdCashiersCashierIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("tellers/{tellerId}/cashiers/{cashierId}")
    Observable<DeleteTellersTellerIdCashiersCashierIdResponse> deleteCashier(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId
    );

    /**
     * @param tellerId tellerId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("tellers/{tellerId}")
    Observable<String> deleteTeller(
            @retrofit2.http.Path("tellerId") Long tellerId
    );

    /**
     * Retrieve a cashier
     *
     * @param tellerId  tellerId (required)
     * @param cashierId cashierId (required)
     * @return Observable&lt;GetTellersTellerIdCashiersCashierIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/cashiers/{cashierId}")
    Observable<GetTellersTellerIdCashiersCashierIdResponse> findCashierData(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId
    );

    /**
     * Retrieve tellers
     *
     * @param tellerId tellerId (required)
     * @return Observable&lt;GetTellersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}")
    Observable<GetTellersResponse> findTeller(
            @retrofit2.http.Path("tellerId") Long tellerId
    );

    /**
     * @param tellerId      tellerId (required)
     * @param transactionId transactionId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/transactions/{transactionId}")
    Observable<String> findTransactionData(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("transactionId") Long transactionId
    );

    /**
     * List Cashiers
     *
     * @param tellerId tellerId (required)
     * @param fromdate fromdate (optional)
     * @param todate   todate (optional)
     * @return Observable&lt;GetTellersTellerIdCashiersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/cashiers")
    Observable<GetTellersTellerIdCashiersResponse> getCashierData(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Query("fromdate") String fromdate, @retrofit2.http.Query("todate") String todate
    );

    /**
     * Find Cashiers
     *
     * @param tellerId tellerId (required)
     * @return Observable&lt;GetTellersTellerIdCashiersTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/cashiers/template")
    Observable<GetTellersTellerIdCashiersTemplateResponse> getCashierTemplate(
            @retrofit2.http.Path("tellerId") Long tellerId
    );

    /**
     * Retrieve Cashier Transaction Template
     *
     * @param tellerId  tellerId (required)
     * @param cashierId cashierId (required)
     * @return Observable&lt;GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/cashiers/{cashierId}/transactions/template")
    Observable<GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse> getCashierTxnTemplate(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId
    );

    /**
     * @param tellerId  tellerId (required)
     * @param cashierId cashierId (optional)
     * @param dateRange dateRange (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/journals")
    Observable<String> getJournalData(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Query("cashierId") Long cashierId, @retrofit2.http.Query("dateRange") String dateRange
    );

    /**
     * List all tellers
     * Retrieves list tellers
     *
     * @param officeId officeId (optional)
     * @return Observable&lt;List&lt;GetTellersResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers")
    Observable<List<GetTellersResponse>> getTellerData(
            @retrofit2.http.Query("officeId") Long officeId
    );

    /**
     * @param tellerId  tellerId (required)
     * @param dateRange dateRange (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/transactions")
    Observable<String> getTransactionData(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Query("dateRange") String dateRange
    );

    /**
     * Retrieve Cashier Transaction
     *
     * @param tellerId     tellerId (required)
     * @param cashierId    cashierId (required)
     * @param currencyCode currencyCode (optional)
     * @param offset       offset (optional)
     * @param limit        limit (optional)
     * @param orderBy      orderBy (optional)
     * @param sortOrder    sortOrder (optional)
     * @return Observable&lt;List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/cashiers/{cashierId}/transactions")
    Observable<List<GetTellersTellerIdCashiersCashiersIdTransactionsResponse>> getTransactionsForCashier(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Query("currencyCode") String currencyCode, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
    );

    /**
     * Transactions Wtih Summary For Cashier
     *
     * @param tellerId     tellerId (required)
     * @param cashierId    cashierId (required)
     * @param currencyCode currencyCode (optional)
     * @param offset       offset (optional)
     * @param limit        limit (optional)
     * @param orderBy      orderBy (optional)
     * @param sortOrder    sortOrder (optional)
     * @return Observable&lt;GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/cashiers/{cashierId}/summaryandtransactions")
    Observable<GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse> getTransactionsWtihSummaryForCashier(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Query("currencyCode") String currencyCode, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
    );

    /**
     * Settle Cash From Cashier
     * Mandatory Fields Date, Amount, Currency, Notes/Comments
     *
     * @param tellerId  tellerId (required)
     * @param cashierId cashierId (required)
     * @param body      body (required)
     * @return Observable&lt;PostTellersTellerIdCashiersCashierIdSettleResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("tellers/{tellerId}/cashiers/{cashierId}/settle")
    Observable<PostTellersTellerIdCashiersCashierIdSettleResponse> settleCashFromCashier(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Body PostTellersTellerIdCashiersCashierIdSettleRequest body
    );

    /**
     * Update Cashier
     *
     * @param tellerId  tellerId (required)
     * @param cashierId cashierId (required)
     * @param body      body (required)
     * @return Observable&lt;PutTellersTellerIdCashiersCashierIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("tellers/{tellerId}/cashiers/{cashierId}")
    Observable<PutTellersTellerIdCashiersCashierIdResponse> updateCashier(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Body PutTellersTellerIdCashiersCashierIdRequest body
    );

    /**
     * Update teller
     *
     * @param tellerId tellerId (required)
     * @param body     body (required)
     * @return Observable&lt;PutTellersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("tellers/{tellerId}")
    Observable<PutTellersResponse> updateTeller(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Body PutTellersRequest body
    );

}

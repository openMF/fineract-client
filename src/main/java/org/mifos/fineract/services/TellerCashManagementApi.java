package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface TellerCashManagementApi {
    /**
     * Allocate Cash To Cashier
     * Mandatory Fields:  Date, Amount, Currency, Notes/Comments
     *
     * @param tellerId  tellerId (required)
     * @param cashierId cashierId (required)
     * @param body      body (required)
     * @return Call&lt;PostTellersTellerIdCashiersCashierIdAllocateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("tellers/{tellerId}/cashiers/{cashierId}/allocate")
    Call<PostTellersTellerIdCashiersCashierIdAllocateResponse> allocateCashToCashier(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Body PostTellersTellerIdCashiersCashierIdAllocateRequest body
    );

    /**
     * Create Cashiers
     * Mandatory Fields:  Cashier/staff, Fromm Date, To Date, Full Day or From time and To time    Optional Fields:  Description/Notes
     *
     * @param tellerId tellerId (required)
     * @param body     body (required)
     * @return Call&lt;PostTellersTellerIdCashiersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("tellers/{tellerId}/cashiers")
    Call<PostTellersTellerIdCashiersResponse> createCashier(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Body PostTellersTellerIdCashiersRequest body
    );

    /**
     * Create teller
     * Mandatory Fields Teller name, OfficeId, Description, Start Date, Status Optional Fields End Date
     *
     * @param body body (required)
     * @return Call&lt;PostTellersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("tellers")
    Call<PostTellersResponse> createTeller(
            @retrofit2.http.Body PostTellersRequest body
    );

    /**
     * Delete Cashier
     *
     * @param tellerId  tellerId (required)
     * @param cashierId cashierId (required)
     * @return Call&lt;DeleteTellersTellerIdCashiersCashierIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("tellers/{tellerId}/cashiers/{cashierId}")
    Call<DeleteTellersTellerIdCashiersCashierIdResponse> deleteCashier(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId
    );

    /**
     * @param tellerId tellerId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("tellers/{tellerId}")
    Call<String> deleteTeller(
            @retrofit2.http.Path("tellerId") Long tellerId
    );

    /**
     * Retrieve a cashier
     *
     * @param tellerId  tellerId (required)
     * @param cashierId cashierId (required)
     * @return Call&lt;GetTellersTellerIdCashiersCashierIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/cashiers/{cashierId}")
    Call<GetTellersTellerIdCashiersCashierIdResponse> findCashierData(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId
    );

    /**
     * Retrieve tellers
     *
     * @param tellerId tellerId (required)
     * @return Call&lt;GetTellersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}")
    Call<GetTellersResponse> findTeller(
            @retrofit2.http.Path("tellerId") Long tellerId
    );

    /**
     * @param tellerId      tellerId (required)
     * @param transactionId transactionId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/transactions/{transactionId}")
    Call<String> findTransactionData(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("transactionId") Long transactionId
    );

    /**
     * List Cashiers
     *
     * @param tellerId tellerId (required)
     * @param fromdate fromdate (optional)
     * @param todate   todate (optional)
     * @return Call&lt;GetTellersTellerIdCashiersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/cashiers")
    Call<GetTellersTellerIdCashiersResponse> getCashierData(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Query("fromdate") String fromdate, @retrofit2.http.Query("todate") String todate
    );

    /**
     * Find Cashiers
     *
     * @param tellerId tellerId (required)
     * @return Call&lt;GetTellersTellerIdCashiersTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/cashiers/template")
    Call<GetTellersTellerIdCashiersTemplateResponse> getCashierTemplate(
            @retrofit2.http.Path("tellerId") Long tellerId
    );

    /**
     * Retrieve Cashier Transaction Template
     *
     * @param tellerId  tellerId (required)
     * @param cashierId cashierId (required)
     * @return Call&lt;GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/cashiers/{cashierId}/transactions/template")
    Call<GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse> getCashierTxnTemplate(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId
    );

    /**
     * @param tellerId  tellerId (required)
     * @param cashierId cashierId (optional)
     * @param dateRange dateRange (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/journals")
    Call<String> getJournalData(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Query("cashierId") Long cashierId, @retrofit2.http.Query("dateRange") String dateRange
    );

    /**
     * List all tellers
     * Retrieves list tellers
     *
     * @param officeId officeId (optional)
     * @return Call&lt;List&lt;GetTellersResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers")
    Call<List<GetTellersResponse>> getTellerData(
            @retrofit2.http.Query("officeId") Long officeId
    );

    /**
     * @param tellerId  tellerId (required)
     * @param dateRange dateRange (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/transactions")
    Call<String> getTransactionData(
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
     * @return Call&lt;List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/cashiers/{cashierId}/transactions")
    Call<List<GetTellersTellerIdCashiersCashiersIdTransactionsResponse>> getTransactionsForCashier(
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
     * @return Call&lt;GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("tellers/{tellerId}/cashiers/{cashierId}/summaryandtransactions")
    Call<GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse> getTransactionsWtihSummaryForCashier(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Query("currencyCode") String currencyCode, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
    );

    /**
     * Settle Cash From Cashier
     * Mandatory Fields Date, Amount, Currency, Notes/Comments
     *
     * @param tellerId  tellerId (required)
     * @param cashierId cashierId (required)
     * @param body      body (required)
     * @return Call&lt;PostTellersTellerIdCashiersCashierIdSettleResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("tellers/{tellerId}/cashiers/{cashierId}/settle")
    Call<PostTellersTellerIdCashiersCashierIdSettleResponse> settleCashFromCashier(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Body PostTellersTellerIdCashiersCashierIdSettleRequest body
    );

    /**
     * Update Cashier
     *
     * @param tellerId  tellerId (required)
     * @param cashierId cashierId (required)
     * @param body      body (required)
     * @return Call&lt;PutTellersTellerIdCashiersCashierIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("tellers/{tellerId}/cashiers/{cashierId}")
    Call<PutTellersTellerIdCashiersCashierIdResponse> updateCashier(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Path("cashierId") Long cashierId, @retrofit2.http.Body PutTellersTellerIdCashiersCashierIdRequest body
    );

    /**
     * Update teller
     *
     * @param tellerId tellerId (required)
     * @param body     body (required)
     * @return Call&lt;PutTellersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("tellers/{tellerId}")
    Call<PutTellersResponse> updateTeller(
            @retrofit2.http.Path("tellerId") Long tellerId, @retrofit2.http.Body PutTellersRequest body
    );

}

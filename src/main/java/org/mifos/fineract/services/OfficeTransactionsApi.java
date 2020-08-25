package org.mifos.fineract.services;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface OfficeTransactionsApi {
    /**
     * @param transactionId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("officetransactions/{transactionId}")
    Call<String> delete(
            @retrofit2.http.Path("transactionId") Long transactionId
    );

    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("officetransactions/template")
    Call<String> newOfficeTransactionDetails();


    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("officetransactions")
    Call<String> retrieveOfficeTransactions();


    /**
     * @param body (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("officetransactions")
    Call<String> transferMoneyFrom(
            @retrofit2.http.Body String body
    );

}

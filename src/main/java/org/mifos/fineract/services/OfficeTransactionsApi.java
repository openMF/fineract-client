package org.mifos.fineract.services;

import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface OfficeTransactionsApi {
    /**
     * @param transactionId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("officetransactions/{transactionId}")
    Observable<String> delete(
            @retrofit2.http.Path("transactionId") Long transactionId
    );

    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("officetransactions/template")
    Observable<String> newOfficeTransactionDetails();


    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("officetransactions")
    Observable<String> retrieveOfficeTransactions();


    /**
     * @param body (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("officetransactions")
    Observable<String> transferMoneyFrom(
            @retrofit2.http.Body String body
    );

}

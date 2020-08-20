package org.mifos.fineract.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface CashiersApi {
    /**
     * @param officeId (optional)
     * @param tellerId (optional)
     * @param staffId  (optional)
     * @param date     (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("cashiers")
    Call<String> getCashierData(
            @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("tellerId") Long tellerId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("date") String date
    );

}

package org.mifos.fineract.services;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import rx.Observable;

public interface CashierJournalsApi {
    /**
     * @param officeId  (optional)
     * @param tellerId  (optional)
     * @param cashierId (optional)
     * @param dateRange (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("cashiersjournal")
    Observable<String> getJournalData(
            @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("tellerId") Long tellerId, @retrofit2.http.Query("cashierId") Long cashierId, @retrofit2.http.Query("dateRange") String dateRange
    );

}

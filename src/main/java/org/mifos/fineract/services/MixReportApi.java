package org.mifos.fineract.services;

import org.joda.time.DateTime;
import retrofit2.http.GET;
import rx.Observable;

public interface MixReportApi {
    /**
     * @param startDate (optional)
     * @param endDate   (optional)
     * @param currency  (optional)
     * @return Observable&lt;String&gt;
     */
    @GET("mixreport")
    Observable<String> retrieveXBRLReport(
            @retrofit2.http.Query("startDate") DateTime startDate, @retrofit2.http.Query("endDate") DateTime endDate, @retrofit2.http.Query("currency") String currency
    );

}

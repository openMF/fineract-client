package org.mifos.fineract.services;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import rx.Observable;

public interface PovertyLineApi {
    /**
     * @param ppiName (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("povertyLine/{ppiName}")
    Observable<String> retrieveAll(
            @retrofit2.http.Path("ppiName") String ppiName
    );

    /**
     * @param ppiName      (required)
     * @param likelihoodId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("povertyLine/{ppiName}/{likelihoodId}")
    Observable<String> retrieveAll_0(
            @retrofit2.http.Path("ppiName") String ppiName, @retrofit2.http.Path("likelihoodId") Long likelihoodId
    );

}

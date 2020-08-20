package org.mifos.fineract.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface PovertyLineApi {
    /**
     * @param ppiName (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("povertyLine/{ppiName}")
    Call<String> retrieveAll(
            @retrofit2.http.Path("ppiName") String ppiName
    );

    /**
     * @param ppiName      (required)
     * @param likelihoodId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("povertyLine/{ppiName}/{likelihoodId}")
    Call<String> retrieveAll_0(
            @retrofit2.http.Path("ppiName") String ppiName, @retrofit2.http.Path("likelihoodId") Long likelihoodId
    );

}

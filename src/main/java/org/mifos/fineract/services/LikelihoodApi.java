package org.mifos.fineract.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;

public interface LikelihoodApi {
    /**
     * @param likelihoodId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("likelihood/{ppiName}/{likelihoodId}")
    Call<String> retrieve(
            @retrofit2.http.Path("likelihoodId") Long likelihoodId
    );

    /**
     * @param ppiName (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("likelihood/{ppiName}")
    Call<String> retrieveAll(
            @retrofit2.http.Path("ppiName") String ppiName
    );

    /**
     * @param likelihoodId (required)
     * @param body         (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("likelihood/{ppiName}/{likelihoodId}")
    Call<String> update(
            @retrofit2.http.Path("likelihoodId") Long likelihoodId, @retrofit2.http.Body String body
    );

}

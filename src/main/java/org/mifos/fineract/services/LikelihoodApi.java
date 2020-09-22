package org.mifos.fineract.services;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import rx.Observable;

public interface LikelihoodApi {
    /**
     * @param likelihoodId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("likelihood/{ppiName}/{likelihoodId}")
    Observable<String> retrieve(
            @retrofit2.http.Path("likelihoodId") Long likelihoodId
    );

    /**
     * @param ppiName (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("likelihood/{ppiName}")
    Observable<String> retrieveAll(
            @retrofit2.http.Path("ppiName") String ppiName
    );

    /**
     * @param likelihoodId (required)
     * @param body         (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("likelihood/{ppiName}/{likelihoodId}")
    Observable<String> update(
            @retrofit2.http.Path("likelihoodId") Long likelihoodId, @retrofit2.http.Body String body
    );

}

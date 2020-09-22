package org.mifos.fineract.services;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import rx.Observable;

public interface MixMapping_Api {
    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("mixmapping")
    Observable<String> retrieveTaxonomyMapping();


    /**
     * @param body (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("mixmapping")
    Observable<String> updateTaxonomyMapping(
            @retrofit2.http.Body String body
    );

}

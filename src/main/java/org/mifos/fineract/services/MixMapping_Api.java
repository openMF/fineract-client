package org.mifos.fineract.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;

public interface MixMapping_Api {
    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("mixmapping")
    Call<String> retrieveTaxonomyMapping();


    /**
     * @param body (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("mixmapping")
    Call<String> updateTaxonomyMapping(
            @retrofit2.http.Body String body
    );

}

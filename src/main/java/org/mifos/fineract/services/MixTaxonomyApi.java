package org.mifos.fineract.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface MixTaxonomyApi {
    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("mixtaxonomy")
    Call<String> retrieveAll();


}

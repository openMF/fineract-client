package org.mifos.fineract.services;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import rx.Observable;

public interface MixTaxonomyApi {
    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("mixtaxonomy")
    Observable<String> retrieveAll();


}

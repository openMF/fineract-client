package org.mifos.fineract.services;

import org.mifos.fineract.models.GetCachesResponse;
import org.mifos.fineract.models.PutCachesRequest;
import org.mifos.fineract.models.PutCachesResponse;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import rx.Observable;

import java.util.List;

public interface CacheApi {
    /**
     * Retrieve Cache Types
     * Returns the list of caches.  Example Requests:  caches
     *
     * @return Observable&lt;List&lt;GetCachesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("caches")
    Observable<List<GetCachesResponse>> retrieveAll();


    /**
     * Switch Cache
     * Switches the cache to chosen one.
     *
     * @param body body (required)
     * @return Observable&lt;PutCachesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("caches")
    Observable<PutCachesResponse> switchCache(
            @retrofit2.http.Body PutCachesRequest body
    );

}

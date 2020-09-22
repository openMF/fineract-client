package org.mifos.fineract.services;

import retrofit2.http.*;
import rx.Observable;

public interface AdhocQueryApiApi {
    /**
     * @param body (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("adhocquery")
    Observable<String> createAdHocQuery(
            @retrofit2.http.Body String body
    );

    /**
     * @param adHocId adHocId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("adhocquery/{adHocId}")
    Observable<String> deleteAdHocQuery(
            @retrofit2.http.Path("adHocId") Long adHocId
    );

    /**
     * @param adHocId adHocId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("adhocquery/{adHocId}")
    Observable<String> retrieveAdHocQuery(
            @retrofit2.http.Path("adHocId") Long adHocId
    );

    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("adhocquery")
    Observable<String> retrieveAll();


    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("adhocquery/template")
    Observable<String> template();


    /**
     * @param adHocId adHocId (required)
     * @param body    (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("adhocquery/{adHocId}")
    Observable<String> update(
            @retrofit2.http.Path("adHocId") Long adHocId, @retrofit2.http.Body String body
    );

}

package org.mifos.fineract.services;

import retrofit2.Call;
import retrofit2.http.*;

public interface AdhocQueryApiApi {
    /**
     * @param body (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("adhocquery")
    Call<String> createAdHocQuery(
            @retrofit2.http.Body String body
    );

    /**
     * @param adHocId adHocId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("adhocquery/{adHocId}")
    Call<String> deleteAdHocQuery(
            @retrofit2.http.Path("adHocId") Long adHocId
    );

    /**
     * @param adHocId adHocId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("adhocquery/{adHocId}")
    Call<String> retrieveAdHocQuery(
            @retrofit2.http.Path("adHocId") Long adHocId
    );

    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("adhocquery")
    Call<String> retrieveAll();


    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("adhocquery/template")
    Call<String> template();


    /**
     * @param adHocId adHocId (required)
     * @param body    (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("adhocquery/{adHocId}")
    Call<String> update(
            @retrofit2.http.Path("adHocId") Long adHocId, @retrofit2.http.Body String body
    );

}

package org.mifos.fineract.services;

import retrofit2.http.*;
import rx.Observable;

public interface SelfDividendApi {
    /**
     * @param productId (required)
     * @param body      (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("shareproduct/{productId}/dividend")
    Observable<String> createDividendDetail(
            @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body String body
    );

    /**
     * @param productId  (required)
     * @param dividendId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("shareproduct/{productId}/dividend/{dividendId}")
    Observable<String> deleteDividendDetail(
            @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Path("dividendId") Long dividendId
    );

    /**
     * @param productId (required)
     * @param offset    (optional)
     * @param limit     (optional)
     * @param orderBy   (optional)
     * @param sortOrder (optional)
     * @param status    (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("shareproduct/{productId}/dividend")
    Observable<String> retrieveAll(
            @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("status") Integer status
    );

    /**
     * @param dividendId (required)
     * @param offset     (optional)
     * @param limit      (optional)
     * @param orderBy    (optional)
     * @param sortOrder  (optional)
     * @param accountNo  (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("shareproduct/{productId}/dividend/{dividendId}")
    Observable<String> retrieveDividendDetails(
            @retrofit2.http.Path("dividendId") Long dividendId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("accountNo") String accountNo
    );

    /**
     * @param productId  (required)
     * @param dividendId (required)
     * @param command    (optional)
     * @param body       (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("shareproduct/{productId}/dividend/{dividendId}")
    Observable<String> updateDividendDetail(
            @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Path("dividendId") Long dividendId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
    );

}

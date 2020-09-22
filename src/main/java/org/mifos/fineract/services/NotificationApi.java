package org.mifos.fineract.services;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import rx.Observable;

public interface NotificationApi {
    /**
     * @param orderBy   (optional)
     * @param limit     (optional)
     * @param offset    (optional)
     * @param sortOrder (optional)
     * @param isRead    (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("notifications")
    Observable<String> getAllNotifications(
            @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("isRead") Boolean isRead
    );

    /**
     * @return Observable&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("notifications")
    Observable<Void> update();


}

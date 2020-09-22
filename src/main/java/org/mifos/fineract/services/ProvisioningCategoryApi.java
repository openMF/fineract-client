package org.mifos.fineract.services;

import retrofit2.http.*;
import rx.Observable;

public interface ProvisioningCategoryApi {
    /**
     * @param body (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("provisioningcategory")
    Observable<String> createProvisioningCategory(
            @retrofit2.http.Body String body
    );

    /**
     * @param categoryId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("provisioningcategory/{categoryId}")
    Observable<String> deleteProvisioningCategory(
            @retrofit2.http.Path("categoryId") Long categoryId
    );

    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("provisioningcategory")
    Observable<String> retrieveAll();


    /**
     * @param categoryId (required)
     * @param body       (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("provisioningcategory/{categoryId}")
    Observable<String> updateProvisioningCategory(
            @retrofit2.http.Path("categoryId") Long categoryId, @retrofit2.http.Body String body
    );

}

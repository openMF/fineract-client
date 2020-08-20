package org.mifos.fineract.services;

import retrofit2.Call;
import retrofit2.http.*;

public interface ProvisioningCategoryApi {
    /**
     * @param body (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("provisioningcategory")
    Call<String> createProvisioningCategory(
            @retrofit2.http.Body String body
    );

    /**
     * @param categoryId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("provisioningcategory/{categoryId}")
    Call<String> deleteProvisioningCategory(
            @retrofit2.http.Path("categoryId") Long categoryId
    );

    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("provisioningcategory")
    Call<String> retrieveAll();


    /**
     * @param categoryId (required)
     * @param body       (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("provisioningcategory/{categoryId}")
    Call<String> updateProvisioningCategory(
            @retrofit2.http.Path("categoryId") Long categoryId, @retrofit2.http.Body String body
    );

}

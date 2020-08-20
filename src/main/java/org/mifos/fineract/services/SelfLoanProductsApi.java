package org.mifos.fineract.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface SelfLoanProductsApi {
    /**
     * @param clientId (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/loanproducts")
    Call<String> retrieveAllLoanProducts(
            @retrofit2.http.Query("clientId") Long clientId
    );

    /**
     * @param productId (required)
     * @param clientId  (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/loanproducts/{productId}")
    Call<String> retrieveLoanProductDetails(
            @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Query("clientId") Long clientId
    );

}

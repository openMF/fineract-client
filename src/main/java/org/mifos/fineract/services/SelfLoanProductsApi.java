package org.mifos.fineract.services;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import rx.Observable;

public interface SelfLoanProductsApi {
    /**
     * @param clientId (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/loanproducts")
    Observable<String> retrieveAllLoanProducts(
            @retrofit2.http.Query("clientId") Long clientId
    );

    /**
     * @param productId (required)
     * @param clientId  (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/loanproducts/{productId}")
    Observable<String> retrieveLoanProductDetails(
            @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Query("clientId") Long clientId
    );

}

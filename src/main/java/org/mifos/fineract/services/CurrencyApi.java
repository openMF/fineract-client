package org.mifos.fineract.services;

import org.mifos.fineract.models.GetCurrenciesResponse;
import org.mifos.fineract.models.PutCurrenciesRequest;
import org.mifos.fineract.models.PutCurrenciesResponse;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import rx.Observable;

public interface CurrencyApi {
    /**
     * Retrieve Currency Configuration
     * Returns the list of currencies permitted for use AND the list of currencies not selected (but available for selection).  Example Requests:  currencies   currencies?fields&#x3D;selectedCurrencyOptions
     *
     * @return Observable&lt;GetCurrenciesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("currencies")
    Observable<GetCurrenciesResponse> retrieveCurrencies();


    /**
     * Update Currency Configuration
     * Updates the list of currencies permitted for use.
     *
     * @param body body (required)
     * @return Observable&lt;PutCurrenciesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("currencies")
    Observable<PutCurrenciesResponse> updateCurrencies(
            @retrofit2.http.Body PutCurrenciesRequest body
    );

}

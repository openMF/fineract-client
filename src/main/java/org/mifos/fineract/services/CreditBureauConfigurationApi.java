package org.mifos.fineract.services;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface CreditBureauConfigurationApi {
    /**
     * @param organisationCreditBureauId (required)
     * @param body                       (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("CreditBureauConfiguration/organisationCreditBureau/{organisationCreditBureauId}")
    Observable<String> addOrganisationCreditBureau(
            @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId, @retrofit2.http.Body String body
    );

    /**
     * @param creditBureauId (required)
     * @param body           (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("CreditBureauConfiguration/mappings/{CreditBureauId}")
    Observable<String> createCreditBureauLoanProductMapping(
            @retrofit2.http.Path("CreditBureauId") Long creditBureauId, @retrofit2.http.Body String body
    );

    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("CreditBureauConfiguration/loanProduct")
    Observable<String> fetchLoanProducts();


    /**
     * @param organisationCreditBureauId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("CreditBureauConfiguration/config/{organisationCreditBureauId}")
    Observable<String> getConfiguration(
            @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId
    );

    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("CreditBureauConfiguration")
    Observable<String> getCreditBureau();


    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("CreditBureauConfiguration/mappings")
    Observable<String> getCreditBureauLoanProductMapping();


    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("CreditBureauConfiguration/organisationCreditBureau")
    Observable<String> getOrganisationCreditBureau();


    /**
     * @param body (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("CreditBureauConfiguration/organisationCreditBureau")
    Observable<String> updateCreditBureau(
            @retrofit2.http.Body String body
    );

    /**
     * @param body (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("CreditBureauConfiguration/mappings")
    Observable<String> updateCreditBureauLoanProductMapping(
            @retrofit2.http.Body String body
    );

}

package org.mifos.fineract.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface CreditBureauConfigurationApi {
    /**
     * @param organisationCreditBureauId (required)
     * @param body                       (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("CreditBureauConfiguration/organisationCreditBureau/{organisationCreditBureauId}")
    Call<String> addOrganisationCreditBureau(
            @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId, @retrofit2.http.Body String body
    );

    /**
     * @param creditBureauId (required)
     * @param body           (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("CreditBureauConfiguration/mappings/{CreditBureauId}")
    Call<String> createCreditBureauLoanProductMapping(
            @retrofit2.http.Path("CreditBureauId") Long creditBureauId, @retrofit2.http.Body String body
    );

    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("CreditBureauConfiguration/loanProduct")
    Call<String> fetchLoanProducts();


    /**
     * @param organisationCreditBureauId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("CreditBureauConfiguration/config/{organisationCreditBureauId}")
    Call<String> getConfiguration(
            @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId
    );

    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("CreditBureauConfiguration")
    Call<String> getCreditBureau();


    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("CreditBureauConfiguration/mappings")
    Call<String> getCreditBureauLoanProductMapping();


    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("CreditBureauConfiguration/organisationCreditBureau")
    Call<String> getOrganisationCreditBureau();


    /**
     * @param body (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("CreditBureauConfiguration/organisationCreditBureau")
    Call<String> updateCreditBureau(
            @retrofit2.http.Body String body
    );

    /**
     * @param body (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("CreditBureauConfiguration/mappings")
    Call<String> updateCreditBureauLoanProductMapping(
            @retrofit2.http.Body String body
    );

}

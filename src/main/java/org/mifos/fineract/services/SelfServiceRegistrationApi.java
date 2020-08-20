package org.mifos.fineract.services;

import retrofit2.Call;
import retrofit2.http.POST;

public interface SelfServiceRegistrationApi {
    /**
     * @param body (optional)
     * @return Call&lt;String&gt;
     */
    @POST("self/registration")
    Call<String> createSelfServiceRegistrationRequest(
            @retrofit2.http.Body String body
    );

    /**
     * @param body (optional)
     * @return Call&lt;String&gt;
     */
    @POST("self/registration/user")
    Call<String> createSelfServiceUser(
            @retrofit2.http.Body String body
    );

}

package org.mifos.fineract.services;

import retrofit2.http.POST;
import rx.Observable;

public interface SelfServiceRegistrationApi {
    /**
     * @param body (optional)
     * @return Observable&lt;String&gt;
     */
    @POST("self/registration")
    Observable<String> createSelfServiceRegistrationRequest(
            @retrofit2.http.Body String body
    );

    /**
     * @param body (optional)
     * @return Observable&lt;String&gt;
     */
    @POST("self/registration/user")
    Observable<String> createSelfServiceUser(
            @retrofit2.http.Body String body
    );

}

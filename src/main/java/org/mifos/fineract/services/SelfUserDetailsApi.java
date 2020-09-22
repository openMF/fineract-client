package org.mifos.fineract.services;

import org.mifos.fineract.models.GetSelfUserDetailsResponse;
import retrofit2.http.GET;
import rx.Observable;

public interface SelfUserDetailsApi {
    /**
     * Fetch authenticated user details
     * Checks the Authentication and returns the set roles and permissions allowed  For more info visit this link - https://demo.openmf.org/api-docs/apiLive.htm#selfoauth
     *
     * @param accessToken äccess_token (optional)
     * @return Observable&lt;GetSelfUserDetailsResponse&gt;
     */
    @GET("self/userdetails")
    Observable<GetSelfUserDetailsResponse> fetchAuthenticatedUserData(
            @retrofit2.http.Query("access_token") String accessToken
    );

}

package org.mifos.fineract.services;

import org.mifos.fineract.models.GetSelfUserDetailsResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SelfUserDetailsApi {
    /**
     * Fetch authenticated user details
     * Checks the Authentication and returns the set roles and permissions allowed  For more info visit this link - https://demo.openmf.org/api-docs/apiLive.htm#selfoauth
     *
     * @param accessToken äccess_token (optional)
     * @return Call&lt;GetSelfUserDetailsResponse&gt;
     */
    @GET("self/userdetails")
    Call<GetSelfUserDetailsResponse> fetchAuthenticatedUserData(
            @retrofit2.http.Query("access_token") String accessToken
    );

}

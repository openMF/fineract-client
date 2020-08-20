package org.mifos.fineract.services;

import org.mifos.fineract.models.GetUserDetailsResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface FetchAuthenticatedUserDetailsApi {
    /**
     * Fetch authenticated user details
     * checks the Authentication and returns the set roles and permissions allowed.
     *
     * @param accessToken access_token (optional)
     * @return Call&lt;GetUserDetailsResponse&gt;
     */
    @GET("userdetails")
    Call<GetUserDetailsResponse> fetchAuthenticatedUserData(
            @retrofit2.http.Query("access_token") String accessToken
    );

}

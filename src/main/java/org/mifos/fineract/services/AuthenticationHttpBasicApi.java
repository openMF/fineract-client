package org.mifos.fineract.services;

import org.mifos.fineract.models.PostAuthenticationResponse;
import retrofit2.Call;
import retrofit2.http.POST;

public interface AuthenticationHttpBasicApi {
    /**
     * Verify authentication
     * Authenticates the credentials provided and returns the set roles and permissions allowed.
     *
     * @param username username (optional)
     * @param password password (optional)
     * @return Call&lt;PostAuthenticationResponse&gt;
     */
    @POST("authentication")
    Call<PostAuthenticationResponse> authenticate(
            @retrofit2.http.Query("username") String username, @retrofit2.http.Query("password") String password
    );

}

package org.mifos.fineract.services;

import org.mifos.fineract.models.PostAuthenticationResponse;
import retrofit2.http.POST;
import rx.Observable;

public interface AuthenticationHttpBasicApi {
    /**
     * Verify authentication
     * Authenticates the credentials provided and returns the set roles and permissions allowed.
     *
     * @param username username (optional)
     * @param password password (optional)
     * @return Observable&lt;PostAuthenticationResponse&gt;
     */
    @POST("authentication")
    Observable<PostAuthenticationResponse> authenticate(
            @retrofit2.http.Query("username") String username, @retrofit2.http.Query("password") String password
    );

}

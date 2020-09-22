package org.mifos.fineract.services;

import org.mifos.fineract.models.PostSelfAuthenticationResponse;
import retrofit2.http.POST;
import rx.Observable;

public interface SelfAuthenticationApi {
    /**
     * Verify authentication
     * Authenticates the credentials provided and returns the set roles and permissions allowed.  Please visit this link for more info - https://demo.openmf.org/api-docs/apiLive.htm#selfbasicauth
     *
     * @param username username (optional)
     * @param password password (optional)
     * @return Observable&lt;PostSelfAuthenticationResponse&gt;
     */
    @POST("self/authentication")
    Observable<PostSelfAuthenticationResponse> authenticate(
            @retrofit2.http.Query("username") String username, @retrofit2.http.Query("password") String password
    );

}

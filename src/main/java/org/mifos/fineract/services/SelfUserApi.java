package org.mifos.fineract.services;

import org.mifos.fineract.models.PutSelfUserRequest;
import org.mifos.fineract.models.PutSelfUserResponse;
import retrofit2.Call;
import retrofit2.http.PUT;

public interface SelfUserApi {
    /**
     * Update User
     * This API can be used by Self Service user to update their own user information. Currently, \&quot;password\&quot; and \&quot;repeatPassword\&quot; are the only parameters accepted.
     *
     * @param body body (required)
     * @return Call&lt;PutSelfUserResponse&gt;
     */
    @PUT("self/user")
    Call<PutSelfUserResponse> update(
            @retrofit2.http.Body PutSelfUserRequest body
    );

}

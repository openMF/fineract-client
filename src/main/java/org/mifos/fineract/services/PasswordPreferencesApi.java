package org.mifos.fineract.services;

import org.mifos.fineract.models.GetPasswordPreferencesTemplateResponse;
import org.mifos.fineract.models.PutPasswordPreferencesTemplateRequest;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;

import java.util.List;

public interface PasswordPreferencesApi {
    /**
     * @return Call&lt;GetPasswordPreferencesTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("passwordpreferences")
    Call<GetPasswordPreferencesTemplateResponse> retrieve();


    /**
     * List Application Password validation policies
     * ARGUMENTS Example Requests:  passwordpreferences
     *
     * @return Call&lt;List&lt;GetPasswordPreferencesTemplateResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("passwordpreferences/template")
    Call<List<GetPasswordPreferencesTemplateResponse>> template();


    /**
     * Update password preferences
     *
     * @param body body (required)
     * @return Call&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("passwordpreferences")
    Call<Void> update(
            @retrofit2.http.Body PutPasswordPreferencesTemplateRequest body
    );

}

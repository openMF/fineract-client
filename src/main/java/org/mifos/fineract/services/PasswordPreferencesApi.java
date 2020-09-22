package org.mifos.fineract.services;

import org.mifos.fineract.models.GetPasswordPreferencesTemplateResponse;
import org.mifos.fineract.models.PutPasswordPreferencesTemplateRequest;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import rx.Observable;

import java.util.List;

public interface PasswordPreferencesApi {
    /**
     * @return Observable&lt;GetPasswordPreferencesTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("passwordpreferences")
    Observable<GetPasswordPreferencesTemplateResponse> retrieve();


    /**
     * List Application Password validation policies
     * ARGUMENTS Example Requests:  passwordpreferences
     *
     * @return Observable&lt;List&lt;GetPasswordPreferencesTemplateResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("passwordpreferences/template")
    Observable<List<GetPasswordPreferencesTemplateResponse>> template();


    /**
     * Update password preferences
     *
     * @param body body (required)
     * @return Observable&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("passwordpreferences")
    Observable<Void> update(
            @retrofit2.http.Body PutPasswordPreferencesTemplateRequest body
    );

}

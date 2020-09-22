package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface HooksApi {
    /**
     * Create a Hook
     * The following parameters can be passed for the creation of a hook :-  name - string - Required. The name of the template that is being called. (See /hooks/template for the list of valid hook names.)  isActive - boolean - Determines whether the hook is actually triggered.  events - array - Determines what events the hook is triggered for.  config - hash - Required. Key/value pairs to provide settings for this hook. These settings vary between the templates.  templateId - Optional. The UGD template ID associated with the same entity (client or loan).
     *
     * @param body (required)
     * @return Observable&lt;PostHookResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("hooks")
    Observable<PostHookResponse> createHook(
            @retrofit2.http.Body PostHookRequest body
    );

    /**
     * Delete a Hook
     * Deletes a hook.
     *
     * @param hookId hookId (required)
     * @return Observable&lt;DeleteHookResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("hooks/{hookId}")
    Observable<DeleteHookResponse> deleteHook(
            @retrofit2.http.Path("hookId") Long hookId
    );

    /**
     * Retrieve a Hook
     * Returns the details of a Hook.  Example Requests:  hooks/1
     *
     * @param hookId hookId (required)
     * @return Observable&lt;GetHookResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("hooks/{hookId}")
    Observable<GetHookResponse> retrieveHook(
            @retrofit2.http.Path("hookId") Long hookId
    );

    /**
     * Retrieve Hooks
     * Returns the list of hooks.  Example Requests:  hooks
     *
     * @return Observable&lt;List&lt;GetHookResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("hooks")
    Observable<List<GetHookResponse>> retrieveHooks();


    /**
     * Retrieve Hooks Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  hooks/template
     *
     * @return Observable&lt;GetHookTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("hooks/template")
    Observable<GetHookTemplateResponse> template();


    /**
     * Update a Hook
     * Updates the details of a hook.
     *
     * @param hookId hookId (required)
     * @param body   (required)
     * @return Observable&lt;PutHookResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("hooks/{hookId}")
    Observable<PutHookResponse> updateHook(
            @retrofit2.http.Path("hookId") Long hookId, @retrofit2.http.Body PutHookRequest body
    );

}

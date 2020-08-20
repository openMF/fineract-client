package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserGeneratedDocumentsApi {
    /**
     * Add a UGD
     * Adds a new UGD.  Mandatory Fields name    Example Requests:  templates/1
     *
     * @param body body (required)
     * @return Call&lt;PostTemplatesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("templates")
    Call<PostTemplatesResponse> createTemplate(
            @retrofit2.http.Body PostTemplatesRequest body
    );

    /**
     * Delete a UGD
     *
     * @param templateId templateId (required)
     * @return Call&lt;DeleteTemplatesTemplateIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("templates/{templateId}")
    Call<DeleteTemplatesTemplateIdResponse> deleteTemplate(
            @retrofit2.http.Path("templateId") Long templateId
    );

    /**
     * @param templateId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("templates/{templateId}/template")
    Call<String> getTemplateByTemplate(
            @retrofit2.http.Path("templateId") Long templateId
    );

    /**
     * @param templateId (required)
     * @param body       (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("templates/{templateId}")
    Call<String> mergeTemplate(
            @retrofit2.http.Path("templateId") Long templateId, @retrofit2.http.Body String body
    );

    /**
     * Retrieve all UGDs
     * Example Requests:  templates  It is also possible to get specific UGDs by entity and type:  templates?type&#x3D;0&amp;entity&#x3D;0 [Entity: Id]      client: 0, loan: 1  [Type: Id]    Document: 0, E-Mail (not yet): 1,  SMS: 2
     *
     * @param typeId   typeId (optional, default to -1)
     * @param entityId entityId (optional, default to -1)
     * @return Call&lt;GetTemplatesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("templates")
    Call<GetTemplatesResponse> retrieveAll(
            @retrofit2.http.Query("typeId") Integer typeId, @retrofit2.http.Query("entityId") Integer entityId
    );

    /**
     * Retrieve a UGD
     * Example Requests:  templates/1
     *
     * @param templateId templateId (required)
     * @return Call&lt;GetTemplatesTemplateIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("templates/{templateId}")
    Call<GetTemplatesTemplateIdResponse> retrieveOne(
            @retrofit2.http.Path("templateId") Long templateId
    );

    /**
     * Update a UGD
     *
     * @param templateId templateId (required)
     * @param body       body (required)
     * @return Call&lt;PutTemplatesTemplateIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("templates/{templateId}")
    Call<PutTemplatesTemplateIdResponse> saveTemplate(
            @retrofit2.http.Path("templateId") Long templateId, @retrofit2.http.Body PutTemplatesTemplateIdRequest body
    );

    /**
     * Retrieve UGD Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for UGDs. The UGD data returned consists of any or all of:  ARGUMENTS name String entity String type String text String optional mappers Mapper optional Example Request:  templates/template
     *
     * @return Call&lt;GetTemplatesTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("templates/template")
    Call<GetTemplatesTemplateResponse> template();


}

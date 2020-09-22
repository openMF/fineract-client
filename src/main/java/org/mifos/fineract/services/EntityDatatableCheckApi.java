package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

import java.util.List;

public interface EntityDatatableCheckApi {
    /**
     * Create Entity-Datatable Checks
     * Mandatory Fields :  entity, status, datatableName  Non-Mandatory Fields :  productId
     *
     * @param body body (required)
     * @return Observable&lt;PostEntityDatatableChecksTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("entityDatatableChecks")
    Observable<PostEntityDatatableChecksTemplateResponse> createEntityDatatableCheck(
            @retrofit2.http.Body PostEntityDatatableChecksTemplateRequest body
    );

    /**
     * Delete Entity-Datatable Checks
     * Deletes an existing Entity-Datatable Check
     *
     * @param entityDatatableCheckId entityDatatableCheckId (required)
     * @param body                   (optional)
     * @return Observable&lt;DeleteEntityDatatableChecksTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("entityDatatableChecks/{entityDatatableCheckId}")
    Observable<DeleteEntityDatatableChecksTemplateResponse> deleteDatatable(
            @retrofit2.http.Path("entityDatatableCheckId") Long entityDatatableCheckId, @retrofit2.http.Body String body
    );

    /**
     * Retrieve Entity-Datatable Checks Template
     * This is a convenience resource useful for building maintenance user interface screens for Entity-Datatable Checks applications. The template data returned consists of:  Allowed Value Lists Example Request:  entityDatatableChecks/template
     *
     * @return Observable&lt;GetEntityDatatableChecksTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("entityDatatableChecks/template")
    Observable<GetEntityDatatableChecksTemplateResponse> getTemplate();


    /**
     * List Entity-Datatable Checks
     * The list capability of Entity-Datatable Checks can support pagination.  OPTIONAL ARGUMENTS offset Integer optional, defaults to 0 Indicates the result from which pagination startslimit Integer optional, defaults to 200 Restricts the size of results returned. To override the default and return all entries you must explicitly pass a non-positive integer value for limit e.g. limit&#x3D;0, or limit&#x3D;-1 Example Request:  entityDatatableChecks?offset&#x3D;0&amp;limit&#x3D;15
     *
     * @param status    status (optional)
     * @param entity    entity (optional)
     * @param productId productId (optional)
     * @param offset    offset (optional)
     * @param limit     limit (optional)
     * @return Observable&lt;List&lt;GetEntityDatatableChecksResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("entityDatatableChecks")
    Observable<List<GetEntityDatatableChecksResponse>> retrieveAll(
            @retrofit2.http.Query("status") Long status, @retrofit2.http.Query("entity") String entity, @retrofit2.http.Query("productId") Long productId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
    );

}

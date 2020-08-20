package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface AccountingClosureApi {
    /**
     * Create an Accounting Closure
     * Mandatory Fields officeId,closingDate
     *
     * @param body Request Body (required)
     * @return Call&lt;PostGlClosuresResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("glclosures")
    Call<PostGlClosuresResponse> createGLClosure(
            @retrofit2.http.Body PostGLCLosuresRequest body
    );

    /**
     * Delete an accounting closure
     * Note: Only the latest accounting closure associated with a branch may be deleted.
     *
     * @param glClosureId glclosureId (required)
     * @return Call&lt;DeleteGlClosuresResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("glclosures/{glClosureId}")
    Call<DeleteGlClosuresResponse> deleteGLClosure(
            @retrofit2.http.Path("glClosureId") Long glClosureId
    );

    /**
     * Retrieve an Accounting Closure
     * Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate
     *
     * @param glClosureId glClosureId (required)
     * @return Call&lt;GetGLClosureResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("glclosures/{glClosureId}")
    Call<GetGLClosureResponse> retreiveClosure(
            @retrofit2.http.Path("glClosureId") Long glClosureId
    );

    /**
     * List Accounting closures
     * Example Requests:  glclosures
     *
     * @param officeId officeId (optional)
     * @return Call&lt;List&lt;GetGLClosureResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("glclosures")
    Call<List<GetGLClosureResponse>> retrieveAllClosures(
            @retrofit2.http.Query("officeId") Long officeId
    );

    /**
     * Update an Accounting closure
     * Once an accounting closure is created, only the comments associated with it may be edited
     *
     * @param glClosureId glClosureId (required)
     * @param body        Request body (required)
     * @return Call&lt;PutGlClosuresResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("glclosures/{glClosureId}")
    Call<PutGlClosuresResponse> updateGLClosure(
            @retrofit2.http.Path("glClosureId") Long glClosureId, @retrofit2.http.Body PutGlClosuresRequest body
    );

}

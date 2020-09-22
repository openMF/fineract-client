package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface CodesApi {
    /**
     * Create a Code
     * Creates a code. Codes created through api are always &#39;user defined&#39; and so system defined is marked as false.
     *
     * @param body body (required)
     * @return Observable&lt;PostCodesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("codes")
    Observable<PostCodesResponse> createCode(
            @retrofit2.http.Body PostCodesRequest body
    );

    /**
     * Delete a Code
     * Deletes a code if it is not system defined.
     *
     * @param codeId codeId (required)
     * @return Observable&lt;DeleteCodesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("codes/{codeId}")
    Observable<DeleteCodesResponse> deleteCode(
            @retrofit2.http.Path("codeId") Long codeId
    );

    /**
     * Retrieve a Code
     * Returns the details of a Code.  Example Requests:  codes/1
     *
     * @param codeId codeId (required)
     * @return Observable&lt;GetCodesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("codes/{codeId}")
    Observable<GetCodesResponse> retrieveCode(
            @retrofit2.http.Path("codeId") Long codeId
    );

    /**
     * Retrieve Codes
     * Returns the list of codes.  Example Requests:  codes
     *
     * @return Observable&lt;List&lt;GetCodesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("codes")
    Observable<List<GetCodesResponse>> retrieveCodes();


    /**
     * Update a Code
     * Updates the details of a code if it is not system defined.
     *
     * @param codeId codeId (required)
     * @param body   body (required)
     * @return Observable&lt;PutCodesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("codes/{codeId}")
    Observable<PutCodesResponse> updateCode(
            @retrofit2.http.Path("codeId") Long codeId, @retrofit2.http.Body PutCodesRequest body
    );

}

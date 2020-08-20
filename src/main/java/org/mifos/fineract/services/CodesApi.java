package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface CodesApi {
    /**
     * Create a Code
     * Creates a code. Codes created through api are always &#39;user defined&#39; and so system defined is marked as false.
     *
     * @param body body (required)
     * @return Call&lt;PostCodesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("codes")
    Call<PostCodesResponse> createCode(
            @retrofit2.http.Body PostCodesRequest body
    );

    /**
     * Delete a Code
     * Deletes a code if it is not system defined.
     *
     * @param codeId codeId (required)
     * @return Call&lt;DeleteCodesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("codes/{codeId}")
    Call<DeleteCodesResponse> deleteCode(
            @retrofit2.http.Path("codeId") Long codeId
    );

    /**
     * Retrieve a Code
     * Returns the details of a Code.  Example Requests:  codes/1
     *
     * @param codeId codeId (required)
     * @return Call&lt;GetCodesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("codes/{codeId}")
    Call<GetCodesResponse> retrieveCode(
            @retrofit2.http.Path("codeId") Long codeId
    );

    /**
     * Retrieve Codes
     * Returns the list of codes.  Example Requests:  codes
     *
     * @return Call&lt;List&lt;GetCodesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("codes")
    Call<List<GetCodesResponse>> retrieveCodes();


    /**
     * Update a Code
     * Updates the details of a code if it is not system defined.
     *
     * @param codeId codeId (required)
     * @param body   body (required)
     * @return Call&lt;PutCodesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("codes/{codeId}")
    Call<PutCodesResponse> updateCode(
            @retrofit2.http.Path("codeId") Long codeId, @retrofit2.http.Body PutCodesRequest body
    );

}

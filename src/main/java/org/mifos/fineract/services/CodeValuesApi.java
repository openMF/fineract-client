package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface CodeValuesApi {
    /**
     * Create a Code Value
     *
     * @param codeId codeId (required)
     * @param body   body (required)
     * @return Call&lt;PostCodeValueDataResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("codes/{codeId}/codevalues")
    Call<PostCodeValueDataResponse> createCodeValue(
            @retrofit2.http.Path("codeId") Long codeId, @retrofit2.http.Body PostCodeValuesDataRequest body
    );

    /**
     * Delete a Code Value
     * Deletes a code value
     *
     * @param codeId      codeId (required)
     * @param codeValueId codeValueId (required)
     * @return Call&lt;DeleteCodeValueDataResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("codes/{codeId}/codevalues/{codeValueId}")
    Call<DeleteCodeValueDataResponse> deleteCodeValue(
            @retrofit2.http.Path("codeId") Long codeId, @retrofit2.http.Path("codeValueId") Long codeValueId
    );

    /**
     * List Code Values
     * Returns the list of Code Values for a given Code  Example Requests:  codes/1/codevalues
     *
     * @param codeId codeId (required)
     * @return Call&lt;List&lt;GetCodeValuesDataResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("codes/{codeId}/codevalues")
    Call<List<GetCodeValuesDataResponse>> retrieveAllCodeValues(
            @retrofit2.http.Path("codeId") Long codeId
    );

    /**
     * Retrieve a Code Value
     * Returns the details of a Code Value  Example Requests:  codes/1/codevalues/1
     *
     * @param codeValueId codeValueId (required)
     * @return Call&lt;GetCodeValuesDataResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("codes/{codeId}/codevalues/{codeValueId}")
    Call<GetCodeValuesDataResponse> retrieveCodeValue(
            @retrofit2.http.Path("codeValueId") Long codeValueId
    );

    /**
     * Update a Code Value
     * Updates the details of a code value.
     *
     * @param codeId      codeId (required)
     * @param codeValueId codeValueId (required)
     * @param body        body (required)
     * @return Call&lt;PutCodeValueDataResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("codes/{codeId}/codevalues/{codeValueId}")
    Call<PutCodeValueDataResponse> updateCodeValue(
            @retrofit2.http.Path("codeId") Long codeId, @retrofit2.http.Path("codeValueId") Long codeValueId, @retrofit2.http.Body PutCodeValuesDataRequest body
    );

}

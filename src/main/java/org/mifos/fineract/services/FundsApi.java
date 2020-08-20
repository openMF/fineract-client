package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

import java.util.List;

public interface FundsApi {
    /**
     * Create a Fund
     * Creates a Fund
     *
     * @param body body (required)
     * @return Call&lt;PostFundsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("funds")
    Call<PostFundsResponse> createFund(
            @retrofit2.http.Body PostFundsRequest body
    );

    /**
     * Retrieve a Fund
     * Returns the details of a Fund.  Example Requests:  funds/1
     *
     * @param fundId fundId (required)
     * @return Call&lt;GetFundsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("funds/{fundId}")
    Call<GetFundsResponse> retreiveFund(
            @retrofit2.http.Path("fundId") Long fundId
    );

    /**
     * Retrieve Funds
     * Returns the list of funds.  Example Requests:  funds
     *
     * @return Call&lt;List&lt;GetFundsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("funds")
    Call<List<GetFundsResponse>> retrieveFunds();


    /**
     * Update a Fund
     * Updates the details of a fund.
     *
     * @param fundId fundId (required)
     * @param body   body (required)
     * @return Call&lt;PutFundsFundIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("funds/{fundId}")
    Call<PutFundsFundIdResponse> updateFund(
            @retrofit2.http.Path("fundId") Long fundId, @retrofit2.http.Body PutFundsFundIdRequest body
    );

}

package org.mifos.fineract.services;

import org.mifos.fineract.models.GetAccountTransferTemplateResponse;
import org.mifos.fineract.models.PostNewTransferResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import java.util.List;

public interface SelfAccountTransferApi {
    /**
     * Create new Transfer
     * Ability to create new transfer of monetary funds from one account to another.   Example Requests:   self/accounttransfers/
     *
     * @param type type (optional)
     * @param body (optional)
     * @return Call&lt;List&lt;PostNewTransferResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("self/accounttransfers")
    Call<List<PostNewTransferResponse>> create(
            @retrofit2.http.Query("type") String type, @retrofit2.http.Body String body
    );

    /**
     * Retrieve Account Transfer Template
     * Returns list of loan/savings accounts that can be used for account transfer   Example Requests:  self/accounttransfers/template
     *
     * @param type type (optional)
     * @return Call&lt;List&lt;GetAccountTransferTemplateResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/accounttransfers/template")
    Call<List<GetAccountTransferTemplateResponse>> template(
            @retrofit2.http.Query("type") String type
    );

}

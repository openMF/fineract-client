package org.mifos.fineract.services;

import org.mifos.fineract.models.GetShareAccountsClientIdProductIdResponse;
import org.mifos.fineract.models.PostNewShareApplicationResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import java.util.List;

public interface SelfShareAccountsApi {
    /**
     * Submit new share application
     * Mandatory fields:  clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate   Optional Fields  accountNo, externalId   Inherited from Product (if not provided)  minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType.
     *
     * @param body (optional)
     * @return Call&lt;List&lt;PostNewShareApplicationResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("self/shareaccounts")
    Call<List<PostNewShareApplicationResponse>> createAccount(
            @retrofit2.http.Body String body
    );

    /**
     * @param accountId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/shareaccounts/{accountId}")
    Call<String> retrieveShareAccount(
            @retrofit2.http.Path("accountId") Long accountId
    );

    /**
     * Retrieve Share Account Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of: Field Defaults  Allowed Value Lists   Arguments  clientId:Integer mandatory productId:Integer optionalIf entered, productId, productName and selectedProduct fields are returned. Example Requests:  self/shareaccounts/template?clientId&#x3D;14  self/shareaccounts/template?clientId&#x3D;14&amp;productId&#x3D;3
     *
     * @param clientId  clientId (optional)
     * @param productId productId (optional)
     * @return Call&lt;List&lt;GetShareAccountsClientIdProductIdResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/shareaccounts/template")
    Call<List<GetShareAccountsClientIdProductIdResponse>> template(
            @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("productId") Long productId
    );

}

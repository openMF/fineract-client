package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface AccountTransfersApi {
    /**
     * Create new Transfer
     * Ability to create new transfer of monetary funds from one account to another.
     *
     * @param body body (required)
     * @return Call&lt;PostAccountTransfersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("accounttransfers")
    Call<PostAccountTransfersResponse> create(
            @retrofit2.http.Body PostAccountTransfersRequest body
    );

    /**
     * List account transfers
     * Lists account&#39;s transfers  Example Requests:    accounttransfers
     *
     * @param sqlSearch       sqlSearch (optional)
     * @param externalId      externalId (optional)
     * @param offset          offset (optional)
     * @param limit           (optional)
     * @param orderBy         orderBy (optional)
     * @param sortOrder       sortOrder (optional)
     * @param accountDetailId accountDetailId (optional)
     * @return Call&lt;GetAccountTransfersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accounttransfers")
    Call<GetAccountTransfersResponse> retrieveAll(
            @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("externalId") String externalId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("accountDetailId") Long accountDetailId
    );

    /**
     * Retrieve account transfer
     * Retrieves account transfer  Example Requests :    accounttransfers/1
     *
     * @param transferId transferId (required)
     * @return Call&lt;GetAccountTransfersPageItems&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accounttransfers/{transferId}")
    Call<GetAccountTransfersPageItems> retrieveOne(
            @retrofit2.http.Path("transferId") Long transferId
    );

    /**
     * Retrieve Account Transfer Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1    accounttransfers/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1
     *
     * @param fromOfficeId    fromOfficeId (optional)
     * @param fromClientId    fromClientId (optional)
     * @param fromAccountId   fromAccountId (optional)
     * @param fromAccountType fromAccountType (optional)
     * @param toOfficeId      toOfficeId (optional)
     * @param toClientId      toClientId (optional)
     * @param toAccountId     toAccountId (optional)
     * @param toAccountType   toAccountType (optional)
     * @return Call&lt;GetAccountTransfersTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accounttransfers/template")
    Call<GetAccountTransfersTemplateResponse> template(
            @retrofit2.http.Query("fromOfficeId") Long fromOfficeId, @retrofit2.http.Query("fromClientId") Long fromClientId, @retrofit2.http.Query("fromAccountId") Long fromAccountId, @retrofit2.http.Query("fromAccountType") Integer fromAccountType, @retrofit2.http.Query("toOfficeId") Long toOfficeId, @retrofit2.http.Query("toClientId") Long toClientId, @retrofit2.http.Query("toAccountId") Long toAccountId, @retrofit2.http.Query("toAccountType") Integer toAccountType
    );

    /**
     * Retrieve Refund of an Active Loan by Transfer Template
     * Retrieves Refund of an Active Loan by Transfer TemplateExample Requests :    accounttransfers/templateRefundByTransfer?fromAccountId&#x3D;2&amp;fromAccountType&#x3D;1&amp; toAccountId&#x3D;1&amp;toAccountType&#x3D;2&amp;toClientId&#x3D;1&amp;toOfficeId&#x3D;1
     *
     * @param fromOfficeId    fromOfficeId (optional)
     * @param fromClientId    fromClientId (optional)
     * @param fromAccountId   fromAccountId (optional)
     * @param fromAccountType fromAccountType (optional)
     * @param toOfficeId      toOfficeId (optional)
     * @param toClientId      toClientId (optional)
     * @param toAccountId     toAccountId (optional)
     * @param toAccountType   toAccountType (optional)
     * @return Call&lt;GetAccountTransfersTemplateRefundByTransferResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accounttransfers/templateRefundByTransfer")
    Call<GetAccountTransfersTemplateRefundByTransferResponse> templateRefundByTransfer(
            @retrofit2.http.Query("fromOfficeId") Long fromOfficeId, @retrofit2.http.Query("fromClientId") Long fromClientId, @retrofit2.http.Query("fromAccountId") Long fromAccountId, @retrofit2.http.Query("fromAccountType") Integer fromAccountType, @retrofit2.http.Query("toOfficeId") Long toOfficeId, @retrofit2.http.Query("toClientId") Long toClientId, @retrofit2.http.Query("toAccountId") Long toAccountId, @retrofit2.http.Query("toAccountType") Integer toAccountType
    );

    /**
     * Refund of an Active Loan by Transfer
     * Ability to refund an active loan by transferring to a savings account.
     *
     * @param body body (required)
     * @return Call&lt;PostAccountTransfersRefundByTransferResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("accounttransfers/refundByTransfer")
    Call<PostAccountTransfersRefundByTransferResponse> templateRefundByTransferPost(
            @retrofit2.http.Body PostAccountTransfersRefundByTransferRequest body
    );

}

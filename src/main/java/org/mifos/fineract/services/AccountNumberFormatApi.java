package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface AccountNumberFormatApi {
    /**
     * Create an Account number format
     * Note: You may associate a single Account number format for a given account type Mandatory Fields for Account number formats accountType
     *
     * @param body body (optional)
     * @return Call&lt;PostAccountNumberFormatsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("accountnumberformats")
    Call<PostAccountNumberFormatsResponse> create(
            @retrofit2.http.Body PostAccountNumberFormatsRequest body
    );

    /**
     * Delete an Account number format
     * Note: Account numbers created while this format was active would remain unchanged.
     *
     * @param accountNumberFormatId accountNumberFormatId (required)
     * @return Call&lt;DeleteAccountNumberFormatsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("accountnumberformats/{accountNumberFormatId}")
    Call<DeleteAccountNumberFormatsResponse> delete(
            @retrofit2.http.Path("accountNumberFormatId") Long accountNumberFormatId
    );

    /**
     * List Account number formats
     * Example Requests:  accountnumberformats   accountnumberformats?fields&#x3D;accountType,prefixType
     *
     * @return Call&lt;List&lt;GetAccountNumberFormatsIdResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accountnumberformats")
    Call<List<GetAccountNumberFormatsIdResponse>> retrieveAll();


    /**
     * Retrieve an Account number format
     * Example Requests:  accountnumberformats/1   accountnumberformats/1?template&#x3D;true   accountnumberformats/1?fields&#x3D;accountType,prefixType
     *
     * @param accountNumberFormatId accountNumberFormatId (required)
     * @return Call&lt;GetAccountNumberFormatsIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accountnumberformats/{accountNumberFormatId}")
    Call<GetAccountNumberFormatsIdResponse> retrieveOne(
            @retrofit2.http.Path("accountNumberFormatId") Long accountNumberFormatId
    );

    /**
     * Retrieve Account number format Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  accountnumberformats/template
     *
     * @return Call&lt;GetAccountNumberFormatsResponseTemplate&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accountnumberformats/template")
    Call<GetAccountNumberFormatsResponseTemplate> retrieveTemplate();


    /**
     * Update an Account number format
     *
     * @param accountNumberFormatId accountNumberFormatId (required)
     * @param body                  body (required)
     * @return Call&lt;PutAccountNumberFormatsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("accountnumberformats/{accountNumberFormatId}")
    Call<PutAccountNumberFormatsResponse> update(
            @retrofit2.http.Path("accountNumberFormatId") Long accountNumberFormatId, @retrofit2.http.Body PutAccountNumberFormatsRequest body
    );

}

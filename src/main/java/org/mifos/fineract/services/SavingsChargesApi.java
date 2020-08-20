package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface SavingsChargesApi {
    /**
     * Create a Savings account Charge
     * Creates a Savings account Charge  Mandatory Fields for Savings account Charges: chargeId, amount  chargeId, amount, dueDate, dateFormat, locale  chargeId, amount, feeOnMonthDay, monthDayFormat, locale
     *
     * @param savingsAccountId savingsAccountId (required)
     * @param body             body (required)
     * @return Call&lt;PostSavingsAccountsSavingsAccountIdChargesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("savingsaccounts/{savingsAccountId}/charges")
    Call<PostSavingsAccountsSavingsAccountIdChargesResponse> addSavingsAccountCharge(
            @retrofit2.http.Path("savingsAccountId") Long savingsAccountId, @retrofit2.http.Body PostSavingsAccountsSavingsAccountIdChargesRequest body
    );

    /**
     * Delete a Savings account Charge
     * Note: Currently, A Savings account Charge may only be removed from Savings that are not yet approved.
     *
     * @param savingsAccountId       savingsAccountId (required)
     * @param savingsAccountChargeId savingsAccountChargeId (required)
     * @return Call&lt;DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
    Call<DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> deleteSavingsAccountCharge(
            @retrofit2.http.Path("savingsAccountId") Long savingsAccountId, @retrofit2.http.Path("savingsAccountChargeId") Long savingsAccountChargeId
    );

    /**
     * Pay a Savings account Charge | Waive off a Savings account Charge | Inactivate a Savings account Charge
     * Pay a Savings account Charge:  An active charge will be paid when savings account is active and having sufficient balance.  Waive off a Savings account Charge:  Outstanding charge amount will be waived off.  Inactivate a Savings account Charge:  A charge will be allowed to inactivate when savings account is active and not having any dues as of today. If charge is overpaid, corresponding charge payment transactions will be reversed.  Showing request/response for &#39;Pay a Savings account Charge&#39;
     *
     * @param savingsAccountId       savingsAccountId (required)
     * @param savingsAccountChargeId savingsAccountChargeId (required)
     * @param body                   body (required)
     * @param command                command (optional)
     * @return Call&lt;PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
    Call<PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> payOrWaiveSavingsAccountCharge(
            @retrofit2.http.Path("savingsAccountId") Long savingsAccountId, @retrofit2.http.Path("savingsAccountChargeId") Long savingsAccountChargeId, @retrofit2.http.Body PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest body, @retrofit2.http.Query("command") String command
    );

    /**
     * List Savings Charges
     * Lists Savings Charges  Example Requests:  savingsaccounts/1/charges  savingsaccounts/1/charges?chargeStatus&#x3D;all  savingsaccounts/1/charges?chargeStatus&#x3D;inactive  savingsaccounts/1/charges?chargeStatus&#x3D;active  savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
     *
     * @param savingsAccountId savingsAccountId (required)
     * @param chargeStatus     chargeStatus (optional, default to all)
     * @return Call&lt;List&lt;GetSavingsAccountsSavingsAccountIdChargesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("savingsaccounts/{savingsAccountId}/charges")
    Call<List<GetSavingsAccountsSavingsAccountIdChargesResponse>> retrieveAllSavingsAccountCharges(
            @retrofit2.http.Path("savingsAccountId") Long savingsAccountId, @retrofit2.http.Query("chargeStatus") String chargeStatus
    );

    /**
     * Retrieve a Savings account Charge
     * Retrieves a Savings account Charge  Example Requests:  /savingsaccounts/1/charges/5   /savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
     *
     * @param savingsAccountId       savingsAccountId (required)
     * @param savingsAccountChargeId savingsAccountChargeId (required)
     * @return Call&lt;GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
    Call<GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> retrieveSavingsAccountCharge(
            @retrofit2.http.Path("savingsAccountId") Long savingsAccountId, @retrofit2.http.Path("savingsAccountChargeId") Long savingsAccountChargeId
    );

    /**
     * Retrieve Savings Charges Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  savingsaccounts/1/charges/template
     *
     * @param savingsAccountId savingsAccountId (required)
     * @return Call&lt;GetSavingsAccountsSavingsAccountIdChargesTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("savingsaccounts/{savingsAccountId}/charges/template")
    Call<GetSavingsAccountsSavingsAccountIdChargesTemplateResponse> retrieveTemplate(
            @retrofit2.http.Path("savingsAccountId") Long savingsAccountId
    );

    /**
     * Update a Savings account Charge
     * Currently Savings account Charges may be updated only if the Savings account is not yet approved.
     *
     * @param savingsAccountId       savingsAccountId (required)
     * @param savingsAccountChargeId savingsAccountChargeId (required)
     * @param body                   body (required)
     * @return Call&lt;PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId}")
    Call<PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> updateSavingsAccountCharge(
            @retrofit2.http.Path("savingsAccountId") Long savingsAccountId, @retrofit2.http.Path("savingsAccountChargeId") Long savingsAccountChargeId, @retrofit2.http.Body PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest body
    );

}

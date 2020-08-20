package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface AccountingRulesApi {
    /**
     * Create/Define a Accounting rule
     * Define a new Accounting rule.  Mandatory Fields name, officeId, accountToDebit OR debitTags, accountToCredit OR creditTags.  Optional Fields description
     *
     * @param body body (optional)
     * @return Call&lt;PostAccountingRulesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("accountingrules")
    Call<PostAccountingRulesResponse> createAccountingRule(
            @retrofit2.http.Body PostAccountingRulesRequest body
    );

    /**
     * Delete a Accounting Rule
     * Deletes a Accounting rule.
     *
     * @param accountingRuleId accountingRuleId (required)
     * @return Call&lt;DeleteAccountingRulesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("accountingrules/{accountingRuleId}")
    Call<DeleteAccountingRulesResponse> deleteAccountingRule(
            @retrofit2.http.Path("accountingRuleId") Long accountingRuleId
    );

    /**
     * Retrieve a Accounting rule
     * Returns the details of a defined Accounting rule.  Example Requests:  accountingrules/1
     *
     * @param accountingRuleId accountingRuleId (required)
     * @return Call&lt;AccountingRuleData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accountingrules/{accountingRuleId}")
    Call<AccountingRuleData> retreiveAccountingRule(
            @retrofit2.http.Path("accountingRuleId") Long accountingRuleId
    );

    /**
     * Retrieve Accounting Rules
     * Returns the list of defined accounting rules.  Example Requests:  accountingrules
     *
     * @return Call&lt;List&lt;GetAccountRulesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accountingrules")
    Call<List<GetAccountRulesResponse>> retrieveAllAccountingRules();


    /**
     * Retrieve Accounting Rule Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  accountingrules/template
     *
     * @return Call&lt;GetAccountRulesTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accountingrules/template")
    Call<GetAccountRulesTemplateResponse> retrieveTemplate();


    /**
     * Update a Accounting Rule
     * Updates the details of a Accounting rule.
     *
     * @param accountingRuleId accountingRuleId (required)
     * @param body             body (optional)
     * @return Call&lt;PutAccountingRulesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("accountingrules/{accountingRuleId}")
    Call<PutAccountingRulesResponse> updateAccountingRule(
            @retrofit2.http.Path("accountingRuleId") Long accountingRuleId, @retrofit2.http.Body PutAccountingRulesRequest body
    );

}

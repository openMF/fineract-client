package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface AccountingRulesApi {
    /**
     * Create/Define a Accounting rule
     * Define a new Accounting rule.  Mandatory Fields name, officeId, accountToDebit OR debitTags, accountToCredit OR creditTags.  Optional Fields description
     *
     * @param body body (optional)
     * @return Observable&lt;PostAccountingRulesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("accountingrules")
    Observable<PostAccountingRulesResponse> createAccountingRule(
            @retrofit2.http.Body PostAccountingRulesRequest body
    );

    /**
     * Delete a Accounting Rule
     * Deletes a Accounting rule.
     *
     * @param accountingRuleId accountingRuleId (required)
     * @return Observable&lt;DeleteAccountingRulesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("accountingrules/{accountingRuleId}")
    Observable<DeleteAccountingRulesResponse> deleteAccountingRule(
            @retrofit2.http.Path("accountingRuleId") Long accountingRuleId
    );

    /**
     * Retrieve a Accounting rule
     * Returns the details of a defined Accounting rule.  Example Requests:  accountingrules/1
     *
     * @param accountingRuleId accountingRuleId (required)
     * @return Observable&lt;AccountingRuleData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accountingrules/{accountingRuleId}")
    Observable<AccountingRuleData> retreiveAccountingRule(
            @retrofit2.http.Path("accountingRuleId") Long accountingRuleId
    );

    /**
     * Retrieve Accounting Rules
     * Returns the list of defined accounting rules.  Example Requests:  accountingrules
     *
     * @return Observable&lt;List&lt;GetAccountRulesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accountingrules")
    Observable<List<GetAccountRulesResponse>> retrieveAllAccountingRules();


    /**
     * Retrieve Accounting Rule Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  accountingrules/template
     *
     * @return Observable&lt;GetAccountRulesTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("accountingrules/template")
    Observable<GetAccountRulesTemplateResponse> retrieveTemplate();


    /**
     * Update a Accounting Rule
     * Updates the details of a Accounting rule.
     *
     * @param accountingRuleId accountingRuleId (required)
     * @param body             body (optional)
     * @return Observable&lt;PutAccountingRulesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("accountingrules/{accountingRuleId}")
    Observable<PutAccountingRulesResponse> updateAccountingRule(
            @retrofit2.http.Path("accountingRuleId") Long accountingRuleId, @retrofit2.http.Body PutAccountingRulesRequest body
    );

}

package org.openapitools.client.apis

import org.openapitools.client.models.AccountingRuleData
import org.openapitools.client.models.DeleteAccountingRulesResponse
import org.openapitools.client.models.GetAccountRulesResponse
import org.openapitools.client.models.GetAccountRulesTemplateResponse
import org.openapitools.client.models.PostAccountingRulesRequest
import org.openapitools.client.models.PostAccountingRulesResponse
import org.openapitools.client.models.PutAccountingRulesRequest
import org.openapitools.client.models.PutAccountingRulesResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface AccountingRulesApi {
    /**
     * Create/Define a Accounting rule
     * Define a new Accounting rule.  Mandatory Fields name, officeId, accountToDebit OR debitTags, accountToCredit OR creditTags.  Optional Fields description
     * Responses:
     *  - 200: OK
     *
     * @param postAccountingRulesRequest  (optional)
     * @return [PostAccountingRulesResponse]
     */
    @POST("v1/accountingrules")
    suspend fun createAccountingRule(@Body postAccountingRulesRequest: PostAccountingRulesRequest? = null): PostAccountingRulesResponse

    /**
     * Delete a Accounting Rule
     * Deletes a Accounting rule.
     * Responses:
     *  - 200: OK
     *
     * @param accountingRuleId accountingRuleId
     * @return [DeleteAccountingRulesResponse]
     */
    @DELETE("v1/accountingrules/{accountingRuleId}")
    suspend fun deleteAccountingRule(@Path("accountingRuleId") accountingRuleId: Long): DeleteAccountingRulesResponse

    /**
     * Retrieve a Accounting rule
     * Returns the details of a defined Accounting rule.  Example Requests:  accountingrules/1
     * Responses:
     *  - 200: OK
     *
     * @param accountingRuleId accountingRuleId
     * @return [AccountingRuleData]
     */
    @GET("v1/accountingrules/{accountingRuleId}")
    suspend fun retreiveAccountingRule(@Path("accountingRuleId") accountingRuleId: Long): AccountingRuleData

    /**
     * Retrieve Accounting Rules
     * Returns the list of defined accounting rules.  Example Requests:  accountingrules
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetAccountRulesResponse>]
     */
    @GET("v1/accountingrules")
    suspend fun retrieveAllAccountingRules(): List<GetAccountRulesResponse>

    /**
     * Retrieve Accounting Rule Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  accountingrules/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetAccountRulesTemplateResponse]
     */
    @GET("v1/accountingrules/template")
    suspend fun retrieveTemplate1(): GetAccountRulesTemplateResponse

    /**
     * Update a Accounting Rule
     * Updates the details of a Accounting rule.
     * Responses:
     *  - 200: OK
     *
     * @param accountingRuleId accountingRuleId
     * @param putAccountingRulesRequest  (optional)
     * @return [PutAccountingRulesResponse]
     */
    @PUT("v1/accountingrules/{accountingRuleId}")
    suspend fun updateAccountingRule(
        @Path("accountingRuleId") accountingRuleId: Long,
        @Body putAccountingRulesRequest: PutAccountingRulesRequest? = null
    ): PutAccountingRulesResponse

}

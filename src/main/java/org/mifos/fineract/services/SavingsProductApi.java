package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface SavingsProductApi {
    /**
     * Create a Savings Product
     * Creates a Savings Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, allowOverdraft, overdraftLimit, minBalanceForInterestCalculation,withHoldTax,taxGroupId
     *
     * @param body body (required)
     * @return Observable&lt;PostSavingsProductsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("savingsproducts")
    Observable<PostSavingsProductsResponse> create(
            @retrofit2.http.Body PostSavingsProductsRequest body
    );

    /**
     * Delete a Savings Product
     * Deletes a Savings Product
     *
     * @param productId productId (required)
     * @return Observable&lt;DeleteSavingsProductsProductIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("savingsproducts/{productId}")
    Observable<DeleteSavingsProductsProductIdResponse> delete(
            @retrofit2.http.Path("productId") Long productId
    );

    /**
     * List Savings Products
     * Lists Savings Products  Example Requests:  savingsproducts  savingsproducts?fields&#x3D;name
     *
     * @return Observable&lt;List&lt;GetSavingsProductsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("savingsproducts")
    Observable<List<GetSavingsProductsResponse>> retrieveAll();


    /**
     * Retrieve a Savings Product
     * Retrieves a Savings Product  Example Requests:  savingsproducts/1  savingsproducts/1?template&#x3D;true  savingsproducts/1?fields&#x3D;name,description
     *
     * @param productId productId (required)
     * @return Observable&lt;GetSavingsProductsProductIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("savingsproducts/{productId}")
    Observable<GetSavingsProductsProductIdResponse> retrieveOne(
            @retrofit2.http.Path("productId") Long productId
    );

    /**
     * Retrieve Savings Product Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  savingsproducts/template
     *
     * @return Observable&lt;GetSavingsProductsTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("savingsproducts/template")
    Observable<GetSavingsProductsTemplateResponse> retrieveTemplate();


    /**
     * Update a Savings Product
     * Updates a Savings Product
     *
     * @param productId productId (required)
     * @param body      body (required)
     * @return Observable&lt;PutSavingsProductsProductIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("savingsproducts/{productId}")
    Observable<PutSavingsProductsProductIdResponse> update(
            @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body PutSavingsProductsProductIdRequest body
    );

}

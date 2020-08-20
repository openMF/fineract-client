package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface FixedDepositProductApi {
    /**
     * Create a Fixed Deposit Product
     * Creates a Fixed Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, accountingRule  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, , withHoldTax, taxGroupId   Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId
     *
     * @param body body (required)
     * @return Call&lt;PostFixedDepositProductsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("fixeddepositproducts")
    Call<PostFixedDepositProductsResponse> create(
            @retrofit2.http.Body PostFixedDepositProductsRequest body
    );

    /**
     * Delete a Fixed Deposit Product
     * Deletes a Fixed Deposit Product
     *
     * @param productId productId (required)
     * @return Call&lt;DeleteFixedDepositProductsProductIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("fixeddepositproducts/{productId}")
    Call<DeleteFixedDepositProductsProductIdResponse> delete(
            @retrofit2.http.Path("productId") Long productId
    );

    /**
     * List Fixed Deposit Products
     * Lists Fixed Deposit Products  Example Requests:  fixeddepositproducts   fixeddepositproducts?fields&#x3D;name
     *
     * @return Call&lt;List&lt;GetFixedDepositProductsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("fixeddepositproducts")
    Call<List<GetFixedDepositProductsResponse>> retrieveAll();


    /**
     * Retrieve a Fixed Deposit Product
     * Retrieves a Fixed Deposit Product  Example Requests:  fixeddepositproducts/1   fixeddepositproducts/1?template&#x3D;true   fixeddepositproducts/1?fields&#x3D;name,description
     *
     * @param productId productId (required)
     * @return Call&lt;GetFixedDepositProductsProductIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("fixeddepositproducts/{productId}")
    Call<GetFixedDepositProductsProductIdResponse> retrieveOne(
            @retrofit2.http.Path("productId") Long productId
    );

    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("fixeddepositproducts/template")
    Call<String> retrieveTemplate();


    /**
     * Update a Fixed Deposit Product
     * Updates a Fixed Deposit Product
     *
     * @param productId productId (required)
     * @param body      body (required)
     * @return Call&lt;PutFixedDepositProductsProductIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("fixeddepositproducts/{productId}")
    Call<PutFixedDepositProductsProductIdResponse> update(
            @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body PutFixedDepositProductsProductIdRequest body
    );

}

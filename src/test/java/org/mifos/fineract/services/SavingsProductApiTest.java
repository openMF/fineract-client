package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostSavingsProductsRequest;
import org.mifos.fineract.models.PutSavingsProductsProductIdRequest;

/**
 * API tests for SavingsProductApi
 */
public class SavingsProductApiTest {

    private SavingsProductApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SavingsProductApi.class);
    }

    /**
     * Create a Savings Product
     *
     * Creates a Savings Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, allowOverdraft, overdraftLimit, minBalanceForInterestCalculation,withHoldTax,taxGroupId
     */
    @Test
    public void createTest() {
        PostSavingsProductsRequest body = null;
        // PostSavingsProductsResponse response = api.create(body);

        // TODO: test validations
    }
    /**
     * Delete a Savings Product
     *
     * Deletes a Savings Product
     */
    @Test
    public void deleteTest() {
        Long productId = null;
        // DeleteSavingsProductsProductIdResponse response = api.delete(productId);

        // TODO: test validations
    }
    /**
     * List Savings Products
     *
     * Lists Savings Products  Example Requests:  savingsproducts  savingsproducts?fields&#x3D;name
     */
    @Test
    public void retrieveAllTest() {
        // List<GetSavingsProductsResponse> response = api.retrieveAll();

        // TODO: test validations
    }
    /**
     * Retrieve a Savings Product
     *
     * Retrieves a Savings Product  Example Requests:  savingsproducts/1  savingsproducts/1?template&#x3D;true  savingsproducts/1?fields&#x3D;name,description
     */
    @Test
    public void retrieveOneTest() {
        Long productId = null;
        // GetSavingsProductsProductIdResponse response = api.retrieveOne(productId);

        // TODO: test validations
    }
    /**
     * Retrieve Savings Product Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  savingsproducts/template
     */
    @Test
    public void retrieveTemplateTest() {
        // GetSavingsProductsTemplateResponse response = api.retrieveTemplate();

        // TODO: test validations
    }
    /**
     * Update a Savings Product
     *
     * Updates a Savings Product
     */
    @Test
    public void updateTest() {
        Long productId = null;
        PutSavingsProductsProductIdRequest body = null;
        // PutSavingsProductsProductIdResponse response = api.update(productId, body);

        // TODO: test validations
    }
}

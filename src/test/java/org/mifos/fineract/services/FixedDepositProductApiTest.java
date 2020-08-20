package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.PostFixedDepositProductsRequest;
import org.mifos.fineract.models.PutFixedDepositProductsProductIdRequest;

/**
 * API tests for FixedDepositProductApi
 */
public class FixedDepositProductApiTest {

    private FixedDepositProductApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FixedDepositProductApi.class);
    }

    /**
     * Create a Fixed Deposit Product
     * <p>
     * Creates a Fixed Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, accountingRule  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, , withHoldTax, taxGroupId   Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId
     */
    @Test
    public void createTest() {
        PostFixedDepositProductsRequest body = null;
        // PostFixedDepositProductsResponse response = api.create(body);

        // TODO: test validations
    }

    /**
     * Delete a Fixed Deposit Product
     * <p>
     * Deletes a Fixed Deposit Product
     */
    @Test
    public void deleteTest() {
        Long productId = null;
        // DeleteFixedDepositProductsProductIdResponse response = api.delete(productId);

        // TODO: test validations
    }

    /**
     * List Fixed Deposit Products
     * <p>
     * Lists Fixed Deposit Products  Example Requests:  fixeddepositproducts   fixeddepositproducts?fields&#x3D;name
     */
    @Test
    public void retrieveAllTest() {
        // List<GetFixedDepositProductsResponse> response = api.retrieveAll();

        // TODO: test validations
    }

    /**
     * Retrieve a Fixed Deposit Product
     * <p>
     * Retrieves a Fixed Deposit Product  Example Requests:  fixeddepositproducts/1   fixeddepositproducts/1?template&#x3D;true   fixeddepositproducts/1?fields&#x3D;name,description
     */
    @Test
    public void retrieveOneTest() {
        Long productId = null;
        // GetFixedDepositProductsProductIdResponse response = api.retrieveOne(productId);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveTemplateTest() {
        // String response = api.retrieveTemplate();

        // TODO: test validations
    }

    /**
     * Update a Fixed Deposit Product
     * <p>
     * Updates a Fixed Deposit Product
     */
    @Test
    public void updateTest() {
        Long productId = null;
        PutFixedDepositProductsProductIdRequest body = null;
        // PutFixedDepositProductsProductIdResponse response = api.update(productId, body);

        // TODO: test validations
    }
}

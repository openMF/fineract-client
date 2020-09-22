package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostRecurringDepositProductsRequest;
import org.mifos.fineract.models.PutRecurringDepositProductsRequest;

/**
 * API tests for RecurringDepositProductApi
 */
public class RecurringDepositProductApiTest {

    private RecurringDepositProductApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(RecurringDepositProductApi.class);
    }

    /**
     * Create a Recurring Deposit Product
     *
     * Creates a Recurring Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, recurringDepositFrequency, recurringDepositFrequencyTypeId, accountingRule, depositAmount  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, minDepositAmount, maxDepositAmount, withHoldTax, taxGroupId
     */
    @Test
    public void createTest() {
        PostRecurringDepositProductsRequest body = null;
        // PostRecurringDepositProductsResponse response = api.create(body);

        // TODO: test validations
    }
    /**
     * Delete a Recurring Deposit Product
     *
     * Deletes a Recurring Deposit Product
     */
    @Test
    public void deleteTest() {
        Long productId = null;
        // DeleteRecurringDepositProductsProductIdResponse response = api.delete(productId);

        // TODO: test validations
    }
    /**
     * List Recuring Deposit Products
     *
     * Lists Recuring Deposit Products  Example Requests:  recurringdepositproducts   recurringdepositproducts?fields&#x3D;name
     */
    @Test
    public void retrieveAllTest() {
        // List<GetRecurringDepositProductsResponse> response = api.retrieveAll();

        // TODO: test validations
    }
    /**
     * Retrieve a Recurring Deposit Product
     *
     * Retrieves a Recurring Deposit Product  Example Requests:  recurringdepositproducts/1   recurringdepositproducts/1?template&#x3D;true   recurringdepositproducts/1?fields&#x3D;name,description
     */
    @Test
    public void retrieveOneTest() {
        Long productId = null;
        // GetRecurringDepositProductsProductIdResponse response = api.retrieveOne(productId);

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
     * Update a Recurring Deposit Product
     *
     * Updates a Recurring Deposit Product
     */
    @Test
    public void updateTest() {
        Long productId = null;
        PutRecurringDepositProductsRequest body = null;
        // PutRecurringDepositProductsResponse response = api.update(productId, body);

        // TODO: test validations
    }
}

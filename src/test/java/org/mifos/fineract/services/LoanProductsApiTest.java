package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostLoanProductsRequest;
import org.mifos.fineract.models.PutLoanProductsProductIdRequest;

/**
 * API tests for LoanProductsApi
 */
public class LoanProductsApiTest {

    private LoanProductsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(LoanProductsApi.class);
    }

    /**
     * Create a Loan Product
     * <p>
     * Depending of the Accounting Rule (accountingRule) selected, additional fields with details of the appropriate Ledger Account identifiers would need to be passed in.  Refer MifosX Accounting Specs Draft for more details regarding the significance of the selected accounting rule  Mandatory Fields: name, shortName, currencyCode, digitsAfterDecimal, inMultiplesOf, principal, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, interestRateFrequencyType, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, accountingRule, isInterestRecalculationEnabled, daysInYearType, daysInMonthType  Optional Fields: inArrearsTolerance, graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, graceOnArrearsAgeing, charges, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, includeInBorrowerCycle, useBorrowerCycle,principalVariationsForBorrowerCycle, numberOfRepaymentVariationsForBorrowerCycle, interestRateVariationsForBorrowerCycle, multiDisburseLoan,maxTrancheCount, outstandingLoanBalance,overdueDaysForNPA,holdGuaranteeFunds, principalThresholdForLastInstalment, accountMovesOutOfNPAOnlyOnArrearsCompletion, canDefineInstallmentAmount, installmentAmountInMultiplesOf, allowAttributeOverrides, allowPartialPeriodInterestCalcualtion  Additional Mandatory Fields for Cash(2) based accounting: fundSourceAccountId, loanPortfolioAccountId, interestOnLoanAccountId, incomeFromFeeAccountId, incomeFromPenaltyAccountId, writeOffAccountId, transfersInSuspenseAccountId, overpaymentLiabilityAccountId  Additional Mandatory Fields for periodic (3) and upfront (4)accrual accounting: fundSourceAccountId, loanPortfolioAccountId, interestOnLoanAccountId, incomeFromFeeAccountId, incomeFromPenaltyAccountId, writeOffAccountId, receivableInterestAccountId, receivableFeeAccountId, receivablePenaltyAccountId, transfersInSuspenseAccountId, overpaymentLiabilityAccountId  Additional Mandatory Fields if interest recalculation is enabled(true): interestRecalculationCompoundingMethod, rescheduleStrategyMethod, recalculationRestFrequencyType  Additional Optional Fields if interest recalculation is enabled(true): isArrearsBasedOnOriginalSchedule, preClosureInterestCalculationStrategy  Additional Optional Fields if interest recalculation is enabled(true) and recalculationRestFrequencyType is not same as repayment period: recalculationRestFrequencyInterval, recalculationRestFrequencyDate  Additional Optional Fields if interest recalculation is enabled(true) and interestRecalculationCompoundingMethod is enabled: recalculationCompoundingFrequencyType  Additional Optional Fields if interest recalculation is enabled(true) and interestRecalculationCompoundingMethod is enabled and recalculationCompoundingFrequencyType is not same as repayment period: recalculationCompoundingFrequencyInterval, recalculationCompoundingFrequencyDate  Additional Mandatory Fields if Hold Guarantee funds is enabled(true): mandatoryGuarantee  Additional Optional Fields if Hold Guarantee funds is enabled(true): minimumGuaranteeFromOwnFunds,minimumGuaranteeFromGuarantor
     */
    @Test
    public void createLoanProductTest() {
        PostLoanProductsRequest body = null;
        // PostLoanProductsResponse response = api.createLoanProduct(body);

        // TODO: test validations
    }

    /**
     * List Loan Products
     * <p>
     * Lists Loan Products  Example Requests:  loanproducts   loanproducts?fields&#x3D;name,description,interestRateFrequencyType,amortizationType
     */
    @Test
    public void retrieveAllLoanProductsTest() {
        // List<GetLoanProductsResponse> response = api.retrieveAllLoanProducts();

        // TODO: test validations
    }

    /**
     * Retrieve a Loan Product
     * <p>
     * Retrieves a Loan Product  Example Requests:  loanproducts/1   loanproducts/1?template&#x3D;true   loanproducts/1?fields&#x3D;name,description,numberOfRepayments
     */
    @Test
    public void retrieveLoanProductDetailsTest() {
        Long productId = null;
        // GetLoanProductsProductIdResponse response = api.retrieveLoanProductDetails(productId);

        // TODO: test validations
    }

    /**
     * Retrieve Loan Product Details Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loanproducts/template
     */
    @Test
    public void retrieveTemplateTest() {
        Boolean isProductMixTemplate = null;
        // GetLoanProductsTemplateResponse response = api.retrieveTemplate(isProductMixTemplate);

        // TODO: test validations
    }

    /**
     * Update a Loan Product
     * <p>
     * Updates a Loan Product
     */
    @Test
    public void updateLoanProductTest() {
        Long productId = null;
        PutLoanProductsProductIdRequest body = null;
        // PutLoanProductsProductIdResponse response = api.updateLoanProduct(productId, body);

        // TODO: test validations
    }
}

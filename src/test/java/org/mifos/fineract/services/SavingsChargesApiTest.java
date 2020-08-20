package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostSavingsAccountsSavingsAccountIdChargesRequest;
import org.mifos.fineract.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest;
import org.mifos.fineract.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest;

/**
 * API tests for SavingsChargesApi
 */
public class SavingsChargesApiTest {

    private SavingsChargesApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SavingsChargesApi.class);
    }

    /**
     * Create a Savings account Charge
     * <p>
     * Creates a Savings account Charge  Mandatory Fields for Savings account Charges: chargeId, amount  chargeId, amount, dueDate, dateFormat, locale  chargeId, amount, feeOnMonthDay, monthDayFormat, locale
     */
    @Test
    public void addSavingsAccountChargeTest() {
        Long savingsAccountId = null;
        PostSavingsAccountsSavingsAccountIdChargesRequest body = null;
        // PostSavingsAccountsSavingsAccountIdChargesResponse response = api.addSavingsAccountCharge(savingsAccountId, body);

        // TODO: test validations
    }

    /**
     * Delete a Savings account Charge
     * <p>
     * Note: Currently, A Savings account Charge may only be removed from Savings that are not yet approved.
     */
    @Test
    public void deleteSavingsAccountChargeTest() {
        Long savingsAccountId = null;
        Long savingsAccountChargeId = null;
        // DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse response = api.deleteSavingsAccountCharge(savingsAccountId, savingsAccountChargeId);

        // TODO: test validations
    }

    /**
     * Pay a Savings account Charge | Waive off a Savings account Charge | Inactivate a Savings account Charge
     * <p>
     * Pay a Savings account Charge:  An active charge will be paid when savings account is active and having sufficient balance.  Waive off a Savings account Charge:  Outstanding charge amount will be waived off.  Inactivate a Savings account Charge:  A charge will be allowed to inactivate when savings account is active and not having any dues as of today. If charge is overpaid, corresponding charge payment transactions will be reversed.  Showing request/response for &#39;Pay a Savings account Charge&#39;
     */
    @Test
    public void payOrWaiveSavingsAccountChargeTest() {
        Long savingsAccountId = null;
        Long savingsAccountChargeId = null;
        PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest body = null;
        String command = null;
        // PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse response = api.payOrWaiveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId, body, command);

        // TODO: test validations
    }

    /**
     * List Savings Charges
     * <p>
     * Lists Savings Charges  Example Requests:  savingsaccounts/1/charges  savingsaccounts/1/charges?chargeStatus&#x3D;all  savingsaccounts/1/charges?chargeStatus&#x3D;inactive  savingsaccounts/1/charges?chargeStatus&#x3D;active  savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveAllSavingsAccountChargesTest() {
        Long savingsAccountId = null;
        String chargeStatus = null;
        // List<GetSavingsAccountsSavingsAccountIdChargesResponse> response = api.retrieveAllSavingsAccountCharges(savingsAccountId, chargeStatus);

        // TODO: test validations
    }

    /**
     * Retrieve a Savings account Charge
     * <p>
     * Retrieves a Savings account Charge  Example Requests:  /savingsaccounts/1/charges/5   /savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveSavingsAccountChargeTest() {
        Long savingsAccountId = null;
        Long savingsAccountChargeId = null;
        // GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse response = api.retrieveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId);

        // TODO: test validations
    }

    /**
     * Retrieve Savings Charges Template
     * <p>
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  savingsaccounts/1/charges/template
     */
    @Test
    public void retrieveTemplateTest() {
        Long savingsAccountId = null;
        // GetSavingsAccountsSavingsAccountIdChargesTemplateResponse response = api.retrieveTemplate(savingsAccountId);

        // TODO: test validations
    }

    /**
     * Update a Savings account Charge
     * <p>
     * Currently Savings account Charges may be updated only if the Savings account is not yet approved.
     */
    @Test
    public void updateSavingsAccountChargeTest() {
        Long savingsAccountId = null;
        Long savingsAccountChargeId = null;
        PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest body = null;
        // PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse response = api.updateSavingsAccountCharge(savingsAccountId, savingsAccountChargeId, body);

        // TODO: test validations
    }
}

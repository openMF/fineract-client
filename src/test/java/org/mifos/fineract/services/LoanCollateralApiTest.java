package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostLoansLoanIdCollateralsRequest;
import org.mifos.fineract.models.PutLoansLoandIdCollateralsCollateralIdRequest;

/**
 * API tests for LoanCollateralApi
 */
public class LoanCollateralApiTest {

    private LoanCollateralApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(LoanCollateralApi.class);
    }

    /**
     * Create a Collateral
     *
     * Note: Currently, Collaterals may be added only before a Loan is approved
     */
    @Test
    public void createCollateralTest() {
        Long loanId = null;
        PostLoansLoanIdCollateralsRequest body = null;
        // PostLoansLoanIdCollateralsResponse response = api.createCollateral(loanId, body);

        // TODO: test validations
    }
    /**
     * Remove a Collateral
     *
     * Note: A collateral can only be removed from Loans that are not yet approved.
     */
    @Test
    public void deleteCollateralTest() {
        Long loanId = null;
        Long collateralId = null;
        // DeleteLoansLoanIdCollateralsCollateralIdResponse response = api.deleteCollateral(loanId, collateralId);

        // TODO: test validations
    }
    /**
     * Retrieve Collateral Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loans/1/collaterals/template
     */
    @Test
    public void newCollateralTemplateTest() {
        // GetLoansLoanIdCollateralsTemplateResponse response = api.newCollateralTemplate();

        // TODO: test validations
    }
    /**
     * List Loan Collaterals
     *
     * Example Requests:  loans/1/collaterals   loans/1/collaterals?fields&#x3D;value,description
     */
    @Test
    public void retrieveCollateralDetailsTest() {
        Long loanId = null;
        // List<GetLoansLoanIdCollateralsResponse> response = api.retrieveCollateralDetails(loanId);

        // TODO: test validations
    }
    /**
     * Retrieve a Collateral
     *
     * Example Requests:  /loans/1/collaterals/1   /loans/1/collaterals/1?fields&#x3D;value,description
     */
    @Test
    public void retrieveCollateralDetails_0Test() {
        Long loanId = null;
        Long collateralId = null;
        // GetLoansLoanIdCollateralsResponse response = api.retrieveCollateralDetails_0(loanId, collateralId);

        // TODO: test validations
    }

    /**
     * Update a Collateral
     */
    @Test
    public void updateCollateralTest() {
        Long loanId = null;
        Long collateralId = null;
        PutLoansLoandIdCollateralsCollateralIdRequest body = null;
        // PutLoansLoanIdCollateralsCollateralIdResponse response = api.updateCollateral(loanId, collateralId, body);

        // TODO: test validations
    }
}

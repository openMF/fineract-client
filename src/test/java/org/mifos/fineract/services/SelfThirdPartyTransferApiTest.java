package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostSelfBeneficiariesTPTRequest;
import org.mifos.fineract.models.PutSelfBeneficiariesTPTBeneficiaryIdRequest;

/**
 * API tests for SelfThirdPartyTransferApi
 */
public class SelfThirdPartyTransferApiTest {

    private SelfThirdPartyTransferApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(SelfThirdPartyTransferApi.class);
    }

    /**
     * Add TPT Beneficiary
     * <p>
     * Api to add third party beneficiary linked to current user.  Parameter Definitions  name : Nick name for beneficiary, should be unique for an self service user  officeName : Office Name of beneficiary(not id)  accountNumber : Account Number of beneficiary(not id)  transferLimit : Each transfer initiated to this account will not exceed this amount  Example Requests:  /self/beneficiaries/tpt  Mandatory Fields: name, officeName, accountNumber, accountType  Optional Fields: transferLimit
     */
    @Test
    public void addTest() {
        PostSelfBeneficiariesTPTRequest body = null;
        // PostSelfBeneficiariesTPTResponse response = api.add(body);

        // TODO: test validations
    }

    /**
     * Delete TPT Beneficiary
     * <p>
     * Api to delete third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}
     */
    @Test
    public void deleteTest() {
        Long beneficiaryId = null;
        // DeleteSelfBeneficiariesTPTBeneficiaryIdResponse response = api.delete(beneficiaryId);

        // TODO: test validations
    }

    /**
     * Get All TPT Beneficiary
     * <p>
     * Api to get all third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt
     */
    @Test
    public void retrieveAllTest() {
        // List<GetSelfBeneficiariesTPTResponse> response = api.retrieveAll();

        // TODO: test validations
    }

    /**
     * Beneficiary Third Party Transfer Template
     * <p>
     * Returns Account Type enumerations. Self User is expected to know office name and account number to be able to add beneficiary.  Example Requests:  /self/beneficiaries/tpt/template
     */
    @Test
    public void templateTest() {
        // GetSelfBeneficiariesTPTTemplateResponse response = api.template();

        // TODO: test validations
    }

    /**
     * Update TPT Beneficiary
     * <p>
     * Api to update third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}  Optional Fields: name, transferLimit
     */
    @Test
    public void updateTest() {
        Long beneficiaryId = null;
        PutSelfBeneficiariesTPTBeneficiaryIdRequest body = null;
        // PutSelfBeneficiariesTPTBeneficiaryIdResponse response = api.update(beneficiaryId, body);

        // TODO: test validations
    }
}

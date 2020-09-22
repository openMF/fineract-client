package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostStandingInstructionsRequest;
import org.mifos.fineract.models.PutStandingInstructionsStandingInstructionIdRequest;

/**
 * API tests for StandingInstructionsApi
 */
public class StandingInstructionsApiTest {

    private StandingInstructionsApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(StandingInstructionsApi.class);
    }

    /**
     * Create new Standing Instruction
     *
     * Ability to create new instruction for transfer of monetary funds from one account to another
     */
    @Test
    public void createTest() {
        PostStandingInstructionsRequest body = null;
        // PostStandingInstructionsResponse response = api.create(body);

        // TODO: test validations
    }
    /**
     * List Standing Instructions
     *
     * Example Requests:  standinginstructions
     */
    @Test
    public void retrieveAllTest() {
        String sqlSearch = null;
        String externalId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        Integer transferType = null;
        String clientName = null;
        Long clientId = null;
        Long fromAccountId = null;
        Integer fromAccountType = null;
        // GetStandingInstructionsResponse response = api.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType);

        // TODO: test validations
    }
    /**
     * Retrieve Standing Instruction
     *
     * Example Requests :  standinginstructions/1
     */
    @Test
    public void retrieveOneTest() {
        Long standingInstructionId = null;
        String sqlSearch = null;
        String externalId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // GetStandingInstructionsStandingInstructionIdResponse response = api.retrieveOne(standingInstructionId, sqlSearch, externalId, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }
    /**
     * Retrieve Standing Instruction Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1&amp;transferType&#x3D;1  standinginstructions/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1&amp;transferType&#x3D;1
     */
    @Test
    public void templateTest() {
        Long fromOfficeId = null;
        Long fromClientId = null;
        Long fromAccountId = null;
        Integer fromAccountType = null;
        Long toOfficeId = null;
        Long toClientId = null;
        Long toAccountId = null;
        Integer toAccountType = null;
        Integer transferType = null;
        // GetStandingInstructionsTemplateResponse response = api.template(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType, transferType);

        // TODO: test validations
    }
    /**
     * Update Standing Instruction | Delete Standing Instruction
     *
     * Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;update   Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;delete
     */
    @Test
    public void updateTest() {
        Long standingInstructionId = null;
        String command = null;
        PutStandingInstructionsStandingInstructionIdRequest body = null;
        // PutStandingInstructionsStandingInstructionIdResponse response = api.update(standingInstructionId, command, body);

        // TODO: test validations
    }
}

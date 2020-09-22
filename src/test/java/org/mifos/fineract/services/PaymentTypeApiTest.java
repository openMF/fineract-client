package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.FineractApiClient;
import org.mifos.fineract.models.PostPaymentTypesRequest;
import org.mifos.fineract.models.PutPaymentTypesPaymentTypeIdRequest;

/**
 * API tests for PaymentTypeApi
 */
public class PaymentTypeApiTest {

    private PaymentTypeApi api;

    @Before
    public void setup() {
        api = new FineractApiClient().createService(PaymentTypeApi.class);
    }

    /**
     * Create a Payment Type
     *
     * Creates a new Payment type  Mandatory Fields: name  Optional Fields: Description, isCashPayment,Position
     */
    @Test
    public void createPaymentTypeTest() {
        PostPaymentTypesRequest body = null;
        // PostPaymentTypesResponse response = api.createPaymentType(body);

        // TODO: test validations
    }
    /**
     * Delete a Payment Type
     *
     * Deletes payment type
     */
    @Test
    public void deleteCodeTest() {
        Long paymentTypeId = null;
        // DeletePaymentTypesPaymentTypeIdResponse response = api.deleteCode(paymentTypeId);

        // TODO: test validations
    }
    /**
     * Retrieve all Payment Types
     *
     * Retrieve list of payment types
     */
    @Test
    public void getAllPaymentTypesTest() {
        // List<GetPaymentTypesResponse> response = api.getAllPaymentTypes();

        // TODO: test validations
    }
    /**
     * Retrieve a Payment Type
     *
     * Retrieves a payment type
     */
    @Test
    public void retrieveOnePaymentTypeTest() {
        Long paymentTypeId = null;
        // GetPaymentTypesPaymentTypeIdResponse response = api.retrieveOnePaymentType(paymentTypeId);

        // TODO: test validations
    }
    /**
     * Update a Payment Type
     *
     * Updates a Payment Type
     */
    @Test
    public void updatePaymentTypeTest() {
        Long paymentTypeId = null;
        PutPaymentTypesPaymentTypeIdRequest body = null;
        // PutPaymentTypesPaymentTypeIdResponse response = api.updatePaymentType(paymentTypeId, body);

        // TODO: test validations
    }
}

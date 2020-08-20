package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface PaymentTypeApi {
    /**
     * Create a Payment Type
     * Creates a new Payment type  Mandatory Fields: name  Optional Fields: Description, isCashPayment,Position
     *
     * @param body body (required)
     * @return Call&lt;PostPaymentTypesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("paymenttypes")
    Call<PostPaymentTypesResponse> createPaymentType(
            @retrofit2.http.Body PostPaymentTypesRequest body
    );

    /**
     * Delete a Payment Type
     * Deletes payment type
     *
     * @param paymentTypeId paymentTypeId (required)
     * @return Call&lt;DeletePaymentTypesPaymentTypeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("paymenttypes/{paymentTypeId}")
    Call<DeletePaymentTypesPaymentTypeIdResponse> deleteCode(
            @retrofit2.http.Path("paymentTypeId") Long paymentTypeId
    );

    /**
     * Retrieve all Payment Types
     * Retrieve list of payment types
     *
     * @return Call&lt;List&lt;GetPaymentTypesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("paymenttypes")
    Call<List<GetPaymentTypesResponse>> getAllPaymentTypes();


    /**
     * Retrieve a Payment Type
     * Retrieves a payment type
     *
     * @param paymentTypeId paymentTypeId (required)
     * @return Call&lt;GetPaymentTypesPaymentTypeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("paymenttypes/{paymentTypeId}")
    Call<GetPaymentTypesPaymentTypeIdResponse> retrieveOnePaymentType(
            @retrofit2.http.Path("paymentTypeId") Long paymentTypeId
    );

    /**
     * Update a Payment Type
     * Updates a Payment Type
     *
     * @param paymentTypeId paymentTypeId (required)
     * @param body          body (required)
     * @return Call&lt;PutPaymentTypesPaymentTypeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("paymenttypes/{paymentTypeId}")
    Call<PutPaymentTypesPaymentTypeIdResponse> updatePaymentType(
            @retrofit2.http.Path("paymentTypeId") Long paymentTypeId, @retrofit2.http.Body PutPaymentTypesPaymentTypeIdRequest body
    );

}

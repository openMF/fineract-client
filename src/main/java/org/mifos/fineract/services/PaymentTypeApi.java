package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface PaymentTypeApi {
    /**
     * Create a Payment Type
     * Creates a new Payment type  Mandatory Fields: name  Optional Fields: Description, isCashPayment,Position
     *
     * @param body body (required)
     * @return Observable&lt;PostPaymentTypesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("paymenttypes")
    Observable<PostPaymentTypesResponse> createPaymentType(
            @retrofit2.http.Body PostPaymentTypesRequest body
    );

    /**
     * Delete a Payment Type
     * Deletes payment type
     *
     * @param paymentTypeId paymentTypeId (required)
     * @return Observable&lt;DeletePaymentTypesPaymentTypeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("paymenttypes/{paymentTypeId}")
    Observable<DeletePaymentTypesPaymentTypeIdResponse> deleteCode(
            @retrofit2.http.Path("paymentTypeId") Long paymentTypeId
    );

    /**
     * Retrieve all Payment Types
     * Retrieve list of payment types
     *
     * @return Observable&lt;List&lt;GetPaymentTypesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("paymenttypes")
    Observable<List<GetPaymentTypesResponse>> getAllPaymentTypes();


    /**
     * Retrieve a Payment Type
     * Retrieves a payment type
     *
     * @param paymentTypeId paymentTypeId (required)
     * @return Observable&lt;GetPaymentTypesPaymentTypeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("paymenttypes/{paymentTypeId}")
    Observable<GetPaymentTypesPaymentTypeIdResponse> retrieveOnePaymentType(
            @retrofit2.http.Path("paymentTypeId") Long paymentTypeId
    );

    /**
     * Update a Payment Type
     * Updates a Payment Type
     *
     * @param paymentTypeId paymentTypeId (required)
     * @param body          body (required)
     * @return Observable&lt;PutPaymentTypesPaymentTypeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("paymenttypes/{paymentTypeId}")
    Observable<PutPaymentTypesPaymentTypeIdResponse> updatePaymentType(
            @retrofit2.http.Path("paymentTypeId") Long paymentTypeId, @retrofit2.http.Body PutPaymentTypesPaymentTypeIdRequest body
    );

}

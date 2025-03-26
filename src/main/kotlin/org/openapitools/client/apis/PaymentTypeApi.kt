package org.openapitools.client.apis

import org.openapitools.client.models.DeletePaymentTypesPaymentTypeIdResponse
import org.openapitools.client.models.GetPaymentTypesPaymentTypeIdResponse
import org.openapitools.client.models.GetPaymentTypesResponse
import org.openapitools.client.models.PostPaymentTypesRequest
import org.openapitools.client.models.PostPaymentTypesResponse
import org.openapitools.client.models.PutPaymentTypesPaymentTypeIdRequest
import org.openapitools.client.models.PutPaymentTypesPaymentTypeIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface PaymentTypeApi {
    /**
     * Create a Payment Type
     * Creates a new Payment type  Mandatory Fields: name  Optional Fields: Description, isCashPayment,Position
     * Responses:
     *  - 200: OK
     *
     * @param postPaymentTypesRequest
     * @return [PostPaymentTypesResponse]
     */
    @POST("v1/paymenttypes")
    suspend fun createPaymentType(@Body postPaymentTypesRequest: PostPaymentTypesRequest): PostPaymentTypesResponse

    /**
     * Delete a Payment Type
     * Deletes payment type
     * Responses:
     *  - 200: OK
     *
     * @param paymentTypeId paymentTypeId
     * @return [DeletePaymentTypesPaymentTypeIdResponse]
     */
    @DELETE("v1/paymenttypes/{paymentTypeId}")
    suspend fun deleteCode1(@Path("paymentTypeId") paymentTypeId: Long): DeletePaymentTypesPaymentTypeIdResponse

    /**
     * Retrieve all Payment Types
     * Retrieve list of payment types
     * Responses:
     *  - 200: OK
     *
     * @param onlyWithCode onlyWithCode (optional)
     * @return [kotlin.collections.List<GetPaymentTypesResponse]
     */
    @GET("v1/paymenttypes")
    suspend fun getAllPaymentTypes(@Query("onlyWithCode") onlyWithCode: Boolean? = null): List<GetPaymentTypesResponse>

    /**
     * Retrieve a Payment Type
     * Retrieves a payment type
     * Responses:
     *  - 200: OK
     *
     * @param paymentTypeId paymentTypeId
     * @return [GetPaymentTypesPaymentTypeIdResponse]
     */
    @GET("v1/paymenttypes/{paymentTypeId}")
    suspend fun retrieveOnePaymentType(@Path("paymentTypeId") paymentTypeId: Long): GetPaymentTypesPaymentTypeIdResponse

    /**
     * Update a Payment Type
     * Updates a Payment Type
     * Responses:
     *  - 200: OK
     *
     * @param paymentTypeId paymentTypeId
     * @param putPaymentTypesPaymentTypeIdRequest
     * @return [PutPaymentTypesPaymentTypeIdResponse]
     */
    @PUT("v1/paymenttypes/{paymentTypeId}")
    suspend fun updatePaymentType(
        @Path("paymentTypeId") paymentTypeId: Long,
        @Body putPaymentTypesPaymentTypeIdRequest: PutPaymentTypesPaymentTypeIdRequest
    ): PutPaymentTypesPaymentTypeIdResponse

}

package org.openapitools.client.apis

import org.openapitools.client.models.DeleteChargesChargeIdResponse
import org.openapitools.client.models.GetChargesResponse
import org.openapitools.client.models.GetChargesTemplateResponse
import org.openapitools.client.models.PostChargesRequest
import org.openapitools.client.models.PostChargesResponse
import org.openapitools.client.models.PutChargesChargeIdRequest
import org.openapitools.client.models.PutChargesChargeIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ChargesApi {
    /**
     * Create/Define a Charge
     * Define a new charge that can later be associated with loans and savings through their respective product definitions or directly on each account instance.
     * Responses:
     *  - 200: OK
     *
     * @param postChargesRequest
     * @return [PostChargesResponse]
     */
    @POST("v1/charges")
    suspend fun createCharge(@Body postChargesRequest: PostChargesRequest): PostChargesResponse

    /**
     * Delete a Charge
     * Deletes a Charge.
     * Responses:
     *  - 200: OK
     *
     * @param chargeId chargeId
     * @return [DeleteChargesChargeIdResponse]
     */
    @DELETE("v1/charges/{chargeId}")
    suspend fun deleteCharge(@Path("chargeId") chargeId: Long): DeleteChargesChargeIdResponse

    /**
     * Retrieve Charges
     * Returns the list of defined charges.  Example Requests:  charges
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetChargesResponse>]
     */
    @GET("v1/charges")
    suspend fun retrieveAllCharges(): List<GetChargesResponse>

    /**
     * Retrieve a Charge
     * Returns the details of a defined Charge.  Example Requests:  charges/1
     * Responses:
     *  - 200: OK
     *
     * @param chargeId chargeId
     * @return [GetChargesResponse]
     */
    @GET("v1/charges/{chargeId}")
    suspend fun retrieveCharge(@Path("chargeId") chargeId: Long): GetChargesResponse

    /**
     * Retrieve Charge Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  charges/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetChargesTemplateResponse]
     */
    @GET("v1/charges/template")
    suspend fun retrieveNewChargeDetails(): GetChargesTemplateResponse

    /**
     * Update a Charge
     * Updates the details of a Charge.
     * Responses:
     *  - 200: OK
     *
     * @param chargeId chargeId
     * @param putChargesChargeIdRequest
     * @return [PutChargesChargeIdResponse]
     */
    @PUT("v1/charges/{chargeId}")
    suspend fun updateCharge(
        @Path("chargeId") chargeId: Long,
        @Body putChargesChargeIdRequest: PutChargesChargeIdRequest
    ): PutChargesChargeIdResponse

}

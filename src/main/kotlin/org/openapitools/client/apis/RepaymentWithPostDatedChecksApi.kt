package org.openapitools.client.apis

import org.openapitools.client.models.DeletePostDatedCheck
import org.openapitools.client.models.GetPostDatedChecks
import org.openapitools.client.models.UpdatePostDatedCheckRequest
import org.openapitools.client.models.UpdatePostDatedCheckResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface RepaymentWithPostDatedChecksApi {
    /**
     * Delete Post Dated Check
     * Delete Post Dated Check
     * Responses:
     *  - 200: OK
     *
     * @param postDatedCheckId postDatedCheckId
     * @param loanId loanId
     * @return [kotlin.collections.List<DeletePostDatedCheck]
     */
    @DELETE("v1/loans/{loanId}/postdatedchecks/{postDatedCheckId}")
    suspend fun deletePostDatedCheck(
        @Path("postDatedCheckId") postDatedCheckId: Long,
        @Path("loanId") loanId: Long
    ): List<DeletePostDatedCheck>

    /**
     * Get Post Dated Check
     * Get Post Dated Check
     * Responses:
     *  - 200: OK
     *
     * @param installmentId installmentId
     * @param loanId loanId
     * @return [kotlin.collections.List<GetPostDatedChecks]
     */
    @GET("v1/loans/{loanId}/postdatedchecks/{installmentId}")
    suspend fun getPostDatedCheck(
        @Path("installmentId") installmentId: Int,
        @Path("loanId") loanId: Long
    ): List<GetPostDatedChecks>

    /**
     * Get All Post Dated Checks
     * Get All Post dated Checks
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [kotlin.collections.List<GetPostDatedChecks]
     */
    @GET("v1/loans/{loanId}/postdatedchecks")
    suspend fun getPostDatedChecks(@Path("loanId") loanId: Long): List<GetPostDatedChecks>

    /**
     * Update Post Dated Check, Bounced Check
     * Update Post Dated Check, Bounced Check
     * Responses:
     *  - 200: OK
     *
     * @param postDatedCheckId postDatedCheckId
     * @param loanId loanId
     * @param updatePostDatedCheckRequest
     * @param editType editType (optional)
     * @return [kotlin.collections.List<UpdatePostDatedCheckResponse]
     */
    @PUT("v1/loans/{loanId}/postdatedchecks/{postDatedCheckId}")
    suspend fun updatePostDatedChecks(
        @Path("postDatedCheckId") postDatedCheckId: Long,
        @Path("loanId") loanId: Long,
        @Body updatePostDatedCheckRequest: UpdatePostDatedCheckRequest,
        @Query("editType") editType: String? = null
    ): List<UpdatePostDatedCheckResponse>

}

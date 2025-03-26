package org.openapitools.client.apis

import okhttp3.MultipartBody
import org.openapitools.client.models.DeleteUsersUserIdResponse
import org.openapitools.client.models.GetUsersResponse
import org.openapitools.client.models.GetUsersTemplateResponse
import org.openapitools.client.models.GetUsersUserIdResponse
import org.openapitools.client.models.PostUsersRequest
import org.openapitools.client.models.PostUsersResponse
import org.openapitools.client.models.PutUsersUserIdRequest
import org.openapitools.client.models.PutUsersUserIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface UsersApi {
    /**
     * Create a User
     * Adds new application user.  Note: Password information is not required (or processed). Password details at present are auto-generated and then sent to the email account given (which is why it can take a few seconds to complete).  Mandatory Fields:  username, firstname, lastname, email, officeId, roles, sendPasswordToEmail  Optional Fields:  staffId,passwordNeverExpires,isSelfServiceUser,clients
     * Responses:
     *  - 200: OK
     *
     * @param postUsersRequest
     * @return [PostUsersResponse]
     */
    @POST("v1/users")
    suspend fun create15(@Body postUsersRequest: PostUsersRequest): PostUsersResponse

    /**
     * Delete a User
     * Removes the user and the associated roles and permissions.
     * Responses:
     *  - 200: OK
     *
     * @param userId userId
     * @return [DeleteUsersUserIdResponse]
     */
    @DELETE("v1/users/{userId}")
    suspend fun delete23(@Path("userId") userId: Long): DeleteUsersUserIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param staffId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/users/downloadtemplate")
    suspend fun getUserTemplate(
        @Query("officeId") officeId: Long? = null,
        @Query("staffId") staffId: Long? = null,
        @Query("dateFormat") dateFormat: String? = null
    ): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/users/uploadtemplate")
    suspend fun postUsersTemplate(
        @Part("dateFormat") dateFormat: String? = null,
        @Part("locale") locale: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
    ): String

    /**
     * Retrieve list of users
     * Example Requests:  users   users?fields&#x3D;id,username,email,officeName
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetUsersResponse]
     */
    @GET("v1/users")
    suspend fun retrieveAll41(): List<GetUsersResponse>

    /**
     * Retrieve a User
     * Example Requests:  users/1   users/1?template&#x3D;true   users/1?fields&#x3D;username,officeName
     * Responses:
     *  - 200: OK
     *
     * @param userId userId
     * @return [GetUsersUserIdResponse]
     */
    @GET("v1/users/{userId}")
    suspend fun retrieveOne31(@Path("userId") userId: Long): GetUsersUserIdResponse

    /**
     * Retrieve User Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  users/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetUsersTemplateResponse]
     */
    @GET("v1/users/template")
    suspend fun template22(): GetUsersTemplateResponse

    /**
     * Update a User
     * When updating a password you must provide the repeatPassword parameter also.
     * Responses:
     *  - 200: OK
     *
     * @param userId userId
     * @param putUsersUserIdRequest
     * @return [PutUsersUserIdResponse]
     */
    @PUT("v1/users/{userId}")
    suspend fun update26(
        @Path("userId") userId: Long,
        @Body putUsersUserIdRequest: PutUsersUserIdRequest
    ): PutUsersUserIdResponse

}

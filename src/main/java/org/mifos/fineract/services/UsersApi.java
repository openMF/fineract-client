package org.mifos.fineract.services;

import okhttp3.MultipartBody;
import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface UsersApi {
    /**
     * Create a User
     * Adds new application user.  Note: Password information is not required (or processed). Password details at present are auto-generated and then sent to the email account given (which is why it can take a few seconds to complete).  Mandatory Fields:  username, firstname, lastname, email, officeId, roles, sendPasswordToEmail  Optional Fields:  staffId,passwordNeverExpires,isSelfServiceUser,clients
     *
     * @param body body (required)
     * @return Call&lt;PostUsersResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("users")
    Call<PostUsersResponse> create(
            @retrofit2.http.Body PostUsersRequest body
    );

    /**
     * Delete a User
     * Removes the user and the associated roles and permissions.
     *
     * @param userId userId (required)
     * @return Call&lt;DeleteUsersUserIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("users/{userId}")
    Call<DeleteUsersUserIdResponse> delete(
            @retrofit2.http.Path("userId") Long userId
    );

    /**
     * @param officeId   (optional)
     * @param staffId    (optional)
     * @param dateFormat (optional)
     * @return Call&lt;Void&gt;
     */
    @GET("users/downloadtemplate")
    Call<Void> getUserTemplate(
            @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("dateFormat") String dateFormat
    );

    /**
     * @param file       (optional)
     * @param locale     (optional)
     * @param dateFormat (optional)
     * @return Call&lt;String&gt;
     */
    @retrofit2.http.Multipart
    @POST("users/uploadtemplate")
    Call<String> postUsersTemplate(
            @retrofit2.http.Part MultipartBody.Part file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
    );

    /**
     * Retrieve list of users
     * Example Requests:  users   users?fields&#x3D;id,username,email,officeName
     *
     * @return Call&lt;List&lt;GetUsersResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("users")
    Call<List<GetUsersResponse>> retrieveAll();


    /**
     * Retrieve a User
     * Example Requests:  users/1   users/1?template&#x3D;true   users/1?fields&#x3D;username,officeName
     *
     * @param userId userId (required)
     * @return Call&lt;GetUsersUserIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("users/{userId}")
    Call<GetUsersUserIdResponse> retrieveOne(
            @retrofit2.http.Path("userId") Long userId
    );

    /**
     * Retrieve User Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  users/template
     *
     * @return Call&lt;GetUsersTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("users/template")
    Call<GetUsersTemplateResponse> template();


    /**
     * Update a User
     * When updating a password you must provide the repeatPassword parameter also.
     *
     * @param userId userId (required)
     * @param body   body (required)
     * @return Call&lt;PutUsersUserIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("users/{userId}")
    Call<PutUsersUserIdResponse> update(
            @retrofit2.http.Path("userId") Long userId, @retrofit2.http.Body PutUsersUserIdRequest body
    );

}

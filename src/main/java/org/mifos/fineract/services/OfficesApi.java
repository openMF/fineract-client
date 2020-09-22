package org.mifos.fineract.services;

import okhttp3.MultipartBody;
import org.mifos.fineract.models.*;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

import java.util.List;

public interface OfficesApi {
    /**
     * Create an Office
     * Mandatory Fields name, openingDate, parentId
     *
     * @param body body (required)
     * @return Observable&lt;PostOfficesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("offices")
    Observable<PostOfficesResponse> createOffice(
            @retrofit2.http.Body PostOfficesRequest body
    );

    /**
     * @param dateFormat (optional)
     * @return Observable&lt;Void&gt;
     */
    @GET("offices/downloadtemplate")
    Observable<Void> getOfficeTemplate(
            @retrofit2.http.Query("dateFormat") String dateFormat
    );

    /**
     * @param file       (optional)
     * @param locale     (optional)
     * @param dateFormat (optional)
     * @return Observable&lt;String&gt;
     */
    @retrofit2.http.Multipart
    @POST("offices/uploadtemplate")
    Observable<String> postOfficeTemplate(
            @retrofit2.http.Part MultipartBody.Part file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
    );

    /**
     * Retrieve an Office
     * Example Requests:  offices/1   offices/1?template&#x3D;true   offices/1?fields&#x3D;id,name,parentName
     *
     * @param officeId officeId (required)
     * @return Observable&lt;GetOfficesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("offices/{officeId}")
    Observable<GetOfficesResponse> retreiveOffice(
            @retrofit2.http.Path("officeId") Long officeId
    );

    /**
     * Retrieve Office Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  offices/template
     *
     * @return Observable&lt;GetOfficesTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("offices/template")
    Observable<GetOfficesTemplateResponse> retrieveOfficeTemplate();


    /**
     * List Offices
     * Example Requests:  offices   offices?fields&#x3D;id,name,openingDate
     *
     * @param includeAllOffices includeAllOffices (optional, default to false)
     * @param orderBy           orderBy (optional)
     * @param sortOrder         sortOrder (optional)
     * @return Observable&lt;List&lt;GetOfficesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("offices")
    Observable<List<GetOfficesResponse>> retrieveOffices(
            @retrofit2.http.Query("includeAllOffices") Boolean includeAllOffices, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
    );

    /**
     * Update Office
     *
     * @param officeId officeId (required)
     * @param body     body (required)
     * @return Observable&lt;PutOfficesOfficeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("offices/{officeId}")
    Observable<PutOfficesOfficeIdResponse> updateOffice(
            @retrofit2.http.Path("officeId") Long officeId, @retrofit2.http.Body PutOfficesOfficeIdRequest body
    );

}

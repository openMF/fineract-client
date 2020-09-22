package org.mifos.fineract.services;

import okhttp3.MultipartBody;
import retrofit2.http.*;
import rx.Observable;

public interface DomainNameapiv1entityentityIdimagesApi {
    /**
     * @param entity        (required)
     * @param entityId      (required)
     * @param contentLength (optional)
     * @param file          (optional)
     * @return Observable&lt;String&gt;
     */
    @retrofit2.http.Multipart
    @POST("{entity}/{entityId}/images")
    Observable<String> addNewClientImage(
            @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part MultipartBody.Part file
    );

    /**
     * @param entity   (required)
     * @param entityId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("{entity}/{entityId}/images")
    Observable<String> deleteClientImage(
            @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId
    );

    /**
     * @param entity    (required)
     * @param entityId  (required)
     * @param maxWidth  (optional)
     * @param maxHeight (optional)
     * @param output    (optional)
     * @return Observable&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("{entity}/{entityId}/images")
    Observable<Void> retrieveImage(
            @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Query("maxWidth") Integer maxWidth, @retrofit2.http.Query("maxHeight") Integer maxHeight, @retrofit2.http.Query("output") String output
    );

    /**
     * @param entity        (required)
     * @param entityId      (required)
     * @param contentLength (optional)
     * @param file          (optional)
     * @return Observable&lt;String&gt;
     */
    @retrofit2.http.Multipart
    @PUT("{entity}/{entityId}/images")
    Observable<String> updateClientImage(
            @retrofit2.http.Path("entity") String entity, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part MultipartBody.Part file
    );

}

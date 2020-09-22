package org.mifos.fineract.services;

import retrofit2.http.*;
import rx.Observable;

public interface DomainNameapiv1entitytoentitymappingApi {
    /**
     * @param relId (required)
     * @param body  (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("entitytoentitymapping/{relId}")
    Observable<String> createMap(
            @retrofit2.http.Path("relId") Long relId, @retrofit2.http.Body String body
    );

    /**
     * @param mapId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("entitytoentitymapping/{mapId}")
    Observable<String> delete(
            @retrofit2.http.Path("mapId") Long mapId
    );

    /**
     * @param mapId  (required)
     * @param fromId (required)
     * @param toId   (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("entitytoentitymapping/{mapId}/{fromId}/{toId}")
    Observable<String> getEntityToEntityMappings(
            @retrofit2.http.Path("mapId") Long mapId, @retrofit2.http.Path("fromId") Long fromId, @retrofit2.http.Path("toId") Long toId
    );

    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("entitytoentitymapping")
    Observable<String> retrieveAll();


    /**
     * @param mapId (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("entitytoentitymapping/{mapId}")
    Observable<String> retrieveOne(
            @retrofit2.http.Path("mapId") Long mapId
    );

    /**
     * @param mapId (required)
     * @param body  (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("entitytoentitymapping/{mapId}")
    Observable<String> updateMap(
            @retrofit2.http.Path("mapId") Long mapId, @retrofit2.http.Body String body
    );

}

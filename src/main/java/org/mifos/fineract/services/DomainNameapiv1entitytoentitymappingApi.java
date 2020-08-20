package org.mifos.fineract.services;

import retrofit2.Call;
import retrofit2.http.*;

public interface DomainNameapiv1entitytoentitymappingApi {
    /**
     * @param relId (required)
     * @param body  (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("entitytoentitymapping/{relId}")
    Call<String> createMap(
            @retrofit2.http.Path("relId") Long relId, @retrofit2.http.Body String body
    );

    /**
     * @param mapId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("entitytoentitymapping/{mapId}")
    Call<String> delete(
            @retrofit2.http.Path("mapId") Long mapId
    );

    /**
     * @param mapId  (required)
     * @param fromId (required)
     * @param toId   (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("entitytoentitymapping/{mapId}/{fromId}/{toId}")
    Call<String> getEntityToEntityMappings(
            @retrofit2.http.Path("mapId") Long mapId, @retrofit2.http.Path("fromId") Long fromId, @retrofit2.http.Path("toId") Long toId
    );

    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("entitytoentitymapping")
    Call<String> retrieveAll();


    /**
     * @param mapId (required)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("entitytoentitymapping/{mapId}")
    Call<String> retrieveOne(
            @retrofit2.http.Path("mapId") Long mapId
    );

    /**
     * @param mapId (required)
     * @param body  (optional)
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("entitytoentitymapping/{mapId}")
    Call<String> updateMap(
            @retrofit2.http.Path("mapId") Long mapId, @retrofit2.http.Body String body
    );

}

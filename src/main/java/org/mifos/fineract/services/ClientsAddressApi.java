package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

import java.util.List;

public interface ClientsAddressApi {
    /**
     * Create an address for a Client
     * Mandatory Fields :  type and clientId
     *
     * @param clientid clientId (required)
     * @param body     body (required)
     * @param type     type (optional)
     * @return Call&lt;PostClientClientIdAddressesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("client/{clientid}/addresses")
    Call<PostClientClientIdAddressesResponse> addClientAddress(
            @retrofit2.http.Path("clientid") Long clientid, @retrofit2.http.Body PostClientClientIdAddressesRequest body, @retrofit2.http.Query("type") Long type
    );

    /**
     * List all addresses for a Client
     * Example Requests:  client/1/addresses   clients/1/addresses?status&#x3D;false,true&amp;&amp;type&#x3D;1,2,3
     *
     * @param clientid clientId (required)
     * @param status   status (optional)
     * @param type     type (optional)
     * @return Call&lt;List&lt;GetClientClientIdAddressesResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("client/{clientid}/addresses")
    Call<List<GetClientClientIdAddressesResponse>> getAddresses(
            @retrofit2.http.Path("clientid") Long clientid, @retrofit2.http.Query("status") String status, @retrofit2.http.Query("type") Long type
    );

    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("client/addresses/template")
    Call<String> getAddressesTemplate();


    /**
     * Update an address for a Client
     * All the address fields can be updated by using update client address API  Mandatory Fields type and addressId
     *
     * @param clientid clientId (required)
     * @param body     body (required)
     * @return Call&lt;PutClientClientIdAddressesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("client/{clientid}/addresses")
    Call<PutClientClientIdAddressesResponse> updateClientAddress(
            @retrofit2.http.Path("clientid") Long clientid, @retrofit2.http.Body PutClientClientIdAddressesRequest body
    );

}

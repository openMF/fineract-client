package org.mifos.fineract.services;

import org.mifos.fineract.models.ExternalServicesPropertiesData;
import org.mifos.fineract.models.PutExternalServiceRequest;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import rx.Observable;

public interface ExternalServicesApi {
    /**
     * Retrieve External Services Configuration
     * Returns a external Service configurations based on the Service Name.  Service Names supported are S3 and SMTP.  Example Requests:  externalservice/SMTP
     *
     * @param servicename servicename (required)
     * @return Observable&lt;ExternalServicesPropertiesData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("externalservice/{servicename}")
    Observable<ExternalServicesPropertiesData> retrieveOne(
            @retrofit2.http.Path("servicename") String servicename
    );

    /**
     * Update External Service
     * Updates the external Service Configuration for a Service Name.  Example:   externalservice/S3
     *
     * @param servicename servicename (required)
     * @param body        body (required)
     * @return Observable&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("externalservice/{servicename}")
    Observable<Void> updateExternalServiceProperties(
            @retrofit2.http.Path("servicename") String servicename, @retrofit2.http.Body PutExternalServiceRequest body
    );

}

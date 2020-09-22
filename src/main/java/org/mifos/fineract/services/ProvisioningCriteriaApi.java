package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface ProvisioningCriteriaApi {
    /**
     * Create a new Provisioning Criteria
     * Creates a new Provisioning Criteria  Mandatory Fields:  criteriaName provisioningcriteria  Optional Fields:  loanProducts
     *
     * @param body body (required)
     * @return Observable&lt;PostProvisioningCriteriaResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("provisioningcriteria")
    Observable<PostProvisioningCriteriaResponse> createProvisioningCriteria(
            @retrofit2.http.Body PostProvisioningCriteriaRequest body
    );

    /**
     * Deletes Provisioning Criteria
     * Deletes Provisioning Criteria
     *
     * @param criteriaId criteriaId (required)
     * @return Observable&lt;DeleteProvisioningCriteriaResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("provisioningcriteria/{criteriaId}")
    Observable<DeleteProvisioningCriteriaResponse> deleteProvisioningCriteria(
            @retrofit2.http.Path("criteriaId") Long criteriaId
    );

    /**
     * Retrieves all created Provisioning Criterias
     * Retrieves all created Provisioning Criterias
     *
     * @return Observable&lt;List&lt;GetProvisioningCriteriaResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("provisioningcriteria")
    Observable<List<GetProvisioningCriteriaResponse>> retrieveAllProvisioningCriterias();


    /**
     * Retrieves a Provisioning Criteria
     * Retrieves a Provisioning Criteria
     *
     * @param criteriaId criteriaId (required)
     * @return Observable&lt;GetProvisioningCriteriaCriteriaIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("provisioningcriteria/{criteriaId}")
    Observable<GetProvisioningCriteriaCriteriaIdResponse> retrieveProvisioningCriteria(
            @retrofit2.http.Path("criteriaId") Long criteriaId
    );

    /**
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("provisioningcriteria/template")
    Observable<String> retrieveTemplate();


    /**
     * Updates a new Provisioning Criteria
     * Updates a new Provisioning Criteria  Optional Fields criteriaName, loanProducts, provisioningcriteria
     *
     * @param criteriaId criteriaId (required)
     * @param body       body (required)
     * @return Observable&lt;PutProvisioningCriteriaResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("provisioningcriteria/{criteriaId}")
    Observable<PutProvisioningCriteriaResponse> updateProvisioningCriteria(
            @retrofit2.http.Path("criteriaId") Long criteriaId, @retrofit2.http.Body PutProvisioningCriteriaRequest body
    );

}

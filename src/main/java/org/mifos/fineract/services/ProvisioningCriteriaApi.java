package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ProvisioningCriteriaApi {
    /**
     * Create a new Provisioning Criteria
     * Creates a new Provisioning Criteria  Mandatory Fields:  criteriaName provisioningcriteria  Optional Fields:  loanProducts
     *
     * @param body body (required)
     * @return Call&lt;PostProvisioningCriteriaResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("provisioningcriteria")
    Call<PostProvisioningCriteriaResponse> createProvisioningCriteria(
            @retrofit2.http.Body PostProvisioningCriteriaRequest body
    );

    /**
     * Deletes Provisioning Criteria
     * Deletes Provisioning Criteria
     *
     * @param criteriaId criteriaId (required)
     * @return Call&lt;DeleteProvisioningCriteriaResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("provisioningcriteria/{criteriaId}")
    Call<DeleteProvisioningCriteriaResponse> deleteProvisioningCriteria(
            @retrofit2.http.Path("criteriaId") Long criteriaId
    );

    /**
     * Retrieves all created Provisioning Criterias
     * Retrieves all created Provisioning Criterias
     *
     * @return Call&lt;List&lt;GetProvisioningCriteriaResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("provisioningcriteria")
    Call<List<GetProvisioningCriteriaResponse>> retrieveAllProvisioningCriterias();


    /**
     * Retrieves a Provisioning Criteria
     * Retrieves a Provisioning Criteria
     *
     * @param criteriaId criteriaId (required)
     * @return Call&lt;GetProvisioningCriteriaCriteriaIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("provisioningcriteria/{criteriaId}")
    Call<GetProvisioningCriteriaCriteriaIdResponse> retrieveProvisioningCriteria(
            @retrofit2.http.Path("criteriaId") Long criteriaId
    );

    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("provisioningcriteria/template")
    Call<String> retrieveTemplate();


    /**
     * Updates a new Provisioning Criteria
     * Updates a new Provisioning Criteria  Optional Fields criteriaName, loanProducts, provisioningcriteria
     *
     * @param criteriaId criteriaId (required)
     * @param body       body (required)
     * @return Call&lt;PutProvisioningCriteriaResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("provisioningcriteria/{criteriaId}")
    Call<PutProvisioningCriteriaResponse> updateProvisioningCriteria(
            @retrofit2.http.Path("criteriaId") Long criteriaId, @retrofit2.http.Body PutProvisioningCriteriaRequest body
    );

}

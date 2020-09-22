package org.mifos.fineract.services;

import org.mifos.fineract.models.GetSearchResponse;
import org.mifos.fineract.models.PostAdhocQuerySearchRequest;
import org.mifos.fineract.models.PostAdhocQuerySearchResponse;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface SearchApi {
    /**
     * Adhoc query search
     * AdHocQuery search has more search options, it is a POST request, it uses request body to send search parameters   Mandatory fields:entities  Optional fields:loanStatus, loanProducts, offices, loanDateOption, loanFromDate, loanToDate,  includeOutStandingAmountPercentage, outStandingAmountPercentageCondition,  minOutStandingAmountPercentage and maxOutStandingAmountPercentage OR outStandingAmountPercentage,  includeOutstandingAmount, outstandingAmountCondition,  minOutstandingAmount and maxOutstandingAmount OR outstandingAmount
     *
     * @param body2 body (required)
     * @param body  (optional)
     * @return Observable&lt;PostAdhocQuerySearchResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("search/advance")
    Observable<PostAdhocQuerySearchResponse> advancedSearch(
            @retrofit2.http.Body PostAdhocQuerySearchRequest body2, @retrofit2.http.Body String body
    );

    /**
     * Retrive Adhoc Search query template
     * Mandatory Fields  search?query&#x3D;000000001
     *
     * @return Observable&lt;GetSearchResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("search/template")
    Observable<GetSearchResponse> retrieveAdHocSearchQueryTemplate();


    /**
     * Search Resources
     * Example Requests:  search?query&#x3D;000000001   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups&amp;exactMatch&#x3D;true
     *
     * @param query      query (optional)
     * @param resource   resource (optional)
     * @param exactMatch exactMatch (optional, default to false)
     * @return Observable&lt;GetSearchResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("search")
    Observable<GetSearchResponse> searchData(
            @retrofit2.http.Query("query") String query, @retrofit2.http.Query("resource") String resource, @retrofit2.http.Query("exactMatch") Boolean exactMatch
    );

}

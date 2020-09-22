package org.mifos.fineract.services;

import org.mifos.fineract.models.LookupTableData;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

import java.util.List;

public interface SpmApiLookUpTableApi {
    /**
     * Create a Lookup Table entry
     * Add a new entry to a survey.  Mandatory Fields key, score, validFrom, validTo
     *
     * @param surveyId Enter surveyId (required)
     * @param body     (optional)
     * @return Observable&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("surveys/{surveyId}/lookuptables")
    Observable<Void> createLookupTable(
            @retrofit2.http.Path("surveyId") Long surveyId, @retrofit2.http.Body LookupTableData body
    );

    /**
     * List all Lookup Table entries
     * List all Lookup Table entries for a survey.
     *
     * @param surveyId Enter surveyId (required)
     * @return Observable&lt;List&lt;LookupTableData&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("surveys/{surveyId}/lookuptables")
    Observable<List<LookupTableData>> fetchLookupTables(
            @retrofit2.http.Path("surveyId") Long surveyId
    );

    /**
     * Retrieve a Lookup Table entry
     * Retrieve a Lookup Table entry for a survey.
     *
     * @param surveyId Enter surveyId (required)
     * @param key      Enter key (required)
     * @return Observable&lt;LookupTableData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("surveys/{surveyId}/lookuptables/{key}")
    Observable<LookupTableData> findLookupTable(
            @retrofit2.http.Path("surveyId") Long surveyId, @retrofit2.http.Path("key") String key
    );

}

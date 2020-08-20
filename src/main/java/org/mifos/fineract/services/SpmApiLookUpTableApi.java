package org.mifos.fineract.services;

import org.mifos.fineract.models.LookupTableData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import java.util.List;

public interface SpmApiLookUpTableApi {
    /**
     * Create a Lookup Table entry
     * Add a new entry to a survey.  Mandatory Fields key, score, validFrom, validTo
     *
     * @param surveyId Enter surveyId (required)
     * @param body     (optional)
     * @return Call&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("surveys/{surveyId}/lookuptables")
    Call<Void> createLookupTable(
            @retrofit2.http.Path("surveyId") Long surveyId, @retrofit2.http.Body LookupTableData body
    );

    /**
     * List all Lookup Table entries
     * List all Lookup Table entries for a survey.
     *
     * @param surveyId Enter surveyId (required)
     * @return Call&lt;List&lt;LookupTableData&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("surveys/{surveyId}/lookuptables")
    Call<List<LookupTableData>> fetchLookupTables(
            @retrofit2.http.Path("surveyId") Long surveyId
    );

    /**
     * Retrieve a Lookup Table entry
     * Retrieve a Lookup Table entry for a survey.
     *
     * @param surveyId Enter surveyId (required)
     * @param key      Enter key (required)
     * @return Call&lt;LookupTableData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("surveys/{surveyId}/lookuptables/{key}")
    Call<LookupTableData> findLookupTable(
            @retrofit2.http.Path("surveyId") Long surveyId, @retrofit2.http.Path("key") String key
    );

}

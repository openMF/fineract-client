package org.mifos.fineract.services;

import org.mifos.fineract.models.PostCollectionSheetRequest;
import org.mifos.fineract.models.PostCollectionSheetResponse;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface CollectionSheetApi {
    /**
     * Generate Individual Collection Sheet | Save Collection Sheet
     * Generate Individual Collection Sheet:  This Api retrieves repayment details of all individual loans under a office as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of individual loans and deposit of mandatory savings on a given meeting date.
     *
     * @param body    body (required)
     * @param command command (optional)
     * @return Call&lt;PostCollectionSheetResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("collectionsheet")
    Call<PostCollectionSheetResponse> generateCollectionSheet(
            @retrofit2.http.Body PostCollectionSheetRequest body, @retrofit2.http.Query("command") String command
    );

}

package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

import java.util.List;

public interface ProvisioningEntriesApi {
    /**
     * Create new Provisioning Entries
     * Creates a new Provisioning Entries  Mandatory Fields date dateFormat locale Optional Fields createjournalentries
     *
     * @param body body (optional)
     * @return Observable&lt;PostProvisioningEntriesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("provisioningentries")
    Observable<PostProvisioningEntriesResponse> createProvisioningEntries(
            @retrofit2.http.Body PostProvisioningEntriesRequest body
    );

    /**
     * Recreates Provisioning Entry
     * Recreates Provisioning Entry | createjournalentry.
     *
     * @param entryId entryId (required)
     * @param command command&#x3D;createjournalentry command&#x3D;recreateprovisioningentry (optional)
     * @param body    body (optional)
     * @return Observable&lt;PutProvisioningEntriesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("provisioningentries/{entryId}")
    Observable<PutProvisioningEntriesResponse> modifyProvisioningEntry(
            @retrofit2.http.Path("entryId") Long entryId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body PutProvisioningEntriesRequest body
    );

    /**
     * List all Provisioning Entries
     *
     * @param offset offset (optional)
     * @param limit  limit (optional)
     * @return Observable&lt;List&lt;ProvisioningEntryData&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("provisioningentries")
    Observable<List<ProvisioningEntryData>> retrieveAllProvisioningEntries(
            @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
    );

    /**
     * @param entryId    (optional)
     * @param offset     (optional)
     * @param limit      (optional)
     * @param officeId   (optional)
     * @param productId  (optional)
     * @param categoryId (optional)
     * @return Observable&lt;LoanProductProvisioningEntryData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("provisioningentries/entries")
    Observable<LoanProductProvisioningEntryData> retrieveProviioningEntries(
            @retrofit2.http.Query("entryId") Long entryId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("productId") Long productId, @retrofit2.http.Query("categoryId") Long categoryId
    );

    /**
     * Retrieves a Provisioning Entry
     * Returns the details of a generated Provisioning Entry.
     *
     * @param entryId entryId (required)
     * @return Observable&lt;ProvisioningEntryData&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("provisioningentries/{entryId}")
    Observable<ProvisioningEntryData> retrieveProvisioningEntry(
            @retrofit2.http.Path("entryId") Long entryId
    );

}

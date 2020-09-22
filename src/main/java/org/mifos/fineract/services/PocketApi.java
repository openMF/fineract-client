package org.mifos.fineract.services;

import org.mifos.fineract.models.GetAccountsLinkedToPocketResponse;
import org.mifos.fineract.models.PostLinkDelinkAccountsToFromPocketResponse;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface PocketApi {
    /**
     * Link/delink accounts to/from pocket
     * Pockets behave as favourites. An user can link his/her Loan, Savings and Share accounts to pocket for faster access. In a similar way linked accounts can be delinked from the pocket.  Example Requests:  self/pockets?command&#x3D;linkAccounts  self/pockets?command&#x3D;delinkAccounts
     *
     * @param command command (optional)
     * @param body    (optional)
     * @return Observable&lt;PostLinkDelinkAccountsToFromPocketResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("self/pockets")
    Observable<PostLinkDelinkAccountsToFromPocketResponse> handleCommands(
            @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
    );

    /**
     * Retrieve accounts linked to pocket
     * All linked loan  Example Requests:   self/pockets
     *
     * @return Observable&lt;GetAccountsLinkedToPocketResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/pockets")
    Observable<GetAccountsLinkedToPocketResponse> retrieveAll();


}

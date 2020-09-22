package org.mifos.fineract.services;

import org.mifos.fineract.models.BatchResponse;
import org.mifos.fineract.models.PostBatchesRequest;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface BatchApiApi {
    /**
     * Batch requests in a single transaction
     * The Apache Fineract Batch API is also capable of executing all the requests in a single transaction, by setting a Query Parameter, \&quot;enclosingTransaction&#x3D;true\&quot;. So, if one or more of the requests in a batch returns an erroneous response all of the Data base transactions made by other successful requests will be rolled back.  If there has been a rollback in a transaction then a single response will be provided, with a &#39;400&#39; status code and a body consisting of the error details of the first failed request.
     *
     * @param body                 request body (required)
     * @param enclosingTransaction enclosingTransaction (optional, default to false)
     * @return Observable&lt;BatchResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("batches")
    Observable<BatchResponse> handleBatchRequests(
            @retrofit2.http.Body PostBatchesRequest body, @retrofit2.http.Query("enclosingTransaction") Boolean enclosingTransaction
    );

}

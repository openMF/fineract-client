package org.mifos.fineract.services;

import org.mifos.fineract.models.RunaccrualsRequest;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface PeriodicAccrualAccountingApi {
    /**
     * Executes Periodic Accrual Accounting
     * Mandatory Fields  tillDate
     *
     * @param body Request Body  Field Descriptions:  tillDate:  which specifies periodic accruals should happen till the given Date (required)
     * @return Observable&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("runaccruals")
    Observable<Void> executePeriodicAccrualAccounting(
            @retrofit2.http.Body RunaccrualsRequest body
    );

}

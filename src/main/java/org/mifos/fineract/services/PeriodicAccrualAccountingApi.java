package org.mifos.fineract.services;

import org.mifos.fineract.models.RunaccrualsRequest;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface PeriodicAccrualAccountingApi {
    /**
     * Executes Periodic Accrual Accounting
     * Mandatory Fields  tillDate
     *
     * @param body Request Body  Field Descriptions:  tillDate:  which specifies periodic accruals should happen till the given Date (required)
     * @return Call&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("runaccruals")
    Call<Void> executePeriodicAccrualAccounting(
            @retrofit2.http.Body RunaccrualsRequest body
    );

}

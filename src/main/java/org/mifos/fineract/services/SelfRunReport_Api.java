package org.mifos.fineract.services;

import org.mifos.fineract.models.GetRunReportResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface SelfRunReport_Api {
    /**
     * Running A Report
     * Example Requests:   self/runreports/Client%20Details?R_officeId&#x3D;1   self/runreports/Client%20Details?R_officeId&#x3D;1&amp;exportCSV&#x3D;true
     *
     * @param reportName reportName (required)
     * @return Call&lt;GetRunReportResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("self/runreports/{reportName}")
    Call<GetRunReportResponse> runReport(
            @retrofit2.http.Path("reportName") String reportName
    );

}

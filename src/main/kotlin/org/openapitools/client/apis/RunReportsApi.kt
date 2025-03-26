package org.openapitools.client.apis

import org.openapitools.client.models.ReportExportType
import org.openapitools.client.models.RunReportsResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RunReportsApi {
    /**
     * Return all available export types for the specific report
     * Returns the list of all available export types.
     * Responses:
     *  - 200:
     *
     * @param reportName reportName
     * @param isSelfServiceUserReport isSelfServiceUserReport (optional, default to false)
     * @return [kotlin.collections.List<ReportExportType]
     */
    @GET("v1/runreports/availableExports/{reportName}")
    suspend fun retrieveAllAvailableExports(
        @Path("reportName") reportName: String,
        @Query("isSelfServiceUserReport") isSelfServiceUserReport: Boolean? = false
    ): List<ReportExportType>

    /**
     * Running a Report
     * This resource allows you to run and receive output from pre-defined Apache Fineract reports.  Reports can also be used to provide data for searching and workflow functionality.  The default output is a JSON formatted \&quot;Generic Resultset\&quot;. The Generic Resultset contains Column Heading as well as Data information. However, you can export to CSV format by simply adding \&quot;&amp;exportCSV&#x3D;true\&quot; to the end of your URL.  If Pentaho reports have been pre-defined, they can also be run through this resource. Pentaho reports can return HTML, PDF or CSV formats.  The Apache Fineract reference application uses a JQuery plugin called stretchy reporting which, itself, uses this reports resource to provide a pretty flexible reporting User Interface (UI).    Example Requests:  runreports/Client%20Listing?R_officeId&#x3D;1   runreports/Client%20Listing?R_officeId&#x3D;1&amp;exportCSV&#x3D;true   runreports/OfficeIdSelectOne?R_officeId&#x3D;1&amp;parameterType&#x3D;true   runreports/OfficeIdSelectOne?R_officeId&#x3D;1&amp;parameterType&#x3D;true&amp;exportCSV&#x3D;true   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;HTML&amp;R_officeId&#x3D;1   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;XLS&amp;R_officeId&#x3D;1   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;CSV&amp;R_officeId&#x3D;1   runreports/Expected%20Payments%20By%20Date%20-%20Formatted?R_endDate&#x3D;2013-04-30&amp;R_loanOfficerId&#x3D;-1&amp;R_officeId&#x3D;1&amp;R_startDate&#x3D;2013-04-16&amp;output-type&#x3D;PDF&amp;R_officeId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param reportName reportName
     * @param isSelfServiceUserReport isSelfServiceUserReport (optional, default to false)
     * @return [RunReportsResponse]
     */
    @GET("v1/runreports/{reportName}")
    suspend fun runReport(
        @Path("reportName") reportName: String,
        @Query("isSelfServiceUserReport") isSelfServiceUserReport: Boolean? = false
    ): RunReportsResponse

}

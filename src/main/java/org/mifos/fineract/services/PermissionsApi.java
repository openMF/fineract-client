package org.mifos.fineract.services;

import org.mifos.fineract.models.CommandProcessingResult;
import org.mifos.fineract.models.GetPermissionsResponse;
import org.mifos.fineract.models.PutPermissionsRequest;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;

import java.util.List;

public interface PermissionsApi {
    /**
     * List Application Permissions
     * ARGUMENTS makerCheckerableoptional, Values are true, false. Default is false. If makerCheckerable&#x3D;false or not supplied then a list of application permissions is returned. The \&quot;selected\&quot; attribute is always true in this case.  If makerCheckerable&#x3D;true then the \&quot;selected\&quot; attribute shows whether the permission is enabled for Maker Check functionality.  Note: Each Apache Fineract transaction is associated with a permission.  Example Requests:  permissions   permissions?makerCheckerable&#x3D;true   permissions?fields&#x3D;grouping,code
     *
     * @return Call&lt;List&lt;GetPermissionsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("permissions")
    Call<List<GetPermissionsResponse>> retrieveAllPermissions();


    /**
     * Enable/Disable Permissions for Maker Checker
     *
     * @param body body (required)
     * @return Call&lt;CommandProcessingResult&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("permissions")
    Call<CommandProcessingResult> updatePermissionsDetails(
            @retrofit2.http.Body PutPermissionsRequest body
    );

}

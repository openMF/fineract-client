package org.mifos.fineract.services;

import org.mifos.fineract.models.GetMakerCheckerResponse;
import org.mifos.fineract.models.GetMakerCheckersSearchTemplateResponse;
import org.mifos.fineract.models.PostMakerCheckersResponse;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

import java.util.List;

public interface MakerCheckerOr4EyeFunctionalityApi {
  /**
   * Approve Maker Checker Entry | Reject Maker Checker Entry
   *
   * @param auditId auditId (required)
   * @param command command (optional)
   * @return Observable&lt;PostMakerCheckersResponse&gt;
   */
  @Headers({
          "Content-Type:application/json"
  })
  @POST("makercheckers/{auditId}")
  Observable<PostMakerCheckersResponse> approveMakerCheckerEntry(
          @retrofit2.http.Path("auditId") Long auditId, @retrofit2.http.Query("command") String command
  );

  /**
   * Delete Maker Checker Entry
   *
   * @param auditId auditId (required)
   * @return Observable&lt;PostMakerCheckersResponse&gt;
   */
  @Headers({
          "Content-Type:application/json"
  })
  @DELETE("makercheckers/{auditId}")
  Observable<PostMakerCheckersResponse> deleteMakerCheckerEntry(
          @retrofit2.http.Path("auditId") Long auditId
  );

  /**
   * Maker Checker Search Template
   * This is a convenience resource. It can be useful when building a Checker Inbox UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with. \&quot;actionNames\&quot; and \&quot;entityNames\&quot; returned are those that the requestor has Checker approval permissions for.  Example Requests:  makercheckers/searchtemplate makercheckers/searchtemplate?fields&#x3D;entityNames
   *
   * @return Observable&lt;GetMakerCheckersSearchTemplateResponse&gt;
   */
  @Headers({
          "Content-Type:application/json"
  })
  @GET("makercheckers/searchtemplate")
  Observable<GetMakerCheckersSearchTemplateResponse> retrieveAuditSearchTemplate();


  /**
   * List Maker Checker Entries
   * Get a list of entries that can be checked by the requestor that match the criteria supplied.  Example Requests:  makercheckers  makercheckers?fields&#x3D;madeOnDate,maker,processingResult  makercheckers?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  makercheckers?officeId&#x3D;1  makercheckers?officeId&#x3D;1&amp;includeJson&#x3D;true
   *
   * @param actionName        actionName (optional)
   * @param entityName        entityName (optional)
   * @param resourceId        resourceId (optional)
   * @param makerId           makerId (optional)
   * @param makerDateTimeFrom makerDateTimeFrom (optional)
   * @param makerDateTimeTo   makerDateTimeTo (optional)
   * @param officeId          officeId (optional)
   * @param groupId           groupId (optional)
   * @param clientId          clientId (optional)
   * @param loanid            loanid (optional)
   * @param savingsAccountId  savingsAccountId (optional)
   * @return Observable&lt;List&lt;GetMakerCheckerResponse&gt;&gt;
   */
  @Headers({
          "Content-Type:application/json"
  })
  @GET("makercheckers")
  Observable<List<GetMakerCheckerResponse>> retrieveCommands(
          @retrofit2.http.Query("actionName") String actionName, @retrofit2.http.Query("entityName") String entityName, @retrofit2.http.Query("resourceId") Long resourceId, @retrofit2.http.Query("makerId") Long makerId, @retrofit2.http.Query("makerDateTimeFrom") String makerDateTimeFrom, @retrofit2.http.Query("makerDateTimeTo") String makerDateTimeTo, @retrofit2.http.Query("officeId") Integer officeId, @retrofit2.http.Query("groupId") Integer groupId, @retrofit2.http.Query("clientId") Integer clientId, @retrofit2.http.Query("loanid") Integer loanid, @retrofit2.http.Query("savingsAccountId") Integer savingsAccountId
  );

}

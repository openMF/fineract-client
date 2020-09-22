package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface LoanCollateralApi {
    /**
     * Create a Collateral
     * Note: Currently, Collaterals may be added only before a Loan is approved
     *
     * @param loanId loanId (required)
     * @param body   body (required)
     * @return Observable&lt;PostLoansLoanIdCollateralsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("loans/{loanId}/collaterals")
    Observable<PostLoansLoanIdCollateralsResponse> createCollateral(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PostLoansLoanIdCollateralsRequest body
    );

    /**
     * Remove a Collateral
     * Note: A collateral can only be removed from Loans that are not yet approved.
     *
     * @param loanId       loanId (required)
     * @param collateralId collateralId (required)
     * @return Observable&lt;DeleteLoansLoanIdCollateralsCollateralIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("loans/{loanId}/collaterals/{collateralId}")
    Observable<DeleteLoansLoanIdCollateralsCollateralIdResponse> deleteCollateral(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("collateralId") Long collateralId
    );

    /**
     * Retrieve Collateral Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loans/1/collaterals/template
     *
     * @return Observable&lt;GetLoansLoanIdCollateralsTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loans/{loanId}/collaterals/template")
    Observable<GetLoansLoanIdCollateralsTemplateResponse> newCollateralTemplate();


    /**
     * List Loan Collaterals
     * Example Requests:  loans/1/collaterals   loans/1/collaterals?fields&#x3D;value,description
     *
     * @param loanId loanId (required)
     * @return Observable&lt;List&lt;GetLoansLoanIdCollateralsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loans/{loanId}/collaterals")
    Observable<List<GetLoansLoanIdCollateralsResponse>> retrieveCollateralDetails(
            @retrofit2.http.Path("loanId") Long loanId
    );

    /**
     * Retrieve a Collateral
     * Example Requests:  /loans/1/collaterals/1   /loans/1/collaterals/1?fields&#x3D;value,description
     *
     * @param loanId       loanId (required)
     * @param collateralId collateralId (required)
     * @return Observable&lt;GetLoansLoanIdCollateralsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loans/{loanId}/collaterals/{collateralId}")
    Observable<GetLoansLoanIdCollateralsResponse> retrieveCollateralDetails_0(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("collateralId") Long collateralId
    );

    /**
     * Update a Collateral
     *
     * @param loanId       loanId (required)
     * @param collateralId collateralId (required)
     * @param body         body (required)
     * @return Observable&lt;PutLoansLoanIdCollateralsCollateralIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("loans/{loanId}/collaterals/{collateralId}")
    Observable<PutLoansLoanIdCollateralsCollateralIdResponse> updateCollateral(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("collateralId") Long collateralId, @retrofit2.http.Body PutLoansLoandIdCollateralsCollateralIdRequest body
    );

}

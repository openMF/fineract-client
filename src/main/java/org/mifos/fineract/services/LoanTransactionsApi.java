package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface LoanTransactionsApi {
    /**
     * Adjust a Transaction
     * Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount
     *
     * @param loanId        loanId (required)
     * @param transactionId transactionId (required)
     * @param body          body (required)
     * @return Observable&lt;PostLoansLoanIdTransactionsTransactionIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("loans/{loanId}/transactions/{transactionId}")
    Observable<PostLoansLoanIdTransactionsTransactionIdResponse> adjustLoanTransaction(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Body PostLoansLoanIdTransactionsTransactionIdRequest body
    );

    /**
     * Make a Repayment | Make a Refund of an Active Loan by Cash | Foreclosure of an Active Loan | Waive Interest | Write-off Loan | Make Recovery Payment | Undo Loan Write-off Transaction
     * Make Recovery Payment:  This API allows collecting recovery payments for written-off loans
     *
     * @param loanId  loanId (required)
     * @param body    body (required)
     * @param command command (optional)
     * @return Observable&lt;PostLoansLoanIdTransactionsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("loans/{loanId}/transactions")
    Observable<PostLoansLoanIdTransactionsResponse> executeLoanTransaction(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PostLoansLoanIdTransactionsRequest body, @retrofit2.http.Query("command") String command
    );

    /**
     * Retrieve a Transaction Details
     * Retrieves a Transaction Details  Example Request:  loans/5/transactions/3
     *
     * @param loanId        loanId (required)
     * @param transactionId transactionId (required)
     * @return Observable&lt;GetLoansLoanIdTransactionsTransactionIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loans/{loanId}/transactions/{transactionId}")
    Observable<GetLoansLoanIdTransactionsTransactionIdResponse> retrieveTransaction(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("transactionId") Long transactionId
    );

    /**
     * Retrieve Loan Transaction Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  loans/1/transactions/template?command&#x3D;repayment
     *
     * @param loanId          loanId (required)
     * @param command         command (optional)
     * @param dateFormat      dateFormat (optional)
     * @param transactionDate transactionDate (optional)
     * @param locale          locale (optional)
     * @return Observable&lt;GetLoansLoanIdTransactionsTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loans/{loanId}/transactions/template")
    Observable<GetLoansLoanIdTransactionsTemplateResponse> retrieveTransactionTemplate(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Query("command") String command, @retrofit2.http.Query("dateFormat") String dateFormat, @retrofit2.http.Query("transactionDate") String transactionDate, @retrofit2.http.Query("locale") String locale
    );

}

package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface ProductsApi {
    /**
     * Create a Share Product
     * Creates a Share Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, locale, totalShares, unitPrice, nominalShares,allowDividendCalculationForInactiveClients,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): shareReferenceId, shareSuspenseId, shareEquityId, incomeFromFeeAccountId  Optional Fields: sharesIssued, minimumShares, maximumShares, minimumActivePeriodForDividends, minimumactiveperiodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType, marketPricePeriods, chargesSelected
     *
     * @param type type (required)
     * @param body body (required)
     * @return Observable&lt;PostProductsTypeResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("products/{type}")
    Observable<PostProductsTypeResponse> createProduct(
            @retrofit2.http.Path("type") String type, @retrofit2.http.Body PostProductsTypeRequest body
    );

    /**
     * @param type      type (required)
     * @param productId productId (required)
     * @param command   command (optional)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("products/{type}/{productId}")
    Observable<String> handleCommands(
            @retrofit2.http.Path("type") String type, @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Query("command") String command
    );

    /**
     * List Share Products
     * Lists Share Products  Mandatory Fields: limit, offset  Example Requests:  shareproducts
     *
     * @param type   type (required)
     * @param offset offset (optional)
     * @param limit  limit (optional)
     * @return Observable&lt;GetProductsTypeResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("products/{type}")
    Observable<GetProductsTypeResponse> retrieveAllProducts(
            @retrofit2.http.Path("type") String type, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
    );

    /**
     * Retrieve a Share Product
     * Retrieves a Share Product  Example Requests:  products/share/1   products/share/1?template&#x3D;true
     *
     * @param productId productId (required)
     * @param type      type (required)
     * @return Observable&lt;GetProductsTypeProductIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("products/{type}/{productId}")
    Observable<GetProductsTypeProductIdResponse> retrieveProduct(
            @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Path("type") String type
    );

    /**
     * @param type type (required)
     * @return Observable&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("products/{type}/template")
    Observable<String> retrieveTemplate(
            @retrofit2.http.Path("type") String type
    );

    /**
     * Update a Share Product
     * Updates a Share Product
     *
     * @param type      type (required)
     * @param productId productId (required)
     * @param body      body (required)
     * @return Observable&lt;PutProductsTypeProductIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("products/{type}/{productId}")
    Observable<PutProductsTypeProductIdResponse> updateProduct(
            @retrofit2.http.Path("type") String type, @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body PutProductsTypeProductIdRequest body
    );

}

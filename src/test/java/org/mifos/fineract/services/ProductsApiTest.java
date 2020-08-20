package org.mifos.fineract.services;

import org.junit.Before;
import org.junit.Test;
import org.mifos.fineract.ApiClient;
import org.mifos.fineract.models.PostProductsTypeRequest;
import org.mifos.fineract.models.PutProductsTypeProductIdRequest;

/**
 * API tests for ProductsApi
 */
public class ProductsApiTest {

    private ProductsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ProductsApi.class);
    }

    /**
     * Create a Share Product
     * <p>
     * Creates a Share Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, locale, totalShares, unitPrice, nominalShares,allowDividendCalculationForInactiveClients,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): shareReferenceId, shareSuspenseId, shareEquityId, incomeFromFeeAccountId  Optional Fields: sharesIssued, minimumShares, maximumShares, minimumActivePeriodForDividends, minimumactiveperiodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType, marketPricePeriods, chargesSelected
     */
    @Test
    public void createProductTest() {
        String type = null;
        PostProductsTypeRequest body = null;
        // PostProductsTypeResponse response = api.createProduct(type, body);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void handleCommandsTest() {
        String type = null;
        Long productId = null;
        String command = null;
        // String response = api.handleCommands(type, productId, command);

        // TODO: test validations
    }

    /**
     * List Share Products
     * <p>
     * Lists Share Products  Mandatory Fields: limit, offset  Example Requests:  shareproducts
     */
    @Test
    public void retrieveAllProductsTest() {
        String type = null;
        Integer offset = null;
        Integer limit = null;
        // GetProductsTypeResponse response = api.retrieveAllProducts(type, offset, limit);

        // TODO: test validations
    }

    /**
     * Retrieve a Share Product
     * <p>
     * Retrieves a Share Product  Example Requests:  products/share/1   products/share/1?template&#x3D;true
     */
    @Test
    public void retrieveProductTest() {
        Long productId = null;
        String type = null;
        // GetProductsTypeProductIdResponse response = api.retrieveProduct(productId, type);

        // TODO: test validations
    }

    /**
     *
     */
    @Test
    public void retrieveTemplateTest() {
        String type = null;
        // String response = api.retrieveTemplate(type);

        // TODO: test validations
    }

    /**
     * Update a Share Product
     * <p>
     * Updates a Share Product
     */
    @Test
    public void updateProductTest() {
        String type = null;
        Long productId = null;
        PutProductsTypeProductIdRequest body = null;
        // PutProductsTypeProductIdResponse response = api.updateProduct(type, productId, body);

        // TODO: test validations
    }
}

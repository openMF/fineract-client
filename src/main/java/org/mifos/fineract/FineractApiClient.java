package org.mifos.fineract;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.AuthenticationRequestBuilder;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder;
import org.joda.time.format.DateTimeFormatter;
import org.mifos.fineract.auth.ApiKeyAuth;
import org.mifos.fineract.auth.HttpBasicAuth;
import org.mifos.fineract.auth.OAuth;
import org.mifos.fineract.auth.OAuth.AccessTokenListener;
import org.mifos.fineract.services.*;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.LinkedHashMap;
import java.util.Map;

public class FineractApiClient {

    private Map<String, Interceptor> apiAuthorizations;
    private OkHttpClient.Builder okBuilder;
    private Retrofit.Builder adapterBuilder;
    private JSON json;

    // Authentication API
    private static AuthenticationHttpBasicApi authApi;
    // Centers API
    private static CentersApi centersApi;
    // Client APIs
    private static ClientApi clientApi;
    private static ClientChargesApi clientChargesApi;
    private static ClientTransactionApi clientTransactionApi;
    private static ClientsAddressApi clientsAddressApi;
    private static ClientIdentifierApi clientIdentifierApi;
    // DataTables API
    private static DataTablesApi dataTablesApi;
    // Loans API
    private static LoansApi loansApi;
    private static LoanChargesApi loanChargesApi;
    private static LoanCollateralApi loanCollateralApi;
    private static LoanProductsApi loanProductsApi;
    private static LoanReschedulingApi loanReschedulingApi;
    private static LoanTransactionsApi loanTransactionsApi;
    private static SelfLoansApi selfLoansApi;
    private static SelfLoanProductsApi selfLoanProductsApi;
    // Savings Account API
    private static SavingsAccountApi savingsAccountApi;
    private static SavingsChargesApi savingsChargesApi;
    private static SavingsProductApi savingsProductApi;
    private static SelfSavingsAccountApi selfSavingsAccountApi;
    // Charge API
    private static ChargesApi chargesApi;
    // Search API
    private static SearchApi searchApi;
    // Groups API
    private static GroupsApi groupsApi;
    // Documents API
    private static DocumentsApi documentsApi;
    // Office API
    private static OfficesApi officesApi;
    private static OfficeTransactionsApi officeTransactionsApi;
    // Staff API
    private static StaffApi staffApi;
    // Survey API
    private static SurveyApi surveyApi;
    private static SpmSurveysApi spmSurveysApi;
    // Run Reports API
    private static RunReportsApi runReportsApi;
    private static ReportsApi reportsApi;
    // Notes API
    private static NotesApi notesApi;
    // Collection Sheet API
    private static CollectionSheetApi collectionSheetApi;
    // Checker Inbox API
    private static CheckerInboxApi checkerInboxApi;

    public FineractApiClient() {
        apiAuthorizations = new LinkedHashMap<>();
        createDefaultAdapter();
        init();
    }

    public FineractApiClient(String[] authNames) {
        this();
        for (String authName : authNames) {
            throw new RuntimeException("auth name \"" + authName + "\" not found in available auth names");
        }
    }

    /**
     * Basic constructor for single auth name
     *
     * @param authName Authentication name
     */
    public FineractApiClient(String authName) {
        this(new String[]{authName});
    }

    /**
     * Helper constructor for single api key
     *
     * @param authName Authentication name
     * @param apiKey   API key
     */
    public FineractApiClient(String authName, String apiKey) {
        this(authName);
        this.setApiKey(apiKey);
    }

    /**
     * Helper constructor for single basic auth or password oauth2
     *
     * @param authName Authentication name
     * @param username Username
     * @param password Password
     */
    public FineractApiClient(String authName, String username, String password) {
        this(authName);
        this.setCredentials(username, password);
    }

    /**
     * Helper constructor for single password oauth2
     *
     * @param authName Authentication name
     * @param clientId Client ID
     * @param secret   Client Secret
     * @param username Username
     * @param password Password
     */
    public FineractApiClient(String authName, String clientId, String secret, String username, String password) {
        this(authName);
        this.getTokenEndPoint()
                .setClientId(clientId)
                .setClientSecret(secret)
                .setUsername(username)
                .setPassword(password);
    }

    private void init() {
        authApi = createService(AuthenticationHttpBasicApi.class);
        centersApi = createService(CentersApi.class);
        clientApi = createService(ClientApi.class);
        clientChargesApi = createService(ClientChargesApi.class);
        clientTransactionApi = createService(ClientTransactionApi.class);
        clientsAddressApi = createService(ClientsAddressApi.class);
        clientIdentifierApi = createService(ClientIdentifierApi.class);
        dataTablesApi = createService(DataTablesApi.class);
        loansApi = createService(LoansApi.class);
        loanChargesApi = createService(LoanChargesApi.class);
        loanCollateralApi = createService(LoanCollateralApi.class);
        loanProductsApi = createService(LoanProductsApi.class);
        loanReschedulingApi = createService(LoanReschedulingApi.class);
        loanTransactionsApi = createService(LoanTransactionsApi.class);
        selfLoansApi = createService(SelfLoansApi.class);
        selfLoanProductsApi = createService(SelfLoanProductsApi.class);

        savingsAccountApi = createService(SavingsAccountApi.class);
        savingsChargesApi = createService(SavingsChargesApi.class);
        savingsProductApi = createService(SavingsProductApi.class);
        selfSavingsAccountApi = createService(SelfSavingsAccountApi.class);
        chargesApi = createService(ChargesApi.class);
        searchApi = createService(SearchApi.class);
        groupsApi = createService(GroupsApi.class);
        documentsApi = createService(DocumentsApi.class);
        officesApi = createService(OfficesApi.class);
        officeTransactionsApi = createService(OfficeTransactionsApi.class);
        staffApi = createService(StaffApi.class);
        surveyApi = createService(SurveyApi.class);
        spmSurveysApi = createService(SpmSurveysApi.class);
        runReportsApi = createService(RunReportsApi.class);
        reportsApi = createService(ReportsApi.class);
        notesApi = createService(NotesApi.class);
        collectionSheetApi = createService(CollectionSheetApi.class);
        checkerInboxApi = createService(CheckerInboxApi.class);
    }

    public void createDefaultAdapter() {
        json = new JSON();
        okBuilder = new OkHttpClient.Builder();

        String baseUrl = "https://demo.mifos.io/fineract-provider/api/v1/";

        adapterBuilder = new Retrofit
                .Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonCustomConverterFactory.create(json.getGson()));
    }

    public <S> S createService(Class<S> serviceClass) {
        return adapterBuilder
                .client(okBuilder.build())
                .build()
                .create(serviceClass);
    }

    public FineractApiClient setDateFormat(DateFormat dateFormat) {
        this.json.setDateFormat(dateFormat);
        return this;
    }

    public FineractApiClient setSqlDateFormat(DateFormat dateFormat) {
        this.json.setSqlDateFormat(dateFormat);
        return this;
    }

    public FineractApiClient setDateTimeFormat(DateTimeFormatter dateFormat) {
        this.json.setDateTimeFormat(dateFormat);
        return this;
    }

    public FineractApiClient setLocalDateFormat(DateTimeFormatter dateFormat) {
        this.json.setLocalDateFormat(dateFormat);
        return this;
    }


    /**
     * Helper method to configure the first api key found
     *
     * @param apiKey API key
     * @return ApiClient
     */
    public FineractApiClient setApiKey(String apiKey) {
        for (Interceptor apiAuthorization : apiAuthorizations.values()) {
            if (apiAuthorization instanceof ApiKeyAuth) {
                ApiKeyAuth keyAuth = (ApiKeyAuth) apiAuthorization;
                keyAuth.setApiKey(apiKey);
                return this;
            }
        }
        return this;
    }

    /**
     * Helper method to configure the username/password for basic auth or password oauth
     *
     * @param username Username
     * @param password Password
     * @return ApiClient
     */
    public FineractApiClient setCredentials(String username, String password) {
        for (Interceptor apiAuthorization : apiAuthorizations.values()) {
            if (apiAuthorization instanceof HttpBasicAuth) {
                HttpBasicAuth basicAuth = (HttpBasicAuth) apiAuthorization;
                basicAuth.setCredentials(username, password);
                return this;
            }
            if (apiAuthorization instanceof OAuth) {
                OAuth oauth = (OAuth) apiAuthorization;
                oauth.getTokenRequestBuilder().setUsername(username).setPassword(password);
                return this;
            }
        }
        return this;
    }

    /**
     * Helper method to configure the token endpoint of the first oauth found in the apiAuthorizations (there should be only one)
     *
     * @return Token request builder
     */
    public TokenRequestBuilder getTokenEndPoint() {
        for (Interceptor apiAuthorization : apiAuthorizations.values()) {
            if (apiAuthorization instanceof OAuth) {
                OAuth oauth = (OAuth) apiAuthorization;
                return oauth.getTokenRequestBuilder();
            }
        }
        return null;
    }

    /**
     * Helper method to configure authorization endpoint of the first oauth found in the apiAuthorizations (there should be only one)
     *
     * @return Authentication request builder
     */
    public AuthenticationRequestBuilder getAuthorizationEndPoint() {
        for (Interceptor apiAuthorization : apiAuthorizations.values()) {
            if (apiAuthorization instanceof OAuth) {
                OAuth oauth = (OAuth) apiAuthorization;
                return oauth.getAuthenticationRequestBuilder();
            }
        }
        return null;
    }

    /**
     * Helper method to pre-set the oauth access token of the first oauth found in the apiAuthorizations (there should be only one)
     *
     * @param accessToken Access token
     * @return ApiClient
     */
    public FineractApiClient setAccessToken(String accessToken) {
        for (Interceptor apiAuthorization : apiAuthorizations.values()) {
            if (apiAuthorization instanceof OAuth) {
                OAuth oauth = (OAuth) apiAuthorization;
                oauth.setAccessToken(accessToken);
                return this;
            }
        }
        return this;
    }

    /**
     * Helper method to configure the oauth accessCode/implicit flow parameters
     *
     * @param clientId     Client ID
     * @param clientSecret Client secret
     * @param redirectURI  Redirect URI
     * @return ApiClient
     */
    public FineractApiClient configureAuthorizationFlow(String clientId, String clientSecret, String redirectURI) {
        for (Interceptor apiAuthorization : apiAuthorizations.values()) {
            if (apiAuthorization instanceof OAuth) {
                OAuth oauth = (OAuth) apiAuthorization;
                oauth.getTokenRequestBuilder()
                        .setClientId(clientId)
                        .setClientSecret(clientSecret)
                        .setRedirectURI(redirectURI);
                oauth.getAuthenticationRequestBuilder()
                        .setClientId(clientId)
                        .setRedirectURI(redirectURI);
                return this;
            }
        }
        return this;
    }

    /**
     * Configures a listener which is notified when a new access token is received.
     *
     * @param accessTokenListener Access token listener
     * @return ApiClient
     */
    public FineractApiClient registerAccessTokenListener(AccessTokenListener accessTokenListener) {
        for (Interceptor apiAuthorization : apiAuthorizations.values()) {
            if (apiAuthorization instanceof OAuth) {
                OAuth oauth = (OAuth) apiAuthorization;
                oauth.registerAccessTokenListener(accessTokenListener);
                return this;
            }
        }
        return this;
    }

    /**
     * Adds an authorization to be used by the client
     *
     * @param authName      Authentication name
     * @param authorization Authorization interceptor
     * @return ApiClient
     */
    public FineractApiClient addAuthorization(String authName, Interceptor authorization) {
        if (apiAuthorizations.containsKey(authName)) {
            throw new RuntimeException("auth name \"" + authName + "\" already in api authorizations");
        }
        apiAuthorizations.put(authName, authorization);
        okBuilder.addInterceptor(authorization);
        return this;
    }

    public Map<String, Interceptor> getApiAuthorizations() {
        return apiAuthorizations;
    }

    public FineractApiClient setApiAuthorizations(Map<String, Interceptor> apiAuthorizations) {
        this.apiAuthorizations = apiAuthorizations;
        return this;
    }

    public Retrofit.Builder getAdapterBuilder() {
        return adapterBuilder;
    }

    public FineractApiClient setAdapterBuilder(Retrofit.Builder adapterBuilder) {
        this.adapterBuilder = adapterBuilder;
        return this;
    }

    public OkHttpClient.Builder getOkBuilder() {
        return okBuilder;
    }

    public void addAuthsToOkBuilder(OkHttpClient.Builder okBuilder) {
        for (Interceptor apiAuthorization : apiAuthorizations.values()) {
            okBuilder.addInterceptor(apiAuthorization);
        }
    }

    /**
     * Clones the okBuilder given in parameter, adds the auth interceptors and uses it to configure the Retrofit
     *
     * @param okClient An instance of OK HTTP client
     */
    public void configureFromOkclient(OkHttpClient okClient) {
        this.okBuilder = okClient.newBuilder();
        addAuthsToOkBuilder(this.okBuilder);
    }

    /**
     * Getter methods for API service instances
     */
    public static AuthenticationHttpBasicApi getAuthApi() {
        return authApi;
    }

    public static CentersApi getCentersApi() {
        return centersApi;
    }

    public static ClientApi getClientApi() {
        return clientApi;
    }

    public static ClientChargesApi getClientChargesApi() {
        return clientChargesApi;
    }

    public static ClientTransactionApi getClientTransactionApi() {
        return clientTransactionApi;
    }

    public static ClientsAddressApi getClientsAddressApi() {
        return clientsAddressApi;
    }

    public static ClientIdentifierApi getClientIdentifierApi() {
        return clientIdentifierApi;
    }

    public static DataTablesApi getDataTablesApi() {
        return dataTablesApi;
    }

    public static LoansApi getLoansApi() {
        return loansApi;
    }

    public static LoanChargesApi getLoanChargesApi() {
        return loanChargesApi;
    }

    public static LoanCollateralApi getLoanCollateralApi() {
        return loanCollateralApi;
    }

    public static LoanProductsApi getLoanProductsApi() {
        return loanProductsApi;
    }

    public static LoanReschedulingApi getLoanReschedulingApi() {
        return loanReschedulingApi;
    }

    public static LoanTransactionsApi getLoanTransactionsApi() {
        return loanTransactionsApi;
    }

    public static SelfLoansApi getSelfLoansApi() {
        return selfLoansApi;
    }

    public static SelfLoanProductsApi getSelfLoanProductsApi() {
        return selfLoanProductsApi;
    }

    public static SavingsAccountApi getSavingsAccountApi() {
        return savingsAccountApi;
    }

    public static SavingsChargesApi getSavingsChargesApi() {
        return savingsChargesApi;
    }

    public static SavingsProductApi getSavingsProductApi() {
        return savingsProductApi;
    }

    public static SelfSavingsAccountApi getSelfSavingsAccountApi() {
        return selfSavingsAccountApi;
    }

    public static ChargesApi getChargesApi() {
        return chargesApi;
    }

    public static SearchApi getSearchApi() {
        return searchApi;
    }

    public static GroupsApi getGroupsApi() {
        return groupsApi;
    }

    public static DocumentsApi getDocumentsApi() {
        return documentsApi;
    }

    public static OfficesApi getOfficesApi() {
        return officesApi;
    }

    public static OfficeTransactionsApi getOfficeTransactionsApi() {
        return officeTransactionsApi;
    }

    public static StaffApi getStaffApi() {
        return staffApi;
    }

    public static SurveyApi getSurveyApi() {
        return surveyApi;
    }

    public static SpmSurveysApi getSpmSurveysApi() {
        return spmSurveysApi;
    }

    public static RunReportsApi getRunReportsApi() {
        return runReportsApi;
    }

    public static ReportsApi getReportsApi() {
        return reportsApi;
    }

    public static NotesApi getNotesApi() {
        return notesApi;
    }

    public static CollectionSheetApi getCollectionSheetApi() {
        return collectionSheetApi;
    }

    public static CheckerInboxApi getCheckerInboxApi() {
        return checkerInboxApi;
    }
}

/**
 * This wrapper is to take care of this case:
 * when the deserialization fails due to JsonParseException and the
 * expected type is String, then just return the body string.
 */
class GsonResponseBodyConverterToString<T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final Type type;

    GsonResponseBodyConverterToString(Gson gson, Type type) {
        this.gson = gson;
        this.type = type;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String returned = value.string();
        try {
            return gson.fromJson(returned, type);
        } catch (JsonParseException e) {
            return (T) returned;
        }
    }
}

class GsonCustomConverterFactory extends Converter.Factory {
    private final Gson gson;
    private final GsonConverterFactory gsonConverterFactory;

    private GsonCustomConverterFactory(Gson gson) {
        if (gson == null)
            throw new NullPointerException("gson == null");
        this.gson = gson;
        this.gsonConverterFactory = GsonConverterFactory.create(gson);
    }

    public static GsonCustomConverterFactory create(Gson gson) {
        return new GsonCustomConverterFactory(gson);
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        if (type.equals(String.class))
            return new GsonResponseBodyConverterToString<Object>(gson, type);
        else
            return gsonConverterFactory.responseBodyConverter(type, annotations, retrofit);
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return gsonConverterFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }
}

package org.openapitools.client.infrastructure

import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level
import org.openapitools.client.apis.AccountNumberFormatApi
import org.openapitools.client.apis.AccountTransfersApi
import org.openapitools.client.apis.AccountingClosureApi
import org.openapitools.client.apis.AccountingRulesApi
import org.openapitools.client.apis.AdhocQueryApiApi
import org.openapitools.client.apis.AuditsApi
import org.openapitools.client.apis.AuthenticationHTTPBasicApi
import org.openapitools.client.apis.BatchAPIApi
import org.openapitools.client.apis.BulkImportApi
import org.openapitools.client.apis.BulkLoansApi
import org.openapitools.client.apis.BusinessDateManagementApi
import org.openapitools.client.apis.BusinessStepConfigurationApi
import org.openapitools.client.apis.CacheApi
import org.openapitools.client.apis.CalendarApi
import org.openapitools.client.apis.CashierJournalsApi
import org.openapitools.client.apis.CashiersApi
import org.openapitools.client.apis.CentersApi
import org.openapitools.client.apis.ChargesApi
import org.openapitools.client.apis.ClientApi
import org.openapitools.client.apis.ClientChargesApi
import org.openapitools.client.apis.ClientCollateralManagementApi
import org.openapitools.client.apis.ClientFamilyMemberApi
import org.openapitools.client.apis.ClientIdentifierApi
import org.openapitools.client.apis.ClientSearchV2Api
import org.openapitools.client.apis.ClientTransactionApi
import org.openapitools.client.apis.ClientsAddressApi
import org.openapitools.client.apis.CodeValuesApi
import org.openapitools.client.apis.CodesApi
import org.openapitools.client.apis.CollateralManagementApi
import org.openapitools.client.apis.CollectionSheetApi
import org.openapitools.client.apis.CreditBureauConfigurationApi
import org.openapitools.client.apis.CurrencyApi
import org.openapitools.client.apis.DataTablesApi
import org.openapitools.client.apis.DefaultApi
import org.openapitools.client.apis.DelinquencyRangeAndBucketsManagementApi
import org.openapitools.client.apis.DepositAccountOnHoldFundTransactionsApi
import org.openapitools.client.apis.DeviceRegistrationApi
import org.openapitools.client.apis.DocumentsApi
import org.openapitools.client.apis.EntityDataTableApi
import org.openapitools.client.apis.EntityFieldConfigurationApi
import org.openapitools.client.apis.ExternalAssetOwnersApi
import org.openapitools.client.apis.ExternalEventConfigurationApi
import org.openapitools.client.apis.ExternalServicesApi
import org.openapitools.client.apis.FetchAuthenticatedUserDetailsApi
import org.openapitools.client.apis.FineractEntityApi
import org.openapitools.client.apis.FixedDepositAccountApi
import org.openapitools.client.apis.FixedDepositAccountTransactionsApi
import org.openapitools.client.apis.FixedDepositProductApi
import org.openapitools.client.apis.FloatingRatesApi
import org.openapitools.client.apis.FundsApi
import org.openapitools.client.apis.GeneralLedgerAccountApi
import org.openapitools.client.apis.GlobalConfigurationApi
import org.openapitools.client.apis.GroupsApi
import org.openapitools.client.apis.GroupsLevelApi
import org.openapitools.client.apis.GuarantorsApi
import org.openapitools.client.apis.HolidaysApi
import org.openapitools.client.apis.HooksApi
import org.openapitools.client.apis.InlineJobApi
import org.openapitools.client.apis.InstanceModeApi
import org.openapitools.client.apis.InterOperationApi
import org.openapitools.client.apis.InterestRateChartApi
import org.openapitools.client.apis.InterestRateSlabAKAInterestBandsApi
import org.openapitools.client.apis.JournalEntriesApi
import org.openapitools.client.apis.LikelihoodApi
import org.openapitools.client.apis.ListReportMailingJobHistoryApi
import org.openapitools.client.apis.LoanAccountLockApi
import org.openapitools.client.apis.LoanCOBCatchUpApi
import org.openapitools.client.apis.LoanChargesApi
import org.openapitools.client.apis.LoanCollateralApi
import org.openapitools.client.apis.LoanCollateralManagementApi
import org.openapitools.client.apis.LoanDisbursementDetailsApi
import org.openapitools.client.apis.LoanProductsApi
import org.openapitools.client.apis.LoanReschedulingApi
import org.openapitools.client.apis.LoanTransactionsApi
import org.openapitools.client.apis.LoansApi
import org.openapitools.client.apis.MakerCheckerOr4EyeFunctionalityApi
import org.openapitools.client.apis.MappingFinancialActivitiesToAccountsApi
import org.openapitools.client.apis.MeetingsApi
import org.openapitools.client.apis.MixMappingApi
import org.openapitools.client.apis.MixReportApi
import org.openapitools.client.apis.MixTaxonomyApi
import org.openapitools.client.apis.NotesApi
import org.openapitools.client.apis.NotificationApi
import org.openapitools.client.apis.OfficesApi
import org.openapitools.client.apis.PasswordPreferencesApi
import org.openapitools.client.apis.PaymentTypeApi
import org.openapitools.client.apis.PeriodicAccrualAccountingApi
import org.openapitools.client.apis.PermissionsApi
import org.openapitools.client.apis.PocketApi
import org.openapitools.client.apis.PovertyLineApi
import org.openapitools.client.apis.ProductMixApi
import org.openapitools.client.apis.ProductsApi
import org.openapitools.client.apis.ProvisioningCategoryApi
import org.openapitools.client.apis.ProvisioningCriteriaApi
import org.openapitools.client.apis.ProvisioningEntriesApi
import org.openapitools.client.apis.RateApi
import org.openapitools.client.apis.RecurringDepositAccountApi
import org.openapitools.client.apis.RecurringDepositAccountTransactionsApi
import org.openapitools.client.apis.RecurringDepositProductApi
import org.openapitools.client.apis.RepaymentWithPostDatedChecksApi
import org.openapitools.client.apis.ReportMailingJobsApi
import org.openapitools.client.apis.ReportsApi
import org.openapitools.client.apis.RescheduleLoansApi
import org.openapitools.client.apis.RolesApi
import org.openapitools.client.apis.RunReportsApi
import org.openapitools.client.apis.SCHEDULERJOBApi
import org.openapitools.client.apis.SMSApi
import org.openapitools.client.apis.SPMAPILookUpTableApi
import org.openapitools.client.apis.SavingsAccountApi
import org.openapitools.client.apis.SavingsAccountTransactionsApi
import org.openapitools.client.apis.SavingsChargesApi
import org.openapitools.client.apis.SavingsProductApi
import org.openapitools.client.apis.SchedulerApi
import org.openapitools.client.apis.ScoreCardApi
import org.openapitools.client.apis.SearchAPIApi
import org.openapitools.client.apis.SelfAccountTransferApi
import org.openapitools.client.apis.SelfAuthenticationApi
import org.openapitools.client.apis.SelfClientApi
import org.openapitools.client.apis.SelfDividendApi
import org.openapitools.client.apis.SelfLoanProductsApi
import org.openapitools.client.apis.SelfLoansApi
import org.openapitools.client.apis.SelfRunReportApi
import org.openapitools.client.apis.SelfSavingsAccountApi
import org.openapitools.client.apis.SelfSavingsProductsApi
import org.openapitools.client.apis.SelfScoreCardApi
import org.openapitools.client.apis.SelfServiceRegistrationApi
import org.openapitools.client.apis.SelfShareAccountsApi
import org.openapitools.client.apis.SelfSpmApi
import org.openapitools.client.apis.SelfThirdPartyTransferApi
import org.openapitools.client.apis.SelfUserApi
import org.openapitools.client.apis.SelfUserDetailsApi
import org.openapitools.client.apis.ShareAccountApi
import org.openapitools.client.apis.SpmSurveysApi
import org.openapitools.client.apis.StaffApi
import org.openapitools.client.apis.StandingInstructionsApi
import org.openapitools.client.apis.StandingInstructionsHistoryApi
import org.openapitools.client.apis.SurveyApi
import org.openapitools.client.apis.TaxComponentsApi
import org.openapitools.client.apis.TaxGroupApi
import org.openapitools.client.apis.TellerCashManagementApi
import org.openapitools.client.apis.TwoFactorApi
import org.openapitools.client.apis.UserGeneratedDocumentsApi
import org.openapitools.client.apis.UsersApi
import org.openapitools.client.apis.WorkingDaysApi
import org.openapitools.client.auth.ApiKeyAuth
import org.openapitools.client.auth.HttpBasicAuth
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.security.KeyManagementException
import java.security.NoSuchAlgorithmException
import java.security.SecureRandom
import java.security.cert.CertificateException
import java.security.cert.X509Certificate
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSession
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager

/**
 * Fineract Client Kotlin SDK API entry point. Use this instead of the {@link ApiClient}.
 *
 * @author Aditya Gupta
 */

class FineractClient private constructor(
    private val okHttpClient: OkHttpClient,
    private val retrofit: Retrofit
) {
    val accountingClosures: AccountingClosureApi = retrofit.create(AccountingClosureApi::class.java)
    val accountingRules: AccountingRulesApi = retrofit.create(AccountingRulesApi::class.java)
    val accountNumberFormats: AccountNumberFormatApi =
        retrofit.create(AccountNumberFormatApi::class.java)
    val accountTransfers: AccountTransfersApi = retrofit.create(AccountTransfersApi::class.java)
    val adhocQuery: AdhocQueryApiApi = retrofit.create(AdhocQueryApiApi::class.java)
    val audits: AuditsApi = retrofit.create(AuditsApi::class.java)
    val authentication: AuthenticationHTTPBasicApi =
        retrofit.create(AuthenticationHTTPBasicApi::class.java)
    val batches: BatchAPIApi = retrofit.create(BatchAPIApi::class.java)
    val bulkImport: BulkImportApi = retrofit.create(BulkImportApi::class.java)
    val bulkLoans: BulkLoansApi = retrofit.create(BulkLoansApi::class.java)
    val businessDateManagement: BusinessDateManagementApi =
        retrofit.create(BusinessDateManagementApi::class.java)
    val businessStepConfiguration: BusinessStepConfigurationApi =
        retrofit.create(BusinessStepConfigurationApi::class.java)
    val caches: CacheApi = retrofit.create(CacheApi::class.java)
    val calender: CalendarApi = retrofit.create(CalendarApi::class.java)
    val cashiersJournal: CashierJournalsApi = retrofit.create(CashierJournalsApi::class.java)
    val cashiers: CashiersApi = retrofit.create(CashiersApi::class.java)
    val centers: CentersApi = retrofit.create(CentersApi::class.java)
    val charges: ChargesApi = retrofit.create(ChargesApi::class.java)
    val clients: ClientApi = retrofit.create(ClientApi::class.java)
    val clientCharges: ClientChargesApi = retrofit.create(ClientChargesApi::class.java)
    val clientCollateralManagement: ClientCollateralManagementApi =
        retrofit.create(ClientCollateralManagementApi::class.java)
    val clientFamilyMember: ClientFamilyMemberApi =
        retrofit.create(ClientFamilyMemberApi::class.java)
    val clientIdentifiers: ClientIdentifierApi = retrofit.create(ClientIdentifierApi::class.java)
    val clientAddresses: ClientsAddressApi = retrofit.create(ClientsAddressApi::class.java)
    val clientSearch: ClientSearchV2Api = retrofit.create(ClientSearchV2Api::class.java)
    val clientTransactions: ClientTransactionApi = retrofit.create(ClientTransactionApi::class.java)
    val codes: CodesApi = retrofit.create(CodesApi::class.java)
    val codeValues: CodeValuesApi = retrofit.create(CodeValuesApi::class.java)
    val collateralManagement: CollateralManagementApi =
        retrofit.create(CollateralManagementApi::class.java)
    val collectionSheet: CollectionSheetApi = retrofit.create(CollectionSheetApi::class.java)
    val creditBureauConfiguration: CreditBureauConfigurationApi =
        retrofit.create(CreditBureauConfigurationApi::class.java)
    val currencies: CurrencyApi = retrofit.create(CurrencyApi::class.java)
    val dataTables: DataTablesApi = retrofit.create(DataTablesApi::class.java)
    val legacy: DefaultApi = retrofit.create(DefaultApi::class.java) // TODO FINERACT-1222
    val delinquencyRangeAndBucketsManagement: DelinquencyRangeAndBucketsManagementApi =
        retrofit.create(DelinquencyRangeAndBucketsManagementApi::class.java)
    val depositAccountOnHoldFundTransactions: DepositAccountOnHoldFundTransactionsApi =
        retrofit.create(DepositAccountOnHoldFundTransactionsApi::class.java)
    val deviceRegistrationApi: DeviceRegistrationApi =
        retrofit.create(DeviceRegistrationApi::class.java)
    val documents: DocumentsApi = retrofit.create(DocumentsApi::class.java)
    val entityDatatableChecks: EntityDataTableApi = retrofit.create(EntityDataTableApi::class.java)
    val entityFieldConfigurations: EntityFieldConfigurationApi =
        retrofit.create(EntityFieldConfigurationApi::class.java)
    val externalAssetOwners: ExternalAssetOwnersApi =
        retrofit.create(ExternalAssetOwnersApi::class.java)
    val externalEventConfiguration: ExternalEventConfigurationApi =
        retrofit.create(ExternalEventConfigurationApi::class.java)
    val externalServices: ExternalServicesApi = retrofit.create(ExternalServicesApi::class.java)
    val userDetails: FetchAuthenticatedUserDetailsApi =
        retrofit.create(FetchAuthenticatedUserDetailsApi::class.java)
    val fineractEntity: FineractEntityApi = retrofit.create(FineractEntityApi::class.java)
    val fixedDepositAccounts: FixedDepositAccountApi =
        retrofit.create(FixedDepositAccountApi::class.java)
    val fixedDepositAccountTransactions: FixedDepositAccountTransactionsApi =
        retrofit.create(FixedDepositAccountTransactionsApi::class.java)
    val fixedDepositProducts: FixedDepositProductApi =
        retrofit.create(FixedDepositProductApi::class.java)
    val floatingRates: FloatingRatesApi = retrofit.create(FloatingRatesApi::class.java)
    val funds: FundsApi = retrofit.create(FundsApi::class.java)
    val glAccounts: GeneralLedgerAccountApi = retrofit.create(GeneralLedgerAccountApi::class.java)
    val globalConfigurations: GlobalConfigurationApi =
        retrofit.create(GlobalConfigurationApi::class.java)
    val groups: GroupsApi = retrofit.create(GroupsApi::class.java)
    val groupsLoans: GroupsLevelApi = retrofit.create(GroupsLevelApi::class.java)
    val guarantors: GuarantorsApi = retrofit.create(GuarantorsApi::class.java)
    val holidays: HolidaysApi = retrofit.create(HolidaysApi::class.java)
    val hooks: HooksApi = retrofit.create(HooksApi::class.java)
    val inlineJob: InlineJobApi = retrofit.create(InlineJobApi::class.java)
    val instanceMode: InstanceModeApi = retrofit.create(InstanceModeApi::class.java)
    val interestRateCharts: InterestRateChartApi = retrofit.create(InterestRateChartApi::class.java)
    val interestRateChartLabs: InterestRateSlabAKAInterestBandsApi =
        retrofit.create(InterestRateSlabAKAInterestBandsApi::class.java)
    val interOperation: InterOperationApi = retrofit.create(InterOperationApi::class.java)
    val journalEntries: JournalEntriesApi = retrofit.create(JournalEntriesApi::class.java)
    val likelihood: LikelihoodApi = retrofit.create(LikelihoodApi::class.java)
    val reportMailings: ListReportMailingJobHistoryApi =
        retrofit.create(ListReportMailingJobHistoryApi::class.java)
    val loanAccountLock: LoanAccountLockApi = retrofit.create(LoanAccountLockApi::class.java)
    val loanCharges: LoanChargesApi = retrofit.create(LoanChargesApi::class.java)
    val loanCOBCatchUp: LoanCOBCatchUpApi = retrofit.create(LoanCOBCatchUpApi::class.java)
    val loanCollaterals: LoanCollateralApi = retrofit.create(LoanCollateralApi::class.java)
    val loanCollateralManagement: LoanCollateralManagementApi =
        retrofit.create(LoanCollateralManagementApi::class.java)
    val loanDisbursementDetails: LoanDisbursementDetailsApi =
        retrofit.create(LoanDisbursementDetailsApi::class.java)
    val loanProducts: LoanProductsApi = retrofit.create(LoanProductsApi::class.java)
    val loanSchedules: LoanReschedulingApi = retrofit.create(LoanReschedulingApi::class.java)
    val loans: LoansApi = retrofit.create(LoansApi::class.java)
    val loanTransactions: LoanTransactionsApi = retrofit.create(LoanTransactionsApi::class.java)
    val makerCheckers: MakerCheckerOr4EyeFunctionalityApi =
        retrofit.create(MakerCheckerOr4EyeFunctionalityApi::class.java)
    val financialActivityAccountMappings: MappingFinancialActivitiesToAccountsApi =
        retrofit.create(MappingFinancialActivitiesToAccountsApi::class.java)
    val meetings: MeetingsApi = retrofit.create(MeetingsApi::class.java)
    val mixMappings: MixMappingApi = retrofit.create(MixMappingApi::class.java)
    val mixReports: MixReportApi = retrofit.create(MixReportApi::class.java)
    val mixTaxonomies: MixTaxonomyApi = retrofit.create(MixTaxonomyApi::class.java)
    val notes: NotesApi = retrofit.create(NotesApi::class.java)
    val notifications: NotificationApi = retrofit.create(NotificationApi::class.java)
    val offices: OfficesApi = retrofit.create(OfficesApi::class.java)
    val passwordPreferences: PasswordPreferencesApi =
        retrofit.create(PasswordPreferencesApi::class.java)
    val paymentTypes: PaymentTypeApi = retrofit.create(PaymentTypeApi::class.java)
    val periodicAccrualAccounting: PeriodicAccrualAccountingApi =
        retrofit.create(PeriodicAccrualAccountingApi::class.java)
    val permissions: PermissionsApi = retrofit.create(PermissionsApi::class.java)
    val selfPockets: PocketApi = retrofit.create(PocketApi::class.java)
    val povertyLine: PovertyLineApi = retrofit.create(PovertyLineApi::class.java)
    val productMix: ProductMixApi = retrofit.create(ProductMixApi::class.java)
    val products: ProductsApi = retrofit.create(ProductsApi::class.java)
    val provisioningCategories: ProvisioningCategoryApi =
        retrofit.create(ProvisioningCategoryApi::class.java)
    val provisioningCriterias: ProvisioningCriteriaApi =
        retrofit.create(ProvisioningCriteriaApi::class.java)
    val provisioningEntries: ProvisioningEntriesApi =
        retrofit.create(ProvisioningEntriesApi::class.java)
    val rate: RateApi = retrofit.create(RateApi::class.java)
    val recurringDepositAccounts: RecurringDepositAccountApi =
        retrofit.create(RecurringDepositAccountApi::class.java)
    val recurringDepositAccountTransactions: RecurringDepositAccountTransactionsApi =
        retrofit.create(RecurringDepositAccountTransactionsApi::class.java)
    val recurringDepositProducts: RecurringDepositProductApi =
        retrofit.create(RecurringDepositProductApi::class.java)
    val repaymentWithPostDatedChecks: RepaymentWithPostDatedChecksApi =
        retrofit.create(RepaymentWithPostDatedChecksApi::class.java)
    val reportMailingJobs: ReportMailingJobsApi = retrofit.create(ReportMailingJobsApi::class.java)
    val reports: ReportsApi = retrofit.create(ReportsApi::class.java)
    val rescheduling: RescheduleLoansApi = retrofit.create(RescheduleLoansApi::class.java)
    val roles: RolesApi = retrofit.create(RolesApi::class.java)
    val reportsRun: RunReportsApi = retrofit.create(RunReportsApi::class.java)
    val savingsAccounts: SavingsAccountApi = retrofit.create(SavingsAccountApi::class.java)
    val savingsTransactions: SavingsAccountTransactionsApi =
        retrofit.create(SavingsAccountTransactionsApi::class.java)
    val savingsAccountCharges: SavingsChargesApi = retrofit.create(SavingsChargesApi::class.java)
    val savingsProducts: SavingsProductApi = retrofit.create(SavingsProductApi::class.java)
    val jobsScheduler: SchedulerApi = retrofit.create(SchedulerApi::class.java)
    val jobs: SCHEDULERJOBApi = retrofit.create(SCHEDULERJOBApi::class.java)
    val surveyScorecards: ScoreCardApi = retrofit.create(ScoreCardApi::class.java)
    val search: SearchAPIApi = retrofit.create(SearchAPIApi::class.java)
    val selfAccountTransfers: SelfAccountTransferApi =
        retrofit.create(SelfAccountTransferApi::class.java)
    val selfAuthentication: SelfAuthenticationApi =
        retrofit.create(SelfAuthenticationApi::class.java)
    val selfClients: SelfClientApi = retrofit.create(SelfClientApi::class.java)
    val selfDividend: SelfDividendApi = retrofit.create(SelfDividendApi::class.java)
    val selfLoanProducts: SelfLoanProductsApi = retrofit.create(SelfLoanProductsApi::class.java)
    val selfLoans: SelfLoansApi = retrofit.create(SelfLoansApi::class.java)
    val selfReportsRun: SelfRunReportApi = retrofit.create(SelfRunReportApi::class.java)
    val selfSavingsAccounts: SelfSavingsAccountApi =
        retrofit.create(SelfSavingsAccountApi::class.java)
    val selfSavingsProducts: SelfSavingsProductsApi =
        retrofit.create(SelfSavingsProductsApi::class.java)
    val selfSurveyScorecards: SelfScoreCardApi = retrofit.create(SelfScoreCardApi::class.java)
    val selfRegistration: SelfServiceRegistrationApi =
        retrofit.create(SelfServiceRegistrationApi::class.java)
    val selfShareAccounts: SelfShareAccountsApi = retrofit.create(SelfShareAccountsApi::class.java)
    val selfShareProducts: SelfSavingsProductsApi =
        retrofit.create(SelfSavingsProductsApi::class.java)
    val selfSurveys: SelfSpmApi = retrofit.create(SelfSpmApi::class.java)
    val selfThirdPartyBeneficiaries: SelfThirdPartyTransferApi =
        retrofit.create(SelfThirdPartyTransferApi::class.java)
    val selfUser: SelfUserApi = retrofit.create(SelfUserApi::class.java)
    val selfUserDetails: SelfUserDetailsApi = retrofit.create(SelfUserDetailsApi::class.java)
    val shareAccounts: ShareAccountApi = retrofit.create(ShareAccountApi::class.java)
    val sms: SMSApi = retrofit.create(SMSApi::class.java)
    val surveyLookupTables: SPMAPILookUpTableApi = retrofit.create(SPMAPILookUpTableApi::class.java)
    val spmSurveys: SpmSurveysApi = retrofit.create(SpmSurveysApi::class.java)
    val staff: StaffApi = retrofit.create(StaffApi::class.java)
    val standingInstructions: StandingInstructionsApi =
        retrofit.create(StandingInstructionsApi::class.java)
    val standingInstructionsHistory: StandingInstructionsHistoryApi =
        retrofit.create(StandingInstructionsHistoryApi::class.java)
    val surveys: SurveyApi = retrofit.create(SurveyApi::class.java)
    val taxComponents: TaxComponentsApi = retrofit.create(TaxComponentsApi::class.java)
    val taxGroups: TaxGroupApi = retrofit.create(TaxGroupApi::class.java)
    val tellers: TellerCashManagementApi = retrofit.create(TellerCashManagementApi::class.java)
    val twoFactor: TwoFactorApi = retrofit.create(TwoFactorApi::class.java)
    val templates: UserGeneratedDocumentsApi =
        retrofit.create(UserGeneratedDocumentsApi::class.java)
    val users: UsersApi = retrofit.create(UsersApi::class.java)
    val workingDays: WorkingDaysApi = retrofit.create(WorkingDaysApi::class.java)

    fun okHttpClient(): OkHttpClient {
        return this.okHttpClient
    }

    fun baseURL(): HttpUrl {
        return retrofit.baseUrl()
    }

    /**
     * Create an implementation of the API endpoints defined by the `service` interface, using
     * [Retrofit.create]. This method is typically not required to be invoked for standard API usage, but
     * can be a handy back door for non-trivial advanced customizations of the API client if you have extended Fineract
     * with your own REST APIs.
     */
    fun <S> createService(serviceClass: Class<S>?): S {
        return retrofit.create(serviceClass)
    }

    class Builder internal constructor() {
        private val json: JSON = JSON()

        /**
         * Obtain the internal OkHttp Builder. This method is typically not required to be invoked for simple API
         * usages, but can be a handy back door for non-trivial advanced customizations of the API client.
         *
         * @return the [ApiClient] which [.build] will use.
         */
        val okBuilder: OkHttpClient.Builder = OkHttpClient.Builder()

        /**
         * Obtain the internal Retrofit Builder. This method is typically not required to be invoked for simple API
         * usages, but can be a handy back door for non-trivial advanced customizations of the API client.
         *
         * @return the [ApiClient] which [.build] will use.
         */
        val retrofitBuilder: Retrofit.Builder =
            Retrofit.Builder().addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(JSON.GsonCustomConverterFactory.create(json.gson))

        private var baseURL: String? = null
        private var tenant: String? = null
        private var username: String? = null
        private var password: String? = null

        fun baseURL(baseURL: String?): Builder {
            this.baseURL = baseURL
            return this
        }

        fun tenant(tenant: String?): Builder {
            this.tenant = tenant
            return this
        }

        fun basicAuth(username: String?, password: String?): Builder {
            this.username = username
            this.password = password
            return this
        }

        fun logging(level: Level?): Builder {
            val logging = HttpLoggingInterceptor()
            level?.let { logging.setLevel(it) }
            okBuilder.addInterceptor(logging)
            return this
        }

        /**
         * Skip Fineract API host SSL certificate verification. DO NOT USE THIS when invoking a production server's API!
         * This is intended for https://localhost:8443/ testing of development servers with self-signed certificates,
         * only. If you do not understand what this is, do not use it. You WILL cause a security issue in your
         * application due to the possibility of a "man in the middle" attack when this is enabled.
         */
        @Suppress("unused")
        fun insecure(insecure: Boolean): Builder {
            // Nota bene: Similar code to this is also in Fineract Provider's
            // org.apache.fineract.infrastructure.hooks.processor.ProcessorHelper
            if (insecure) {
                val insecureHostnameVerifier =
                    HostnameVerifier { hostname: String?, session: SSLSession? -> true }
                okBuilder.hostnameVerifier(insecureHostnameVerifier)

                try {
                    val insecureX509TrustManager: X509TrustManager = object : X509TrustManager {
                        @Throws(CertificateException::class)
                        override fun checkClientTrusted(
                            chain: Array<X509Certificate>,
                            authType: String
                        ) {
                        }

                        @Throws(CertificateException::class)
                        override fun checkServerTrusted(
                            chain: Array<X509Certificate>,
                            authType: String
                        ) {
                        }

                        override fun getAcceptedIssuers(): Array<X509Certificate> {
                            return arrayOf()
                        }
                    }

                    // TODO "SSL" or "TLS" as in hooks.processor.ProcessorHelper?
                    val sslContext = SSLContext.getInstance("SSL")
                    sslContext.init(
                        null,
                        arrayOf<TrustManager>(insecureX509TrustManager),
                        SecureRandom()
                    )
                    val insecureSslSocketFactory = sslContext.socketFactory

                    okBuilder.sslSocketFactory(insecureSslSocketFactory, insecureX509TrustManager)
                } catch (e: NoSuchAlgorithmException) {
                    throw IllegalStateException("insecure() SSL configuration failed", e)
                } catch (e: KeyManagementException) {
                    throw IllegalStateException("insecure() SSL configuration failed", e)
                }
            }
            return this
        }

        fun build(): FineractClient {
            // URL
            has<String?>("baseURL", baseURL)?.let { retrofitBuilder.baseUrl(it) }

            // Tenant
            val tenantAuth: ApiKeyAuth =
                ApiKeyAuth("header", "fineract-platform-tenantid", tenant.toString())
            okBuilder.addInterceptor(tenantAuth)

            // BASIC Auth
            val basicAuth: HttpBasicAuth = HttpBasicAuth()
            basicAuth.setCredentials(has("username", username), has("password", password))
            okBuilder.addInterceptor(basicAuth)

            val okHttpClient: OkHttpClient = okBuilder.build()
            retrofitBuilder.client(okHttpClient)

            return FineractClient(okHttpClient, retrofitBuilder.build())
        }

        @Throws(IllegalStateException::class)
        private fun <T> has(propertyName: String, value: T?): T {
            checkNotNull(value) { "Must call $propertyName(...) to create valid Builder" }
            return value
        }
    }

    companion object {
        /**
         * Constant to be used in requests where Fineract's API requires a dateFormat to be given. This matches the format
         * in which LocalDate instances are serialized. (BTW: In a Java client API, it seems weird to have strong LocalDate
         * (not String) instances, and then have to specify its format, see
         * https://issues.apache.org/jira/browse/FINERACT-1233.)
         */
        // Matching org.apache.fineract.client.util.JSON.LocalDateTypeAdapter.formatter
        const val DATE_FORMAT: String = "yyyy-MM-dd"

        fun builder(): Builder {
            return Builder()
        }
    }
}
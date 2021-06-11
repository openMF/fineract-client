

# LoanProduct

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**shortName** | **String** |  |  [optional]
**rates** | [**List&lt;Rate&gt;**](Rate.md) |  |  [optional]
**loanProductRelatedDetail** | [**LoanProductRelatedDetail**](LoanProductRelatedDetail.md) |  |  [optional]
**includeInBorrowerCycle** | **Boolean** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**closeDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**externalId** | **String** |  |  [optional]
**minimumDaysBetweenDisbursalAndFirstRepayment** | **Integer** |  |  [optional]
**productInterestRecalculationDetails** | [**LoanProductInterestRecalculationDetails**](LoanProductInterestRecalculationDetails.md) |  |  [optional]
**loanProductGuaranteeDetails** | [**LoanProductGuaranteeDetails**](LoanProductGuaranteeDetails.md) |  |  [optional]
**principalThresholdForLastInstallment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**installmentAmountInMultiplesOf** | **Integer** |  |  [optional]
**floatingRates** | [**LoanProductFloatingRates**](LoanProductFloatingRates.md) |  |  [optional]
**syncExpectedWithDisbursementDate** | **Boolean** |  |  [optional]
**currency** | [**MonetaryCurrency**](MonetaryCurrency.md) |  |  [optional]
**accountingType** | **Integer** |  |  [optional]
**linkedToFloatingInterestRate** | **Boolean** |  |  [optional]
**equalAmortization** | **Boolean** |  |  [optional]
**interestRecalculationEnabled** | **Boolean** |  |  [optional]
**repaymentStrategy** | [**LoanTransactionProcessingStrategy**](LoanTransactionProcessingStrategy.md) |  |  [optional]
**loanProductCharges** | [**List&lt;Charge&gt;**](Charge.md) |  |  [optional]
**loanProductConfigurableAttributes** | [**LoanProductConfigurableAttributes**](LoanProductConfigurableAttributes.md) |  |  [optional]
**accountingDisabled** | **Boolean** |  |  [optional]
**upfrontAccrualAccountingEnabled** | **Boolean** |  |  [optional]
**periodicAccrualAccountingEnabled** | **Boolean** |  |  [optional]
**principalAmount** | [**Money**](Money.md) |  |  [optional]
**minPrincipalAmount** | [**Money**](Money.md) |  |  [optional]
**maxPrincipalAmount** | [**Money**](Money.md) |  |  [optional]
**minNominalInterestRatePerPeriod** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**maxNominalInterestRatePerPeriod** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**minNumberOfRepayments** | **Integer** |  |  [optional]
**maxNumberOfRepayments** | **Integer** |  |  [optional]
**holdGuaranteeFundsEnabled** | **Boolean** |  |  [optional]
**arrearsBasedOnOriginalSchedule** | **Boolean** |  |  [optional]
**cashBasedAccountingEnabled** | **Boolean** |  |  [optional]
**accrualBasedAccountingEnabled** | **Boolean** |  |  [optional]
**nominalInterestRatePerPeriod** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**interestPeriodFrequencyType** | [**InterestPeriodFrequencyTypeEnum**](#InterestPeriodFrequencyTypeEnum) |  |  [optional]
**numberOfRepayments** | **Integer** |  |  [optional]
**multiDisburseLoan** | **Boolean** |  |  [optional]
**_new** | **Boolean** |  |  [optional]



## Enum: InterestPeriodFrequencyTypeEnum

Name | Value
---- | -----
DAYS | &quot;DAYS&quot;
WEEKS | &quot;WEEKS&quot;
MONTHS | &quot;MONTHS&quot;
YEARS | &quot;YEARS&quot;
WHOLE_TERM | &quot;WHOLE_TERM&quot;
INVALID | &quot;INVALID&quot;




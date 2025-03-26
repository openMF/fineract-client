
# LoanAccountLock

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **error** | **kotlin.String** |  |  [optional] |
| **loanId** | **kotlin.Long** |  |  [optional] |
| **lockOwner** | [**inline**](#LockOwner) |  |  [optional] |
| **lockPlacedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **lockPlacedOnCobBusinessDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **newLockOwner** | [**inline**](#NewLockOwner) |  |  [optional] |
| **stacktrace** | **kotlin.String** |  |  [optional] |
| **version** | **kotlin.Long** |  |  [optional] |


<a id="LockOwner"></a>
## Enum: lockOwner
| Name | Value |
| ---- | ----- |
| lockOwner | LOAN_COB_CHUNK_PROCESSING, LOAN_INLINE_COB_PROCESSING |


<a id="NewLockOwner"></a>
## Enum: newLockOwner
| Name | Value |
| ---- | ----- |
| newLockOwner | LOAN_COB_CHUNK_PROCESSING, LOAN_INLINE_COB_PROCESSING |




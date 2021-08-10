

# PostColumnHeaderData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**type** | **String** | Any of them: Boolean | Date | DateTime | Decimal | Dropdown | Number | String | Text | 
**code** | **String** | Used in Code Value fields. Column name becomes: code_cd_name. Mandatory if using type Dropdown, otherwise an error is returned. |  [optional]
**mandatory** | **Boolean** | Defaults to false |  [optional]
**length** | **Long** | Length of the text field. Mandatory if type String is used, otherwise an error is returned. |  [optional]




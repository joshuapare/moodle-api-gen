# BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | Option<**String**> | the company column to search, expected keys (value format) are:                                 \"id\" (int) matching company id,                                 \"name\" (string) company name (Note: you can use % for searching but it may be considerably slower!),                                 \"shortname\" (string) company short name (Note: you can use % for searching but it may be considerably slower!),                                 \"code\" (string) company code (Note: you can use % for searching but it may be considerably slower!),                                 \"suspended\" (bool) company is suspended or not,                                 \"city\" (string) matching company city,                                 \"country\" (string) matching company country,                                 \"timezone\" (int) company timezone,                                 \"lang\" (string) matching company language setting | [optional][default to null]
**value** | Option<**String**> | the value to search | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



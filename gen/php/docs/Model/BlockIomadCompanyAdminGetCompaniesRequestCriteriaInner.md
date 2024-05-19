# # BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **string** | the company column to search, expected keys (value format) are:                                 \&quot;id\&quot; (int) matching company id,                                 \&quot;name\&quot; (string) company name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;shortname\&quot; (string) company short name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;code\&quot; (string) company code (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;suspended\&quot; (bool) company is suspended or not,                                 \&quot;city\&quot; (string) matching company city,                                 \&quot;country\&quot; (string) matching company country,                                 \&quot;timezone\&quot; (int) company timezone,                                 \&quot;lang\&quot; (string) matching company language setting | [optional] [default to 'null']
**value** | **string** | the value to search | [optional] [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

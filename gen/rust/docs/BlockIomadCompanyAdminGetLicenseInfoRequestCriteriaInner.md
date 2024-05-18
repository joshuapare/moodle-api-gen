# BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | Option<**String**> | the user column to search, expected keys (value format) are:                                 \"id\" (int) matching user id,                                 \"name\" (string) license name (Note: you can use % for searching but it may be considerably slower!),                                 \"startdate\" (int) license start date in unix time,                                 \"expirydate\" (int) license expiry date in unix time,                                 \"companyid\" (int) license company id,                                 \"parentid\"  (int) license parent id for split licenses,                                 \"program\"  (bool) license is program,                                 \"instant\"  (bool) license is instant,                                 \"type\"  (int) license type (0 = standard, 1 = reusable, 3 = educator),                                 \"reference\" license reference (Note: you can use % for searching but it may be considerably slower!) | [optional][default to null]
**value** | Option<**String**> | the value to search | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



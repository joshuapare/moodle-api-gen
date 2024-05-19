# CoreUserGetUsersRequestCriteriaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | Option<**String**> | the user column to search, expected keys (value format) are:                                 \"id\" (int) matching user id,                                 \"lastname\" (string) user last name (Note: you can use % for searching but it may be considerably slower!),                                 \"firstname\" (string) user first name (Note: you can use % for searching but it may be considerably slower!),                                 \"idnumber\" (string) matching user idnumber,                                 \"username\" (string) matching user username,                                 \"email\" (string) user email (Note: you can use % for searching but it may be considerably slower!),                                 \"auth\" (string) matching user auth plugin | [optional][default to null]
**value** | Option<**String**> | the value to search | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



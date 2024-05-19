# # CoreUserGetUsersRequestCriteriaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **string** | the user column to search, expected keys (value format) are:                                 \&quot;id\&quot; (int) matching user id,                                 \&quot;lastname\&quot; (string) user last name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;firstname\&quot; (string) user first name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;idnumber\&quot; (string) matching user idnumber,                                 \&quot;username\&quot; (string) matching user username,                                 \&quot;email\&quot; (string) user email (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;auth\&quot; (string) matching user auth plugin | [optional] [default to 'null']
**value** | **string** | the value to search | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

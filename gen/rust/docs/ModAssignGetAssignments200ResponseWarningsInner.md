# ModAssignGetAssignments200ResponseWarningsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | Option<**String**> | item can be 'course' (errorcode 1 or 2) or 'module' (errorcode 1) | [optional][default to null]
**itemid** | Option<**i32**> | When item is a course then itemid is a course id. When the item is a module then itemid is a module id | [optional][default to null]
**message** | Option<**String**> | untranslated english message to explain the warning | [optional]
**warningcode** | Option<**String**> | errorcode can be 1 (no access rights) or 2 (not enrolled or no permissions) | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



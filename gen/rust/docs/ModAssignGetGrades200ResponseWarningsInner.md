# ModAssignGetGrades200ResponseWarningsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | Option<**String**> | item is always 'assignment' | [optional][default to null]
**itemid** | Option<**i32**> | when errorcode is 3 then itemid is an assignment id. When errorcode is 1, itemid is a course module id | [optional][default to null]
**message** | Option<**String**> | untranslated english message to explain the warning | [optional]
**warningcode** | Option<**String**> | errorcode can be 3 (no grades found) or 1 (no permission to get grades) | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



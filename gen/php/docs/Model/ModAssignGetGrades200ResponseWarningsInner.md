# # ModAssignGetGrades200ResponseWarningsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **string** | item is always &#39;assignment&#39; | [optional] [default to 'null']
**itemid** | **int** | when errorcode is 3 then itemid is an assignment id. When errorcode is 1, itemid is a course module id | [optional] [default to null]
**message** | **string** | untranslated english message to explain the warning | [optional]
**warningcode** | **string** | errorcode can be 3 (no grades found) or 1 (no permission to get grades) | [optional] [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

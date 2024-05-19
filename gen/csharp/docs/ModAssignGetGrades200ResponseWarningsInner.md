# MoodleClient.Model.ModAssignGetGrades200ResponseWarningsInner
warning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Item** | **string** | item is always &#39;assignment&#39; | [optional] [default to "null"]
**Itemid** | **int** | when errorcode is 3 then itemid is an assignment id. When errorcode is 1, itemid is a course module id | [optional] [default to null]
**Message** | **string** | untranslated english message to explain the warning | [optional] 
**Warningcode** | **string** | errorcode can be 3 (no grades found) or 1 (no permission to get grades) | [optional] [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


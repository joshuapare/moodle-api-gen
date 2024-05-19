# MoodleClient.Model.CoreNotesGetNotes200ResponseWarningsInner
warning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Item** | **string** | item is always &#39;note&#39; | [optional] [default to "null"]
**Itemid** | **int** | When errorcode is savedfailed the note could not be modified.When errorcode is badparam, an incorrect parameter was provided.When errorcode is badid, the note does not exist | [optional] [default to null]
**Message** | **string** | untranslated english message to explain the warning | [optional] 
**Warningcode** | **string** | errorcode can be badparam (incorrect parameter), savedfailed (could not be modified), or badid (note does not exist) | [optional] [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


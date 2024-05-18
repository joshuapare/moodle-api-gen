# # CoreNotesGetNotes200ResponseWarningsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **string** | item is always &#39;note&#39; | [optional] [default to 'null']
**itemid** | **int** | When errorcode is savedfailed the note could not be modified.When errorcode is badparam, an incorrect parameter was provided.When errorcode is badid, the note does not exist | [optional] [default to null]
**message** | **string** | untranslated english message to explain the warning | [optional]
**warningcode** | **string** | errorcode can be badparam (incorrect parameter), savedfailed (could not be modified), or badid (note does not exist) | [optional] [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

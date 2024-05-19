# CoreNotesGetNotes200ResponseWarningsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | Option<**String**> | item is always 'note' | [optional][default to null]
**itemid** | Option<**i32**> | When errorcode is savedfailed the note could not be modified.When errorcode is badparam, an incorrect parameter was provided.When errorcode is badid, the note does not exist | [optional][default to null]
**message** | Option<**String**> | untranslated english message to explain the warning | [optional]
**warningcode** | Option<**String**> | errorcode can be badparam (incorrect parameter), savedfailed (could not be modified), or badid (note does not exist) | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



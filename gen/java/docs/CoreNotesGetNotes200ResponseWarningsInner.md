

# CoreNotesGetNotes200ResponseWarningsInner

warning

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**item** | **String** | item is always &#39;note&#39; |  [optional] |
|**itemid** | **Integer** | When errorcode is savedfailed the note could not be modified.When errorcode is badparam, an incorrect parameter was provided.When errorcode is badid, the note does not exist |  [optional] |
|**message** | **String** | untranslated english message to explain the warning |  [optional] |
|**warningcode** | **String** | errorcode can be badparam (incorrect parameter), savedfailed (could not be modified), or badid (note does not exist) |  [optional] |




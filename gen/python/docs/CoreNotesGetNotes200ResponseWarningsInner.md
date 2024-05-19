# CoreNotesGetNotes200ResponseWarningsInner

warning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **str** | item is always &#39;note&#39; | [optional] [default to 'null']
**itemid** | **int** | When errorcode is savedfailed the note could not be modified.When errorcode is badparam, an incorrect parameter was provided.When errorcode is badid, the note does not exist | [optional] [default to null]
**message** | **str** | untranslated english message to explain the warning | [optional] 
**warningcode** | **str** | errorcode can be badparam (incorrect parameter), savedfailed (could not be modified), or badid (note does not exist) | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_notes_get_notes200_response_warnings_inner import CoreNotesGetNotes200ResponseWarningsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreNotesGetNotes200ResponseWarningsInner from a JSON string
core_notes_get_notes200_response_warnings_inner_instance = CoreNotesGetNotes200ResponseWarningsInner.from_json(json)
# print the JSON string representation of the object
print(CoreNotesGetNotes200ResponseWarningsInner.to_json())

# convert the object into a dict
core_notes_get_notes200_response_warnings_inner_dict = core_notes_get_notes200_response_warnings_inner_instance.to_dict()
# create an instance of CoreNotesGetNotes200ResponseWarningsInner from a dict
core_notes_get_notes200_response_warnings_inner_from_dict = CoreNotesGetNotes200ResponseWarningsInner.from_dict(core_notes_get_notes200_response_warnings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



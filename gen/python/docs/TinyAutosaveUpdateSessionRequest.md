# TinyAutosaveUpdateSessionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The context id that owns the editor | 
**drafttext** | **str** | The draft text | 
**elementid** | **str** | The ID of the element | 
**pagehash** | **str** | The page hash | 
**pageinstance** | **str** | The page instance | 

## Example

```python
from openapi_client.models.tiny_autosave_update_session_request import TinyAutosaveUpdateSessionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TinyAutosaveUpdateSessionRequest from a JSON string
tiny_autosave_update_session_request_instance = TinyAutosaveUpdateSessionRequest.from_json(json)
# print the JSON string representation of the object
print(TinyAutosaveUpdateSessionRequest.to_json())

# convert the object into a dict
tiny_autosave_update_session_request_dict = tiny_autosave_update_session_request_instance.to_dict()
# create an instance of TinyAutosaveUpdateSessionRequest from a dict
tiny_autosave_update_session_request_from_dict = TinyAutosaveUpdateSessionRequest.from_dict(tiny_autosave_update_session_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# TinyAutosaveResetSessionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The context id that owns the editor | [default to null]
**elementid** | **str** | The ID of the element | [default to 'null']
**pagehash** | **str** | The page hash | [default to 'null']
**pageinstance** | **str** | The page instance | [default to 'null']

## Example

```python
from openapi_client.models.tiny_autosave_reset_session_request import TinyAutosaveResetSessionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TinyAutosaveResetSessionRequest from a JSON string
tiny_autosave_reset_session_request_instance = TinyAutosaveResetSessionRequest.from_json(json)
# print the JSON string representation of the object
print(TinyAutosaveResetSessionRequest.to_json())

# convert the object into a dict
tiny_autosave_reset_session_request_dict = tiny_autosave_reset_session_request_instance.to_dict()
# create an instance of TinyAutosaveResetSessionRequest from a dict
tiny_autosave_reset_session_request_from_dict = TinyAutosaveResetSessionRequest.from_dict(tiny_autosave_reset_session_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



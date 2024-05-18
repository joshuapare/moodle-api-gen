# TinyAutosaveResumeSessionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contextid** | **int** | The context id that owns the editor | 
**draftid** | **int** | The new draft item id to resume files to | [default to null]
**elementid** | **str** | The ID of the element | 
**pagehash** | **str** | The page hash | 
**pageinstance** | **str** | The page instance | 

## Example

```python
from openapi_client.models.tiny_autosave_resume_session_request import TinyAutosaveResumeSessionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TinyAutosaveResumeSessionRequest from a JSON string
tiny_autosave_resume_session_request_instance = TinyAutosaveResumeSessionRequest.from_json(json)
# print the JSON string representation of the object
print(TinyAutosaveResumeSessionRequest.to_json())

# convert the object into a dict
tiny_autosave_resume_session_request_dict = tiny_autosave_resume_session_request_instance.to_dict()
# create an instance of TinyAutosaveResumeSessionRequest from a dict
tiny_autosave_resume_session_request_from_dict = TinyAutosaveResumeSessionRequest.from_dict(tiny_autosave_resume_session_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



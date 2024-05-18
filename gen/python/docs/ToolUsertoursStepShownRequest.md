# ToolUsertoursStepShownRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | **int** | Context ID | 
**pageurl** | **str** | Page URL | 
**stepid** | **int** | Step ID | 
**stepindex** | **int** | Step Number | 
**tourid** | **int** | Tour ID | 

## Example

```python
from openapi_client.models.tool_usertours_step_shown_request import ToolUsertoursStepShownRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolUsertoursStepShownRequest from a JSON string
tool_usertours_step_shown_request_instance = ToolUsertoursStepShownRequest.from_json(json)
# print the JSON string representation of the object
print(ToolUsertoursStepShownRequest.to_json())

# convert the object into a dict
tool_usertours_step_shown_request_dict = tool_usertours_step_shown_request_instance.to_dict()
# create an instance of ToolUsertoursStepShownRequest from a dict
tool_usertours_step_shown_request_from_dict = ToolUsertoursStepShownRequest.from_dict(tool_usertours_step_shown_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



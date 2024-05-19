# ToolUsertoursResetTourRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | **int** | Context ID | 
**pageurl** | **str** | Current page location | [default to 'null']
**tourid** | **int** | Tour ID | 

## Example

```python
from openapi_client.models.tool_usertours_reset_tour_request import ToolUsertoursResetTourRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolUsertoursResetTourRequest from a JSON string
tool_usertours_reset_tour_request_instance = ToolUsertoursResetTourRequest.from_json(json)
# print the JSON string representation of the object
print(ToolUsertoursResetTourRequest.to_json())

# convert the object into a dict
tool_usertours_reset_tour_request_dict = tool_usertours_reset_tour_request_instance.to_dict()
# create an instance of ToolUsertoursResetTourRequest from a dict
tool_usertours_reset_tour_request_from_dict = ToolUsertoursResetTourRequest.from_dict(tool_usertours_reset_tour_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ToolUsertoursCompleteTourRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | **int** | Context ID | 
**pageurl** | **str** | Page URL | [default to 'null']
**stepid** | **int** | Step ID | [default to null]
**stepindex** | **int** | Step Number | [default to null]
**tourid** | **int** | Tour ID | [default to null]

## Example

```python
from openapi_client.models.tool_usertours_complete_tour_request import ToolUsertoursCompleteTourRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolUsertoursCompleteTourRequest from a JSON string
tool_usertours_complete_tour_request_instance = ToolUsertoursCompleteTourRequest.from_json(json)
# print the JSON string representation of the object
print(ToolUsertoursCompleteTourRequest.to_json())

# convert the object into a dict
tool_usertours_complete_tour_request_dict = tool_usertours_complete_tour_request_instance.to_dict()
# create an instance of ToolUsertoursCompleteTourRequest from a dict
tool_usertours_complete_tour_request_from_dict = ToolUsertoursCompleteTourRequest.from_dict(tool_usertours_complete_tour_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



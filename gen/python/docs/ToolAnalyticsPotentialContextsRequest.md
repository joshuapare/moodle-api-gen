# ToolAnalyticsPotentialContextsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelid** | **int** | The model id | [optional] [default to null]
**query** | **str** | The model id | [optional] [default to 'null']

## Example

```python
from openapi_client.models.tool_analytics_potential_contexts_request import ToolAnalyticsPotentialContextsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolAnalyticsPotentialContextsRequest from a JSON string
tool_analytics_potential_contexts_request_instance = ToolAnalyticsPotentialContextsRequest.from_json(json)
# print the JSON string representation of the object
print(ToolAnalyticsPotentialContextsRequest.to_json())

# convert the object into a dict
tool_analytics_potential_contexts_request_dict = tool_analytics_potential_contexts_request_instance.to_dict()
# create an instance of ToolAnalyticsPotentialContextsRequest from a dict
tool_analytics_potential_contexts_request_from_dict = ToolAnalyticsPotentialContextsRequest.from_dict(tool_analytics_potential_contexts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



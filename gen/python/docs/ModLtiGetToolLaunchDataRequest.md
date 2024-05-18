# ModLtiGetToolLaunchDataRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toolid** | **int** | external tool instance id | [default to null]

## Example

```python
from openapi_client.models.mod_lti_get_tool_launch_data_request import ModLtiGetToolLaunchDataRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiGetToolLaunchDataRequest from a JSON string
mod_lti_get_tool_launch_data_request_instance = ModLtiGetToolLaunchDataRequest.from_json(json)
# print the JSON string representation of the object
print(ModLtiGetToolLaunchDataRequest.to_json())

# convert the object into a dict
mod_lti_get_tool_launch_data_request_dict = mod_lti_get_tool_launch_data_request_instance.to_dict()
# create an instance of ModLtiGetToolLaunchDataRequest from a dict
mod_lti_get_tool_launch_data_request_from_dict = ModLtiGetToolLaunchDataRequest.from_dict(mod_lti_get_tool_launch_data_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



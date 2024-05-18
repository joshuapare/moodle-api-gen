# ModLtiGetToolLaunchData200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoint** | **str** | Endpoint URL | [default to 'null']
**parameters** | [**List[ModLtiGetToolLaunchData200ResponseParametersInner]**](ModLtiGetToolLaunchData200ResponseParametersInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_lti_get_tool_launch_data200_response import ModLtiGetToolLaunchData200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiGetToolLaunchData200Response from a JSON string
mod_lti_get_tool_launch_data200_response_instance = ModLtiGetToolLaunchData200Response.from_json(json)
# print the JSON string representation of the object
print(ModLtiGetToolLaunchData200Response.to_json())

# convert the object into a dict
mod_lti_get_tool_launch_data200_response_dict = mod_lti_get_tool_launch_data200_response_instance.to_dict()
# create an instance of ModLtiGetToolLaunchData200Response from a dict
mod_lti_get_tool_launch_data200_response_from_dict = ModLtiGetToolLaunchData200Response.from_dict(mod_lti_get_tool_launch_data200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



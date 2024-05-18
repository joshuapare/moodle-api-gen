# ModLtiDeleteToolProxy200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilityoffered** | **str** | Tool proxy capabilities offered | 
**guid** | **str** | Tool proxy globally unique identifier | 
**id** | **int** | Tool proxy id | 
**name** | **str** | Tool proxy name | 
**regurl** | **str** | Tool proxy registration URL | 
**secret** | **str** | Tool proxy shared secret | 
**serviceoffered** | **str** | Tool proxy services offered | 
**state** | **int** | Tool proxy state | 
**timecreated** | **int** | Tool proxy time created | 
**timemodified** | **int** | Tool proxy modified | 
**toolproxy** | **str** | Tool proxy | 
**vendorcode** | **str** | Tool proxy consumer code | 

## Example

```python
from openapi_client.models.mod_lti_delete_tool_proxy200_response import ModLtiDeleteToolProxy200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiDeleteToolProxy200Response from a JSON string
mod_lti_delete_tool_proxy200_response_instance = ModLtiDeleteToolProxy200Response.from_json(json)
# print the JSON string representation of the object
print(ModLtiDeleteToolProxy200Response.to_json())

# convert the object into a dict
mod_lti_delete_tool_proxy200_response_dict = mod_lti_delete_tool_proxy200_response_instance.to_dict()
# create an instance of ModLtiDeleteToolProxy200Response from a dict
mod_lti_delete_tool_proxy200_response_from_dict = ModLtiDeleteToolProxy200Response.from_dict(mod_lti_delete_tool_proxy200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



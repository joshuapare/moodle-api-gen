# ModLtiUpdateToolType200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilitygroups** | **List[object]** |  | [optional] 
**clientid** | **str** | Client ID | 
**courseid** | **int** | Tool type course | [optional] [default to 0]
**deploymentid** | **int** | Deployment ID | 
**description** | **str** | Tool type description | 
**hascapabilitygroups** | **bool** | Indicate if capabilitygroups is populated | 
**id** | **int** | Tool type id | 
**instancecount** | **int** | The number of times this tool is being used | 
**instanceids** | **List[object]** |  | [optional] 
**name** | **str** | Tool type name | 
**platformid** | **str** | Platform ID | 
**state** | [**ModLtiGetToolTypesAndProxies200ResponseTypesInnerState**](ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.md) |  | 
**urls** | [**ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls**](ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.md) |  | 

## Example

```python
from openapi_client.models.mod_lti_update_tool_type200_response import ModLtiUpdateToolType200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiUpdateToolType200Response from a JSON string
mod_lti_update_tool_type200_response_instance = ModLtiUpdateToolType200Response.from_json(json)
# print the JSON string representation of the object
print(ModLtiUpdateToolType200Response.to_json())

# convert the object into a dict
mod_lti_update_tool_type200_response_dict = mod_lti_update_tool_type200_response_instance.to_dict()
# create an instance of ModLtiUpdateToolType200Response from a dict
mod_lti_update_tool_type200_response_from_dict = ModLtiUpdateToolType200Response.from_dict(mod_lti_update_tool_type200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



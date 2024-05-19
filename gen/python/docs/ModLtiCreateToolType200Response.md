# ModLtiCreateToolType200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilitygroups** | **List[object]** |  | [optional] 
**clientid** | **str** | Client ID | [default to 'null']
**courseid** | **int** | Tool type course | [optional] [default to 0]
**deploymentid** | **int** | Deployment ID | [default to null]
**description** | **str** | Tool type description | [default to 'null']
**hascapabilitygroups** | **bool** | Indicate if capabilitygroups is populated | [default to False]
**id** | **int** | Tool type id | [default to null]
**instancecount** | **int** | The number of times this tool is being used | [default to null]
**instanceids** | **List[object]** |  | [optional] 
**name** | **str** | Tool type name | [default to 'null']
**platformid** | **str** | Platform ID | [default to 'null']
**state** | [**ModLtiCreateToolType200ResponseState**](ModLtiCreateToolType200ResponseState.md) |  | 
**urls** | [**ModLtiCreateToolType200ResponseUrls**](ModLtiCreateToolType200ResponseUrls.md) |  | 

## Example

```python
from openapi_client.models.mod_lti_create_tool_type200_response import ModLtiCreateToolType200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiCreateToolType200Response from a JSON string
mod_lti_create_tool_type200_response_instance = ModLtiCreateToolType200Response.from_json(json)
# print the JSON string representation of the object
print(ModLtiCreateToolType200Response.to_json())

# convert the object into a dict
mod_lti_create_tool_type200_response_dict = mod_lti_create_tool_type200_response_instance.to_dict()
# create an instance of ModLtiCreateToolType200Response from a dict
mod_lti_create_tool_type200_response_from_dict = ModLtiCreateToolType200Response.from_dict(mod_lti_create_tool_type200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



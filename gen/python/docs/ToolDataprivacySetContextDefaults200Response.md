# ToolDataprivacySetContextDefaults200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **bool** | Whether the context defaults were successfully set or not | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_dataprivacy_set_context_defaults200_response import ToolDataprivacySetContextDefaults200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacySetContextDefaults200Response from a JSON string
tool_dataprivacy_set_context_defaults200_response_instance = ToolDataprivacySetContextDefaults200Response.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacySetContextDefaults200Response.to_json())

# convert the object into a dict
tool_dataprivacy_set_context_defaults200_response_dict = tool_dataprivacy_set_context_defaults200_response_instance.to_dict()
# create an instance of ToolDataprivacySetContextDefaults200Response from a dict
tool_dataprivacy_set_context_defaults200_response_from_dict = ToolDataprivacySetContextDefaults200Response.from_dict(tool_dataprivacy_set_context_defaults200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



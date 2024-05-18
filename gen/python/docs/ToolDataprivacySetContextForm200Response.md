# ToolDataprivacySetContextForm200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **bool** | Whether the data was properly set or not | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_dataprivacy_set_context_form200_response import ToolDataprivacySetContextForm200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacySetContextForm200Response from a JSON string
tool_dataprivacy_set_context_form200_response_instance = ToolDataprivacySetContextForm200Response.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacySetContextForm200Response.to_json())

# convert the object into a dict
tool_dataprivacy_set_context_form200_response_dict = tool_dataprivacy_set_context_form200_response_instance.to_dict()
# create an instance of ToolDataprivacySetContextForm200Response from a dict
tool_dataprivacy_set_context_form200_response_from_dict = ToolDataprivacySetContextForm200Response.from_dict(tool_dataprivacy_set_context_form200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


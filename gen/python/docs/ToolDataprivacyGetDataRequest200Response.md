# ToolDataprivacyGetDataRequest200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**ToolDataprivacyGetDataRequest200ResponseResult**](ToolDataprivacyGetDataRequest200ResponseResult.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.tool_dataprivacy_get_data_request200_response import ToolDataprivacyGetDataRequest200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacyGetDataRequest200Response from a JSON string
tool_dataprivacy_get_data_request200_response_instance = ToolDataprivacyGetDataRequest200Response.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacyGetDataRequest200Response.to_json())

# convert the object into a dict
tool_dataprivacy_get_data_request200_response_dict = tool_dataprivacy_get_data_request200_response_instance.to_dict()
# create an instance of ToolDataprivacyGetDataRequest200Response from a dict
tool_dataprivacy_get_data_request200_response_from_dict = ToolDataprivacyGetDataRequest200Response.from_dict(tool_dataprivacy_get_data_request200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ToolMobileGetContent200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disabled** | **bool** | Whether we consider this disabled or not. | [optional] [default to False]
**files** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | 
**javascript** | **str** | JavaScript code. | [default to 'null']
**otherdata** | [**List[ToolMobileGetContent200ResponseOtherdataInner]**](ToolMobileGetContent200ResponseOtherdataInner.md) |  | 
**restrict** | [**ToolMobileGetContent200ResponseRestrict**](ToolMobileGetContent200ResponseRestrict.md) |  | 
**templates** | [**List[ToolMobileGetContent200ResponseTemplatesInner]**](ToolMobileGetContent200ResponseTemplatesInner.md) |  | 

## Example

```python
from openapi_client.models.tool_mobile_get_content200_response import ToolMobileGetContent200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolMobileGetContent200Response from a JSON string
tool_mobile_get_content200_response_instance = ToolMobileGetContent200Response.from_json(json)
# print the JSON string representation of the object
print(ToolMobileGetContent200Response.to_json())

# convert the object into a dict
tool_mobile_get_content200_response_dict = tool_mobile_get_content200_response_instance.to_dict()
# create an instance of ToolMobileGetContent200Response from a dict
tool_mobile_get_content200_response_from_dict = ToolMobileGetContent200Response.from_dict(tool_mobile_get_content200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



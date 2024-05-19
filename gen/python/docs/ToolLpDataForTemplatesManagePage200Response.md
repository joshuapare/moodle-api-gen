# ToolLpDataForTemplatesManagePage200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmanage** | **bool** | Whether the user manage the templates | [default to False]
**navigation** | **List[object]** |  | 
**pagecontextid** | **int** | The page context id | 
**pluginbaseurl** | **str** | Url to the tool_lp plugin folder on this Moodle site | 
**templates** | [**List[ToolLpDataForTemplatesManagePage200ResponseTemplatesInner]**](ToolLpDataForTemplatesManagePage200ResponseTemplatesInner.md) |  | 

## Example

```python
from openapi_client.models.tool_lp_data_for_templates_manage_page200_response import ToolLpDataForTemplatesManagePage200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpDataForTemplatesManagePage200Response from a JSON string
tool_lp_data_for_templates_manage_page200_response_instance = ToolLpDataForTemplatesManagePage200Response.from_json(json)
# print the JSON string representation of the object
print(ToolLpDataForTemplatesManagePage200Response.to_json())

# convert the object into a dict
tool_lp_data_for_templates_manage_page200_response_dict = tool_lp_data_for_templates_manage_page200_response_instance.to_dict()
# create an instance of ToolLpDataForTemplatesManagePage200Response from a dict
tool_lp_data_for_templates_manage_page200_response_from_dict = ToolLpDataForTemplatesManagePage200Response.from_dict(tool_lp_data_for_templates_manage_page200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



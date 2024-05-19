# ToolTemplatelibraryListTemplatesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | The component to search | [optional] [default to '']
**search** | **str** | The search string | [optional] [default to '']
**themename** | **str** | The current theme | [optional] [default to '']

## Example

```python
from openapi_client.models.tool_templatelibrary_list_templates_request import ToolTemplatelibraryListTemplatesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolTemplatelibraryListTemplatesRequest from a JSON string
tool_templatelibrary_list_templates_request_instance = ToolTemplatelibraryListTemplatesRequest.from_json(json)
# print the JSON string representation of the object
print(ToolTemplatelibraryListTemplatesRequest.to_json())

# convert the object into a dict
tool_templatelibrary_list_templates_request_dict = tool_templatelibrary_list_templates_request_instance.to_dict()
# create an instance of ToolTemplatelibraryListTemplatesRequest from a dict
tool_templatelibrary_list_templates_request_from_dict = ToolTemplatelibraryListTemplatesRequest.from_dict(tool_templatelibrary_list_templates_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



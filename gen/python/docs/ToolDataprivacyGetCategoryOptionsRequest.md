# ToolDataprivacyGetCategoryOptionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includeinherit** | **bool** | Include option \&quot;Inherit\&quot; | [optional] [default to True]
**includenotset** | **bool** | Include option \&quot;Not set\&quot; | [optional] [default to False]

## Example

```python
from openapi_client.models.tool_dataprivacy_get_category_options_request import ToolDataprivacyGetCategoryOptionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacyGetCategoryOptionsRequest from a JSON string
tool_dataprivacy_get_category_options_request_instance = ToolDataprivacyGetCategoryOptionsRequest.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacyGetCategoryOptionsRequest.to_json())

# convert the object into a dict
tool_dataprivacy_get_category_options_request_dict = tool_dataprivacy_get_category_options_request_instance.to_dict()
# create an instance of ToolDataprivacyGetCategoryOptionsRequest from a dict
tool_dataprivacy_get_category_options_request_from_dict = ToolDataprivacyGetCategoryOptionsRequest.from_dict(tool_dataprivacy_get_category_options_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



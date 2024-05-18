# ToolDataprivacyCreateCategoryFormRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jsonformdata** | **str** | The data to create the category, encoded as a json array | [default to 'null']

## Example

```python
from openapi_client.models.tool_dataprivacy_create_category_form_request import ToolDataprivacyCreateCategoryFormRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacyCreateCategoryFormRequest from a JSON string
tool_dataprivacy_create_category_form_request_instance = ToolDataprivacyCreateCategoryFormRequest.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacyCreateCategoryFormRequest.to_json())

# convert the object into a dict
tool_dataprivacy_create_category_form_request_dict = tool_dataprivacy_create_category_form_request_instance.to_dict()
# create an instance of ToolDataprivacyCreateCategoryFormRequest from a dict
tool_dataprivacy_create_category_form_request_from_dict = ToolDataprivacyCreateCategoryFormRequest.from_dict(tool_dataprivacy_create_category_form_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ToolDataprivacyCreateCategoryForm200ResponseCategory


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | The category description. | [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**id** | **int** | id | [default to 0]
**name** | **str** | The category name. | [default to 'null']
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.tool_dataprivacy_create_category_form200_response_category import ToolDataprivacyCreateCategoryForm200ResponseCategory

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacyCreateCategoryForm200ResponseCategory from a JSON string
tool_dataprivacy_create_category_form200_response_category_instance = ToolDataprivacyCreateCategoryForm200ResponseCategory.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacyCreateCategoryForm200ResponseCategory.to_json())

# convert the object into a dict
tool_dataprivacy_create_category_form200_response_category_dict = tool_dataprivacy_create_category_form200_response_category_instance.to_dict()
# create an instance of ToolDataprivacyCreateCategoryForm200ResponseCategory from a dict
tool_dataprivacy_create_category_form200_response_category_from_dict = ToolDataprivacyCreateCategoryForm200ResponseCategory.from_dict(tool_dataprivacy_create_category_form200_response_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ModGlossaryGetCategories200ResponseCategoriesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**glossaryid** | **int** | The glossary ID | [optional] 
**id** | **int** | The category ID | [optional] [default to null]
**name** | **str** | The name of the category | [optional] [default to 'null']
**usedynalink** | **bool** | Whether the category is automatically linked | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_glossary_get_categories200_response_categories_inner import ModGlossaryGetCategories200ResponseCategoriesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetCategories200ResponseCategoriesInner from a JSON string
mod_glossary_get_categories200_response_categories_inner_instance = ModGlossaryGetCategories200ResponseCategoriesInner.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetCategories200ResponseCategoriesInner.to_json())

# convert the object into a dict
mod_glossary_get_categories200_response_categories_inner_dict = mod_glossary_get_categories200_response_categories_inner_instance.to_dict()
# create an instance of ModGlossaryGetCategories200ResponseCategoriesInner from a dict
mod_glossary_get_categories200_response_categories_inner_from_dict = ModGlossaryGetCategories200ResponseCategoriesInner.from_dict(mod_glossary_get_categories200_response_categories_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



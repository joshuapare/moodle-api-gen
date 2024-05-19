# CoreCustomfieldReloadTemplate200ResponseCategoriesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addfieldmenu** | **str** | addfieldmenu | [optional] [default to 'null']
**fields** | [**List[CoreCustomfieldReloadTemplate200ResponseCategoriesInnerFieldsInner]**](CoreCustomfieldReloadTemplate200ResponseCategoriesInnerFieldsInner.md) |  | [optional] 
**id** | **int** | id | [optional] 
**nameeditable** | **str** | inplace editable name | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_customfield_reload_template200_response_categories_inner import CoreCustomfieldReloadTemplate200ResponseCategoriesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCustomfieldReloadTemplate200ResponseCategoriesInner from a JSON string
core_customfield_reload_template200_response_categories_inner_instance = CoreCustomfieldReloadTemplate200ResponseCategoriesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCustomfieldReloadTemplate200ResponseCategoriesInner.to_json())

# convert the object into a dict
core_customfield_reload_template200_response_categories_inner_dict = core_customfield_reload_template200_response_categories_inner_instance.to_dict()
# create an instance of CoreCustomfieldReloadTemplate200ResponseCategoriesInner from a dict
core_customfield_reload_template200_response_categories_inner_from_dict = CoreCustomfieldReloadTemplate200ResponseCategoriesInner.from_dict(core_customfield_reload_template200_response_categories_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



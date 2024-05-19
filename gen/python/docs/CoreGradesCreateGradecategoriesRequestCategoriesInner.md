# CoreGradesCreateGradecategoriesRequestCategoriesInner

Category to create

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fullname** | **str** | fullname of category | [optional] [default to 'null']
**options** | [**CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions**](CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_grades_create_gradecategories_request_categories_inner import CoreGradesCreateGradecategoriesRequestCategoriesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesCreateGradecategoriesRequestCategoriesInner from a JSON string
core_grades_create_gradecategories_request_categories_inner_instance = CoreGradesCreateGradecategoriesRequestCategoriesInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradesCreateGradecategoriesRequestCategoriesInner.to_json())

# convert the object into a dict
core_grades_create_gradecategories_request_categories_inner_dict = core_grades_create_gradecategories_request_categories_inner_instance.to_dict()
# create an instance of CoreGradesCreateGradecategoriesRequestCategoriesInner from a dict
core_grades_create_gradecategories_request_categories_inner_from_dict = CoreGradesCreateGradecategoriesRequestCategoriesInner.from_dict(core_grades_create_gradecategories_request_categories_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



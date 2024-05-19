# CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregateonlygraded** | **bool** | exclude empty grades | [optional] [default to False]
**aggregateoutcomes** | **bool** | aggregate outcomes | [optional] [default to False]
**aggregation** | **int** | aggregation method | [optional] [default to null]
**aggregationcoef2** | **str** | weight coefficient | [optional] [default to 'null']
**decimals** | **int** | the decimal count | [optional] [default to null]
**display** | **int** | the display type | [optional] [default to null]
**droplow** | **int** | drop low grades | [optional] [default to null]
**grademax** | **int** | the grade max | [optional] [default to null]
**grademin** | **int** | the grade min | [optional] [default to null]
**gradepass** | **int** | the grade to pass | [optional] [default to null]
**gradetype** | **int** | the grade type | [optional] [default to null]
**hiddenuntil** | **int** | grades hidden until | [optional] [default to null]
**idnumber** | **str** | the category idnumber | [optional] [default to 'null']
**iteminfo** | **str** | the category iteminfo | [optional] [default to 'null']
**itemname** | **str** | the category total name | [optional] [default to 'null']
**locktime** | **int** | lock grades after | [optional] [default to null]
**parentcategoryid** | **int** | The parent category id | [optional] [default to null]
**parentcategoryidnumber** | **str** | the parent category idnumber | [optional] [default to 'null']
**weightoverride** | **bool** | weight adjusted | [optional] [default to False]

## Example

```python
from openapi_client.models.core_grades_create_gradecategories_request_categories_inner_options import CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions from a JSON string
core_grades_create_gradecategories_request_categories_inner_options_instance = CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions.from_json(json)
# print the JSON string representation of the object
print(CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions.to_json())

# convert the object into a dict
core_grades_create_gradecategories_request_categories_inner_options_dict = core_grades_create_gradecategories_request_categories_inner_options_instance.to_dict()
# create an instance of CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions from a dict
core_grades_create_gradecategories_request_categories_inner_options_from_dict = CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions.from_dict(core_grades_create_gradecategories_request_categories_inner_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreCourseUpdateCategoriesRequestCategoriesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | category description | [optional] [default to 'null']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**id** | **int** | course id | [optional] 
**idnumber** | **str** | category id number | [optional] [default to 'null']
**name** | **str** | category name | [optional] 
**parent** | **int** | parent category id | [optional] [default to null]
**theme** | **str** | the category theme. This option must be enabled on moodle | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_course_update_categories_request_categories_inner import CoreCourseUpdateCategoriesRequestCategoriesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseUpdateCategoriesRequestCategoriesInner from a JSON string
core_course_update_categories_request_categories_inner_instance = CoreCourseUpdateCategoriesRequestCategoriesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseUpdateCategoriesRequestCategoriesInner.to_json())

# convert the object into a dict
core_course_update_categories_request_categories_inner_dict = core_course_update_categories_request_categories_inner_instance.to_dict()
# create an instance of CoreCourseUpdateCategoriesRequestCategoriesInner from a dict
core_course_update_categories_request_categories_inner_from_dict = CoreCourseUpdateCategoriesRequestCategoriesInner.from_dict(core_course_update_categories_request_categories_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



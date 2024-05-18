# CoreCourseCreateCategoriesRequestCategoriesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | the new category description | [optional] [default to 'null']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**idnumber** | **str** | the new category idnumber | [optional] [default to 'null']
**name** | **str** | new category name | [optional] [default to 'null']
**parent** | **int** | the parent category id inside which the new category will be created                                          - set to 0 for a root category | [optional] [default to 0]
**theme** | **str** | the new category theme. This option must be enabled on moodle | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_course_create_categories_request_categories_inner import CoreCourseCreateCategoriesRequestCategoriesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseCreateCategoriesRequestCategoriesInner from a JSON string
core_course_create_categories_request_categories_inner_instance = CoreCourseCreateCategoriesRequestCategoriesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseCreateCategoriesRequestCategoriesInner.to_json())

# convert the object into a dict
core_course_create_categories_request_categories_inner_dict = core_course_create_categories_request_categories_inner_instance.to_dict()
# create an instance of CoreCourseCreateCategoriesRequestCategoriesInner from a dict
core_course_create_categories_request_categories_inner_from_dict = CoreCourseCreateCategoriesRequestCategoriesInner.from_dict(core_course_create_categories_request_categories_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreCourseDeleteCategoriesRequestCategoriesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | category id to delete | [optional] [default to null]
**newparent** | **int** | the parent category to move the contents to, if specified | [optional] [default to null]
**recursive** | **bool** | 1: recursively delete all contents inside this                                 category, 0 (default): move contents to newparent or current parent category (except if parent is root) | [optional] [default to False]

## Example

```python
from openapi_client.models.core_course_delete_categories_request_categories_inner import CoreCourseDeleteCategoriesRequestCategoriesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseDeleteCategoriesRequestCategoriesInner from a JSON string
core_course_delete_categories_request_categories_inner_instance = CoreCourseDeleteCategoriesRequestCategoriesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseDeleteCategoriesRequestCategoriesInner.to_json())

# convert the object into a dict
core_course_delete_categories_request_categories_inner_dict = core_course_delete_categories_request_categories_inner_instance.to_dict()
# create an instance of CoreCourseDeleteCategoriesRequestCategoriesInner from a dict
core_course_delete_categories_request_categories_inner_from_dict = CoreCourseDeleteCategoriesRequestCategoriesInner.from_dict(core_course_delete_categories_request_categories_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreCourseGetCategoriesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addsubcategories** | **bool** | return the sub categories infos                                           (1 - default) otherwise only the category info (0) | [optional] [default to False]
**criteria** | [**List[CoreCourseGetCategoriesRequestCriteriaInner]**](CoreCourseGetCategoriesRequestCriteriaInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_course_get_categories_request import CoreCourseGetCategoriesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCategoriesRequest from a JSON string
core_course_get_categories_request_instance = CoreCourseGetCategoriesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCategoriesRequest.to_json())

# convert the object into a dict
core_course_get_categories_request_dict = core_course_get_categories_request_instance.to_dict()
# create an instance of CoreCourseGetCategoriesRequest from a dict
core_course_get_categories_request_from_dict = CoreCourseGetCategoriesRequest.from_dict(core_course_get_categories_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreCourseDeleteCategoriesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categories** | [**List[CoreCourseDeleteCategoriesRequestCategoriesInner]**](CoreCourseDeleteCategoriesRequestCategoriesInner.md) |  | 

## Example

```python
from openapi_client.models.core_course_delete_categories_request import CoreCourseDeleteCategoriesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseDeleteCategoriesRequest from a JSON string
core_course_delete_categories_request_instance = CoreCourseDeleteCategoriesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseDeleteCategoriesRequest.to_json())

# convert the object into a dict
core_course_delete_categories_request_dict = core_course_delete_categories_request_instance.to_dict()
# create an instance of CoreCourseDeleteCategoriesRequest from a dict
core_course_delete_categories_request_from_dict = CoreCourseDeleteCategoriesRequest.from_dict(core_course_delete_categories_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



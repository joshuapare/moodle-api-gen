# CoreCourseCreateCategoriesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categories** | [**List[CoreCourseCreateCategoriesRequestCategoriesInner]**](CoreCourseCreateCategoriesRequestCategoriesInner.md) |  | 

## Example

```python
from openapi_client.models.core_course_create_categories_request import CoreCourseCreateCategoriesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseCreateCategoriesRequest from a JSON string
core_course_create_categories_request_instance = CoreCourseCreateCategoriesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseCreateCategoriesRequest.to_json())

# convert the object into a dict
core_course_create_categories_request_dict = core_course_create_categories_request_instance.to_dict()
# create an instance of CoreCourseCreateCategoriesRequest from a dict
core_course_create_categories_request_from_dict = CoreCourseCreateCategoriesRequest.from_dict(core_course_create_categories_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



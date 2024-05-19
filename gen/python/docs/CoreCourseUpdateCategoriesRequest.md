# CoreCourseUpdateCategoriesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categories** | [**List[CoreCourseUpdateCategoriesRequestCategoriesInner]**](CoreCourseUpdateCategoriesRequestCategoriesInner.md) |  | 

## Example

```python
from openapi_client.models.core_course_update_categories_request import CoreCourseUpdateCategoriesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseUpdateCategoriesRequest from a JSON string
core_course_update_categories_request_instance = CoreCourseUpdateCategoriesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseUpdateCategoriesRequest.to_json())

# convert the object into a dict
core_course_update_categories_request_dict = core_course_update_categories_request_instance.to_dict()
# create an instance of CoreCourseUpdateCategoriesRequest from a dict
core_course_update_categories_request_from_dict = CoreCourseUpdateCategoriesRequest.from_dict(core_course_update_categories_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



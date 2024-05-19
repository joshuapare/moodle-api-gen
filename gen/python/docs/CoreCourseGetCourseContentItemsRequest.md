# CoreCourseGetCourseContentItemsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | ID of the course | 

## Example

```python
from openapi_client.models.core_course_get_course_content_items_request import CoreCourseGetCourseContentItemsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCourseContentItemsRequest from a JSON string
core_course_get_course_content_items_request_instance = CoreCourseGetCourseContentItemsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCourseContentItemsRequest.to_json())

# convert the object into a dict
core_course_get_course_content_items_request_dict = core_course_get_course_content_items_request_instance.to_dict()
# create an instance of CoreCourseGetCourseContentItemsRequest from a dict
core_course_get_course_content_items_request_from_dict = CoreCourseGetCourseContentItemsRequest.from_dict(core_course_get_course_content_items_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



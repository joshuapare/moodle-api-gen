# CoreCourseViewCourseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | id of the course | [default to null]
**sectionnumber** | **int** | section number | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_course_view_course_request import CoreCourseViewCourseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseViewCourseRequest from a JSON string
core_course_view_course_request_instance = CoreCourseViewCourseRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseViewCourseRequest.to_json())

# convert the object into a dict
core_course_view_course_request_dict = core_course_view_course_request_instance.to_dict()
# create an instance of CoreCourseViewCourseRequest from a dict
core_course_view_course_request_from_dict = CoreCourseViewCourseRequest.from_dict(core_course_view_course_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



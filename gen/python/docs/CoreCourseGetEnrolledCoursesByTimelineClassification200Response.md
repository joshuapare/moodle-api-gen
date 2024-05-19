# CoreCourseGetEnrolledCoursesByTimelineClassification200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courses** | [**List[CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner]**](CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.md) |  | 
**nextoffset** | **int** | Offset for the next request | [default to null]

## Example

```python
from openapi_client.models.core_course_get_enrolled_courses_by_timeline_classification200_response import CoreCourseGetEnrolledCoursesByTimelineClassification200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetEnrolledCoursesByTimelineClassification200Response from a JSON string
core_course_get_enrolled_courses_by_timeline_classification200_response_instance = CoreCourseGetEnrolledCoursesByTimelineClassification200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetEnrolledCoursesByTimelineClassification200Response.to_json())

# convert the object into a dict
core_course_get_enrolled_courses_by_timeline_classification200_response_dict = core_course_get_enrolled_courses_by_timeline_classification200_response_instance.to_dict()
# create an instance of CoreCourseGetEnrolledCoursesByTimelineClassification200Response from a dict
core_course_get_enrolled_courses_by_timeline_classification200_response_from_dict = CoreCourseGetEnrolledCoursesByTimelineClassification200Response.from_dict(core_course_get_enrolled_courses_by_timeline_classification200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



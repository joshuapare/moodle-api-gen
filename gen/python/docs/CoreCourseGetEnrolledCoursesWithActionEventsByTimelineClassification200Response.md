# CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courses** | [**List[CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner]**](CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.md) |  | 
**morecoursesavailable** | **bool** | Whether more courses with events exist within the provided parameters | [default to False]
**nextoffset** | **int** | Offset for the next request | 

## Example

```python
from openapi_client.models.core_course_get_enrolled_courses_with_action_events_by_timeline_classification200_response import CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response from a JSON string
core_course_get_enrolled_courses_with_action_events_by_timeline_classification200_response_instance = CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response.to_json())

# convert the object into a dict
core_course_get_enrolled_courses_with_action_events_by_timeline_classification200_response_dict = core_course_get_enrolled_courses_with_action_events_by_timeline_classification200_response_instance.to_dict()
# create an instance of CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response from a dict
core_course_get_enrolled_courses_with_action_events_by_timeline_classification200_response_from_dict = CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response.from_dict(core_course_get_enrolled_courses_with_action_events_by_timeline_classification200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classification** | **str** | future, inprogress, or past | 
**customfieldname** | **str** | Used when classification &#x3D; customfield | [optional] 
**customfieldvalue** | **str** | Used when classification &#x3D; customfield | [optional] 
**eventsfrom** | **int** | Optional starting timestamp for action events | [optional] [default to null]
**eventsto** | **int** | Optional ending timestamp for action events | [optional] [default to null]
**limit** | **int** | Result set limit | [optional] [default to 0]
**offset** | **int** | Result set offset | [optional] [default to 0]
**searchvalue** | **str** | The value a user wishes to search against | [optional] 
**sort** | **str** | Sort string | [optional] 

## Example

```python
from openapi_client.models.core_course_get_enrolled_courses_with_action_events_by_timeline_classification_request import CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest from a JSON string
core_course_get_enrolled_courses_with_action_events_by_timeline_classification_request_instance = CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.to_json())

# convert the object into a dict
core_course_get_enrolled_courses_with_action_events_by_timeline_classification_request_dict = core_course_get_enrolled_courses_with_action_events_by_timeline_classification_request_instance.to_dict()
# create an instance of CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest from a dict
core_course_get_enrolled_courses_with_action_events_by_timeline_classification_request_from_dict = CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.from_dict(core_course_get_enrolled_courses_with_action_events_by_timeline_classification_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



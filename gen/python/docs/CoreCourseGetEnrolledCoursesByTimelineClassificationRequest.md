# CoreCourseGetEnrolledCoursesByTimelineClassificationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classification** | **str** | future, inprogress, or past | [default to 'null']
**customfieldname** | **str** | Used when classification &#x3D; customfield | [optional] [default to 'null']
**customfieldvalue** | **str** | Used when classification &#x3D; customfield | [optional] 
**limit** | **int** | Result set limit | [optional] [default to 0]
**offset** | **int** | Result set offset | [optional] [default to 0]
**searchvalue** | **str** | The value a user wishes to search against | [optional] 
**sort** | **str** | Sort string | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_course_get_enrolled_courses_by_timeline_classification_request import CoreCourseGetEnrolledCoursesByTimelineClassificationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetEnrolledCoursesByTimelineClassificationRequest from a JSON string
core_course_get_enrolled_courses_by_timeline_classification_request_instance = CoreCourseGetEnrolledCoursesByTimelineClassificationRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetEnrolledCoursesByTimelineClassificationRequest.to_json())

# convert the object into a dict
core_course_get_enrolled_courses_by_timeline_classification_request_dict = core_course_get_enrolled_courses_by_timeline_classification_request_instance.to_dict()
# create an instance of CoreCourseGetEnrolledCoursesByTimelineClassificationRequest from a dict
core_course_get_enrolled_courses_by_timeline_classification_request_from_dict = CoreCourseGetEnrolledCoursesByTimelineClassificationRequest.from_dict(core_course_get_enrolled_courses_by_timeline_classification_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



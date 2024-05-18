# CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coursecategory** | **str** | coursecategory | [optional] 
**courseimage** | **str** | courseimage | [optional] 
**enddate** | **int** | enddate | [optional] 
**fullname** | **str** | fullname | [optional] 
**fullnamedisplay** | **str** | fullnamedisplay | [optional] 
**hasprogress** | **bool** | hasprogress | [optional] 
**hidden** | **bool** | hidden | [optional] 
**id** | **int** | id | [optional] 
**idnumber** | **str** | idnumber | [optional] 
**isfavourite** | **bool** | isfavourite | [optional] 
**pdfexportfont** | **str** | pdfexportfont | [optional] 
**progress** | **int** | progress | [optional] 
**shortname** | **str** | shortname | [optional] 
**showactivitydates** | **bool** | showactivitydates | [optional] 
**showcompletionconditions** | **bool** | showcompletionconditions | [optional] 
**showshortname** | **bool** | showshortname | [optional] 
**startdate** | **int** | startdate | [optional] 
**summary** | **str** | summary | [optional] 
**summaryformat** | **int** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**timeaccess** | **int** | timeaccess | [optional] 
**viewurl** | **str** | viewurl | [optional] 
**visible** | **bool** | visible | [optional] 

## Example

```python
from openapi_client.models.core_course_get_enrolled_courses_by_timeline_classification200_response_courses_inner import CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner from a JSON string
core_course_get_enrolled_courses_by_timeline_classification200_response_courses_inner_instance = CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.to_json())

# convert the object into a dict
core_course_get_enrolled_courses_by_timeline_classification200_response_courses_inner_dict = core_course_get_enrolled_courses_by_timeline_classification200_response_courses_inner_instance.to_dict()
# create an instance of CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner from a dict
core_course_get_enrolled_courses_by_timeline_classification200_response_courses_inner_from_dict = CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.from_dict(core_course_get_enrolled_courses_by_timeline_classification200_response_courses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



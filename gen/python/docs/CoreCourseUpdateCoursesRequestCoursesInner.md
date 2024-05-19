# CoreCourseUpdateCoursesRequestCoursesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **int** | category id | [optional] 
**completionnotify** | **int** | 1: yes 0: no | [optional] 
**courseformatoptions** | [**List[CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner]**](CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner.md) |  | [optional] 
**customfields** | [**List[CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner]**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**defaultgroupingid** | **int** | default grouping id | [optional] 
**enablecompletion** | **int** | Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings. | [optional] 
**enddate** | **int** | timestamp when the course end | [optional] 
**forcetheme** | **str** | name of the force theme | [optional] 
**format** | **str** | course format: weeks, topics, social, site,.. | [optional] [default to 'null']
**fullname** | **str** | full name | [optional] 
**groupmode** | **int** | no group, separate, visible | [optional] 
**groupmodeforce** | **int** | 1: yes, 0: no | [optional] 
**hiddensections** | **int** | (deprecated, use courseformatoptions) How the hidden sections in the course are                                         displayed to students | [optional] [default to null]
**id** | **int** | ID of the course | [optional] 
**idnumber** | **str** | id number | [optional] 
**lang** | **str** | forced course language | [optional] 
**maxbytes** | **int** | largest size of file that can be uploaded into the course | [optional] [default to null]
**newsitems** | **int** | number of recent items appearing on the course page | [optional] [default to null]
**numsections** | **int** | (deprecated, use courseformatoptions) number of weeks/topics | [optional] 
**shortname** | **str** | course short name | [optional] 
**showgrades** | **int** | 1 if grades are shown, otherwise 0 | [optional] 
**showreports** | **int** | are activity report shown (yes &#x3D; 1, no &#x3D;0) | [optional] [default to null]
**startdate** | **int** | timestamp when the course start | [optional] 
**summary** | **str** | summary | [optional] 
**summaryformat** | **int** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**visible** | **int** | 1: available to student, 0:not available | [optional] 

## Example

```python
from openapi_client.models.core_course_update_courses_request_courses_inner import CoreCourseUpdateCoursesRequestCoursesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseUpdateCoursesRequestCoursesInner from a JSON string
core_course_update_courses_request_courses_inner_instance = CoreCourseUpdateCoursesRequestCoursesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseUpdateCoursesRequestCoursesInner.to_json())

# convert the object into a dict
core_course_update_courses_request_courses_inner_dict = core_course_update_courses_request_courses_inner_instance.to_dict()
# create an instance of CoreCourseUpdateCoursesRequestCoursesInner from a dict
core_course_update_courses_request_courses_inner_from_dict = CoreCourseUpdateCoursesRequestCoursesInner.from_dict(core_course_update_courses_request_courses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



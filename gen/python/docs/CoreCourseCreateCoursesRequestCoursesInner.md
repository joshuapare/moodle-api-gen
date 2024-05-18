# CoreCourseCreateCoursesRequestCoursesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **int** | category id | [optional] [default to null]
**completionnotify** | **int** | 1: yes 0: no | [optional] [default to null]
**courseformatoptions** | [**List[CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner]**](CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner.md) |  | [optional] 
**customfields** | [**List[CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner]**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**defaultgroupingid** | **int** | default grouping id | [optional] [default to 0]
**enablecompletion** | **int** | Enabled, control via completion and activity settings. Disabled,                                         not shown in activity settings. | [optional] [default to null]
**enddate** | **int** | timestamp when the course end | [optional] [default to null]
**forcetheme** | **str** | name of the force theme | [optional] [default to 'null']
**format** | **str** | course format: weeks, topics, social, site,.. | [optional] [default to 'topics']
**fullname** | **str** | full name | [optional] [default to 'null']
**groupmode** | **int** | no group, separate, visible | [optional] [default to 0]
**groupmodeforce** | **int** | 1: yes, 0: no | [optional] [default to 0]
**hiddensections** | **int** | (deprecated, use courseformatoptions) How the hidden sections in the course are displayed to students | [optional] [default to null]
**idnumber** | **str** | id number | [optional] [default to 'null']
**lang** | **str** | forced course language | [optional] [default to 'null']
**maxbytes** | **int** | largest size of file that can be uploaded into the course | [optional] [default to 0]
**newsitems** | **int** | number of recent items appearing on the course page | [optional] [default to 5]
**numsections** | **int** | (deprecated, use courseformatoptions) number of weeks/topics | [optional] [default to null]
**shortname** | **str** | course short name | [optional] [default to 'null']
**showgrades** | **int** | 1 if grades are shown, otherwise 0 | [optional] [default to 1]
**showreports** | **int** | are activity report shown (yes &#x3D; 1, no &#x3D;0) | [optional] [default to 0]
**startdate** | **int** | timestamp when the course start | [optional] [default to null]
**summary** | **str** | summary | [optional] 
**summaryformat** | **int** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**visible** | **int** | 1: available to student, 0:not available | [optional] [default to null]

## Example

```python
from openapi_client.models.core_course_create_courses_request_courses_inner import CoreCourseCreateCoursesRequestCoursesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseCreateCoursesRequestCoursesInner from a JSON string
core_course_create_courses_request_courses_inner_instance = CoreCourseCreateCoursesRequestCoursesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseCreateCoursesRequestCoursesInner.to_json())

# convert the object into a dict
core_course_create_courses_request_courses_inner_dict = core_course_create_courses_request_courses_inner_instance.to_dict()
# create an instance of CoreCourseCreateCoursesRequestCoursesInner from a dict
core_course_create_courses_request_courses_inner_from_dict = CoreCourseCreateCoursesRequestCoursesInner.from_dict(core_course_create_courses_request_courses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



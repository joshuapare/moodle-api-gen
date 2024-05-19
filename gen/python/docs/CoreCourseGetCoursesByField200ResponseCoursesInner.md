# CoreCourseGetCoursesByField200ResponseCoursesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cacherev** | **int** | Cache revision number | [optional] [default to null]
**calendartype** | **str** | Calendar type | [optional] [default to 'null']
**categoryid** | **int** | category id | [optional] 
**categoryname** | **str** | category name | [optional] [default to 'null']
**completionnotify** | **int** | 1: yes 0: no | [optional] 
**contacts** | [**List[CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner]**](CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner.md) |  | [optional] 
**courseformatoptions** | [**List[CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner]**](CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner.md) |  | [optional] 
**courseimage** | **str** | Course image | [optional] [default to 'null']
**customfields** | [**List[CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner]**](CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.md) |  | [optional] 
**defaultgroupingid** | **int** | default grouping id | [optional] [default to null]
**displayname** | **str** | course display name | [optional] [default to 'null']
**enablecompletion** | **int** | Completion enabled? 1: yes 0: no | [optional] [default to null]
**enddate** | **int** | Timestamp when the course end | [optional] [default to null]
**enrollmentmethods** | **List[object]** |  | [optional] 
**filters** | [**List[CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner]**](CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.md) |  | [optional] 
**format** | **str** | Course format: weeks, topics, social, site,.. | [optional] [default to 'null']
**fullname** | **str** | course full name | [optional] [default to 'null']
**groupmode** | **int** | no group, separate, visible | [optional] [default to null]
**groupmodeforce** | **int** | 1: yes, 0: no | [optional] [default to null]
**id** | **int** | course id | [optional] 
**idnumber** | **str** | Id number | [optional] [default to 'null']
**lang** | **str** | Forced course language | [optional] [default to 'null']
**legacyfiles** | **int** | If legacy files are enabled | [optional] [default to null]
**marker** | **int** | Current course marker | [optional] [default to null]
**maxbytes** | **int** | Largest size of file that can be uploaded into | [optional] [default to null]
**newsitems** | **int** | Number of recent items appearing on the course page | [optional] [default to null]
**overviewfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**requested** | **int** | If is a requested course | [optional] [default to null]
**shortname** | **str** | course short name | [optional] 
**showactivitydates** | **bool** | Whether the activity dates are shown or not | [optional] [default to False]
**showcompletionconditions** | **bool** | Whether the activity completion conditions are shown or not | [optional] [default to False]
**showgrades** | **int** | 1 if grades are shown, otherwise 0 | [optional] [default to null]
**showreports** | **int** | Are activity report shown (yes &#x3D; 1, no &#x3D;0) | [optional] [default to null]
**sortorder** | **int** | Sort order in the category | [optional] [default to null]
**startdate** | **int** | Timestamp when the course start | [optional] [default to null]
**summary** | **str** | summary | [optional] 
**summaryfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**summaryformat** | **int** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**theme** | **str** | Fame of the forced theme | [optional] [default to 'null']
**timecreated** | **int** | Time when the course was created | [optional] [default to null]
**timemodified** | **int** | Last time  the course was updated | [optional] [default to null]
**visible** | **int** | 1: available to student, 0:not available | [optional] 

## Example

```python
from openapi_client.models.core_course_get_courses_by_field200_response_courses_inner import CoreCourseGetCoursesByField200ResponseCoursesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCoursesByField200ResponseCoursesInner from a JSON string
core_course_get_courses_by_field200_response_courses_inner_instance = CoreCourseGetCoursesByField200ResponseCoursesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCoursesByField200ResponseCoursesInner.to_json())

# convert the object into a dict
core_course_get_courses_by_field200_response_courses_inner_dict = core_course_get_courses_by_field200_response_courses_inner_instance.to_dict()
# create an instance of CoreCourseGetCoursesByField200ResponseCoursesInner from a dict
core_course_get_courses_by_field200_response_courses_inner_from_dict = CoreCourseGetCoursesByField200ResponseCoursesInner.from_dict(core_course_get_courses_by_field200_response_courses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



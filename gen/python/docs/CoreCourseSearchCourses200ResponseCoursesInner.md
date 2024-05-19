# CoreCourseSearchCourses200ResponseCoursesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryid** | **int** | category id | [optional] 
**categoryname** | **str** | category name | [optional] 
**contacts** | [**List[CoreCourseSearchCourses200ResponseCoursesInnerContactsInner]**](CoreCourseSearchCourses200ResponseCoursesInnerContactsInner.md) |  | [optional] 
**courseimage** | **str** | Course image | [optional] 
**customfields** | [**List[CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner]**](CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.md) |  | [optional] 
**displayname** | **str** | course display name | [optional] 
**enrollmentmethods** | **List[object]** |  | [optional] 
**fullname** | **str** | course full name | [optional] 
**id** | **int** | course id | [optional] 
**overviewfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**shortname** | **str** | course short name | [optional] 
**showactivitydates** | **bool** | Whether the activity dates are shown or not | [optional] 
**showcompletionconditions** | **bool** | Whether the activity completion conditions are shown or not | [optional] 
**sortorder** | **int** | Sort order in the category | [optional] 
**summary** | **str** | summary | [optional] 
**summaryfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**summaryformat** | **int** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 

## Example

```python
from openapi_client.models.core_course_search_courses200_response_courses_inner import CoreCourseSearchCourses200ResponseCoursesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseSearchCourses200ResponseCoursesInner from a JSON string
core_course_search_courses200_response_courses_inner_instance = CoreCourseSearchCourses200ResponseCoursesInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseSearchCourses200ResponseCoursesInner.to_json())

# convert the object into a dict
core_course_search_courses200_response_courses_inner_dict = core_course_search_courses200_response_courses_inner_instance.to_dict()
# create an instance of CoreCourseSearchCourses200ResponseCoursesInner from a dict
core_course_search_courses200_response_courses_inner_from_dict = CoreCourseSearchCourses200ResponseCoursesInner.from_dict(core_course_search_courses200_response_courses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



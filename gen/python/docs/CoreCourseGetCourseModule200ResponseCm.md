# CoreCourseGetCourseModule200ResponseCm


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**added** | **int** | Time added | [optional] [default to null]
**advancedgrading** | [**List[CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner]**](CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner.md) |  | [optional] 
**availability** | **str** | Availability settings | [optional] [default to 'null']
**completion** | **int** | If completion is enabled | [default to null]
**completionexpected** | **int** | Completion time expected | [optional] [default to null]
**completiongradeitemnumber** | **int** | Completion grade item | [optional] [default to null]
**completionpassgrade** | **int** | Completion pass grade setting | [optional] [default to null]
**completionview** | **int** | Completion view setting | [optional] [default to null]
**course** | **int** | The course id | 
**downloadcontent** | **int** | The download content value | [optional] [default to null]
**grade** | **float** | Grade (max value or scale id) | [optional] [default to null]
**gradecat** | **int** | Grade category | [optional] [default to null]
**gradepass** | **str** | Grade to pass (float) | [optional] [default to 'null']
**groupingid** | **int** | Grouping id | [default to null]
**groupmode** | **int** | Group mode | [default to null]
**id** | **int** | The course module id | 
**idnumber** | **str** | Module id number | [optional] [default to 'null']
**indent** | **int** | Indentation | [optional] [default to null]
**instance** | **int** | The activity instance id | [default to null]
**modname** | **str** | The module component name (forum, assign, etc..) | [default to 'null']
**module** | **int** | The module type id | [default to null]
**name** | **str** | The activity name | [default to 'null']
**outcomes** | [**List[CoreCourseGetCourseModule200ResponseCmOutcomesInner]**](CoreCourseGetCourseModule200ResponseCmOutcomesInner.md) |  | [optional] 
**scale** | **str** | Scale items (if used) | [optional] [default to 'null']
**score** | **int** | Score | [optional] [default to null]
**section** | **int** | The module section id | [default to null]
**sectionnum** | **int** | The module section number | [default to null]
**showdescription** | **int** | If the description is showed | [optional] [default to null]
**visible** | **int** | If visible | [optional] [default to null]
**visibleold** | **int** | Visible old | [optional] [default to null]
**visibleoncoursepage** | **int** | If visible on course page | [optional] [default to null]

## Example

```python
from openapi_client.models.core_course_get_course_module200_response_cm import CoreCourseGetCourseModule200ResponseCm

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCourseModule200ResponseCm from a JSON string
core_course_get_course_module200_response_cm_instance = CoreCourseGetCourseModule200ResponseCm.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCourseModule200ResponseCm.to_json())

# convert the object into a dict
core_course_get_course_module200_response_cm_dict = core_course_get_course_module200_response_cm_instance.to_dict()
# create an instance of CoreCourseGetCourseModule200ResponseCm from a dict
core_course_get_course_module200_response_cm_from_dict = CoreCourseGetCourseModule200ResponseCm.from_dict(core_course_get_course_module200_response_cm_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



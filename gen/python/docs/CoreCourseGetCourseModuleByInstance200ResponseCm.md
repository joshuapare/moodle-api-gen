# CoreCourseGetCourseModuleByInstance200ResponseCm


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**added** | **int** | Time added | [optional] 
**advancedgrading** | [**List[CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner]**](CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner.md) |  | [optional] 
**availability** | **str** | Availability settings | [optional] 
**completion** | **int** | If completion is enabled | 
**completionexpected** | **int** | Completion time expected | [optional] 
**completiongradeitemnumber** | **int** | Completion grade item | [optional] 
**completionpassgrade** | **int** | Completion pass grade setting | [optional] 
**completionview** | **int** | Completion view setting | [optional] 
**course** | **int** | The course id | 
**downloadcontent** | **int** | The download content value | [optional] 
**grade** | **float** | Grade (max value or scale id) | [optional] 
**gradecat** | **int** | Grade category | [optional] 
**gradepass** | **str** | Grade to pass (float) | [optional] 
**groupingid** | **int** | Grouping id | 
**groupmode** | **int** | Group mode | 
**id** | **int** | The course module id | 
**idnumber** | **str** | Module id number | [optional] 
**indent** | **int** | Indentation | [optional] 
**instance** | **int** | The activity instance id | 
**modname** | **str** | The module component name (forum, assign, etc..) | 
**module** | **int** | The module type id | 
**name** | **str** | The activity name | 
**outcomes** | [**List[CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner]**](CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner.md) |  | [optional] 
**scale** | **str** | Scale items (if used) | [optional] 
**score** | **int** | Score | [optional] 
**section** | **int** | The module section id | 
**sectionnum** | **int** | The module section number | 
**showdescription** | **int** | If the description is showed | [optional] 
**visible** | **int** | If visible | [optional] 
**visibleold** | **int** | Visible old | [optional] 
**visibleoncoursepage** | **int** | If visible on course page | [optional] 

## Example

```python
from openapi_client.models.core_course_get_course_module_by_instance200_response_cm import CoreCourseGetCourseModuleByInstance200ResponseCm

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCourseModuleByInstance200ResponseCm from a JSON string
core_course_get_course_module_by_instance200_response_cm_instance = CoreCourseGetCourseModuleByInstance200ResponseCm.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCourseModuleByInstance200ResponseCm.to_json())

# convert the object into a dict
core_course_get_course_module_by_instance200_response_cm_dict = core_course_get_course_module_by_instance200_response_cm_instance.to_dict()
# create an instance of CoreCourseGetCourseModuleByInstance200ResponseCm from a dict
core_course_get_course_module_by_instance200_response_cm_from_dict = CoreCourseGetCourseModuleByInstance200ResponseCm.from_dict(core_course_get_course_module_by_instance200_response_cm_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



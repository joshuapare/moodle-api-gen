# CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the custom field | [optional] 
**shortname** | **str** | The shortname of the custom field - to be able to build the field class in the code | [optional] 
**type** | **str** | The type of the custom field - text field, checkbox... | [optional] 
**value** | **str** | The value of the custom field | [optional] 
**valueraw** | **str** | The raw value of the custom field | [optional] 

## Example

```python
from openapi_client.models.core_course_get_courses_by_field200_response_courses_inner_customfields_inner import CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner from a JSON string
core_course_get_courses_by_field200_response_courses_inner_customfields_inner_instance = CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.to_json())

# convert the object into a dict
core_course_get_courses_by_field200_response_courses_inner_customfields_inner_dict = core_course_get_courses_by_field200_response_courses_inner_customfields_inner_instance.to_dict()
# create an instance of CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner from a dict
core_course_get_courses_by_field200_response_courses_inner_customfields_inner_from_dict = CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.from_dict(core_course_get_courses_by_field200_response_courses_inner_customfields_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



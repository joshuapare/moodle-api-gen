# ModAssignGetAssignments200ResponseCoursesInner

course information object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignments** | [**List[ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner]**](ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner.md) |  | [optional] 
**fullname** | **str** | course full name | [optional] 
**id** | **int** | course id | [optional] 
**shortname** | **str** | course short name | [optional] 
**timemodified** | **int** | last time modified | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_assign_get_assignments200_response_courses_inner import ModAssignGetAssignments200ResponseCoursesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetAssignments200ResponseCoursesInner from a JSON string
mod_assign_get_assignments200_response_courses_inner_instance = ModAssignGetAssignments200ResponseCoursesInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetAssignments200ResponseCoursesInner.to_json())

# convert the object into a dict
mod_assign_get_assignments200_response_courses_inner_dict = mod_assign_get_assignments200_response_courses_inner_instance.to_dict()
# create an instance of ModAssignGetAssignments200ResponseCoursesInner from a dict
mod_assign_get_assignments200_response_courses_inner_from_dict = ModAssignGetAssignments200ResponseCoursesInner.from_dict(mod_assign_get_assignments200_response_courses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



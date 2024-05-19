# ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner

assignment configuration object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignment** | **int** | assignment id | [optional] [default to null]
**id** | **int** | assign_plugin_config id | [optional] [default to null]
**name** | **str** | name | [optional] 
**plugin** | **str** | plugin | [optional] [default to 'null']
**subtype** | **str** | subtype | [optional] [default to 'null']
**value** | **str** | value | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_assign_get_assignments200_response_courses_inner_assignments_inner_configs_inner import ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner from a JSON string
mod_assign_get_assignments200_response_courses_inner_assignments_inner_configs_inner_instance = ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner.to_json())

# convert the object into a dict
mod_assign_get_assignments200_response_courses_inner_assignments_inner_configs_inner_dict = mod_assign_get_assignments200_response_courses_inner_assignments_inner_configs_inner_instance.to_dict()
# create an instance of ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner from a dict
mod_assign_get_assignments200_response_courses_inner_assignments_inner_configs_inner_from_dict = ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner.from_dict(mod_assign_get_assignments200_response_courses_inner_assignments_inner_configs_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



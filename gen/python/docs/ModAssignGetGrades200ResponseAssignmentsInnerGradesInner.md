# ModAssignGetGrades200ResponseAssignmentsInnerGradesInner

grade information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignment** | **int** | assignment id | [optional] 
**attemptnumber** | **int** | attempt number | [optional] [default to null]
**grade** | **str** | grade | [optional] [default to 'null']
**gradefordisplay** | **str** | grade rendered into a format suitable for display | [optional] [default to 'null']
**grader** | **int** | grader, -1 if grader is hidden | [optional] [default to null]
**id** | **int** | grade id | [optional] [default to null]
**timecreated** | **int** | grade creation time | [optional] [default to null]
**timemodified** | **int** | grade last modified time | [optional] [default to null]
**userid** | **int** | student id | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_assign_get_grades200_response_assignments_inner_grades_inner import ModAssignGetGrades200ResponseAssignmentsInnerGradesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetGrades200ResponseAssignmentsInnerGradesInner from a JSON string
mod_assign_get_grades200_response_assignments_inner_grades_inner_instance = ModAssignGetGrades200ResponseAssignmentsInnerGradesInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetGrades200ResponseAssignmentsInnerGradesInner.to_json())

# convert the object into a dict
mod_assign_get_grades200_response_assignments_inner_grades_inner_dict = mod_assign_get_grades200_response_assignments_inner_grades_inner_instance.to_dict()
# create an instance of ModAssignGetGrades200ResponseAssignmentsInnerGradesInner from a dict
mod_assign_get_grades200_response_assignments_inner_grades_inner_from_dict = ModAssignGetGrades200ResponseAssignmentsInnerGradesInner.from_dict(mod_assign_get_grades200_response_assignments_inner_grades_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreGradesUpdateGradesRequestGradesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade** | **float** | Student grade | [optional] [default to null]
**str_feedback** | **str** | A string representation of the feedback from the grader | [optional] [default to 'null']
**studentid** | **int** | Student ID | [optional] [default to null]

## Example

```python
from openapi_client.models.core_grades_update_grades_request_grades_inner import CoreGradesUpdateGradesRequestGradesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradesUpdateGradesRequestGradesInner from a JSON string
core_grades_update_grades_request_grades_inner_instance = CoreGradesUpdateGradesRequestGradesInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradesUpdateGradesRequestGradesInner.to_json())

# convert the object into a dict
core_grades_update_grades_request_grades_inner_dict = core_grades_update_grades_request_grades_inner_instance.to_dict()
# create an instance of CoreGradesUpdateGradesRequestGradesInner from a dict
core_grades_update_grades_request_grades_inner_from_dict = CoreGradesUpdateGradesRequestGradesInner.from_dict(core_grades_update_grades_request_grades_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreCompetencyGradeCompetencyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | Competency ID | [default to null]
**grade** | **int** | New grade | [default to null]
**note** | **str** | A note to attach to the evidence | [optional] [default to 'null']
**userid** | **int** | User ID | 

## Example

```python
from openapi_client.models.core_competency_grade_competency_request import CoreCompetencyGradeCompetencyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyGradeCompetencyRequest from a JSON string
core_competency_grade_competency_request_instance = CoreCompetencyGradeCompetencyRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyGradeCompetencyRequest.to_json())

# convert the object into a dict
core_competency_grade_competency_request_dict = core_competency_grade_competency_request_instance.to_dict()
# create an instance of CoreCompetencyGradeCompetencyRequest from a dict
core_competency_grade_competency_request_from_dict = CoreCompetencyGradeCompetencyRequest.from_dict(core_competency_grade_competency_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



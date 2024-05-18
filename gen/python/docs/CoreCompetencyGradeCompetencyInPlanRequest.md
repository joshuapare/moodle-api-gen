# CoreCompetencyGradeCompetencyInPlanRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | Competency id | 
**grade** | **int** | New grade | 
**note** | **str** | A note to attach to the evidence | [optional] 
**planid** | **int** | Plan id | [default to null]

## Example

```python
from openapi_client.models.core_competency_grade_competency_in_plan_request import CoreCompetencyGradeCompetencyInPlanRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyGradeCompetencyInPlanRequest from a JSON string
core_competency_grade_competency_in_plan_request_instance = CoreCompetencyGradeCompetencyInPlanRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyGradeCompetencyInPlanRequest.to_json())

# convert the object into a dict
core_competency_grade_competency_in_plan_request_dict = core_competency_grade_competency_in_plan_request_instance.to_dict()
# create an instance of CoreCompetencyGradeCompetencyInPlanRequest from a dict
core_competency_grade_competency_in_plan_request_from_dict = CoreCompetencyGradeCompetencyInPlanRequest.from_dict(core_competency_grade_competency_in_plan_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



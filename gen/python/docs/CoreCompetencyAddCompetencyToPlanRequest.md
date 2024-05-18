# CoreCompetencyAddCompetencyToPlanRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | The competency id | 
**planid** | **int** | The plan id | [default to null]

## Example

```python
from openapi_client.models.core_competency_add_competency_to_plan_request import CoreCompetencyAddCompetencyToPlanRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyAddCompetencyToPlanRequest from a JSON string
core_competency_add_competency_to_plan_request_instance = CoreCompetencyAddCompetencyToPlanRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyAddCompetencyToPlanRequest.to_json())

# convert the object into a dict
core_competency_add_competency_to_plan_request_dict = core_competency_add_competency_to_plan_request_instance.to_dict()
# create an instance of CoreCompetencyAddCompetencyToPlanRequest from a dict
core_competency_add_competency_to_plan_request_from_dict = CoreCompetencyAddCompetencyToPlanRequest.from_dict(core_competency_add_competency_to_plan_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



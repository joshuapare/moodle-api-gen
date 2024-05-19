# CoreCompetencyRemoveCompetencyFromPlanRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | The competency id | 
**planid** | **int** | The plan id | 

## Example

```python
from openapi_client.models.core_competency_remove_competency_from_plan_request import CoreCompetencyRemoveCompetencyFromPlanRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyRemoveCompetencyFromPlanRequest from a JSON string
core_competency_remove_competency_from_plan_request_instance = CoreCompetencyRemoveCompetencyFromPlanRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyRemoveCompetencyFromPlanRequest.to_json())

# convert the object into a dict
core_competency_remove_competency_from_plan_request_dict = core_competency_remove_competency_from_plan_request_instance.to_dict()
# create an instance of CoreCompetencyRemoveCompetencyFromPlanRequest from a dict
core_competency_remove_competency_from_plan_request_from_dict = CoreCompetencyRemoveCompetencyFromPlanRequest.from_dict(core_competency_remove_competency_from_plan_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



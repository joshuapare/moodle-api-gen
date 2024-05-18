# CoreCompetencyReorderPlanCompetencyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyidfrom** | **int** | The competency id we are moving | 
**competencyidto** | **int** | The competency id we are moving to | 
**planid** | **int** | The plan id | 

## Example

```python
from openapi_client.models.core_competency_reorder_plan_competency_request import CoreCompetencyReorderPlanCompetencyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyReorderPlanCompetencyRequest from a JSON string
core_competency_reorder_plan_competency_request_instance = CoreCompetencyReorderPlanCompetencyRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyReorderPlanCompetencyRequest.to_json())

# convert the object into a dict
core_competency_reorder_plan_competency_request_dict = core_competency_reorder_plan_competency_request_instance.to_dict()
# create an instance of CoreCompetencyReorderPlanCompetencyRequest from a dict
core_competency_reorder_plan_competency_request_from_dict = CoreCompetencyReorderPlanCompetencyRequest.from_dict(core_competency_reorder_plan_competency_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



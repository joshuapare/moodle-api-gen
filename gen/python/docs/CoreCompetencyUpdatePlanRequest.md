# CoreCompetencyUpdatePlanRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plan** | [**CoreCompetencyUpdatePlanRequestPlan**](CoreCompetencyUpdatePlanRequestPlan.md) |  | 

## Example

```python
from openapi_client.models.core_competency_update_plan_request import CoreCompetencyUpdatePlanRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyUpdatePlanRequest from a JSON string
core_competency_update_plan_request_instance = CoreCompetencyUpdatePlanRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyUpdatePlanRequest.to_json())

# convert the object into a dict
core_competency_update_plan_request_dict = core_competency_update_plan_request_instance.to_dict()
# create an instance of CoreCompetencyUpdatePlanRequest from a dict
core_competency_update_plan_request_from_dict = CoreCompetencyUpdatePlanRequest.from_dict(core_competency_update_plan_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



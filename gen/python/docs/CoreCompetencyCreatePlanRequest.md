# CoreCompetencyCreatePlanRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plan** | [**CoreCompetencyCreatePlanRequestPlan**](CoreCompetencyCreatePlanRequestPlan.md) |  | 

## Example

```python
from openapi_client.models.core_competency_create_plan_request import CoreCompetencyCreatePlanRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreatePlanRequest from a JSON string
core_competency_create_plan_request_instance = CoreCompetencyCreatePlanRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreatePlanRequest.to_json())

# convert the object into a dict
core_competency_create_plan_request_dict = core_competency_create_plan_request_instance.to_dict()
# create an instance of CoreCompetencyCreatePlanRequest from a dict
core_competency_create_plan_request_from_dict = CoreCompetencyCreatePlanRequest.from_dict(core_competency_create_plan_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



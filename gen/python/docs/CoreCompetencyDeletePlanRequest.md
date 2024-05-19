# CoreCompetencyDeletePlanRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Data base record id for the learning plan | [default to null]

## Example

```python
from openapi_client.models.core_competency_delete_plan_request import CoreCompetencyDeletePlanRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyDeletePlanRequest from a JSON string
core_competency_delete_plan_request_instance = CoreCompetencyDeletePlanRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyDeletePlanRequest.to_json())

# convert the object into a dict
core_competency_delete_plan_request_dict = core_competency_delete_plan_request_instance.to_dict()
# create an instance of CoreCompetencyDeletePlanRequest from a dict
core_competency_delete_plan_request_from_dict = CoreCompetencyDeletePlanRequest.from_dict(core_competency_delete_plan_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



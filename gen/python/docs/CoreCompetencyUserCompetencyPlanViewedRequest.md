# CoreCompetencyUserCompetencyPlanViewedRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | The competency id | 
**planid** | **int** | The plan id | 
**userid** | **int** | The user id | 

## Example

```python
from openapi_client.models.core_competency_user_competency_plan_viewed_request import CoreCompetencyUserCompetencyPlanViewedRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyUserCompetencyPlanViewedRequest from a JSON string
core_competency_user_competency_plan_viewed_request_instance = CoreCompetencyUserCompetencyPlanViewedRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyUserCompetencyPlanViewedRequest.to_json())

# convert the object into a dict
core_competency_user_competency_plan_viewed_request_dict = core_competency_user_competency_plan_viewed_request_instance.to_dict()
# create an instance of CoreCompetencyUserCompetencyPlanViewedRequest from a dict
core_competency_user_competency_plan_viewed_request_from_dict = CoreCompetencyUserCompetencyPlanViewedRequest.from_dict(core_competency_user_competency_plan_viewed_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CoreCompetencyUpdatePlanRequestPlan


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | description | [optional] 
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**duedate** | **int** | duedate | [optional] [default to null]
**id** | **int** | id | 
**name** | **str** | name | [optional] 
**origtemplateid** | **int** | origtemplateid | [optional] 
**reviewerid** | **int** | reviewerid | [optional] 
**status** | **int** | status | [optional] [default to null]
**templateid** | **int** | templateid | [optional] 
**timecreated** | **int** | timecreated | [optional] 
**timemodified** | **int** | timemodified | [optional] 
**userid** | **int** | userid | [optional] 
**usermodified** | **int** | usermodified | [optional] 

## Example

```python
from openapi_client.models.core_competency_update_plan_request_plan import CoreCompetencyUpdatePlanRequestPlan

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyUpdatePlanRequestPlan from a JSON string
core_competency_update_plan_request_plan_instance = CoreCompetencyUpdatePlanRequestPlan.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyUpdatePlanRequestPlan.to_json())

# convert the object into a dict
core_competency_update_plan_request_plan_dict = core_competency_update_plan_request_plan_instance.to_dict()
# create an instance of CoreCompetencyUpdatePlanRequestPlan from a dict
core_competency_update_plan_request_plan_from_dict = CoreCompetencyUpdatePlanRequestPlan.from_dict(core_competency_update_plan_request_plan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



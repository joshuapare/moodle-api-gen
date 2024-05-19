# CoreCompetencyCreatePlanRequestPlan


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | description | [optional] [default to '']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**duedate** | **int** | duedate | [optional] [default to 0]
**name** | **str** | name | 
**origtemplateid** | **int** | origtemplateid | [optional] [default to null]
**reviewerid** | **int** | reviewerid | [optional] [default to null]
**status** | **int** | status | [optional] [default to 0]
**templateid** | **int** | templateid | [optional] [default to null]
**timecreated** | **int** | timecreated | [optional] [default to 0]
**timemodified** | **int** | timemodified | [optional] [default to 0]
**userid** | **int** | userid | [default to null]
**usermodified** | **int** | usermodified | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_competency_create_plan_request_plan import CoreCompetencyCreatePlanRequestPlan

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreatePlanRequestPlan from a JSON string
core_competency_create_plan_request_plan_instance = CoreCompetencyCreatePlanRequestPlan.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreatePlanRequestPlan.to_json())

# convert the object into a dict
core_competency_create_plan_request_plan_dict = core_competency_create_plan_request_plan_instance.to_dict()
# create an instance of CoreCompetencyCreatePlanRequestPlan from a dict
core_competency_create_plan_request_plan_from_dict = CoreCompetencyCreatePlanRequestPlan.from_dict(core_competency_create_plan_request_plan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



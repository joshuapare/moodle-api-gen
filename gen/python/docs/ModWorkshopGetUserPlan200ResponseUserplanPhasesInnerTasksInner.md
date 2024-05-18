# ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | Task code. | [optional] [default to 'null']
**completed** | **str** | Completion information (maybe empty, maybe a boolean or generic info. | [optional] [default to 'null']
**details** | **str** | Task details. | [optional] [default to 'null']
**link** | **str** | Link to task. | [optional] [default to 'null']
**title** | **str** | Task title. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_workshop_get_user_plan200_response_userplan_phases_inner_tasks_inner import ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner from a JSON string
mod_workshop_get_user_plan200_response_userplan_phases_inner_tasks_inner_instance = ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner.to_json())

# convert the object into a dict
mod_workshop_get_user_plan200_response_userplan_phases_inner_tasks_inner_dict = mod_workshop_get_user_plan200_response_userplan_phases_inner_tasks_inner_instance.to_dict()
# create an instance of ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner from a dict
mod_workshop_get_user_plan200_response_userplan_phases_inner_tasks_inner_from_dict = ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner.from_dict(mod_workshop_get_user_plan200_response_userplan_phases_inner_tasks_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



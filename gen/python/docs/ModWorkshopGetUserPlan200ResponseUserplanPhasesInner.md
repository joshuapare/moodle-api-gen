# ModWorkshopGetUserPlan200ResponseUserplanPhasesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**List[ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner]**](ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner.md) |  | [optional] 
**active** | **bool** | Whether is the active task. | [optional] [default to False]
**code** | **int** | Phase code. | [optional] [default to null]
**tasks** | [**List[ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner]**](ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner.md) |  | [optional] 
**title** | **str** | Phase title. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_workshop_get_user_plan200_response_userplan_phases_inner import ModWorkshopGetUserPlan200ResponseUserplanPhasesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetUserPlan200ResponseUserplanPhasesInner from a JSON string
mod_workshop_get_user_plan200_response_userplan_phases_inner_instance = ModWorkshopGetUserPlan200ResponseUserplanPhasesInner.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetUserPlan200ResponseUserplanPhasesInner.to_json())

# convert the object into a dict
mod_workshop_get_user_plan200_response_userplan_phases_inner_dict = mod_workshop_get_user_plan200_response_userplan_phases_inner_instance.to_dict()
# create an instance of ModWorkshopGetUserPlan200ResponseUserplanPhasesInner from a dict
mod_workshop_get_user_plan200_response_userplan_phases_inner_from_dict = ModWorkshopGetUserPlan200ResponseUserplanPhasesInner.from_dict(mod_workshop_get_user_plan200_response_userplan_phases_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



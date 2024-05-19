# ModWorkshopGetUserPlan200ResponseUserplan


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**examples** | [**List[ModWorkshopGetUserPlan200ResponseUserplanExamplesInner]**](ModWorkshopGetUserPlan200ResponseUserplanExamplesInner.md) |  | 
**phases** | [**List[ModWorkshopGetUserPlan200ResponseUserplanPhasesInner]**](ModWorkshopGetUserPlan200ResponseUserplanPhasesInner.md) |  | 

## Example

```python
from openapi_client.models.mod_workshop_get_user_plan200_response_userplan import ModWorkshopGetUserPlan200ResponseUserplan

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetUserPlan200ResponseUserplan from a JSON string
mod_workshop_get_user_plan200_response_userplan_instance = ModWorkshopGetUserPlan200ResponseUserplan.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetUserPlan200ResponseUserplan.to_json())

# convert the object into a dict
mod_workshop_get_user_plan200_response_userplan_dict = mod_workshop_get_user_plan200_response_userplan_instance.to_dict()
# create an instance of ModWorkshopGetUserPlan200ResponseUserplan from a dict
mod_workshop_get_user_plan200_response_userplan_from_dict = ModWorkshopGetUserPlan200ResponseUserplan.from_dict(mod_workshop_get_user_plan200_response_userplan_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



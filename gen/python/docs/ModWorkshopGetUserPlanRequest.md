# ModWorkshopGetUserPlanRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userid** | **int** | User id (empty or 0 for current user). | [optional] [default to 0]
**workshopid** | **int** | Workshop instance id. | 

## Example

```python
from openapi_client.models.mod_workshop_get_user_plan_request import ModWorkshopGetUserPlanRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetUserPlanRequest from a JSON string
mod_workshop_get_user_plan_request_instance = ModWorkshopGetUserPlanRequest.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetUserPlanRequest.to_json())

# convert the object into a dict
mod_workshop_get_user_plan_request_dict = mod_workshop_get_user_plan_request_instance.to_dict()
# create an instance of ModWorkshopGetUserPlanRequest from a dict
mod_workshop_get_user_plan_request_from_dict = ModWorkshopGetUserPlanRequest.from_dict(mod_workshop_get_user_plan_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



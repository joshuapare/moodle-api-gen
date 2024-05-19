# ModWorkshopGetUserPlan200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userplan** | [**ModWorkshopGetUserPlan200ResponseUserplan**](ModWorkshopGetUserPlan200ResponseUserplan.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_get_user_plan200_response import ModWorkshopGetUserPlan200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetUserPlan200Response from a JSON string
mod_workshop_get_user_plan200_response_instance = ModWorkshopGetUserPlan200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetUserPlan200Response.to_json())

# convert the object into a dict
mod_workshop_get_user_plan200_response_dict = mod_workshop_get_user_plan200_response_instance.to_dict()
# create an instance of ModWorkshopGetUserPlan200Response from a dict
mod_workshop_get_user_plan200_response_from_dict = ModWorkshopGetUserPlan200Response.from_dict(mod_workshop_get_user_plan200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



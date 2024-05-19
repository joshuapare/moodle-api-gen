# ModWorkshopGetWorkshopsByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 
**workshops** | [**List[ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner]**](ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner.md) |  | 

## Example

```python
from openapi_client.models.mod_workshop_get_workshops_by_courses200_response import ModWorkshopGetWorkshopsByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetWorkshopsByCourses200Response from a JSON string
mod_workshop_get_workshops_by_courses200_response_instance = ModWorkshopGetWorkshopsByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetWorkshopsByCourses200Response.to_json())

# convert the object into a dict
mod_workshop_get_workshops_by_courses200_response_dict = mod_workshop_get_workshops_by_courses200_response_instance.to_dict()
# create an instance of ModWorkshopGetWorkshopsByCourses200Response from a dict
mod_workshop_get_workshops_by_courses200_response_from_dict = ModWorkshopGetWorkshopsByCourses200Response.from_dict(mod_workshop_get_workshops_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



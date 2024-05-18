# ModWorkshopGetGradesReport200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report** | [**ModWorkshopGetGradesReport200ResponseReport**](ModWorkshopGetGradesReport200ResponseReport.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_get_grades_report200_response import ModWorkshopGetGradesReport200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetGradesReport200Response from a JSON string
mod_workshop_get_grades_report200_response_instance = ModWorkshopGetGradesReport200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetGradesReport200Response.to_json())

# convert the object into a dict
mod_workshop_get_grades_report200_response_dict = mod_workshop_get_grades_report200_response_instance.to_dict()
# create an instance of ModWorkshopGetGradesReport200Response from a dict
mod_workshop_get_grades_report200_response_from_dict = ModWorkshopGetGradesReport200Response.from_dict(mod_workshop_get_grades_report200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



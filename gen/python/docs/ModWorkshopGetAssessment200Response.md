# ModWorkshopGetAssessment200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assessment** | [**ModWorkshopGetAssessment200ResponseAssessment**](ModWorkshopGetAssessment200ResponseAssessment.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_get_assessment200_response import ModWorkshopGetAssessment200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetAssessment200Response from a JSON string
mod_workshop_get_assessment200_response_instance = ModWorkshopGetAssessment200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetAssessment200Response.to_json())

# convert the object into a dict
mod_workshop_get_assessment200_response_dict = mod_workshop_get_assessment200_response_instance.to_dict()
# create an instance of ModWorkshopGetAssessment200Response from a dict
mod_workshop_get_assessment200_response_from_dict = ModWorkshopGetAssessment200Response.from_dict(mod_workshop_get_assessment200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



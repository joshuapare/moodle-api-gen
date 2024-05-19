# ModWorkshopUpdateAssessment200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rawgrade** | **float** | Raw percentual grade (0.00000 to 100.00000) for submission. | [optional] [default to null]
**status** | **bool** | status: true if the assessment was added or updated false otherwise. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_update_assessment200_response import ModWorkshopUpdateAssessment200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopUpdateAssessment200Response from a JSON string
mod_workshop_update_assessment200_response_instance = ModWorkshopUpdateAssessment200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopUpdateAssessment200Response.to_json())

# convert the object into a dict
mod_workshop_update_assessment200_response_dict = mod_workshop_update_assessment200_response_instance.to_dict()
# create an instance of ModWorkshopUpdateAssessment200Response from a dict
mod_workshop_update_assessment200_response_from_dict = ModWorkshopUpdateAssessment200Response.from_dict(mod_workshop_update_assessment200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



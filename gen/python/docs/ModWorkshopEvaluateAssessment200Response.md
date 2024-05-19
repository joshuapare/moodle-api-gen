# ModWorkshopEvaluateAssessment200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | status: true if the assessment was evaluated, false otherwise. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_evaluate_assessment200_response import ModWorkshopEvaluateAssessment200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopEvaluateAssessment200Response from a JSON string
mod_workshop_evaluate_assessment200_response_instance = ModWorkshopEvaluateAssessment200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopEvaluateAssessment200Response.to_json())

# convert the object into a dict
mod_workshop_evaluate_assessment200_response_dict = mod_workshop_evaluate_assessment200_response_instance.to_dict()
# create an instance of ModWorkshopEvaluateAssessment200Response from a dict
mod_workshop_evaluate_assessment200_response_from_dict = ModWorkshopEvaluateAssessment200Response.from_dict(mod_workshop_evaluate_assessment200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



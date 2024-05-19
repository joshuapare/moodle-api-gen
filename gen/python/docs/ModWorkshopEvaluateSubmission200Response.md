# ModWorkshopEvaluateSubmission200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | status: true if the submission was evaluated, false otherwise. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_evaluate_submission200_response import ModWorkshopEvaluateSubmission200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopEvaluateSubmission200Response from a JSON string
mod_workshop_evaluate_submission200_response_instance = ModWorkshopEvaluateSubmission200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopEvaluateSubmission200Response.to_json())

# convert the object into a dict
mod_workshop_evaluate_submission200_response_dict = mod_workshop_evaluate_submission200_response_instance.to_dict()
# create an instance of ModWorkshopEvaluateSubmission200Response from a dict
mod_workshop_evaluate_submission200_response_from_dict = ModWorkshopEvaluateSubmission200Response.from_dict(mod_workshop_evaluate_submission200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



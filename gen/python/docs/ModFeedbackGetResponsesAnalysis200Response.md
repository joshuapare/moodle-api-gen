# ModFeedbackGetResponsesAnalysis200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anonattempts** | [**List[ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner]**](ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.md) |  | 
**attempts** | [**List[ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner]**](ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner.md) |  | 
**totalanonattempts** | **int** | Total anonymous responses count. | [default to null]
**totalattempts** | **int** | Total responses count. | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_feedback_get_responses_analysis200_response import ModFeedbackGetResponsesAnalysis200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetResponsesAnalysis200Response from a JSON string
mod_feedback_get_responses_analysis200_response_instance = ModFeedbackGetResponsesAnalysis200Response.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetResponsesAnalysis200Response.to_json())

# convert the object into a dict
mod_feedback_get_responses_analysis200_response_dict = mod_feedback_get_responses_analysis200_response_instance.to_dict()
# create an instance of ModFeedbackGetResponsesAnalysis200Response from a dict
mod_feedback_get_responses_analysis200_response_from_dict = ModFeedbackGetResponsesAnalysis200Response.from_dict(mod_feedback_get_responses_analysis200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



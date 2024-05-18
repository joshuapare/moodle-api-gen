# ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course id | [optional] 
**id** | **int** | Completed id | [optional] [default to null]
**number** | **int** | Response number | [optional] [default to null]
**responses** | [**List[ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner]**](ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_feedback_get_responses_analysis200_response_anonattempts_inner import ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner from a JSON string
mod_feedback_get_responses_analysis200_response_anonattempts_inner_instance = ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.to_json())

# convert the object into a dict
mod_feedback_get_responses_analysis200_response_anonattempts_inner_dict = mod_feedback_get_responses_analysis200_response_anonattempts_inner_instance.to_dict()
# create an instance of ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner from a dict
mod_feedback_get_responses_analysis200_response_anonattempts_inner_from_dict = ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.from_dict(mod_feedback_get_responses_analysis200_response_anonattempts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



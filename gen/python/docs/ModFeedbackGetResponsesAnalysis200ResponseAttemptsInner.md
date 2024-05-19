# ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course id | [optional] 
**fullname** | **str** | User full name | [optional] 
**id** | **int** | Completed id | [optional] 
**responses** | [**List[ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner]**](ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner.md) |  | [optional] 
**timemodified** | **int** | Time modified for the response | [optional] [default to null]
**userid** | **int** | User who responded | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_feedback_get_responses_analysis200_response_attempts_inner import ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner from a JSON string
mod_feedback_get_responses_analysis200_response_attempts_inner_instance = ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner.to_json())

# convert the object into a dict
mod_feedback_get_responses_analysis200_response_attempts_inner_dict = mod_feedback_get_responses_analysis200_response_attempts_inner_instance.to_dict()
# create an instance of ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner from a dict
mod_feedback_get_responses_analysis200_response_attempts_inner_from_dict = ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner.from_dict(mod_feedback_get_responses_analysis200_response_attempts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



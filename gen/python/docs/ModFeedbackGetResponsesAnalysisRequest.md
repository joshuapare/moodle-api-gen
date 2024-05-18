# ModFeedbackGetResponsesAnalysisRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**feedbackid** | **int** | Feedback instance id | 
**groupid** | **int** | Group id, 0 means that the function will determine the user group | [optional] [default to 0]
**page** | **int** | The page of records to return. | [optional] [default to 0]
**perpage** | **int** | The number of records to return per page | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_feedback_get_responses_analysis_request import ModFeedbackGetResponsesAnalysisRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetResponsesAnalysisRequest from a JSON string
mod_feedback_get_responses_analysis_request_instance = ModFeedbackGetResponsesAnalysisRequest.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetResponsesAnalysisRequest.to_json())

# convert the object into a dict
mod_feedback_get_responses_analysis_request_dict = mod_feedback_get_responses_analysis_request_instance.to_dict()
# create an instance of ModFeedbackGetResponsesAnalysisRequest from a dict
mod_feedback_get_responses_analysis_request_from_dict = ModFeedbackGetResponsesAnalysisRequest.from_dict(mod_feedback_get_responses_analysis_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



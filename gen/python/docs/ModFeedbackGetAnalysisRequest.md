# ModFeedbackGetAnalysisRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**feedbackid** | **int** | Feedback instance id | [default to null]
**groupid** | **int** | Group id, 0 means that the function will determine the user group | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_feedback_get_analysis_request import ModFeedbackGetAnalysisRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetAnalysisRequest from a JSON string
mod_feedback_get_analysis_request_instance = ModFeedbackGetAnalysisRequest.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetAnalysisRequest.to_json())

# convert the object into a dict
mod_feedback_get_analysis_request_dict = mod_feedback_get_analysis_request_instance.to_dict()
# create an instance of ModFeedbackGetAnalysisRequest from a dict
mod_feedback_get_analysis_request_from_dict = ModFeedbackGetAnalysisRequest.from_dict(mod_feedback_get_analysis_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



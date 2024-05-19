# ModFeedbackGetFinishedResponsesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**feedbackid** | **int** | Feedback instance id. | 

## Example

```python
from openapi_client.models.mod_feedback_get_finished_responses_request import ModFeedbackGetFinishedResponsesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetFinishedResponsesRequest from a JSON string
mod_feedback_get_finished_responses_request_instance = ModFeedbackGetFinishedResponsesRequest.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetFinishedResponsesRequest.to_json())

# convert the object into a dict
mod_feedback_get_finished_responses_request_dict = mod_feedback_get_finished_responses_request_instance.to_dict()
# create an instance of ModFeedbackGetFinishedResponsesRequest from a dict
mod_feedback_get_finished_responses_request_from_dict = ModFeedbackGetFinishedResponsesRequest.from_dict(mod_feedback_get_finished_responses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



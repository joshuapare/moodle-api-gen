# ModFeedbackViewFeedbackRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**feedbackid** | **int** | Feedback instance id | 
**moduleviewed** | **bool** | If we need to mark the module as viewed for completion | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_feedback_view_feedback_request import ModFeedbackViewFeedbackRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackViewFeedbackRequest from a JSON string
mod_feedback_view_feedback_request_instance = ModFeedbackViewFeedbackRequest.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackViewFeedbackRequest.to_json())

# convert the object into a dict
mod_feedback_view_feedback_request_dict = mod_feedback_view_feedback_request_instance.to_dict()
# create an instance of ModFeedbackViewFeedbackRequest from a dict
mod_feedback_view_feedback_request_from_dict = ModFeedbackViewFeedbackRequest.from_dict(mod_feedback_view_feedback_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



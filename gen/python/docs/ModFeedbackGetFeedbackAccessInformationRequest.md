# ModFeedbackGetFeedbackAccessInformationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**feedbackid** | **int** | Feedback instance id. | [default to null]

## Example

```python
from openapi_client.models.mod_feedback_get_feedback_access_information_request import ModFeedbackGetFeedbackAccessInformationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetFeedbackAccessInformationRequest from a JSON string
mod_feedback_get_feedback_access_information_request_instance = ModFeedbackGetFeedbackAccessInformationRequest.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetFeedbackAccessInformationRequest.to_json())

# convert the object into a dict
mod_feedback_get_feedback_access_information_request_dict = mod_feedback_get_feedback_access_information_request_instance.to_dict()
# create an instance of ModFeedbackGetFeedbackAccessInformationRequest from a dict
mod_feedback_get_feedback_access_information_request_from_dict = ModFeedbackGetFeedbackAccessInformationRequest.from_dict(mod_feedback_get_feedback_access_information_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



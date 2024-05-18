# ModFeedbackProcessPageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**feedbackid** | **int** | Feedback instance id. | 
**goprevious** | **bool** | Whether we want to jump to previous page. | [optional] [default to False]
**page** | **int** | The page being processed. | [default to null]
**responses** | [**List[ModFeedbackProcessPageRequestResponsesInner]**](ModFeedbackProcessPageRequestResponsesInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_feedback_process_page_request import ModFeedbackProcessPageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackProcessPageRequest from a JSON string
mod_feedback_process_page_request_instance = ModFeedbackProcessPageRequest.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackProcessPageRequest.to_json())

# convert the object into a dict
mod_feedback_process_page_request_dict = mod_feedback_process_page_request_instance.to_dict()
# create an instance of ModFeedbackProcessPageRequest from a dict
mod_feedback_process_page_request_from_dict = ModFeedbackProcessPageRequest.from_dict(mod_feedback_process_page_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



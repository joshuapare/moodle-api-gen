# ModFeedbackGetPageItemsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**feedbackid** | **int** | Feedback instance id | 
**page** | **int** | The page to get starting by 0 | [default to null]

## Example

```python
from openapi_client.models.mod_feedback_get_page_items_request import ModFeedbackGetPageItemsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetPageItemsRequest from a JSON string
mod_feedback_get_page_items_request_instance = ModFeedbackGetPageItemsRequest.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetPageItemsRequest.to_json())

# convert the object into a dict
mod_feedback_get_page_items_request_dict = mod_feedback_get_page_items_request_instance.to_dict()
# create an instance of ModFeedbackGetPageItemsRequest from a dict
mod_feedback_get_page_items_request_from_dict = ModFeedbackGetPageItemsRequest.from_dict(mod_feedback_get_page_items_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



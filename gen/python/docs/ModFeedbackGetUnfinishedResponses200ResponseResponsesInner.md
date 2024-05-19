# ModFeedbackGetUnfinishedResponses200ResponseResponsesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completed** | **int** | Reference to the feedback_completedtmp table. | [optional] [default to null]
**course_id** | **int** | The course id this record belongs to. | [optional] 
**id** | **int** | The record id. | [optional] 
**item** | **int** | The item id that was responded. | [optional] 
**tmp_completed** | **int** | Old field - not used anymore. | [optional] 
**value** | **str** | The response value. | [optional] 

## Example

```python
from openapi_client.models.mod_feedback_get_unfinished_responses200_response_responses_inner import ModFeedbackGetUnfinishedResponses200ResponseResponsesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetUnfinishedResponses200ResponseResponsesInner from a JSON string
mod_feedback_get_unfinished_responses200_response_responses_inner_instance = ModFeedbackGetUnfinishedResponses200ResponseResponsesInner.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetUnfinishedResponses200ResponseResponsesInner.to_json())

# convert the object into a dict
mod_feedback_get_unfinished_responses200_response_responses_inner_dict = mod_feedback_get_unfinished_responses200_response_responses_inner_instance.to_dict()
# create an instance of ModFeedbackGetUnfinishedResponses200ResponseResponsesInner from a dict
mod_feedback_get_unfinished_responses200_response_responses_inner_from_dict = ModFeedbackGetUnfinishedResponses200ResponseResponsesInner.from_dict(mod_feedback_get_unfinished_responses200_response_responses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



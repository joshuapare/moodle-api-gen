# ModFeedbackGetFinishedResponses200ResponseResponsesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completed** | **int** | Reference to the feedback_completed table. | [optional] [default to null]
**course_id** | **int** | The course id this record belongs to. | [optional] [default to null]
**id** | **int** | The record id. | [optional] 
**item** | **int** | The item id that was responded. | [optional] [default to null]
**tmp_completed** | **int** | Old field - not used anymore. | [optional] [default to null]
**value** | **str** | The response value. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_feedback_get_finished_responses200_response_responses_inner import ModFeedbackGetFinishedResponses200ResponseResponsesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetFinishedResponses200ResponseResponsesInner from a JSON string
mod_feedback_get_finished_responses200_response_responses_inner_instance = ModFeedbackGetFinishedResponses200ResponseResponsesInner.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetFinishedResponses200ResponseResponsesInner.to_json())

# convert the object into a dict
mod_feedback_get_finished_responses200_response_responses_inner_dict = mod_feedback_get_finished_responses200_response_responses_inner_instance.to_dict()
# create an instance of ModFeedbackGetFinishedResponses200ResponseResponsesInner from a dict
mod_feedback_get_finished_responses200_response_responses_inner_from_dict = ModFeedbackGetFinishedResponses200ResponseResponsesInner.from_dict(mod_feedback_get_finished_responses200_response_responses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



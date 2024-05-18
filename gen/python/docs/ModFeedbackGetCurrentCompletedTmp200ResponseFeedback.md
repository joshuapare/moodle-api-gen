# ModFeedbackGetCurrentCompletedTmp200ResponseFeedback


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anonymous_response** | **int** | Whether is an anonymous response. | [default to null]
**courseid** | **int** | The course id where the feedback was completed. | [default to null]
**feedback** | **int** | The feedback instance id this records belongs to. | [default to null]
**guestid** | **str** | For guests, this is the session key. | [default to 'null']
**id** | **int** | The record id. | 
**random_response** | **int** | The response number (used when shuffling anonymous responses). | [default to null]
**timemodified** | **int** | The last time the feedback was completed. | [default to null]
**userid** | **int** | The user who completed the feedback (0 for anonymous). | [default to null]

## Example

```python
from openapi_client.models.mod_feedback_get_current_completed_tmp200_response_feedback import ModFeedbackGetCurrentCompletedTmp200ResponseFeedback

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetCurrentCompletedTmp200ResponseFeedback from a JSON string
mod_feedback_get_current_completed_tmp200_response_feedback_instance = ModFeedbackGetCurrentCompletedTmp200ResponseFeedback.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetCurrentCompletedTmp200ResponseFeedback.to_json())

# convert the object into a dict
mod_feedback_get_current_completed_tmp200_response_feedback_dict = mod_feedback_get_current_completed_tmp200_response_feedback_instance.to_dict()
# create an instance of ModFeedbackGetCurrentCompletedTmp200ResponseFeedback from a dict
mod_feedback_get_current_completed_tmp200_response_feedback_from_dict = ModFeedbackGetCurrentCompletedTmp200ResponseFeedback.from_dict(mod_feedback_get_current_completed_tmp200_response_feedback_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



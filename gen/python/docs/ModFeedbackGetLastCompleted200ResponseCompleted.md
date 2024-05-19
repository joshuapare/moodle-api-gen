# ModFeedbackGetLastCompleted200ResponseCompleted


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anonymous_response** | **int** | Whether is an anonymous response. | 
**courseid** | **int** | The course id where the feedback was completed. | 
**feedback** | **int** | The feedback instance id this records belongs to. | 
**id** | **int** | The record id. | 
**random_response** | **int** | The response number (used when shuffling anonymous responses). | 
**timemodified** | **int** | The last time the feedback was completed. | 
**userid** | **int** | The user who completed the feedback (0 for anonymous). | 

## Example

```python
from openapi_client.models.mod_feedback_get_last_completed200_response_completed import ModFeedbackGetLastCompleted200ResponseCompleted

# TODO update the JSON string below
json = "{}"
# create an instance of ModFeedbackGetLastCompleted200ResponseCompleted from a JSON string
mod_feedback_get_last_completed200_response_completed_instance = ModFeedbackGetLastCompleted200ResponseCompleted.from_json(json)
# print the JSON string representation of the object
print(ModFeedbackGetLastCompleted200ResponseCompleted.to_json())

# convert the object into a dict
mod_feedback_get_last_completed200_response_completed_dict = mod_feedback_get_last_completed200_response_completed_instance.to_dict()
# create an instance of ModFeedbackGetLastCompleted200ResponseCompleted from a dict
mod_feedback_get_last_completed200_response_completed_from_dict = ModFeedbackGetLastCompleted200ResponseCompleted.from_dict(mod_feedback_get_last_completed200_response_completed_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



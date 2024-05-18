# ModQuizUpdateFilterConditionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmid** | **int** | The cmid of the quiz | 
**filtercondition** | **str** | Filter condition | [default to 'null']
**slotid** | **int** | The quiz slot ID for the random question. | [default to null]

## Example

```python
from openapi_client.models.mod_quiz_update_filter_condition_request import ModQuizUpdateFilterConditionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizUpdateFilterConditionRequest from a JSON string
mod_quiz_update_filter_condition_request_instance = ModQuizUpdateFilterConditionRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizUpdateFilterConditionRequest.to_json())

# convert the object into a dict
mod_quiz_update_filter_condition_request_dict = mod_quiz_update_filter_condition_request_instance.to_dict()
# create an instance of ModQuizUpdateFilterConditionRequest from a dict
mod_quiz_update_filter_condition_request_from_dict = ModQuizUpdateFilterConditionRequest.from_dict(mod_quiz_update_filter_condition_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



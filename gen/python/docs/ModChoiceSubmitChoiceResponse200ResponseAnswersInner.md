# ModChoiceSubmitChoiceResponse200ResponseAnswersInner

Answers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**choiceid** | **int** | choiceid | [optional] [default to null]
**id** | **int** | answer id | [optional] 
**optionid** | **int** | optionid | [optional] [default to null]
**timemodified** | **int** | time of last modification | [optional] 
**userid** | **int** | user id | [optional] 

## Example

```python
from openapi_client.models.mod_choice_submit_choice_response200_response_answers_inner import ModChoiceSubmitChoiceResponse200ResponseAnswersInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModChoiceSubmitChoiceResponse200ResponseAnswersInner from a JSON string
mod_choice_submit_choice_response200_response_answers_inner_instance = ModChoiceSubmitChoiceResponse200ResponseAnswersInner.from_json(json)
# print the JSON string representation of the object
print(ModChoiceSubmitChoiceResponse200ResponseAnswersInner.to_json())

# convert the object into a dict
mod_choice_submit_choice_response200_response_answers_inner_dict = mod_choice_submit_choice_response200_response_answers_inner_instance.to_dict()
# create an instance of ModChoiceSubmitChoiceResponse200ResponseAnswersInner from a dict
mod_choice_submit_choice_response200_response_answers_inner_from_dict = ModChoiceSubmitChoiceResponse200ResponseAnswersInner.from_dict(mod_choice_submit_choice_response200_response_answers_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



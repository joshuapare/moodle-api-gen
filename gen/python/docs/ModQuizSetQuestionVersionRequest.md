# ModQuizSetQuestionVersionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**newversion** | **int** |  | 
**slotid** | **int** |  | 

## Example

```python
from openapi_client.models.mod_quiz_set_question_version_request import ModQuizSetQuestionVersionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizSetQuestionVersionRequest from a JSON string
mod_quiz_set_question_version_request_instance = ModQuizSetQuestionVersionRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizSetQuestionVersionRequest.to_json())

# convert the object into a dict
mod_quiz_set_question_version_request_dict = mod_quiz_set_question_version_request_instance.to_dict()
# create an instance of ModQuizSetQuestionVersionRequest from a dict
mod_quiz_set_question_version_request_from_dict = ModQuizSetQuestionVersionRequest.from_dict(mod_quiz_set_question_version_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



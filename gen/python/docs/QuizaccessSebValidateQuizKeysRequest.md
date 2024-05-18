# QuizaccessSebValidateQuizKeysRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**browserexamkey** | **str** | SEB browser exam key | [optional] [default to 'null']
**cmid** | **int** | Course module ID | [default to null]
**configkey** | **str** | SEB config key | [optional] [default to 'null']
**url** | **str** | Page URL to check | [default to 'null']

## Example

```python
from openapi_client.models.quizaccess_seb_validate_quiz_keys_request import QuizaccessSebValidateQuizKeysRequest

# TODO update the JSON string below
json = "{}"
# create an instance of QuizaccessSebValidateQuizKeysRequest from a JSON string
quizaccess_seb_validate_quiz_keys_request_instance = QuizaccessSebValidateQuizKeysRequest.from_json(json)
# print the JSON string representation of the object
print(QuizaccessSebValidateQuizKeysRequest.to_json())

# convert the object into a dict
quizaccess_seb_validate_quiz_keys_request_dict = quizaccess_seb_validate_quiz_keys_request_instance.to_dict()
# create an instance of QuizaccessSebValidateQuizKeysRequest from a dict
quizaccess_seb_validate_quiz_keys_request_from_dict = QuizaccessSebValidateQuizKeysRequest.from_dict(quizaccess_seb_validate_quiz_keys_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



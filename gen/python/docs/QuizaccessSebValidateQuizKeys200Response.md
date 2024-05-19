# QuizaccessSebValidateQuizKeys200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**browserexamkey** | **bool** | Is a provided browser exam key valid? | [default to False]
**configkey** | **bool** | Is a provided config key valid? | [default to False]

## Example

```python
from openapi_client.models.quizaccess_seb_validate_quiz_keys200_response import QuizaccessSebValidateQuizKeys200Response

# TODO update the JSON string below
json = "{}"
# create an instance of QuizaccessSebValidateQuizKeys200Response from a JSON string
quizaccess_seb_validate_quiz_keys200_response_instance = QuizaccessSebValidateQuizKeys200Response.from_json(json)
# print the JSON string representation of the object
print(QuizaccessSebValidateQuizKeys200Response.to_json())

# convert the object into a dict
quizaccess_seb_validate_quiz_keys200_response_dict = quizaccess_seb_validate_quiz_keys200_response_instance.to_dict()
# create an instance of QuizaccessSebValidateQuizKeys200Response from a dict
quizaccess_seb_validate_quiz_keys200_response_from_dict = QuizaccessSebValidateQuizKeys200Response.from_dict(quizaccess_seb_validate_quiz_keys200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



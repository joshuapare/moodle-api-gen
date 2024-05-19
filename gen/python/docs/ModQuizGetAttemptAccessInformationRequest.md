# ModQuizGetAttemptAccessInformationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptid** | **int** | attempt id, 0 for the user last attempt if exists | [optional] [default to 0]
**quizid** | **int** | quiz instance id | [default to null]

## Example

```python
from openapi_client.models.mod_quiz_get_attempt_access_information_request import ModQuizGetAttemptAccessInformationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetAttemptAccessInformationRequest from a JSON string
mod_quiz_get_attempt_access_information_request_instance = ModQuizGetAttemptAccessInformationRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetAttemptAccessInformationRequest.to_json())

# convert the object into a dict
mod_quiz_get_attempt_access_information_request_dict = mod_quiz_get_attempt_access_information_request_instance.to_dict()
# create an instance of ModQuizGetAttemptAccessInformationRequest from a dict
mod_quiz_get_attempt_access_information_request_from_dict = ModQuizGetAttemptAccessInformationRequest.from_dict(mod_quiz_get_attempt_access_information_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



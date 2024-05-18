# ModQuizGetUserAttemptsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includepreviews** | **bool** | whether to include previews or not | [optional] [default to False]
**quizid** | **int** | quiz instance id | 
**status** | **str** | quiz status: all, finished or unfinished | [optional] [default to 'finished']
**userid** | **int** | user id, empty for current user | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_quiz_get_user_attempts_request import ModQuizGetUserAttemptsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetUserAttemptsRequest from a JSON string
mod_quiz_get_user_attempts_request_instance = ModQuizGetUserAttemptsRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetUserAttemptsRequest.to_json())

# convert the object into a dict
mod_quiz_get_user_attempts_request_dict = mod_quiz_get_user_attempts_request_instance.to_dict()
# create an instance of ModQuizGetUserAttemptsRequest from a dict
mod_quiz_get_user_attempts_request_from_dict = ModQuizGetUserAttemptsRequest.from_dict(mod_quiz_get_user_attempts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



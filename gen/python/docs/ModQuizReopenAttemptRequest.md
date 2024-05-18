# ModQuizReopenAttemptRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptid** | **int** | The id of the attempt to reopen | 

## Example

```python
from openapi_client.models.mod_quiz_reopen_attempt_request import ModQuizReopenAttemptRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizReopenAttemptRequest from a JSON string
mod_quiz_reopen_attempt_request_instance = ModQuizReopenAttemptRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizReopenAttemptRequest.to_json())

# convert the object into a dict
mod_quiz_reopen_attempt_request_dict = mod_quiz_reopen_attempt_request_instance.to_dict()
# create an instance of ModQuizReopenAttemptRequest from a dict
mod_quiz_reopen_attempt_request_from_dict = ModQuizReopenAttemptRequest.from_dict(mod_quiz_reopen_attempt_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



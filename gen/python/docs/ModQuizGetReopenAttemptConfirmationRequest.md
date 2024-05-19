# ModQuizGetReopenAttemptConfirmationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptid** | **int** | The id of the attempt to reopen | [default to null]

## Example

```python
from openapi_client.models.mod_quiz_get_reopen_attempt_confirmation_request import ModQuizGetReopenAttemptConfirmationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetReopenAttemptConfirmationRequest from a JSON string
mod_quiz_get_reopen_attempt_confirmation_request_instance = ModQuizGetReopenAttemptConfirmationRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetReopenAttemptConfirmationRequest.to_json())

# convert the object into a dict
mod_quiz_get_reopen_attempt_confirmation_request_dict = mod_quiz_get_reopen_attempt_confirmation_request_instance.to_dict()
# create an instance of ModQuizGetReopenAttemptConfirmationRequest from a dict
mod_quiz_get_reopen_attempt_confirmation_request_from_dict = ModQuizGetReopenAttemptConfirmationRequest.from_dict(mod_quiz_get_reopen_attempt_confirmation_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



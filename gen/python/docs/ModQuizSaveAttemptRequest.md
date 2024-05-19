# ModQuizSaveAttemptRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptid** | **int** | attempt id | 
**data** | [**List[ModQuizGetAttemptDataRequestPreflightdataInner]**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | 
**preflightdata** | [**List[ModQuizGetAttemptDataRequestPreflightdataInner]**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_save_attempt_request import ModQuizSaveAttemptRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizSaveAttemptRequest from a JSON string
mod_quiz_save_attempt_request_instance = ModQuizSaveAttemptRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizSaveAttemptRequest.to_json())

# convert the object into a dict
mod_quiz_save_attempt_request_dict = mod_quiz_save_attempt_request_instance.to_dict()
# create an instance of ModQuizSaveAttemptRequest from a dict
mod_quiz_save_attempt_request_from_dict = ModQuizSaveAttemptRequest.from_dict(mod_quiz_save_attempt_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



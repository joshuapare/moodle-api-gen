# ModQuizProcessAttemptRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptid** | **int** | attempt id | 
**data** | [**List[ModQuizGetAttemptDataRequestPreflightdataInner]**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | [optional] 
**finishattempt** | **bool** | whether to finish or not the attempt | [optional] [default to False]
**preflightdata** | [**List[ModQuizGetAttemptDataRequestPreflightdataInner]**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | [optional] 
**timeup** | **bool** | whether the WS was called by a timer when the time is up | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_quiz_process_attempt_request import ModQuizProcessAttemptRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizProcessAttemptRequest from a JSON string
mod_quiz_process_attempt_request_instance = ModQuizProcessAttemptRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizProcessAttemptRequest.to_json())

# convert the object into a dict
mod_quiz_process_attempt_request_dict = mod_quiz_process_attempt_request_instance.to_dict()
# create an instance of ModQuizProcessAttemptRequest from a dict
mod_quiz_process_attempt_request_from_dict = ModQuizProcessAttemptRequest.from_dict(mod_quiz_process_attempt_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



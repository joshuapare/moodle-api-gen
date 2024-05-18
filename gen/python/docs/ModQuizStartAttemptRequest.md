# ModQuizStartAttemptRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**forcenew** | **bool** | Whether to force a new attempt or not. | [optional] [default to False]
**preflightdata** | [**List[ModQuizGetAttemptDataRequestPreflightdataInner]**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | [optional] 
**quizid** | **int** | quiz instance id | 

## Example

```python
from openapi_client.models.mod_quiz_start_attempt_request import ModQuizStartAttemptRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizStartAttemptRequest from a JSON string
mod_quiz_start_attempt_request_instance = ModQuizStartAttemptRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizStartAttemptRequest.to_json())

# convert the object into a dict
mod_quiz_start_attempt_request_dict = mod_quiz_start_attempt_request_instance.to_dict()
# create an instance of ModQuizStartAttemptRequest from a dict
mod_quiz_start_attempt_request_from_dict = ModQuizStartAttemptRequest.from_dict(mod_quiz_start_attempt_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



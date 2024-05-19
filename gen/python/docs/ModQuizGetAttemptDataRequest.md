# ModQuizGetAttemptDataRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptid** | **int** | attempt id | [default to null]
**page** | **int** | page number | [default to null]
**preflightdata** | [**List[ModQuizGetAttemptDataRequestPreflightdataInner]**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_get_attempt_data_request import ModQuizGetAttemptDataRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetAttemptDataRequest from a JSON string
mod_quiz_get_attempt_data_request_instance = ModQuizGetAttemptDataRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetAttemptDataRequest.to_json())

# convert the object into a dict
mod_quiz_get_attempt_data_request_dict = mod_quiz_get_attempt_data_request_instance.to_dict()
# create an instance of ModQuizGetAttemptDataRequest from a dict
mod_quiz_get_attempt_data_request_from_dict = ModQuizGetAttemptDataRequest.from_dict(mod_quiz_get_attempt_data_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



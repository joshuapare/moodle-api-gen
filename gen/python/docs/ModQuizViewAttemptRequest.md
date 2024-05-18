# ModQuizViewAttemptRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptid** | **int** | attempt id | 
**page** | **int** | page number | 
**preflightdata** | [**List[ModQuizGetAttemptDataRequestPreflightdataInner]**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_view_attempt_request import ModQuizViewAttemptRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizViewAttemptRequest from a JSON string
mod_quiz_view_attempt_request_instance = ModQuizViewAttemptRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizViewAttemptRequest.to_json())

# convert the object into a dict
mod_quiz_view_attempt_request_dict = mod_quiz_view_attempt_request_instance.to_dict()
# create an instance of ModQuizViewAttemptRequest from a dict
mod_quiz_view_attempt_request_from_dict = ModQuizViewAttemptRequest.from_dict(mod_quiz_view_attempt_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



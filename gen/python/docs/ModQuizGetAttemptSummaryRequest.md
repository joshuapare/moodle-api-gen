# ModQuizGetAttemptSummaryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptid** | **int** | attempt id | 
**preflightdata** | [**List[ModQuizGetAttemptDataRequestPreflightdataInner]**](ModQuizGetAttemptDataRequestPreflightdataInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_get_attempt_summary_request import ModQuizGetAttemptSummaryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetAttemptSummaryRequest from a JSON string
mod_quiz_get_attempt_summary_request_instance = ModQuizGetAttemptSummaryRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetAttemptSummaryRequest.to_json())

# convert the object into a dict
mod_quiz_get_attempt_summary_request_dict = mod_quiz_get_attempt_summary_request_instance.to_dict()
# create an instance of ModQuizGetAttemptSummaryRequest from a dict
mod_quiz_get_attempt_summary_request_from_dict = ModQuizGetAttemptSummaryRequest.from_dict(mod_quiz_get_attempt_summary_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



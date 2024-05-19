# ModQuizGetAttemptReviewRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptid** | **int** | attempt id | 
**page** | **int** | page number, empty for all the questions in all the pages | [optional] [default to -1]

## Example

```python
from openapi_client.models.mod_quiz_get_attempt_review_request import ModQuizGetAttemptReviewRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetAttemptReviewRequest from a JSON string
mod_quiz_get_attempt_review_request_instance = ModQuizGetAttemptReviewRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetAttemptReviewRequest.to_json())

# convert the object into a dict
mod_quiz_get_attempt_review_request_dict = mod_quiz_get_attempt_review_request_instance.to_dict()
# create an instance of ModQuizGetAttemptReviewRequest from a dict
mod_quiz_get_attempt_review_request_from_dict = ModQuizGetAttemptReviewRequest.from_dict(mod_quiz_get_attempt_review_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



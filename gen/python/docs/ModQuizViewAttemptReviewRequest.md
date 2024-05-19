# ModQuizViewAttemptReviewRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptid** | **int** | attempt id | 

## Example

```python
from openapi_client.models.mod_quiz_view_attempt_review_request import ModQuizViewAttemptReviewRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizViewAttemptReviewRequest from a JSON string
mod_quiz_view_attempt_review_request_instance = ModQuizViewAttemptReviewRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizViewAttemptReviewRequest.to_json())

# convert the object into a dict
mod_quiz_view_attempt_review_request_dict = mod_quiz_view_attempt_review_request_instance.to_dict()
# create an instance of ModQuizViewAttemptReviewRequest from a dict
mod_quiz_view_attempt_review_request_from_dict = ModQuizViewAttemptReviewRequest.from_dict(mod_quiz_view_attempt_review_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



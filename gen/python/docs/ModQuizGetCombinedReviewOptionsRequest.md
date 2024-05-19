# ModQuizGetCombinedReviewOptionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quizid** | **int** | quiz instance id | 
**userid** | **int** | user id (empty for current user) | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_quiz_get_combined_review_options_request import ModQuizGetCombinedReviewOptionsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetCombinedReviewOptionsRequest from a JSON string
mod_quiz_get_combined_review_options_request_instance = ModQuizGetCombinedReviewOptionsRequest.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetCombinedReviewOptionsRequest.to_json())

# convert the object into a dict
mod_quiz_get_combined_review_options_request_dict = mod_quiz_get_combined_review_options_request_instance.to_dict()
# create an instance of ModQuizGetCombinedReviewOptionsRequest from a dict
mod_quiz_get_combined_review_options_request_from_dict = ModQuizGetCombinedReviewOptionsRequest.from_dict(mod_quiz_get_combined_review_options_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



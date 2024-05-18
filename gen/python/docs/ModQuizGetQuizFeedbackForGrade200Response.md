# ModQuizGetQuizFeedbackForGrade200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedbackinlinefiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**feedbacktext** | **str** | the comment that corresponds to this grade (empty for none) | [default to 'null']
**feedbacktextformat** | **int** | feedbacktext format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_quiz_get_quiz_feedback_for_grade200_response import ModQuizGetQuizFeedbackForGrade200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModQuizGetQuizFeedbackForGrade200Response from a JSON string
mod_quiz_get_quiz_feedback_for_grade200_response_instance = ModQuizGetQuizFeedbackForGrade200Response.from_json(json)
# print the JSON string representation of the object
print(ModQuizGetQuizFeedbackForGrade200Response.to_json())

# convert the object into a dict
mod_quiz_get_quiz_feedback_for_grade200_response_dict = mod_quiz_get_quiz_feedback_for_grade200_response_instance.to_dict()
# create an instance of ModQuizGetQuizFeedbackForGrade200Response from a dict
mod_quiz_get_quiz_feedback_for_grade200_response_from_dict = ModQuizGetQuizFeedbackForGrade200Response.from_dict(mod_quiz_get_quiz_feedback_for_grade200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



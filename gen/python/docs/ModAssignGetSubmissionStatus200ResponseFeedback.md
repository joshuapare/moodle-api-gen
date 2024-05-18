# ModAssignGetSubmissionStatus200ResponseFeedback


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade** | [**ModAssignGetSubmissionStatus200ResponseFeedbackGrade**](ModAssignGetSubmissionStatus200ResponseFeedbackGrade.md) |  | [optional] 
**gradeddate** | **int** | The date the user was graded. | [default to null]
**gradefordisplay** | **str** | Grade rendered into a format suitable for display. | [default to 'null']
**plugins** | [**List[ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner]**](ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_assign_get_submission_status200_response_feedback import ModAssignGetSubmissionStatus200ResponseFeedback

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissionStatus200ResponseFeedback from a JSON string
mod_assign_get_submission_status200_response_feedback_instance = ModAssignGetSubmissionStatus200ResponseFeedback.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissionStatus200ResponseFeedback.to_json())

# convert the object into a dict
mod_assign_get_submission_status200_response_feedback_dict = mod_assign_get_submission_status200_response_feedback_instance.to_dict()
# create an instance of ModAssignGetSubmissionStatus200ResponseFeedback from a dict
mod_assign_get_submission_status200_response_feedback_from_dict = ModAssignGetSubmissionStatus200ResponseFeedback.from_dict(mod_assign_get_submission_status200_response_feedback_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



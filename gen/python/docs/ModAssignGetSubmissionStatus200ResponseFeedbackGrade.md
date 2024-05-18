# ModAssignGetSubmissionStatus200ResponseFeedbackGrade


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignment** | **int** | assignment id | [optional] 
**attemptnumber** | **int** | attempt number | 
**grade** | **str** | grade | 
**gradefordisplay** | **str** | grade rendered into a format suitable for display | [optional] 
**grader** | **int** | grader, -1 if grader is hidden | 
**id** | **int** | grade id | 
**timecreated** | **int** | grade creation time | 
**timemodified** | **int** | grade last modified time | 
**userid** | **int** | student id | 

## Example

```python
from openapi_client.models.mod_assign_get_submission_status200_response_feedback_grade import ModAssignGetSubmissionStatus200ResponseFeedbackGrade

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignGetSubmissionStatus200ResponseFeedbackGrade from a JSON string
mod_assign_get_submission_status200_response_feedback_grade_instance = ModAssignGetSubmissionStatus200ResponseFeedbackGrade.from_json(json)
# print the JSON string representation of the object
print(ModAssignGetSubmissionStatus200ResponseFeedbackGrade.to_json())

# convert the object into a dict
mod_assign_get_submission_status200_response_feedback_grade_dict = mod_assign_get_submission_status200_response_feedback_grade_instance.to_dict()
# create an instance of ModAssignGetSubmissionStatus200ResponseFeedbackGrade from a dict
mod_assign_get_submission_status200_response_feedback_grade_from_dict = ModAssignGetSubmissionStatus200ResponseFeedbackGrade.from_dict(mod_assign_get_submission_status200_response_feedback_grade_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



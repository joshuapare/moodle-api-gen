# GradingformGuideGraderGradingpanelStore200ResponseGrade


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | [**List[GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner]**](GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner.md) |  | 
**criterion** | [**List[GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner]**](GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.md) |  | 
**gradedby** | **str** | The assumed grader of this grading instance | 
**hascomments** | **bool** | Whether there are any frequently-used comments | 
**instanceid** | **int** | The id of the current grading instance | 
**maxgrade** | **str** | Max possible grade | 
**timecreated** | **int** | The time that the grade was created | 
**timemodified** | **int** | The time that the grade was last updated | 
**usergrade** | **str** | Current user grade | 

## Example

```python
from openapi_client.models.gradingform_guide_grader_gradingpanel_store200_response_grade import GradingformGuideGraderGradingpanelStore200ResponseGrade

# TODO update the JSON string below
json = "{}"
# create an instance of GradingformGuideGraderGradingpanelStore200ResponseGrade from a JSON string
gradingform_guide_grader_gradingpanel_store200_response_grade_instance = GradingformGuideGraderGradingpanelStore200ResponseGrade.from_json(json)
# print the JSON string representation of the object
print(GradingformGuideGraderGradingpanelStore200ResponseGrade.to_json())

# convert the object into a dict
gradingform_guide_grader_gradingpanel_store200_response_grade_dict = gradingform_guide_grader_gradingpanel_store200_response_grade_instance.to_dict()
# create an instance of GradingformGuideGraderGradingpanelStore200ResponseGrade from a dict
gradingform_guide_grader_gradingpanel_store200_response_grade_from_dict = GradingformGuideGraderGradingpanelStore200ResponseGrade.from_dict(gradingform_guide_grader_gradingpanel_store200_response_grade_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



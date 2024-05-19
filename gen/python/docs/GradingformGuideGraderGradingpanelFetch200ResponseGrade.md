# GradingformGuideGraderGradingpanelFetch200ResponseGrade


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | [**List[GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner]**](GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner.md) |  | 
**criterion** | [**List[GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner]**](GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner.md) |  | 
**gradedby** | **str** | The assumed grader of this grading instance | 
**hascomments** | **bool** | Whether there are any frequently-used comments | [default to False]
**instanceid** | **int** | The id of the current grading instance | [default to null]
**maxgrade** | **str** | Max possible grade | 
**timecreated** | **int** | The time that the grade was created | 
**timemodified** | **int** | The time that the grade was last updated | 
**usergrade** | **str** | Current user grade | 

## Example

```python
from openapi_client.models.gradingform_guide_grader_gradingpanel_fetch200_response_grade import GradingformGuideGraderGradingpanelFetch200ResponseGrade

# TODO update the JSON string below
json = "{}"
# create an instance of GradingformGuideGraderGradingpanelFetch200ResponseGrade from a JSON string
gradingform_guide_grader_gradingpanel_fetch200_response_grade_instance = GradingformGuideGraderGradingpanelFetch200ResponseGrade.from_json(json)
# print the JSON string representation of the object
print(GradingformGuideGraderGradingpanelFetch200ResponseGrade.to_json())

# convert the object into a dict
gradingform_guide_grader_gradingpanel_fetch200_response_grade_dict = gradingform_guide_grader_gradingpanel_fetch200_response_grade_instance.to_dict()
# create an instance of GradingformGuideGraderGradingpanelFetch200ResponseGrade from a dict
gradingform_guide_grader_gradingpanel_fetch200_response_grade_from_dict = GradingformGuideGraderGradingpanelFetch200ResponseGrade.from_dict(gradingform_guide_grader_gradingpanel_fetch200_response_grade_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


